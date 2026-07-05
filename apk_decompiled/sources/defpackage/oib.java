package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oib {
    public final bj3 a;

    public oib(bj3 bj3Var) {
        this.a = bj3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oib) && this.a.equals(((oib) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
