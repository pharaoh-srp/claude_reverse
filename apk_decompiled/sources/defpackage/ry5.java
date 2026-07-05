package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ry5 implements ij6 {
    public final int a;
    public final int b;

    public ry5(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        c39.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.ij6
    public final void a(lj6 lj6Var) {
        int i = lj6Var.c;
        bi0 bi0Var = lj6Var.a;
        int i2 = this.b;
        int iS = i + i2;
        if (((i ^ iS) & (i2 ^ iS)) < 0) {
            iS = bi0Var.s();
        }
        lj6Var.a(lj6Var.c, Math.min(iS, bi0Var.s()));
        int i3 = lj6Var.b;
        int i4 = this.a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        lj6Var.a(Math.max(0, i5), lj6Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry5)) {
            return false;
        }
        ry5 ry5Var = (ry5) obj;
        return this.a == ry5Var.a && this.b == ry5Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return vb7.r(sb, this.b, ')');
    }
}
