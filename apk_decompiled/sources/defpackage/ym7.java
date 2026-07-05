package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ym7 extends iqg {
    public zm7 n;
    public hw1 o;

    @Override // defpackage.iqg
    public final long b(ssc sscVar) {
        byte[] bArr = sscVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            sscVar.N(4);
            sscVar.H();
        }
        int iG = gmk.g(i, sscVar);
        sscVar.M(0);
        return iG;
    }

    @Override // defpackage.iqg
    public final boolean c(ssc sscVar, long j, mvd mvdVar) {
        byte[] bArr = sscVar.a;
        zm7 zm7Var = this.n;
        if (zm7Var == null) {
            zm7 zm7Var2 = new zm7(bArr, 17);
            this.n = zm7Var2;
            iw7 iw7VarA = zm7Var2.c(Arrays.copyOfRange(bArr, 9, sscVar.c), null).a();
            iw7VarA.m = gkb.k("audio/ogg");
            mvdVar.F = new jw7(iw7VarA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            hw1 hw1Var = this.o;
            if (hw1Var != null) {
                hw1Var.E = j;
                mvdVar.G = hw1Var;
            }
            ((jw7) mvdVar.F).getClass();
            return false;
        }
        i49 i49VarJ = pmk.j(sscVar);
        zm7 zm7Var3 = new zm7(zm7Var.a, zm7Var.b, zm7Var.c, zm7Var.d, zm7Var.e, zm7Var.g, zm7Var.h, zm7Var.j, i49VarJ, zm7Var.l);
        this.n = zm7Var3;
        hw1 hw1Var2 = new hw1();
        hw1Var2.G = zm7Var3;
        hw1Var2.H = i49VarJ;
        hw1Var2.E = -1L;
        hw1Var2.F = -1L;
        this.o = hw1Var2;
        return true;
    }

    @Override // defpackage.iqg
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
