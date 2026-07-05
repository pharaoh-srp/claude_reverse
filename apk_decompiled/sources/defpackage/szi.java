package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class szi {
    public final String a;
    public final String b;

    public szi(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szi)) {
            return false;
        }
        szi sziVar = (szi) obj;
        return x44.r(this.a, sziVar.a) && x44.r(this.b, sziVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ij0.l("Cellular(technology=", this.a, ", carrierName=", this.b, ")");
    }
}
