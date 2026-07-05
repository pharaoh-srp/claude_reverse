package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nsj implements Callable {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ nsj(zo1 zo1Var, z22 z22Var) {
        this.E = 0;
        this.F = zo1Var;
        this.G = z22Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ksj ksjVar;
        switch (this.E) {
            case 0:
                zo1 zo1Var = (zo1) this.F;
                z22 z22Var = (z22) this.G;
                try {
                    if (!zo1Var.v()) {
                        jyj.h("BillingClient", "Service disconnected.");
                        hp1 hp1Var = y3k.h;
                        zo1Var.z(2, 13, hp1Var);
                        z22Var.b(hp1Var, null);
                    } else if (zo1Var.s) {
                        synchronized (zo1Var.a) {
                            ksjVar = zo1Var.i;
                            break;
                        }
                        if (ksjVar == null) {
                            zo1Var.i(z22Var, y3k.h, 107, null);
                        } else {
                            String packageName = zo1Var.g.getPackageName();
                            String str = zo1Var.c;
                            String str2 = zo1Var.d;
                            long jLongValue = zo1Var.D.longValue();
                            int i = jyj.a;
                            Bundle bundle = new Bundle();
                            jyj.b(jLongValue, bundle, str, str2);
                            ((asj) ksjVar).V(packageName, bundle, new hzj(z22Var, zo1Var.h, zo1Var.l));
                        }
                    } else {
                        jyj.h("BillingClient", "Current client doesn't support get billing config.");
                        hp1 hp1Var2 = y3k.n;
                        zo1Var.z(32, 13, hp1Var2);
                        z22Var.b(hp1Var2, null);
                    }
                } catch (DeadObjectException e) {
                    zo1Var.i(z22Var, y3k.h, 62, e);
                } catch (Exception e2) {
                    zo1Var.i(z22Var, y3k.f, 62, e2);
                }
                return null;
            case 1:
                o0l o0lVar = ((mnk) this.G).i;
                o0lVar.Z();
                return new lrj(o0lVar.b(((u1l) this.F).E));
            default:
                o0l o0lVar2 = ((mnk) this.G).i;
                o0lVar2.Z();
                wrj wrjVar = o0lVar2.G;
                o0l.t(wrjVar);
                return wrjVar.N1((String) this.F);
        }
    }

    public /* synthetic */ nsj(mnk mnkVar, Object obj, int i) {
        this.E = i;
        this.F = obj;
        this.G = mnkVar;
    }
}
