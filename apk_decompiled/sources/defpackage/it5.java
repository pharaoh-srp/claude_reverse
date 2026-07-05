package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class it5 implements aaf {
    public final bz7 a;
    public final ht5 b = new ht5(this);
    public final fxb c = new fxb();
    public final lsc d;
    public final lsc e;
    public final lsc f;

    public it5(bz7 bz7Var) {
        this.a = bz7Var;
        Boolean bool = Boolean.FALSE;
        this.d = mpk.P(bool);
        this.e = mpk.P(bool);
        this.f = mpk.P(bool);
    }

    @Override // defpackage.aaf
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.aaf
    public final Object c(zwb zwbVar, pz7 pz7Var, tp4 tp4Var) {
        Object objN = fd9.N(new cx(this, zwbVar, pz7Var, (tp4) null, 13), tp4Var);
        return objN == m45.E ? objN : iei.a;
    }

    @Override // defpackage.aaf
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }

    public final boolean f() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }
}
