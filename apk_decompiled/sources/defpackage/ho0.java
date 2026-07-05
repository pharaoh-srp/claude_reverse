package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ho0 implements go0, jo0 {
    public final float E;
    public final boolean F;
    public final io0 G;
    public final float H;

    public ho0(float f, boolean z, io0 io0Var) {
        this.E = f;
        this.F = z;
        this.G = io0Var;
        this.H = f;
    }

    @Override // defpackage.go0, defpackage.jo0
    public final float d() {
        return this.H;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho0)) {
            return false;
        }
        ho0 ho0Var = (ho0) obj;
        return va6.b(this.E, ho0Var.E) && this.F == ho0Var.F && x44.r(this.G, ho0Var.G);
    }

    public final int hashCode() {
        int iP = fsh.p(Float.hashCode(this.E) * 31, 31, this.F);
        io0 io0Var = this.G;
        return iP + (io0Var == null ? 0 : io0Var.hashCode());
    }

    @Override // defpackage.go0
    public final void j(cz5 cz5Var, int i, int[] iArr, fu9 fu9Var, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iM0 = cz5Var.M0(this.E);
        boolean z = this.F && fu9Var == fu9.F;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iM0, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iM0, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        io0 io0Var = this.G;
        if (io0Var == null || i2 <= 0) {
            return;
        }
        int iB = io0Var.b(i2, fu9Var);
        if (z) {
            iB -= i2;
        }
        if (iB != 0) {
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iB;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.F ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        ebh.v(this.E, sb, ", ");
        sb.append(this.G);
        sb.append(')');
        return sb.toString();
    }

    @Override // defpackage.jo0
    public final void v(cz5 cz5Var, int i, int[] iArr, int[] iArr2) {
        j(cz5Var, i, iArr, fu9.E, iArr2);
    }
}
