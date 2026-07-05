package defpackage;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vs6 {
    public final String a;
    public String b;
    public final int c;
    public String d;
    public final List e;
    public final Boolean f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    public final int l;
    public final ft6 m;
    public final List n;
    public final List o;
    public final Boolean p;
    public final at6 q;
    public final qs6 r;
    public final Long s;

    public /* synthetic */ vs6(String str, String str2, int i, String str3, Boolean bool, String str4, String str5, int i2, int i3, ft6 ft6Var, ArrayList arrayList, Long l, int i4) {
        this(str, str2, i, str3, null, bool, (i4 & 64) != 0 ? null : str4, str5, i2, 0, null, i3, (i4 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : ft6Var, (i4 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : arrayList, null, null, null, null, (i4 & 262144) != 0 ? null : l);
    }

    public final Boolean a() {
        return this.f;
    }

    public final qh9 b() {
        qh9 qh9Var = new qh9();
        String str = this.a;
        if (str != null) {
            qh9Var.r("id", str);
        }
        qh9Var.r("message", this.b);
        qh9Var.o("source", new vh9(ms6.p(this.c)));
        String str2 = this.d;
        if (str2 != null) {
            qh9Var.r("stack", str2);
        }
        List<hs6> list = this.e;
        if (list != null) {
            ig9 ig9Var = new ig9(list.size());
            for (hs6 hs6Var : list) {
                hs6Var.getClass();
                qh9 qh9Var2 = new qh9();
                qh9Var2.r("message", hs6Var.a);
                String str3 = hs6Var.b;
                if (str3 != null) {
                    qh9Var2.r("type", str3);
                }
                String str4 = hs6Var.c;
                if (str4 != null) {
                    qh9Var2.r("stack", str4);
                }
                qh9Var2.o("source", new vh9(ms6.p(hs6Var.d)));
                ig9Var.o(qh9Var2);
            }
            qh9Var.o("causes", ig9Var);
        }
        Boolean bool = this.f;
        if (bool != null) {
            qh9Var.q("is_crash", bool);
        }
        String str5 = this.g;
        if (str5 != null) {
            qh9Var.r("fingerprint", str5);
        }
        String str6 = this.h;
        if (str6 != null) {
            qh9Var.r("type", str6);
        }
        int i = this.i;
        if (i != 0) {
            qh9Var.o("category", new vh9(qy1.b(i)));
        }
        int i2 = this.j;
        if (i2 != 0) {
            qh9Var.o("handling", new vh9(ms6.q(i2)));
        }
        String str7 = this.k;
        if (str7 != null) {
            qh9Var.r("handling_stack", str7);
        }
        int i3 = this.l;
        if (i3 != 0) {
            qh9Var.o("source_type", new vh9(ms6.j(i3)));
        }
        ft6 ft6Var = this.m;
        if (ft6Var != null) {
            qh9 qh9Var3 = new qh9();
            qh9Var3.o(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, new vh9(ms6.r(ft6Var.a)));
            qh9Var3.p(Long.valueOf(ft6Var.b), "status_code");
            qh9Var3.r("url", ft6Var.c);
            et6 et6Var = ft6Var.d;
            if (et6Var != null) {
                qh9 qh9Var4 = new qh9();
                String str8 = et6Var.a;
                if (str8 != null) {
                    qh9Var4.r("domain", str8);
                }
                String str9 = et6Var.b;
                if (str9 != null) {
                    qh9Var4.r("name", str9);
                }
                int i4 = et6Var.c;
                if (i4 != 0) {
                    qh9Var4.o("type", new vh9(ms6.h(i4)));
                }
                qh9Var3.o("provider", qh9Var4);
            }
            qh9Var.o("resource", qh9Var3);
        }
        List<ht6> list2 = this.n;
        if (list2 != null) {
            ig9 ig9Var2 = new ig9(list2.size());
            for (ht6 ht6Var : list2) {
                ht6Var.getClass();
                qh9 qh9Var5 = new qh9();
                qh9Var5.r("name", ht6Var.a);
                qh9Var5.q("crashed", Boolean.valueOf(ht6Var.b));
                qh9Var5.r("stack", ht6Var.c);
                String str10 = ht6Var.d;
                if (str10 != null) {
                    qh9Var5.r("state", str10);
                }
                ig9Var2.o(qh9Var5);
            }
            qh9Var.o("threads", ig9Var2);
        }
        List<gs6> list3 = this.o;
        if (list3 != null) {
            ig9 ig9Var3 = new ig9(list3.size());
            for (gs6 gs6Var : list3) {
                gs6Var.getClass();
                qh9 qh9Var6 = new qh9();
                qh9Var6.r("uuid", gs6Var.a);
                qh9Var6.r("name", gs6Var.b);
                qh9Var6.q("is_system", Boolean.valueOf(gs6Var.c));
                String str11 = gs6Var.d;
                if (str11 != null) {
                    qh9Var6.r("load_address", str11);
                }
                String str12 = gs6Var.e;
                if (str12 != null) {
                    qh9Var6.r("max_address", str12);
                }
                String str13 = gs6Var.f;
                if (str13 != null) {
                    qh9Var6.r("arch", str13);
                }
                ig9Var3.o(qh9Var6);
            }
            qh9Var.o("binary_images", ig9Var3);
        }
        Boolean bool2 = this.p;
        if (bool2 != null) {
            qh9Var.q("was_truncated", bool2);
        }
        at6 at6Var = this.q;
        if (at6Var != null) {
            qh9 qh9Var7 = new qh9();
            String str14 = at6Var.a;
            if (str14 != null) {
                qh9Var7.r("code_type", str14);
            }
            String str15 = at6Var.b;
            if (str15 != null) {
                qh9Var7.r("parent_process", str15);
            }
            String str16 = at6Var.c;
            if (str16 != null) {
                qh9Var7.r("incident_identifier", str16);
            }
            String str17 = at6Var.d;
            if (str17 != null) {
                qh9Var7.r("process", str17);
            }
            String str18 = at6Var.e;
            if (str18 != null) {
                qh9Var7.r("exception_type", str18);
            }
            String str19 = at6Var.f;
            if (str19 != null) {
                qh9Var7.r("exception_codes", str19);
            }
            String str20 = at6Var.g;
            if (str20 != null) {
                qh9Var7.r("path", str20);
            }
            qh9Var.o("meta", qh9Var7);
        }
        qs6 qs6Var = this.r;
        if (qs6Var != null) {
            qh9 qh9Var8 = new qh9();
            int i5 = qs6Var.a;
            if (i5 != 0) {
                qh9Var8.o("disposition", new vh9(ms6.k(i5)));
            }
            qh9Var.o("csp", qh9Var8);
        }
        Long l = this.s;
        if (l != null) {
            grc.A(l, qh9Var, "time_since_app_start");
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs6)) {
            return false;
        }
        vs6 vs6Var = (vs6) obj;
        return x44.r(this.a, vs6Var.a) && x44.r(this.b, vs6Var.b) && this.c == vs6Var.c && x44.r(this.d, vs6Var.d) && x44.r(this.e, vs6Var.e) && x44.r(this.f, vs6Var.f) && x44.r(this.g, vs6Var.g) && x44.r(this.h, vs6Var.h) && this.i == vs6Var.i && this.j == vs6Var.j && x44.r(this.k, vs6Var.k) && this.l == vs6Var.l && x44.r(this.m, vs6Var.m) && x44.r(this.n, vs6Var.n) && x44.r(this.o, vs6Var.o) && x44.r(this.p, vs6Var.p) && x44.r(this.q, vs6Var.q) && x44.r(this.r, vs6Var.r) && x44.r(this.s, vs6Var.s);
    }

    public final int hashCode() {
        String str = this.a;
        int iC = qy1.c(this.c, kgh.l((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
        String str2 = this.d;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        int i = this.i;
        int iF = (iHashCode5 + (i == 0 ? 0 : sq6.F(i))) * 31;
        int i2 = this.j;
        int iF2 = (iF + (i2 == 0 ? 0 : sq6.F(i2))) * 31;
        String str5 = this.k;
        int iHashCode6 = (iF2 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int i3 = this.l;
        int iF3 = (iHashCode6 + (i3 == 0 ? 0 : sq6.F(i3))) * 31;
        ft6 ft6Var = this.m;
        int iHashCode7 = (iF3 + (ft6Var == null ? 0 : ft6Var.hashCode())) * 31;
        List list2 = this.n;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.o;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool2 = this.p;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        at6 at6Var = this.q;
        int iHashCode11 = (iHashCode10 + (at6Var == null ? 0 : at6Var.hashCode())) * 31;
        qs6 qs6Var = this.r;
        int iHashCode12 = (iHashCode11 + (qs6Var == null ? 0 : qs6Var.hashCode())) * 31;
        Long l = this.s;
        return iHashCode12 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        String str;
        String str2 = this.b;
        String str3 = this.d;
        StringBuilder sbR = kgh.r("Error(id=", this.a, ", message=", str2, ", source=");
        sbR.append(ms6.C(this.c));
        sbR.append(", stack=");
        sbR.append(str3);
        sbR.append(", causes=");
        sbR.append(this.e);
        sbR.append(", isCrash=");
        sbR.append(this.f);
        sbR.append(", fingerprint=");
        kgh.u(sbR, this.g, ", type=", this.h, ", category=");
        String str4 = "null";
        switch (this.i) {
            case 1:
                str = "ANR";
                break;
            case 2:
                str = "APP_HANG";
                break;
            case 3:
                str = "EXCEPTION";
                break;
            case 4:
                str = "WATCHDOG_TERMINATION";
                break;
            case 5:
                str = "MEMORY_WARNING";
                break;
            case 6:
                str = "NETWORK";
                break;
            default:
                str = "null";
                break;
        }
        sbR.append(str);
        sbR.append(", handling=");
        int i = this.j;
        sbR.append(i != 1 ? i != 2 ? "null" : "UNHANDLED" : "HANDLED");
        sbR.append(", handlingStack=");
        sbR.append(this.k);
        sbR.append(", sourceType=");
        switch (this.l) {
            case 1:
                str4 = "ANDROID";
                break;
            case 2:
                str4 = "BROWSER";
                break;
            case 3:
                str4 = "IOS";
                break;
            case 4:
                str4 = "REACT_NATIVE";
                break;
            case 5:
                str4 = "FLUTTER";
                break;
            case 6:
                str4 = "ROKU";
                break;
            case 7:
                str4 = "NDK";
                break;
            case 8:
                str4 = "IOS_IL2CPP";
                break;
            case 9:
                str4 = "NDK_IL2CPP";
                break;
            case 10:
                str4 = "WINDOWS";
                break;
            case 11:
                str4 = "MACOS";
                break;
            case 12:
                str4 = "LINUX";
                break;
            case 13:
                str4 = "MAUI";
                break;
        }
        sbR.append(str4);
        sbR.append(", resource=");
        sbR.append(this.m);
        sbR.append(", threads=");
        sbR.append(this.n);
        sbR.append(", binaryImages=");
        sbR.append(this.o);
        sbR.append(", wasTruncated=");
        sbR.append(this.p);
        sbR.append(", meta=");
        sbR.append(this.q);
        sbR.append(", csp=");
        sbR.append(this.r);
        sbR.append(", timeSinceAppStart=");
        sbR.append(this.s);
        sbR.append(")");
        return sbR.toString();
    }

    public vs6(String str, String str2, int i, String str3, ArrayList arrayList, Boolean bool, String str4, String str5, int i2, int i3, String str6, int i4, ft6 ft6Var, List list, ArrayList arrayList2, Boolean bool2, at6 at6Var, qs6 qs6Var, Long l) {
        str2.getClass();
        if (i != 0) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = str3;
            this.e = arrayList;
            this.f = bool;
            this.g = str4;
            this.h = str5;
            this.i = i2;
            this.j = i3;
            this.k = str6;
            this.l = i4;
            this.m = ft6Var;
            this.n = list;
            this.o = arrayList2;
            this.p = bool2;
            this.q = at6Var;
            this.r = qs6Var;
            this.s = l;
            return;
        }
        throw null;
    }
}
