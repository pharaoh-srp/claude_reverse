package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fw8 implements dh7 {
    public final wv8 a;
    public final boolean b;
    public final sg5 c;

    public fw8(wv8 wv8Var, boolean z, sg5 sg5Var) {
        this.a = wv8Var;
        this.b = z;
        this.c = sg5Var;
    }

    public final sg5 a() {
        return this.c;
    }

    public final wv8 b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw8)) {
            return false;
        }
        fw8 fw8Var = (fw8) obj;
        return this.a.equals(fw8Var.a) && this.b == fw8Var.b && this.c == fw8Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + fsh.p(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ")";
    }
}
