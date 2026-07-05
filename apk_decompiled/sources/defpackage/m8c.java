package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class m8c implements Handler.Callback, ServiceConnection {
    public final Context E;
    public final Handler F;
    public final HashMap G = new HashMap();
    public HashSet H = new HashSet();

    public m8c(Context context) {
        this.E = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.F = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(l8c l8cVar) {
        boolean z;
        ArrayDeque arrayDeque = l8cVar.d;
        ComponentName componentName = l8cVar.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (l8cVar.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.E;
            boolean zBindService = context.bindService(component, this, 33);
            l8cVar.b = zBindService;
            if (zBindService) {
                l8cVar.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = l8cVar.b;
        }
        if (!z || l8cVar.c == null) {
            b(l8cVar);
            return;
        }
        while (true) {
            j8c j8cVar = (j8c) arrayDeque.peek();
            if (j8cVar == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    j8cVar.toString();
                }
                j8cVar.a(l8cVar.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(l8cVar);
    }

    public final void b(l8c l8cVar) {
        ComponentName componentName = l8cVar.a;
        ArrayDeque arrayDeque = l8cVar.d;
        Handler handler = this.F;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = l8cVar.e + 1;
        l8cVar.e = i;
        if (i <= 6) {
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r3) * 1000);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + l8cVar.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        ku8 ku8Var = null;
        if (i == 0) {
            j8c j8cVar = (j8c) message.obj;
            String string = Settings.Secure.getString(this.E.getContentResolver(), "enabled_notification_listeners");
            synchronized (n8c.c) {
                if (string != null) {
                    try {
                        if (!string.equals(n8c.d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            n8c.e = hashSet2;
                            n8c.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = n8c.e;
            }
            if (!hashSet.equals(this.H)) {
                this.H = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.E.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.G.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.G.put(componentName2, new l8c(componentName2));
                    }
                }
                Iterator it = this.G.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        l8c l8cVar = (l8c) entry.getValue();
                        if (l8cVar.b) {
                            this.E.unbindService(this);
                            l8cVar.b = false;
                        }
                        l8cVar.c = null;
                        it.remove();
                    }
                }
            }
            for (l8c l8cVar2 : this.G.values()) {
                l8cVar2.d.add(j8cVar);
                a(l8cVar2);
            }
        } else if (i == 1) {
            k8c k8cVar = (k8c) message.obj;
            ComponentName componentName3 = k8cVar.a;
            IBinder iBinder = k8cVar.b;
            l8c l8cVar3 = (l8c) this.G.get(componentName3);
            if (l8cVar3 != null) {
                int i2 = ju8.i;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ku8.h);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ku8)) {
                        iu8 iu8Var = new iu8();
                        iu8Var.i = iBinder;
                        ku8Var = iu8Var;
                    } else {
                        ku8Var = (ku8) iInterfaceQueryLocalInterface;
                    }
                }
                l8cVar3.c = ku8Var;
                l8cVar3.e = 0;
                a(l8cVar3);
                return true;
            }
        } else if (i == 2) {
            l8c l8cVar4 = (l8c) this.G.get((ComponentName) message.obj);
            if (l8cVar4 != null) {
                if (l8cVar4.b) {
                    this.E.unbindService(this);
                    l8cVar4.b = false;
                }
                l8cVar4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            l8c l8cVar5 = (l8c) this.G.get((ComponentName) message.obj);
            if (l8cVar5 != null) {
                a(l8cVar5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.F.obtainMessage(1, new k8c(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.F.obtainMessage(2, componentName).sendToTarget();
    }
}
