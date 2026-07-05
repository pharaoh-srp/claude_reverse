package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dg4 {
    public static final bg4 i;
    public final bg4 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final Map g;
    public final String h;

    static {
        sq6.a(2);
        pb1 pb1Var = new pb1();
        i = new bg4(false, nm6.E, 2, 2, ql8.F, rk5.G, 2, pb1Var);
    }

    public dg4(bg4 bg4Var, String str, String str2, String str3, String str4, boolean z, Map map, String str5) {
        bg4Var.getClass();
        this.a = bg4Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = map;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg4)) {
            return false;
        }
        dg4 dg4Var = (dg4) obj;
        return x44.r(this.a, dg4Var.a) && this.b.equals(dg4Var.b) && this.c.equals(dg4Var.c) && this.d.equals(dg4Var.d) && x44.r(this.e, dg4Var.e) && this.f == dg4Var.f && this.g.equals(dg4Var.g) && x44.r(this.h, dg4Var.h);
    }

    public final int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iG = ebh.g(fsh.p((iL + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g);
        String str2 = this.h;
        return iG + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(coreConfig=");
        sb.append(this.a);
        sb.append(", clientToken=");
        sb.append(this.b);
        sb.append(", env=");
        kgh.u(sb, this.c, ", variant=", this.d, ", service=");
        gid.t(sb, this.e, ", crashReportsEnabled=", this.f, ", additionalConfig=");
        sb.append(this.g);
        sb.append(", version=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
