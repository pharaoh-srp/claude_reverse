package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bxc {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    public bxc(String str, String str2, int i, String str3, String str4, long j, long j2, String str5) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxc)) {
            return false;
        }
        bxc bxcVar = (bxc) obj;
        return this.a.equals(bxcVar.a) && x44.r(this.b, bxcVar.b) && this.c == bxcVar.c && x44.r(this.d, bxcVar.d) && x44.r(this.e, bxcVar.e) && this.f == bxcVar.f && this.g == bxcVar.g && this.h.equals(bxcVar.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iC = vb7.c(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.d;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return this.h.hashCode() + vb7.e(vb7.e((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("TelemetryData(startReason=", this.a, ", appStartInfo=", this.b, ", errorCode=");
        sbR.append(this.c);
        sbR.append(", errorMessage=");
        sbR.append(this.d);
        sbR.append(", filePath=");
        sbR.append(this.e);
        sbR.append(", duration=");
        sbR.append(this.f);
        ij0.u(this.g, ", resultCallbackDelayMs=", ", stopReason=", sbR);
        return ij0.m(sbR, this.h, ")");
    }
}
