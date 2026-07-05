package defpackage;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class m6j implements vef {
    public final tsc a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public m6j(tsc tscVar, int i, long j, long j2) {
        this.a = tscVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) tscVar.c);
        this.d = j3;
        this.e = h(j3);
    }

    @Override // defpackage.vef
    public final boolean b() {
        return true;
    }

    @Override // defpackage.vef
    public final uef e(long j) {
        tsc tscVar = this.a;
        long j2 = (((long) tscVar.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.d - 1;
        long jH = tpi.h(j2, 0L, j3);
        int i = tscVar.c;
        long j4 = this.c;
        long jH2 = h(jH);
        xef xefVar = new xef(jH2, (((long) i) * jH) + j4);
        if (jH2 >= j || jH == j3) {
            return new uef(xefVar, xefVar);
        }
        long j5 = jH + 1;
        return new uef(xefVar, new xef(h(j5), (((long) i) * j5) + j4));
    }

    @Override // defpackage.vef
    public final long g() {
        return this.e;
    }

    public final long h(long j) {
        long j2 = j * ((long) this.b);
        long j3 = this.a.b;
        String str = tpi.a;
        return tpi.I(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
