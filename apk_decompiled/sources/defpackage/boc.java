package defpackage;

import android.os.Trace;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class boc implements mz9 {
    public final /* synthetic */ koc a;
    public final /* synthetic */ mnc b;
    public final /* synthetic */ float c;
    public final /* synthetic */ unc d;
    public final /* synthetic */ zy7 e;
    public final /* synthetic */ zy7 f;
    public final /* synthetic */ wo1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ pcg i;
    public final /* synthetic */ l45 j;

    public boc(koc kocVar, mnc mncVar, float f, unc uncVar, kn9 kn9Var, zy7 zy7Var, wo1 wo1Var, int i, pcg pcgVar, l45 l45Var) {
        this.a = kocVar;
        this.b = mncVar;
        this.c = f;
        this.d = uncVar;
        this.e = kn9Var;
        this.f = zy7Var;
        this.g = wo1Var;
        this.h = i;
        this.i = pcgVar;
        this.j = l45Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r17v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r56v10 */
    /* JADX WARN: Type inference failed for: r56v15 */
    /* JADX WARN: Type inference failed for: r56v16 */
    /* JADX WARN: Type inference failed for: r56v8 */
    /* JADX WARN: Type inference failed for: r56v9 */
    @Override // defpackage.mz9
    public final p5b a(nz9 nz9Var, long j) {
        wo1 wo1Var;
        int i;
        int i2;
        int i3;
        aoc aocVar;
        int iMax;
        int i4;
        long j2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        r5b r5bVar;
        int i15;
        qo0 qo0Var;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        r5b r5bVar2;
        ArrayList arrayList;
        List list;
        int i21;
        int i22;
        int i23;
        long j3;
        List list2;
        List arrayList2;
        int i24;
        int i25;
        gvg gvgVar;
        Object obj;
        qo0 qo0Var2;
        ArrayList arrayList3;
        ?? arrayList4;
        Object obj2;
        int i26;
        int i27;
        int i28;
        pcg pcgVar;
        ArrayList arrayList5;
        int i29;
        ?? r56;
        coc cocVar;
        koc kocVar;
        nz9 nz9Var2;
        long j4;
        int i30;
        ArrayList arrayList6;
        int i31;
        int i32;
        ArrayList arrayList7;
        int i33;
        int i34;
        int i35;
        boolean z;
        boc bocVar = this;
        koc kocVar2 = bocVar.a;
        kocVar2.C.getValue();
        ukc ukcVar = ukc.F;
        iuj.r(j, ukcVar);
        gvg gvgVar2 = nz9Var.F;
        fu9 layoutDirection = gvgVar2.getLayoutDirection();
        mnc mncVar = bocVar.b;
        int iM0 = gvgVar2.M0(gb9.m(mncVar, layoutDirection));
        int iM02 = gvgVar2.M0(gb9.l(mncVar, gvgVar2.getLayoutDirection()));
        int iM03 = gvgVar2.M0(mncVar.d());
        int iM04 = gvgVar2.M0(mncVar.a()) + iM03;
        int i36 = iM02 + iM0;
        int i37 = i36 - iM0;
        long jI = sl4.i(-i36, -iM04, j);
        kocVar2.n = nz9Var;
        int iM05 = gvgVar2.M0(bocVar.c);
        int iH = rl4.h(j) - i36;
        int i38 = iM04;
        int i39 = i36;
        long j5 = (((long) iM0) << 32) | (((long) iM03) & 4294967295L);
        int iM = bocVar.d.m(nz9Var, iH);
        if (iM < 0) {
            iM = 0;
        }
        sl4.b(0, iM, 0, rl4.g(jI), 5);
        aoc aocVar2 = (aoc) bocVar.e.a();
        int i40 = iH + iM0 + i37;
        pcg pcgVar2 = bocVar.i;
        rcg rcgVarZ = fd9.Z();
        long j6 = jI;
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            eoc eocVar = kocVar2.d;
            int iH2 = ((isc) eocVar.G).h();
            gvg gvgVar3 = gvgVar2;
            int iR = iv1.r(aocVar2, eocVar.I, iH2);
            if (iH2 != iR) {
                ((isc) eocVar.G).i(iR);
                ((pz9) eocVar.J).a(iH2);
            }
            ((isc) eocVar.G).h();
            float fH = ((hsc) eocVar.H).h();
            kocVar2.l();
            int i41 = iM + iM05;
            int iL = mwa.L(pcgVar2.e(i40, iM, iM0, i37) - (fH * i41));
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            List listP = j8.p(aocVar2, kocVar2.A, kocVar2.w);
            xub xubVar = x69.a;
            xub xubVar2 = new xub();
            int iIntValue = ((Number) bocVar.f.a()).intValue();
            nwb nwbVar = kocVar2.B;
            if (iM0 < 0) {
                e39.a("negative beforeContentPadding");
            }
            if (i37 < 0) {
                e39.a("negative afterContentPadding");
            }
            int i42 = i41 < 0 ? 0 : i41;
            int i43 = bocVar.h;
            if (i43 > iIntValue) {
                i43 = iIntValue;
            }
            aoc aocVar3 = aocVar2;
            int i44 = iL;
            long jB = sl4.b(0, iM, 0, rl4.g(j6), 5);
            nm6 nm6Var = nm6.E;
            pcg pcgVar3 = bocVar.i;
            int i45 = i42;
            l45 l45Var = bocVar.j;
            if (iIntValue <= 0) {
                cocVar = new coc(iM, iM05, i37, -iM0, iH + i37, i43, pcgVar3, gvgVar3.U(sl4.g(rl4.j(j6) + i39, j), sl4.f(rl4.i(j6) + i38, j), nm6Var, new fg7(19)), l45Var, nz9Var, jB);
                nz9Var2 = nz9Var;
                kocVar = kocVar2;
            } else {
                long j7 = jB;
                int i46 = i40;
                int i47 = i43;
                int i48 = iIntValue;
                long j8 = j5;
                int i49 = iM;
                int i50 = iR;
                while (i50 > 0 && i44 > 0) {
                    i50--;
                    i44 -= i45;
                }
                int i51 = i44 * (-1);
                if (i50 >= i48) {
                    i50 = i48 - 1;
                    i51 = 0;
                }
                qo0 qo0Var3 = new qo0();
                int i52 = -iM0;
                int i53 = i52 + (iM05 < 0 ? iM05 : 0);
                int i54 = i51 + i53;
                nwb nwbVar2 = nwbVar;
                int iMax2 = 0;
                while (true) {
                    wo1Var = bocVar.g;
                    if (i54 >= 0 || i50 <= 0) {
                        break;
                    }
                    int i55 = i50 - 1;
                    int i56 = i54;
                    xub xubVar3 = xubVar2;
                    int i57 = i49;
                    int i58 = i47;
                    long j9 = j8;
                    r5b r5bVarE = oyk.e(nz9Var, i55, j7, aocVar3, j9, wo1Var, gvgVar3.getLayoutDirection(), i57, xubVar3);
                    i49 = i57;
                    xubVar2 = xubVar3;
                    qo0Var3.add(0, r5bVarE);
                    iMax2 = Math.max(iMax2, r5bVarE.h);
                    i54 = i56 + i45;
                    bocVar = this;
                    i50 = i55;
                    j8 = j9;
                    listP = listP;
                    i38 = i38;
                    i39 = i39;
                    iM0 = iM0;
                    i48 = i48;
                    j6 = j6;
                    i46 = i46;
                    nwbVar2 = nwbVar2;
                    i47 = i58;
                    nm6Var = nm6Var;
                    pcgVar3 = pcgVar3;
                }
                int i59 = i46;
                nm6 nm6Var2 = nm6Var;
                int i60 = i47;
                pcg pcgVar4 = pcgVar3;
                int i61 = i54;
                nwb nwbVar3 = nwbVar2;
                long j10 = j6;
                long j11 = j8;
                int i62 = i48;
                int i63 = iM0;
                int i64 = i39;
                int i65 = i38;
                List list3 = listP;
                int i66 = i45;
                int i67 = (i61 < i53 ? i53 : i61) - i53;
                int i68 = iH + i37;
                int i69 = i68 < 0 ? 0 : i68;
                int i70 = -i67;
                int i71 = i50;
                boolean z2 = false;
                int i72 = 0;
                while (i72 < qo0Var3.size()) {
                    if (i70 >= i69) {
                        qo0Var3.remove(i72);
                        i34 = i72;
                        i35 = i70;
                        z = true;
                    } else {
                        i71++;
                        i34 = i72 + 1;
                        i35 = i70 + i66;
                        z = z2;
                    }
                    z2 = z;
                    i70 = i35;
                    i72 = i34;
                }
                int i73 = iMax2;
                List list4 = list3;
                int i74 = i62;
                boolean z3 = z2;
                int i75 = i50;
                int i76 = i67;
                int i77 = i70;
                int i78 = i71;
                while (true) {
                    if (i78 >= i74) {
                        i = i78;
                        i2 = i75;
                        i3 = i66;
                        aocVar = aocVar3;
                        iMax = i73;
                        i4 = i74;
                        j2 = j7;
                        i5 = iH;
                        break;
                    }
                    if (i77 >= i69 && i77 > 0 && !qo0Var3.isEmpty()) {
                        i = i78;
                        i2 = i75;
                        i3 = i66;
                        i5 = iH;
                        aocVar = aocVar3;
                        iMax = i73;
                        i4 = i74;
                        j2 = j7;
                        break;
                    }
                    int i79 = i75;
                    int i80 = i66;
                    aoc aocVar4 = aocVar3;
                    int i81 = i69;
                    int i82 = i73;
                    int i83 = i74;
                    long j12 = j7;
                    r5b r5bVarE2 = oyk.e(nz9Var, i78, j12, aocVar4, j11, wo1Var, gvgVar3.getLayoutDirection(), i49, xubVar2);
                    int i84 = i78;
                    int i85 = i83 - 1;
                    i77 += i84 == i85 ? i49 : i80;
                    if (i77 > i53 || i84 == i85) {
                        int iMax3 = Math.max(i82, r5bVarE2.h);
                        qo0Var3.addLast(r5bVarE2);
                        i82 = iMax3;
                        i33 = i79;
                    } else {
                        i33 = i84 + 1;
                        i76 -= i80;
                        z3 = true;
                    }
                    j7 = j12;
                    i73 = i82;
                    i74 = i83;
                    i66 = i80;
                    i75 = i33;
                    i78 = i84 + 1;
                    i69 = i81;
                    aocVar3 = aocVar4;
                }
                if (i77 < i5) {
                    int i86 = i5 - i77;
                    int i87 = i76 - i86;
                    int i88 = i77 + i86;
                    i7 = i63;
                    i10 = i2;
                    int i89 = i87;
                    while (i89 < i7 && i10 > 0) {
                        i10--;
                        int i90 = i89;
                        r5b r5bVarE3 = oyk.e(nz9Var, i10, j2, aocVar, j11, wo1Var, gvgVar3.getLayoutDirection(), i49, xubVar2);
                        qo0Var3.add(0, r5bVarE3);
                        iMax = Math.max(iMax, r5bVarE3.h);
                        i89 = i90 + i3;
                        i = i;
                    }
                    i6 = i;
                    int i91 = i89;
                    if (i91 < 0) {
                        i8 = i88 + i91;
                        i9 = 0;
                    } else {
                        i8 = i88;
                        i9 = i91;
                    }
                } else {
                    i6 = i;
                    int i92 = i77;
                    i7 = i63;
                    i8 = i92;
                    i9 = i76;
                    i10 = i2;
                }
                if (i9 < 0) {
                    e39.a("invalid currentFirstPageScrollOffset");
                }
                int i93 = iMax;
                int i94 = -i9;
                r5b r5bVar3 = (r5b) qo0Var3.first();
                if (i7 > 0 || iM05 < 0) {
                    i11 = i8;
                    int size = qo0Var3.size();
                    r5b r5bVar4 = r5bVar3;
                    i12 = i10;
                    int i95 = 0;
                    while (i95 < size && i9 != 0) {
                        i13 = i7;
                        i14 = i3;
                        if (i14 > i9) {
                            break;
                        }
                        int i96 = size;
                        if (i95 == qo0Var3.size() - 1) {
                            break;
                        }
                        i9 -= i14;
                        i95++;
                        r5bVar4 = (r5b) qo0Var3.get(i95);
                        i3 = i14;
                        i7 = i13;
                        size = i96;
                    }
                    i13 = i7;
                    i14 = i3;
                    r5bVar = r5bVar4;
                } else {
                    i11 = i8;
                    i13 = i7;
                    r5bVar = r5bVar3;
                    i14 = i3;
                    i12 = i10;
                }
                int i97 = i9;
                int iMax4 = Math.max(0, i12 - i60);
                int i98 = i12 - 1;
                if (iMax4 <= i98) {
                    int i99 = iMax4;
                    int i100 = i98;
                    ArrayList arrayList8 = null;
                    while (true) {
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        qo0 qo0Var4 = qo0Var3;
                        arrayList7 = arrayList8;
                        i16 = i5;
                        i19 = i99;
                        qo0Var = qo0Var4;
                        i15 = i14;
                        i17 = i11;
                        i18 = i60;
                        i20 = i94;
                        r5bVar2 = r5bVar;
                        arrayList7.add(oyk.e(nz9Var, i100, j2, aocVar, j11, wo1Var, gvgVar3.getLayoutDirection(), i49, xubVar2));
                        if (i100 == i19) {
                            break;
                        }
                        i100--;
                        i60 = i18;
                        r5bVar = r5bVar2;
                        arrayList8 = arrayList7;
                        qo0Var3 = qo0Var;
                        i94 = i20;
                        i14 = i15;
                        i11 = i17;
                        i99 = i19;
                        i5 = i16;
                    }
                    arrayList = arrayList7;
                } else {
                    i15 = i14;
                    qo0Var = qo0Var3;
                    i16 = i5;
                    i17 = i11;
                    i18 = i60;
                    i19 = iMax4;
                    i20 = i94;
                    r5bVar2 = r5bVar;
                    arrayList = null;
                }
                List list5 = list4;
                int size2 = list5.size();
                int i101 = 0;
                while (i101 < size2) {
                    List list6 = list5;
                    List list7 = list4;
                    int i102 = size2;
                    int iIntValue2 = ((Number) list7.get(i101)).intValue();
                    if (iIntValue2 < i19) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        i32 = i19;
                        ArrayList arrayList9 = arrayList;
                        i31 = i101;
                        arrayList9.add(oyk.e(nz9Var, iIntValue2, j2, aocVar, j11, wo1Var, gvgVar3.getLayoutDirection(), i49, xubVar2));
                        arrayList = arrayList9;
                    } else {
                        i31 = i101;
                        i32 = i19;
                    }
                    i101 = i31 + 1;
                    list4 = list7;
                    list5 = list6;
                    size2 = i102;
                    i19 = i32;
                }
                List list8 = list5;
                List list9 = list4;
                List list10 = lm6.E;
                List list11 = arrayList == null ? list10 : arrayList;
                List list12 = list11;
                int size3 = list12.size();
                int iMax5 = i93;
                long j13 = j2;
                for (int i103 = 0; i103 < size3; i103++) {
                    iMax5 = Math.max(iMax5, ((r5b) list11.get(i103)).h);
                }
                int i104 = ((r5b) qo0Var.last()).a;
                int iMin = Math.min(i18, (i4 - i104) - 1) + i104;
                int i105 = i104 + 1;
                if (i105 <= iMin) {
                    ArrayList arrayList10 = null;
                    while (true) {
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                        }
                        i21 = iMax5;
                        list = list11;
                        i22 = i18;
                        i23 = iMin;
                        List list13 = list10;
                        arrayList6 = arrayList10;
                        j3 = j13;
                        list2 = list13;
                        arrayList6.add(oyk.e(nz9Var, i105, j3, aocVar, j11, wo1Var, gvgVar3.getLayoutDirection(), i49, xubVar2));
                        if (i105 == i23) {
                            break;
                        }
                        i105++;
                        arrayList10 = arrayList6;
                        list10 = list2;
                        j13 = j3;
                        list11 = list;
                        iMin = i23;
                        iMax5 = i21;
                        i18 = i22;
                    }
                    arrayList2 = arrayList6;
                } else {
                    list = list11;
                    i21 = iMax5;
                    i22 = i18;
                    i23 = iMin;
                    j3 = j13;
                    list2 = list10;
                    arrayList2 = null;
                }
                int size4 = list8.size();
                int i106 = 0;
                while (i106 < size4) {
                    int iIntValue3 = ((Number) list9.get(i106)).intValue();
                    int i107 = i106;
                    if (i23 + 1 > iIntValue3 || iIntValue3 >= i4) {
                        j4 = j3;
                        i30 = i23;
                    } else {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        i30 = i23;
                        List list14 = arrayList2;
                        j4 = j3;
                        list14.add(oyk.e(nz9Var, iIntValue3, j3, aocVar, j11, wo1Var, gvgVar3.getLayoutDirection(), i49, xubVar2));
                        arrayList2 = list14;
                    }
                    i106 = i107 + 1;
                    i23 = i30;
                    j3 = j4;
                }
                long j14 = j3;
                if (arrayList2 == null) {
                    arrayList2 = list2;
                }
                List list15 = arrayList2;
                int size5 = list15.size();
                int iMax6 = i21;
                for (int i108 = 0; i108 < size5; i108++) {
                    iMax6 = Math.max(iMax6, ((r5b) arrayList2.get(i108)).h);
                }
                boolean z4 = x44.r(r5bVar2, qo0Var.first()) && list.isEmpty() && arrayList2.isEmpty();
                int i109 = i17;
                int iG = sl4.g(i109, j10);
                int iF = sl4.f(iMax6, j10);
                int i110 = i16;
                boolean z5 = i109 < Math.min(iG, i110);
                if (!z5 || i20 == 0) {
                    i24 = i20;
                } else {
                    StringBuilder sb = new StringBuilder("non-zero pagesScrollOffset=");
                    i24 = i20;
                    sb.append(i24);
                    e39.c(sb.toString());
                }
                ArrayList arrayList11 = new ArrayList(arrayList2.size() + list.size() + qo0Var.size());
                if (z5) {
                    if (!list.isEmpty() || !arrayList2.isEmpty()) {
                        e39.a("No extra pages");
                    }
                    int size6 = qo0Var.size();
                    int[] iArr = new int[size6];
                    for (int i111 = 0; i111 < size6; i111++) {
                        iArr[i111] = i49;
                    }
                    int[] iArr2 = new int[size6];
                    gvgVar = gvgVar3;
                    obj = null;
                    i25 = iG;
                    new ho0(gvgVar.c0(iM05), false, null).j(nz9Var, i25, iArr, fu9.E, iArr2);
                    b79 b79VarF0 = mp0.F0(iArr2);
                    int i112 = b79VarF0.F;
                    int i113 = b79VarF0.G;
                    if ((i113 > 0 && i112 >= 0) || (i113 < 0 && i112 <= 0)) {
                        int i114 = 0;
                        while (true) {
                            int i115 = iArr2[i114];
                            int i116 = i113;
                            qo0Var2 = qo0Var;
                            int[] iArr3 = iArr2;
                            r5b r5bVar5 = (r5b) qo0Var2.get(i114);
                            r5bVar5.b(i115, i25, iF);
                            arrayList11.add(r5bVar5);
                            if (i114 == i112) {
                                break;
                            }
                            i114 += i116;
                            qo0Var = qo0Var2;
                            i113 = i116;
                            iArr2 = iArr3;
                        }
                    } else {
                        qo0Var2 = qo0Var;
                    }
                } else {
                    i25 = iG;
                    gvgVar = gvgVar3;
                    obj = null;
                    Collection collection = list15;
                    qo0Var2 = qo0Var;
                    int size7 = list12.size();
                    int i117 = i24;
                    int i118 = 0;
                    while (i118 < size7) {
                        Collection collection2 = collection;
                        r5b r5bVar6 = (r5b) list.get(i118);
                        int i119 = size7;
                        int i120 = i117 - i41;
                        r5bVar6.b(i120, i25, iF);
                        arrayList11.add(r5bVar6);
                        i118++;
                        i117 = i120;
                        collection = collection2;
                        size7 = i119;
                    }
                    Collection collection3 = collection;
                    int size8 = qo0Var2.size();
                    for (int i121 = 0; i121 < size8; i121++) {
                        r5b r5bVar7 = (r5b) qo0Var2.get(i121);
                        r5bVar7.b(i24, i25, iF);
                        arrayList11.add(r5bVar7);
                        i24 += i41;
                    }
                    int size9 = collection3.size();
                    for (int i122 = 0; i122 < size9; i122++) {
                        r5b r5bVar8 = (r5b) arrayList2.get(i122);
                        r5bVar8.b(i24, i25, iF);
                        arrayList11.add(r5bVar8);
                        i24 += i41;
                    }
                }
                if (z4) {
                    arrayList3 = arrayList11;
                } else {
                    arrayList3 = new ArrayList(arrayList11.size());
                    int size10 = arrayList11.size();
                    int i123 = 0;
                    while (i123 < size10) {
                        Object obj3 = arrayList11.get(i123);
                        r5b r5bVar9 = (r5b) obj3;
                        qo0 qo0Var5 = qo0Var2;
                        int i124 = i25;
                        if (r5bVar9.a >= ((r5b) qo0Var5.first()).a && r5bVar9.a <= ((r5b) qo0Var5.last()).a) {
                            arrayList3.add(obj3);
                        }
                        i123++;
                        qo0Var2 = qo0Var5;
                        i25 = i124;
                    }
                }
                qo0 qo0Var6 = qo0Var2;
                int i125 = i25;
                if (list.isEmpty()) {
                    arrayList4 = list2;
                } else {
                    arrayList4 = new ArrayList(arrayList11.size());
                    int size11 = arrayList11.size();
                    for (int i126 = 0; i126 < size11; i126++) {
                        Object obj4 = arrayList11.get(i126);
                        if (((r5b) obj4).a < ((r5b) qo0Var6.first()).a) {
                            arrayList4.add(obj4);
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList12 = new ArrayList(arrayList11.size());
                    int size12 = arrayList11.size();
                    for (int i127 = 0; i127 < size12; i127++) {
                        Object obj5 = arrayList11.get(i127);
                        if (((r5b) obj5).a > ((r5b) qo0Var6.last()).a) {
                            arrayList12.add(obj5);
                        }
                    }
                    list2 = arrayList12;
                }
                if (arrayList3.isEmpty()) {
                    r56 = arrayList4;
                    i29 = iF;
                    i26 = i13;
                    i27 = i37;
                    obj2 = obj;
                    i28 = i59;
                    pcgVar = pcgVar4;
                    arrayList5 = arrayList3;
                } else {
                    obj2 = arrayList3.get(0);
                    ?? r562 = arrayList4;
                    i26 = i13;
                    i27 = i37;
                    i28 = i59;
                    pcgVar = pcgVar4;
                    float f = -Math.abs(((r5b) obj2).j - pcgVar.e(i28, i49, i26, i27));
                    int size13 = arrayList3.size() - 1;
                    int i128 = 1;
                    if (1 <= size13) {
                        Object obj6 = obj2;
                        float f2 = f;
                        while (true) {
                            Object obj7 = arrayList3.get(i128);
                            arrayList5 = arrayList3;
                            i29 = iF;
                            float f3 = -Math.abs(((r5b) obj7).j - pcgVar.e(i28, i49, i26, i27));
                            if (Float.compare(f2, f3) < 0) {
                                f2 = f3;
                                obj6 = obj7;
                            }
                            if (i128 == size13) {
                                break;
                            }
                            i128++;
                            arrayList3 = arrayList5;
                            iF = i29;
                        }
                        obj2 = obj6;
                        r56 = r562;
                    } else {
                        arrayList5 = arrayList3;
                        i29 = iF;
                        r56 = r562;
                    }
                }
                r5b r5bVar10 = (r5b) obj2;
                float fD0 = i15 == 0 ? MTTypesetterKt.kLineSkipLimitMultiplier : wd6.d0((pcgVar.e(i28, i49, i26, i27) - (r5bVar10 != null ? r5bVar10.j : 0)) / i15, -0.5f, 0.5f);
                p5b p5bVarU = gvgVar.U(sl4.g(i125 + i64, j), sl4.f(i29 + i65, j), nm6Var2, new b4b(nwbVar3, 14, arrayList11));
                gvgVar3 = gvgVar;
                kocVar = kocVar2;
                cocVar = new coc(arrayList5, i49, iM05, i27, ukcVar, i52, i68, i22, r5bVar2, r5bVar10, fD0, i97, i6 < i4 || i109 > i110, pcgVar, p5bVarU, z3, r56, list2, l45Var, nz9Var, j14);
                nz9Var2 = nz9Var;
            }
            koc kocVar3 = kocVar;
            kocVar3.h(cocVar, gvgVar3.n0(), false);
            xnc xncVar = kocVar3.v;
            List list16 = cocVar.a;
            Trace.beginSection("compose:pager:cache_window:keepAroundItems");
            try {
                if (xncVar.d() && !list16.isEmpty()) {
                    int i129 = ((r5b) w44.L0(list16)).a;
                    int i130 = ((r5b) w44.U0(list16)).a;
                    for (int i131 = xncVar.h; i131 < i129; i131++) {
                        nz9Var2.a(i131);
                    }
                    int i132 = i130 + 1;
                    int i133 = xncVar.i;
                    if (i132 <= i133) {
                        while (true) {
                            nz9Var2.a(i132);
                            if (i132 == i133) {
                                break;
                            }
                            i132++;
                        }
                    }
                }
                return cocVar;
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th) {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            throw th;
        }
    }
}
