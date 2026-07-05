package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q2c {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public q2c(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2c)) {
            return false;
        }
        q2c q2cVar = (q2c) obj;
        return x44.r(this.a, q2cVar.a) && x44.r(this.b, q2cVar.b) && x44.r(this.c, q2cVar.c) && x44.r(this.d, q2cVar.d) && x44.r(this.e, q2cVar.e);
    }

    public final boolean f() {
        return this.a == null && this.b == null && this.c == null && this.d == null && this.e == null;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("NewCodeSessionPrefill(prompt=", this.a, ", mode=", this.b, ", repo=");
        kgh.u(sbR, this.c, ", branch=", this.d, ", model=");
        return ij0.m(sbR, this.e, ")");
    }
}
