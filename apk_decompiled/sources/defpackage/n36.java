package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n36 {
    public final r36 a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public n36(r36 r36Var, String str, Integer num, Integer num2) {
        str.getClass();
        this.a = r36Var;
        this.b = str;
        this.c = num;
        this.d = num2;
    }

    public final long a() {
        Integer num = this.c;
        long jIntValue = num != null ? num.intValue() : 0;
        Integer num2 = this.d;
        return (jIntValue << 32) | (((long) (num2 != null ? num2.intValue() : 0)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n36)) {
            return false;
        }
        n36 n36Var = (n36) obj;
        return this.a == n36Var.a && x44.r(this.b, n36Var.b) && x44.r(this.c, n36Var.c) && x44.r(this.d, n36Var.d);
    }

    public final int hashCode() {
        int iL = kgh.l(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iL + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "DiffLine(type=" + this.a + ", content=" + this.b + ", oldLineNumber=" + this.c + ", newLineNumber=" + this.d + ")";
    }
}
