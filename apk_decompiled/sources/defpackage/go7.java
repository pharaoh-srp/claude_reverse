package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class go7 implements ro7 {
    public final float E;
    public final float F;

    public go7() {
        this.E = Math.max(1.0E-7f, Math.abs(0.1f));
        this.F = Math.max(1.0E-4f, 1.0f) * (-4.2f);
    }

    public fo7 a(float f) {
        float[] fArr = i20.a;
        float f2 = this.E;
        float f3 = this.F;
        double dA = i20.a(f, f2 * f3);
        double d = ho7.a;
        double d2 = d - 1.0d;
        return new fo7((long) (Math.exp(dA / d2) * 1000.0d), f, (float) (Math.exp((d / d2) * dA) * ((double) (f2 * f3))));
    }

    @Override // defpackage.ro7
    public float f() {
        return this.E;
    }

    @Override // defpackage.ro7
    public float g(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.F));
    }

    @Override // defpackage.ro7
    public long i(float f) {
        return ((long) ((((float) Math.log(this.E / Math.abs(f))) * 1000.0f) / this.F)) * 1000000;
    }

    @Override // defpackage.ro7
    public float o(float f, float f2) {
        if (Math.abs(f2) <= this.E) {
            return f;
        }
        double dLog = Math.log(Math.abs(r1 / f2));
        float f3 = this.F;
        return ((f2 / f3) * ((float) Math.exp((((double) f3) * ((dLog / ((double) f3)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f3));
    }

    @Override // defpackage.ro7
    public float t(long j, float f, float f2) {
        float f3 = this.F;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    public go7(float f, cz5 cz5Var) {
        this.E = f;
        float density = cz5Var.getDensity();
        float f2 = ho7.a;
        this.F = density * 386.0878f * 160.0f * 0.84f;
    }
}
