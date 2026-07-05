package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wta {
    public final String a;
    public final jz0 b;

    public wta(String str, jz0 jz0Var) {
        str.getClass();
        this.a = str;
        this.b = jz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wta)) {
            return false;
        }
        wta wtaVar = (wta) obj;
        return x44.r(this.a, wtaVar.a) && this.b.equals(wtaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MarkdownBlockGroup(source=" + this.a + ", root=" + this.b + ")";
    }
}
