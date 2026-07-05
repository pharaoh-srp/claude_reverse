package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ev8 implements tg5 {
    public final tg5 E;
    public final int F;
    public final bkd G;
    public final byte[] H;
    public int I;

    public ev8(tg5 tg5Var, int i, bkd bkdVar) {
        fd9.E(i > 0);
        this.E = tg5Var;
        this.F = i;
        this.G = bkdVar;
        this.H = new byte[1];
        this.I = i;
    }

    @Override // defpackage.tg5
    public final long b(ug5 ug5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tg5
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tg5
    public final Map i() {
        return this.E.i();
    }

    @Override // defpackage.tg5
    public final Uri m() {
        return this.E.m();
    }

    @Override // defpackage.tg5
    public final void o(yp5 yp5Var) {
        yp5Var.getClass();
        this.E.o(yp5Var);
    }

    @Override // defpackage.og5
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.I;
        tg5 tg5Var = this.E;
        if (i3 == 0) {
            byte[] bArr2 = this.H;
            int i4 = 0;
            if (tg5Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = tg5Var.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        ssc sscVar = new ssc(bArr3, i5);
                        bkd bkdVar = this.G;
                        long jMax = !bkdVar.l ? bkdVar.i : Math.max(bkdVar.m.s(true), bkdVar.i);
                        int iA = sscVar.a();
                        y3i y3iVar = bkdVar.k;
                        y3iVar.getClass();
                        y3iVar.e(iA, sscVar);
                        y3iVar.a(jMax, 1, iA, 0, null);
                        bkdVar.l = true;
                    }
                }
                this.I = this.F;
            }
            return -1;
        }
        int i8 = tg5Var.read(bArr, i, Math.min(this.I, i2));
        if (i8 != -1) {
            this.I -= i8;
        }
        return i8;
    }
}
