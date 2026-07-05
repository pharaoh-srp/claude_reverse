package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ixa implements jxa {
    public final String a;
    public final boolean b;

    public ixa(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixa)) {
            return false;
        }
        ixa ixaVar = (ixa) obj;
        return this.a.equals(ixaVar.a) && this.b == ixaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebView(html=" + this.a + ", prefersBorder=" + this.b + ")";
    }
}
