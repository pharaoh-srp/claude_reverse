package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class khh implements o5b {
    public final boolean a;
    public final wgh b;
    public final ogh c;
    public final ogh d;
    public final ogh e;
    public final mnc f;
    public final float g;

    public khh(boolean z, wgh wghVar, ogh oghVar, ogh oghVar2, ogh oghVar3, mnc mncVar, float f) {
        this.a = z;
        this.b = wghVar;
        this.c = oghVar;
        this.d = oghVar2;
        this.e = oghVar3;
        this.f = mncVar;
        this.g = f;
    }

    public static int h(List list, int i, pz7 pz7Var) {
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
                    if (x44.r(tuj.j((h5b) obj4), "Prefix")) {
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
                    if (x44.r(tuj.j((h5b) obj5), "Suffix")) {
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
                    if (x44.r(tuj.j((h5b) obj6), "Leading")) {
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
                int i9 = iIntValue4 + iIntValue5;
                return sl4.g(Math.max(iIntValue + i9, Math.max((h5bVar6 != null ? ((Number) pz7Var.invoke(h5bVar6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, sl4.b(0, 0, 0, 0, 15));
            }
        }
        throw ij0.q("Collection contains no element matching the predicate.");
    }

    public static final int i(khh khhVar, int i, int i2, c3d c3dVar) {
        return khhVar.a ? ij0.c(i - c3dVar.F, 2.0f, 1.0f) : i2;
    }

    @Override // defpackage.o5b
    public final int a(xa9 xa9Var, List list, int i) {
        return h(list, i, new qte((byte) 0, 23));
    }

    @Override // defpackage.o5b
    public final p5b b(final q5b q5bVar, List list, long j) {
        Object obj;
        Object obj2;
        c3d c3dVar;
        c3d c3dVarU;
        Object obj3;
        int i;
        c3d c3dVarU2;
        c3d c3dVar2;
        Object obj4;
        int i2;
        c3d c3dVarU3;
        c3d c3dVar3;
        Object obj5;
        int i3;
        Object obj6;
        Object obj7;
        c3d c3dVar4;
        int i4;
        dae daeVar;
        int i5;
        int i6;
        c3d c3dVar5;
        int i7;
        dae daeVar2;
        int i8;
        c3d c3dVar6;
        float f;
        c3d c3dVar7;
        int i9;
        int i10;
        c3d c3dVar8;
        c3d c3dVar9;
        int i11;
        int i12;
        khh khhVar;
        q5b q5bVar2;
        float fA = this.c.a();
        mnc mncVar = this.f;
        final int iM0 = q5bVar.M0(mncVar.d());
        int iM02 = q5bVar.M0(mncVar.a());
        long jA = rl4.a(0, 0, 0, 0, 10, j);
        List list2 = list;
        int size = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (x44.r(zni.B((h5b) obj), "Leading")) {
                break;
            }
            i13++;
        }
        h5b h5bVar = (h5b) obj;
        c3d c3dVarU4 = h5bVar != null ? h5bVar.u(jA) : null;
        int i14 = c3dVarU4 != null ? c3dVarU4.E : 0;
        int iMax = Math.max(0, c3dVarU4 != null ? c3dVarU4.F : 0);
        int size2 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i15);
            if (x44.r(zni.B((h5b) obj2), "Trailing")) {
                break;
            }
            i15++;
        }
        h5b h5bVar2 = (h5b) obj2;
        if (h5bVar2 != null) {
            c3dVar = c3dVarU4;
            c3dVarU = h5bVar2.u(sl4.j(-i14, 0, 2, jA));
        } else {
            c3dVar = c3dVarU4;
            c3dVarU = null;
        }
        int i16 = i14 + (c3dVarU != null ? c3dVarU.E : 0);
        int iMax2 = Math.max(iMax, c3dVarU != null ? c3dVarU.F : 0);
        int size3 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i17);
            if (x44.r(zni.B((h5b) obj3), "Prefix")) {
                break;
            }
            i17++;
        }
        h5b h5bVar3 = (h5b) obj3;
        if (h5bVar3 != null) {
            i = i16;
            c3dVarU2 = h5bVar3.u(sl4.j(-i16, 0, 2, jA));
        } else {
            i = i16;
            c3dVarU2 = null;
        }
        int i18 = i + (c3dVarU2 != null ? c3dVarU2.E : 0);
        int iMax3 = Math.max(iMax2, c3dVarU2 != null ? c3dVarU2.F : 0);
        int size4 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size4) {
                c3dVar2 = c3dVarU;
                obj4 = null;
                break;
            }
            obj4 = list.get(i19);
            c3dVar2 = c3dVarU;
            if (x44.r(zni.B((h5b) obj4), "Suffix")) {
                break;
            }
            i19++;
            c3dVarU = c3dVar2;
        }
        h5b h5bVar4 = (h5b) obj4;
        if (h5bVar4 != null) {
            i2 = 0;
            c3dVarU3 = h5bVar4.u(sl4.j(-i18, 0, 2, jA));
        } else {
            i2 = 0;
            c3dVarU3 = null;
        }
        int i20 = i18 + (c3dVarU3 != null ? c3dVarU3.E : i2);
        int iMax4 = Math.max(iMax3, c3dVarU3 != null ? c3dVarU3.F : i2);
        int size5 = list2.size();
        int i21 = i2;
        while (true) {
            if (i21 >= size5) {
                c3dVar3 = c3dVarU3;
                obj5 = null;
                break;
            }
            obj5 = list.get(i21);
            c3dVar3 = c3dVarU3;
            if (x44.r(zni.B((h5b) obj5), "Label")) {
                break;
            }
            i21++;
            c3dVarU3 = c3dVar3;
        }
        h5b h5bVar5 = (h5b) obj5;
        dae daeVar3 = new dae();
        int i22 = -i20;
        daeVar3.E = h5bVar5 != null ? h5bVar5.u(sl4.i(i22, -iM02, jA)) : null;
        int size6 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size6) {
                i3 = iM02;
                obj6 = null;
                break;
            }
            obj6 = list.get(i23);
            i3 = iM02;
            if (x44.r(zni.B((h5b) obj6), "Supporting")) {
                break;
            }
            i23++;
            iM02 = i3;
        }
        h5b h5bVar6 = (h5b) obj6;
        int iQ = h5bVar6 != null ? h5bVar6.Q(rl4.j(j)) : 0;
        c3d c3dVar10 = (c3d) daeVar3.E;
        int i24 = (c3dVar10 != null ? c3dVar10.F : 0) + iM0;
        final c3d c3dVar11 = c3dVar2;
        long j2 = jA;
        c3d c3dVar12 = c3dVar3;
        h5b h5bVar7 = h5bVar6;
        c3d c3dVar13 = c3dVar;
        dae daeVar4 = daeVar3;
        long jI = sl4.i(i22, ((-i24) - i3) - iQ, rl4.a(0, 0, 0, 0, 11, j));
        int size7 = list2.size();
        int i25 = 0;
        while (i25 < size7) {
            h5b h5bVar8 = (h5b) list.get(i25);
            if (x44.r(zni.B(h5bVar8), "TextField")) {
                c3d c3dVarU5 = h5bVar8.u(jI);
                long jA2 = rl4.a(0, 0, 0, 0, 14, jI);
                List list3 = list;
                int size8 = list3.size();
                int i26 = 0;
                while (true) {
                    if (i26 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i26);
                    if (x44.r(zni.B((h5b) obj7), "Hint")) {
                        break;
                    }
                    i26++;
                }
                h5b h5bVar9 = (h5b) obj7;
                c3d c3dVarU6 = h5bVar9 != null ? h5bVar9.u(jA2) : null;
                int iMax5 = Math.max(iMax4, Math.max(c3dVarU5.F, c3dVarU6 != null ? c3dVarU6.F : 0) + i24 + i3);
                int i27 = c3dVar13 != null ? c3dVar13.E : 0;
                int i28 = c3dVar11 != null ? c3dVar11.E : 0;
                int i29 = c3dVarU2 != null ? c3dVarU2.E : 0;
                int i30 = c3dVar12 != null ? c3dVar12.E : 0;
                int i31 = c3dVarU5.E;
                c3d c3dVar14 = (c3d) daeVar4.E;
                int i32 = i29 + i30;
                int iG = sl4.g(Math.max(i31 + i32, Math.max((c3dVarU6 != null ? c3dVarU6.E : 0) + i32, c3dVar14 != null ? c3dVar14.E : 0)) + i27 + i28, j);
                c3d c3dVarU7 = h5bVar7 != null ? h5bVar7.u(rl4.a(0, iG, 0, 0, 9, sl4.j(0, -iMax5, 1, j2))) : null;
                int i33 = c3dVarU7 != null ? c3dVarU7.F : 0;
                int i34 = c3dVarU5.F;
                c3d c3dVar15 = (c3d) daeVar4.E;
                if (c3dVar15 != null) {
                    int i35 = c3dVar15.F;
                    c3dVar4 = c3dVarU5;
                    i4 = i35;
                } else {
                    c3dVar4 = c3dVarU5;
                    i4 = 0;
                }
                if (c3dVar13 != null) {
                    daeVar = daeVar4;
                    i5 = i34;
                    i6 = c3dVar13.F;
                } else {
                    daeVar = daeVar4;
                    i5 = i34;
                    i6 = 0;
                }
                int i36 = c3dVar11 != null ? c3dVar11.F : 0;
                int i37 = c3dVarU2 != null ? c3dVarU2.F : 0;
                final c3d c3dVar16 = c3dVarU2;
                if (c3dVar12 != null) {
                    c3d c3dVar17 = c3dVar4;
                    i7 = c3dVar12.F;
                    c3dVar5 = c3dVar17;
                } else {
                    c3dVar5 = c3dVar4;
                    i7 = 0;
                }
                final c3d c3dVar18 = c3dVar5;
                if (c3dVarU6 != null) {
                    dae daeVar5 = daeVar;
                    i8 = c3dVarU6.F;
                    daeVar2 = daeVar5;
                } else {
                    daeVar2 = daeVar;
                    i8 = 0;
                }
                final dae daeVar6 = daeVar2;
                if (c3dVarU7 != null) {
                    c3dVar6 = c3dVar12;
                    f = fA;
                    c3dVar7 = c3dVarU6;
                    i9 = i36;
                    i10 = c3dVarU7.F;
                    c3dVar8 = c3dVarU7;
                    c3dVar9 = c3dVar13;
                    i11 = iG;
                    i12 = 0;
                    q5bVar2 = q5bVar;
                    khhVar = this;
                } else {
                    c3dVar6 = c3dVar12;
                    f = fA;
                    c3dVar7 = c3dVarU6;
                    i9 = i36;
                    i10 = 0;
                    c3dVar8 = c3dVarU7;
                    c3dVar9 = c3dVar13;
                    i11 = iG;
                    i12 = 0;
                    khhVar = this;
                    q5bVar2 = q5bVar;
                }
                final int iF = khhVar.f(q5bVar2, i5, i4, i6, i9, i37, i7, i8, i10, j, f);
                final int i38 = iF - i33;
                int size9 = list3.size();
                for (int i39 = i12; i39 < size9; i39++) {
                    h5b h5bVar10 = (h5b) list.get(i39);
                    if (x44.r(zni.B(h5bVar10), "Container")) {
                        final c3d c3dVarU8 = h5bVar10.u(sl4.a(i11 != Integer.MAX_VALUE ? i11 : i12, i11, i38 != Integer.MAX_VALUE ? i38 : i12, i38));
                        final int i40 = i11;
                        final c3d c3dVar19 = c3dVar7;
                        final c3d c3dVar20 = c3dVar9;
                        final c3d c3dVar21 = c3dVar8;
                        final float f2 = f;
                        final c3d c3dVar22 = c3dVar6;
                        return q5bVar.U(i40, iF, nm6.E, new bz7() { // from class: jhh
                            /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
                            /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
                            /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
                            @Override // defpackage.bz7
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r23) {
                                /*
                                    Method dump skipped, instruction units count: 549
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.jhh.invoke(java.lang.Object):java.lang.Object");
                            }
                        });
                    }
                }
                throw ij0.q("Collection contains no element matching the predicate.");
            }
            i25++;
            h5bVar7 = h5bVar7;
            c3dVarU2 = c3dVarU2;
            c3dVar12 = c3dVar12;
            daeVar4 = daeVar4;
            j2 = j2;
        }
        throw ij0.q("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.o5b
    public final int c(xa9 xa9Var, List list, int i) {
        return h(list, i, new qte((byte) 0, 22));
    }

    @Override // defpackage.o5b
    public final int d(xa9 xa9Var, List list, int i) {
        return g(xa9Var, list, i, new qte((byte) 0, 25));
    }

    @Override // defpackage.o5b
    public final int e(xa9 xa9Var, List list, int i) {
        return g(xa9Var, list, i, new qte((byte) 0, 24));
    }

    public final int f(xa9 xa9Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        mnc mncVar = this.f;
        return sl4.f(Math.max(i3, Math.max(i4, xa9Var.M0(mncVar.a() + mncVar.d()) + (i2 > 0 ? Math.max(xa9Var.M0(this.g * 2.0f), d4c.X(csb.a.a(f), 0, i2)) : 0) + nai.S(i, i7, i5, i6, d4c.X(f, i2, 0)))) + i8, j);
    }

    public final int g(xa9 xa9Var, List list, int i, pz7 pz7Var) {
        Object obj;
        int i2;
        int iL;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        List list2 = list;
        int size = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (x44.r(tuj.j((h5b) obj), "Leading")) {
                break;
            }
            i5++;
        }
        h5b h5bVar = (h5b) obj;
        if (h5bVar != null) {
            i2 = i;
            iL = tuj.l(i2, h5bVar.o(Integer.MAX_VALUE));
            iIntValue = ((Number) pz7Var.invoke(h5bVar, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iL = i2;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (x44.r(tuj.j((h5b) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        h5b h5bVar2 = (h5b) obj2;
        if (h5bVar2 != null) {
            iL = tuj.l(iL, h5bVar2.o(Integer.MAX_VALUE));
            iIntValue2 = ((Number) pz7Var.invoke(h5bVar2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (x44.r(tuj.j((h5b) obj3), "Label")) {
                break;
            }
            i7++;
        }
        Object obj8 = (h5b) obj3;
        int iIntValue3 = obj8 != null ? ((Number) pz7Var.invoke(obj8, Integer.valueOf(iL))).intValue() : 0;
        int size4 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (x44.r(tuj.j((h5b) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        h5b h5bVar3 = (h5b) obj4;
        if (h5bVar3 != null) {
            int iIntValue4 = ((Number) pz7Var.invoke(h5bVar3, Integer.valueOf(iL))).intValue();
            iL = tuj.l(iL, h5bVar3.o(Integer.MAX_VALUE));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (x44.r(tuj.j((h5b) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        h5b h5bVar4 = (h5b) obj5;
        if (h5bVar4 != null) {
            int iIntValue5 = ((Number) pz7Var.invoke(h5bVar4, Integer.valueOf(iL))).intValue();
            iL = tuj.l(iL, h5bVar4.o(Integer.MAX_VALUE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list2.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj9 = list.get(i10);
            if (x44.r(tuj.j((h5b) obj9), "TextField")) {
                int iIntValue6 = ((Number) pz7Var.invoke(obj9, Integer.valueOf(iL))).intValue();
                int size7 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (x44.r(tuj.j((h5b) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                Object obj10 = (h5b) obj6;
                int iIntValue7 = obj10 != null ? ((Number) pz7Var.invoke(obj10, Integer.valueOf(iL))).intValue() : 0;
                int size8 = list2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i12);
                    if (x44.r(tuj.j((h5b) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i12++;
                }
                Object obj12 = (h5b) obj7;
                return f(xa9Var, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, obj12 != null ? ((Number) pz7Var.invoke(obj12, Integer.valueOf(i2))).intValue() : 0, sl4.b(0, 0, 0, 0, 15), this.c.a());
            }
        }
        throw ij0.q("Collection contains no element matching the predicate.");
    }
}
