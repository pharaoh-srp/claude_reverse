package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ri4 {
    public static final n2g e;
    public static final y3e f;
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    static {
        n2g n2gVarB = o2g.b(1, 5, null);
        e = n2gVarB;
        f = new y3e(n2gVarB);
    }

    public ri4(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri4)) {
            return false;
        }
        ri4 ri4Var = (ri4) obj;
        return this.a.equals(ri4Var.a) && this.b.equals(ri4Var.b) && x44.r(this.c, ri4Var.c) && x44.r(this.d, ri4Var.d);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return vb7.t(kgh.r("ConnectorAuthIntentData(code=", this.a, ", state=", this.b, ", error="), this.c, ", errorDescription=", this.d, ")");
    }
}
