package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class fe1 {
    public static final jf7[] b0 = new jf7[0];
    public m11 F;
    public final Context G;
    public final o2l H;
    public final g88 I;
    public final luj J;
    public ipj M;
    public ee1 N;
    public IInterface O;
    public h7k Q;
    public final ce1 S;
    public final de1 T;
    public final int U;
    public final String V;
    public volatile String W;
    public volatile String E = null;
    public final Object K = new Object();
    public final Object L = new Object();
    public final ArrayList P = new ArrayList();
    public int R = 1;
    public hh4 X = null;
    public boolean Y = false;
    public volatile drk Z = null;
    public final AtomicInteger a0 = new AtomicInteger(0);

    public fe1(Context context, Looper looper, o2l o2lVar, g88 g88Var, int i, ce1 ce1Var, de1 de1Var, String str) {
        dgj.w("Context must not be null", context);
        this.G = context;
        dgj.w("Looper must not be null", looper);
        dgj.w("Supervisor must not be null", o2lVar);
        this.H = o2lVar;
        dgj.w("API availability must not be null", g88Var);
        this.I = g88Var;
        this.J = new luj(this, looper);
        this.U = i;
        this.S = ce1Var;
        this.T = de1Var;
        this.V = str;
    }

    public final void A(ee1 ee1Var, int i, PendingIntent pendingIntent) {
        this.N = ee1Var;
        int i2 = this.a0.get();
        luj lujVar = this.J;
        lujVar.sendMessage(lujVar.obtainMessage(3, i2, i, pendingIntent));
    }

    public boolean B() {
        return this instanceof dre;
    }

    public final /* synthetic */ boolean C(int i, int i2, IInterface iInterface) {
        synchronized (this.K) {
            try {
                if (this.R != i) {
                    return false;
                }
                D(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void D(int i, IInterface iInterface) {
        m11 m11Var;
        dgj.o((i == 4) == (iInterface != null));
        synchronized (this.K) {
            try {
                this.R = i;
                this.O = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    h7k h7kVar = this.Q;
                    if (h7kVar != null) {
                        o2l o2lVar = this.H;
                        String strI = this.F.i();
                        dgj.v(strI);
                        String strK = this.F.k();
                        if (this.V == null) {
                            this.G.getClass();
                        }
                        o2lVar.c(strI, strK, h7kVar, this.F.m());
                        this.Q = null;
                    }
                } else if (i == 2 || i == 3) {
                    h7k h7kVar2 = this.Q;
                    if (h7kVar2 != null && (m11Var = this.F) != null) {
                        String strI2 = m11Var.i();
                        String strK2 = m11Var.k();
                        StringBuilder sb = new StringBuilder(String.valueOf(strI2).length() + 70 + String.valueOf(strK2).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(strI2);
                        sb.append(" on ");
                        sb.append(strK2);
                        Log.e("GmsClient", sb.toString());
                        o2l o2lVar2 = this.H;
                        String strI3 = this.F.i();
                        dgj.v(strI3);
                        String strK3 = this.F.k();
                        if (this.V == null) {
                            this.G.getClass();
                        }
                        o2lVar2.c(strI3, strK3, h7kVar2, this.F.m());
                        this.a0.incrementAndGet();
                    }
                    h7k h7kVar3 = new h7k(this, this.a0.get());
                    this.Q = h7kVar3;
                    m11 m11Var2 = new m11(w(), v(), x());
                    this.F = m11Var2;
                    if (m11Var2.m() && i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.F.i())));
                    }
                    o2l o2lVar3 = this.H;
                    String strI4 = this.F.i();
                    dgj.v(strI4);
                    String strK4 = this.F.k();
                    String name = this.V;
                    if (name == null) {
                        name = this.G.getClass().getName();
                    }
                    hh4 hh4VarB = o2lVar3.b(new tzk(strI4, strK4, this.F.m()), h7kVar3, name, null);
                    if (!(hh4VarB.F == 0)) {
                        String strI5 = this.F.i();
                        String strK5 = this.F.k();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(strI5).length() + 34 + String.valueOf(strK5).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(strI5);
                        sb2.append(" on ");
                        sb2.append(strK5);
                        Log.w("GmsClient", sb2.toString());
                        int i2 = hh4VarB.F;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (hh4VarB.G != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", hh4VarB.G);
                        }
                        int i3 = this.a0.get();
                        gfk gfkVar = new gfk(this, i2, bundle);
                        luj lujVar = this.J;
                        lujVar.sendMessage(lujVar.obtainMessage(7, i3, -1, gfkVar));
                    }
                } else if (i == 4) {
                    dgj.v(iInterface);
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.K) {
            z = this.R == 4;
        }
        return z;
    }

    public final void c(String str) {
        this.E = str;
        o();
    }

    public final boolean d() {
        boolean z;
        synchronized (this.K) {
            int i = this.R;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final String e() {
        m11 m11Var;
        if (a() && (m11Var = this.F) != null) {
            return m11Var.k();
        }
        pmf.o("Failed to connect when checking package");
        return null;
    }

    public void f(ee1 ee1Var) {
        this.N = ee1Var;
        D(2, null);
    }

    public final void g(xzd xzdVar) {
        xzdVar.A();
    }

    public boolean h() {
        return true;
    }

    public abstract int i();

    public final jf7[] j() {
        drk drkVar = this.Z;
        if (drkVar == null) {
            return null;
        }
        return drkVar.F;
    }

    public final String k() {
        return this.E;
    }

    public boolean l() {
        return false;
    }

    public final void m(ft8 ft8Var, Set set) {
        Bundle bundleR = r();
        String str = this.W;
        int i = this.U;
        int i2 = g88.a;
        Scope[] scopeArr = g48.S;
        Bundle bundle = new Bundle();
        jf7[] jf7VarArr = g48.T;
        g48 g48Var = new g48(6, i, i2, null, null, scopeArr, bundle, null, jf7VarArr, jf7VarArr, true, 0, false, str);
        g48Var.H = this.G.getPackageName();
        g48Var.K = bundleR;
        if (set != null) {
            g48Var.J = (Scope[]) set.toArray(new Scope[0]);
        }
        if (l()) {
            Account accountP = p();
            if (accountP == null) {
                accountP = new Account("<<default account>>", "com.google");
            }
            g48Var.L = accountP;
            if (ft8Var != null) {
                g48Var.I = ft8Var.asBinder();
            }
        }
        g48Var.M = b0;
        g48Var.N = q();
        if (B()) {
            g48Var.Q = true;
        }
        try {
            synchronized (this.L) {
                try {
                    ipj ipjVar = this.M;
                    if (ipjVar != null) {
                        ipjVar.b(new m3k(this, this.a0.get()), g48Var);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.a0.get();
            luj lujVar = this.J;
            lujVar.sendMessage(lujVar.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            z(8, null, null, this.a0.get());
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            z(8, null, null, this.a0.get());
        }
    }

    public abstract IInterface n(IBinder iBinder);

    public final void o() {
        this.a0.incrementAndGet();
        ArrayList arrayList = this.P;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((epj) arrayList.get(i)).e();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.L) {
            this.M = null;
        }
        D(1, null);
    }

    public Account p() {
        return null;
    }

    public jf7[] q() {
        return b0;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.EMPTY_SET;
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.K) {
            try {
                if (this.R == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.O;
                dgj.w("Client is connected but service is null", iInterface2);
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public String w() {
        return "com.google.android.gms";
    }

    public boolean x() {
        return i() >= 211700000;
    }

    public void y() {
        System.currentTimeMillis();
    }

    public void z(int i, IBinder iBinder, Bundle bundle, int i2) {
        dbk dbkVar = new dbk(this, i, iBinder, bundle);
        luj lujVar = this.J;
        lujVar.sendMessage(lujVar.obtainMessage(1, i2, -1, dbkVar));
    }
}
