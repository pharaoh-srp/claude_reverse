package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qg8 {
    public static final qg8 d = new qg8(d54.h, 3, null);
    public static final int e = 3;
    public final long a;
    public final int b;
    public final jy1 c;

    public qg8(long j, int i, jy1 jy1Var) {
        this.a = j;
        this.b = i;
        this.c = jy1Var;
    }

    public final boolean a() {
        return (this.a == 16 && this.c == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg8)) {
            return false;
        }
        qg8 qg8Var = (qg8) obj;
        return d54.c(this.a, qg8Var.a) && this.b == qg8Var.b && x44.r(this.c, qg8Var.c);
    }

    public final int hashCode() {
        int i = d54.i;
        int iC = vb7.c(this.b, Long.hashCode(this.a) * 31, 31);
        jy1 jy1Var = this.c;
        return iC + (jy1Var == null ? 0 : jy1Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbR = kgh.r("HazeTint(color=", d54.i(this.a), ", blendMode=", yb5.P(this.b), ", brush=");
        sbR.append(this.c);
        sbR.append(")");
        return sbR.toString();
    }

    public qg8(long j) {
        this(j, e, null);
    }
}
