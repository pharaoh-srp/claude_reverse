package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class sxe {
    public static final String p;
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final long k;
    public final boolean l;
    public final int m;
    public final int n;
    public final int o;

    static {
        String string = new UUID(0L, 0L).toString();
        string.getClass();
        p = string;
    }

    public sxe(String str, String str2, boolean z, String str3, String str4, String str5, String str6, int i, int i2, int i3, String str7, String str8, long j, long j2, boolean z2) {
        str.getClass();
        str2.getClass();
        sq6.a(i);
        sq6.a(i2);
        sq6.a(i3);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.h = str7;
        this.i = str8;
        this.j = j;
        this.k = j2;
        this.l = z2;
    }

    public static sxe a(sxe sxeVar, String str, boolean z, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, String str7, long j, long j2, boolean z2, int i4) {
        String str8 = sxeVar.a;
        String str9 = (i4 & 2) != 0 ? sxeVar.b : str;
        boolean z3 = (i4 & 4) != 0 ? sxeVar.c : z;
        String str10 = (i4 & 8) != 0 ? sxeVar.d : str2;
        String str11 = (i4 & 16) != 0 ? sxeVar.e : str3;
        String str12 = (i4 & 32) != 0 ? sxeVar.f : str4;
        String str13 = (i4 & 64) != 0 ? sxeVar.g : str5;
        int i5 = (i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? sxeVar.m : i;
        int i6 = (i4 & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? sxeVar.n : i2;
        int i7 = (i4 & 512) != 0 ? sxeVar.o : i3;
        String str14 = (i4 & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? sxeVar.h : str6;
        String str15 = (i4 & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? sxeVar.i : str7;
        long j3 = (i4 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? sxeVar.j : j;
        String str16 = str9;
        long j4 = (i4 & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? sxeVar.k : j2;
        boolean z4 = (i4 & 16384) != 0 ? sxeVar.l : z2;
        sxeVar.getClass();
        str8.getClass();
        str16.getClass();
        sq6.a(i5);
        sq6.a(i6);
        sq6.a(i7);
        return new sxe(str8, str16, z3, str10, str11, str12, str13, i5, i6, i7, str14, str15, j3, j4, z4);
    }

    public final Map b() {
        return sta.h0(new cpc("application_id", this.a), new cpc("session_id", this.b), new cpc("session_active", Boolean.valueOf(this.c)), new cpc("session_state", grc.b(this.m)), new cpc("session_start_reason", grc.a(this.n)), new cpc("view_id", this.d), new cpc("view_name", this.e), new cpc("view_url", this.f), new cpc("view_type", grc.c(this.o)), new cpc("action_id", this.g), new cpc("synthetics_test_id", this.h), new cpc("synthetics_result_id", this.i), new cpc("view_timestamp", Long.valueOf(this.j)), new cpc("view_has_replay", Boolean.valueOf(this.l)), new cpc("view_timestamp_offset", Long.valueOf(this.k)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxe)) {
            return false;
        }
        sxe sxeVar = (sxe) obj;
        return x44.r(this.a, sxeVar.a) && x44.r(this.b, sxeVar.b) && this.c == sxeVar.c && x44.r(this.d, sxeVar.d) && x44.r(this.e, sxeVar.e) && x44.r(this.f, sxeVar.f) && x44.r(this.g, sxeVar.g) && this.m == sxeVar.m && this.n == sxeVar.n && this.o == sxeVar.o && x44.r(this.h, sxeVar.h) && x44.r(this.i, sxeVar.i) && this.j == sxeVar.j && this.k == sxeVar.k && this.l == sxeVar.l;
    }

    public final int hashCode() {
        int iP = fsh.p(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iP + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iC = qy1.c(this.o, qy1.c(this.n, qy1.c(this.m, (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31), 31);
        String str5 = this.h;
        int iHashCode4 = (iC + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        return Boolean.hashCode(this.l) + vb7.e(vb7.e((iHashCode4 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        String str;
        StringBuilder sbR = kgh.r("RumContext(applicationId=", this.a, ", sessionId=", this.b, ", isSessionActive=");
        sbR.append(this.c);
        sbR.append(", viewId=");
        sbR.append(this.d);
        sbR.append(", viewName=");
        kgh.u(sbR, this.e, ", viewUrl=", this.f, ", actionId=");
        sbR.append(this.g);
        sbR.append(", sessionState=");
        int i = this.m;
        sbR.append(i != 1 ? i != 2 ? i != 3 ? "null" : "EXPIRED" : "TRACKED" : "NOT_TRACKED");
        sbR.append(", sessionStartReason=");
        switch (this.n) {
            case 1:
                str = "USER_APP_LAUNCH";
                break;
            case 2:
                str = "INACTIVITY_TIMEOUT";
                break;
            case 3:
                str = "MAX_DURATION";
                break;
            case 4:
                str = "BACKGROUND_LAUNCH";
                break;
            case 5:
                str = "PREWARM";
                break;
            case 6:
                str = "FROM_NON_INTERACTIVE_SESSION";
                break;
            case 7:
                str = "EXPLICIT_STOP";
                break;
            default:
                str = "null";
                break;
        }
        sbR.append(str);
        sbR.append(", viewType=");
        int i2 = this.o;
        sbR.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "APPLICATION_LAUNCH" : "BACKGROUND" : "FOREGROUND" : "NONE");
        sbR.append(", syntheticsTestId=");
        kgh.u(sbR, this.h, ", syntheticsResultId=", this.i, ", viewTimestamp=");
        sbR.append(this.j);
        ij0.u(this.k, ", viewTimestampOffset=", ", hasReplay=", sbR);
        return sq6.v(")", sbR, this.l);
    }
}
