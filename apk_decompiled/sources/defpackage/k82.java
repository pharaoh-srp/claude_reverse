package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class k82 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public k82(String str, String str2, boolean z, boolean z2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k82)) {
            return false;
        }
        k82 k82Var = (k82) obj;
        return x44.r(this.a, k82Var.a) && x44.r(this.b, k82Var.b) && x44.r(this.c, k82Var.c) && this.d == k82Var.d && x44.r(this.e, k82Var.e) && this.f == k82Var.f;
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iP = fsh.p((iL + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((iP + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("CalendarSelection(id=", this.a, ", name=", this.b, ", accountName=");
        gid.t(sbR, this.c, ", isSelected=", this.d, ", color=");
        sbR.append(this.e);
        sbR.append(", isPrimary=");
        sbR.append(this.f);
        sbR.append(")");
        return sbR.toString();
    }
}
