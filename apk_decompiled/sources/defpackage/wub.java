package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wub {
    public int[] a;
    public int b;

    public wub(int i) {
        this.a = i == 0 ? f79.a : new int[i];
    }

    public final void a(int i) {
        b(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        gtk.h("Index must be between 0 and size");
        throw null;
    }

    public final int d() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        gtk.i("IntList is empty.");
        throw null;
    }

    public final void e(int i) {
        int[] iArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (i == iArr[i3]) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            f(i3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wub) {
            wub wubVar = (wub) obj;
            int i = wubVar.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = wubVar.a;
                b79 b79VarH0 = wd6.H0(0, i2);
                int i3 = b79VarH0.E;
                int i4 = b79VarH0.F;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            gtk.h("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            mp0.r0(i, i + 1, i2, iArr, iArr);
        }
        this.b--;
        return i3;
    }

    public final void g(int i, int i2) {
        if (i < 0 || i >= this.b) {
            gtk.h("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.a;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Integer.hashCode(iArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            int i3 = iArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(i3);
            i2++;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ wub() {
        this(16);
    }
}
