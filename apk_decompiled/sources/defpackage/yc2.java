package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.ModelInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yc2 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    public /* synthetic */ yc2(ed2 ed2Var, vc2 vc2Var, dui duiVar, eui euiVar, xd2 xd2Var, ed2 ed2Var2, uub uubVar, rz7 rz7Var) {
        this.E = 0;
        this.F = ed2Var;
        this.H = vc2Var;
        this.I = duiVar;
        this.J = euiVar;
        this.K = xd2Var;
        this.G = ed2Var2;
        this.L = uubVar;
        this.M = rz7Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        nwb nwbVar;
        boolean z2;
        jxa jxaVar;
        ctc ctcVar;
        nwb nwbVar2;
        float f;
        iqb iqbVarL;
        boolean z3;
        boolean z4;
        int i = this.E;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj4 = this.M;
        Object obj5 = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        Object obj8 = this.I;
        Object obj9 = this.H;
        Object obj10 = this.G;
        Object obj11 = this.F;
        switch (i) {
            case 0:
                boolean z5 = true;
                ed2 ed2Var = (ed2) obj11;
                vc2 vc2Var = (vc2) obj9;
                dui duiVar = (dui) obj8;
                eui euiVar = (eui) obj7;
                xd2 xd2Var = (xd2) obj6;
                ed2 ed2Var2 = (ed2) obj10;
                uub uubVar = (uub) obj5;
                rz7 rz7Var = (rz7) obj4;
                mw1 mw1Var = (mw1) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mw1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(mw1Var) ? 4 : 2;
                }
                if ((iIntValue & 19) == 18) {
                    z5 = false;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, z5)) {
                    e18Var.T();
                } else if (ed2Var != null) {
                    e18Var.a0(898311020);
                    dd2.c(vc2Var, ed2Var, duiVar, euiVar, xd2Var, ed2Var2, uubVar, e18Var, 0);
                    e18Var.p(false);
                } else {
                    e18Var.a0(898510970);
                    rz7Var.invoke(mw1Var, e18Var, Integer.valueOf(iIntValue & 14));
                    e18Var.p(false);
                }
                return ieiVar;
            case 1:
                u9a u9aVar = (u9a) obj11;
                htf htfVar = (htf) obj10;
                pz7 pz7Var = (pz7) obj9;
                vsf vsfVar = (vsf) obj8;
                oz3 oz3Var = (oz3) obj7;
                sz7 sz7Var = (sz7) obj6;
                zy7 zy7Var = (zy7) obj5;
                c cVar = (c) obj4;
                qw1 qw1Var = (qw1) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xo1 xo1Var = lja.H;
                qw1Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(qw1Var) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    xo1 xo1Var2 = lja.K;
                    iqb iqbVarG = b.g(mpk.b0(b.c(fqbVar, 1.0f), mpk.Y(e18Var2), true), qw1Var.b(), MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    o5b o5bVarD = dw1.d(xo1Var2, false);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarG);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var2, z80Var, o5bVarD);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var2, z80Var2, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var2, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var2, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var2, z80Var4, iqbVarE);
                    if (x44.r(u9aVar, r9a.a)) {
                        e18Var2.a0(177123778);
                        flk.c(null, false, d4c.j0(R.string.error_something_went_wrong, e18Var2), gm3.a(e18Var2).y, e18Var2, 48, 1);
                        e18Var2.p(false);
                    } else if (x44.r(u9aVar, t9a.a)) {
                        e18Var2.a0(177473396);
                        flk.c(null, true, null, gm3.a(e18Var2).M, e18Var2, 432, 1);
                        e18Var2.p(false);
                    } else {
                        if (!x44.r(u9aVar, s9a.a)) {
                            throw ebh.u(e18Var2, 1945379041, false);
                        }
                        e18Var2.a0(1945401792);
                        boolean z6 = htfVar.b;
                        gtf gtfVar = htfVar.a;
                        boolean z7 = htfVar.c;
                        if (z6) {
                            e18Var2.a0(178108772);
                            flk.c(null, true, null, gm3.a(e18Var2).M, e18Var2, 432, 1);
                            z = false;
                            e18Var2.p(false);
                        } else {
                            nw1 nw1Var = nw1.a;
                            if (pz7Var != null) {
                                e18Var2.a0(179116830);
                                vo1 vo1Var = lja.T;
                                iqb iqbVarG2 = b.g(b.c(nw1Var.a(fqbVar, xo1Var), 1.0f), qw1Var.b(), MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                                q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var2, 48);
                                int iHashCode2 = Long.hashCode(e18Var2.T);
                                hyc hycVarL2 = e18Var2.l();
                                iqb iqbVarE2 = kxk.E(e18Var2, iqbVarG2);
                                e18Var2.e0();
                                if (e18Var2.S) {
                                    e18Var2.k(re4Var);
                                } else {
                                    e18Var2.n0();
                                }
                                d4c.i0(e18Var2, z80Var, q64VarA);
                                d4c.i0(e18Var2, z80Var2, hycVarL2);
                                ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
                                d4c.i0(e18Var2, z80Var4, iqbVarE2);
                                pz7Var.invoke(e18Var2, 0);
                                e.h(vsfVar, oz3Var, false, null, null, e18Var2, 384, 24);
                                iqb iqbVarC = b.c(new hw9(1.0f, true), 1.0f);
                                o5b o5bVarD2 = dw1.d(xo1Var2, false);
                                int iHashCode3 = Long.hashCode(e18Var2.T);
                                hyc hycVarL3 = e18Var2.l();
                                iqb iqbVarE3 = kxk.E(e18Var2, iqbVarC);
                                e18Var2.e0();
                                if (e18Var2.S) {
                                    e18Var2.k(re4Var);
                                } else {
                                    e18Var2.n0();
                                }
                                d4c.i0(e18Var2, z80Var, o5bVarD2);
                                d4c.i0(e18Var2, z80Var2, hycVarL3);
                                ij0.t(iHashCode3, e18Var2, z80Var3, e18Var2, bxVar);
                                d4c.i0(e18Var2, z80Var4, iqbVarE3);
                                sz7Var.i(zy7Var, fqbVar, e18Var2, 48);
                                e18Var2.p(true);
                                if (z7 || gtfVar != null) {
                                    e18Var2.a0(1941425703);
                                    boolean z8 = htfVar.c;
                                    boolean zF = e18Var2.f(cVar);
                                    Object objN = e18Var2.N();
                                    if (zF || objN == lz1Var) {
                                        objN = new ls0(0, cVar, c.class, "loadMoreSessions", "loadMoreSessions(Z)V", 0, 1);
                                        e18Var2.k0(objN);
                                    }
                                    e.d(0, 4, e18Var2, (zy7) objN, null, z8);
                                    z = false;
                                    e18Var2.p(false);
                                } else {
                                    e18Var2.a0(1942014796);
                                    z = false;
                                    e18Var2.p(false);
                                }
                                e18Var2.p(true);
                                e18Var2.p(z);
                            } else {
                                e18Var2.a0(181237509);
                                e.h(vsfVar, oz3Var, false, nw1Var.a(fqbVar, xo1Var), null, e18Var2, 384, 16);
                                sz7Var.i(zy7Var, nw1Var.a(fqbVar, xo1Var2), e18Var2, 0);
                                if (z7 || gtfVar != null) {
                                    e18Var2.a0(181823502);
                                    boolean z9 = htfVar.c;
                                    boolean zF2 = e18Var2.f(cVar);
                                    Object objN2 = e18Var2.N();
                                    if (zF2 || objN2 == lz1Var) {
                                        objN2 = new ls0(0, cVar, c.class, "loadMoreSessions", "loadMoreSessions(Z)V", 0, 2);
                                        e18Var2.k0(objN2);
                                    }
                                    e.d(0, 0, e18Var2, (zy7) objN2, nw1Var.a(fqbVar, lja.N), z9);
                                    z = false;
                                    e18Var2.p(false);
                                } else {
                                    e18Var2.a0(182430854);
                                    z = false;
                                    e18Var2.p(false);
                                }
                                e18Var2.p(z);
                            }
                        }
                        e18Var2.p(z);
                    }
                    e18Var2.p(true);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                kk4 kk4Var = (kk4) obj11;
                ybg ybgVar = (ybg) obj10;
                wlg wlgVar = (wlg) obj9;
                bz7 bz7Var = (bz7) obj8;
                hi4 hi4Var = (hi4) obj7;
                Context context = (Context) obj6;
                pl3 pl3Var = (pl3) obj5;
                nwb nwbVar3 = (nwb) obj4;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(mncVar) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    zni.g(kk4Var.h, ybgVar, e18Var3, 48);
                    List listF = kk4Var.c.f();
                    qnc qncVar = qf2.a;
                    qnc qncVarQ0 = xn5.q0(mncVar, gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1));
                    FillElement fillElement = b.c;
                    ta4 ta4Var = sik.b;
                    boolean zH = e18Var3.h(kk4Var) | e18Var3.f(wlgVar) | e18Var3.h(listF) | e18Var3.f(bz7Var) | e18Var3.h(hi4Var) | e18Var3.h(context) | e18Var3.h(pl3Var) | e18Var3.f(nwbVar3);
                    Object objN3 = e18Var3.N();
                    if (zH || objN3 == lz1Var) {
                        objN3 = new ee3(kk4Var, listF, pl3Var, wlgVar, bz7Var, hi4Var, context, nwbVar3);
                        e18Var3.k0(objN3);
                    }
                    lvj.b(fillElement, null, null, qncVarQ0, ta4Var, null, (bz7) objN3, e18Var3, 24582, 38);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 3:
                p05 p05Var = (p05) obj11;
                f fVar = (f) obj10;
                zy7 zy7Var2 = (zy7) obj9;
                zy7 zy7Var3 = (zy7) obj8;
                wlg wlgVar2 = (wlg) obj7;
                nwb nwbVar4 = (nwb) obj6;
                wlg wlgVar3 = (wlg) obj5;
                nwb nwbVar5 = (nwb) obj4;
                mnc mncVar2 = (mnc) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                mncVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(mncVar2) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
                    iqb iqbVarN = gb9.N(gb9.L(mpk.b0(yfd.p(gb9.I(fqbVar, mncVar2).B(b.c), gm3.a(e18Var4).o, zni.b), mpk.Y(e18Var4), true), 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 24.0f, 7);
                    q64 q64VarA2 = p64.a(ho0Var, lja.S, e18Var4, 0);
                    int iHashCode4 = Long.hashCode(e18Var4.T);
                    hyc hycVarL4 = e18Var4.l();
                    iqb iqbVarE4 = kxk.E(e18Var4, iqbVarN);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var2);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, q64VarA2);
                    d4c.i0(e18Var4, cd4.e, hycVarL4);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode4));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE4);
                    tjh.b(d4c.j0(R.string.conway_system_subtitle, e18Var4), gb9.K(fqbVar, 4.0f, 4.0f), gm3.a(e18Var4).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).g, e18Var4, 48, 0, 131064);
                    gsk.b(p05Var, null, e18Var4, 0);
                    List list = (List) wlgVar2.getValue();
                    boolean zF3 = e18Var4.f(fVar);
                    Object objN4 = e18Var4.N();
                    if (zF3 || objN4 == lz1Var) {
                        objN4 = new y14(0, fVar, f.class, "refreshClients", "refreshClients()V", 0, 24);
                        e18Var4.k0(objN4);
                    }
                    zy7 zy7Var4 = (zy7) ((jm9) objN4);
                    boolean zF4 = e18Var4.f(fVar) | e18Var4.f(zy7Var2);
                    Object objN5 = e18Var4.N();
                    if (zF4 || objN5 == lz1Var) {
                        objN5 = new d44(fVar, 14, zy7Var2);
                        e18Var4.k0(objN5);
                    }
                    ask.a(list, zy7Var4, (zy7) objN5, null, e18Var4, 0, 8);
                    fz4 fz4VarQ = p05Var.Q();
                    boolean zF5 = e18Var4.f(p05Var);
                    Object objN6 = e18Var4.N();
                    if (zF5 || objN6 == lz1Var) {
                        bo boVar = new bo(2, p05Var, p05.class, "setSchedulePaused", "setSchedulePaused(Ljava/lang/String;Z)V", 0, 17);
                        e18Var4.k0(boVar);
                        objN6 = boVar;
                    }
                    pz7 pz7Var2 = (pz7) ((jm9) objN6);
                    boolean zF6 = e18Var4.f(p05Var);
                    Object objN7 = e18Var4.N();
                    if (zF6 || objN7 == lz1Var) {
                        ty4 ty4Var = new ty4(1, p05Var, p05.class, "deleteSchedule", "deleteSchedule(Ljava/lang/String;)V", 0, 3);
                        e18Var4.k0(ty4Var);
                        objN7 = ty4Var;
                    }
                    ssk.b(fz4VarQ, pz7Var2, (bz7) ((jm9) objN7), null, e18Var4, 0);
                    String str = (String) p05Var.p.getValue();
                    if (str == null) {
                        e18Var4.a0(373413630);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(373413631);
                        boolean zF7 = e18Var4.f(p05Var);
                        Object objN8 = e18Var4.N();
                        if (zF7 || objN8 == lz1Var) {
                            objN8 = new sv4(p05Var, 5);
                            e18Var4.k0(objN8);
                        }
                        ppk.a((zy7) objN8, fd9.q0(-1714680121, new qv4(p05Var, 4), e18Var4), null, null, null, wjk.d, fd9.q0(-2077894132, new rq(str, 23), e18Var4), null, 0L, 0L, 0L, 0L, null, e18Var4, 1769520, 0, 16284);
                        e18Var4.p(false);
                    }
                    fz4 fz4Var = (fz4) p05Var.n.getValue();
                    boolean zF8 = e18Var4.f(p05Var);
                    Object objN9 = e18Var4.N();
                    if (zF8 || objN9 == lz1Var) {
                        bo boVar2 = new bo(2, p05Var, p05.class, "toggleWebhook", "toggleWebhook(Ljava/lang/String;Z)V", 0, 18);
                        e18Var4.k0(boVar2);
                        objN9 = boVar2;
                    }
                    pz7 pz7Var3 = (pz7) ((jm9) objN9);
                    boolean zF9 = e18Var4.f(p05Var);
                    Object objN10 = e18Var4.N();
                    if (zF9 || objN10 == lz1Var) {
                        ty4 ty4Var2 = new ty4(1, p05Var, p05.class, "deleteWebhook", "deleteWebhook(Ljava/lang/String;)V", 0, 4);
                        e18Var4.k0(ty4Var2);
                        objN10 = ty4Var2;
                    }
                    bz7 bz7Var2 = (bz7) ((jm9) objN10);
                    boolean zF10 = e18Var4.f(p05Var);
                    Object objN11 = e18Var4.N();
                    if (zF10 || objN11 == lz1Var) {
                        s05 s05Var = new s05(4, 0, p05.class, p05Var, "verifyWebhook", "verifyWebhook-BWLJW6A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
                        p05Var = p05Var;
                        e18Var4.k0(s05Var);
                        objN11 = s05Var;
                    }
                    ktk.d(fz4Var, pz7Var3, bz7Var2, (sz7) ((jm9) objN11), null, e18Var4, 0, 16);
                    String str2 = (String) p05Var.m.getValue();
                    if (str2 == null) {
                        e18Var4.a0(374191265);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(374191266);
                        boolean zF11 = e18Var4.f(p05Var);
                        Object objN12 = e18Var4.N();
                        if (zF11 || objN12 == lz1Var) {
                            objN12 = new sv4(p05Var, 2);
                            e18Var4.k0(objN12);
                        }
                        ppk.a((zy7) objN12, fd9.q0(-761283394, new qv4(p05Var, 3), e18Var4), null, null, null, wjk.f, fd9.q0(-1917596989, new rq(str2, 21), e18Var4), null, 0L, 0L, 0L, 0L, null, e18Var4, 1769520, 0, 16284);
                        e18Var4.p(false);
                    }
                    fz4 fz4Var2 = (fz4) fVar.U.getValue();
                    boolean zF12 = e18Var4.f(fVar);
                    Object objN13 = e18Var4.N();
                    if (zF12 || objN13 == lz1Var) {
                        objN13 = new py4(fVar, nwbVar4, 2);
                        e18Var4.k0(objN13);
                    }
                    psk.d(fz4Var2, (zy7) objN13, null, e18Var4, 0);
                    String str3 = (String) fVar.V.getValue();
                    if (str3 == null) {
                        e18Var4.a0(374976991);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(374976992);
                        boolean zF13 = e18Var4.f(fVar);
                        Object objN14 = e18Var4.N();
                        if (zF13 || objN14 == lz1Var) {
                            objN14 = new jx4(fVar, 5);
                            e18Var4.k0(objN14);
                        }
                        ppk.a((zy7) objN14, fd9.q0(1669467071, new mx4(fVar, 2), e18Var4), null, null, null, wjk.h, fd9.q0(513153476, new rq(str3, 22), e18Var4), null, 0L, 0L, 0L, 0L, null, e18Var4, 1769520, 0, 16284);
                        e18Var4.p(false);
                    }
                    ls4 ls4Var = (ls4) wlgVar3.getValue();
                    hsf hsfVar = (hsf) nwbVar5.getValue();
                    ysk.a(ls4Var, hsfVar != null ? hsfVar.a : null, zy7Var3, null, e18Var4, 0, 8);
                    boolean zC = fVar.d.c();
                    boolean zF14 = e18Var4.f(fVar);
                    Object objN15 = e18Var4.N();
                    if (zF14 || objN15 == lz1Var) {
                        objN15 = new ty4(1, fVar, f.class, "setShowToolCalls", "setShowToolCalls(Z)V", 0, 2);
                        e18Var4.k0(objN15);
                    }
                    csk.a(zC, (bz7) ((jm9) objN15), null, e18Var4, 0);
                    e18Var4.p(true);
                    ModelInfo modelInfo = (ModelInfo) nwbVar4.getValue();
                    if (modelInfo == null) {
                        e18Var4.a0(-2018533814);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(-2018533813);
                        boolean zF15 = e18Var4.f(fVar);
                        Object objN16 = e18Var4.N();
                        if (zF15 || objN16 == lz1Var) {
                            objN16 = new ty4(1, fVar, f.class, "selectModel", "selectModel-YWwWmQU(Ljava/lang/String;)V", 0, 5);
                            e18Var4.k0(objN16);
                        }
                        bz7 bz7Var3 = (bz7) ((jm9) objN16);
                        Object objN17 = e18Var4.N();
                        if (objN17 == lz1Var) {
                            objN17 = new sy4(4, nwbVar4);
                            e18Var4.k0(objN17);
                        }
                        psk.b(modelInfo, bz7Var3, (zy7) objN17, e18Var4, ModelInfo.$stable | 384);
                        e18Var4.p(false);
                    }
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 4:
                gya gyaVar = (gya) obj11;
                ctc ctcVar2 = (ctc) obj10;
                String str4 = (String) obj9;
                zy7 zy7Var5 = (zy7) obj8;
                m83 m83Var = (m83) obj7;
                g93 g93Var = (g93) obj6;
                nwb nwbVar6 = (nwb) obj5;
                nwb nwbVar7 = (nwb) obj4;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e18Var5.T();
                    return ieiVar;
                }
                q64 q64VarA3 = p64.a(ko0.c, lja.S, e18Var5, 0);
                int iHashCode5 = Long.hashCode(e18Var5.T);
                hyc hycVarL5 = e18Var5.l();
                iqb iqbVarE5 = kxk.E(e18Var5, fqbVar);
                dd4.e.getClass();
                re4 re4Var3 = cd4.b;
                e18Var5.e0();
                if (e18Var5.S) {
                    e18Var5.k(re4Var3);
                } else {
                    e18Var5.n0();
                }
                z80 z80Var5 = cd4.f;
                d4c.i0(e18Var5, z80Var5, q64VarA3);
                z80 z80Var6 = cd4.e;
                d4c.i0(e18Var5, z80Var6, hycVarL5);
                Integer numValueOf2 = Integer.valueOf(iHashCode5);
                z80 z80Var7 = cd4.g;
                d4c.i0(e18Var5, z80Var7, numValueOf2);
                bx bxVar2 = cd4.h;
                d4c.h0(e18Var5, bxVar2);
                z80 z80Var8 = cd4.d;
                d4c.i0(e18Var5, z80Var8, iqbVarE5);
                if (gyaVar.a) {
                    e18Var5.a0(-499965947);
                    cok.g(ctcVar2.f, ctcVar2.e, str4, gyaVar.b, null, gyaVar.d, zy7Var5, e18Var5, 0, 16);
                    e18Var5 = e18Var5;
                    z2 = false;
                    e18Var5.p(false);
                    nwbVar = nwbVar7;
                } else {
                    nwbVar = nwbVar7;
                    z2 = false;
                    e18Var5.a0(-499580586);
                    e18Var5.p(false);
                }
                jxa jxaVar2 = gyaVar.f;
                if (jxaVar2 instanceof hxa) {
                    e18Var5.a0(-1263038928);
                    e18Var5.p(z2);
                } else if (jxaVar2 instanceof gxa) {
                    sq6.A(8.0f, -499444682, e18Var5, e18Var5, fqbVar);
                    iqb iqbVar = e93.a;
                    dw1.a(b.e(b.c(gb9.L(fqbVar, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 1.0f), 300.0f), e18Var5, 0);
                    e18Var5.p(false);
                } else {
                    if (!(jxaVar2 instanceof fxa)) {
                        if (!(jxaVar2 instanceof ixa)) {
                            throw ebh.u(e18Var5, -1263038345, false);
                        }
                        sq6.A(8.0f, -498626251, e18Var5, e18Var5, fqbVar);
                        ixa ixaVar = (ixa) jxaVar2;
                        boolean z10 = ixaVar.b;
                        if (z10) {
                            iqb iqbVar2 = e93.a;
                            jxaVar = jxaVar2;
                            ctcVar = ctcVar2;
                            nwbVar2 = nwbVar6;
                            f = MTTypesetterKt.kLineSkipLimitMultiplier;
                            iqbVarL = gb9.L(fqbVar, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                        } else {
                            jxaVar = jxaVar2;
                            ctcVar = ctcVar2;
                            nwbVar2 = nwbVar6;
                            f = MTTypesetterKt.kLineSkipLimitMultiplier;
                            iqbVarL = fqbVar;
                        }
                        if (z10) {
                            e18Var5.a0(-498298860);
                            pzg.a(iqbVarL, xve.b(12.0f), gm3.a(e18Var5).n, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f, sf5.a(f, gm3.a(e18Var5).u), fd9.q0(1606768055, new ne(ctcVar, jxaVar, g93Var, m83Var, nwbVar2, nwbVar, 15), e18Var5), e18Var5, 12779520, 24);
                            z4 = false;
                            e18Var5.p(false);
                            z3 = true;
                        } else {
                            nwb nwbVar8 = nwbVar2;
                            nwb nwbVar9 = nwbVar;
                            e18Var5.a0(-497452467);
                            o5b o5bVarD3 = dw1.d(lja.G, false);
                            int iHashCode6 = Long.hashCode(e18Var5.T);
                            hyc hycVarL6 = e18Var5.l();
                            iqb iqbVarE6 = kxk.E(e18Var5, iqbVarL);
                            e18Var5.e0();
                            if (e18Var5.S) {
                                e18Var5.k(re4Var3);
                            } else {
                                e18Var5.n0();
                            }
                            d4c.i0(e18Var5, z80Var5, o5bVarD3);
                            d4c.i0(e18Var5, z80Var6, hycVarL6);
                            ij0.t(iHashCode6, e18Var5, z80Var7, e18Var5, bxVar2);
                            d4c.i0(e18Var5, z80Var8, iqbVarE6);
                            String str5 = ixaVar.a;
                            Object objN18 = e18Var5.N();
                            if (objN18 == lz1Var) {
                                objN18 = new ol5(16, nwbVar8);
                                e18Var5.k0(objN18);
                            }
                            bz7 bz7Var4 = (bz7) objN18;
                            Object objN19 = e18Var5.N();
                            if (objN19 == lz1Var) {
                                objN19 = new ol5(17, nwbVar9);
                                e18Var5.k0(objN19);
                            }
                            mok.d(ctcVar, str5, g93Var, m83Var, bz7Var4, (bz7) objN19, null, e18Var5, 221184, 64);
                            z3 = true;
                            e18Var5.p(true);
                            z4 = false;
                            e18Var5.p(false);
                        }
                        e18Var5.p(z4);
                        e18Var5.p(z3);
                        return ieiVar;
                    }
                    sq6.A(8.0f, -499056965, e18Var5, e18Var5, fqbVar);
                    rxa rxaVar = ((fxa) jxaVar2).a;
                    boolean zF16 = e18Var5.f(m83Var) | e18Var5.f(ctcVar2);
                    Object objN20 = e18Var5.N();
                    if (zF16 || objN20 == lz1Var) {
                        objN20 = new ft9(m83Var, 10, ctcVar2);
                        e18Var5.k0(objN20);
                    }
                    iqb iqbVar3 = e93.a;
                    unk.e(rxaVar, (zy7) objN20, gb9.L(fqbVar, 20.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), e18Var5, 0);
                    e18Var5.p(false);
                }
                z3 = true;
                e18Var5.p(z3);
                return ieiVar;
            default:
                z4b z4bVar = (z4b) obj11;
                ArrayList arrayList = (ArrayList) obj10;
                zy7 zy7Var6 = (zy7) obj9;
                nwb nwbVar10 = (nwb) obj8;
                mnc mncVar3 = (mnc) obj7;
                iqb iqbVar4 = (iqb) obj6;
                oxf oxfVar = (oxf) obj5;
                ta4 ta4Var2 = (ta4) obj4;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    boolean z11 = !arrayList.isEmpty();
                    if (zy7Var6 == null) {
                        e18Var6.a0(1318690834);
                        boolean zF17 = e18Var6.f(nwbVar10);
                        Object objN21 = e18Var6.N();
                        if (zF17 || objN21 == lz1Var) {
                            objN21 = new d29(15, nwbVar10);
                            e18Var6.k0(objN21);
                        }
                        zy7Var6 = (zy7) objN21;
                    } else {
                        e18Var6.a0(-2035672095);
                    }
                    e18Var6.p(false);
                    dpk.d(z4bVar, z11, zy7Var6, mncVar3, ybi.p(b.c(iqbVar4, 1.0f), oxfVar), e18Var6, 0);
                    ta4Var2.invoke(e18Var6, 0);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ yc2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
        this.K = obj6;
        this.L = obj7;
        this.M = obj8;
    }
}
