package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cu implements u9d {
    public final xo1 a;
    public final long b;

    public cu(xo1 xo1Var, long j) {
        this.a = xo1Var;
        this.b = j;
    }

    @Override // defpackage.u9d
    public final long a(c79 c79Var, long j, fu9 fu9Var, long j2) {
        long jD = c79Var.d();
        xo1 xo1Var = this.a;
        long jA = xo1Var.a(0L, jD, fu9Var);
        long jA2 = xo1Var.a(0L, j2, fu9Var);
        long j3 = (((long) (-((int) (jA2 >> 32)))) << 32) | (((long) (-((int) (jA2 & 4294967295L)))) & 4294967295L);
        long j4 = this.b;
        return y69.d(y69.d(y69.d(c79Var.e(), jA), j3), (((long) ((int) (j4 & 4294967295L))) & 4294967295L) | (((long) (((int) (j4 >> 32)) * (fu9Var == fu9.E ? 1 : -1))) << 32));
    }
}
