package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g0j {
    public final String a;
    public final String b;
    public final String c;

    public g0j(String str, String str2, String str3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0j)) {
            return false;
        }
        g0j g0jVar = (g0j) obj;
        return x44.r(this.a, g0jVar.a) && this.b.equals(g0jVar.b) && x44.r(this.c, g0jVar.c);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 961, 31, this.b);
        String str = this.c;
        return iL + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.m(kgh.r("VitalAppLaunchEventView(id=", this.a, ", referrer=null, url=", this.b, ", name="), this.c, ")");
    }
}
