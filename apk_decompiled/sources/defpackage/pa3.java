package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pa3 {
    public final String a;
    public final boolean b;

    public pa3(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa3)) {
            return false;
        }
        pa3 pa3Var = (pa3) obj;
        return x44.r(this.a, pa3Var.a) && this.b == pa3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatSearchResult(queryString=" + this.a + ", failed=" + this.b + ")";
    }
}
