package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class qo implements so {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Map g;
    public final boolean h;
    public final boolean i;

    public qo(String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z, int i) {
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        boolean z2 = (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0;
        str.getClass();
        str2.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = map;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo)) {
            return false;
        }
        qo qoVar = (qo) obj;
        return x44.r(this.a, qoVar.a) && x44.r(this.b, qoVar.b) && this.c.equals(qoVar.c) && x44.r(this.d, qoVar.d) && x44.r(this.e, qoVar.e) && x44.r(this.f, qoVar.f) && x44.r(this.g, qoVar.g) && this.h == qoVar.h && this.i == qoVar.i;
    }

    public final int hashCode() {
        int iL = kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return Boolean.hashCode(this.i) + fsh.p(ebh.g((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ToolApprovalRequired(requestId=", this.a, ", toolUseId=", this.b, ", toolName=");
        kgh.u(sbR, this.c, ", displayName=", this.d, ", title=");
        kgh.u(sbR, this.e, ", description=", this.f, ", input=");
        sbR.append(this.g);
        sbR.append(", hasPermissionSuggestions=");
        sbR.append(this.h);
        sbR.append(", isElicitation=");
        return sq6.v(")", sbR, this.i);
    }
}
