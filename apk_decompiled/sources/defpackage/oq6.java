package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oq6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public oq6(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq6)) {
            return false;
        }
        oq6 oq6Var = (oq6) obj;
        return x44.r(this.a, oq6Var.a) && x44.r(this.b, oq6Var.b) && x44.r(this.c, oq6Var.c) && x44.r(this.d, oq6Var.d) && x44.r(this.e, oq6Var.e) && x44.r(this.f, oq6Var.f) && x44.r(this.g, oq6Var.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("EnvManagerInitStepExtra(stepId=", this.a, ", stepStatus=", this.b, ", stepDetail=");
        kgh.u(sbR, this.c, ", stepLabel=", this.d, ", sessionMode=");
        kgh.u(sbR, this.e, ", output=", this.f, ", expectedSteps=");
        return ij0.m(sbR, this.g, ")");
    }
}
