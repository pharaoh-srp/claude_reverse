package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rla {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public rla(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
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
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rla)) {
            return false;
        }
        rla rlaVar = (rla) obj;
        return this.a.equals(rlaVar.a) && x44.r(this.b, rlaVar.b) && x44.r(this.c, rlaVar.c) && x44.r(this.d, rlaVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iL = kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return iL + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return vb7.t(kgh.r("LongTaskEventView(id=", this.a, ", referrer=", this.b, ", url="), this.c, ", name=", this.d, ")");
    }
}
