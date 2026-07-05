package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uy0 extends ty0 {
    public final String a;
    public final boolean b;

    public uy0(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy0)) {
            return false;
        }
        uy0 uy0Var = (uy0) obj;
        return x44.r(this.a, uy0Var.a) && this.b == uy0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AstDisplayMath(literal=" + this.a + ", isClosed=" + this.b + ")";
    }
}
