package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eoe {
    public final String a;
    public final String b;

    public eoe(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        String str = this.a;
        if (str != null) {
            qh9Var.r("technology", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            qh9Var.r("carrier_name", str2);
        }
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoe)) {
            return false;
        }
        eoe eoeVar = (eoe) obj;
        return x44.r(this.a, eoeVar.a) && x44.r(this.b, eoeVar.b);
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
