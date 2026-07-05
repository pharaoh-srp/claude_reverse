package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qjf implements ekf, Iterable, mm9 {
    public final ewb E;
    public mta F;
    public boolean G;
    public boolean H;

    public qjf() {
        long[] jArr = u6f.a;
        this.E = new ewb();
    }

    @Override // defpackage.ekf
    public final void a(dkf dkfVar, Object obj) {
        boolean z = obj instanceof e5;
        ewb ewbVar = this.E;
        if (z && ewbVar.c(dkfVar)) {
            Object objG = ewbVar.g(dkfVar);
            objG.getClass();
            e5 e5Var = (e5) objG;
            e5 e5Var2 = (e5) obj;
            String str = e5Var2.a;
            if (str == null) {
                str = e5Var.a;
            }
            qz7 qz7Var = e5Var2.b;
            if (qz7Var == null) {
                qz7Var = e5Var.b;
            }
            ewbVar.m(dkfVar, new e5(str, qz7Var));
        } else {
            ewbVar.m(dkfVar, obj);
        }
        dkfVar.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qjf e() {
        /*
            r17 = this;
            r0 = r17
            qjf r1 = new qjf
            r1.<init>()
            boolean r2 = r0.G
            r1.G = r2
            boolean r2 = r0.H
            r1.H = r2
            ewb r2 = r1.E
            r2.getClass()
            ewb r0 = r0.E
            r0.getClass()
            java.lang.Object[] r3 = r0.b
            java.lang.Object[] r4 = r0.c
            long[] r0 = r0.a
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L60
            r6 = 0
            r7 = r6
        L26:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5b
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L40:
            if (r12 >= r10) goto L59
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L55
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            r2.m(r14, r13)
        L55:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L40
        L59:
            if (r10 != r11) goto L60
        L5b:
            if (r7 == r5) goto L60
            int r7 = r7 + 1
            goto L26
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjf.e():qjf");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjf)) {
            return false;
        }
        qjf qjfVar = (qjf) obj;
        return x44.r(this.E, qjfVar.E) && this.G == qjfVar.G && this.H == qjfVar.H;
    }

    public final Object g(dkf dkfVar) {
        Object objG = this.E.g(dkfVar);
        if (objG != null) {
            return objG;
        }
        xh6.b(dkfVar, " - consider getOrElse or getOrNull", "Key not present: ");
        return null;
    }

    public final void h(qjf qjfVar) {
        ewb ewbVar = qjfVar.E;
        Object[] objArr = ewbVar.b;
        Object[] objArr2 = ewbVar.c;
        long[] jArr = ewbVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        dkf dkfVar = (dkf) obj;
                        ewb ewbVar2 = this.E;
                        Object objG = ewbVar2.g(dkfVar);
                        dkfVar.getClass();
                        Object objInvoke = dkfVar.b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            ewbVar2.m(dkfVar, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(this.H) + fsh.p(this.E.hashCode() * 31, 31, this.G);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        mta mtaVar = this.F;
        if (mtaVar == null) {
            ewb ewbVar = this.E;
            mta mtaVar2 = ewbVar.f;
            if (mtaVar2 == null) {
                mtaVar2 = new mta(ewbVar);
                ewbVar.f = mtaVar2;
            }
            mtaVar = mtaVar2;
            this.F = mtaVar;
        }
        return ((dq6) mtaVar.entrySet()).iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.G
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L16
        L14:
            java.lang.String r2 = ""
        L16:
            boolean r4 = r0.H
            if (r4 == 0) goto L23
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L23:
            ewb r4 = r0.E
            java.lang.Object[] r5 = r4.b
            java.lang.Object[] r6 = r4.c
            long[] r4 = r4.a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7d
            r9 = 0
        L31:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L78
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L4b:
            if (r14 >= r12) goto L76
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L72
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            r8 = r16
            dkf r8 = (defpackage.dkf) r8
            r1.append(r2)
            java.lang.String r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r15)
            r2 = r3
        L72:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4b
        L76:
            if (r12 != r13) goto L7d
        L78:
            if (r9 == r7) goto L7d
            int r9 = r9 + 1
            goto L31
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = defpackage.nv1.h(r0)
            r2.append(r0)
            java.lang.String r0 = "{ "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qjf.toString():java.lang.String");
    }
}
