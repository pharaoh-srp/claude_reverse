package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p2i implements o5b {
    public final to7 a;
    public final jo0 b;
    public final vo1 c;
    public final int d;
    public final float e;
    public final mnc f;

    public p2i(to7 to7Var, jo0 jo0Var, vo1 vo1Var, int i, float f, mnc mncVar) {
        this.a = to7Var;
        this.b = jo0Var;
        this.c = vo1Var;
        this.d = i;
        this.e = f;
        this.f = mncVar;
    }

    @Override // defpackage.o5b
    public final int a(xa9 xa9Var, List list, int i) {
        int size = list.size();
        int iO = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iO += ((h5b) list.get(i2)).o(i);
        }
        return iO;
    }

    @Override // defpackage.o5b
    public final p5b b(q5b q5bVar, List list, final long j) {
        int iH;
        int i;
        final p2i p2iVar = this;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            h5b h5bVar = (h5b) list.get(i2);
            if (x44.r(zni.B(h5bVar), "navigationIcon")) {
                final c3d c3dVarU = h5bVar.u(rl4.a(0, 0, 0, 0, 14, j));
                List list2 = list;
                int size2 = list2.size();
                int i3 = 0;
                while (i3 < size2) {
                    h5b h5bVar2 = (h5b) list.get(i3);
                    if (x44.r(zni.B(h5bVar2), "actionIcons")) {
                        final c3d c3dVarU2 = h5bVar2.u(rl4.a(0, 0, 0, 0, 14, j));
                        fu9 layoutDirection = q5bVar.getLayoutDirection();
                        mnc mncVar = p2iVar.f;
                        float fM = gb9.m(mncVar, layoutDirection);
                        float fL = gb9.l(mncVar, q5bVar.getLayoutDirection());
                        int iMax = Math.max(q5bVar.M0(eg0.f), c3dVarU.E);
                        if (rl4.h(j) == Integer.MAX_VALUE) {
                            iH = rl4.h(j);
                        } else {
                            int iH2 = (((rl4.h(j) - iMax) - c3dVarU2.E) - q5bVar.M0(fM)) - q5bVar.M0(fL);
                            iH = iH2 < 0 ? 0 : iH2;
                        }
                        int i4 = iH;
                        int size3 = list2.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            h5b h5bVar3 = (h5b) list.get(i5);
                            if (x44.r(zni.B(h5bVar3), "title")) {
                                final c3d c3dVarU3 = h5bVar3.u(rl4.a(0, i4, 0, 0, 12, j));
                                mo8 mo8Var = xt.b;
                                int iR = c3dVarU3.R(mo8Var) != Integer.MIN_VALUE ? c3dVarU3.R(mo8Var) : 0;
                                float fA = p2iVar.a.a();
                                int iL = Float.isNaN(fA) ? 0 : mwa.L(fA);
                                final int iMax2 = Math.max(q5bVar.M0(p2iVar.e), c3dVarU3.F) + q5bVar.M0(mncVar.d()) + q5bVar.M0(mncVar.a());
                                if (rl4.g(j) == Integer.MAX_VALUE) {
                                    i = iMax2;
                                } else {
                                    int i6 = iL + iMax2;
                                    i = i6 >= 0 ? i6 : 0;
                                }
                                int iM0 = q5bVar.M0(mncVar.d());
                                int iM02 = q5bVar.M0(mncVar.a());
                                final int iM03 = q5bVar.M0(gb9.m(mncVar, q5bVar.getLayoutDirection()));
                                final int iM04 = q5bVar.M0(gb9.l(mncVar, q5bVar.getLayoutDirection()));
                                final int i7 = (iM0 + i) - iM02;
                                final int i8 = iR;
                                return q5bVar.U(rl4.h(j), i, nm6.E, new bz7() { // from class: o2i
                                    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
                                    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
                                    @Override // defpackage.bz7
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final java.lang.Object invoke(java.lang.Object r14) {
                                        /*
                                            r13 = this;
                                            b3d r14 = (defpackage.b3d) r14
                                            c3d r0 = r1
                                            int r1 = r0.F
                                            int r2 = r3
                                            int r1 = r2 - r1
                                            int r1 = r1 / 2
                                            int r3 = r2
                                            defpackage.b3d.k(r14, r0, r3, r1)
                                            float r1 = defpackage.eg0.f
                                            int r1 = r14.M0(r1)
                                            int r0 = r0.E
                                            int r0 = java.lang.Math.max(r1, r0)
                                            c3d r1 = r5
                                            int r4 = r1.E
                                            p2i r5 = r9
                                            vo1 r6 = r5.c
                                            c3d r7 = r4
                                            int r8 = r7.E
                                            long r9 = r6
                                            int r11 = defpackage.rl4.h(r9)
                                            fu9 r12 = defpackage.fu9.E
                                            int r6 = r6.a(r8, r11, r12)
                                            if (r6 >= r0) goto L3b
                                            int r0 = r0 - r6
                                        L38:
                                            int r0 = r0 + r3
                                            int r6 = r6 + r0
                                            goto L4f
                                        L3b:
                                            int r0 = r7.E
                                            int r0 = r0 + r6
                                            int r8 = defpackage.rl4.h(r9)
                                            int r8 = r8 - r4
                                            if (r0 <= r8) goto L4f
                                            int r0 = defpackage.rl4.h(r9)
                                            int r0 = r0 - r4
                                            int r4 = r7.E
                                            int r4 = r4 + r6
                                            int r0 = r0 - r4
                                            goto L38
                                        L4f:
                                            jo0 r0 = r5.b
                                            dd8 r3 = defpackage.ko0.e
                                            boolean r3 = r0.equals(r3)
                                            if (r3 == 0) goto L60
                                            int r0 = r7.F
                                            int r0 = r2 - r0
                                            int r0 = r0 / 2
                                            goto L89
                                        L60:
                                            eo0 r3 = defpackage.ko0.d
                                            boolean r0 = r0.equals(r3)
                                            r3 = 0
                                            if (r0 == 0) goto L88
                                            int r0 = r5.d
                                            int r4 = r7.F
                                            if (r0 != 0) goto L72
                                            int r0 = r2 - r4
                                            goto L89
                                        L72:
                                            int r5 = r10
                                            int r5 = r4 - r5
                                            int r0 = r0 - r5
                                            int r5 = r0 + r4
                                            int r8 = r11
                                            if (r5 <= r8) goto L7f
                                            int r5 = r5 - r8
                                            int r0 = r0 - r5
                                        L7f:
                                            int r4 = r2 - r4
                                            int r0 = java.lang.Math.max(r3, r0)
                                            int r0 = r4 - r0
                                            goto L89
                                        L88:
                                            r0 = r3
                                        L89:
                                            defpackage.b3d.k(r14, r7, r6, r0)
                                            int r0 = defpackage.rl4.h(r9)
                                            int r3 = r1.E
                                            int r0 = r0 - r3
                                            int r13 = r8
                                            int r0 = r0 - r13
                                            int r13 = r1.F
                                            int r2 = r2 - r13
                                            int r2 = r2 / 2
                                            defpackage.b3d.k(r14, r1, r0, r2)
                                            iei r13 = defpackage.iei.a
                                            return r13
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2i.invoke(java.lang.Object):java.lang.Object");
                                    }
                                });
                            }
                            i5++;
                            p2iVar = this;
                        }
                        throw ij0.q("Collection contains no element matching the predicate.");
                    }
                    i3++;
                    p2iVar = this;
                }
                throw ij0.q("Collection contains no element matching the predicate.");
            }
            i2++;
            p2iVar = this;
        }
        throw ij0.q("Collection contains no element matching the predicate.");
    }

    @Override // defpackage.o5b
    public final int c(xa9 xa9Var, List list, int i) {
        int size = list.size();
        int iL = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iL += ((h5b) list.get(i2)).l(i);
        }
        return iL;
    }

    @Override // defpackage.o5b
    public final int d(xa9 xa9Var, List list, int i) {
        Integer numValueOf;
        int iM0 = xa9Var.M0(this.e);
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((h5b) list.get(0)).a(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((h5b) list.get(i2)).a(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return Math.max(iM0, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // defpackage.o5b
    public final int e(xa9 xa9Var, List list, int i) {
        Integer numValueOf;
        int iM0 = xa9Var.M0(this.e);
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((h5b) list.get(0)).Q(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((h5b) list.get(i2)).Q(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return Math.max(iM0, numValueOf != null ? numValueOf.intValue() : 0);
    }
}
