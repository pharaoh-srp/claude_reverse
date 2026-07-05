package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ce7 implements iy7 {
    public final yr E;
    public final jz1 F;
    public double G;
    public long H;
    public double I;

    public ce7(yr yrVar) {
        jz1.a.getClass();
        hz1 hz1Var = iz1.b;
        this.E = yrVar;
        this.F = hz1Var;
        this.G = 60.0d;
        this.H = 16666666L;
        this.I = 60.0d;
    }

    @Override // defpackage.bd9
    public final void a(ey7 ey7Var) {
        double d = ey7Var.c;
        if (d > 0.0d) {
            double d2 = 1.0E9d / d;
            hz1 hz1Var = (hz1) this.F;
            if (hz1Var.h) {
                this.G = 1.0E9d / this.H;
            } else if (hz1Var.b == 30) {
                this.G = this.I;
            }
            double d3 = (60.0d / this.G) * d2;
            double d4 = d3 <= 60.0d ? d3 : 60.0d;
            if (d4 > 1.0d) {
                this.E.l(d4);
            }
        }
    }

    @Override // defpackage.iy7
    public final void b(hy7 hy7Var) {
        hy7Var.getClass();
        this.I = hy7Var.p;
        if (((hz1) this.F).h) {
            this.H = hy7Var.o;
        }
    }
}
