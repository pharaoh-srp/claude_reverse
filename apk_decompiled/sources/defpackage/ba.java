package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ba {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;

    public ba(String str, String str2, String str3, String str4, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return this.a.equals(baVar.a) && x44.r(this.b, baVar.b) && x44.r(this.c, baVar.c) && x44.r(this.d, baVar.d) && x44.r(this.e, baVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iL = kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        int iHashCode2 = (iL + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("ActionEventView(id=", this.a, ", referrer=", this.b, ", url=");
        kgh.u(sbR, this.c, ", name=", this.d, ", inForeground=");
        return qy1.h(sbR, this.e, ")");
    }
}
