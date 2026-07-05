package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w8g extends hqb implements pu9 {
    public float S;
    public float T;
    public float U;
    public float V;
    public boolean W;

    @Override // defpackage.pu9
    public final int A0(fma fmaVar, h5b h5bVar, int i) {
        long jP1 = p1(fmaVar);
        if (rl4.e(jP1)) {
            return rl4.g(jP1);
        }
        if (!this.W) {
            i = sl4.g(i, jP1);
        }
        return sl4.f(h5bVar.Q(i), jP1);
    }

    @Override // defpackage.pu9
    public final int N0(fma fmaVar, h5b h5bVar, int i) {
        long jP1 = p1(fmaVar);
        if (rl4.f(jP1)) {
            return rl4.h(jP1);
        }
        if (!this.W) {
            i = sl4.f(i, jP1);
        }
        return sl4.g(h5bVar.l(i), jP1);
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jP1 = p1(q5bVar);
        if (this.W) {
            jA = sl4.e(j, jP1);
        } else {
            if (Float.isNaN(this.S)) {
                iJ = rl4.j(j);
                int iH2 = rl4.h(jP1);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = rl4.j(jP1);
            }
            if (Float.isNaN(this.U)) {
                iH = rl4.h(j);
                int iJ2 = rl4.j(jP1);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = rl4.h(jP1);
            }
            if (Float.isNaN(this.T)) {
                i = rl4.i(j);
                int iG2 = rl4.g(jP1);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = rl4.i(jP1);
            }
            if (Float.isNaN(this.V)) {
                iG = rl4.g(j);
                int i2 = rl4.i(jP1);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = rl4.g(jP1);
            }
            jA = sl4.a(iJ, iH, i, iG);
        }
        c3d c3dVarU = h5bVar.u(jA);
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new mf1(c3dVarU, 5));
    }

    @Override // defpackage.pu9
    public final int h(fma fmaVar, h5b h5bVar, int i) {
        long jP1 = p1(fmaVar);
        if (rl4.f(jP1)) {
            return rl4.h(jP1);
        }
        if (!this.W) {
            i = sl4.f(i, jP1);
        }
        return sl4.g(h5bVar.o(i), jP1);
    }

    @Override // defpackage.pu9
    public final int l0(fma fmaVar, h5b h5bVar, int i) {
        long jP1 = p1(fmaVar);
        if (rl4.e(jP1)) {
            return rl4.g(jP1);
        }
        if (!this.W) {
            i = sl4.g(i, jP1);
        }
        return sl4.f(h5bVar.a(i), jP1);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long p1(defpackage.q5b r7) {
        /*
            r6 = this;
            float r0 = r6.U
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.U
            int r0 = r7.M0(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.V
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.V
            int r3 = r7.M0(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.S
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.S
            int r4 = r7.M0(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.T
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.T
            int r6 = r7.M0(r6)
            if (r6 >= 0) goto L53
            r6 = r2
        L53:
            if (r6 <= r3) goto L56
            r6 = r3
        L56:
            if (r6 == r1) goto L59
            r2 = r6
        L59:
            long r6 = defpackage.sl4.a(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w8g.p1(q5b):long");
    }
}
