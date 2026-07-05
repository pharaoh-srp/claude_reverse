package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gs6 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public gs6(String str, String str2, String str3, String str4, String str5, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs6)) {
            return false;
        }
        gs6 gs6Var = (gs6) obj;
        return this.a.equals(gs6Var.a) && this.b.equals(gs6Var.b) && this.c == gs6Var.c && x44.r(this.d, gs6Var.d) && x44.r(this.e, gs6Var.e) && x44.r(this.f, gs6Var.f);
    }

    public final int hashCode() {
        int iP = fsh.p(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iP + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("BinaryImage(uuid=", this.a, ", name=", this.b, ", isSystem=");
        sbR.append(this.c);
        sbR.append(", loadAddress=");
        sbR.append(this.d);
        sbR.append(", maxAddress=");
        return vb7.t(sbR, this.e, ", arch=", this.f, ")");
    }
}
