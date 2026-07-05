package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class xw1 {
    public final String a;
    public final String b;
    public final Integer c;

    public xw1(String str, String str2, Integer num) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = num;
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
        if (!(obj instanceof xw1)) {
            return false;
        }
        xw1 xw1Var = (xw1) obj;
        return x44.r(this.a, xw1Var.a) && x44.r(this.b, xw1Var.b) && x44.r(this.c, xw1Var.c);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        return iL + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("CurrentRepo(owner=", this.a, ", name=", this.b, ", gheConfigurationId=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }
}
