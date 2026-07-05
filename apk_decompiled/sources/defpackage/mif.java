package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class mif {
    public final tif a;
    public gf8 e;
    public bz7 f;
    public wkh g;
    public fcc l;
    public cu9 m;
    public iif u;
    public boolean v;
    public l45 w;
    public p5d x;
    public boolean y;
    public final lsc b = mpk.P(null);
    public final lsc c = mpk.P(Boolean.TRUE);
    public bz7 d = new uhf(this, 7);
    public final o1i h = new o1i();
    public final bt7 i = new bt7();
    public final lsc j = mpk.P(Boolean.FALSE);
    public final wz5 k = mpk.w(new rhf(this, 3));
    public final lsc n = new lsc(iei.a, ql8.J);
    public final lsc o = mpk.P(new fcc(0));
    public final lsc p = mpk.P(new fcc(0));
    public final lsc q = mpk.P(null);
    public final lsc r = mpk.P(null);
    public final lsc s = mpk.P(null);
    public final lsc t = mpk.P(null);

    public mif(tif tifVar) {
        this.a = tifVar;
        int i = 8;
        tifVar.e = new uhf(this, i);
        tifVar.f = new ci(i, this);
        int i2 = 1;
        tifVar.g = new bz3(i2, this);
        tifVar.h = new rhf(this, 4);
        tifVar.i = new uhf(this, i2);
        tifVar.j = new uhf(this, 2);
    }

    public final long a(cu9 cu9Var, long j) {
        cu9 cu9Var2 = this.m;
        if (cu9Var2 == null || !cu9Var2.n()) {
            return 9205357640488583168L;
        }
        return o().G(cu9Var, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r13 = this;
            ohf r0 = r13.j()
            r1 = 0
            if (r0 == 0) goto L11
            tif r0 = r13.a
            evb r2 = r0.a()
            int r2 = r2.e
            if (r2 != 0) goto L14
        L11:
            r0 = r1
            goto La0
        L14:
            xb0 r2 = new xb0
            r2.<init>()
            cu9 r3 = r13.o()
            java.util.ArrayList r3 = r0.d(r3)
            int r4 = r3.size()
            java.util.ListIterator r4 = r3.listIterator(r4)
        L29:
            boolean r5 = r4.hasPrevious()
            r6 = -1
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.previous()
            ztb r5 = (defpackage.ztb) r5
            evb r7 = r0.a()
            long r8 = r5.a
            java.lang.Object r5 = r7.e(r8)
            ohf r5 = (defpackage.ohf) r5
            if (r5 == 0) goto L29
            nhf r7 = r5.a
            int r7 = r7.b
            nhf r5 = r5.b
            int r5 = r5.b
            if (r7 == r5) goto L29
            int r4 = r4.nextIndex()
            goto L54
        L53:
            r4 = r6
        L54:
            if (r4 == r6) goto L9c
            int r5 = r3.size()
            r6 = 0
            r7 = r6
        L5c:
            if (r7 >= r5) goto L9c
            java.lang.Object r8 = r3.get(r7)
            ztb r8 = (defpackage.ztb) r8
            evb r9 = r0.a()
            long r10 = r8.a
            java.lang.Object r9 = r9.e(r10)
            ohf r9 = (defpackage.ohf) r9
            if (r9 == 0) goto L99
            zb0 r8 = r8.i()
            nhf r10 = r9.a
            int r10 = r10.b
            nhf r9 = r9.b
            int r9 = r9.b
            long r9 = defpackage.mwa.m(r10, r9)
            if (r7 < r4) goto L86
            r11 = 1
            goto L87
        L86:
            r11 = r6
        L87:
            int r12 = defpackage.kkh.g(r9)
            int r9 = defpackage.kkh.f(r9)
            r2.f(r8, r12, r9)
            if (r11 != 0) goto L99
            r8 = 10
            r2.c(r8)
        L99:
            int r7 = r7 + 1
            goto L5c
        L9c:
            zb0 r0 = r2.n()
        La0:
            if (r0 == 0) goto Lb4
            java.lang.String r2 = r0.F
            int r2 = r2.length()
            if (r2 <= 0) goto Lab
            r1 = r0
        Lab:
            if (r1 == 0) goto Lb4
            bz7 r13 = r13.f
            if (r13 == 0) goto Lb4
            r13.invoke(r1)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mif.b():void");
    }

    public final ztb c(nhf nhfVar) {
        return (ztb) this.a.c.e(nhfVar.c);
    }

    public final cu9 d() {
        return this.m;
    }

    public final l9e e() {
        cu9 cu9Var;
        l9e l9eVar;
        l9e l9eVar2;
        int i;
        cu9 cu9VarE;
        int[] iArr;
        int i2;
        int[] iArr2;
        int i3;
        l9e l9eVarB;
        l9e l9eVar3 = u00.e;
        this.n.getValue();
        if (j() != null && (cu9Var = this.m) != null && cu9Var.n()) {
            cu9 cu9VarO = o();
            tif tifVar = this.a;
            ArrayList arrayListD = tifVar.d(cu9VarO);
            ArrayList arrayList = new ArrayList(arrayListD.size());
            int size = arrayListD.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                ztb ztbVar = (ztb) arrayListD.get(i5);
                ohf ohfVar = (ohf) tifVar.a().e(ztbVar.a);
                cpc cpcVar = ohfVar != null ? new cpc(ztbVar, ohfVar) : null;
                if (cpcVar != null) {
                    arrayList.add(cpcVar);
                }
            }
            int size2 = arrayList.size();
            int i6 = 1;
            List listX = arrayList;
            listX = arrayList;
            if (size2 != 0 && size2 != 1) {
                listX = x44.X(w44.L0(arrayList), w44.U0(arrayList));
            }
            if (!listX.isEmpty()) {
                if (listX.isEmpty()) {
                    l9eVar2 = l9eVar3;
                    l9eVar = null;
                } else {
                    int size3 = listX.size();
                    int i7 = 0;
                    float fMin = Float.POSITIVE_INFINITY;
                    float fMin2 = Float.POSITIVE_INFINITY;
                    float fMax = Float.NEGATIVE_INFINITY;
                    float fMax2 = Float.NEGATIVE_INFINITY;
                    while (i7 < size3) {
                        cpc cpcVar2 = (cpc) listX.get(i7);
                        ztb ztbVar2 = (ztb) cpcVar2.E;
                        ohf ohfVar2 = (ohf) cpcVar2.F;
                        int i8 = ohfVar2.a.b;
                        int i9 = ohfVar2.b.b;
                        if (i8 == i9 || (cu9VarE = ztbVar2.e()) == null) {
                            i = size3;
                        } else {
                            int iMin = Math.min(i8, i9);
                            int iMax = Math.max(i8, i9) - i6;
                            if (iMin == iMax) {
                                iArr = new int[i6];
                                iArr[i4] = iMin;
                            } else {
                                int[] iArr3 = new int[2];
                                iArr3[i4] = iMin;
                                iArr3[i6] = iMax;
                                iArr = iArr3;
                            }
                            int length = iArr.length;
                            int i10 = i4;
                            float fMin3 = Float.POSITIVE_INFINITY;
                            float fMin4 = Float.POSITIVE_INFINITY;
                            float fMax3 = Float.NEGATIVE_INFINITY;
                            float fMax4 = Float.NEGATIVE_INFINITY;
                            while (i10 < length) {
                                int i11 = iArr[i10];
                                yjh yjhVar = (yjh) ztbVar2.c.a();
                                if (yjhVar == null) {
                                    i2 = size3;
                                    iArr2 = iArr;
                                } else {
                                    i2 = size3;
                                    int length2 = yjhVar.a.a.F.length();
                                    iArr2 = iArr;
                                    if (length2 >= 1) {
                                        i3 = 0;
                                        l9eVarB = yjhVar.b(wd6.e0(i11, 0, length2 - 1));
                                    }
                                    fMin3 = Math.min(fMin3, l9eVarB.a);
                                    fMin4 = Math.min(fMin4, l9eVarB.b);
                                    fMax3 = Math.max(fMax3, l9eVarB.c);
                                    fMax4 = Math.max(fMax4, l9eVarB.d);
                                    i10++;
                                    i4 = i3;
                                    size3 = i2;
                                    iArr = iArr2;
                                }
                                l9eVarB = l9e.e;
                                i3 = 0;
                                fMin3 = Math.min(fMin3, l9eVarB.a);
                                fMin4 = Math.min(fMin4, l9eVarB.b);
                                fMax3 = Math.max(fMax3, l9eVarB.c);
                                fMax4 = Math.max(fMax4, l9eVarB.d);
                                i10++;
                                i4 = i3;
                                size3 = i2;
                                iArr = iArr2;
                            }
                            i = size3;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin3)) << 32) | (((long) Float.floatToRawIntBits(fMin4)) & 4294967295L);
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMax3);
                            long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(fMax4)) & 4294967295L;
                            long jG = cu9Var.G(cu9VarE, jFloatToRawIntBits);
                            long jG2 = cu9Var.G(cu9VarE, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32));
                            fMin = Math.min(fMin, Float.intBitsToFloat((int) (jG >> 32)));
                            fMin2 = Math.min(fMin2, Float.intBitsToFloat((int) (jG & 4294967295L)));
                            fMax = Math.max(fMax, Float.intBitsToFloat((int) (jG2 >> 32)));
                            fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jG2 & 4294967295L)));
                        }
                        i7++;
                        size3 = i;
                        i6 = 1;
                        i4 = 0;
                    }
                    l9eVar = null;
                    l9eVar2 = new l9e(fMin, fMin2, fMax, fMax2);
                }
                if (l9eVar2.equals(l9eVar3)) {
                    return l9eVar;
                }
                l9e l9eVarI = u00.R(cu9Var).i(l9eVar2);
                if (l9eVarI.c - l9eVarI.a < MTTypesetterKt.kLineSkipLimitMultiplier || l9eVarI.d - l9eVarI.b < MTTypesetterKt.kLineSkipLimitMultiplier) {
                    return l9eVar;
                }
                l9e l9eVarM = l9eVarI.m(cu9Var.K(0L));
                float f = l9eVarM.d;
                dkf dkfVar = hif.a;
                return l9e.b(l9eVarM, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, f + 100.0f, 7);
            }
        }
        return null;
    }

    public final iqb f() {
        tp4 tp4Var = null;
        return xwj.g(rwj.o(new bff(this, tp4Var, 1)), this.h, new hm(this, tp4Var, 4), null, new uhf(this, 3));
    }

    public final cpc g() {
        int iNextIndex;
        int iG;
        int length;
        if (j() == null) {
            return null;
        }
        tif tifVar = this.a;
        if (tifVar.b.isEmpty()) {
            return null;
        }
        xb0 xb0Var = new xb0();
        ArrayList arrayListD = tifVar.d(o());
        ListIterator listIterator = arrayListD.listIterator(arrayListD.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            ohf ohfVar = (ohf) tifVar.a().e(((ztb) listIterator.previous()).a);
            if (ohfVar != null && ohfVar.a.b != ohfVar.b.b) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex != -1) {
            int size = arrayListD.size();
            iG = -1;
            length = -1;
            int i = 0;
            while (i < size) {
                ztb ztbVar = (ztb) arrayListD.get(i);
                ohf ohfVar2 = (ohf) tifVar.a().e(ztbVar.a);
                if (ohfVar2 != null) {
                    zb0 zb0VarI = ztbVar.i();
                    long jM = mwa.m(ohfVar2.a.b, ohfVar2.b.b);
                    boolean z = i >= iNextIndex;
                    if (iG == -1) {
                        iG = kkh.g(jM);
                        xb0Var.f(zb0VarI, 0, kkh.g(jM));
                    }
                    xb0Var.f(zb0VarI, kkh.g(jM), kkh.f(jM));
                    if (z) {
                        length = xb0Var.E.length();
                        xb0Var.f(zb0VarI, kkh.f(jM), zb0VarI.F.length());
                    } else {
                        xb0Var.c('\n');
                    }
                }
                i++;
            }
        } else {
            iG = -1;
            length = -1;
        }
        zb0 zb0VarN = xb0Var.n();
        if (iG == -1 || length == -1) {
            return null;
        }
        return new cpc(zb0VarN, new kkh(mwa.m(iG, length)));
    }

    public final fcc h() {
        return (fcc) this.t.getValue();
    }

    public final te8 i() {
        return (te8) this.s.getValue();
    }

    public final ohf j() {
        return (ohf) this.b.getValue();
    }

    public final boolean k() {
        ohf ohfVar;
        cu9 cu9VarO = o();
        tif tifVar = this.a;
        ArrayList arrayListD = tifVar.d(cu9VarO);
        if (arrayListD.isEmpty()) {
            return true;
        }
        int size = arrayListD.size();
        for (int i = 0; i < size; i++) {
            ztb ztbVar = (ztb) arrayListD.get(i);
            zb0 zb0VarI = ztbVar.i();
            if (zb0VarI.F.length() != 0 && ((ohfVar = (ohf) tifVar.a().e(ztbVar.a)) == null || Math.abs(ohfVar.a.b - ohfVar.b.b) != zb0VarI.F.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean l() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean m() {
        ohf ohfVarJ = j();
        if (ohfVarJ != null) {
            nhf nhfVar = ohfVarJ.b;
            nhf nhfVar2 = ohfVarJ.a;
            if (!x44.r(nhfVar2, nhfVar)) {
                if (nhfVar2.c == nhfVar.c) {
                    return true;
                }
                cu9 cu9VarO = o();
                tif tifVar = this.a;
                ArrayList arrayListD = tifVar.d(cu9VarO);
                int size = arrayListD.size();
                for (int i = 0; i < size; i++) {
                    ohf ohfVar = (ohf) tifVar.a().e(((ztb) arrayListD.get(i)).a);
                    if (ohfVar != null && ohfVar.a.b != ohfVar.b.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void n() {
        gf8 gf8Var;
        evb evbVar = kka.a;
        evbVar.getClass();
        this.a.k.setValue(evbVar);
        this.y = false;
        u();
        if (j() != null) {
            this.d.invoke(null);
            if (!l() || (gf8Var = this.e) == null) {
                return;
            }
            gf8Var.a(9);
        }
    }

    public final cu9 o() {
        cu9 cu9Var = this.m;
        if (cu9Var == null) {
            throw vb7.x("null coordinates");
        }
        if (!cu9Var.n()) {
            e39.a("unattached coordinates");
        }
        return cu9Var;
    }

    public final void p() {
        ohf ohfVar;
        ArrayList arrayList;
        int i;
        cu9 cu9VarO = o();
        tif tifVar = this.a;
        ArrayList arrayListD = tifVar.d(cu9VarO);
        if (arrayListD.isEmpty()) {
            return;
        }
        evb evbVar = kka.a;
        evb evbVar2 = new evb();
        int size = arrayListD.size();
        int i2 = 0;
        ohf ohfVar2 = null;
        ohf ohfVar3 = null;
        while (i2 < size) {
            ztb ztbVar = (ztb) arrayListD.get(i2);
            long j = ztbVar.a;
            yjh yjhVar = (yjh) ztbVar.c.a();
            if (yjhVar == null) {
                arrayList = arrayListD;
                i = size;
                ohfVar = null;
            } else {
                int length = yjhVar.a.a.F.length();
                arrayList = arrayListD;
                i = size;
                ohfVar = new ohf(new nhf(yjhVar.a(0), 0, j), new nhf(yjhVar.a(Math.max(length - 1, 0)), length, j), false);
            }
            if (ohfVar != null) {
                if (ohfVar2 == null) {
                    ohfVar2 = ohfVar;
                }
                long j2 = ztbVar.a;
                int iC = evbVar2.c(j2);
                Object[] objArr = evbVar2.c;
                Object obj = objArr[iC];
                evbVar2.b[iC] = j2;
                objArr[iC] = ohfVar;
                ohfVar3 = ohfVar;
            }
            i2++;
            arrayListD = arrayList;
            size = i;
        }
        if (evbVar2.e == 0) {
            return;
        }
        if (ohfVar2 != ohfVar3) {
            ohfVar2.getClass();
            nhf nhfVar = ohfVar2.a;
            ohfVar3.getClass();
            ohfVar2 = new ohf(nhfVar, ohfVar3.b, false);
        }
        tifVar.k.setValue(evbVar2);
        this.d.invoke(ohfVar2);
        this.u = null;
    }

    public final void q(boolean z) {
        lsc lscVar = this.c;
        if (((Boolean) lscVar.getValue()).booleanValue() != z) {
            lscVar.setValue(Boolean.valueOf(z));
            u();
        }
    }

    public final void r(ohf ohfVar) {
        this.b.setValue(ohfVar);
        if (ohfVar != null) {
            s();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r20 = this;
            r0 = r20
            ohf r1 = r0.j()
            cu9 r2 = r0.m
            r3 = 0
            if (r1 == 0) goto L14
            nhf r4 = r1.a
            if (r4 == 0) goto L14
            ztb r4 = r0.c(r4)
            goto L15
        L14:
            r4 = r3
        L15:
            if (r1 == 0) goto L20
            nhf r5 = r1.b
            if (r5 == 0) goto L20
            ztb r5 = r0.c(r5)
            goto L21
        L20:
            r5 = r3
        L21:
            if (r4 == 0) goto L28
            cu9 r6 = r4.e()
            goto L29
        L28:
            r6 = r3
        L29:
            if (r5 == 0) goto L30
            cu9 r7 = r5.e()
            goto L31
        L30:
            r7 = r3
        L31:
            lsc r8 = r0.r
            lsc r9 = r0.q
            if (r1 == 0) goto Lab
            if (r2 == 0) goto Lab
            boolean r10 = r2.n()
            if (r10 == 0) goto Lab
            if (r6 != 0) goto L44
            if (r7 != 0) goto L44
            goto Lab
        L44:
            l9e r10 = defpackage.u00.R(r2)
            r13 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L78
            r15 = 1
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            long r11 = r4.b(r1, r15)
            long r18 = r11 & r13
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L7d
        L60:
            long r11 = r2.G(r6, r11)
            fcc r4 = new fcc
            r4.<init>(r11)
            te8 r6 = r0.i()
            te8 r15 = defpackage.te8.F
            if (r6 == r15) goto L7e
            boolean r6 = defpackage.u00.j(r11, r10)
            if (r6 == 0) goto L7d
            goto L7e
        L78:
            r16 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L7d:
            r4 = r3
        L7e:
            r9.setValue(r4)
            if (r7 == 0) goto La7
            r4 = 0
            long r4 = r5.b(r1, r4)
            long r11 = r4 & r13
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 != 0) goto L8f
            goto La7
        L8f:
            long r1 = r2.G(r7, r4)
            fcc r4 = new fcc
            r4.<init>(r1)
            te8 r0 = r0.i()
            te8 r5 = defpackage.te8.G
            if (r0 == r5) goto La6
            boolean r0 = defpackage.u00.j(r1, r10)
            if (r0 == 0) goto La7
        La6:
            r3 = r4
        La7:
            r8.setValue(r3)
            return
        Lab:
            r9.setValue(r3)
            r8.setValue(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mif.s():void");
    }

    public final boolean t(long j, long j2, boolean z, phf phfVar) {
        ArrayList arrayList;
        iif d8gVar;
        tif tifVar;
        yjh yjhVar;
        long j3;
        ArrayList arrayList2;
        int i;
        long jH;
        int i2;
        long j4;
        float f;
        c56 c56Var;
        jif jifVar;
        long j5;
        c56 c56Var2;
        c56 c56Var3;
        tif tifVar2;
        boolean z2;
        ArrayList arrayList3;
        c56 c56Var4;
        c56 c56VarH;
        ArrayList arrayList4;
        c56 c56VarH2;
        c56 c56Var5;
        int i3;
        c56 c56Var6;
        int i4;
        int i5;
        int i6;
        nhf nhfVar;
        int i7;
        nhf nhfVar2;
        this.s.setValue(z ? te8.F : te8.G);
        this.t.setValue(new fcc(j));
        cu9 cu9VarO = o();
        tif tifVar3 = this.a;
        ArrayList arrayListD = tifVar3.d(cu9VarO);
        int i8 = ika.a;
        cvb cvbVar = new cvb(6);
        int size = arrayListD.size();
        for (int i9 = 0; i9 < size; i9++) {
            cvbVar.e(i9, ((ztb) arrayListD.get(i9)).a);
        }
        long j6 = 9223372034707292159L;
        long j7 = 9205357640488583168L;
        jif jifVar2 = new jif(j, j2, cu9VarO, z, (j2 & 9223372034707292159L) == 9205357640488583168L ? null : j(), new pa9(5, cvbVar));
        int size2 = arrayListD.size();
        int i10 = 0;
        while (true) {
            arrayList = jifVar2.h;
            if (i10 >= size2) {
                break;
            }
            ztb ztbVar = (ztb) arrayListD.get(i10);
            cu9 cu9VarE = ztbVar.e();
            if (cu9VarE == null || (yjhVar = (yjh) ztbVar.c.a()) == null) {
                tifVar2 = tifVar3;
                i2 = size2;
                i3 = i10;
                arrayList4 = arrayListD;
                j3 = j6;
                j4 = j7;
            } else {
                j3 = j6;
                long jG = jifVar2.c.G(cu9VarE, 0L);
                long jH2 = fcc.h(jifVar2.a, jG);
                long j8 = jifVar2.b;
                if ((j8 & j3) == j7) {
                    i = 0;
                    arrayList2 = arrayListD;
                    jH = j7;
                } else {
                    arrayList2 = arrayListD;
                    i = 0;
                    jH = fcc.h(j8, jG);
                }
                long j9 = ztbVar.a;
                i2 = size2;
                int i11 = i10;
                long j10 = yjhVar.c;
                float f2 = (int) (j10 >> 32);
                float f3 = (int) (j10 & 4294967295L);
                int i12 = (int) (jH2 >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i12);
                c56 c56Var7 = c56.G;
                c56 c56Var8 = c56.E;
                j4 = j7;
                c56 c56Var9 = c56.F;
                if (fIntBitsToFloat < MTTypesetterKt.kLineSkipLimitMultiplier) {
                    f = 0.0f;
                    c56Var = c56Var8;
                } else if (Float.intBitsToFloat(i12) > f2) {
                    f = 0.0f;
                    c56Var = c56Var7;
                } else {
                    f = 0.0f;
                    c56Var = c56Var9;
                }
                int i13 = (int) (jH2 & 4294967295L);
                c56 c56Var10 = Float.intBitsToFloat(i13) < f ? c56Var8 : Float.intBitsToFloat(i13) > f3 ? c56Var7 : c56Var9;
                boolean z3 = jifVar2.d;
                ohf ohfVar = jifVar2.e;
                if (z3) {
                    jifVar = jifVar2;
                    j5 = j9;
                    tifVar2 = tifVar3;
                    c56VarH = dtk.h(c56Var, c56Var10, jifVar, j5, ohfVar != null ? ohfVar.b : null);
                    z2 = z3;
                    i3 = i11;
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    c56Var6 = c56Var;
                    c56Var2 = c56Var6;
                    c56Var3 = c56Var10;
                    c56Var5 = c56Var3;
                    c56VarH2 = c56VarH;
                    c56Var4 = c56VarH2;
                } else {
                    jifVar = jifVar2;
                    j5 = j9;
                    c56Var2 = c56Var;
                    c56Var3 = c56Var10;
                    tifVar2 = tifVar3;
                    z2 = z3;
                    arrayList3 = arrayList;
                    c56Var4 = c56Var2;
                    c56VarH = c56Var3;
                    arrayList4 = arrayList2;
                    c56VarH2 = dtk.h(c56Var, c56Var10, jifVar, j5, ohfVar != null ? ohfVar.a : null);
                    c56Var5 = c56VarH2;
                    i3 = i11;
                    c56Var6 = c56Var5;
                }
                jifVar2 = jifVar;
                c56 c56VarK = dwk.k(c56Var2, c56Var3);
                if (c56VarK == c56Var9 || c56VarK != c56VarH2) {
                    int length = yjhVar.a.a.F.length();
                    pa9 pa9Var = jifVar2.f;
                    if (z2) {
                        int i14 = dtk.i(jH2, yjhVar);
                        if (ohfVar == null || (nhfVar2 = ohfVar.b) == null) {
                            i7 = i14;
                            length = i7;
                        } else {
                            i7 = i14;
                            int iCompare = pa9Var.compare(Long.valueOf(nhfVar2.c), Long.valueOf(j5));
                            if (iCompare < 0) {
                                length = i;
                            } else if (iCompare <= 0) {
                                length = nhfVar2.b;
                            }
                        }
                        i6 = length;
                        i5 = i7;
                    } else {
                        int i15 = dtk.i(jH2, yjhVar);
                        if (ohfVar == null || (nhfVar = ohfVar.a) == null) {
                            i4 = i15;
                            i5 = i4;
                        } else {
                            i4 = i15;
                            int iCompare2 = pa9Var.compare(Long.valueOf(nhfVar.c), Long.valueOf(j5));
                            if (iCompare2 < 0) {
                                length = i;
                            } else if (iCompare2 <= 0) {
                                length = nhfVar.b;
                            }
                            i5 = length;
                        }
                        i6 = i4;
                    }
                    int i16 = (jH & j3) == j4 ? -1 : dtk.i(jH, yjhVar);
                    int i17 = jifVar2.k + 2;
                    jifVar2.k = i17;
                    long j11 = j5;
                    tgf tgfVar = new tgf(j11, i17, i5, i6, i16, yjhVar);
                    jifVar2.i = jifVar2.a(jifVar2.i, c56Var6, c56Var5);
                    jifVar2.j = jifVar2.a(jifVar2.j, c56Var4, c56VarH);
                    jifVar2.g.e(arrayList3.size(), j11);
                    arrayList3.add(tgfVar);
                }
            }
            i10 = i3 + 1;
            size2 = i2;
            j6 = j3;
            j7 = j4;
            arrayListD = arrayList4;
            tifVar3 = tifVar2;
        }
        tif tifVar4 = tifVar3;
        int i18 = jifVar2.k + 1;
        int size3 = arrayList.size();
        if (size3 == 0) {
            d8gVar = null;
        } else if (size3 != 1) {
            int i19 = jifVar2.i;
            int i20 = i19 == -1 ? i18 : i19;
            int i21 = jifVar2.j;
            d8gVar = new ttb(jifVar2.g, arrayList, i20, i21 == -1 ? i18 : i21, jifVar2.d, jifVar2.e);
        } else {
            tgf tgfVar2 = (tgf) w44.e1(arrayList);
            int i22 = jifVar2.i;
            int i23 = i22 == -1 ? i18 : i22;
            int i24 = jifVar2.j;
            d8gVar = new d8g(jifVar2.d, i23, i24 == -1 ? i18 : i24, jifVar2.e, tgfVar2);
        }
        if (d8gVar == null || !d8gVar.l(this.u)) {
            return false;
        }
        ohf ohfVarA = phfVar.a(d8gVar);
        if (!x44.r(ohfVarA, j())) {
            if (l()) {
                tifVar = tifVar4;
                ArrayList arrayList5 = tifVar.b;
                int size4 = arrayList5.size();
                int i25 = 0;
                while (true) {
                    if (i25 >= size4) {
                        break;
                    }
                    if (((ztb) arrayList5.get(i25)).i().F.length() > 0) {
                        gf8 gf8Var = this.e;
                        if (gf8Var != null) {
                            gf8Var.a(9);
                        }
                    } else {
                        i25++;
                    }
                }
            } else {
                tifVar = tifVar4;
            }
            tifVar.k.setValue(d8gVar.m(ohfVarA));
            this.d.invoke(ohfVarA);
            this.v = false;
        }
        this.u = d8gVar;
        return true;
    }

    public final void u() {
        mif mifVar;
        ogf ogfVar;
        ogf ogfVar2;
        fkg fkgVar;
        if (((Boolean) this.j.getValue()).booleanValue()) {
            if (knk.j) {
                boolean z = this.y;
                o1i o1iVar = this.h;
                if (z && l()) {
                    if (((l9e) this.k.getValue()) == null) {
                        return;
                    }
                    o1iVar.a();
                    return;
                } else {
                    peh pehVar = o1iVar.a;
                    if (pehVar == null || (fkgVar = pehVar.Y) == null) {
                        return;
                    }
                    fkgVar.d(null);
                    pehVar.Y = null;
                    return;
                }
            }
            wkh wkhVar = this.g;
            if (wkhVar == null) {
                return;
            }
            if (!this.y || !l()) {
                if (wkhVar.e() == zkh.E) {
                    wkhVar.c();
                    return;
                }
                return;
            }
            l9e l9eVarE = e();
            if (l9eVarE == null) {
                return;
            }
            if (this.f == null || !m()) {
                mifVar = this;
                ogfVar = null;
            } else {
                mifVar = this;
                ogfVar = new ogf(0, mifVar, mif.class, "toolbarCopy", "toolbarCopy()V", 0, 2);
            }
            if (mifVar.k()) {
                ogfVar2 = null;
            } else {
                ogfVar2 = new ogf(0, mifVar, mif.class, "selectAll", "selectAll$foundation()V", 0, 3);
            }
            wkhVar.b(l9eVarE, ogfVar, null, null, ogfVar2, null);
        }
    }
}
