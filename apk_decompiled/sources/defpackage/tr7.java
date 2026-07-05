package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class tr7 implements wd7 {
    public final ssc a = new ssc(4);
    public final ssc b = new ssc(9);
    public final ssc c = new ssc(11);
    public final ssc d = new ssc();
    public final q8f e;
    public yd7 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public y51 o;
    public zui p;

    public tr7() {
        q8f q8fVar = new q8f(5, new r56());
        q8fVar.G = -9223372036854775807L;
        q8fVar.H = new long[0];
        q8fVar.I = new long[0];
        this.e = q8fVar;
        this.g = 1;
    }

    @Override // defpackage.wd7
    public final void a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b2  */
    @Override // defpackage.wd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.xd7 r36, defpackage.xm7 r37) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 1140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tr7.b(xd7, xm7):int");
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) throws EOFException, InterruptedIOException {
        ssc sscVar = this.a;
        fr5 fr5Var = (fr5) xd7Var;
        fr5Var.d(sscVar.a, 0, 3, false);
        sscVar.M(0);
        if (sscVar.C() == 4607062) {
            fr5Var.d(sscVar.a, 0, 2, false);
            sscVar.M(0);
            if ((sscVar.G() & 250) == 0) {
                fr5Var.d(sscVar.a, 0, 4, false);
                sscVar.M(0);
                int iM = sscVar.m();
                fr5Var.J = 0;
                fr5Var.j(iM, false);
                fr5Var.d(sscVar.a, 0, 4, false);
                sscVar.M(0);
                if (sscVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.f = yd7Var;
    }

    public final ssc g(xd7 xd7Var) {
        int i = this.l;
        ssc sscVar = this.d;
        byte[] bArr = sscVar.a;
        if (i > bArr.length) {
            sscVar.K(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            sscVar.M(0);
        }
        sscVar.L(this.l);
        xd7Var.readFully(sscVar.a, 0, this.l);
        return sscVar;
    }
}
