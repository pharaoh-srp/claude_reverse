package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bo9 extends xn9 implements jn9, jm9 {
    public static final /* synthetic */ wn9[] L;
    public final ece J = csg.C(null, new ao9(this, 1));
    public final kw9 K = yb5.w(w1a.F, new ao9(this, 0));

    static {
        kce kceVar = jce.a;
        L = new wn9[]{kceVar.g(new mrd(kceVar.b(bo9.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bo9) && x44.r(x(), ((bo9) obj).x());
    }

    @Override // defpackage.ll9
    public final String getName() {
        return vb7.s(new StringBuilder("<set-"), x().K, '>');
    }

    public final int hashCode() {
        return x().hashCode();
    }

    @Override // defpackage.ol9
    public final q92 q() {
        return (q92) this.K.getValue();
    }

    @Override // defpackage.ol9
    public final e92 t() {
        wn9 wn9Var = L[0];
        Object objA = this.J.a();
        objA.getClass();
        return (prd) objA;
    }

    public final String toString() {
        return "setter of " + x();
    }

    @Override // defpackage.xn9
    public final erd w() {
        wn9 wn9Var = L[0];
        Object objA = this.J.a();
        objA.getClass();
        return (prd) objA;
    }
}
