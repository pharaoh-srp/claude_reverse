package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class cvf implements fvf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Map g;
    public final boolean h;

    public cvf(String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z) {
        str.getClass();
        str3.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = map;
        this.h = z;
    }

    public final String a() {
        return this.f;
    }

    public final boolean b() {
        return this.h;
    }

    public final Map c() {
        return this.g;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvf)) {
            return false;
        }
        cvf cvfVar = (cvf) obj;
        return x44.r(this.a, cvfVar.a) && this.b.equals(cvfVar.b) && x44.r(this.c, cvfVar.c) && x44.r(this.d, cvfVar.d) && x44.r(this.e, cvfVar.e) && x44.r(this.f, cvfVar.f) && x44.r(this.g, cvfVar.g) && this.h == cvfVar.h;
    }

    public final int hashCode() {
        int iL = kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(this.h) + ebh.g((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ToolApprovalRequired(requestId=", this.a, ", toolUseId=", this.b, ", toolName=");
        kgh.u(sbR, this.c, ", displayName=", this.d, ", title=");
        kgh.u(sbR, this.e, ", description=", this.f, ", input=");
        sbR.append(this.g);
        sbR.append(", hasPermissionSuggestions=");
        sbR.append(this.h);
        sbR.append(")");
        return sbR.toString();
    }
}
