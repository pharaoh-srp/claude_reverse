package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dri extends eri {
    public final u0h P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dri(c92 c92Var, eri eriVar, int i, wc0 wc0Var, sxb sxbVar, yr9 yr9Var, boolean z, boolean z2, boolean z3, yr9 yr9Var2, neg negVar, zy7 zy7Var) {
        super(c92Var, eriVar, i, wc0Var, sxbVar, yr9Var, z, z2, z3, yr9Var2, negVar);
        wc0Var.getClass();
        sxbVar.getClass();
        negVar.getClass();
        zy7Var.getClass();
        this.P = new u0h(zy7Var);
    }

    @Override // defpackage.eri
    public final eri N0(k08 k08Var, sxb sxbVar, int i) {
        wc0 annotations = getAnnotations();
        annotations.getClass();
        yr9 type = getType();
        type.getClass();
        return new dri(k08Var, null, i, annotations, sxbVar, type, P0(), this.L, this.M, this.N, neg.n, new k2c(12, this));
    }

    public final List V0() {
        return (List) this.P.getValue();
    }
}
