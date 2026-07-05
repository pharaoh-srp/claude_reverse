package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gc5 extends iuj {
    public final wo1 k;

    public gc5(wo1 wo1Var) {
        this.k = wo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gc5) && x44.r(this.k, ((gc5) obj).k);
    }

    public final int hashCode() {
        return Float.hashCode(this.k.a);
    }

    @Override // defpackage.iuj
    public final int l(int i, int i2, fu9 fu9Var, c3d c3dVar, int i3) {
        return this.k.a(i2, i);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.k + ')';
    }
}
