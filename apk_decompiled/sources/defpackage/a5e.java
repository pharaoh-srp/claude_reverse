package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a5e implements x8g {
    public final j8g E;

    public a5e(j8g j8gVar) {
        this.E = j8gVar;
    }

    @Override // defpackage.x8g
    public final Object c(tp4 tp4Var) {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5e) && this.E.equals(((a5e) obj).E);
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.E + ")";
    }
}
