package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sy5 implements ij6 {
    public final int a;
    public final int b;

    public sy5(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        c39.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // defpackage.ij6
    public final void a(lj6 lj6Var) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < this.a) {
                int i4 = i3 + 1;
                int i5 = lj6Var.b;
                if (i5 <= i4) {
                    i3 = i5;
                    break;
                } else {
                    i3 = (Character.isHighSurrogate(lj6Var.b((i5 - i4) + (-1))) && Character.isLowSurrogate(lj6Var.b(lj6Var.b - i4))) ? i3 + 2 : i4;
                    i2++;
                }
            } else {
                break;
            }
        }
        int iS = 0;
        while (true) {
            if (i >= this.b) {
                break;
            }
            int i6 = iS + 1;
            int i7 = lj6Var.c;
            bi0 bi0Var = lj6Var.a;
            if (i7 + i6 >= bi0Var.s()) {
                iS = bi0Var.s() - lj6Var.c;
                break;
            } else {
                iS = (Character.isHighSurrogate(lj6Var.b((lj6Var.c + i6) + (-1))) && Character.isLowSurrogate(lj6Var.b(lj6Var.c + i6))) ? iS + 2 : i6;
                i++;
            }
        }
        int i8 = lj6Var.c;
        lj6Var.a(i8, iS + i8);
        int i9 = lj6Var.b;
        lj6Var.a(i9 - i3, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy5)) {
            return false;
        }
        sy5 sy5Var = (sy5) obj;
        return this.a == sy5Var.a && this.b == sy5Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return vb7.r(sb, this.b, ')');
    }
}
