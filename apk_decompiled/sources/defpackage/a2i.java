package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a2i implements u9d {
    public final xo1 a;
    public final long b;
    public final float c;
    public final float d;
    public final rk1 e;

    public a2i(xo1 xo1Var, long j, float f, float f2, rk1 rk1Var) {
        this.a = xo1Var;
        this.b = j;
        this.c = f;
        this.d = f2;
        this.e = rk1Var;
    }

    @Override // defpackage.u9d
    public final long a(c79 c79Var, long j, fu9 fu9Var, long j2) {
        c79Var.getClass();
        fu9Var.getClass();
        long jF = (((long) c79Var.f()) << 32) | (((long) c79Var.c()) & 4294967295L);
        xo1 xo1Var = this.a;
        long jA = xo1Var.a(0L, jF, fu9Var);
        int i = (int) (j2 >> 32);
        long jA2 = xo1Var.a(0L, (((long) i) << 32) | (((long) ((int) (j2 & 4294967295L))) & 4294967295L), fu9Var);
        long jC = y69.c(y69.d(y69.d(0L, (((long) c79Var.a) << 32) | (((long) c79Var.b) & 4294967295L)), jA), (((long) ((int) (jA2 & 4294967295L))) & 4294967295L) | (((long) ((int) (jA2 >> 32))) << 32));
        long j3 = this.b;
        long jD = y69.d(jC, (((long) ((int) (j3 & 4294967295L))) & 4294967295L) | (((long) (((int) (j3 >> 32)) * (fu9Var == fu9.E ? 1 : -1))) << 32));
        float f = this.c;
        float f2 = this.d;
        float f3 = f - f2;
        float f4 = (int) (j >> 32);
        float f5 = (f4 - f) - f2;
        int iY = (int) (csg.y(j2) >> 32);
        float f6 = 2.0f * f2;
        float f7 = f4 - f6;
        float f8 = iY;
        rk1 rk1Var = this.e;
        if (f8 <= f3 && f8 <= f5) {
            long j4 = (((long) (((int) f) - iY)) << 32) | (((long) ((int) (jD & 4294967295L))) & 4294967295L);
            rk1Var.invoke(Float.valueOf(f8 - f2));
            return j4;
        }
        if (i >= f7) {
            long jY = (((long) (((int) (csg.y(j) >> 32)) - iY)) << 32) | (((long) ((int) (jD & 4294967295L))) & 4294967295L);
            rk1Var.invoke(Float.valueOf((f - ((int) (jY >> 32))) - f2));
            return jY;
        }
        if (f8 > f5) {
            long j5 = (((long) ((int) f)) << 32) | (((long) ((int) (jD & 4294967295L))) & 4294967295L);
            rk1Var.invoke(Float.valueOf(((f8 - f5) + f8) - f6));
            return j5;
        }
        if (f8 <= f3) {
            rk1Var.invoke(Float.valueOf(f));
            return jD;
        }
        long j6 = ((long) ((int) (jD & 4294967295L))) & 4294967295L;
        rk1Var.invoke(Float.valueOf(f3));
        return j6;
    }
}
