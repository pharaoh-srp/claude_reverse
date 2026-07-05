package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ylc implements o5b {
    public final bz7 a;
    public final boolean b;
    public final wgh c;
    public final ogh d;
    public final ogh e;
    public final ogh f;
    public final mnc g;
    public final float h;

    public ylc(bz7 bz7Var, boolean z, wgh wghVar, ogh oghVar, ogh oghVar2, ogh oghVar3, mnc mncVar, float f) {
        this.a = bz7Var;
        this.b = z;
        this.c = wghVar;
        this.d = oghVar;
        this.e = oghVar2;
        this.f = oghVar3;
        this.g = mncVar;
        this.h = f;
    }

    public static final int j(int i, ylc ylcVar, int i2, int i3, c3d c3dVar, c3d c3dVar2) {
        if (ylcVar.b) {
            i3 = ij0.c(i2 - c3dVar2.F, 2.0f, 1.0f);
        }
        return Math.max(i + i3, (c3dVar != null ? c3dVar.F : 0) / 2);
    }

    @Override // defpackage.o5b
    public final int a(xa9 xa9Var, List list, int i) {
        return i(xa9Var, list, i, new oua(8));
    }

    @Override // defpackage.o5b
    public final p5b b(final q5b q5bVar, List list, long j) {
        Object obj;
        List list2;
        Object obj2;
        c3d c3dVar;
        int i;
        c3d c3dVarU;
        Object obj3;
        c3d c3dVar2;
        c3d c3dVarU2;
        Object obj4;
        int i2;
        c3d c3dVarU3;
        Object obj5;
        Object obj6;
        int i3;
        Object obj7;
        c3d c3dVar3;
        int i4;
        c3d c3dVar4;
        int i5;
        c3d c3dVar5;
        int i6;
        c3d c3dVar6;
        dae daeVar;
        int i7;
        c3d c3dVar7;
        c3d c3dVar8;
        h5b h5bVar;
        c3d c3dVar9;
        ylc ylcVar;
        q5b q5bVar2;
        c3d c3dVar10;
        c3d c3dVar11;
        int i8;
        int i9;
        int i10;
        c3d c3dVar12;
        int i11;
        int i12;
        ylc ylcVar2;
        c3d c3dVar13;
        dae daeVar2;
        c3d c3dVar14;
        int i13;
        q5b q5bVar3;
        float f;
        List list3 = list;
        float fA = this.d.a();
        mnc mncVar = this.g;
        int iM0 = q5bVar.M0(mncVar.a());
        long jA = rl4.a(0, 0, 0, 0, 10, j);
        List list4 = list3;
        int size = list4.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                obj = null;
                break;
            }
            obj = list3.get(i14);
            if (x44.r(zni.B((h5b) obj), "Leading")) {
                break;
            }
            i14++;
        }
        h5b h5bVar2 = (h5b) obj;
        c3d c3dVarU4 = h5bVar2 != null ? h5bVar2.u(jA) : null;
        int i15 = c3dVarU4 != null ? c3dVarU4.E : 0;
        int iMax = Math.max(0, c3dVarU4 != null ? c3dVarU4.F : 0);
        int size2 = list4.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                list2 = list4;
                obj2 = null;
                break;
            }
            obj2 = list3.get(i16);
            list2 = list4;
            if (x44.r(zni.B((h5b) obj2), "Trailing")) {
                break;
            }
            i16++;
            list4 = list2;
        }
        h5b h5bVar3 = (h5b) obj2;
        if (h5bVar3 != null) {
            c3dVar = c3dVarU4;
            i = i15;
            c3dVarU = h5bVar3.u(sl4.j(-i15, 0, 2, jA));
        } else {
            c3dVar = c3dVarU4;
            i = i15;
            c3dVarU = null;
        }
        int i17 = i + (c3dVarU != null ? c3dVarU.E : 0);
        int iMax2 = Math.max(iMax, c3dVarU != null ? c3dVarU.F : 0);
        int size3 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list3.get(i18);
            int i19 = size3;
            if (x44.r(zni.B((h5b) obj3), "Prefix")) {
                break;
            }
            i18++;
            size3 = i19;
        }
        h5b h5bVar4 = (h5b) obj3;
        if (h5bVar4 != null) {
            c3dVar2 = c3dVarU;
            c3dVarU2 = h5bVar4.u(sl4.j(-i17, 0, 2, jA));
        } else {
            c3dVar2 = c3dVarU;
            c3dVarU2 = null;
        }
        int i20 = i17 + (c3dVarU2 != null ? c3dVarU2.E : 0);
        int iMax3 = Math.max(iMax2, c3dVarU2 != null ? c3dVarU2.F : 0);
        int size4 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list3.get(i21);
            int i22 = size4;
            if (x44.r(zni.B((h5b) obj4), "Suffix")) {
                break;
            }
            i21++;
            size4 = i22;
        }
        h5b h5bVar5 = (h5b) obj4;
        if (h5bVar5 != null) {
            i2 = i20;
            c3dVarU3 = h5bVar5.u(sl4.j(-i20, 0, 2, jA));
        } else {
            i2 = i20;
            c3dVarU3 = null;
        }
        int i23 = i2 + (c3dVarU3 != null ? c3dVarU3.E : 0);
        int iMax4 = Math.max(iMax3, c3dVarU3 != null ? c3dVarU3.F : 0);
        int size5 = list2.size();
        int i24 = 0;
        while (true) {
            if (i24 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list3.get(i24);
            int i25 = size5;
            int i26 = i24;
            if (x44.r(zni.B((h5b) obj5), "Label")) {
                break;
            }
            i24 = i26 + 1;
            size5 = i25;
        }
        h5b h5bVar6 = (h5b) obj5;
        dae daeVar3 = new dae();
        int iM02 = q5bVar.M0(mncVar.c(q5bVar.getLayoutDirection())) + q5bVar.M0(mncVar.b(q5bVar.getLayoutDirection()));
        int i27 = -d4c.X(fA, i23 + iM02, iM02);
        int i28 = -iM0;
        c3d c3dVarU5 = h5bVar6 != null ? h5bVar6.u(sl4.i(i27, i28, jA)) : null;
        daeVar3.E = c3dVarU5;
        this.a.invoke(new k8g(c3dVarU5 != null ? (((long) Float.floatToRawIntBits(c3dVarU5.E)) << 32) | (((long) Float.floatToRawIntBits(c3dVarU5.F)) & 4294967295L) : 0L));
        int size6 = list2.size();
        int i29 = 0;
        while (true) {
            if (i29 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list3.get(i29);
            int i30 = size6;
            if (x44.r(zni.B((h5b) obj6), "Supporting")) {
                break;
            }
            i29++;
            size6 = i30;
        }
        h5b h5bVar7 = (h5b) obj6;
        int iQ = h5bVar7 != null ? h5bVar7.Q(rl4.j(j)) : 0;
        c3d c3dVar15 = (c3d) daeVar3.E;
        int iMax5 = Math.max((c3dVar15 != null ? c3dVar15.F : 0) / 2, q5bVar.M0(mncVar.d()));
        int i31 = (i28 - iMax5) - iQ;
        h5b h5bVar8 = h5bVar7;
        long jA2 = rl4.a(0, 0, 0, 0, 11, sl4.i(-i23, i31, j));
        int size7 = list2.size();
        int i32 = 0;
        while (i32 < size7) {
            h5b h5bVar9 = (h5b) list3.get(i32);
            int i33 = i32;
            h5b h5bVar10 = h5bVar8;
            if (x44.r(zni.B(h5bVar9), "TextField")) {
                c3d c3dVarU6 = h5bVar9.u(jA2);
                long jA3 = rl4.a(0, 0, 0, 0, 14, jA2);
                List list5 = list3;
                int size8 = list5.size();
                int i34 = 0;
                while (true) {
                    if (i34 >= size8) {
                        i3 = iMax5;
                        obj7 = null;
                        break;
                    }
                    obj7 = list3.get(i34);
                    i3 = iMax5;
                    int i35 = size8;
                    if (x44.r(zni.B((h5b) obj7), "Hint")) {
                        break;
                    }
                    i34++;
                    size8 = i35;
                    iMax5 = i3;
                }
                h5b h5bVar11 = (h5b) obj7;
                c3d c3dVarU7 = h5bVar11 != null ? h5bVar11.u(jA3) : null;
                int iMax6 = Math.max(iMax4, Math.max(c3dVarU6.F, c3dVarU7 != null ? c3dVarU7.F : 0) + i3 + iM0);
                int i36 = c3dVar != null ? c3dVar.E : 0;
                c3d c3dVar16 = c3dVar2;
                int i37 = c3dVar2 != null ? c3dVar16.E : 0;
                if (c3dVarU2 != null) {
                    c3dVar3 = c3dVarU2;
                    i4 = c3dVarU2.E;
                } else {
                    c3dVar3 = c3dVarU2;
                    i4 = 0;
                }
                if (c3dVarU3 != null) {
                    c3dVar4 = c3dVar16;
                    i5 = c3dVarU3.E;
                } else {
                    c3dVar4 = c3dVar16;
                    i5 = 0;
                }
                c3d c3dVar17 = c3dVarU3;
                int i38 = c3dVarU6.E;
                c3d c3dVar18 = (c3d) daeVar3.E;
                if (c3dVar18 != null) {
                    c3d c3dVar19 = c3dVar3;
                    i6 = c3dVar18.E;
                    c3dVar5 = c3dVar19;
                } else {
                    c3dVar5 = c3dVar3;
                    i6 = 0;
                }
                if (c3dVarU7 != null) {
                    daeVar = daeVar3;
                    c3dVar6 = c3dVar5;
                    i7 = c3dVarU7.E;
                    c3dVar7 = c3dVarU7;
                    c3dVar8 = c3dVar17;
                    h5bVar = h5bVar10;
                    c3dVar9 = c3dVarU6;
                    q5bVar2 = q5bVar;
                    c3dVar10 = c3dVar;
                    ylcVar = this;
                } else {
                    c3dVar6 = c3dVar5;
                    daeVar = daeVar3;
                    i7 = 0;
                    c3dVar7 = c3dVarU7;
                    c3dVar8 = c3dVar17;
                    h5bVar = h5bVar10;
                    c3dVar9 = c3dVarU6;
                    ylcVar = this;
                    q5bVar2 = q5bVar;
                    c3dVar10 = c3dVar;
                }
                final int iG = ylcVar.g(q5bVar2, i36, i37, i4, i5, i38, i6, i7, j, fA);
                final c3d c3dVarU8 = h5bVar != null ? h5bVar.u(rl4.a(0, iG, 0, 0, 9, sl4.j(0, -iMax6, 1, jA))) : null;
                int i39 = c3dVarU8 != null ? c3dVarU8.F : 0;
                c3d c3dVar20 = c3dVar10;
                int i40 = c3dVar10 != null ? c3dVar20.F : 0;
                final c3d c3dVar21 = c3dVar4;
                int i41 = c3dVar4 != null ? c3dVar21.F : 0;
                c3d c3dVar22 = c3dVar6;
                int i42 = c3dVar22 != null ? c3dVar22.F : 0;
                c3d c3dVar23 = c3dVar8;
                int i43 = c3dVar23 != null ? c3dVar23.F : 0;
                c3d c3dVar24 = c3dVar9;
                int i44 = c3dVar24.F;
                dae daeVar4 = daeVar;
                c3d c3dVar25 = (c3d) daeVar4.E;
                int i45 = c3dVar25 != null ? c3dVar25.F : 0;
                int i46 = i39;
                final c3d c3dVar26 = c3dVar7;
                if (c3dVar26 != null) {
                    c3dVar11 = c3dVar23;
                    i8 = i43;
                    i9 = i44;
                    i10 = c3dVar26.F;
                } else {
                    c3dVar11 = c3dVar23;
                    i8 = i43;
                    i9 = i44;
                    i10 = 0;
                }
                if (c3dVarU8 != null) {
                    c3dVar12 = c3dVar24;
                    i11 = i45;
                    i12 = c3dVarU8.F;
                    c3dVar13 = c3dVar22;
                    daeVar2 = daeVar4;
                    c3dVar14 = c3dVar20;
                    i13 = 0;
                    q5bVar3 = q5bVar;
                    f = fA;
                    ylcVar2 = this;
                } else {
                    c3dVar12 = c3dVar24;
                    i11 = i45;
                    i12 = 0;
                    ylcVar2 = this;
                    c3dVar13 = c3dVar22;
                    daeVar2 = daeVar4;
                    c3dVar14 = c3dVar20;
                    i13 = 0;
                    q5bVar3 = q5bVar;
                    f = fA;
                }
                final int iF = ylcVar2.f(q5bVar3, i40, i41, i42, i8, i9, i11, i10, i12, j, f);
                final float f2 = f;
                int i47 = iF - i46;
                int size9 = list5.size();
                int i48 = i13;
                while (i48 < size9) {
                    h5b h5bVar12 = (h5b) list.get(i48);
                    if (x44.r(zni.B(h5bVar12), "Container")) {
                        final c3d c3dVarU9 = h5bVar12.u(sl4.a(iG != Integer.MAX_VALUE ? iG : i13, iG, i47 != Integer.MAX_VALUE ? i47 : i13, i47));
                        final c3d c3dVar27 = c3dVar14;
                        final c3d c3dVar28 = c3dVar12;
                        final c3d c3dVar29 = c3dVar13;
                        final c3d c3dVar30 = c3dVar11;
                        final dae daeVar5 = daeVar2;
                        return q5bVar.U(iG, iF, nm6.E, new bz7() { // from class: wlc
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj8) {
                                float f3;
                                float f4;
                                int i49;
                                ylc ylcVar3;
                                c3d c3dVar31;
                                int i50;
                                int i51;
                                c3d c3dVar32;
                                int i52;
                                int i53;
                                ylc ylcVar4;
                                int i54;
                                int i55;
                                c3d c3dVar33;
                                int i56;
                                int iC;
                                float f5;
                                float f6;
                                float f7;
                                float f8;
                                b3d b3dVar = (b3d) obj8;
                                c3d c3dVar34 = (c3d) daeVar5.E;
                                ylc ylcVar5 = this.E;
                                final ogh oghVar = ylcVar5.e;
                                final ogh oghVar2 = ylcVar5.f;
                                float density = b3dVar.getDensity();
                                fu9 layoutDirection = q5bVar.getLayoutDirection();
                                float density2 = b3dVar.getDensity() * ylcVar5.h;
                                wgh wghVar = ylcVar5.c;
                                mnc mncVar2 = ylcVar5.g;
                                b3dVar.f(c3dVarU9, 0, 0, MTTypesetterKt.kLineSkipLimitMultiplier);
                                c3d c3dVar35 = c3dVarU8;
                                int i57 = iF - (c3dVar35 != null ? c3dVar35.F : 0);
                                int iL = mwa.L(mncVar2.d() * density);
                                c3d c3dVar36 = c3dVar27;
                                if (c3dVar36 != null) {
                                    f3 = density;
                                    f4 = density2;
                                    b3d.k(b3dVar, c3dVar36, 0, ij0.c(i57 - c3dVar36.F, 2.0f, 1.0f));
                                } else {
                                    f3 = density;
                                    f4 = density2;
                                }
                                int i58 = iG;
                                c3d c3dVar37 = c3dVar21;
                                if (c3dVar34 != null) {
                                    i50 = 2;
                                    if (ylcVar5.b) {
                                        i49 = i58;
                                        ylcVar3 = ylcVar5;
                                        iC = ij0.c(i57 - c3dVar34.F, 2.0f, 1.0f);
                                    } else {
                                        i49 = i58;
                                        ylcVar3 = ylcVar5;
                                        iC = iL;
                                    }
                                    int i59 = -(c3dVar34.F / 2);
                                    float f9 = f2;
                                    int iX = d4c.X(f9, iC, i59);
                                    float fM = gb9.m(mncVar2, layoutDirection) * f3;
                                    float fL = gb9.l(mncVar2, layoutDirection) * f3;
                                    if (c3dVar36 == null) {
                                        f5 = fL;
                                        f6 = fM;
                                    } else {
                                        f5 = fL;
                                        float f10 = c3dVar36.E;
                                        float f11 = fM - f4;
                                        if (f11 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                                            f11 = 0.0f;
                                        }
                                        f6 = f10 + f11;
                                    }
                                    if (c3dVar37 == null) {
                                        f7 = f6;
                                        f8 = f5;
                                    } else {
                                        f7 = f6;
                                        float f12 = c3dVar37.E;
                                        float f13 = f5 - f4;
                                        if (f13 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                                            f13 = 0.0f;
                                        }
                                        f8 = f12 + f13;
                                    }
                                    c3dVar31 = c3dVar37;
                                    fu9 fu9Var = fu9.E;
                                    float f14 = layoutDirection == fu9Var ? fM : f5;
                                    float f15 = layoutDirection == fu9Var ? f7 : f8;
                                    if (!(wghVar instanceof wgh)) {
                                        xh6.k("Unknown position: ", wghVar);
                                        return null;
                                    }
                                    b3dVar.f(c3dVar34, mwa.L(d4c.W(wghVar.b.a(c3dVar34.E, i49 - mwa.L(f7 + f8), layoutDirection) + f15, ((vo1) xn5.e0(wghVar)).a(c3dVar34.E, i49 - mwa.L(fM + f5), layoutDirection) + f14, f9)), iX, MTTypesetterKt.kLineSkipLimitMultiplier);
                                } else {
                                    i49 = i58;
                                    ylcVar3 = ylcVar5;
                                    c3dVar31 = c3dVar37;
                                    i50 = 2;
                                }
                                c3d c3dVar38 = c3dVar29;
                                if (c3dVar38 != null) {
                                    if (c3dVar36 != null) {
                                        c3dVar33 = c3dVar38;
                                        i56 = c3dVar36.E;
                                    } else {
                                        c3dVar33 = c3dVar38;
                                        i56 = 0;
                                    }
                                    c3dVar32 = c3dVar31;
                                    ylc ylcVar6 = ylcVar3;
                                    int iJ = ylc.j(0, ylcVar6, i57, iL, c3dVar34, c3dVar33);
                                    i52 = 0;
                                    ylcVar3 = ylcVar6;
                                    iL = iL;
                                    int i60 = i56;
                                    c3dVar38 = c3dVar33;
                                    i51 = i57;
                                    final int i61 = 0;
                                    b3d.l(b3dVar, c3dVar38, i60, iJ, new bz7() { // from class: xlc
                                        @Override // defpackage.bz7
                                        public final Object invoke(Object obj9) {
                                            int i62 = i61;
                                            iei ieiVar = iei.a;
                                            ogh oghVar3 = oghVar2;
                                            xre xreVar = (xre) obj9;
                                            switch (i62) {
                                                case 0:
                                                    xreVar.b(oghVar3.a());
                                                    break;
                                                case 1:
                                                    xreVar.b(oghVar3.a());
                                                    break;
                                                default:
                                                    xreVar.b(oghVar3.a());
                                                    break;
                                            }
                                            return ieiVar;
                                        }
                                    }, 4);
                                } else {
                                    i51 = i57;
                                    c3dVar32 = c3dVar31;
                                    i52 = 0;
                                }
                                int i62 = (c3dVar38 != null ? c3dVar38.E : 0) + (c3dVar36 != null ? c3dVar36.E : 0);
                                int i63 = i51;
                                c3d c3dVar39 = c3dVar28;
                                int i64 = iL;
                                int i65 = i52;
                                ylc ylcVar7 = ylcVar3;
                                b3d.k(b3dVar, c3dVar39, i62, ylc.j(i65, ylcVar7, i63, i64, c3dVar34, c3dVar39));
                                c3d c3dVar40 = c3dVar26;
                                if (c3dVar40 != null) {
                                    int iJ2 = ylc.j(i65, ylcVar7, i63, i64, c3dVar34, c3dVar40);
                                    i53 = i65;
                                    ylcVar4 = ylcVar7;
                                    i55 = i64;
                                    i54 = i63;
                                    final int i66 = 1;
                                    b3d.l(b3dVar, c3dVar40, i62, iJ2, new bz7() { // from class: xlc
                                        @Override // defpackage.bz7
                                        public final Object invoke(Object obj9) {
                                            int i622 = i66;
                                            iei ieiVar = iei.a;
                                            ogh oghVar3 = oghVar;
                                            xre xreVar = (xre) obj9;
                                            switch (i622) {
                                                case 0:
                                                    xreVar.b(oghVar3.a());
                                                    break;
                                                case 1:
                                                    xreVar.b(oghVar3.a());
                                                    break;
                                                default:
                                                    xreVar.b(oghVar3.a());
                                                    break;
                                            }
                                            return ieiVar;
                                        }
                                    }, 4);
                                } else {
                                    i53 = i65;
                                    ylcVar4 = ylcVar7;
                                    i54 = i63;
                                    i55 = i64;
                                }
                                c3d c3dVar41 = c3dVar30;
                                if (c3dVar41 != null) {
                                    int i67 = (i49 - (c3dVar32 != null ? c3dVar32.E : 0)) - c3dVar41.E;
                                    int i68 = i54;
                                    int iJ3 = ylc.j(i53, ylcVar4, i68, i55, c3dVar34, c3dVar41);
                                    i54 = i68;
                                    final int i69 = i50;
                                    b3d.l(b3dVar, c3dVar41, i67, iJ3, new bz7() { // from class: xlc
                                        @Override // defpackage.bz7
                                        public final Object invoke(Object obj9) {
                                            int i622 = i69;
                                            iei ieiVar = iei.a;
                                            ogh oghVar3 = oghVar2;
                                            xre xreVar = (xre) obj9;
                                            switch (i622) {
                                                case 0:
                                                    xreVar.b(oghVar3.a());
                                                    break;
                                                case 1:
                                                    xreVar.b(oghVar3.a());
                                                    break;
                                                default:
                                                    xreVar.b(oghVar3.a());
                                                    break;
                                            }
                                            return ieiVar;
                                        }
                                    }, 4);
                                    b3dVar = b3dVar;
                                }
                                if (c3dVar32 != null) {
                                    b3d.k(b3dVar, c3dVar32, i49 - c3dVar32.E, ij0.c(i54 - c3dVar32.F, 2.0f, 1.0f));
                                }
                                if (c3dVar35 != null) {
                                    b3d.k(b3dVar, c3dVar35, 0, i54);
                                }
                                return iei.a;
                            }
                        });
                    }
                    i48++;
                    iF = iF;
                }
                throw ij0.q("Collection contains no element matching the predicate.");
            }
            i32 = i33 + 1;
            h5bVar8 = h5bVar10;
            list3 = list3;
            iMax5 = iMax5;
        }
        throw ij0.q("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.o5b
    public final int c(xa9 xa9Var, List list, int i) {
        return i(xa9Var, list, i, new oua(10));
    }

    @Override // defpackage.o5b
    public final int d(xa9 xa9Var, List list, int i) {
        return h(xa9Var, list, i, new oua(9));
    }

    @Override // defpackage.o5b
    public final int e(xa9 xa9Var, List list, int i) {
        return h(xa9Var, list, i, new oua(7));
    }

    public final int f(xa9 xa9Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int iS = nai.S(i5, i7, i3, i4, d4c.X(f, i6, 0));
        mnc mncVar = this.g;
        float fQ0 = xa9Var.q0(mncVar.d());
        return sl4.f(Math.max(i, Math.max(i2, mwa.L(d4c.W(fQ0, Math.max(fQ0, i6 / 2.0f), f) + iS + xa9Var.q0(mncVar.a())))) + i8, j);
    }

    public final int g(xa9 xa9Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, d4c.X(f, i6, 0))) + i + i2;
        mnc mncVar = this.g;
        fu9 fu9Var = fu9.E;
        return sl4.g(Math.max(iMax, mwa.L((i6 + xa9Var.q0(mncVar.c(fu9Var) + mncVar.b(fu9Var))) * f)), j);
    }

    public final int h(xa9 xa9Var, List list, int i, pz7 pz7Var) {
        Object obj;
        int iL;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        int i2;
        Object obj6;
        Object obj7;
        ylc ylcVar = this;
        float fA = ylcVar.d.a();
        List list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (x44.r(tuj.j((h5b) obj), "Leading")) {
                break;
            }
            i3++;
        }
        h5b h5bVar = (h5b) obj;
        if (h5bVar != null) {
            iL = tuj.l(i, h5bVar.o(Integer.MAX_VALUE));
            iIntValue = ((Number) pz7Var.invoke(h5bVar, Integer.valueOf(i))).intValue();
        } else {
            iL = i;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (x44.r(tuj.j((h5b) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        h5b h5bVar2 = (h5b) obj2;
        if (h5bVar2 != null) {
            iL = tuj.l(iL, h5bVar2.o(Integer.MAX_VALUE));
            iIntValue2 = ((Number) pz7Var.invoke(h5bVar2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (x44.r(tuj.j((h5b) obj3), "Label")) {
                break;
            }
            i5++;
        }
        Object obj8 = (h5b) obj3;
        int iIntValue5 = obj8 != null ? ((Number) pz7Var.invoke(obj8, Integer.valueOf(d4c.X(fA, iL, i)))).intValue() : 0;
        int size4 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i6);
            if (x44.r(tuj.j((h5b) obj4), "Prefix")) {
                break;
            }
            i6++;
        }
        h5b h5bVar3 = (h5b) obj4;
        if (h5bVar3 != null) {
            iIntValue3 = ((Number) pz7Var.invoke(h5bVar3, Integer.valueOf(iL))).intValue();
            iL = tuj.l(iL, h5bVar3.o(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i7);
            if (x44.r(tuj.j((h5b) obj5), "Suffix")) {
                break;
            }
            i7++;
        }
        h5b h5bVar4 = (h5b) obj5;
        if (h5bVar4 != null) {
            iIntValue4 = ((Number) pz7Var.invoke(h5bVar4, Integer.valueOf(iL))).intValue();
            iL = tuj.l(iL, h5bVar4.o(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list2.size();
        int i8 = 0;
        while (i8 < size6) {
            Object obj9 = list.get(i8);
            if (x44.r(tuj.j((h5b) obj9), "TextField")) {
                int iIntValue6 = ((Number) pz7Var.invoke(obj9, Integer.valueOf(iL))).intValue();
                int size7 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        i2 = iIntValue6;
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i9);
                    i2 = iIntValue6;
                    if (x44.r(tuj.j((h5b) obj6), "Hint")) {
                        break;
                    }
                    i9++;
                    iIntValue6 = i2;
                }
                Object obj10 = (h5b) obj6;
                int iIntValue7 = obj10 != null ? ((Number) pz7Var.invoke(obj10, Integer.valueOf(iL))).intValue() : 0;
                int size8 = list2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i10);
                    if (x44.r(tuj.j((h5b) obj7), "Supporting")) {
                        break;
                    }
                    i10++;
                }
                Object obj11 = (h5b) obj7;
                return ylcVar.f(xa9Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, i2, iIntValue5, iIntValue7, obj11 != null ? ((Number) pz7Var.invoke(obj11, Integer.valueOf(i))).intValue() : 0, sl4.b(0, 0, 0, 0, 15), fA);
            }
            i8++;
            iIntValue3 = iIntValue3;
            ylcVar = this;
        }
        throw ij0.q("Collection contains no element matching the predicate.");
    }

    public final int i(xa9 xa9Var, List list, int i, pz7 pz7Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (x44.r(tuj.j((h5b) obj7), "TextField")) {
                int iIntValue = ((Number) pz7Var.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (x44.r(tuj.j((h5b) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                h5b h5bVar = (h5b) obj2;
                int iIntValue2 = h5bVar != null ? ((Number) pz7Var.invoke(h5bVar, Integer.valueOf(i))).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (x44.r(tuj.j((h5b) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                h5b h5bVar2 = (h5b) obj3;
                int iIntValue3 = h5bVar2 != null ? ((Number) pz7Var.invoke(h5bVar2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (x44.r(tuj.j((h5b) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                h5b h5bVar3 = (h5b) obj4;
                int iIntValue4 = h5bVar3 != null ? ((Number) pz7Var.invoke(h5bVar3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (x44.r(tuj.j((h5b) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                h5b h5bVar4 = (h5b) obj5;
                int iIntValue5 = h5bVar4 != null ? ((Number) pz7Var.invoke(h5bVar4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (x44.r(tuj.j((h5b) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                h5b h5bVar5 = (h5b) obj6;
                int iIntValue6 = h5bVar5 != null ? ((Number) pz7Var.invoke(h5bVar5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list2.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (x44.r(tuj.j((h5b) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                h5b h5bVar6 = (h5b) obj;
                return g(xa9Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, h5bVar6 != null ? ((Number) pz7Var.invoke(h5bVar6, Integer.valueOf(i))).intValue() : 0, sl4.b(0, 0, 0, 0, 15), this.d.a());
            }
        }
        throw ij0.q("Collection contains no element matching the predicate.");
    }
}
