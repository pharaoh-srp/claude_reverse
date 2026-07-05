package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yc0 {
    public final wc0 a;

    public yc0(wc0 wc0Var) {
        wc0Var.getClass();
        this.a = wc0Var;
    }

    public static pl9 b() {
        return jce.a.b(yc0.class);
    }

    public final yc0 a(yc0 yc0Var) {
        return yc0Var == null ? this : new yc0(csk.d(this.a, yc0Var.a));
    }

    public final yc0 c(yc0 yc0Var) {
        if (x44.r(yc0Var, this)) {
            return this;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yc0) {
            return x44.r(((yc0) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
