package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kye {
    public final String a;
    public final String b;
    public final String c;

    public kye(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kye)) {
            return false;
        }
        kye kyeVar = (kye) obj;
        return x44.r(this.a, kyeVar.a) && x44.r(this.b, kyeVar.b) && x44.r(this.c, kyeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return ij0.m(kgh.r("RumScopeKey(id=", this.a, ", url=", this.b, ", name="), this.c, ")");
    }
}
