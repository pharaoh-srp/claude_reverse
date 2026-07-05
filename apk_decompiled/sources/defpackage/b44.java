package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b44 {
    public final z34 a;
    public final a44 b;

    public b44(z34 z34Var, a44 a44Var) {
        this.a = z34Var;
        this.b = a44Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b44)) {
            return false;
        }
        b44 b44Var = (b44) obj;
        return this.a.equals(b44Var.a) && this.b.equals(b44Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CollapsedBlockRowState(icon=" + this.a + ", message=" + this.b + ")";
    }
}
