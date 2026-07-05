package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class wf3 {
    public final ca1 a;
    public final y3i b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public wf3(int i, ca1 ca1Var, y3i y3iVar) {
        int i2 = ca1Var.d;
        this.a = ca1Var;
        int iA = ca1Var.a();
        boolean z = true;
        if (iA != 1 && iA != 2) {
            z = false;
        }
        fd9.E(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = ((long) ca1Var.b) * 1000000;
        long j2 = ca1Var.c;
        String str = tpi.a;
        this.e = tpi.I(i2, j, j2, RoundingMode.DOWN);
        this.b = y3iVar;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final xef a(int i) {
        return new xef((this.e / ((long) this.f)) * ((long) this.n[i]), this.m[i]);
    }

    public final uef b(long j) {
        if (this.k == 0) {
            xef xefVar = new xef(0L, this.l);
            return new uef(xefVar, xefVar);
        }
        int i = (int) (j / (this.e / ((long) this.f)));
        int iC = tpi.c(this.n, i, true, true);
        if (this.n[iC] == i) {
            xef xefVarA = a(iC);
            return new uef(xefVarA, xefVarA);
        }
        xef xefVarA2 = a(iC);
        int i2 = iC + 1;
        return i2 < this.m.length ? new uef(xefVarA2, a(i2)) : new uef(xefVarA2, xefVarA2);
    }
}
