package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a2h {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public a2h(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2h)) {
            return false;
        }
        a2h a2hVar = (a2h) obj;
        return x44.r(this.a, a2hVar.a) && x44.r(this.b, a2hVar.b) && this.c.equals(a2hVar.c) && this.d.equals(a2hVar.d) && x44.r(this.e, a2hVar.e) && x44.r(this.f, a2hVar.f);
    }

    public final int hashCode() {
        int iL = kgh.l(kgh.l(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("TTIDRumContext(applicationId=", this.a, ", sessionId=", this.b, ", vitalId=");
        kgh.u(sbR, this.c, ", vitalName=", this.d, ", viewId=");
        return vb7.t(sbR, this.e, ", viewName=", this.f, ")");
    }
}
