package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vw0 extends hqb implements pu9 {
    public float S;
    public boolean T;

    @Override // defpackage.pu9
    public final int A0(fma fmaVar, h5b h5bVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.S) : h5bVar.Q(i);
    }

    @Override // defpackage.pu9
    public final int N0(fma fmaVar, h5b h5bVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.S) : h5bVar.l(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    @Override // defpackage.pu9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p5b b(defpackage.q5b r8, defpackage.h5b r9, long r10) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vw0.b(q5b, h5b, long):p5b");
    }

    @Override // defpackage.pu9
    public final int h(fma fmaVar, h5b h5bVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.S) : h5bVar.o(i);
    }

    @Override // defpackage.pu9
    public final int l0(fma fmaVar, h5b h5bVar, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.S) : h5bVar.a(i);
    }

    public final long p1(long j, boolean z) {
        int iRound;
        int iG = rl4.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.S)) <= 0) {
            return 0L;
        }
        if (!z || kud.n(iRound, iG, j)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long q1(long j, boolean z) {
        int iRound;
        int iH = rl4.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.S)) <= 0) {
            return 0L;
        }
        if (!z || kud.n(iH, iRound, j)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long r1(long j, boolean z) {
        int i = rl4.i(j);
        int iRound = Math.round(i * this.S);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || kud.n(iRound, i, j)) {
            return (((long) iRound) << 32) | (((long) i) & 4294967295L);
        }
        return 0L;
    }

    public final long s1(long j, boolean z) {
        int iJ = rl4.j(j);
        int iRound = Math.round(iJ / this.S);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || kud.n(iJ, iRound, j)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }
}
