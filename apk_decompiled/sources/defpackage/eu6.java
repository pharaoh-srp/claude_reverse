package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eu6 implements sx8 {
    public final wv8 a;
    public final jx8 b;
    public final Throwable c;

    public eu6(wv8 wv8Var, jx8 jx8Var, Throwable th) {
        this.a = wv8Var;
        this.b = jx8Var;
        this.c = th;
    }

    @Override // defpackage.sx8
    public final jx8 a() {
        return this.b;
    }

    @Override // defpackage.sx8
    public final wv8 b() {
        return this.a;
    }

    public final Throwable c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu6)) {
            return false;
        }
        eu6 eu6Var = (eu6) obj;
        return x44.r(this.a, eu6Var.a) && x44.r(this.b, eu6Var.b) && this.c.equals(eu6Var.c);
    }

    public final int hashCode() {
        wv8 wv8Var = this.a;
        int iHashCode = wv8Var == null ? 0 : wv8Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ")";
    }
}
