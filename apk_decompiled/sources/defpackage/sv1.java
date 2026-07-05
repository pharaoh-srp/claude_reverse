package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class sv1 {
    public final k3g a;
    public final a6i b;
    public final zy7 c;
    public final lsc d;
    public final lsc e;
    public kl7 f = tv1.a;
    public final lsc g = mpk.P(null);

    public sv1(k3g k3gVar, a6i a6iVar, q5i q5iVar, eb0 eb0Var, zy7 zy7Var) {
        this.a = k3gVar;
        this.b = a6iVar;
        this.c = zy7Var;
        this.d = mpk.P(q5iVar);
        this.e = mpk.P(eb0Var);
    }

    public final void a(l9e l9eVar, l9e l9eVar2, eb0 eb0Var) {
        kl7 kl7VarN;
        if (this.a.a()) {
            lsc lscVar = this.g;
            if (((wlg) lscVar.getValue()) == null) {
                if (eb0Var == null) {
                    eb0Var = (eb0) this.e.getValue();
                }
                switch (eb0Var.a) {
                    case 0:
                        kl7VarN = kxk.N(700, 0, wi6.a, 2);
                        break;
                    case 1:
                        kl7VarN = kxk.K(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, nzi.a, 3);
                        break;
                    default:
                        kl7VarN = o3g.a;
                        break;
                }
                this.f = kl7VarN;
            }
            lscVar.setValue(((q5i) this.d.getValue()).a(new e0(8, this), new v80(this, l9eVar2, l9eVar, 1)));
        }
    }

    public final boolean b() {
        return ((Boolean) this.b.d.getValue()).booleanValue();
    }

    public final l9e c() {
        wlg wlgVar;
        l9e l9eVar;
        if (!this.a.a() || (wlgVar = (wlg) this.g.getValue()) == null || (l9eVar = (l9e) wlgVar.getValue()) == null) {
            return null;
        }
        long j = ((fcc) this.c.a()).a;
        return !fcc.c(j, 0L) ? l9eVar.m(j) : l9eVar;
    }
}
