package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qd0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final g8c g;
    public final xe2 h;
    public final od0 i;

    public qd0(String str, String str2, boolean z, String str3, String str4, String str5, g8c g8cVar, xe2 xe2Var, od0 od0Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = g8cVar;
        this.h = xe2Var;
        this.i = od0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd0)) {
            return false;
        }
        qd0 qd0Var = (qd0) obj;
        return this.a.equals(qd0Var.a) && this.b.equals(qd0Var.b) && this.c == qd0Var.c && x44.r(this.d, qd0Var.d) && x44.r(this.e, qd0Var.e) && x44.r(this.f, qd0Var.f) && this.g == qd0Var.g && x44.r(this.h, qd0Var.h) && x44.r(this.i, qd0Var.i);
    }

    public final int hashCode() {
        int iP = fsh.p(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iP + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (this.g.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        xe2 xe2Var = this.h;
        int iHashCode4 = (iHashCode3 + (xe2Var == null ? 0 : xe2Var.hashCode())) * 31;
        od0 od0Var = this.i;
        return iHashCode4 + (od0Var != null ? od0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("NotificationData(title=", this.a, ", message=", this.b, ", isSilent=");
        sbR.append(this.c);
        sbR.append(", payload=");
        sbR.append(this.d);
        sbR.append(", uri=");
        kgh.u(sbR, this.e, ", itbl=", this.f, ", featureCategory=");
        sbR.append(this.g);
        sbR.append(", ccr=");
        sbR.append(this.h);
        sbR.append(", sender=");
        sbR.append(this.i);
        sbR.append(")");
        return sbR.toString();
    }
}
