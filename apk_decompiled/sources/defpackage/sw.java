package defpackage;

import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class sw implements wd7 {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final r56 b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public yd7 j;
    public y3i k;
    public y3i l;
    public vef m;
    public boolean n;
    public long o;
    public boolean p;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        String str = tpi.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public sw() {
        r56 r56Var = new r56();
        this.b = r56Var;
        this.l = r56Var;
    }

    @Override // defpackage.wd7
    public final void a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb A[PHI: r4
      0x00eb: PHI (r4v1 xd7) = (r4v0 xd7), (r4v6 xd7) binds: [B:53:0x00e9, B:56:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa  */
    @Override // defpackage.wd7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.xd7 r18, defpackage.xm7 r19) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw.b(xd7, xm7):int");
    }

    @Override // defpackage.wd7
    public final boolean c(xd7 xd7Var) {
        return h(xd7Var);
    }

    @Override // defpackage.wd7
    public final void d(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        vef vefVar = this.m;
        if (!(vefVar instanceof w09)) {
            if (j == 0 || !(vefVar instanceof fl4)) {
                this.i = 0L;
                return;
            } else {
                fl4 fl4Var = (fl4) vefVar;
                this.i = (Math.max(0L, j - fl4Var.b) * 8000000) / ((long) fl4Var.e);
                return;
            }
        }
        w09 w09Var = (w09) vefVar;
        yja yjaVar = w09Var.b;
        long jE = yjaVar.b == 0 ? -9223372036854775807L : yjaVar.e(tpi.b(w09Var.a, j));
        this.i = jE;
        if (Math.abs(this.o - jE) < 20000) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    @Override // defpackage.wd7
    public final void f(yd7 yd7Var) {
        this.j = yd7Var;
        y3i y3iVarN = yd7Var.n(0, 1);
        this.k = y3iVarN;
        this.l = y3iVarN;
        yd7Var.j();
    }

    public final int g(xd7 xd7Var) throws ParserException {
        boolean z;
        xd7Var.k();
        byte[] bArr = this.a;
        xd7Var.p(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.a(null, sb.toString());
    }

    public final boolean h(xd7 xd7Var) {
        xd7Var.k();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        xd7Var.p(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            xd7Var.l(bArr.length);
            return true;
        }
        xd7Var.k();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        xd7Var.p(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        xd7Var.l(bArr3.length);
        return true;
    }
}
