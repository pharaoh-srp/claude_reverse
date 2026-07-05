package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class fn9 extends im9 {
    public final Class F;
    public final fce G;

    public fn9(Class cls) {
        cls.getClass();
        this.F = cls;
        this.G = new fce(new l4(23, this));
    }

    @Override // defpackage.sg3
    public final Class a() {
        return this.F;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fn9) {
            return x44.r(this.F, ((fn9) obj).F);
        }
        return false;
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    @Override // defpackage.im9
    public final Collection l() {
        return lm6.E;
    }

    @Override // defpackage.im9
    public final Collection m(sxb sxbVar) {
        return ((dn9) this.G.a()).c().g(sxbVar, 8);
    }

    @Override // defpackage.im9
    public final hrd o(int i) {
        r7i r7iVarA = ((dn9) this.G.a()).a();
        if (r7iVarA == null) {
            return null;
        }
        kk9 kk9Var = (kk9) r7iVarA.E;
        ysd ysdVar = (ysd) r7iVarA.F;
        jk9 jk9Var = (jk9) r7iVarA.G;
        t28 t28Var = el9.n;
        t28Var.getClass();
        ctd ctdVar = (ctd) uik.j(ysdVar, t28Var, i);
        if (ctdVar == null) {
            return null;
        }
        ttd ttdVar = ysdVar.K;
        ttdVar.getClass();
        return (hrd) vpi.f(this.F, ctdVar, kk9Var, new cbi(ttdVar), jk9Var, en9.E);
    }

    @Override // defpackage.im9
    public final Class q() {
        Class clsB = ((dn9) this.G.a()).b();
        return clsB == null ? this.F : clsB;
    }

    @Override // defpackage.im9
    public final Collection r(sxb sxbVar) {
        return ((dn9) this.G.a()).c().d(sxbVar, 8);
    }

    public final String toString() {
        return "file class " + yae.a(this.F).b();
    }
}
