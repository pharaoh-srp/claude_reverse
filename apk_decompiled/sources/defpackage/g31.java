package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g31 implements j31 {
    public final h21 b;

    public g31(h21 h21Var) {
        this.b = h21Var;
    }

    public final h21 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g31) && this.b == ((g31) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Reject(reason=" + this.b + ")";
    }
}
