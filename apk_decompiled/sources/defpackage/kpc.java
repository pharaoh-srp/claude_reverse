package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class kpc extends mpc {
    public final float a;
    public final int b;
    public final int c;

    public kpc(int i, float f) {
        this.a = f;
        this.b = i;
        this.c = i;
    }

    @Override // defpackage.mpc
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpc)) {
            return false;
        }
        kpc kpcVar = (kpc) obj;
        return va6.b(this.a, kpcVar.a) && fe5.e(this.c, kpcVar.c);
    }

    public final int hashCode() {
        return fe5.f(this.c) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PaneExpansionAnchor(Offset = " + ((Object) va6.c(this.a)) + ')';
    }
}
