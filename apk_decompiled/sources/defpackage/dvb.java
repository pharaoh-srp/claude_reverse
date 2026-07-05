package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dvb {
    public long[] a;
    public int b;

    public dvb(int i) {
        this.a = i == 0 ? yka.a : new long[i];
    }

    public final void a(long j) {
        int i = this.b + 1;
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.a;
        int i2 = this.b;
        jArr2[i2] = j;
        this.b = i2 + 1;
    }

    public final long b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        gtk.h("Index must be between 0 and size");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvb) {
            dvb dvbVar = (dvb) obj;
            int i = dvbVar.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = dvbVar.a;
                b79 b79VarH0 = wd6.H0(0, i2);
                int i3 = b79VarH0.E;
                int i4 = b79VarH0.F;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
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

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Long.hashCode(jArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long j = jArr[i2];
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            sb.append(j);
            i2++;
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }

    public /* synthetic */ dvb() {
        this(16);
    }
}
