package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aj3 {
    public final String a;
    public final String b;
    public final zi3 c;

    public aj3(String str, String str2, zi3 zi3Var) {
        this.a = str;
        this.b = str2;
        this.c = zi3Var;
    }

    public final zi3 a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj3)) {
            return false;
        }
        aj3 aj3Var = (aj3) obj;
        return x44.r(this.a, aj3Var.a) && x44.r(this.b, aj3Var.b) && x44.r(this.c, aj3Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        zi3 zi3Var = this.c;
        return iHashCode2 + (zi3Var != null ? zi3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("CreditsRequired(noticeTitle=", this.a, ", noticeText=", this.b, ", cta=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
