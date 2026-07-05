package defpackage;

import androidx.media3.common.ParserException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class k6j implements j6j {
    public final yd7 a;
    public final y3i b;
    public final tsc c;
    public final jw7 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public k6j(yd7 yd7Var, y3i y3iVar, tsc tscVar, String str, int i) throws ParserException {
        this.a = yd7Var;
        this.b = y3iVar;
        this.c = tscVar;
        int i2 = tscVar.a;
        int i3 = tscVar.b;
        int i4 = (tscVar.d * i2) / 8;
        int i5 = tscVar.c;
        if (i5 != i4) {
            throw ParserException.a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.e = iMax;
        iw7 iw7Var = new iw7();
        iw7Var.m = gkb.k("audio/wav");
        iw7Var.n = gkb.k(str);
        iw7Var.h = i7;
        iw7Var.i = i7;
        iw7Var.o = iMax;
        iw7Var.F = i2;
        iw7Var.G = i3;
        iw7Var.H = i;
        this.d = new jw7(iw7Var);
    }

    @Override // defpackage.j6j
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.j6j
    public final boolean b(xd7 xd7Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iC = this.b.c(xd7Var, (int) Math.min(i2 - i, j2), true);
            if (iC == -1) {
                j2 = 0;
            } else {
                this.g += iC;
                j2 -= (long) iC;
            }
        }
        tsc tscVar = this.c;
        int i3 = tscVar.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = tscVar.b;
            String str = tpi.a;
            long jI = j3 + tpi.I(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(jI, 1, i5, i6, null);
            this.h += (long) i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // defpackage.j6j
    public final void c(int i, long j) {
        m6j m6jVar = new m6j(this.c, 1, i, j);
        this.a.q(m6jVar);
        jw7 jw7Var = this.d;
        y3i y3iVar = this.b;
        y3iVar.g(jw7Var);
        y3iVar.d(m6jVar.e);
    }
}
