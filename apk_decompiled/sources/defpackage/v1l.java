package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class v1l implements ServiceConnection {
    public int E = 0;
    public final Messenger F;
    public dke G;
    public final ArrayDeque H;
    public final SparseArray I;
    public final /* synthetic */ o5l J;

    public v1l(o5l o5lVar) {
        this.J = o5lVar;
        xnj xnjVar = new xnj(Looper.getMainLooper(), new Handler.Callback() { // from class: zyk
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.arg1;
                Log.isLoggable("MessengerIpcClient", 3);
                v1l v1lVar = this.E;
                synchronized (v1lVar) {
                    try {
                        t3l t3lVar = (t3l) v1lVar.I.get(i);
                        if (t3lVar == null) {
                            Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                            return true;
                        }
                        v1lVar.I.remove(i);
                        v1lVar.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            t3lVar.b(new zzt("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (t3lVar.e) {
                            case 0:
                                if (!data.getBoolean("ack", false)) {
                                    t3lVar.b(new zzt("Invalid response to one way request", null));
                                    return true;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    t3lVar.toString();
                                }
                                t3lVar.b.b(null);
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    t3lVar.toString();
                                    String.valueOf(bundle);
                                }
                                t3lVar.b.b(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.F = new Messenger(xnjVar);
        this.H = new ArrayDeque();
        this.I = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.E;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.E = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.E = 4;
            n78.K().W((Context) this.J.G, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                ((t3l) it.next()).b(zztVar);
            }
            this.H.clear();
            int i2 = 0;
            while (true) {
                int size = this.I.size();
                SparseArray sparseArray = this.I;
                if (i2 >= size) {
                    sparseArray.clear();
                    return;
                } else {
                    ((t3l) sparseArray.valueAt(i2)).b(zztVar);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            if (this.E == 2 && this.H.isEmpty() && this.I.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.E = 3;
                n78.K().W((Context) this.J.G, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized boolean d(t3l t3lVar) {
        int i = this.E;
        Object[] objArr = 0;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                this.H.add(t3lVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.H.add(t3lVar);
            ((ScheduledExecutorService) this.J.H).execute(new frk(this, objArr == true ? 1 : 0));
            return true;
        }
        this.H.add(t3lVar);
        dgj.y(this.E == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.E = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (n78.K().f((Context) this.J.G, intent, this, 1)) {
                ((ScheduledExecutorService) this.J.H).schedule(new frk(this, i2), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.J.H).execute(new t08(this, 14, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = 2;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.J.H).execute(new frk(this, i));
    }
}
