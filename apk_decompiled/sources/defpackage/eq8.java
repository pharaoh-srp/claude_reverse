package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eq8 {
    public final String a;
    public final String b;

    public eq8(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq8)) {
            return false;
        }
        eq8 eq8Var = (eq8) obj;
        return x44.r(this.a, eq8Var.a) && this.b.equals(eq8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ij0.l("HtmlPreviewTarget(fileName=", this.a, ", contentsUrl=", this.b, ")");
    }
}
