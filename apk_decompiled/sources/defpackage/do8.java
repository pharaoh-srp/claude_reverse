package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerCustomizeCommitted;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerCustomizeToggled;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerMoreExpanded;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerTabReordered;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class do8 implements rz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ un8 F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ nwb I;
    public final /* synthetic */ of6 J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ List L;
    public final /* synthetic */ Map M;
    public final /* synthetic */ Set N;
    public final /* synthetic */ zy7 O;
    public final /* synthetic */ pz7 P;
    public final /* synthetic */ bz7 Q;
    public final /* synthetic */ bz7 R;
    public final /* synthetic */ bz7 S;
    public final /* synthetic */ bz7 T;
    public final /* synthetic */ zy7 U;
    public final /* synthetic */ zy7 V;
    public final /* synthetic */ zy7 W;
    public final /* synthetic */ qi3 X;
    public final /* synthetic */ wlg Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ do8(un8 un8Var, boolean z, boolean z2, nwb nwbVar, of6 of6Var, boolean z3, List list, Map map, Set set, zy7 zy7Var, pz7 pz7Var, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, qi3 qi3Var, qnc qncVar, wlg wlgVar) {
        this.F = un8Var;
        this.G = z;
        this.H = z2;
        this.I = nwbVar;
        this.J = of6Var;
        this.K = z3;
        this.L = list;
        this.M = map;
        this.N = set;
        this.O = zy7Var;
        this.P = pz7Var;
        this.Q = bz7Var;
        this.R = bz7Var2;
        this.S = bz7Var3;
        this.T = bz7Var4;
        this.U = zy7Var2;
        this.V = zy7Var3;
        this.W = zy7Var4;
        this.X = qi3Var;
        this.Z = qncVar;
        this.Y = wlgVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        iei ieiVar;
        qnc qncVar;
        un8 un8Var;
        int i;
        zy7 zy7Var;
        boolean z;
        int i2 = this.E;
        iei ieiVar2 = iei.a;
        lz1 lz1Var = jd4.a;
        Object obj4 = this.Z;
        boolean z2 = false;
        boolean z3 = false;
        switch (i2) {
            case 0:
                zy7 zy7Var2 = (zy7) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    WeakHashMap weakHashMap = gdj.x;
                    a5a a5aVar = new a5a(s4i.d(e18Var).g, 15);
                    fqb fqbVar = fqb.E;
                    iqb iqbVarM = knk.M(fqbVar, a5aVar);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarM);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var, z80Var, q64VarA);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var, z80Var2, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var, z80Var4, iqbVarE);
                    boolean z4 = this.G;
                    if (z4) {
                        e18Var.a0(1097315049);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(1097222793);
                        kxk.g(e18Var, fik.o(fqbVar, s4i.d(e18Var).m));
                        e18Var.p(false);
                    }
                    mxd mxdVarD = fxd.d(e18Var);
                    if (z4) {
                        e18Var.a0(1097456843);
                        fei feiVar = s4i.d(e18Var).m;
                        cz5 cz5Var = (cz5) e18Var.j(ve4.h);
                        ieiVar = ieiVar2;
                        qnc qncVarD = gb9.d(MTTypesetterKt.kLineSkipLimitMultiplier, cz5Var.c0(feiVar.a(cz5Var)), MTTypesetterKt.kLineSkipLimitMultiplier, cz5Var.c0(feiVar.c(cz5Var)) + foi.a, 5);
                        z2 = false;
                        e18Var.p(false);
                        qncVar = qncVarD;
                    } else {
                        ieiVar = ieiVar2;
                        e18Var.a0(1097769974);
                        e18Var.p(false);
                        qncVar = new qnc(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
                    }
                    hw9 hw9Var = new hw9(1.0f, true);
                    o5b o5bVarD = dw1.d(lja.G, z2);
                    int iHashCode2 = Long.hashCode(e18Var.T);
                    hyc hycVarL2 = e18Var.l();
                    iqb iqbVarE2 = kxk.E(e18Var, hw9Var);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, o5bVarD);
                    d4c.i0(e18Var, z80Var2, hycVarL2);
                    ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
                    d4c.i0(e18Var, z80Var4, iqbVarE2);
                    un8 un8Var2 = this.F;
                    boolean zC = un8Var2.c();
                    boolean zH = e18Var.h(un8Var2);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        un8Var = un8Var2;
                        objN = new dm(0, un8Var, un8.class, "refresh", "refresh()V", 0, 15);
                        e18Var.k0(objN);
                    } else {
                        un8Var = un8Var2;
                    }
                    FillElement fillElement = b.c;
                    zy7 zy7Var3 = (zy7) ((jm9) objN);
                    boolean z5 = this.H;
                    nwb nwbVar = this.I;
                    of6 of6Var = this.J;
                    boolean z6 = this.K;
                    List list = this.L;
                    Map map = this.M;
                    Set set = this.N;
                    zy7 zy7Var4 = this.V;
                    pz7 pz7Var = this.P;
                    bz7 bz7Var = this.Q;
                    bz7 bz7Var2 = this.R;
                    bz7 bz7Var3 = this.S;
                    bz7 bz7Var4 = this.T;
                    zy7 zy7Var5 = this.W;
                    zy7 zy7Var6 = this.U;
                    qi3 qi3Var = this.X;
                    un8 un8Var3 = un8Var;
                    iuj.c(zC, zy7Var3, fillElement, mxdVarD, null, null, fd9.q0(-1113048720, new do8(un8Var3, z4, z5, nwbVar, of6Var, z6, list, map, set, zy7Var4, pz7Var, bz7Var, bz7Var2, bz7Var3, bz7Var4, zy7Var5, zy7Var6, zy7Var2, qi3Var, qncVar, this.Y), e18Var), e18Var, 1573248, 48);
                    zy7 zy7Var7 = this.O;
                    if (z4) {
                        e18Var.a0(-966226522);
                        xo1 xo1Var = lja.H;
                        nw1 nw1Var = nw1.a;
                        foi.b(nw1Var.a(fqbVar, xo1Var), e18Var, 0);
                        String strG = un8Var3.G();
                        String strD = un8Var3.d();
                        boolean zK = un8Var3.K();
                        boolean zI = un8Var3.i();
                        boolean zH2 = e18Var.h(qi3Var) | e18Var.h(un8Var3) | e18Var.f(zy7Var6);
                        Object objN2 = e18Var.N();
                        Object obj5 = objN2;
                        if (zH2 || objN2 == lz1Var) {
                            ka1 ka1Var = new ka1(qi3Var, un8Var3, zy7Var6, 20);
                            e18Var.k0(ka1Var);
                            obj5 = ka1Var;
                        }
                        foi.a(strG, strD, zK, zI, zy7Var7, (zy7) obj5, nw1Var.a(fqbVar, lja.N), e18Var, 0, 0);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-965214589);
                        e18Var.p(false);
                    }
                    e18Var.p(true);
                    if (z4) {
                        e18Var.a0(1102491305);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(1102109788);
                        foi.d(un8Var3.G(), un8Var3.d(), un8Var3.K(), zy7Var7, null, e18Var, 0);
                        kxk.g(e18Var, fik.n(s4i.d(e18Var).m));
                        e18Var.p(false);
                    }
                    e18Var.p(true);
                }
                break;
            default:
                qnc qncVar2 = (qnc) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    uf6 uf6Var = (uf6) this.Y.getValue();
                    un8 un8Var4 = this.F;
                    boolean z7 = un8Var4.z();
                    List listT = un8Var4.t();
                    List listK = un8Var4.k();
                    List listN = un8Var4.n();
                    boolean z8 = this.G;
                    if (z8 && this.H) {
                        e18Var2.a0(-1685651778);
                        nwb nwbVar2 = this.I;
                        boolean zF = e18Var2.f(nwbVar2);
                        i = 1;
                        Object objN3 = e18Var2.N();
                        Object obj6 = objN3;
                        if (zF || objN3 == lz1Var) {
                            fg1 fg1Var = new fg1(16, nwbVar2);
                            e18Var2.k0(fg1Var);
                            obj6 = fg1Var;
                        }
                        zy7Var = (zy7) obj6;
                        e18Var2.p(false);
                    } else {
                        i = 1;
                        e18Var2.a0(-1685564979);
                        e18Var2.p(false);
                        zy7Var = null;
                    }
                    zy7 zy7Var8 = zy7Var;
                    boolean zH3 = e18Var2.h(un8Var4);
                    Object objN4 = e18Var2.N();
                    if (zH3 || objN4 == lz1Var) {
                        z = z8;
                        wv2 wv2Var = new wv2(2, un8Var4, un8.class, "setDrawerTabPreferences", "setDrawerTabPreferences(Lcom/anthropic/claude/home/DrawerTabPreferences;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4);
                        e18Var2.k0(wv2Var);
                        objN4 = wv2Var;
                    } else {
                        z = z8;
                    }
                    boolean zB = this.J.b();
                    boolean z9 = !z;
                    pz7 pz7Var2 = (pz7) ((jm9) objN4);
                    final qi3 qi3Var2 = this.X;
                    boolean zH4 = e18Var2.h(qi3Var2);
                    Object objN5 = e18Var2.N();
                    Object obj7 = objN5;
                    if (zH4 || objN5 == lz1Var) {
                        final int i3 = i;
                        bz7 bz7Var5 = new bz7() { // from class: zn8
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj8) {
                                int i4 = i3;
                                iei ieiVar3 = iei.a;
                                qi3 qi3Var3 = qi3Var2;
                                switch (i4) {
                                    case 0:
                                        pf6 pf6Var = (pf6) obj8;
                                        pf6Var.getClass();
                                        qi3Var3.e(new DrawerEvents$DrawerTabReordered(pf6Var.F), DrawerEvents$DrawerTabReordered.Companion.serializer());
                                        break;
                                    case 1:
                                        qi3Var3.e(new DrawerEvents$DrawerMoreExpanded(((Integer) obj8).intValue()), DrawerEvents$DrawerMoreExpanded.Companion.serializer());
                                        break;
                                    case 2:
                                        qi3Var3.e(new DrawerEvents$DrawerCustomizeToggled(((Boolean) obj8).booleanValue()), DrawerEvents$DrawerCustomizeToggled.Companion.serializer());
                                        break;
                                    default:
                                        String str = (String) obj8;
                                        str.getClass();
                                        qi3Var3.e(new DrawerEvents$DrawerCustomizeCommitted(str), DrawerEvents$DrawerCustomizeCommitted.Companion.serializer());
                                        break;
                                }
                                return ieiVar3;
                            }
                        };
                        e18Var2.k0(bz7Var5);
                        obj7 = bz7Var5;
                    }
                    bz7 bz7Var6 = (bz7) obj7;
                    boolean zH5 = e18Var2.h(qi3Var2);
                    Object objN6 = e18Var2.N();
                    Object obj8 = objN6;
                    if (zH5 || objN6 == lz1Var) {
                        final int i4 = 2;
                        bz7 bz7Var7 = new bz7() { // from class: zn8
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj82) {
                                int i42 = i4;
                                iei ieiVar3 = iei.a;
                                qi3 qi3Var3 = qi3Var2;
                                switch (i42) {
                                    case 0:
                                        pf6 pf6Var = (pf6) obj82;
                                        pf6Var.getClass();
                                        qi3Var3.e(new DrawerEvents$DrawerTabReordered(pf6Var.F), DrawerEvents$DrawerTabReordered.Companion.serializer());
                                        break;
                                    case 1:
                                        qi3Var3.e(new DrawerEvents$DrawerMoreExpanded(((Integer) obj82).intValue()), DrawerEvents$DrawerMoreExpanded.Companion.serializer());
                                        break;
                                    case 2:
                                        qi3Var3.e(new DrawerEvents$DrawerCustomizeToggled(((Boolean) obj82).booleanValue()), DrawerEvents$DrawerCustomizeToggled.Companion.serializer());
                                        break;
                                    default:
                                        String str = (String) obj82;
                                        str.getClass();
                                        qi3Var3.e(new DrawerEvents$DrawerCustomizeCommitted(str), DrawerEvents$DrawerCustomizeCommitted.Companion.serializer());
                                        break;
                                }
                                return ieiVar3;
                            }
                        };
                        e18Var2.k0(bz7Var7);
                        obj8 = bz7Var7;
                    }
                    bz7 bz7Var8 = (bz7) obj8;
                    boolean zH6 = e18Var2.h(qi3Var2);
                    Object objN7 = e18Var2.N();
                    Object obj9 = objN7;
                    if (zH6 || objN7 == lz1Var) {
                        final int i5 = 3;
                        bz7 bz7Var9 = new bz7() { // from class: zn8
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj82) {
                                int i42 = i5;
                                iei ieiVar3 = iei.a;
                                qi3 qi3Var3 = qi3Var2;
                                switch (i42) {
                                    case 0:
                                        pf6 pf6Var = (pf6) obj82;
                                        pf6Var.getClass();
                                        qi3Var3.e(new DrawerEvents$DrawerTabReordered(pf6Var.F), DrawerEvents$DrawerTabReordered.Companion.serializer());
                                        break;
                                    case 1:
                                        qi3Var3.e(new DrawerEvents$DrawerMoreExpanded(((Integer) obj82).intValue()), DrawerEvents$DrawerMoreExpanded.Companion.serializer());
                                        break;
                                    case 2:
                                        qi3Var3.e(new DrawerEvents$DrawerCustomizeToggled(((Boolean) obj82).booleanValue()), DrawerEvents$DrawerCustomizeToggled.Companion.serializer());
                                        break;
                                    default:
                                        String str = (String) obj82;
                                        str.getClass();
                                        qi3Var3.e(new DrawerEvents$DrawerCustomizeCommitted(str), DrawerEvents$DrawerCustomizeCommitted.Companion.serializer());
                                        break;
                                }
                                return ieiVar3;
                            }
                        };
                        e18Var2.k0(bz7Var9);
                        obj9 = bz7Var9;
                    }
                    bz7 bz7Var10 = (bz7) obj9;
                    boolean zH7 = e18Var2.h(qi3Var2);
                    Object objN8 = e18Var2.N();
                    Object obj10 = objN8;
                    if (zH7 || objN8 == lz1Var) {
                        a21 a21Var = new a21(11, qi3Var2);
                        e18Var2.k0(a21Var);
                        obj10 = a21Var;
                    }
                    pz7 pz7Var3 = (pz7) obj10;
                    boolean zH8 = e18Var2.h(qi3Var2);
                    Object objN9 = e18Var2.N();
                    Object obj11 = objN9;
                    if (zH8 || objN9 == lz1Var) {
                        final boolean z10 = z3 ? 1 : 0;
                        bz7 bz7Var11 = new bz7() { // from class: zn8
                            @Override // defpackage.bz7
                            public final Object invoke(Object obj82) {
                                int i42 = z10;
                                iei ieiVar3 = iei.a;
                                qi3 qi3Var3 = qi3Var2;
                                switch (i42) {
                                    case 0:
                                        pf6 pf6Var = (pf6) obj82;
                                        pf6Var.getClass();
                                        qi3Var3.e(new DrawerEvents$DrawerTabReordered(pf6Var.F), DrawerEvents$DrawerTabReordered.Companion.serializer());
                                        break;
                                    case 1:
                                        qi3Var3.e(new DrawerEvents$DrawerMoreExpanded(((Integer) obj82).intValue()), DrawerEvents$DrawerMoreExpanded.Companion.serializer());
                                        break;
                                    case 2:
                                        qi3Var3.e(new DrawerEvents$DrawerCustomizeToggled(((Boolean) obj82).booleanValue()), DrawerEvents$DrawerCustomizeToggled.Companion.serializer());
                                        break;
                                    default:
                                        String str = (String) obj82;
                                        str.getClass();
                                        qi3Var3.e(new DrawerEvents$DrawerCustomizeCommitted(str), DrawerEvents$DrawerCustomizeCommitted.Companion.serializer());
                                        break;
                                }
                                return ieiVar3;
                            }
                        };
                        e18Var2.k0(bz7Var11);
                        obj11 = bz7Var11;
                    }
                    ho8.a(this.K, this.L, this.M, uf6Var, z7, listT, listK, listN, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, zy7Var8, pz7Var2, z9, null, zB, null, null, bz7Var6, bz7Var8, bz7Var10, pz7Var3, (bz7) obj11, qncVar2, e18Var2, 0, 0, 0, 27262976);
                }
                break;
        }
        return ieiVar2;
    }

    public /* synthetic */ do8(boolean z, un8 un8Var, zy7 zy7Var, qi3 qi3Var, zy7 zy7Var2, boolean z2, nwb nwbVar, of6 of6Var, boolean z3, List list, Map map, Set set, zy7 zy7Var3, pz7 pz7Var, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, bz7 bz7Var4, zy7 zy7Var4, zy7 zy7Var5, nwb nwbVar2) {
        this.G = z;
        this.F = un8Var;
        this.O = zy7Var;
        this.X = qi3Var;
        this.U = zy7Var2;
        this.H = z2;
        this.I = nwbVar;
        this.J = of6Var;
        this.K = z3;
        this.L = list;
        this.M = map;
        this.N = set;
        this.V = zy7Var3;
        this.P = pz7Var;
        this.Q = bz7Var;
        this.R = bz7Var2;
        this.S = bz7Var3;
        this.T = bz7Var4;
        this.W = zy7Var4;
        this.Z = zy7Var5;
        this.Y = nwbVar2;
    }
}
