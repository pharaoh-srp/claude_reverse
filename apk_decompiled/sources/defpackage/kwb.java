package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class kwb extends rcg {
    public static final int[] n = new int[0];
    public final bz7 e;
    public final bz7 f;
    public int g;
    public fwb h;
    public ArrayList i;
    public wcg j;
    public int[] k;
    public int l;
    public boolean m;

    public kwb(long j, wcg wcgVar, bz7 bz7Var, bz7 bz7Var2) {
        super(j, wcgVar);
        this.e = bz7Var;
        this.f = bz7Var2;
        this.j = wcg.I;
        this.k = n;
        this.l = 1;
    }

    public final void A(long j) {
        synchronized (ycg.c) {
            this.j = this.j.k(j);
        }
    }

    public void B(fwb fwbVar) {
        this.h = fwbVar;
    }

    public kwb C(bz7 bz7Var, bz7 bz7Var2) {
        wzb wzbVar;
        if (this.c) {
            zad.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            zad.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = ycg.c;
        synchronized (obj) {
            long j = ycg.e;
            ycg.e = j + 1;
            ycg.d = ycg.d.k(j);
            wcg wcgVarD = d();
            r(wcgVarD.k(j));
            wzbVar = new wzb(j, ycg.d(wcgVarD, g() + 1, j), ycg.k(bz7Var, e(), true), ycg.l(bz7Var2, i()), this);
        }
        if (this.m || this.c) {
            return wzbVar;
        }
        long jG = g();
        synchronized (obj) {
            long j2 = ycg.e;
            ycg.e = j2 + 1;
            s(j2);
            ycg.d = ycg.d.k(g());
        }
        r(ycg.d(d(), jG + 1, g()));
        return wzbVar;
    }

    @Override // defpackage.rcg
    public final void b() {
        ycg.d = ycg.d.e(g()).a(this.j);
    }

    @Override // defpackage.rcg
    public void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        synchronized (ycg.c) {
            o();
        }
        l();
    }

    @Override // defpackage.rcg
    public boolean f() {
        return false;
    }

    @Override // defpackage.rcg
    public int h() {
        return this.g;
    }

    @Override // defpackage.rcg
    public bz7 i() {
        return this.f;
    }

    @Override // defpackage.rcg
    public void k() {
        this.l++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // defpackage.rcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.l
            if (r1 <= 0) goto L7
            goto Lc
        L7:
            java.lang.String r1 = "no pending nested snapshots"
            defpackage.zad.a(r1)
        Lc:
            int r1 = r0.l
            int r1 = r1 + (-1)
            r0.l = r1
            if (r1 != 0) goto L94
            boolean r1 = r0.m
            if (r1 != 0) goto L94
            fwb r1 = r0.x()
            if (r1 == 0) goto L91
            boolean r2 = r0.m
            if (r2 == 0) goto L27
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            defpackage.zad.b(r2)
        L27:
            r2 = 0
            r0.B(r2)
            long r2 = r0.g()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L91
            r7 = 0
        L39:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L53:
            if (r12 >= r10) goto L8a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L86
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            img r13 = (defpackage.img) r13
            kmg r13 = r13.a()
        L69:
            if (r13 == 0) goto L86
            long r14 = r13.a
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7d
            wcg r6 = r0.j
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = defpackage.w44.G0(r6, r14)
            if (r6 == 0) goto L83
        L7d:
            a6f r6 = defpackage.ycg.a
            r14 = 0
            r13.a = r14
        L83:
            kmg r13 = r13.b
            goto L69
        L86:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L53
        L8a:
            if (r10 != r11) goto L91
        L8c:
            if (r7 == r5) goto L91
            int r7 = r7 + 1
            goto L39
        L91:
            r0.a()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwb.l():void");
    }

    @Override // defpackage.rcg
    public void m() {
        if (this.m || this.c) {
            return;
        }
        v();
    }

    @Override // defpackage.rcg
    public void n(img imgVar) {
        fwb fwbVarX = x();
        if (fwbVarX == null) {
            fwb fwbVar = v6f.a;
            fwbVarX = new fwb();
            B(fwbVarX);
        }
        fwbVarX.a(imgVar);
    }

    @Override // defpackage.rcg
    public final void p() {
        int length = this.k.length;
        for (int i = 0; i < length; i++) {
            ycg.u(this.k[i]);
        }
        o();
    }

    @Override // defpackage.rcg
    public void t(int i) {
        this.g = i;
    }

    @Override // defpackage.rcg
    public rcg u(bz7 bz7Var) {
        xzb xzbVar;
        if (this.c) {
            zad.a("Cannot use a disposed snapshot");
        }
        if (this.m && this.d < 0) {
            zad.b("Unsupported operation on a disposed or applied snapshot");
        }
        long jG = g();
        A(g());
        Object obj = ycg.c;
        synchronized (obj) {
            long j = ycg.e;
            ycg.e = j + 1;
            ycg.d = ycg.d.k(j);
            xzbVar = new xzb(j, ycg.d(d(), jG + 1, j), ycg.k(bz7Var, e(), true), this);
        }
        if (this.m || this.c) {
            return xzbVar;
        }
        long jG2 = g();
        synchronized (obj) {
            long j2 = ycg.e;
            ycg.e = j2 + 1;
            s(j2);
            ycg.d = ycg.d.k(g());
        }
        r(ycg.d(d(), jG2 + 1, g()));
        return xzbVar;
    }

    public final void v() {
        A(g());
        if (this.m || this.c) {
            return;
        }
        long jG = g();
        synchronized (ycg.c) {
            long j = ycg.e;
            ycg.e = j + 1;
            s(j);
            ycg.d = ycg.d.k(g());
        }
        r(ycg.d(d(), jG + 1, g()));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.iuj w() {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kwb.w():iuj");
    }

    public fwb x() {
        return this.h;
    }

    @Override // defpackage.rcg
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public bz7 e() {
        return this.e;
    }

    public final iuj z(long j, fwb fwbVar, HashMap map, wcg wcgVar) {
        ArrayList arrayList;
        ArrayList arrayListA1;
        ArrayList arrayList2;
        wcg wcgVar2;
        Object[] objArr;
        long[] jArr;
        wcg wcgVar3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j2;
        ArrayList arrayList3;
        kmg kmgVarE;
        wcg wcgVarH = d().k(g()).h(this.j);
        Object[] objArr3 = fwbVar.b;
        long[] jArr3 = fwbVar.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            arrayList2 = null;
            arrayListA1 = null;
            while (true) {
                long j3 = jArr3[i2];
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((j3 & 255) < 128) {
                            objArr2 = objArr3;
                            img imgVar = (img) objArr3[(i2 << 3) + i4];
                            jArr2 = jArr3;
                            kmg kmgVarA = imgVar.a();
                            i = i4;
                            ArrayList arrayList4 = arrayList2;
                            kmg kmgVarS = ycg.s(kmgVarA, j, wcgVar);
                            if (kmgVarS == null) {
                                arrayList3 = arrayListA1;
                                j2 = j3;
                            } else {
                                arrayList3 = arrayListA1;
                                j2 = j3;
                                kmg kmgVarS2 = ycg.s(kmgVarA, g(), wcgVarH);
                                if (kmgVarS2 != null && kmgVarS2.a != 1 && !kmgVarS.equals(kmgVarS2)) {
                                    wcgVar3 = wcgVarH;
                                    kmg kmgVarS3 = ycg.s(kmgVarA, g(), d());
                                    if (kmgVarS3 == null) {
                                        ycg.r();
                                        throw null;
                                    }
                                    if (map == null || (kmgVarE = (kmg) map.get(kmgVarS)) == null) {
                                        kmgVarE = imgVar.e(kmgVarS2, kmgVarS, kmgVarS3);
                                    }
                                    if (kmgVarE == null) {
                                        return new scg(this);
                                    }
                                    if (!kmgVarE.equals(kmgVarS3)) {
                                        if (kmgVarE.equals(kmgVarS)) {
                                            ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList5.add(new cpc(imgVar, kmgVarS.c(g())));
                                            arrayListA1 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayListA1.add(imgVar);
                                            arrayList2 = arrayList5;
                                        } else {
                                            arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                            arrayList2.add(!kmgVarE.equals(kmgVarS2) ? new cpc(imgVar, kmgVarE) : new cpc(imgVar, kmgVarS2.c(g())));
                                        }
                                    }
                                    arrayListA1 = arrayList3;
                                }
                                arrayList2 = arrayList4;
                                arrayListA1 = arrayList3;
                            }
                            wcgVar3 = wcgVarH;
                            arrayList2 = arrayList4;
                            arrayListA1 = arrayList3;
                        } else {
                            wcgVar3 = wcgVarH;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i4;
                            j2 = j3;
                        }
                        j3 = j2 >> 8;
                        i4 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        wcgVarH = wcgVar3;
                    }
                    wcgVar2 = wcgVarH;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i3 != 8) {
                        break;
                    }
                } else {
                    wcgVar2 = wcgVarH;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i2 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i2++;
                jArr3 = jArr;
                objArr3 = objArr;
                wcgVarH = wcgVar2;
            }
        } else {
            arrayList = null;
            arrayListA1 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            v();
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                cpc cpcVar = (cpc) arrayList2.get(i5);
                img imgVar2 = (img) cpcVar.E;
                kmg kmgVar = (kmg) cpcVar.F;
                kmgVar.a = j;
                synchronized (ycg.c) {
                    kmgVar.b = imgVar2.a();
                    imgVar2.g(kmgVar);
                }
            }
        }
        if (arrayListA1 != null) {
            int size2 = arrayListA1.size();
            for (int i6 = 0; i6 < size2; i6++) {
                fwbVar.m((img) arrayListA1.get(i6));
            }
            ArrayList arrayList6 = this.i;
            if (arrayList6 != null) {
                arrayListA1 = w44.a1(arrayList6, arrayListA1);
            }
            this.i = arrayListA1;
        }
        return tcg.k;
    }
}
