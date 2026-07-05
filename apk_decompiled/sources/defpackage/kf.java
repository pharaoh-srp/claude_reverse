package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class kf {
    public fs1 a;
    public fbk b;
    public boolean c;
    public final Object d = new Object();
    public ouj e;
    public final Context f;
    public final long g;

    public kf(Context context) {
        dgj.v(context);
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext != null ? applicationContext : context;
        this.c = false;
        this.g = -1L;
    }

    public static jf a(Context context) {
        kf kfVar = new kf(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            kfVar.c();
            jf jfVarE = kfVar.e();
            d(jfVarE, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return jfVarE;
        } finally {
        }
    }

    public static void d(jf jfVar, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (jfVar != null) {
                map.put("limit_ad_tracking", true != jfVar.b ? TaskSessionEvent.REPLAY_FROM_START : "1");
                String str = jfVar.c;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new y6g(map).start();
        }
    }

    public final void b() {
        dgj.u("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f == null || this.a == null) {
                    return;
                }
                try {
                    if (this.c) {
                        n78.K().W(this.f, this.a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.c = false;
                this.b = null;
                this.a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        dgj.u("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.c) {
                    b();
                }
                Context context = this.f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iC = g88.b.c(context, 12451000);
                    if (iC != 0 && iC != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    fs1 fs1Var = new fs1();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!n78.K().f(context, intent, fs1Var, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.a = fs1Var;
                        try {
                            IBinder iBinderA = fs1Var.a();
                            int i = i7k.i;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.b = iInterfaceQueryLocalInterface instanceof fbk ? (fbk) iInterfaceQueryLocalInterface : new o3k(iBinderA);
                            this.c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final jf e() {
        jf jfVar;
        dgj.u("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.c) {
                    synchronized (this.d) {
                        ouj oujVar = this.e;
                        if (oujVar == null || !oujVar.H) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                    }
                }
                dgj.v(this.a);
                dgj.v(this.b);
                try {
                    o3k o3kVar = (o3k) this.b;
                    o3kVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z = true;
                    Parcel parcelB = o3kVar.b(parcelObtain, 1);
                    String string = parcelB.readString();
                    parcelB.recycle();
                    o3k o3kVar2 = (o3k) this.b;
                    o3kVar2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i = vyj.a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelB2 = o3kVar2.b(parcelObtain2, 2);
                    if (parcelB2.readInt() == 0) {
                        z = false;
                    }
                    parcelB2.recycle();
                    jfVar = new jf(string, z);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.d) {
            ouj oujVar2 = this.e;
            if (oujVar2 != null) {
                oujVar2.G.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new ouj(this, j);
            }
        }
        return jfVar;
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
