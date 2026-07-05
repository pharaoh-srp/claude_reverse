package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xs6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;

    public xs6(String str, String str2, String str3, String str4, Boolean bool) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = bool;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.r("id", this.a);
        String str = this.b;
        if (str != null) {
            qh9Var.r("referrer", str);
        }
        qh9Var.r("url", this.c);
        String str2 = this.d;
        if (str2 != null) {
            qh9Var.r("name", str2);
        }
        Boolean bool = this.e;
        if (bool != null) {
            qh9Var.q("in_foreground", bool);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs6)) {
            return false;
        }
        xs6 xs6Var = (xs6) obj;
        return x44.r(this.a, xs6Var.a) && x44.r(this.b, xs6Var.b) && x44.r(this.c, xs6Var.c) && x44.r(this.d, xs6Var.d) && x44.r(this.e, xs6Var.e);
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
        StringBuilder sbR = kgh.r("ErrorEventView(id=", this.a, ", referrer=", this.b, ", url=");
        kgh.u(sbR, this.c, ", name=", this.d, ", inForeground=");
        return qy1.h(sbR, this.e, ")");
    }

    public /* synthetic */ xs6(String str, String str2, int i, String str3, String str4) {
        this(str, (i & 2) != 0 ? null : str2, str3, str4, (Boolean) null);
    }
}
