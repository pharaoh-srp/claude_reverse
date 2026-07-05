package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p71 implements s71 {
    public final r71 b;

    public p71(r71 r71Var) {
        this.b = r71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p71) && this.b == ((p71) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Disabled(reason=" + this.b + ")";
    }
}
