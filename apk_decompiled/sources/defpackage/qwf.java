package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qwf implements ij6 {
    public final int a;
    public final int b;

    public qwf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ij6
    public final void a(lj6 lj6Var) {
        boolean z = lj6Var.d != -1;
        bi0 bi0Var = lj6Var.a;
        if (z) {
            lj6Var.d = -1;
            lj6Var.e = -1;
        }
        int iE0 = wd6.e0(this.a, 0, bi0Var.s());
        int iE02 = wd6.e0(this.b, 0, bi0Var.s());
        if (iE0 != iE02) {
            if (iE0 < iE02) {
                lj6Var.e(iE0, iE02);
            } else {
                lj6Var.e(iE02, iE0);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwf)) {
            return false;
        }
        qwf qwfVar = (qwf) obj;
        return this.a == qwfVar.a && this.b == qwfVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return vb7.r(sb, this.b, ')');
    }
}
