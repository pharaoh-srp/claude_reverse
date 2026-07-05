package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p26 {
    public final String a;
    public final String b;
    public final String c;
    public final t26 d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final Integer j;
    public final fea k;
    public final int l;
    public final Integer m;
    public final Boolean n;

    public p26(String str, String str2, String str3, t26 t26Var, String str4, String str5, String str6, String str7, String str8, Integer num, fea feaVar, int i, Integer num2, Boolean bool) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        t26Var.getClass();
        str4.getClass();
        ij0.z(str5, str6, str7, str8);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = t26Var;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = num;
        this.k = feaVar;
        this.l = i;
        this.m = num2;
        this.n = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p26)) {
            return false;
        }
        p26 p26Var = (p26) obj;
        return x44.r(this.a, p26Var.a) && x44.r(this.b, p26Var.b) && x44.r(this.c, p26Var.c) && this.d == p26Var.d && x44.r(this.e, p26Var.e) && x44.r(this.f, p26Var.f) && x44.r(this.g, p26Var.g) && x44.r(this.h, p26Var.h) && x44.r(this.i, p26Var.i) && x44.r(this.j, p26Var.j) && this.k.equals(p26Var.k) && this.l == p26Var.l && x44.r(this.m, p26Var.m) && x44.r(this.n, p26Var.n);
    }

    public final int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l(kgh.l(kgh.l((this.d.hashCode() + kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        Integer num = this.j;
        int iC = vb7.c(this.l, (this.k.hashCode() + ((iL + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31);
        Integer num2 = this.m;
        int iHashCode = (iC + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.n;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("DeviceInfo(deviceName=", this.a, ", deviceBrand=", this.b, ", deviceModel=");
        sbR.append(this.c);
        sbR.append(", deviceType=");
        sbR.append(this.d);
        sbR.append(", deviceBuildId=");
        kgh.u(sbR, this.e, ", osName=", this.f, ", osMajorVersion=");
        kgh.u(sbR, this.g, ", osVersion=", this.h, ", architecture=");
        sbR.append(this.i);
        sbR.append(", numberOfDisplays=");
        sbR.append(this.j);
        sbR.append(", localeInfo=");
        sbR.append(this.k);
        sbR.append(", logicalCpuCount=");
        sbR.append(this.l);
        sbR.append(", totalRam=");
        sbR.append(this.m);
        sbR.append(", isLowRam=");
        sbR.append(this.n);
        sbR.append(")");
        return sbR.toString();
    }
}
