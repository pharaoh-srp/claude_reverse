package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nw4 {
    public final String a;
    public final lsk b;

    public nw4(String str, lsk lskVar) {
        this.a = str;
        this.b = lskVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw4)) {
            return false;
        }
        nw4 nw4Var = (nw4) obj;
        return this.a.equals(nw4Var.a) && this.b.equals(nw4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ConwayHtmlSegment(html=" + this.a + ", kind=" + this.b + ")";
    }
}
