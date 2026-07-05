package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: loaded from: classes2.dex */
public final class up3 extends vw7 {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public up3(mqh mqhVar, long j, long j2) throws ClippingMediaSource$IllegalClippingException {
        super(mqhVar);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new ClippingMediaSource$IllegalClippingException(j, 2, j2);
        }
        boolean z = false;
        if (mqhVar.h() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        kqh kqhVarM = mqhVar.m(0, new kqh(), 0L);
        long jMax = Math.max(0L, j);
        if (!kqhVarM.i && jMax != 0 && !kqhVarM.f) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? kqhVarM.k : Math.max(0L, j2);
        long j3 = kqhVarM.k;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.c = jMax;
        this.d = jMax2;
        this.e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (kqhVarM.g && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z = true;
        }
        this.f = z;
    }

    @Override // defpackage.vw7, defpackage.mqh
    public final jqh f(int i, jqh jqhVar, boolean z) {
        this.b.f(0, jqhVar, z);
        long j = jqhVar.e - this.c;
        long j2 = this.e;
        jqhVar.h(jqhVar.a, jqhVar.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, nd.c, false);
        return jqhVar;
    }

    @Override // defpackage.vw7, defpackage.mqh
    public final kqh m(int i, kqh kqhVar, long j) {
        this.b.m(0, kqhVar, 0L);
        long j2 = kqhVar.n;
        long j3 = this.c;
        kqhVar.n = j2 + j3;
        kqhVar.k = this.e;
        kqhVar.g = this.f;
        long j4 = kqhVar.j;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            kqhVar.j = jMax;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            kqhVar.j = jMax - j3;
        }
        long jM = tpi.M(j3);
        long j6 = kqhVar.c;
        if (j6 != -9223372036854775807L) {
            kqhVar.c = j6 + jM;
        }
        long j7 = kqhVar.d;
        if (j7 != -9223372036854775807L) {
            kqhVar.d = j7 + jM;
        }
        return kqhVar;
    }
}
