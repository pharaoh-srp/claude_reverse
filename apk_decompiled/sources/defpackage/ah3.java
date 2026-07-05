package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ah3 {
    public final gh3 a;
    public final ug3 b;

    public ah3(gh3 gh3Var, ug3 ug3Var) {
        gh3Var.getClass();
        this.a = gh3Var;
        this.b = ug3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ah3) {
            return x44.r(this.a, ((ah3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
