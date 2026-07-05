package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wwf implements ij6 {
    public final int a;
    public final int b;

    public wwf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ij6
    public final void a(lj6 lj6Var) {
        int iE0 = wd6.e0(this.a, 0, lj6Var.a.s());
        int iE02 = wd6.e0(this.b, 0, lj6Var.a.s());
        if (iE0 < iE02) {
            lj6Var.f(iE0, iE02);
        } else {
            lj6Var.f(iE02, iE0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwf)) {
            return false;
        }
        wwf wwfVar = (wwf) obj;
        return this.a == wwfVar.a && this.b == wwfVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return vb7.r(sb, this.b, ')');
    }
}
