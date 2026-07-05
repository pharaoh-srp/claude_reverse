package defpackage;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ycg {
    public static final a6f a = new a6f(29);
    public static final w3c b = new w3c((byte) 0, 9);
    public static final Object c = new Object();
    public static wcg d;
    public static long e;
    public static final hjb f;
    public static final l94 g;
    public static List h;
    public static List i;
    public static final w78 j;
    public static final t11 k;

    static {
        wcg wcgVar = wcg.I;
        d = wcgVar;
        e = 2L;
        hjb hjbVar = new hjb();
        hjbVar.c = new long[16];
        hjbVar.d = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        hjbVar.e = iArr;
        f = hjbVar;
        l94 l94Var = new l94(4);
        l94Var.c = new int[16];
        l94Var.d = new p6j[16];
        g = l94Var;
        lm6 lm6Var = lm6.E;
        h = lm6Var;
        i = lm6Var;
        long j2 = e;
        e = 1 + j2;
        w78 w78Var = new w78(j2, wcgVar, null, new fg7(7));
        d = d.k(w78Var.b);
        j = w78Var;
        k = new t11(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, kwb kwbVar, wcg wcgVar) {
        long[] jArr;
        wcg wcgVar2;
        long[] jArr2;
        wcg wcgVar3;
        int i2;
        int i3;
        kmg kmgVarS;
        fwb fwbVarX = kwbVar.x();
        if (fwbVarX != null) {
            long jG = kwbVar.g();
            wcg wcgVarH = kwbVar.d().k(jG).h(kwbVar.j);
            Object[] objArr = fwbVarX.b;
            long[] jArr3 = fwbVarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                img imgVar = (img) objArr[(i4 << 3) + i7];
                                kmg kmgVarA = imgVar.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                kmg kmgVarS2 = s(kmgVarA, j2, wcgVar);
                                if (kmgVarS2 == null || (kmgVarS = s(kmgVarA, jG, wcgVarH)) == null || kmgVarS2.equals(kmgVarS)) {
                                    wcgVar3 = wcgVarH;
                                } else {
                                    wcgVar3 = wcgVarH;
                                    kmg kmgVarS3 = s(kmgVarA, jG, kwbVar.d());
                                    if (kmgVarS3 == null) {
                                        r();
                                        throw null;
                                    }
                                    kmg kmgVarE = imgVar.e(kmgVarS, kmgVarS2, kmgVarS3);
                                    if (kmgVarE == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(kmgVarS2, kmgVarE);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                wcgVar3 = wcgVarH;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            wcgVarH = wcgVar3;
                        }
                        jArr = jArr3;
                        wcgVar2 = wcgVarH;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        wcgVar2 = wcgVarH;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    wcgVarH = wcgVar2;
                }
            }
        }
        return null;
    }

    public static final void c(rcg rcgVar) {
        long j2;
        if (d.g(rcgVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(rcgVar.g());
        sb.append(", disposed=");
        sb.append(rcgVar.c);
        sb.append(", applied=");
        kwb kwbVar = rcgVar instanceof kwb ? (kwb) rcgVar : null;
        sb.append(kwbVar != null ? Boolean.valueOf(kwbVar.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            hjb hjbVar = f;
            j2 = hjbVar.a > 0 ? ((long[]) hjbVar.c)[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final wcg d(wcg wcgVar, long j2, long j3) {
        while (x44.A(j2, j3) < 0) {
            wcgVar = wcgVar.k(j2);
            j2++;
        }
        return wcgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.bz7 r15) {
        /*
            w78 r0 = defpackage.ycg.j
            java.lang.Object r1 = defpackage.ycg.c
            monitor-enter(r1)
            fwb r2 = r0.h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            t11 r3 = defpackage.ycg.k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L9a
        L13:
            java.lang.Object r15 = v(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L47
            r3 = -1
            java.util.List r4 = defpackage.ycg.h     // Catch: java.lang.Throwable -> L39
            w6f r5 = new w6f     // Catch: java.lang.Throwable -> L39
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L39
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Throwable -> L39
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L39
            r7 = r1
        L2b:
            if (r7 >= r6) goto L3b
            java.lang.Object r8 = r4.get(r7)     // Catch: java.lang.Throwable -> L39
            pz7 r8 = (defpackage.pz7) r8     // Catch: java.lang.Throwable -> L39
            r8.invoke(r5, r0)     // Catch: java.lang.Throwable -> L39
            int r7 = r7 + 1
            goto L2b
        L39:
            r15 = move-exception
            goto L41
        L3b:
            t11 r0 = defpackage.ycg.k
            r0.addAndGet(r3)
            goto L47
        L41:
            t11 r0 = defpackage.ycg.k
            r0.addAndGet(r3)
            throw r15
        L47:
            java.lang.Object r0 = defpackage.ycg.c
            monitor-enter(r0)
            f()     // Catch: java.lang.Throwable -> L89
            if (r2 == 0) goto L96
            java.lang.Object[] r3 = r2.b     // Catch: java.lang.Throwable -> L89
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L89
            int r4 = r2.length     // Catch: java.lang.Throwable -> L89
            int r4 = r4 + (-2)
            if (r4 < 0) goto L96
            r5 = r1
        L59:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L89
            long r8 = ~r6     // Catch: java.lang.Throwable -> L89
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L91
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L89
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L73:
            if (r10 >= r8) goto L8f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L8b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L89
            img r11 = (defpackage.img) r11     // Catch: java.lang.Throwable -> L89
            q(r11)     // Catch: java.lang.Throwable -> L89
            goto L8b
        L89:
            r15 = move-exception
            goto L98
        L8b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L73
        L8f:
            if (r8 != r9) goto L96
        L91:
            if (r5 == r4) goto L96
            int r5 = r5 + 1
            goto L59
        L96:
            monitor-exit(r0)
            return r15
        L98:
            monitor-exit(r0)
            throw r15
        L9a:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycg.e(bz7):java.lang.Object");
    }

    public static final void f() {
        l94 l94Var = g;
        int i2 = l94Var.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            p6j p6jVar = ((p6j[]) l94Var.d)[i3];
            Object obj = p6jVar != null ? p6jVar.get() : null;
            if (obj != null && p((img) obj)) {
                if (i4 != i3) {
                    ((p6j[]) l94Var.d)[i4] = p6jVar;
                    int[] iArr = (int[]) l94Var.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((p6j[]) l94Var.d)[i5] = null;
            ((int[]) l94Var.c)[i5] = 0;
        }
        if (i4 != i2) {
            l94Var.b = i4;
        }
    }

    public static final rcg g(rcg rcgVar, bz7 bz7Var, boolean z) {
        boolean z2 = rcgVar instanceof kwb;
        if (z2 || rcgVar == null) {
            return new g6i(z2 ? (kwb) rcgVar : null, bz7Var, null, false, z);
        }
        return new h6i(rcgVar, bz7Var, false, z);
    }

    public static final kmg h(kmg kmgVar) {
        kmg kmgVarS;
        rcg rcgVarJ = j();
        kmg kmgVarS2 = s(kmgVar, rcgVarJ.g(), rcgVarJ.d());
        if (kmgVarS2 != null) {
            return kmgVarS2;
        }
        synchronized (c) {
            rcg rcgVarJ2 = j();
            kmgVarS = s(kmgVar, rcgVarJ2.g(), rcgVarJ2.d());
        }
        if (kmgVarS != null) {
            return kmgVarS;
        }
        r();
        throw null;
    }

    public static final kmg i(kmg kmgVar, rcg rcgVar) {
        kmg kmgVarS;
        kmg kmgVarS2 = s(kmgVar, rcgVar.g(), rcgVar.d());
        if (kmgVarS2 != null) {
            return kmgVarS2;
        }
        synchronized (c) {
            kmgVarS = s(kmgVar, rcgVar.g(), rcgVar.d());
        }
        if (kmgVarS != null) {
            return kmgVarS;
        }
        r();
        throw null;
    }

    public static final rcg j() {
        rcg rcgVar = (rcg) b.get();
        return rcgVar == null ? j : rcgVar;
    }

    public static final bz7 k(bz7 bz7Var, bz7 bz7Var2, boolean z) {
        if (!z) {
            bz7Var2 = null;
        }
        return (bz7Var == null || bz7Var2 == null || bz7Var == bz7Var2) ? bz7Var == null ? bz7Var2 : bz7Var : new xcg(bz7Var, bz7Var2, 0);
    }

    public static final bz7 l(bz7 bz7Var, bz7 bz7Var2) {
        return (bz7Var == null || bz7Var2 == null || bz7Var == bz7Var2) ? bz7Var == null ? bz7Var2 : bz7Var : new xcg(bz7Var, bz7Var2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.kmg m(defpackage.kmg r10, defpackage.img r11) {
        /*
            kmg r0 = r11.a()
            long r1 = defpackage.ycg.e
            hjb r3 = defpackage.ycg.f
            int r4 = r3.a
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.c
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = defpackage.x44.A(r5, r1)
            if (r7 > 0) goto L48
            wcg r7 = defpackage.wcg.I
            boolean r5 = r7.g(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.a
            long r5 = r4.a
            int r1 = defpackage.x44.A(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            kmg r0 = r0.b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.a = r0
            return r3
        L55:
            kmg r10 = r10.c(r0)
            kmg r0 = r11.a()
            r10.b = r0
            r11.g(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ycg.m(kmg, img):kmg");
    }

    public static final void n(rcg rcgVar, img imgVar) {
        rcgVar.t(rcgVar.h() + 1);
        bz7 bz7VarI = rcgVar.i();
        if (bz7VarI != null) {
            bz7VarI.invoke(imgVar);
        }
    }

    public static final kmg o(kmg kmgVar, jmg jmgVar, rcg rcgVar, kmg kmgVar2) {
        kmg kmgVarM;
        if (rcgVar.f()) {
            rcgVar.n(jmgVar);
        }
        long jG = rcgVar.g();
        if (kmgVar2.a == jG) {
            return kmgVar2;
        }
        synchronized (c) {
            kmgVarM = m(kmgVar, jmgVar);
        }
        kmgVarM.a = jG;
        if (kmgVar2.a != 1) {
            rcgVar.n(jmgVar);
        }
        return kmgVarM;
    }

    public static final boolean p(img imgVar) {
        kmg kmgVar;
        long j2 = e;
        hjb hjbVar = f;
        if (hjbVar.a > 0) {
            j2 = ((long[]) hjbVar.c)[0];
        }
        kmg kmgVar2 = null;
        kmg kmgVarA = null;
        int i2 = 0;
        for (kmg kmgVarA2 = imgVar.a(); kmgVarA2 != null; kmgVarA2 = kmgVarA2.b) {
            long j3 = kmgVarA2.a;
            if (j3 != 0) {
                if (x44.A(j3, j2) >= 0) {
                    i2++;
                } else if (kmgVar2 == null) {
                    i2++;
                    kmgVar2 = kmgVarA2;
                } else {
                    if (x44.A(kmgVarA2.a, kmgVar2.a) < 0) {
                        kmgVar = kmgVar2;
                        kmgVar2 = kmgVarA2;
                    } else {
                        kmgVar = kmgVarA2;
                    }
                    if (kmgVarA == null) {
                        kmgVarA = imgVar.a();
                        kmg kmgVar3 = kmgVarA;
                        while (true) {
                            if (kmgVarA == null) {
                                kmgVarA = kmgVar3;
                                break;
                            }
                            if (x44.A(kmgVarA.a, j2) >= 0) {
                                break;
                            }
                            if (x44.A(kmgVar3.a, kmgVarA.a) < 0) {
                                kmgVar3 = kmgVarA;
                            }
                            kmgVarA = kmgVarA.b;
                        }
                    }
                    kmgVar2.a = 0L;
                    kmgVar2.a(kmgVarA);
                    kmgVar2 = kmgVar;
                }
            }
        }
        return i2 > 1;
    }

    public static final void q(img imgVar) {
        if (p(imgVar)) {
            l94 l94Var = g;
            int i2 = l94Var.b;
            int iIdentityHashCode = System.identityHashCode(imgVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = l94Var.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) l94Var.c)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        p6j p6jVar = ((p6j[]) l94Var.d)[i6];
                        if (imgVar == (p6jVar != null ? p6jVar.get() : null)) {
                            i3 = i6;
                        } else {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) l94Var.c)[i8] == iIdentityHashCode; i8--) {
                                p6j p6jVar2 = ((p6j[]) l94Var.d)[i8];
                                if ((p6jVar2 != null ? p6jVar2.get() : null) == imgVar) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = l94Var.b;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(l94Var.b + 1);
                                    break;
                                } else {
                                    if (((int[]) l94Var.c)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    p6j p6jVar3 = ((p6j[]) l94Var.d)[i6];
                                    if ((p6jVar3 != null ? p6jVar3.get() : null) == imgVar) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            p6j[] p6jVarArr = (p6j[]) l94Var.d;
            int length = p6jVarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                p6j[] p6jVarArr2 = new p6j[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(p6jVarArr, i10, p6jVarArr2, i12, i2 - i10);
                System.arraycopy((p6j[]) l94Var.d, 0, p6jVarArr2, 0, i10);
                mp0.r0(i12, i10, i2, (int[]) l94Var.c, iArr);
                mp0.u0(0, i10, 6, (int[]) l94Var.c, iArr);
                l94Var.d = p6jVarArr2;
                l94Var.c = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(p6jVarArr, i10, p6jVarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) l94Var.c;
                mp0.r0(i13, i10, i2, iArr2, iArr2);
            }
            ((p6j[]) l94Var.d)[i10] = new p6j(imgVar);
            ((int[]) l94Var.c)[i10] = iIdentityHashCode;
            l94Var.b++;
        }
    }

    public static final void r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final kmg s(kmg kmgVar, long j2, wcg wcgVar) {
        kmg kmgVar2 = null;
        while (kmgVar != null) {
            long j3 = kmgVar.a;
            if (j3 != 0 && x44.A(j3, j2) <= 0 && !wcgVar.g(j3) && (kmgVar2 == null || x44.A(kmgVar2.a, kmgVar.a) < 0)) {
                kmgVar2 = kmgVar;
            }
            kmgVar = kmgVar.b;
        }
        if (kmgVar2 != null) {
            return kmgVar2;
        }
        return null;
    }

    public static final kmg t(kmg kmgVar, img imgVar) {
        kmg kmgVarS;
        rcg rcgVarJ = j();
        bz7 bz7VarE = rcgVarJ.e();
        if (bz7VarE != null) {
            bz7VarE.invoke(imgVar);
        }
        kmg kmgVarS2 = s(kmgVar, rcgVarJ.g(), rcgVarJ.d());
        if (kmgVarS2 != null) {
            return kmgVarS2;
        }
        synchronized (c) {
            rcg rcgVarJ2 = j();
            kmg kmgVarA = imgVar.a();
            kmgVarA.getClass();
            kmgVarS = s(kmgVarA, rcgVarJ2.g(), rcgVarJ2.d());
            if (kmgVarS == null) {
                r();
                throw null;
            }
        }
        return kmgVarS;
    }

    public static final void u(int i2) {
        hjb hjbVar = f;
        int i3 = ((int[]) hjbVar.e)[i2];
        hjbVar.g(i3, hjbVar.a - 1);
        hjbVar.a--;
        long[] jArr = (long[]) hjbVar.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (x44.A(jArr[i5], j2) <= 0) {
                break;
            }
            hjbVar.g(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) hjbVar.c;
        int i6 = hjbVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < hjbVar.a && x44.A(jArr2[i7], jArr2[i8]) < 0) {
                if (x44.A(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                hjbVar.g(i7, i3);
                i3 = i7;
            } else {
                if (x44.A(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                hjbVar.g(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) hjbVar.e)[i2] = hjbVar.b;
        hjbVar.b = i2;
    }

    public static final Object v(w78 w78Var, bz7 bz7Var) {
        long j2 = w78Var.b;
        Object objInvoke = bz7Var.invoke(d.e(j2));
        long j3 = e;
        e = 1 + j3;
        wcg wcgVarE = d.e(j2);
        d = wcgVarE;
        w78Var.b = j3;
        w78Var.a = wcgVarE;
        w78Var.g = 0;
        w78Var.h = null;
        w78Var.o();
        d = d.k(j3);
        return objInvoke;
    }

    public static final kmg w(kmg kmgVar, img imgVar, rcg rcgVar) {
        kmg kmgVarS;
        if (rcgVar.f()) {
            rcgVar.n(imgVar);
        }
        long jG = rcgVar.g();
        kmg kmgVarS2 = s(kmgVar, jG, rcgVar.d());
        if (kmgVarS2 == null) {
            r();
            throw null;
        }
        if (kmgVarS2.a == rcgVar.g()) {
            return kmgVarS2;
        }
        synchronized (c) {
            kmgVarS = s(imgVar.a(), jG, rcgVar.d());
            if (kmgVarS == null) {
                r();
                throw null;
            }
            if (kmgVarS.a != jG) {
                kmg kmgVarM = m(kmgVarS, imgVar);
                kmgVarM.a(kmgVarS);
                kmgVarM.a = rcgVar.g();
                kmgVarS = kmgVarM;
            }
        }
        if (kmgVarS2.a != 1) {
            rcgVar.n(imgVar);
        }
        return kmgVarS;
    }
}
