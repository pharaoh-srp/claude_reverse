package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hy7 {
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public double p;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hy7)) {
            return false;
        }
        hy7 hy7Var = (hy7) obj;
        return this.a == hy7Var.a && this.b == hy7Var.b && this.c == hy7Var.c && this.d == hy7Var.d && this.e == hy7Var.e && this.f == hy7Var.f && this.g == hy7Var.g && this.h == hy7Var.h && this.i == hy7Var.i && this.j == hy7Var.j && this.k == hy7Var.k && this.l == hy7Var.l && this.m == hy7Var.m && this.n == hy7Var.n && this.o == hy7Var.o && Double.compare(this.p, hy7Var.p) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.p) + vb7.e(vb7.e(vb7.e(vb7.e(fsh.p(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(vb7.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        int i = this.a;
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        long j4 = this.e;
        long j5 = this.f;
        long j6 = this.g;
        long j7 = this.h;
        long j8 = this.i;
        long j9 = this.j;
        boolean z = this.k;
        long j10 = this.l;
        long j11 = this.m;
        long j12 = this.n;
        long j13 = this.o;
        double d = this.p;
        StringBuilder sb = new StringBuilder("FrameMetricsData(droppedFrames=");
        sb.append(i);
        sb.append(", unknownDelayDuration=");
        sb.append(j);
        ij0.u(j2, ", inputHandlingDuration=", ", animationDuration=", sb);
        sb.append(j3);
        ij0.u(j4, ", layoutMeasureDuration=", ", drawDuration=", sb);
        sb.append(j5);
        ij0.u(j6, ", syncDuration=", ", commandIssueDuration=", sb);
        sb.append(j7);
        ij0.u(j8, ", swapBuffersDuration=", ", totalDuration=", sb);
        sb.append(j9);
        sb.append(", firstDrawFrame=");
        sb.append(z);
        ij0.u(j10, ", intendedVsyncTimestamp=", ", vsyncTimestamp=", sb);
        sb.append(j11);
        ij0.u(j12, ", gpuDuration=", ", deadline=", sb);
        sb.append(j13);
        sb.append(", displayRefreshRate=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
}
