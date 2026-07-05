package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.memory.MemorySynthesisResponse;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.project.details.g;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fw implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ qz7 I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ fw(uv uvVar, q2i q2iVar, bz7 bz7Var, mnc mncVar, zy7 zy7Var, zy7 zy7Var2, x0a x0aVar) {
        this.E = 1;
        this.F = uvVar;
        this.G = q2iVar;
        this.H = bz7Var;
        this.L = mncVar;
        this.I = zy7Var;
        this.J = zy7Var2;
        this.K = x0aVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zy7 zy7Var;
        int i = this.E;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj4 = this.J;
        Object obj5 = this.K;
        Object obj6 = this.H;
        Object obj7 = this.L;
        qz7 qz7Var = this.I;
        Object obj8 = this.G;
        Object obj9 = this.F;
        switch (i) {
            case 0:
                uv uvVar = (uv) obj9;
                mxd mxdVar = (mxd) obj7;
                q2i q2iVar = (q2i) obj8;
                bz7 bz7Var = (bz7) obj6;
                zy7 zy7Var2 = (zy7) qz7Var;
                zy7 zy7Var3 = (zy7) obj4;
                x0a x0aVar = (x0a) obj5;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(mncVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    boolean zM = uvVar.c.m(uvVar.R());
                    boolean zH = e18Var.h(uvVar);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new ov(uvVar, 11);
                        e18Var.k0(objN);
                    }
                    iuj.c(zM, (zy7) objN, null, mxdVar, fd9.q0(-493093242, new ye(uvVar, mncVar, mxdVar, 5), e18Var), null, fd9.q0(403137928, new fw(uvVar, q2iVar, bz7Var, mncVar, zy7Var2, zy7Var3, x0aVar), e18Var), e18Var, 1597440, 36);
                }
                break;
            case 1:
                uv uvVar2 = (uv) obj9;
                q2i q2iVar2 = (q2i) obj8;
                bz7 bz7Var2 = (bz7) obj6;
                mnc mncVar2 = (mnc) obj7;
                zy7 zy7Var4 = (zy7) qz7Var;
                zy7 zy7Var5 = (zy7) obj4;
                x0a x0aVar2 = (x0a) obj5;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    List list = (List) uvVar2.r.getValue();
                    boolean zH2 = e18Var2.h(uvVar2);
                    Object objN2 = e18Var2.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new yb(1, uvVar2, uv.class, "updateProjectStarred", "updateProjectStarred(Lcom/anthropic/claude/api/project/Project;)V", 0, 11);
                        e18Var2.k0(objN2);
                    }
                    jm9 jm9Var = (jm9) objN2;
                    boolean zH3 = e18Var2.h(uvVar2);
                    Object objN3 = e18Var2.N();
                    if (zH3 || objN3 == lz1Var) {
                        objN3 = new bo(2, uvVar2, uv.class, "setProjectArchived", "setProjectArchived(Lcom/anthropic/claude/api/project/Project;Z)V", 0, 1);
                        e18Var2.k0(objN3);
                    }
                    jm9 jm9Var2 = (jm9) objN3;
                    Date date = (Date) uvVar2.t.getValue();
                    boolean zBooleanValue = ((Boolean) uvVar2.s.getValue()).booleanValue();
                    boolean z = uvVar2.R() == gnd.I;
                    boolean zBooleanValue2 = ((Boolean) uvVar2.n.getValue()).booleanValue();
                    String string = uvVar2.q.d().G.toString();
                    yih yihVar = uvVar2.q;
                    boolean zBooleanValue3 = ((Boolean) uvVar2.u.getValue()).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) uvVar2.h.getValue()).booleanValue();
                    boolean zBooleanValue5 = ((Boolean) uvVar2.i.getValue()).booleanValue();
                    f77 f77Var = ((g77) q2iVar2).e;
                    FillElement fillElement = b.c;
                    bz7 bz7Var3 = (bz7) jm9Var;
                    boolean zH4 = e18Var2.h(uvVar2) | e18Var2.f(zy7Var4) | e18Var2.f(zy7Var5);
                    Object objN4 = e18Var2.N();
                    if (zH4 || objN4 == lz1Var) {
                        objN4 = new ew(uvVar2, zy7Var4, zy7Var5, 0);
                        e18Var2.k0(objN4);
                    }
                    zy7 zy7Var6 = (zy7) objN4;
                    boolean zH5 = e18Var2.h(uvVar2);
                    Object objN5 = e18Var2.N();
                    if (zH5 || objN5 == lz1Var) {
                        objN5 = new ov(uvVar2, 10);
                        e18Var2.k0(objN5);
                    }
                    fpk.a(list, bz7Var2, bz7Var3, mncVar2, zBooleanValue, z, zBooleanValue2, string, yihVar, zBooleanValue3, zy7Var6, (zy7) objN5, zBooleanValue4, zBooleanValue5, (pz7) jm9Var2, fillElement, x0aVar2, f77Var, date, e18Var2, 0);
                }
                break;
            case 2:
                zy7 zy7Var7 = (zy7) qz7Var;
                final ux0 ux0Var = (ux0) obj9;
                zy7 zy7Var8 = (zy7) obj4;
                zy7 zy7Var9 = (zy7) obj7;
                zy7 zy7Var10 = (zy7) obj8;
                zy7 zy7Var11 = (zy7) obj6;
                zy7 zy7Var12 = (zy7) obj5;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var3, 48);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    fqb fqbVar2 = fqb.E;
                    iqb iqbVarE = kxk.E(e18Var3, fqbVar2);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, cxeVarA);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    iqb iqbVar = e93.a;
                    kxk.g(e18Var3, b.t(fqbVar2, 20.0f - ((za6.d(vz8.K()) - 20.0f) / 2.0f)));
                    ouk.b(a.a(ud0.Y, e18Var3), d4c.j0(R.string.chat_message_bottom_sheet_menu_copy, e18Var3), zy7Var7, null, e18Var3, 8, 8);
                    if (ux0Var.f) {
                        e18Var3.a0(-111221641);
                        ouk.b(a.a(ud0.o1, e18Var3), d4c.j0(R.string.generic_share, e18Var3), zy7Var8, null, e18Var3, 8, 8);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-110963132);
                        e18Var3.p(false);
                    }
                    if (ux0Var.g) {
                        e18Var3.a0(-110893630);
                        boolean z2 = ux0Var.h && !ux0Var.i;
                        ouk.b(u00.D(z2 ? R.drawable.anthropicon_pause : R.drawable.anthropicon_play, 0, e18Var3), d4c.j0(z2 ? R.string.chat_message_bottom_sheet_menu_narrate_pause : R.string.chat_message_bottom_sheet_menu_narrate, e18Var3), zy7Var9, null, e18Var3, 8, 8);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-110215164);
                        e18Var3.p(false);
                    }
                    if (ux0Var.b) {
                        e18Var3.a0(-110132952);
                        final int i2 = 0;
                        bpc bpcVarD = u00.D(ux0Var.c ? R.drawable.anthropicon_thumbs_up_filled : R.drawable.anthropicon_thumbs_up, 0, e18Var3);
                        String strJ0 = d4c.j0(R.string.chat_message_bottom_sheet_menu_feedback_positive_label, e18Var3);
                        boolean zF = e18Var3.f(ux0Var);
                        Object objN6 = e18Var3.N();
                        if (zF || objN6 == lz1Var) {
                            objN6 = new bz7() { // from class: tx0
                                @Override // defpackage.bz7
                                public final Object invoke(Object obj10) {
                                    int i3 = i2;
                                    iei ieiVar2 = iei.a;
                                    ux0 ux0Var2 = ux0Var;
                                    ekf ekfVar = (ekf) obj10;
                                    switch (i3) {
                                        case 0:
                                            ekfVar.getClass();
                                            ckf.t(ekfVar, ux0Var2.c);
                                            break;
                                        default:
                                            ekfVar.getClass();
                                            ckf.t(ekfVar, ux0Var2.d);
                                            break;
                                    }
                                    return ieiVar2;
                                }
                            };
                            e18Var3.k0(objN6);
                        }
                        ouk.b(bpcVarD, strJ0, zy7Var10, tjf.b(fqbVar2, false, (bz7) objN6), e18Var3, 8, 0);
                        bpc bpcVarD2 = u00.D(ux0Var.d ? R.drawable.anthropicon_thumbs_down_filled : R.drawable.anthropicon_thumbs_down, 0, e18Var3);
                        String strJ02 = d4c.j0(R.string.chat_message_bottom_sheet_menu_feedback_negative_label, e18Var3);
                        boolean zF2 = e18Var3.f(ux0Var);
                        Object objN7 = e18Var3.N();
                        if (zF2 || objN7 == lz1Var) {
                            final int i3 = 1;
                            objN7 = new bz7() { // from class: tx0
                                @Override // defpackage.bz7
                                public final Object invoke(Object obj10) {
                                    int i32 = i3;
                                    iei ieiVar2 = iei.a;
                                    ux0 ux0Var2 = ux0Var;
                                    ekf ekfVar = (ekf) obj10;
                                    switch (i32) {
                                        case 0:
                                            ekfVar.getClass();
                                            ckf.t(ekfVar, ux0Var2.c);
                                            break;
                                        default:
                                            ekfVar.getClass();
                                            ckf.t(ekfVar, ux0Var2.d);
                                            break;
                                    }
                                    return ieiVar2;
                                }
                            };
                            e18Var3.k0(objN7);
                        }
                        ouk.b(bpcVarD2, strJ02, zy7Var11, tjf.b(fqbVar2, false, (bz7) objN7), e18Var3, 8, 0);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-108906716);
                        e18Var3.p(false);
                    }
                    if (ux0Var.e) {
                        e18Var3.a0(-108849304);
                        ouk.b(a.a(ud0.i, e18Var3), d4c.j0(R.string.chat_message_bottom_sheet_menu_retry, e18Var3), zy7Var12, fqbVar2, e18Var3, 8, 0);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-108484124);
                        e18Var3.p(false);
                    }
                    e18Var3.p(true);
                }
                break;
            case 3:
                xhe xheVar = (xhe) obj9;
                i iVar = (i) obj7;
                bz7 bz7Var4 = (bz7) obj6;
                t4g t4gVar = (t4g) obj8;
                bz7 bz7Var5 = (bz7) qz7Var;
                x0a x0aVar3 = (x0a) obj5;
                nwb nwbVar = (nwb) obj4;
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    e18Var4.T();
                } else {
                    kdg kdgVar = iVar.T0;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    ListIterator listIterator = kdgVar.listIterator();
                    while (true) {
                        c8a c8aVar = (c8a) listIterator;
                        if (!c8aVar.hasNext()) {
                            boolean zF3 = e18Var4.f(bz7Var4) | e18Var4.h(t4gVar);
                            Object objN8 = e18Var4.N();
                            if (zF3 || objN8 == lz1Var) {
                                objN8 = new ty3(bz7Var4, t4gVar, 3);
                                e18Var4.k0(objN8);
                            }
                            bz7 bz7Var6 = (bz7) objN8;
                            boolean zF4 = e18Var4.f(bz7Var5);
                            Object objN9 = e18Var4.N();
                            if (zF4 || objN9 == lz1Var) {
                                objN9 = new f7(5, bz7Var5);
                                e18Var4.k0(objN9);
                            }
                            com.anthropic.claude.code.remote.bottomsheet.a.y(xheVar, i4gVar, linkedHashSet, bz7Var6, (bz7) objN9, x0aVar3, ((Boolean) nwbVar.getValue()).booleanValue(), e18Var4, (iIntValue4 << 3) & 112);
                        } else {
                            linkedHashSet.add(((lhf) c8aVar.next()).a.getId());
                        }
                    }
                }
                break;
            case 4:
                i iVar2 = (i) obj9;
                iqb iqbVar2 = (iqb) obj7;
                zy7 zy7Var13 = (zy7) qz7Var;
                final zy7 zy7Var14 = (zy7) obj4;
                zy7 zy7Var15 = (zy7) obj8;
                bz7 bz7Var7 = (bz7) obj6;
                zy7 zy7Var16 = (zy7) obj5;
                px9 px9Var = (px9) obj;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                px9Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((e18) ld4Var5).f(px9Var) ? 4 : 2;
                }
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    e18Var5.T();
                } else {
                    x36 x36Var = (x36) iVar2.r1.getValue();
                    boolean z3 = x36Var instanceof w36;
                    w36 w36Var = z3 ? (w36) x36Var : null;
                    final int i4 = w36Var != null ? w36Var.b : 0;
                    w36 w36Var2 = z3 ? (w36) x36Var : null;
                    final int i5 = w36Var2 != null ? w36Var2.c : 0;
                    boolean z4 = z3 && (i4 > 0 || i5 > 0);
                    n58 n58VarQ0 = iVar2.q0();
                    boolean z5 = (n58VarQ0 != null ? n58VarQ0.c : null) instanceof c68;
                    boolean z6 = (n58VarQ0 != null ? n58VarQ0.c : null) instanceof b68;
                    boolean z7 = iVar2.d0 && z6;
                    boolean z8 = ((String) iVar2.P1.getValue()) != null;
                    boolean z9 = z7;
                    ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
                    iqb iqbVarA = px9.a(px9Var, gb9.L(iqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1), null, g34.a, 5);
                    cxe cxeVarA2 = axe.a(ho0Var, lja.P, e18Var5, 6);
                    int iHashCode2 = Long.hashCode(e18Var5.T);
                    hyc hycVarL2 = e18Var5.l();
                    iqb iqbVarE2 = kxk.E(e18Var5, iqbVarA);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var2);
                    } else {
                        e18Var5.n0();
                    }
                    d4c.i0(e18Var5, cd4.f, cxeVarA2);
                    d4c.i0(e18Var5, cd4.e, hycVarL2);
                    d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var5, cd4.h);
                    d4c.i0(e18Var5, cd4.d, iqbVarE2);
                    wd6.J(g34.i(z8, e18Var5), null, gp6.e(null, 3).a(gp6.g(null, 0.8f, 5)), gp6.f(null, 3).a(gp6.h(null, 0.8f, 5)), null, fd9.q0(-250651951, new tu(10, zy7Var13), e18Var5), e18Var5, 1600518, 18);
                    wd6.J(g34.i(z4, e18Var5), null, gp6.e(null, 3).a(gp6.g(null, 0.8f, 5)), gp6.f(null, 3).a(gp6.h(null, 0.8f, 5)), null, fd9.q0(524449672, new rz7() { // from class: l24
                        @Override // defpackage.rz7
                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                            ld4 ld4Var6 = (ld4) obj11;
                            int iIntValue6 = ((Integer) obj12).intValue();
                            ((ia0) obj10).getClass();
                            e18 e18Var6 = (e18) ld4Var6;
                            if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                x41.e(i4, i5, zy7Var14, null, e18Var6, 384);
                            } else {
                                e18Var6.T();
                            }
                            return iei.a;
                        }
                    }, e18Var5), e18Var5, 1600518, 18);
                    wd6.J(g34.i(z5, e18Var5), null, gp6.e(null, 3).a(gp6.g(null, 0.8f, 5)), gp6.f(null, 3).a(gp6.h(null, 0.8f, 5)), null, fd9.q0(-567923127, new tu(11, zy7Var15), e18Var5), e18Var5, 1600518, 18);
                    wd6.J(g34.i(z6, e18Var5), null, gp6.e(null, 3).a(gp6.g(null, 0.8f, 5)), gp6.f(null, 3).a(gp6.h(null, 0.8f, 5)), null, fd9.q0(-1660295926, new ii(n58VarQ0, 20, bz7Var7), e18Var5), e18Var5, 1600518, 18);
                    wd6.J(g34.i(z9, e18Var5), null, gp6.e(null, 3).a(gp6.g(null, 0.8f, 5)), gp6.f(null, 3).a(gp6.h(null, 0.8f, 5)), null, fd9.q0(1542298571, new tu(12, zy7Var16), e18Var5), e18Var5, 1600518, 18);
                    e18Var5.p(true);
                }
                break;
            case 5:
                fk0 fk0Var = (fk0) obj9;
                rwe rweVar = (rwe) obj7;
                ze0 ze0Var = (ze0) obj8;
                um1 um1Var = (um1) obj6;
                zy7 zy7Var17 = (zy7) qz7Var;
                b4e b4eVar = (b4e) obj4;
                ybg ybgVar = (ybg) obj5;
                mnc mncVar3 = (mnc) obj;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                mncVar3.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((e18) ld4Var6).f(mncVar3) ? 4 : 2;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    e18Var6.T();
                } else {
                    iqb iqbVarI = gb9.I(mpk.b0(fqbVar, mpk.Y(e18Var6), true), mncVar3);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var6, 0);
                    int iHashCode3 = Long.hashCode(e18Var6.T);
                    hyc hycVarL3 = e18Var6.l();
                    iqb iqbVarE3 = kxk.E(e18Var6, iqbVarI);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var6.e0();
                    if (e18Var6.S) {
                        e18Var6.k(re4Var3);
                    } else {
                        e18Var6.n0();
                    }
                    d4c.i0(e18Var6, cd4.f, q64VarA);
                    d4c.i0(e18Var6, cd4.e, hycVarL3);
                    d4c.i0(e18Var6, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var6, cd4.h);
                    d4c.i0(e18Var6, cd4.d, iqbVarE3);
                    Object objN10 = e18Var6.N();
                    if (objN10 == lz1Var) {
                        objN10 = fd9.O(im6.E, e18Var6);
                        e18Var6.k0(objN10);
                    }
                    l45 l45Var = (l45) objN10;
                    m7f m7fVar = (m7f) e18Var6.j(gr9.b);
                    kce kceVar = jce.a;
                    koi koiVar = (koi) m7fVar.c(kceVar.b(koi.class));
                    q7 q7Var = (q7) m7fVar.c(kceVar.b(q7.class));
                    com.anthropic.claude.code.remote.stores.a aVar = (com.anthropic.claude.code.remote.stores.a) m7fVar.c(kceVar.b(com.anthropic.claude.code.remote.stores.a.class));
                    com.anthropic.claude.code.remote.stores.b bVar = (com.anthropic.claude.code.remote.stores.b) m7fVar.c(kceVar.b(com.anthropic.claude.code.remote.stores.b.class));
                    qnc qncVar = qf2.a;
                    kxk.g(e18Var6, b.e(fqbVar, 12.0f));
                    boolean zF5 = e18Var6.f(koiVar) | e18Var6.f(q7Var) | e18Var6.h(fk0Var) | e18Var6.h(l45Var) | e18Var6.h(rweVar) | e18Var6.h(ze0Var) | e18Var6.h(um1Var) | e18Var6.h(aVar) | e18Var6.f(bVar) | e18Var6.f(zy7Var17) | e18Var6.h(b4eVar);
                    Object objN11 = e18Var6.N();
                    if (zF5 || objN11 == lz1Var) {
                        f04 f04Var = new f04(koiVar, q7Var, ybgVar, fk0Var, l45Var, rweVar, ze0Var, um1Var, aVar, bVar, zy7Var17, b4eVar);
                        e18Var6.k0(f04Var);
                        objN11 = f04Var;
                    }
                    qwj.a(null, null, xnk.a, null, null, null, null, (bz7) objN11, e18Var6, 384, 123);
                    grc.z(fqbVar, 12.0f, e18Var6, true);
                }
                break;
            case 6:
                ild ildVar = (ild) obj9;
                mxd mxdVar2 = (mxd) obj7;
                q2i q2iVar3 = (q2i) obj8;
                zy7 zy7Var18 = (zy7) qz7Var;
                pz7 pz7Var = (pz7) obj6;
                pz7 pz7Var2 = (pz7) obj4;
                x0a x0aVar4 = (x0a) obj5;
                mnc mncVar4 = (mnc) obj;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                mncVar4.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var7).f(mncVar4) ? 4 : 2;
                }
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    e18Var7.T();
                } else {
                    boolean zBooleanValue6 = ((Boolean) ildVar.o.getValue()).booleanValue();
                    boolean zH6 = e18Var7.h(ildVar);
                    Object objN12 = e18Var7.N();
                    if (zH6 || objN12 == lz1Var) {
                        objN12 = new ald(ildVar, 5);
                        e18Var7.k0(objN12);
                    }
                    iuj.c(zBooleanValue6, (zy7) objN12, null, mxdVar2, fd9.q0(2004501398, new xg4(ildVar, mncVar4, mxdVar2, 28), e18Var7), null, fd9.q0(704426324, new fw(ildVar, q2iVar3, zy7Var18, pz7Var, pz7Var2, x0aVar4, mncVar4), e18Var7), e18Var7, 1597440, 36);
                }
                break;
            default:
                ild ildVar2 = (ild) obj9;
                q2i q2iVar4 = (q2i) obj8;
                zy7 zy7Var19 = (zy7) qz7Var;
                pz7 pz7Var3 = (pz7) obj7;
                pz7 pz7Var4 = (pz7) obj6;
                x0a x0aVar5 = (x0a) obj5;
                mnc mncVar5 = (mnc) obj4;
                mw1 mw1Var = (mw1) obj;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                mw1Var.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((e18) ld4Var8).f(mw1Var) ? 4 : 2;
                }
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    e18Var8.T();
                } else {
                    tkd tkdVar = (tkd) ildVar2.t.getValue();
                    List list2 = (List) ildVar2.w.getValue();
                    boolean zS = ildVar2.S();
                    Date date2 = (Date) ildVar2.x.getValue();
                    boolean zI = ildVar2.c.i();
                    znd zndVar = (znd) ildVar2.u.getValue();
                    String strN = zndVar != null ? zndVar.d.b : null;
                    if (strN == null) {
                        zy7Var = zy7Var19;
                        strN = vb7.n(e18Var8, -1651123604, R.string.project_details_knowledge_title, e18Var8, false);
                    } else {
                        zy7Var = zy7Var19;
                        e18Var8.a0(-1651126425);
                        e18Var8.p(false);
                    }
                    String str = strN;
                    MemorySynthesisResponse memorySynthesisResponse = (MemorySynthesisResponse) ildVar2.q.getValue();
                    String memory = memorySynthesisResponse != null ? memorySynthesisResponse.getMemory() : null;
                    boolean zBooleanValue7 = ((Boolean) ildVar2.r.getValue()).booleanValue();
                    boolean zH7 = e18Var8.h(ildVar2);
                    Object objN13 = e18Var8.N();
                    if (zH7 || objN13 == lz1Var) {
                        objN13 = new mx5(0, ildVar2, ild.class, "refresh", "refresh()V", 0, 23);
                        e18Var8.k0(objN13);
                    }
                    jm9 jm9Var3 = (jm9) objN13;
                    iqb iqbVarI2 = ztj.i(b.c, ((g77) q2iVar4).e, null);
                    boolean zF6 = e18Var8.f(pz7Var3) | e18Var8.h(ildVar2);
                    Object objN14 = e18Var8.N();
                    if (zF6 || objN14 == lz1Var) {
                        objN14 = new aac(pz7Var3, 7, ildVar2);
                        e18Var8.k0(objN14);
                    }
                    zy7 zy7Var20 = (zy7) objN14;
                    boolean zF7 = e18Var8.f(pz7Var4);
                    Object objN15 = e18Var8.N();
                    if (zF7 || objN15 == lz1Var) {
                        objN15 = new kld(0, pz7Var4);
                        e18Var8.k0(objN15);
                    }
                    bz7 bz7Var8 = (bz7) objN15;
                    boolean zH8 = e18Var8.h(ildVar2);
                    Object objN16 = e18Var8.N();
                    if (zH8 || objN16 == lz1Var) {
                        objN16 = new jld(ildVar2, 1);
                        e18Var8.k0(objN16);
                    }
                    bz7 bz7Var9 = (bz7) objN16;
                    zy7 zy7Var21 = (zy7) jm9Var3;
                    boolean zH9 = e18Var8.h(ildVar2);
                    Object objN17 = e18Var8.N();
                    if (zH9 || objN17 == lz1Var) {
                        objN17 = new jld(ildVar2, 2);
                        e18Var8.k0(objN17);
                    }
                    bhk.b(tkdVar, list2, zS, date2, zy7Var, zy7Var20, bz7Var8, bz7Var9, zy7Var21, (bz7) objN17, zI, str, memory, zBooleanValue7, iqbVarI2, x0aVar5, mncVar5, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var8, 0);
                    if (((Boolean) ildVar2.p.getValue()).booleanValue() && !ildVar2.S()) {
                        e18Var8.a0(355824033);
                        boolean zBooleanValue8 = ((Boolean) ildVar2.o.getValue()).booleanValue();
                        boolean zH10 = e18Var8.h(ildVar2);
                        Object objN18 = e18Var8.N();
                        if (zH10 || objN18 == lz1Var) {
                            objN18 = new mx5(0, ildVar2, ild.class, "refresh", "refresh()V", 0, 24);
                            e18Var8.k0(objN18);
                        }
                        g.a(0, 0, e18Var8, (zy7) ((jm9) objN18), b.v(mw1Var.a(fqbVar, lja.K), MTTypesetterKt.kLineSkipLimitMultiplier, 320.0f, 1), zBooleanValue8);
                        e18Var8.p(false);
                    } else {
                        e18Var8.a0(356113294);
                        e18Var8.p(false);
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ fw(zy7 zy7Var, ux0 ux0Var, zy7 zy7Var2, zy7 zy7Var3, zy7 zy7Var4, zy7 zy7Var5, zy7 zy7Var6) {
        this.E = 2;
        this.I = zy7Var;
        this.F = ux0Var;
        this.J = zy7Var2;
        this.L = zy7Var3;
        this.G = zy7Var4;
        this.H = zy7Var5;
        this.K = zy7Var6;
    }

    public /* synthetic */ fw(ild ildVar, mxd mxdVar, g77 g77Var, zy7 zy7Var, pz7 pz7Var, pz7 pz7Var2, x0a x0aVar) {
        this.E = 6;
        this.F = ildVar;
        this.L = mxdVar;
        this.G = g77Var;
        this.I = zy7Var;
        this.H = pz7Var;
        this.J = pz7Var2;
        this.K = x0aVar;
    }

    public /* synthetic */ fw(ild ildVar, q2i q2iVar, zy7 zy7Var, pz7 pz7Var, pz7 pz7Var2, x0a x0aVar, mnc mncVar) {
        this.E = 7;
        this.F = ildVar;
        this.G = q2iVar;
        this.I = zy7Var;
        this.L = pz7Var;
        this.H = pz7Var2;
        this.K = x0aVar;
        this.J = mncVar;
    }

    public /* synthetic */ fw(xhe xheVar, i iVar, bz7 bz7Var, t4g t4gVar, bz7 bz7Var2, x0a x0aVar, nwb nwbVar) {
        this.E = 3;
        this.F = xheVar;
        this.L = iVar;
        this.H = bz7Var;
        this.G = t4gVar;
        this.I = bz7Var2;
        this.K = x0aVar;
        this.J = nwbVar;
    }

    public /* synthetic */ fw(i iVar, iqb iqbVar, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, bz7 bz7Var, zy7 zy7Var4) {
        this.E = 4;
        this.F = iVar;
        this.L = iqbVar;
        this.I = zy7Var;
        this.J = zy7Var2;
        this.G = zy7Var3;
        this.H = bz7Var;
        this.K = zy7Var4;
    }

    public /* synthetic */ fw(Object obj, Object obj2, Object obj3, Object obj4, zy7 zy7Var, Object obj5, Object obj6, int i) {
        this.E = i;
        this.F = obj;
        this.L = obj2;
        this.G = obj3;
        this.H = obj4;
        this.I = zy7Var;
        this.J = obj5;
        this.K = obj6;
    }
}
