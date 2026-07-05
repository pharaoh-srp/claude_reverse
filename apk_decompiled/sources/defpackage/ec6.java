package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ec6 {
    public final int a;
    public final int b;

    public ec6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec6)) {
            return false;
        }
        ec6 ec6Var = (ec6) obj;
        return this.a == ec6Var.a && this.b == ec6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return vb7.q("DragEventUniqueMimeCounts(supportedCount=", ", unsupportedCount=", this.a, this.b, ")");
    }
}
