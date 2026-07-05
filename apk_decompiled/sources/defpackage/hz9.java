package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hz9 {
    public final ewb a;
    public l94 b;
    public int c;
    public final fwb d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public ez9 j;
    public final iqb k;

    public hz9() {
        long[] jArr = u6f.a;
        this.a = new ewb();
        fwb fwbVar = v6f.a;
        this.d = new fwb();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.k = new dz9(this);
    }

    public static void c(oz9 oz9Var, int i, fz9 fz9Var) {
        int i2 = 0;
        long jK = oz9Var.k(0);
        long jA = oz9Var.i() ? y69.a(0, i, 1, jK) : y69.a(i, 0, 2, jK);
        bz9[] bz9VarArr = fz9Var.a;
        int length = bz9VarArr.length;
        int i3 = 0;
        while (i2 < length) {
            bz9 bz9Var = bz9VarArr[i2];
            int i4 = i3 + 1;
            if (bz9Var != null) {
                bz9Var.l = y69.d(jA, y69.c(oz9Var.k(i3), jK));
            }
            i2++;
            i3 = i4;
        }
    }

    public static int h(int[] iArr, oz9 oz9Var) {
        int iL = oz9Var.l();
        int iC = oz9Var.c() + iL;
        int iMax = 0;
        while (iL < iC) {
            int iF = oz9Var.f() + iArr[iL];
            iArr[iL] = iF;
            iMax = Math.max(iMax, iF);
            iL++;
        }
        return iMax;
    }

    public final bz9 a(int i, Object obj) {
        fz9 fz9Var = (fz9) this.a.g(obj);
        if (fz9Var != null) {
            return fz9Var.a[i];
        }
        return null;
    }

    public final long b() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            bz9 bz9Var = (bz9) arrayList.get(i);
            ja8 ja8Var = bz9Var.n;
            if (ja8Var != null) {
                int iMax = Math.max((int) (jMax >> 32), ((int) (bz9Var.l >> 32)) + ((int) (ja8Var.u >> 32)));
                jMax = (((long) Math.max((int) (jMax & 4294967295L), ((int) (bz9Var.l & 4294967295L)) + ((int) (ja8Var.u & 4294967295L)))) & 4294967295L) | (((long) iMax) << 32);
            }
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25, types: [c45, o45, tp4] */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r6v22, types: [bz9[]] */
    /* JADX WARN: Type inference failed for: r6v26, types: [bz9[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r50, int r51, int r52, java.util.ArrayList r53, defpackage.l94 r54, defpackage.rok r55, boolean r56, boolean r57, int r58, boolean r59, int r60, int r61, defpackage.l45 r62, defpackage.ga8 r63) {
        /*
            Method dump skipped, instruction units count: 1593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz9.d(int, int, int, java.util.ArrayList, l94, rok, boolean, boolean, int, boolean, int, int, l45, ga8):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r14 = this;
            ewb r14 = r14.a
            boolean r0 = r14.j()
            if (r0 == 0) goto L5d
            java.lang.Object[] r0 = r14.c
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5a
            r3 = 0
            r4 = r3
        L13:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L55
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2d:
            if (r9 >= r7) goto L53
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4f
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            fz9 r10 = (defpackage.fz9) r10
            bz9[] r10 = r10.a
            int r11 = r10.length
            r12 = r3
        L43:
            if (r12 >= r11) goto L4f
            r13 = r10[r12]
            if (r13 == 0) goto L4c
            r13.c()
        L4c:
            int r12 = r12 + 1
            goto L43
        L4f:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2d
        L53:
            if (r7 != r8) goto L5a
        L55:
            if (r4 == r2) goto L5a
            int r4 = r4 + 1
            goto L13
        L5a:
            r14.a()
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz9.e():void");
    }

    public final void f(Object obj) {
        fz9 fz9Var = (fz9) this.a.k(obj);
        if (fz9Var != null) {
            for (bz9 bz9Var : fz9Var.a) {
                if (bz9Var != null) {
                    bz9Var.c();
                }
            }
        }
    }

    public final void g(oz9 oz9Var, boolean z) {
        Object objG = this.a.g(oz9Var.getKey());
        objG.getClass();
        bz9[] bz9VarArr = ((fz9) objG).a;
        int length = bz9VarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bz9 bz9Var = bz9VarArr[i];
            int i3 = i2 + 1;
            if (bz9Var != null) {
                long jK = oz9Var.k(i2);
                long j = bz9Var.l;
                if (!y69.b(j, 9223372034707292159L) && !y69.b(j, jK)) {
                    long jC = y69.c(jK, j);
                    kl7 kl7Var = bz9Var.e;
                    if (kl7Var != null) {
                        long jC2 = y69.c(((y69) bz9Var.q.getValue()).a, jC);
                        bz9Var.g(jC2);
                        bz9Var.f(true);
                        bz9Var.g = z;
                        gb9.D(bz9Var.a, null, null, new p0(bz9Var, kl7Var, jC2, (tp4) null, 4), 3);
                    }
                }
                bz9Var.l = jK;
            }
            i++;
            i2 = i3;
        }
    }
}
