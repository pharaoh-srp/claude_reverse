package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ygh {
    public static final ql8 g = new ql8(29);
    public final q5b a;
    public final fu9 b;
    public final wt7 c;
    public final long d;
    public final float e;
    public final float f;

    public ygh(q5b q5bVar, fu9 fu9Var, wt7 wt7Var, long j) {
        this.a = q5bVar;
        this.b = fu9Var;
        this.c = wt7Var;
        this.d = j;
        this.e = q5bVar.getDensity();
        this.f = q5bVar.k0();
    }

    public final String toString() {
        return "MeasureInputs(density=" + this.a + ", densityValue=" + this.e + ", fontScale=" + this.f + ", layoutDirection=" + this.b + ", fontFamilyResolver=" + this.c + ", constraints=" + ((Object) rl4.l(this.d)) + ')';
    }
}
