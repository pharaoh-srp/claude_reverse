package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oz0 extends ty0 {
    public final int a;
    public final char b;

    public oz0(int i, char c) {
        this.a = i;
        this.b = c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz0)) {
            return false;
        }
        oz0 oz0Var = (oz0) obj;
        return this.a == oz0Var.a && this.b == oz0Var.b;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AstOrderedList(startNumber=" + this.a + ", delimiter=" + this.b + ")";
    }
}
