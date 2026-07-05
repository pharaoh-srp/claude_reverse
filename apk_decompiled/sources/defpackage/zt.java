package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zt extends yok {
    public final ut b;

    public zt(ut utVar) {
        this.b = utVar;
    }

    @Override // defpackage.yok
    public final int c(c3d c3dVar) {
        return c3dVar.R(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt) && x44.r(this.b, ((zt) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Value(alignmentLine=" + this.b + ')';
    }
}
