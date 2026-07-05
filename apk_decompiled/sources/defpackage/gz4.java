package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gz4 {
    public final String a;
    public final iz4 b;

    public gz4(String str, iz4 iz4Var) {
        this.a = str;
        this.b = iz4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz4)) {
            return false;
        }
        gz4 gz4Var = (gz4) obj;
        return this.a.equals(gz4Var.a) && this.b.equals(gz4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Entry(sourceHtml=" + this.a + ", result=" + this.b + ")";
    }
}
