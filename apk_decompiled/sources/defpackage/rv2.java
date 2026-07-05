package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rv2 {
    public final String a;
    public final int b;
    public final String c;

    public rv2(String str, int i, String str2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv2)) {
            return false;
        }
        rv2 rv2Var = (rv2) obj;
        return x44.r(this.a, rv2Var.a) && this.b == rv2Var.b && x44.r(this.c, rv2Var.c);
    }

    public final int hashCode() {
        int iC = vb7.c(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.m(ij0.p("ComposerContentSnapshot(text=", this.a, this.b, ", attachmentCount=", ", prefillSource="), this.c, ")");
    }
}
