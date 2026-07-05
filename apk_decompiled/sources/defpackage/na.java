package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class na {
    public final String a;
    public final String b;
    public final Long c;
    public final Long d;
    public final String e;

    public na(String str, String str2, Long l, Long l2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = l2;
        this.e = str3;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        String str = this.a;
        if (str != null) {
            qh9Var.r("selector", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            qh9Var.r("composed_path_selector", str2);
        }
        Long l = this.c;
        if (l != null) {
            grc.A(l, qh9Var, "width");
        }
        Long l2 = this.d;
        if (l2 != null) {
            grc.A(l2, qh9Var, "height");
        }
        String str3 = this.e;
        if (str3 != null) {
            qh9Var.r("permanent_id", str3);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na)) {
            return false;
        }
        na naVar = (na) obj;
        return x44.r(this.a, naVar.a) && x44.r(this.b, naVar.b) && x44.r(this.c, naVar.c) && x44.r(this.d, naVar.d) && x44.r(this.e, naVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("DdActionTarget(selector=", this.a, ", composedPathSelector=", this.b, ", width=");
        sbR.append(this.c);
        sbR.append(", height=");
        sbR.append(this.d);
        sbR.append(", permanentId=");
        return ij0.m(sbR, this.e, ")");
    }
}
