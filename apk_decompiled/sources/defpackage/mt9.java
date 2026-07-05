package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mt9 {
    public final b79 a;
    public final boolean b;

    public mt9(b79 b79Var, boolean z) {
        this.a = b79Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt9)) {
            return false;
        }
        mt9 mt9Var = (mt9) obj;
        return this.a.equals(mt9Var.a) && this.b == mt9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LatexMatch(range=" + this.a + ", isBlock=" + this.b + ")";
    }
}
