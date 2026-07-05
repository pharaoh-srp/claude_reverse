package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mr7 implements ltb, xwe {
    public final go0 a;
    public final jo0 b;
    public final float c;
    public final gc5 d;
    public final float e;
    public final kr7 f;

    public mr7(go0 go0Var, jo0 jo0Var, float f, gc5 gc5Var, float f2, kr7 kr7Var) {
        this.a = go0Var;
        this.b = jo0Var;
        this.c = f;
        this.d = gc5Var;
        this.e = f2;
        this.f = kr7Var;
    }

    public static int k(List list, int i, int i2, int i3, kr7 kr7Var) {
        boolean z;
        boolean z2;
        long jA = t69.a(0, 0);
        if (!list.isEmpty()) {
            int i4 = Integer.MAX_VALUE;
            po0 po0Var = new po0(kr7Var, sl4.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            h5b h5bVar = (h5b) w44.O0(0, list);
            int iQ = h5bVar != null ? h5bVar.Q(i) : 0;
            int iL = h5bVar != null ? h5bVar.l(iQ) : 0;
            boolean z3 = true;
            if (list.size() > 1) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            int i5 = 0;
            if (po0Var.b(z3, 0, t69.a(i, Integer.MAX_VALUE), h5bVar == null ? null : new t69(t69.a(iL, iQ)), 0, 0, 0, false, false).b) {
                kr7Var.getClass();
                jA = jA;
            } else {
                int size = list.size();
                int i6 = i;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    int i12 = i6 - iL;
                    int i13 = i9 + 1;
                    int iMax = Math.max(i8, iQ);
                    h5b h5bVar2 = (h5b) w44.O0(i13, list);
                    iQ = h5bVar2 != null ? h5bVar2.Q(i) : 0;
                    int iL2 = h5bVar2 != null ? h5bVar2.l(iQ) + i2 : 0;
                    if (i9 + 2 < list.size()) {
                        i9 = i13;
                        z2 = z;
                    } else {
                        i9 = i13;
                        z2 = false;
                    }
                    int i14 = i9 - i11;
                    int i15 = i7;
                    int i16 = iL2;
                    wsc wscVarB = po0Var.b(z2, i14, t69.a(i12, i4), h5bVar2 == null ? null : new t69(t69.a(iL2, iQ)), i15, i5, iMax, false, false);
                    if (wscVarB.a) {
                        int i17 = iMax + i3 + i5;
                        po0Var.a(wscVarB, h5bVar2 != null, i15, i17, i12, i14);
                        int i18 = i16 - i2;
                        i7 = i15 + 1;
                        if (wscVarB.b) {
                            i10 = i9;
                            i5 = i17;
                            break;
                        }
                        i6 = i;
                        i11 = i9;
                        iL = i18;
                        i5 = i17;
                        i8 = 0;
                    } else {
                        iL = i16;
                        i6 = i12;
                        i7 = i15;
                        i8 = iMax;
                    }
                    i10 = i9;
                    i4 = Integer.MAX_VALUE;
                    z = true;
                }
                jA = t69.a(i5 - i3, i10);
            }
        }
        return (int) (jA >> 32);
    }

    @Override // defpackage.ltb
    public final int a(xa9 xa9Var, List list, int i) {
        List list2 = (List) w44.O0(1, list);
        h5b h5bVar = list2 != null ? (h5b) w44.N0(list2) : null;
        List list3 = (List) w44.O0(2, list);
        this.f.a(h5bVar, list3 != null ? (h5b) w44.N0(list3) : null, sl4.b(0, 0, 0, i, 7));
        List list4 = (List) w44.N0(list);
        if (list4 == null) {
            list4 = lm6.E;
        }
        int iM0 = xa9Var.M0(this.c);
        int size = list4.size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iO = ((h5b) list4.get(i2)).o(i) + iM0;
            int i5 = i2 + 1;
            if (i5 - i3 == Integer.MAX_VALUE || i5 == list4.size()) {
                iMax = Math.max(iMax, (i4 + iO) - iM0);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iO;
            }
            i2 = i5;
        }
        return iMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ltb
    public final p5b b(q5b q5bVar, List list, long j) {
        float f;
        boolean z;
        h5b h5bVar;
        h5b h5bVar2;
        Iterator it;
        int i;
        c3d c3dVar;
        t69 t69Var;
        wsc wscVar;
        int i2;
        int i3;
        int i4;
        char c;
        ArrayList arrayList;
        h5b h5bVar3;
        int i5;
        c3d c3dVar2;
        t69 t69Var2;
        int i6;
        t69 t69Var3;
        wsc wscVar2;
        int i7;
        long jA;
        c3d c3dVar3;
        long jA2;
        c3d c3dVarU;
        boolean zIsEmpty = ((ArrayList) list).isEmpty();
        nm6 nm6Var = nm6.E;
        if (!zIsEmpty) {
            int iG = rl4.g(j);
            kr7 kr7Var = this.f;
            if (iG != 0) {
                List list2 = (List) w44.L0(list);
                if (list2.isEmpty()) {
                    return q5bVar.U(0, 0, nm6Var, new fg7(19));
                }
                List list3 = (List) w44.O0(1, list);
                h5b h5bVar4 = list3 != null ? (h5b) w44.N0(list3) : null;
                List list4 = (List) w44.O0(2, list);
                h5b h5bVar5 = list4 != null ? (h5b) w44.N0(list4) : null;
                list2.size();
                kr7Var.getClass();
                ov9 ov9Var = ov9.E;
                long j2 = bwk.j(bwk.g(10, bwk.f(j, ov9Var)));
                if (h5bVar4 == null) {
                    f = 0.0f;
                    z = true;
                } else if (dch.F(dch.D(h5bVar4)) == MTTypesetterKt.kLineSkipLimitMultiplier) {
                    dch.D(h5bVar4);
                    c3d c3dVarU2 = h5bVar4.u(j2);
                    f = 0.0f;
                    z = true;
                    new t69(t69.a(c3dVarU2.X(), c3dVarU2.S()));
                    c3dVarU2.X();
                    c3dVarU2.S();
                } else {
                    f = 0.0f;
                    z = true;
                    h5bVar4.Q(h5bVar4.l(Integer.MAX_VALUE));
                }
                if (h5bVar5 != null) {
                    if (dch.F(dch.D(h5bVar5)) == f) {
                        dch.D(h5bVar5);
                        c3d c3dVarU3 = h5bVar5.u(j2);
                        new t69(t69.a(c3dVarU3.X(), c3dVarU3.S()));
                        c3dVarU3.X();
                        c3dVarU3.S();
                    } else {
                        h5bVar5.Q(h5bVar5.l(Integer.MAX_VALUE));
                    }
                }
                Iterator it2 = list2.iterator();
                long jF = bwk.f(j, ov9Var);
                wwb wwbVar = new wwb(0, new p5b[16]);
                int iH = rl4.h(jF);
                int iJ = rl4.j(jF);
                int iG2 = rl4.g(jF);
                xub xubVar = x69.a;
                xub xubVar2 = new xub();
                ArrayList arrayList2 = new ArrayList();
                int iCeil = (int) Math.ceil(q5bVar.q0(this.c));
                int iCeil2 = (int) Math.ceil(q5bVar.q0(this.e));
                long jA3 = sl4.a(0, iH, 0, iG2);
                long j3 = bwk.j(bwk.g(14, jA3));
                if (it2.hasNext()) {
                    try {
                        h5bVar = (h5b) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                        h5bVar = null;
                    }
                    h5bVar2 = h5bVar;
                } else {
                    h5bVar2 = null;
                }
                if (h5bVar2 != null) {
                    if (dch.F(dch.D(h5bVar2)) == f) {
                        dch.D(h5bVar2);
                        c3dVarU = h5bVar2.u(j3);
                        it = it2;
                        jA2 = t69.a(c3dVarU.X(), c3dVarU.S());
                    } else {
                        it = it2;
                        int iL = h5bVar2.l(Integer.MAX_VALUE);
                        jA2 = t69.a(iL, h5bVar2.Q(iL));
                        c3dVarU = null;
                    }
                    i = iJ;
                    t69Var = new t69(jA2);
                    c3dVar = c3dVarU;
                } else {
                    it = it2;
                    i = iJ;
                    c3dVar = null;
                    t69Var = null;
                }
                c3d c3dVar4 = c3dVar;
                Integer numValueOf = t69Var != null ? Integer.valueOf((int) (t69Var.a >> 32)) : null;
                Integer numValueOf2 = t69Var != null ? Integer.valueOf((int) (t69Var.a & 4294967295L)) : null;
                int[] iArr = new int[16];
                int[] iArr2 = new int[16];
                yub yubVar = new yub();
                kr7 kr7Var2 = this.f;
                po0 po0Var = new po0(kr7Var2, jF, iCeil, iCeil2);
                t69 t69Var4 = t69Var;
                wsc wscVarB = po0Var.b(it.hasNext(), 0, t69.a(iH, iG2), t69Var4, 0, 0, 0, false, false);
                if (wscVarB.b) {
                    wscVar = wscVarB;
                    po0Var.a(wscVar, t69Var4 != null ? z : false, -1, 0, iH, 0);
                } else {
                    wscVar = wscVarB;
                }
                int[] iArrCopyOf = iArr;
                int[] iArrCopyOf2 = iArr2;
                int i8 = iH;
                h5b h5bVar6 = h5bVar2;
                wsc wscVar3 = wscVar;
                int i9 = i;
                Integer num = numValueOf;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                yub yubVar2 = yubVar;
                int i17 = 0;
                int i18 = iG2;
                while (true) {
                    Integer num2 = numValueOf2;
                    if (wscVar3.b || h5bVar6 == null) {
                        break;
                    }
                    num.getClass();
                    int iIntValue = num.intValue();
                    num2.getClass();
                    int iIntValue2 = num2.intValue();
                    int i19 = i11;
                    int i20 = i13 + iIntValue;
                    int iMax = Math.max(i10, iIntValue2);
                    int i21 = i8 - iIntValue;
                    int i22 = i17 + 1;
                    kr7Var2.getClass();
                    arrayList2.add(h5bVar6);
                    xubVar2.i(i17, c3dVar4);
                    h5bVar6.z();
                    int i23 = i22 - i14;
                    if (it.hasNext()) {
                        try {
                            h5bVar3 = (h5b) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            h5bVar3 = null;
                        }
                        h5bVar6 = h5bVar3;
                    } else {
                        h5bVar6 = null;
                    }
                    if (h5bVar6 != null) {
                        if (dch.F(dch.D(h5bVar6)) == f) {
                            dch.D(h5bVar6);
                            c3d c3dVarU4 = h5bVar6.u(j3);
                            i5 = i22;
                            jA = t69.a(c3dVarU4.X(), c3dVarU4.S());
                            c3dVar3 = c3dVarU4;
                        } else {
                            i5 = i22;
                            int iL2 = h5bVar6.l(Integer.MAX_VALUE);
                            jA = t69.a(iL2, h5bVar6.Q(iL2));
                            c3dVar3 = null;
                        }
                        t69Var2 = new t69(jA);
                        c3dVar2 = c3dVar3;
                    } else {
                        i5 = i22;
                        c3dVar2 = null;
                        t69Var2 = null;
                    }
                    c3d c3dVar5 = c3dVar2;
                    Integer numValueOf3 = t69Var2 != null ? Integer.valueOf(((int) (t69Var2.a >> 32)) + iCeil) : null;
                    Integer numValueOf4 = t69Var2 != null ? Integer.valueOf((int) (t69Var2.a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    int i24 = i15;
                    long jA4 = t69.a(i21, i18);
                    if (t69Var2 == null) {
                        i6 = i21;
                        numValueOf2 = numValueOf4;
                        t69Var3 = null;
                    } else {
                        numValueOf3.getClass();
                        int iIntValue3 = numValueOf3.intValue();
                        numValueOf4.getClass();
                        i6 = i21;
                        numValueOf2 = numValueOf4;
                        t69Var3 = new t69(t69.a(iIntValue3, numValueOf4.intValue()));
                    }
                    wsc wscVarB2 = po0Var.b(zHasNext, i23, jA4, t69Var3, i24, i16, iMax, false, false);
                    if (wscVarB2.a) {
                        int iMin = Math.min(Math.max(i9, i20), iH);
                        int i25 = i16 + iMax;
                        wscVar2 = wscVarB2;
                        po0Var.a(wscVar2, t69Var2 != null ? z : false, i24, i25, i6, i23);
                        int i26 = i19 + 1;
                        if (iArrCopyOf2.length < i26) {
                            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, Math.max(i26, (iArrCopyOf2.length * 3) / 2));
                        }
                        iArrCopyOf2[i19] = iMax;
                        i11 = i19 + 1;
                        i18 = (iG2 - i25) - iCeil2;
                        int i27 = i12 + 1;
                        if (iArrCopyOf.length < i27) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i27, (iArrCopyOf.length * 3) / 2));
                        }
                        iArrCopyOf[i12] = i5;
                        i12++;
                        i15 = i24 + 1;
                        numValueOf3 = numValueOf3 != null ? Integer.valueOf(numValueOf3.intValue() - iCeil) : null;
                        i9 = iMin;
                        i6 = iH;
                        i14 = i5;
                        i16 = i25 + iCeil2;
                        i7 = 0;
                        i10 = 0;
                    } else {
                        wscVar2 = wscVarB2;
                        i7 = i20;
                        i11 = i19;
                        i15 = i24;
                        i10 = iMax;
                    }
                    i17 = i5;
                    c3dVar4 = c3dVar5;
                    num = numValueOf3;
                    i8 = i6;
                    i13 = i7;
                    wscVar3 = wscVar2;
                }
                int i28 = i11;
                int size = arrayList2.size();
                ArrayList arrayList3 = arrayList2;
                c3d[] c3dVarArr = new c3d[size];
                for (int i29 = 0; i29 < size; i29++) {
                    c3dVarArr[i29] = xubVar2.b(i29);
                }
                int[] iArr3 = new int[i12];
                int[] iArr4 = new int[i12];
                int iMax2 = i9;
                int i30 = 0;
                int i31 = 0;
                int i32 = 0;
                while (i31 < i12) {
                    int i33 = iArrCopyOf[i31];
                    if (i31 < 0 || i31 >= (i4 = i28)) {
                        gtk.h("Index must be between 0 and size");
                        throw null;
                    }
                    int iG3 = iArrCopyOf2[i31];
                    yub yubVar3 = yubVar2;
                    if (yubVar3.c(i31)) {
                        arrayList = arrayList3;
                        c = 65535;
                    } else {
                        if (rl4.g(jA3) == Integer.MAX_VALUE) {
                            iG3 = Integer.MAX_VALUE;
                            c = 65535;
                        } else {
                            iG3 = rl4.g(jA3) - i32;
                            c = 65535;
                        }
                        arrayList = arrayList3;
                    }
                    i28 = i4;
                    int[] iArr5 = iArrCopyOf2;
                    yubVar2 = yubVar3;
                    p5b p5bVarT = nai.T(this, iMax2, rl4.i(jA3), rl4.h(jA3), iG3, iCeil, q5bVar, arrayList, c3dVarArr, i30, i33, iArr3, i31);
                    int iB = p5bVarT.b();
                    int iA = p5bVarT.a();
                    iArr4[i31] = iA;
                    i32 += iA;
                    iMax2 = Math.max(iMax2, iB);
                    wwbVar.b(p5bVarT);
                    i31++;
                    arrayList3 = arrayList;
                    i30 = i33;
                    iArrCopyOf = iArrCopyOf;
                    iArrCopyOf2 = iArr5;
                }
                if (wwbVar.G == 0) {
                    i3 = 0;
                    i2 = 0;
                } else {
                    i2 = i32;
                    i3 = iMax2;
                }
                jo0 jo0Var = this.b;
                int iM0 = ((wwbVar.G - 1) * q5bVar.M0(jo0Var.d())) + i2;
                int i34 = rl4.i(jF);
                int iG4 = rl4.g(jF);
                if (iM0 < i34) {
                    iM0 = i34;
                }
                if (iM0 <= iG4) {
                    iG4 = iM0;
                }
                jo0Var.v(q5bVar, iG4, iArr4, iArr3);
                int iJ2 = rl4.j(jF);
                int iH2 = rl4.h(jF);
                if (i3 < iJ2) {
                    i3 = iJ2;
                }
                if (i3 <= iH2) {
                    iH2 = i3;
                }
                return q5bVar.U(iH2, iG4, nm6Var, new py3(25, wwbVar));
            }
            kr7Var.getClass();
        }
        return q5bVar.U(0, 0, nm6Var, new fg7(19));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ltb
    public final int c(xa9 xa9Var, List list, int i) {
        int i2;
        int[] iArr;
        kr7 kr7Var;
        int[] iArr2;
        t69 t69Var;
        List list2;
        long jA;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        int i7 = 1;
        List list3 = (List) w44.O0(1, list);
        h5b h5bVar = list3 != null ? (h5b) w44.N0(list3) : null;
        char c = 2;
        List list4 = (List) w44.O0(2, list);
        this.f.a(h5bVar, list4 != null ? (h5b) w44.N0(list4) : null, sl4.b(0, 0, 0, i6, 7));
        List list5 = (List) w44.N0(list);
        if (list5 == null) {
            list5 = lm6.E;
        }
        int iM0 = xa9Var.M0(this.c);
        int iM02 = xa9Var.M0(this.e);
        long jA2 = t69.a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr3 = new int[size];
        int size2 = list5.size();
        int[] iArr4 = new int[size2];
        List list6 = list5;
        int size3 = list6.size();
        int i8 = 0;
        while (i8 < size3) {
            h5b h5bVar2 = (h5b) list5.get(i8);
            char c2 = c;
            int iL = h5bVar2.l(i6);
            iArr3[i8] = iL;
            iArr4[i8] = h5bVar2.Q(iL);
            i8++;
            c = c2;
        }
        int size4 = list5.size();
        kr7 kr7Var2 = this.f;
        if (Integer.MAX_VALUE < size4) {
            kr7Var2.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            kr7Var2.getClass();
        }
        int iMin = Math.min(Integer.MAX_VALUE, list5.size());
        int size5 = ((list5.size() - 1) * iM0) + mp0.V0(iArr3);
        if (size2 == 0) {
            pmf.d();
            return 0;
        }
        int i9 = iArr4[0];
        int i10 = size2 - 1;
        if (1 <= i10) {
            int i11 = 1;
            i2 = 0;
            while (true) {
                int i12 = iArr4[i11];
                if (i9 < i12) {
                    i9 = i12;
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        } else {
            i2 = 0;
        }
        if (size == 0) {
            pmf.d();
            return 0;
        }
        int i13 = iArr3[i2];
        int i14 = size - 1;
        if (1 <= i14) {
            int i15 = 1;
            while (true) {
                int i16 = iArr3[i15];
                if (i13 < i16) {
                    i13 = i16;
                }
                if (i15 == i14) {
                    break;
                }
                i15++;
            }
        }
        int i17 = size5;
        while (i13 <= i17 && i9 != i6) {
            int i18 = (i13 + i17) / 2;
            if (list5.isEmpty()) {
                list2 = list5;
                iArr2 = iArr3;
                jA = jA2;
                iArr = iArr4;
                kr7Var = kr7Var2;
            } else {
                int i19 = i2;
                iArr = iArr4;
                kr7Var = kr7Var2;
                po0 po0Var = new po0(kr7Var, sl4.a(i19, i18, i19, Integer.MAX_VALUE), iM0, iM02);
                h5b h5bVar3 = (h5b) w44.O0(i19, list5);
                int i20 = h5bVar3 != null ? iArr[i19] : i19;
                int i21 = h5bVar3 != null ? iArr3[i19] : 0;
                boolean z = list5.size() > i7 ? i7 : 0;
                long jA3 = t69.a(i18, Integer.MAX_VALUE);
                if (h5bVar3 == null) {
                    iArr2 = iArr3;
                    t69Var = null;
                } else {
                    iArr2 = iArr3;
                    t69Var = new t69(t69.a(i21, i20));
                }
                int i22 = 0;
                int i23 = 0;
                if (po0Var.b(z, 0, jA3, t69Var, 0, 0, 0, false, false).b) {
                    kr7Var.getClass();
                    list2 = list5;
                    jA = jA2;
                } else {
                    int size6 = list6.size();
                    int i24 = i18;
                    int i25 = i21;
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = i20;
                    int i30 = 0;
                    while (true) {
                        if (i28 >= size6) {
                            list2 = list5;
                            break;
                        }
                        int i31 = i24 - i25;
                        int i32 = size6;
                        int i33 = i28 + 1;
                        int iMax = Math.max(i26, i29);
                        h5b h5bVar4 = (h5b) w44.O0(i33, list5);
                        i29 = h5bVar4 != null ? iArr[i33] : 0;
                        if (h5bVar4 != null) {
                            i3 = i33;
                            i4 = iArr2[i33] + iM0;
                        } else {
                            i3 = i33;
                            i4 = 0;
                        }
                        list2 = list5;
                        int i34 = i3 - i27;
                        wsc wscVarB = po0Var.b(i28 + 2 < list2.size(), i34, t69.a(i31, Integer.MAX_VALUE), h5bVar4 == null ? null : new t69(t69.a(i4, i29)), i22, i23, iMax, false, false);
                        if (wscVarB.a) {
                            int i35 = iMax + iM02 + i23;
                            int i36 = i22;
                            po0Var.a(wscVarB, h5bVar4 != null, i36, i35, i31, i34);
                            int i37 = i4 - iM0;
                            i22 = i36 + 1;
                            if (wscVarB.b) {
                                i23 = i35;
                                i30 = i3;
                                break;
                            }
                            i25 = i37;
                            i24 = i18;
                            i23 = i35;
                            i5 = i3;
                            i26 = 0;
                        } else {
                            i25 = i4;
                            i24 = i31;
                            i26 = iMax;
                            i5 = i27;
                        }
                        i27 = i5;
                        size6 = i32;
                        i28 = i3;
                        i30 = i28;
                        list5 = list2;
                    }
                    jA = t69.a(i23 - iM02, i30);
                }
            }
            i9 = (int) (jA >> 32);
            int i38 = (int) (jA & 4294967295L);
            i6 = i;
            if (i9 > i6 || i38 < iMin) {
                i13 = i18 + 1;
                if (i13 > i17) {
                    return i13;
                }
            } else {
                if (i9 >= i6) {
                    return i18;
                }
                i17 = i18 - 1;
            }
            size5 = i18;
            iArr3 = iArr2;
            kr7Var2 = kr7Var;
            iArr4 = iArr;
            list5 = list2;
            i7 = 1;
            i2 = 0;
        }
        return size5;
    }

    @Override // defpackage.ltb
    public final int d(xa9 xa9Var, List list, int i) {
        List list2 = (List) w44.O0(1, list);
        h5b h5bVar = list2 != null ? (h5b) w44.N0(list2) : null;
        List list3 = (List) w44.O0(2, list);
        h5b h5bVar2 = list3 != null ? (h5b) w44.N0(list3) : null;
        long jB = sl4.b(0, i, 0, 0, 13);
        kr7 kr7Var = this.f;
        kr7Var.a(h5bVar, h5bVar2, jB);
        List list4 = (List) w44.N0(list);
        if (list4 == null) {
            list4 = lm6.E;
        }
        return k(list4, i, xa9Var.M0(this.c), xa9Var.M0(this.e), kr7Var);
    }

    @Override // defpackage.ltb
    public final int e(xa9 xa9Var, List list, int i) {
        List list2 = (List) w44.O0(1, list);
        h5b h5bVar = list2 != null ? (h5b) w44.N0(list2) : null;
        List list3 = (List) w44.O0(2, list);
        h5b h5bVar2 = list3 != null ? (h5b) w44.N0(list3) : null;
        long jB = sl4.b(0, i, 0, 0, 13);
        kr7 kr7Var = this.f;
        kr7Var.a(h5bVar, h5bVar2, jB);
        List list4 = (List) w44.N0(list);
        if (list4 == null) {
            list4 = lm6.E;
        }
        return k(list4, i, xa9Var.M0(this.c), xa9Var.M0(this.e), kr7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr7)) {
            return false;
        }
        mr7 mr7Var = (mr7) obj;
        return this.a.equals(mr7Var.a) && this.b.equals(mr7Var.b) && va6.b(this.c, mr7Var.c) && this.d.equals(mr7Var.d) && va6.b(this.e, mr7Var.e) && x44.r(this.f, mr7Var.f);
    }

    @Override // defpackage.xwe
    public final void f(int i, int[] iArr, int[] iArr2, q5b q5bVar) {
        this.a.j(q5bVar, i, iArr, q5bVar.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.xwe
    public final p5b g(final c3d[] c3dVarArr, q5b q5bVar, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        final fu9 fu9Var = fu9.E;
        return q5bVar.U(i2, i3, nm6.E, new bz7() { // from class: lr7
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                iuj iujVar;
                b3d b3dVar = (b3d) obj;
                int[] iArr3 = iArr2;
                int i7 = iArr3 != null ? iArr3[i4] : 0;
                int i8 = i5;
                for (int i9 = i8; i9 < i6; i9++) {
                    c3d c3dVar = c3dVarArr[i9];
                    c3dVar.getClass();
                    Object objZ = c3dVar.z();
                    ywe yweVar = objZ instanceof ywe ? (ywe) objZ : null;
                    if (yweVar == null || (iujVar = yweVar.c) == null) {
                        iujVar = this.d;
                    }
                    b3dVar.f(c3dVar, iArr[i9 - i8], iujVar.l(i3, c3dVar.S(), fu9Var, c3dVar, i) + i7, MTTypesetterKt.kLineSkipLimitMultiplier);
                }
                return iei.a;
            }
        });
    }

    @Override // defpackage.xwe
    public final long h(boolean z, int i, int i2, int i3) {
        cxe cxeVar = axe.a;
        return !z ? sl4.a(i, i2, 0, i3) : sf5.G(i, i2, 0, i3);
    }

    public final int hashCode() {
        return this.f.hashCode() + vb7.c(Integer.MAX_VALUE, vb7.c(Integer.MAX_VALUE, vb7.b(this.e, (this.d.hashCode() + vb7.b(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31)) * 31, 31), 31), 31);
    }

    @Override // defpackage.xwe
    public final int i(c3d c3dVar) {
        return c3dVar.S();
    }

    @Override // defpackage.xwe
    public final int j(c3d c3dVar) {
        return c3dVar.X();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=");
        sb.append(this.a);
        sb.append(", verticalArrangement=");
        sb.append(this.b);
        sb.append(", mainAxisSpacing=");
        ebh.v(this.c, sb, ", crossAxisAlignment=");
        sb.append(this.d);
        sb.append(", crossAxisArrangementSpacing=");
        ebh.v(this.e, sb, ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
