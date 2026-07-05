package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class i6b extends ppk {
    public final s41 b;

    public i6b(s41 s41Var) {
        s41Var.getClass();
        this.b = s41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6b) && x44.r(this.b, ((i6b) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Encode(target=" + this.b + ")";
    }
}
