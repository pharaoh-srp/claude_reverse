package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
public final class vcc {
    public final wcc a = new wcc();
    public final ssc b = new ssc(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            wcc wccVar = this.a;
            if (i5 >= wccVar.c) {
                break;
            }
            int[] iArr = wccVar.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(xd7 xd7Var) {
        int i;
        fd9.M(xd7Var != null);
        boolean z = this.e;
        ssc sscVar = this.b;
        if (z) {
            this.e = false;
            sscVar.J(0);
        }
        while (!this.e) {
            int i2 = this.c;
            wcc wccVar = this.a;
            if (i2 < 0) {
                if (wccVar.b(xd7Var, -1L) && wccVar.a(xd7Var, true)) {
                    int iA = wccVar.d;
                    if ((wccVar.a & 1) == 1 && sscVar.c == 0) {
                        iA += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        xd7Var.l(iA);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iA2 = a(this.c);
            int i3 = this.c + this.d;
            if (iA2 > 0) {
                sscVar.c(sscVar.c + iA2);
                try {
                    xd7Var.readFully(sscVar.a, sscVar.c, iA2);
                    sscVar.L(sscVar.c + iA2);
                    this.e = wccVar.f[i3 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i3 == wccVar.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
