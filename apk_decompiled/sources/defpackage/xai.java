package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xai implements rzd {
    public final String a;

    public xai(pl9 pl9Var) {
        pl9Var.getClass();
        this.a = ql9.a(pl9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xai.class == obj.getClass() && x44.r(this.a, ((xai) obj).a);
    }

    @Override // defpackage.rzd
    public final String getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
