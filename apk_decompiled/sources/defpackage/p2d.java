package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class p2d implements Serializable {
    public boolean E;
    public boolean H;
    public boolean J;
    public boolean L;
    public int F = 0;
    public long G = 0;
    public String I = "";
    public boolean K = false;
    public int M = 1;
    public final String N = "";
    public final String P = "";
    public final int O = 5;

    public final int a() {
        return this.F;
    }

    public final String b() {
        return this.I;
    }

    public final long c() {
        return this.G;
    }

    public final int d() {
        return this.M;
    }

    public final String e() {
        return this.N;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p2d)) {
            return false;
        }
        p2d p2dVar = (p2d) obj;
        if (this == p2dVar) {
            return true;
        }
        return this.F == p2dVar.F && this.G == p2dVar.G && this.I.equals(p2dVar.I) && this.K == p2dVar.K && this.M == p2dVar.M && this.N.equals(p2dVar.N) && this.O == p2dVar.O && this.P.equals(p2dVar.P);
    }

    public final boolean f() {
        return this.E;
    }

    public final boolean g() {
        return this.H;
    }

    public final boolean h() {
        return this.K;
    }

    public final int hashCode() {
        return kgh.l(qy1.c(this.O, kgh.l((((kgh.l((Long.valueOf(this.G).hashCode() + ((2173 + this.F) * 53)) * 53, 53, this.I) + (this.K ? 1231 : 1237)) * 53) + this.M) * 53, 53, this.N), 53), 53, this.P) + 1237;
    }

    public final void i(int i) {
        this.E = true;
        this.F = i;
    }

    public final void j(String str) {
        this.H = true;
        this.I = str;
    }

    public final void k() {
        this.J = true;
        this.K = true;
    }

    public final void l(long j) {
        this.G = j;
    }

    public final void m(int i) {
        this.L = true;
        this.M = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.F);
        sb.append(" National Number: ");
        sb.append(this.G);
        if (this.J && this.K) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.L) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.M);
        }
        if (this.H) {
            sb.append(" Extension: ");
            sb.append(this.I);
        }
        return sb.toString();
    }
}
