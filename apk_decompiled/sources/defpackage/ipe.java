package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ipe {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ipe(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipe)) {
            return false;
        }
        ipe ipeVar = (ipe) obj;
        return this.a.equals(ipeVar.a) && x44.r(this.b, ipeVar.b) && x44.r(this.c, ipeVar.c) && x44.r(this.d, ipeVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iL = kgh.l((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return iL + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return vb7.t(kgh.r("ResourceEventView(id=", this.a, ", referrer=", this.b, ", url="), this.c, ", name=", this.d, ")");
    }
}
