package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fc5 extends iuj {
    public final qt k;

    public fc5(vo1 vo1Var) {
        this.k = vo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fc5) && x44.r(this.k, ((fc5) obj).k);
    }

    public final int hashCode() {
        return this.k.hashCode();
    }

    @Override // defpackage.iuj
    public final int l(int i, int i2, fu9 fu9Var, c3d c3dVar, int i3) {
        return this.k.a(i2, i, fu9Var);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.k + ')';
    }
}
