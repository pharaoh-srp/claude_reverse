package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hs6 {
    public String a;
    public final String b;
    public String c;
    public final int d;

    public hs6(String str, String str2, String str3, int i) {
        if (i == 0) {
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs6)) {
            return false;
        }
        hs6 hs6Var = (hs6) obj;
        return this.a.equals(hs6Var.a) && x44.r(this.b, hs6Var.b) && x44.r(this.c, hs6Var.c) && this.d == hs6Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return sq6.F(this.d) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.c;
        StringBuilder sbR = kgh.r("Cause(message=", str, ", type=", this.b, ", stack=");
        sbR.append(str2);
        sbR.append(", source=");
        sbR.append(ms6.C(this.d));
        sbR.append(")");
        return sbR.toString();
    }
}
