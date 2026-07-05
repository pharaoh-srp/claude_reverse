package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zc9 {
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;

    public zc9(int i, long j, long j2, int i2, int i3, int i4, int i5, long j3, int i6, int i7, int i8) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = j3;
        this.i = i6;
        this.j = i7;
        this.k = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc9)) {
            return false;
        }
        zc9 zc9Var = (zc9) obj;
        return this.a == zc9Var.a && this.b == zc9Var.b && this.c == zc9Var.c && this.d == zc9Var.d && this.e == zc9Var.e && this.f == zc9Var.f && this.g == zc9Var.g && this.h == zc9Var.h && this.i == zc9Var.i && this.j == zc9Var.j && this.k == zc9Var.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + vb7.c(this.j, vb7.c(this.i, vb7.e(vb7.c(this.g, vb7.c(this.f, vb7.c(this.e, vb7.c(this.d, vb7.e(vb7.e(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31), 31), 31, this.h), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JankSnapshot(totalFrames=");
        sb.append(this.a);
        sb.append(", totalUiMs=");
        sb.append(this.b);
        ij0.u(this.c, ", maxUiMs=", ", framesOver16ms=", sb);
        qy1.k(this.d, this.e, ", framesOver25ms=", ", framesOver700ms=", sb);
        qy1.k(this.f, this.g, ", framesWithOverrun=", ", totalHitchTimeMs=", sb);
        sb.append(this.h);
        sb.append(", hitchMinor=");
        sb.append(this.i);
        ij0.s(this.j, this.k, ", hitchMajor=", ", hitchSevere=", sb);
        sb.append(")");
        return sb.toString();
    }
}
