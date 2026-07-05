package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jgg implements Cloneable {
    public /* synthetic */ int[] E;
    public /* synthetic */ Object[] F;
    public /* synthetic */ int G;

    public jgg(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.E = new int[i5];
        this.F = new Object[i5];
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jgg clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        jgg jggVar = (jgg) objClone;
        jggVar.E = (int[]) this.E.clone();
        jggVar.F = (Object[]) this.F.clone();
        return jggVar;
    }

    public final int b(int i) {
        if (i >= this.G || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.E[i];
    }

    public final void c(int i, Object obj) {
        int iH = sf5.h(this.G, i, this.E);
        if (iH >= 0) {
            this.F[iH] = obj;
            return;
        }
        int i2 = ~iH;
        int i3 = this.G;
        if (i2 < i3) {
            Object[] objArr = this.F;
            if (objArr[i2] == jwj.d) {
                this.E[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.E.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.E = Arrays.copyOf(this.E, i7);
            this.F = Arrays.copyOf(this.F, i7);
        }
        int i8 = this.G;
        if (i8 - i2 != 0) {
            int[] iArr = this.E;
            int i9 = i2 + 1;
            mp0.r0(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.F;
            mp0.s0(i9, i2, this.G, objArr2, objArr2);
        }
        this.E[i2] = i;
        this.F[i2] = obj;
        this.G++;
    }

    public final Object d(int i) {
        if (i >= this.G || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.F[i];
    }

    public final String toString() {
        int i = this.G;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.G;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(b(i3));
            sb.append('=');
            Object objD = d(i3);
            if (objD != this) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
