package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lj5 {
    public final rk5 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final wph j;
    public final ghd k;
    public final a1c l;
    public final p26 m;
    public final xmi n;
    public final l4i o;
    public final String p;
    public final Map q;

    public lj5(rk5 rk5Var, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, wph wphVar, ghd ghdVar, a1c a1cVar, p26 p26Var, xmi xmiVar, l4i l4iVar, String str8, Map map) {
        rk5Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        a1cVar.getClass();
        xmiVar.getClass();
        l4iVar.getClass();
        this.a = rk5Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = wphVar;
        this.k = ghdVar;
        this.l = a1cVar;
        this.m = p26Var;
        this.n = xmiVar;
        this.o = l4iVar;
        this.p = str8;
        this.q = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj5)) {
            return false;
        }
        lj5 lj5Var = (lj5) obj;
        return this.a == lj5Var.a && x44.r(this.b, lj5Var.b) && x44.r(this.c, lj5Var.c) && x44.r(this.d, lj5Var.d) && x44.r(this.e, lj5Var.e) && this.f == lj5Var.f && x44.r(this.g, lj5Var.g) && x44.r(this.h, lj5Var.h) && x44.r(this.i, lj5Var.i) && this.j.equals(lj5Var.j) && this.k.equals(lj5Var.k) && x44.r(this.l, lj5Var.l) && this.m.equals(lj5Var.m) && x44.r(this.n, lj5Var.n) && this.o == lj5Var.o && x44.r(this.p, lj5Var.p) && this.q.equals(lj5Var.q);
    }

    public final int hashCode() {
        int iHashCode = (this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + fsh.p((this.j.hashCode() + kgh.l(kgh.l(kgh.l(vb7.c(this.f, kgh.l(kgh.l(kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i)) * 31, 31, this.k.a)) * 31)) * 31)) * 961)) * 31;
        String str = this.p;
        return this.q.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DatadogContext(site=");
        sb.append(this.a);
        sb.append(", clientToken=");
        sb.append(this.b);
        sb.append(", service=");
        kgh.u(sb, this.c, ", env=", this.d, ", version=");
        sb.append(this.e);
        sb.append(", versionCode=");
        sb.append(this.f);
        sb.append(", variant=");
        kgh.u(sb, this.g, ", source=", this.h, ", sdkVersion=");
        sb.append(this.i);
        sb.append(", time=");
        sb.append(this.j);
        sb.append(", processInfo=");
        sb.append(this.k);
        sb.append(", networkInfo=");
        sb.append(this.l);
        sb.append(", deviceInfo=");
        sb.append(this.m);
        sb.append(", userInfo=");
        sb.append(this.n);
        sb.append(", accountInfo=null, trackingConsent=");
        sb.append(this.o);
        sb.append(", appBuildId=");
        sb.append(this.p);
        sb.append(", featuresContext=");
        return qy1.i(sb, this.q, ")");
    }
}
