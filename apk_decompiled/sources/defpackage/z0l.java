package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z0l {
    public static final k3k a;
    public static final k3k b;
    public static volatile zpj c;
    public static final Object d;
    public static Context e;

    static {
        new k3k(zqk.H("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new k3k(zqk.H("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new k3k(zqk.H("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new k3k(zqk.H("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        a = new k3k(zqk.H("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        b = new k3k(zqk.H("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        d = new Object();
    }

    public static void a() {
        zpj npjVar;
        if (c != null) {
            return;
        }
        dgj.v(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder iBinderB = si6.c(e, si6.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = tpj.j;
                    if (iBinderB == null) {
                        npjVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        npjVar = iInterfaceQueryLocalInterface instanceof zpj ? (zpj) iInterfaceQueryLocalInterface : new npj(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 6);
                    }
                    c = npjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static z5l b(String str, juk jukVar, boolean z, boolean z2) {
        try {
            a();
            dgj.v(e);
            try {
                zpj zpjVar = c;
                cbc cbcVar = new cbc(e.getPackageManager());
                npj npjVar = (npj) zpjVar;
                Parcel parcelH = npjVar.H();
                int i = xyj.a;
                boolean z3 = true;
                parcelH.writeInt(1);
                int iK0 = xn5.K0(parcelH, 20293);
                xn5.F0(parcelH, 1, str);
                xn5.B0(parcelH, 2, jukVar);
                xn5.J0(parcelH, 3, 4);
                parcelH.writeInt(z ? 1 : 0);
                xn5.J0(parcelH, 4, 4);
                parcelH.writeInt(z2 ? 1 : 0);
                xn5.L0(parcelH, iK0);
                xyj.b(parcelH, cbcVar);
                Parcel parcelE = npjVar.E(parcelH, 5);
                if (parcelE.readInt() == 0) {
                    z3 = false;
                }
                parcelE.recycle();
                return z3 ? z5l.H : new v5l(new gxk(z, str, jukVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return z5l.k("module call", e2);
            }
        } catch (DynamiteModule$LoadingException e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return z5l.k("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
