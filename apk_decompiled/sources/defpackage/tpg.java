package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tpg extends wpg {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public /* synthetic */ tpg(String str, String str2, String str3, int i, String str4, long j) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, j);
    }

    public static tpg b(tpg tpgVar, String str, String str2) {
        String str3 = tpgVar.a;
        String str4 = tpgVar.d;
        long j = tpgVar.e;
        str3.getClass();
        return new tpg(str3, str, str2, str4, j);
    }

    @Override // defpackage.wpg
    public final long a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpg)) {
            return false;
        }
        tpg tpgVar = (tpg) obj;
        return x44.r(this.a, tpgVar.a) && x44.r(this.b, tpgVar.b) && x44.r(this.c, tpgVar.c) && x44.r(this.d, tpgVar.d) && this.e == tpgVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return Long.hashCode(this.e) + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("UserAttachment(label=", this.a, ", url=", this.b, ", contentType=");
        kgh.u(sbR, this.c, ", rawPath=", this.d, ", timestamp=");
        return grc.r(this.e, ")", sbR);
    }

    public tpg(String str, String str2, String str3, String str4, long j) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
    }
}
