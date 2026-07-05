package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class zkb implements iff {
    public final long[] a;
    public final long[] b;
    public final long c;

    public zkb(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? tpi.C(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair h(long j, long[] jArr, long[] jArr2) {
        int iD = tpi.d(jArr, j, true);
        long j2 = jArr[iD];
        long j3 = jArr2[iD];
        int i = iD + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.iff
    public final long a() {
        return -1L;
    }

    @Override // defpackage.vef
    public final boolean b() {
        return true;
    }

    @Override // defpackage.iff
    public final long c(long j) {
        return tpi.C(((Long) h(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.vef
    public final uef e(long j) {
        Pair pairH = h(tpi.M(tpi.h(j, 0L, this.c)), this.b, this.a);
        xef xefVar = new xef(tpi.C(((Long) pairH.first).longValue()), ((Long) pairH.second).longValue());
        return new uef(xefVar, xefVar);
    }

    @Override // defpackage.iff
    public final int f() {
        return -2147483647;
    }

    @Override // defpackage.vef
    public final long g() {
        return this.c;
    }
}
