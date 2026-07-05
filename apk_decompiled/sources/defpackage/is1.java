package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class is1 extends oe5 {
    public final String c;
    public final String d;

    public is1(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is1)) {
            return false;
        }
        is1 is1Var = (is1) obj;
        return x44.r(this.c, is1Var.c) && x44.r(this.d, is1Var.d);
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return this.c;
    }

    public final String toString() {
        return ij0.l("UsageRefusal(retryModelName=", this.c, ", currentModelName=", this.d, ")");
    }
}
