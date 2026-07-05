package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j8a implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ te3 F;
    public final /* synthetic */ ue3 G;
    public final /* synthetic */ qbd H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ int J;
    public final /* synthetic */ ta4 K;
    public final /* synthetic */ ta4 L;
    public final /* synthetic */ ta4 M;

    public /* synthetic */ j8a(te3 te3Var, ue3 ue3Var, qbd qbdVar, Object obj, int i, ta4 ta4Var, ta4 ta4Var2, ta4 ta4Var3, int i2) {
        this.E = i2;
        this.F = te3Var;
        this.G = ue3Var;
        this.H = qbdVar;
        this.I = obj;
        this.J = i;
        this.K = ta4Var;
        this.L = ta4Var2;
        this.M = ta4Var3;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        qbd qbdVar = null;
        char c = 1;
        char c2 = 1;
        final int i2 = 0;
        switch (i) {
            case 0:
                noh nohVar = (noh) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                nohVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((e18) ld4Var).f(nohVar) : ((e18) ld4Var).h(nohVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    ez1.k(nohVar, null, fd9.q0(-1305174963, new j8a(this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, 1), e18Var), e18Var, (iIntValue & 14) | 384);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((q90) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    te3 te3Var = this.F;
                    ye3 ye3Var = te3Var.d;
                    ye3 ye3Var2 = ye3.E;
                    ue3 ue3Var = this.G;
                    qbd qbdVar2 = this.H;
                    Object obj4 = this.I;
                    final int i3 = this.J;
                    final ta4 ta4Var = this.K;
                    if (ye3Var != ye3Var2) {
                        e18Var2.a0(-127545867);
                        ArrayList arrayList = te3Var.a;
                        ye3 ye3Var3 = te3Var.d;
                        if (qbdVar2 != null && arrayList.size() > 1 && te3Var.b.isEmpty() && te3Var.c.isEmpty()) {
                            qbdVar = qbdVar2;
                        }
                        dch.l(arrayList, ye3Var3, ue3Var, qbdVar, obj4, null, fd9.q0(-1751068749, new sz7() { // from class: l8a
                            @Override // defpackage.sz7
                            public final Object i(Object obj5, Object obj6, Object obj7, Object obj8) {
                                int i4 = i2;
                                iei ieiVar2 = iei.a;
                                final int i5 = i3;
                                final ta4 ta4Var2 = ta4Var;
                                ia0 ia0Var = (ia0) obj5;
                                ie3 ie3Var = (ie3) obj6;
                                ld4 ld4Var3 = (ld4) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                switch (i4) {
                                    case 0:
                                        ia0Var.getClass();
                                        ie3Var.getClass();
                                        final int i6 = 1;
                                        d4c.y(ia0Var, ie3Var, fd9.q0(542520426, new sz7() { // from class: p8a
                                            @Override // defpackage.sz7
                                            public final Object i(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i7 = i6;
                                                iei ieiVar3 = iei.a;
                                                int i8 = i5;
                                                ta4 ta4Var3 = ta4Var2;
                                                ia0 ia0Var2 = (ia0) obj9;
                                                ld4 ld4Var4 = (ld4) obj11;
                                                int iIntValue4 = ((Integer) obj12).intValue();
                                                switch (i7) {
                                                    case 0:
                                                        ia0Var2.getClass();
                                                        obj10.getClass();
                                                        int i9 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? ((e18) ld4Var4).f(ia0Var2) : ((e18) ld4Var4).h(ia0Var2) ? 4 : 2) : iIntValue4;
                                                        if ((iIntValue4 & 48) == 0) {
                                                            i9 |= (iIntValue4 & 64) == 0 ? ((e18) ld4Var4).f(obj10) : ((e18) ld4Var4).h(obj10) ? 32 : 16;
                                                        }
                                                        e18 e18Var3 = (e18) ld4Var4;
                                                        if (!e18Var3.Q(i9 & 1, (i9 & 147) != 146)) {
                                                            e18Var3.T();
                                                        } else {
                                                            ta4Var3.i(ia0Var2, obj10, e18Var3, Integer.valueOf((i9 & 14) | (((i8 >> 18) & 8) << 3) | (i9 & 112)));
                                                        }
                                                        break;
                                                    default:
                                                        ia0Var2.getClass();
                                                        obj10.getClass();
                                                        int i10 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? ((e18) ld4Var4).f(ia0Var2) : ((e18) ld4Var4).h(ia0Var2) ? 4 : 2) : iIntValue4;
                                                        if ((iIntValue4 & 48) == 0) {
                                                            i10 |= (iIntValue4 & 64) == 0 ? ((e18) ld4Var4).f(obj10) : ((e18) ld4Var4).h(obj10) ? 32 : 16;
                                                        }
                                                        e18 e18Var4 = (e18) ld4Var4;
                                                        if (!e18Var4.Q(i10 & 1, (i10 & 147) != 146)) {
                                                            e18Var4.T();
                                                        } else {
                                                            ta4Var3.i(ia0Var2, obj10, e18Var4, Integer.valueOf((i10 & 14) | (((i8 >> 18) & 8) << 3) | (i10 & 112)));
                                                        }
                                                        break;
                                                }
                                                return ieiVar3;
                                            }
                                        }, ld4Var3), ld4Var3, (iIntValue3 & 112) | (iIntValue3 & 14) | 384);
                                        break;
                                    default:
                                        ia0Var.getClass();
                                        ie3Var.getClass();
                                        final int i7 = 0;
                                        d4c.y(ia0Var, ie3Var, fd9.q0(732004851, new sz7() { // from class: p8a
                                            @Override // defpackage.sz7
                                            public final Object i(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i72 = i7;
                                                iei ieiVar3 = iei.a;
                                                int i8 = i5;
                                                ta4 ta4Var3 = ta4Var2;
                                                ia0 ia0Var2 = (ia0) obj9;
                                                ld4 ld4Var4 = (ld4) obj11;
                                                int iIntValue4 = ((Integer) obj12).intValue();
                                                switch (i72) {
                                                    case 0:
                                                        ia0Var2.getClass();
                                                        obj10.getClass();
                                                        int i9 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? ((e18) ld4Var4).f(ia0Var2) : ((e18) ld4Var4).h(ia0Var2) ? 4 : 2) : iIntValue4;
                                                        if ((iIntValue4 & 48) == 0) {
                                                            i9 |= (iIntValue4 & 64) == 0 ? ((e18) ld4Var4).f(obj10) : ((e18) ld4Var4).h(obj10) ? 32 : 16;
                                                        }
                                                        e18 e18Var3 = (e18) ld4Var4;
                                                        if (!e18Var3.Q(i9 & 1, (i9 & 147) != 146)) {
                                                            e18Var3.T();
                                                        } else {
                                                            ta4Var3.i(ia0Var2, obj10, e18Var3, Integer.valueOf((i9 & 14) | (((i8 >> 18) & 8) << 3) | (i9 & 112)));
                                                        }
                                                        break;
                                                    default:
                                                        ia0Var2.getClass();
                                                        obj10.getClass();
                                                        int i10 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? ((e18) ld4Var4).f(ia0Var2) : ((e18) ld4Var4).h(ia0Var2) ? 4 : 2) : iIntValue4;
                                                        if ((iIntValue4 & 48) == 0) {
                                                            i10 |= (iIntValue4 & 64) == 0 ? ((e18) ld4Var4).f(obj10) : ((e18) ld4Var4).h(obj10) ? 32 : 16;
                                                        }
                                                        e18 e18Var4 = (e18) ld4Var4;
                                                        if (!e18Var4.Q(i10 & 1, (i10 & 147) != 146)) {
                                                            e18Var4.T();
                                                        } else {
                                                            ta4Var3.i(ia0Var2, obj10, e18Var4, Integer.valueOf((i10 & 14) | (((i8 >> 18) & 8) << 3) | (i10 & 112)));
                                                        }
                                                        break;
                                                }
                                                return ieiVar3;
                                            }
                                        }, ld4Var3), ld4Var3, (iIntValue3 & 112) | (iIntValue3 & 14) | 384);
                                        break;
                                }
                                return ieiVar2;
                            }
                        }, e18Var2), e18Var2, 1576960 | (((i3 >> 18) & 8) << 12), 32);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-128309800);
                        final char c3 = c2 == true ? 1 : 0;
                        dch.a(te3Var, ue3Var, qbdVar2, obj4, fd9.q0(1547204540, new sz7() { // from class: l8a
                            @Override // defpackage.sz7
                            public final Object i(Object obj5, Object obj6, Object obj7, Object obj8) {
                                int i4 = c3;
                                iei ieiVar2 = iei.a;
                                final int i5 = i3;
                                final ta4 ta4Var2 = ta4Var;
                                ia0 ia0Var = (ia0) obj5;
                                ie3 ie3Var = (ie3) obj6;
                                ld4 ld4Var3 = (ld4) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                switch (i4) {
                                    case 0:
                                        ia0Var.getClass();
                                        ie3Var.getClass();
                                        final int i6 = 1;
                                        d4c.y(ia0Var, ie3Var, fd9.q0(542520426, new sz7() { // from class: p8a
                                            @Override // defpackage.sz7
                                            public final Object i(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i72 = i6;
                                                iei ieiVar3 = iei.a;
                                                int i8 = i5;
                                                ta4 ta4Var3 = ta4Var2;
                                                ia0 ia0Var2 = (ia0) obj9;
                                                ld4 ld4Var4 = (ld4) obj11;
                                                int iIntValue4 = ((Integer) obj12).intValue();
                                                switch (i72) {
                                                    case 0:
                                                        ia0Var2.getClass();
                                                        obj10.getClass();
                                                        int i9 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? ((e18) ld4Var4).f(ia0Var2) : ((e18) ld4Var4).h(ia0Var2) ? 4 : 2) : iIntValue4;
                                                        if ((iIntValue4 & 48) == 0) {
                                                            i9 |= (iIntValue4 & 64) == 0 ? ((e18) ld4Var4).f(obj10) : ((e18) ld4Var4).h(obj10) ? 32 : 16;
                                                        }
                                                        e18 e18Var3 = (e18) ld4Var4;
                                                        if (!e18Var3.Q(i9 & 1, (i9 & 147) != 146)) {
                                                            e18Var3.T();
                                                        } else {
                                                            ta4Var3.i(ia0Var2, obj10, e18Var3, Integer.valueOf((i9 & 14) | (((i8 >> 18) & 8) << 3) | (i9 & 112)));
                                                        }
                                                        break;
                                                    default:
                                                        ia0Var2.getClass();
                                                        obj10.getClass();
                                                        int i10 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? ((e18) ld4Var4).f(ia0Var2) : ((e18) ld4Var4).h(ia0Var2) ? 4 : 2) : iIntValue4;
                                                        if ((iIntValue4 & 48) == 0) {
                                                            i10 |= (iIntValue4 & 64) == 0 ? ((e18) ld4Var4).f(obj10) : ((e18) ld4Var4).h(obj10) ? 32 : 16;
                                                        }
                                                        e18 e18Var4 = (e18) ld4Var4;
                                                        if (!e18Var4.Q(i10 & 1, (i10 & 147) != 146)) {
                                                            e18Var4.T();
                                                        } else {
                                                            ta4Var3.i(ia0Var2, obj10, e18Var4, Integer.valueOf((i10 & 14) | (((i8 >> 18) & 8) << 3) | (i10 & 112)));
                                                        }
                                                        break;
                                                }
                                                return ieiVar3;
                                            }
                                        }, ld4Var3), ld4Var3, (iIntValue3 & 112) | (iIntValue3 & 14) | 384);
                                        break;
                                    default:
                                        ia0Var.getClass();
                                        ie3Var.getClass();
                                        final int i7 = 0;
                                        d4c.y(ia0Var, ie3Var, fd9.q0(732004851, new sz7() { // from class: p8a
                                            @Override // defpackage.sz7
                                            public final Object i(Object obj9, Object obj10, Object obj11, Object obj12) {
                                                int i72 = i7;
                                                iei ieiVar3 = iei.a;
                                                int i8 = i5;
                                                ta4 ta4Var3 = ta4Var2;
                                                ia0 ia0Var2 = (ia0) obj9;
                                                ld4 ld4Var4 = (ld4) obj11;
                                                int iIntValue4 = ((Integer) obj12).intValue();
                                                switch (i72) {
                                                    case 0:
                                                        ia0Var2.getClass();
                                                        obj10.getClass();
                                                        int i9 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? ((e18) ld4Var4).f(ia0Var2) : ((e18) ld4Var4).h(ia0Var2) ? 4 : 2) : iIntValue4;
                                                        if ((iIntValue4 & 48) == 0) {
                                                            i9 |= (iIntValue4 & 64) == 0 ? ((e18) ld4Var4).f(obj10) : ((e18) ld4Var4).h(obj10) ? 32 : 16;
                                                        }
                                                        e18 e18Var3 = (e18) ld4Var4;
                                                        if (!e18Var3.Q(i9 & 1, (i9 & 147) != 146)) {
                                                            e18Var3.T();
                                                        } else {
                                                            ta4Var3.i(ia0Var2, obj10, e18Var3, Integer.valueOf((i9 & 14) | (((i8 >> 18) & 8) << 3) | (i9 & 112)));
                                                        }
                                                        break;
                                                    default:
                                                        ia0Var2.getClass();
                                                        obj10.getClass();
                                                        int i10 = (iIntValue4 & 6) == 0 ? iIntValue4 | ((iIntValue4 & 8) == 0 ? ((e18) ld4Var4).f(ia0Var2) : ((e18) ld4Var4).h(ia0Var2) ? 4 : 2) : iIntValue4;
                                                        if ((iIntValue4 & 48) == 0) {
                                                            i10 |= (iIntValue4 & 64) == 0 ? ((e18) ld4Var4).f(obj10) : ((e18) ld4Var4).h(obj10) ? 32 : 16;
                                                        }
                                                        e18 e18Var4 = (e18) ld4Var4;
                                                        if (!e18Var4.Q(i10 & 1, (i10 & 147) != 146)) {
                                                            e18Var4.T();
                                                        } else {
                                                            ta4Var3.i(ia0Var2, obj10, e18Var4, Integer.valueOf((i10 & 14) | (((i8 >> 18) & 8) << 3) | (i10 & 112)));
                                                        }
                                                        break;
                                                }
                                                return ieiVar3;
                                            }
                                        }, ld4Var3), ld4Var3, (iIntValue3 & 112) | (iIntValue3 & 14) | 384);
                                        break;
                                }
                                return ieiVar2;
                            }
                        }, e18Var2), fd9.q0(-29020197, new k8a(this.L, i2), e18Var2), fd9.q0(-1605244934, new k8a(this.M, c == true ? 1 : 0), e18Var2), e18Var2, 1794560 | (((i3 >> 18) & 8) << 9));
                        e18Var2.p(false);
                    }
                }
                break;
        }
        return ieiVar;
    }
}
