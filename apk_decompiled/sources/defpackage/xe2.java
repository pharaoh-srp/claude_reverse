package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xe2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public xe2(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe2)) {
            return false;
        }
        xe2 xe2Var = (xe2) obj;
        return this.a.equals(xe2Var.a) && x44.r(this.b, xe2Var.b) && x44.r(this.c, xe2Var.c) && x44.r(this.d, xe2Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return vb7.t(kgh.r("CcrPermissionPrompt(requestId=", this.a, ", toolUseId=", this.b, ", toolName="), this.c, ", command=", this.d, ")");
    }
}
