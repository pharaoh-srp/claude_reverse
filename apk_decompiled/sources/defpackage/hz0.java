package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hz0 extends ty0 {
    public final String a;
    public final String b;
    public final String c;

    public hz0(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz0)) {
            return false;
        }
        hz0 hz0Var = (hz0) obj;
        return x44.r(this.a, hz0Var.a) && this.b.equals(hz0Var.b) && this.c.equals(hz0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ij0.m(kgh.r("AstLinkReferenceDefinition(label=", this.a, ", destination=", this.b, ", title="), this.c, ")");
    }
}
