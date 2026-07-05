package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qw4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public qw4(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw4)) {
            return false;
        }
        qw4 qw4Var = (qw4) obj;
        return this.a.equals(qw4Var.a) && this.b.equals(qw4Var.b) && this.c.equals(qw4Var.c) && this.d.equals(qw4Var.d) && this.e.equals(qw4Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kgh.l(kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ConwayItemPalette(textPrimary=", this.a, ", textSecondary=", this.b, ", link=");
        kgh.u(sbR, this.c, ", codeBackground=", this.d, ", border=");
        return ij0.m(sbR, this.e, ")");
    }
}
