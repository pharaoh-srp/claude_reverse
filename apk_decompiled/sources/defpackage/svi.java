package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class svi {
    public final String a;
    public final String b;

    public svi(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svi)) {
            return false;
        }
        svi sviVar = (svi) obj;
        return x44.r(this.a, sviVar.a) && x44.r(this.b, sviVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.l("Application(id=", this.a, ", currentLocale=", this.b, ")");
    }
}
