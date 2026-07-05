package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class co6 {
    public final wv8 a;
    public final boolean b;
    public final sg5 c;
    public final String d;

    public co6(wv8 wv8Var, boolean z, sg5 sg5Var, String str) {
        this.a = wv8Var;
        this.b = z;
        this.c = sg5Var;
        this.d = str;
    }

    public final wv8 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co6)) {
            return false;
        }
        co6 co6Var = (co6) obj;
        return x44.r(this.a, co6Var.a) && this.b == co6Var.b && this.c == co6Var.c && x44.r(this.d, co6Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + fsh.p(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + ")";
    }
}
