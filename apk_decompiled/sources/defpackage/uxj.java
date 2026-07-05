package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public final class uxj implements ServiceConnection {
    public final bp1 E;
    public final hwj F;
    public final hwj G;
    public final int H;
    public final /* synthetic */ zo1 I;

    public uxj(zo1 zo1Var, bp1 bp1Var, int i) {
        this.I = zo1Var;
        pwj pwjVar = zo1Var.E;
        this.F = new hwj(pwjVar);
        this.G = new hwj(pwjVar);
        this.E = bp1Var;
        this.H = i;
    }

    public final Long a(boolean z) {
        zo1 zo1Var = this.I;
        try {
            if (z) {
                synchronized (zo1Var.a) {
                    try {
                        hwj hwjVar = this.F;
                        if (!hwjVar.b) {
                            return null;
                        }
                        long jB = hwjVar.a.b();
                        if (!hwjVar.b) {
                            throw new IllegalStateException("This stopwatch is already stopped.");
                        }
                        hwjVar.b = false;
                        long j = (jB - hwjVar.d) + hwjVar.c;
                        hwjVar.c = j;
                        return Long.valueOf(j / 1000000);
                    } finally {
                    }
                }
            }
            synchronized (zo1Var.a) {
                try {
                    hwj hwjVar2 = this.G;
                    if (!hwjVar2.b) {
                        return null;
                    }
                    long jB2 = hwjVar2.a.b();
                    if (!hwjVar2.b) {
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    }
                    hwjVar2.b = false;
                    long j2 = (jB2 - hwjVar2.d) + hwjVar2.c;
                    hwjVar2.c = j2;
                    return Long.valueOf(j2 / 1000000);
                } finally {
                }
            }
        } catch (Throwable th) {
            jyj.i("BillingClient", "Exception getting connection establishment duration.", th);
            return null;
        }
        jyj.i("BillingClient", "Exception getting connection establishment duration.", th);
        return null;
    }

    public final void b(hp1 hp1Var, int i, String str, boolean z) {
        try {
            lrk lrkVarQ = wrk.q();
            int i2 = hp1Var.a;
            lrkVarQ.b();
            wrk.p((wrk) lrkVarQ.F, i2);
            String str2 = hp1Var.c;
            lrkVarQ.b();
            wrk.s((wrk) lrkVarQ.F, str2);
            lrkVarQ.b();
            wrk.v((wrk) lrkVarQ.F, i);
            lrkVarQ.b();
            wrk.t((wrk) lrkVarQ.F);
            if (str != null) {
                lrkVarQ.b();
                wrk.r((wrk) lrkVarQ.F, str);
            }
            Long lA = a(z);
            zo1 zo1Var = this.I;
            if (!z) {
                svk svkVarP = yvk.p();
                svkVarP.c(lrkVarQ);
                if (lA != null) {
                    svkVarP.d(lA.longValue());
                }
                zo1Var.h.B((yvk) svkVarP.a());
                return;
            }
            owk owkVarP = swk.p();
            int i3 = this.H;
            owkVarP.c(i3 > 0);
            owkVarP.d(i3);
            owkVarP.b();
            swk.t((swk) owkVarP.F);
            if (lA != null) {
                long jLongValue = lA.longValue();
                owkVarP.b();
                swk.s((swk) owkVarP.F, jLongValue);
            }
            hqk hqkVarS = lqk.s();
            hqkVarS.c(lrkVarQ);
            hqkVarS.b();
            lqk.r((lqk) hqkVarS.F, 6);
            hqkVarS.d(owkVarP);
            zo1Var.p((lqk) hqkVarS.a());
        } catch (Throwable th) {
            jyj.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(hp1 hp1Var) {
        zo1 zo1Var = this.I;
        synchronized (zo1Var.a) {
            try {
                if (zo1Var.b == 3) {
                    return;
                }
                try {
                    this.E.d(hp1Var);
                } catch (Throwable th) {
                    jyj.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        boolean z2;
        jyj.h("BillingClient", "Billing service died.");
        try {
            zo1 zo1Var = this.I;
            synchronized (zo1Var.a) {
                z = true;
                z2 = zo1Var.b == 1;
            }
            cbf cbfVar = zo1Var.h;
            if (z2) {
                hqk hqkVarS = lqk.s();
                hqkVarS.b();
                lqk.r((lqk) hqkVarS.F, 6);
                lrk lrkVarQ = wrk.q();
                lrkVarQ.b();
                wrk.v((wrk) lrkVarQ.F, 110);
                hqkVarS.c(lrkVarQ);
                owk owkVarP = swk.p();
                int i = this.H;
                if (i <= 0) {
                    z = false;
                }
                owkVarP.c(z);
                owkVarP.d(i);
                hqkVarS.d(owkVarP);
                cbfVar.v((lqk) hqkVarS.a());
            } else {
                cbfVar.A(dsk.q());
            }
        } catch (Throwable th) {
            jyj.i("BillingClient", "Unable to log.", th);
        }
        zo1 zo1Var2 = this.I;
        synchronized (zo1Var2.a) {
            if (zo1Var2.b != 3 && zo1Var2.b != 0) {
                zo1Var2.s(0);
                zo1Var2.u();
                try {
                    this.E.g();
                } catch (Throwable th2) {
                    jyj.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        jyj.g("BillingClient", "Billing service connected.");
        zo1 zo1Var = this.I;
        synchronized (zo1Var.a) {
            try {
                if (zo1Var.b == 3) {
                    return;
                }
                zo1Var.i = fsj.H(iBinder);
                if (zo1.f(new eqb(1, this), 30000L, new k51(19, this), zo1Var.k(), zo1Var.e()) == null) {
                    int i = this.H;
                    hp1 hp1VarN = zo1Var.n();
                    zo1Var.r(25, i, hp1VarN);
                    c(hp1VarN);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        boolean z2;
        jyj.h("BillingClient", "Billing service disconnected.");
        try {
            zo1 zo1Var = this.I;
            synchronized (zo1Var.a) {
                z = true;
                z2 = zo1Var.b == 1;
            }
            cbf cbfVar = zo1Var.h;
            if (z2) {
                hqk hqkVarS = lqk.s();
                hqkVarS.b();
                lqk.r((lqk) hqkVarS.F, 6);
                lrk lrkVarQ = wrk.q();
                lrkVarQ.b();
                wrk.v((wrk) lrkVarQ.F, 109);
                hqkVarS.c(lrkVarQ);
                owk owkVarP = swk.p();
                int i = this.H;
                if (i <= 0) {
                    z = false;
                }
                owkVarP.c(z);
                owkVarP.d(i);
                hqkVarS.d(owkVarP);
                cbfVar.v((lqk) hqkVarS.a());
            } else {
                cbfVar.C(kwk.q());
            }
        } catch (Throwable th) {
            jyj.i("BillingClient", "Unable to log.", th);
        }
        zo1 zo1Var2 = this.I;
        synchronized (zo1Var2.a) {
            try {
                hwj hwjVar = this.G;
                hwjVar.c = 0L;
                hwjVar.b = false;
                hwjVar.a();
                if (zo1Var2.b == 3) {
                    return;
                }
                zo1Var2.s(0);
                try {
                    this.E.g();
                } catch (Throwable th2) {
                    jyj.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } finally {
            }
        }
    }
}
