package defpackage;

import android.content.Context;
import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.login.WelcomeNotice;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lz9 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ lz9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xz9 xz9Var;
        iqb iqbVarB;
        Object obj4;
        int i;
        Object eqVar;
        Object objU;
        int i2 = this.E;
        boolean z = false;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        Object obj5 = this.I;
        Object obj6 = this.H;
        Object obj7 = this.G;
        Object obj8 = this.F;
        switch (i2) {
            case 0:
                xz9 xz9Var2 = (xz9) obj8;
                iqb iqbVar = (iqb) obj7;
                mz9 mz9Var = (mz9) obj6;
                nwb nwbVar = (nwb) obj5;
                z4f z4fVar = (z4f) obj;
                ((Integer) obj3).getClass();
                e18 e18Var = (e18) ((ld4) obj2);
                Object objN = e18Var.N();
                Object obj9 = objN;
                if (objN == lz1Var) {
                    jz9 jz9Var = new jz9(z4fVar, new fg1(17, nwbVar));
                    e18Var.k0(jz9Var);
                    obj9 = jz9Var;
                }
                jz9 jz9Var2 = (jz9) obj9;
                Object objN2 = e18Var.N();
                Object obj10 = objN2;
                if (objN2 == lz1Var) {
                    fvg fvgVar = new fvg(new q28(jz9Var2));
                    e18Var.k0(fvgVar);
                    obj10 = fvgVar;
                }
                fvg fvgVar2 = (fvg) obj10;
                if (xz9Var2 != null) {
                    e18Var.a0(1743490539);
                    e18Var.a0(887527095);
                    Object obj11 = ncd.a;
                    if (obj11 != null) {
                        e18Var.a0(1345554384);
                    } else {
                        e18Var.a0(1345603457);
                        View view = (View) e18Var.j(w00.f);
                        boolean zF = e18Var.f(view);
                        Object objN3 = e18Var.N();
                        if (zF || objN3 == lz1Var) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            lcd h50Var = tag instanceof lcd ? (lcd) tag : null;
                            if (h50Var == null) {
                                h50Var = new h50(view);
                                view.setTag(R.id.compose_prefetch_scheduler, h50Var);
                            }
                            objN3 = h50Var;
                            e18Var.k0(objN3);
                        }
                        obj11 = (lcd) objN3;
                    }
                    e18Var.p(false);
                    Object obj12 = obj11;
                    e18Var.p(false);
                    Object[] objArr = {xz9Var2, jz9Var2, fvgVar2, obj12};
                    boolean zF2 = e18Var.f(xz9Var2) | e18Var.h(jz9Var2) | e18Var.h(fvgVar2) | e18Var.h(obj12);
                    Object objN4 = e18Var.N();
                    if (zF2 || objN4 == lz1Var) {
                        xz9Var = xz9Var2;
                        x70 x70Var = new x70(xz9Var, jz9Var2, fvgVar2, obj12, 7);
                        e18Var.k0(x70Var);
                        obj4 = x70Var;
                    } else {
                        xz9Var = xz9Var2;
                        obj4 = objN4;
                    }
                    fd9.g(objArr, (bz7) obj4, e18Var);
                    e18Var.p(false);
                } else {
                    xz9Var = xz9Var2;
                    e18Var.a0(1744076749);
                    e18Var.p(false);
                }
                int i3 = yz9.a;
                if (xz9Var != null && (iqbVarB = iqbVar.B(new q6i(xz9Var))) != null) {
                    iqbVar = iqbVarB;
                }
                boolean zF3 = e18Var.f(jz9Var2) | e18Var.f(mz9Var);
                Object objN5 = e18Var.N();
                Object obj13 = objN5;
                if (zF3 || objN5 == lz1Var) {
                    ow1 ow1Var = new ow1(jz9Var2, 27, mz9Var);
                    e18Var.k0(ow1Var);
                    obj13 = ow1Var;
                }
                bvg.b(fvgVar2, iqbVar, (pz7) obj13, e18Var, 8);
                return ieiVar;
            case 1:
                zy7 zy7Var = (zy7) obj8;
                rz7 rz7Var = (rz7) obj7;
                zy7 zy7Var2 = (zy7) obj6;
                WelcomeNotice welcomeNotice = (WelcomeNotice) obj5;
                boolean z2 = false;
                zy7 zy7Var3 = (zy7) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                zy7Var3.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).h(zy7Var3) ? 4 : 2;
                }
                if ((iIntValue & 19) != 18) {
                    z2 = true;
                }
                e18 e18Var2 = (e18) ld4Var;
                if (e18Var2.Q(iIntValue & 1, z2)) {
                    olh.a(false, null, null, fd9.q0(-1314952917, new g73(zy7Var, zy7Var3, rz7Var, zy7Var2, welcomeNotice, 2), e18Var2), e18Var2, 3072, 7);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                fk0 fk0Var = (fk0) obj8;
                Context context = (Context) obj7;
                w7 w7Var = (w7) obj6;
                rwe rweVar = (rwe) obj5;
                zy7 zy7Var4 = (zy7) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                zy7Var4.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).h(zy7Var4) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var2;
                if (e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean z3 = (iIntValue2 & 14) == 4;
                    Object objN6 = e18Var3.N();
                    if (z3 || objN6 == lz1Var) {
                        objN6 = new kw0(11, zy7Var4);
                        e18Var3.k0(objN6);
                    }
                    fd9.d(ieiVar, (bz7) objN6, e18Var3);
                    olh.a(false, null, null, fd9.q0(744212442, new mm5(fk0Var, context, w7Var, rweVar, 17), e18Var3), e18Var3, 3072, 7);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 3:
                sbg sbgVar = (sbg) obj8;
                sbg sbgVar2 = (sbg) obj7;
                je7 je7Var = (je7) obj6;
                String str = (String) obj5;
                pz7 pz7Var = (pz7) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).h(pz7Var) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var3;
                if (e18Var4.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    boolean zR = x44.r(sbgVar, sbgVar2);
                    yig yigVarP = u00.P(asb.H, e18Var4);
                    boolean zF4 = e18Var4.f(sbgVar) | e18Var4.h(je7Var);
                    Object objN7 = e18Var4.N();
                    int i4 = 7;
                    Object obj14 = objN7;
                    if (zF4 || objN7 == lz1Var) {
                        ytf ytfVar = new ytf(sbgVar, i4, je7Var);
                        e18Var4.k0(ytfVar);
                        obj14 = ytfVar;
                    }
                    zy7 zy7Var5 = (zy7) obj14;
                    Object objN8 = e18Var4.N();
                    Object obj15 = objN8;
                    if (objN8 == lz1Var) {
                        a80 a80VarA = zh4.a(!zR ? 1.0f : MTTypesetterKt.kLineSkipLimitMultiplier);
                        e18Var4.k0(a80VarA);
                        obj15 = a80VarA;
                    }
                    a80 a80Var = (a80) obj15;
                    Boolean boolValueOf = Boolean.valueOf(zR);
                    boolean zH = e18Var4.h(a80Var) | e18Var4.g(zR) | e18Var4.h(yigVarP) | e18Var4.f(zy7Var5);
                    Object objN9 = e18Var4.N();
                    if (zH || objN9 == lz1Var) {
                        i = 7;
                        eqVar = new eq(a80Var, zR, yigVarP, zy7Var5, (tp4) null);
                        e18Var4.k0(eqVar);
                    } else {
                        eqVar = objN9;
                        i = 7;
                    }
                    fd9.i(e18Var4, (pz7) eqVar, boolValueOf);
                    nb0 nb0Var = a80Var.c;
                    yig yigVarP2 = u00.P(asb.F, e18Var4);
                    Object objN10 = e18Var4.N();
                    Object obj16 = objN10;
                    if (objN10 == lz1Var) {
                        a80 a80VarA2 = zh4.a(!zR ? 1.0f : 0.8f);
                        e18Var4.k0(a80VarA2);
                        obj16 = a80VarA2;
                    }
                    a80 a80Var2 = (a80) obj16;
                    Boolean boolValueOf2 = Boolean.valueOf(zR);
                    boolean zH2 = e18Var4.h(a80Var2) | e18Var4.g(zR) | e18Var4.h(yigVarP2);
                    Object objN11 = e18Var4.N();
                    if (zH2 || objN11 == lz1Var) {
                        ku kuVar = new ku(a80Var2, zR, yigVarP2, (tp4) null, 18);
                        e18Var4.k0(kuVar);
                        objN11 = kuVar;
                    }
                    fd9.i(e18Var4, (pz7) objN11, boolValueOf2);
                    nb0 nb0Var2 = a80Var2.c;
                    iqb iqbVarJ0 = xn5.j0(fqb.E, ((Number) nb0Var2.F.getValue()).floatValue(), ((Number) nb0Var2.F.getValue()).floatValue(), ((Number) nb0Var.F.getValue()).floatValue(), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, false, 524280);
                    boolean zG = e18Var4.g(zR) | e18Var4.f(sbgVar) | e18Var4.f(str);
                    Object objN12 = e18Var4.N();
                    Object obj17 = objN12;
                    if (zG || objN12 == lz1Var) {
                        jl1 jl1Var = new jl1(zR, str, sbgVar, i);
                        e18Var4.k0(jl1Var);
                        obj17 = jl1Var;
                    }
                    iqb iqbVarB2 = tjf.b(iqbVarJ0, false, (bz7) obj17);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var4.T);
                    hyc hycVarL = e18Var4.l();
                    iqb iqbVarE = kxk.E(e18Var4, iqbVarB2);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, o5bVarD);
                    d4c.i0(e18Var4, cd4.e, hycVarL);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE);
                    sq6.B(iIntValue3 & 14, pz7Var, e18Var4, true);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            default:
                eeg eegVar = (eeg) obj8;
                m2a m2aVar = (m2a) obj7;
                cjh cjhVar = (cjh) obj6;
                occ occVar = (occ) obj5;
                iqb iqbVar2 = (iqb) obj;
                ((Integer) obj3).getClass();
                e18 e18Var5 = (e18) ((ld4) obj2);
                e18Var5.a0(-84507373);
                boolean zBooleanValue = ((Boolean) e18Var5.j(ve4.y)).booleanValue();
                boolean zG2 = e18Var5.g(zBooleanValue);
                Object objN13 = e18Var5.N();
                if (zG2 || objN13 == lz1Var) {
                    objN13 = new pd5(zBooleanValue);
                    e18Var5.k0(objN13);
                }
                pd5 pd5Var = (pd5) objN13;
                boolean z4 = eegVar.a != 16;
                if (((y1a) ((sbj) e18Var5.j(ve4.v))).b() && m2aVar.b() && kkh.d(cjhVar.b) && z4) {
                    e18Var5.a0(-707487962);
                    zb0 zb0Var = cjhVar.a;
                    kkh kkhVar = new kkh(cjhVar.b);
                    boolean zH3 = e18Var5.h(pd5Var);
                    Object objN14 = e18Var5.N();
                    if (zH3 || objN14 == lz1Var) {
                        objN14 = new bff(pd5Var, z ? 1 : 0, 9);
                        e18Var5.k0(objN14);
                    }
                    fd9.j(zb0Var, kkhVar, (pz7) objN14, e18Var5);
                    boolean zH4 = e18Var5.h(pd5Var) | e18Var5.h(occVar) | e18Var5.f(cjhVar) | e18Var5.h(m2aVar) | e18Var5.f(eegVar);
                    Object objN15 = e18Var5.N();
                    if (zH4 || objN15 == lz1Var) {
                        bd bdVar = new bd(pd5Var, occVar, cjhVar, m2aVar, eegVar, 1);
                        e18Var5.k0(bdVar);
                        objN15 = bdVar;
                    }
                    objU = zni.u(iqbVar2, (bz7) objN15);
                    e18Var5.p(false);
                } else {
                    e18Var5.a0(-705473241);
                    e18Var5.p(false);
                    objU = fqb.E;
                }
                e18Var5.p(false);
                return objU;
        }
    }
}
