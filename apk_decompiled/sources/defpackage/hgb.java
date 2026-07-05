package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hgb extends jgb {
    public final String a;
    public final String b;

    public hgb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgb)) {
            return false;
        }
        hgb hgbVar = (hgb) obj;
        return x44.r(this.a, hgbVar.a) && x44.r(this.b, hgbVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return ij0.l("UsageRefusal(retryModelName=", this.a, ", currentModelName=", this.b, ")");
    }
}
