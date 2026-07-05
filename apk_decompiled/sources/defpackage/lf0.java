package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lf0 implements nf0 {
    public final int a;
    public final bj3 b;

    public lf0(int i, bj3 bj3Var) {
        this.a = i;
        this.b = bj3Var;
    }

    public final int a() {
        return this.a;
    }

    public final bj3 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf0)) {
            return false;
        }
        lf0 lf0Var = (lf0) obj;
        return this.a == lf0Var.a && this.b.equals(lf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Error(code=" + this.a + ", error=" + this.b + ")";
    }
}
