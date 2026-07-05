package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iz5 {
    public final qzd a;
    public final int b;
    public final int c;

    public iz5(qzd qzdVar, int i, int i2) {
        this.a = qzdVar;
        this.b = i;
        this.c = i2;
    }

    public static iz5 a(Class cls) {
        return new iz5(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iz5)) {
            return false;
        }
        iz5 iz5Var = (iz5) obj;
        return this.a.equals(iz5Var.a) && this.b == iz5Var.b && this.c == iz5Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                sz6.h(grc.p(i2, "Unsupported injection: "));
                return null;
            }
            str = "deferred";
        }
        return ij0.m(sb, str, "}");
    }

    public iz5(int i, int i2, Class cls) {
        this(qzd.a(cls), i, i2);
    }
}
