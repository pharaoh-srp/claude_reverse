package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q01 {
    public final yw8 a;
    public final jx8 b;
    public final p01 c;

    public q01(yw8 yw8Var, jx8 jx8Var, p01 p01Var) {
        this.a = yw8Var;
        this.b = jx8Var;
        this.c = p01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q01)) {
            return false;
        }
        q01 q01Var = (q01) obj;
        if (!x44.r(this.a, q01Var.a)) {
            return false;
        }
        p01 p01Var = q01Var.c;
        p01 p01Var2 = this.c;
        return x44.r(p01Var2, p01Var) && p01Var2.a(this.b, q01Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        p01 p01Var = this.c;
        return p01Var.b(this.b) + ((p01Var.hashCode() + iHashCode) * 31);
    }

    public final String toString() {
        return "Input(imageLoader=" + this.a + ", request=" + this.b + ", modelEqualityDelegate=" + this.c + ")";
    }
}
