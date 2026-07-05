package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.core.os.OperationCanceledException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class eqb implements Callable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public eqb(mnk mnkVar, rvj rvjVar, String str) {
        this.E = 3;
        this.F = mnkVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        ksj ksjVar;
        int i;
        boolean z = true;
        switch (this.E) {
            case 0:
                f11 f11Var = (f11) this.F;
                AtomicBoolean atomicBoolean = f11Var.G;
                f11Var.H.set(true);
                try {
                    Process.setThreadPriority(10);
                    try {
                        f11Var.I.d();
                        break;
                    } catch (OperationCanceledException e) {
                        if (!atomicBoolean.get()) {
                            throw e;
                        }
                    }
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            case 1:
                uxj uxjVar = (uxj) this.F;
                zo1 zo1Var = uxjVar.I;
                synchronized (zo1Var.a) {
                    try {
                        if (zo1Var.b != 3) {
                            boolean z2 = zo1Var.b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                jyj.b(zo1Var.D.longValue(), bundle, zo1Var.c, zo1Var.d);
                            }
                            synchronized (zo1Var.a) {
                                ksjVar = zo1Var.i;
                                break;
                            }
                            zo1 zo1Var2 = uxjVar.I;
                            if (ksjVar == null) {
                                zo1Var2.s(0);
                                int i2 = uxjVar.H;
                                hp1 hp1Var = y3k.h;
                                zo1Var2.r(107, i2, hp1Var);
                                uxjVar.c(hp1Var);
                            } else {
                                String packageName = zo1Var2.g.getPackageName();
                                int i3 = 27;
                                int iO = 3;
                                int i4 = 27;
                                while (true) {
                                    if (i4 >= 3) {
                                        try {
                                            jyj.g("BillingClient", "trying subs apiVersion: " + i4);
                                            iO = bundle == null ? ((asj) ksjVar).O(packageName, i4, "subs") : ((asj) ksjVar).P(i4, packageName, "subs", bundle);
                                            if (iO == 0) {
                                                jyj.g("BillingClient", "highestLevelSupportedForSubs: " + i4);
                                            } else {
                                                i4--;
                                            }
                                        } catch (Exception e2) {
                                            jyj.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", e2);
                                            boolean z3 = e2 instanceof DeadObjectException;
                                            int i5 = z3 ? 91 : e2 instanceof RemoteException ? 90 : e2 instanceof SecurityException ? 92 : 42;
                                            String strA = sq6.c(i5, 42) ? a3k.a(e2) : null;
                                            uxjVar.I.s(0);
                                            uxjVar.b(z3 ? y3k.h : y3k.f, i5, strA, z2);
                                            uxjVar.c(z3 ? y3k.h : y3k.f);
                                        }
                                    } else {
                                        i4 = 0;
                                    }
                                }
                                zo1Var2.k = i4 >= 3;
                                if (i4 < 3) {
                                    jyj.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i = 9;
                                } else {
                                    i = 1;
                                }
                                while (true) {
                                    if (i3 >= 3) {
                                        jyj.g("BillingClient", "trying inapp apiVersion: " + i3);
                                        iO = bundle == null ? ((asj) ksjVar).O(packageName, i3, "inapp") : ((asj) ksjVar).P(i3, packageName, "inapp", bundle);
                                        if (iO == 0) {
                                            zo1Var2.l = i3;
                                            jyj.g("BillingClient", "mHighestLevelSupportedForInApp: " + i3);
                                        } else {
                                            i3--;
                                        }
                                    }
                                }
                                int i6 = zo1Var2.l;
                                zo1Var2.l = i6;
                                zo1Var2.x = i6 >= 26;
                                zo1Var2.w = i6 >= 24;
                                zo1Var2.v = i6 >= 21;
                                zo1Var2.u = i6 >= 20;
                                zo1Var2.t = i6 >= 19;
                                zo1Var2.s = i6 >= 18;
                                zo1Var2.r = i6 >= 17;
                                zo1Var2.q = i6 >= 16;
                                zo1Var2.p = i6 >= 15;
                                zo1Var2.o = i6 >= 14;
                                zo1Var2.n = i6 >= 9;
                                zo1Var2.m = i6 >= 6;
                                if (i6 < 3) {
                                    jyj.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i = 36;
                                }
                                zo1.j(zo1Var2, iO);
                                if (iO != 0) {
                                    hp1 hp1Var2 = y3k.a;
                                    uxjVar.b(hp1Var2, i, null, z2);
                                    uxjVar.c(hp1Var2);
                                } else {
                                    try {
                                        Long lA = uxjVar.a(z2);
                                        if (z2) {
                                            qqk qqkVarQ = irk.q();
                                            qqkVarQ.g(6);
                                            owk owkVarP = swk.p();
                                            int i7 = uxjVar.H;
                                            if (i7 <= 0) {
                                                z = false;
                                            }
                                            owkVarP.c(z);
                                            owkVarP.d(i7);
                                            owkVarP.b();
                                            swk.t((swk) owkVarP.F);
                                            if (lA != null) {
                                                long jLongValue = lA.longValue();
                                                owkVarP.b();
                                                swk.s((swk) owkVarP.F, jLongValue);
                                            }
                                            zo1 zo1Var3 = uxjVar.I;
                                            qqkVarQ.f(owkVarP);
                                            zo1Var3.q((irk) qqkVarQ.a());
                                        } else {
                                            svk svkVarP = yvk.p();
                                            lrk lrkVarQ = wrk.q();
                                            lrkVarQ.b();
                                            wrk.p((wrk) lrkVarQ.F, 0);
                                            lrkVarQ.b();
                                            wrk.t((wrk) lrkVarQ.F);
                                            svkVarP.c(lrkVarQ);
                                            if (lA != null) {
                                                svkVarP.d(lA.longValue());
                                            }
                                            uxjVar.I.h.B((yvk) svkVarP.a());
                                        }
                                    } catch (Throwable th) {
                                        jyj.i("BillingClient", "Unable to log.", th);
                                    }
                                    uxjVar.c(y3k.g);
                                }
                            }
                        }
                    } finally {
                    }
                }
                return null;
            case 2:
                return new luk(((pkk) this.F).O);
            case 3:
                o0l o0lVar = ((mnk) this.F).i;
                o0lVar.Z();
                dik dikVar = o0lVar.L;
                o0l.t(dikVar);
                dikVar.K0();
                ((umk) dikVar.E).getClass();
                throw new IllegalStateException("Unexpected call on client side");
            case 4:
                return n3a.c.a(((yxk) this.F).g);
            case 5:
                return n3a.c.a(((zxk) this.F).g);
            default:
                return n3a.c.a(((hzk) this.F).a);
        }
    }

    public /* synthetic */ eqb(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }
}
