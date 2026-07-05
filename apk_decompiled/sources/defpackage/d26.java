package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d26 implements c4f {
    public static final double F = Math.pow(2.0d, 64.0d) - 1.0d;
    public final float E;

    public d26(double d) {
        this.E = (float) d;
    }

    @Override // defpackage.c4f
    public final boolean b(cf5 cf5Var) {
        long jE = (cf5Var.c.G.e() * 1111111111111111111L) - Long.MIN_VALUE;
        double d = this.E;
        double d2 = F;
        return jE < ((d > 0.5d ? 1 : (d == 0.5d ? 0 : -1)) < 0 ? ((long) (d * d2)) + Long.MIN_VALUE : (d > 1.0d ? 1 : (d == 1.0d ? 0 : -1)) < 0 ? (long) ((d * d2) + (-9.223372036854776E18d)) : Long.MAX_VALUE);
    }
}
