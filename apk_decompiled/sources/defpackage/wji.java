package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wji implements yji {
    public final h21 a;
    public final boolean b;
    public final int c;
    public final vt6 d;
    public final Integer e;
    public final Integer f;

    public wji(h21 h21Var, boolean z, int i, vt6 vt6Var, Integer num, Integer num2, int i2) {
        i = (i2 & 4) != 0 ? 0 : i;
        vt6Var = (i2 & 8) != 0 ? null : vt6Var;
        num = (i2 & 16) != 0 ? null : num;
        num2 = (i2 & 32) != 0 ? null : num2;
        h21Var.getClass();
        this.a = h21Var;
        this.b = z;
        this.c = i;
        this.d = vt6Var;
        this.e = num;
        this.f = num2;
    }

    public final Integer a() {
        return this.f;
    }

    public final vt6 b() {
        return this.d;
    }

    public final h21 c() {
        return this.a;
    }

    public final int d() {
        return this.c;
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wji)) {
            return false;
        }
        wji wjiVar = (wji) obj;
        return this.a == wjiVar.a && this.b == wjiVar.b && this.c == wjiVar.c && x44.r(this.d, wjiVar.d) && x44.r(this.e, wjiVar.e) && x44.r(this.f, wjiVar.f);
    }

    public final Integer f() {
        return this.e;
    }

    public final int hashCode() {
        int iC = vb7.c(this.c, fsh.p(this.a.hashCode() * 31, 31, this.b), 31);
        vt6 vt6Var = this.d;
        int iHashCode = (iC + (vt6Var == null ? 0 : vt6Var.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Failed(reason=" + this.a + ", retryable=" + this.b + ", retryCount=" + this.c + ", message=" + this.d + ", wmRunAttempt=" + this.e + ", httpStatusCode=" + this.f + ")";
    }
}
