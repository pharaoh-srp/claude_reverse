package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bde implements zpf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public bde(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    @Override // defpackage.zpf
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bde)) {
            return false;
        }
        bde bdeVar = (bde) obj;
        return x44.r(this.a, bdeVar.a) && this.b.equals(bdeVar.b) && this.c.equals(bdeVar.c) && x44.r(this.d, bdeVar.d) && x44.r(this.e, bdeVar.e);
    }

    @Override // defpackage.zpf
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.zpf
    public final String getType() {
        return "refusal_fallback_notice";
    }

    public final int hashCode() {
        int iL = kgh.l(kgh.l(this.a.hashCode() * 961, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("RefusalFallbackNotice(id=", this.a, ", parentAgentId=null, originalModel=", this.b, ", fallbackModel=");
        kgh.u(sbR, this.c, ", category=", this.d, ", explanation=");
        return ij0.m(sbR, this.e, ")");
    }
}
