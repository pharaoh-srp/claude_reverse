package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.experience.BannerContent;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.tool.model.HealthConnectQueryV0Input;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qe implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ qe(pz7 pz7Var, z02 z02Var, boolean z, String str) {
        this.E = 5;
        this.G = pz7Var;
        this.H = z02Var;
        this.F = z;
        this.I = str;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) throws IOException {
        y02 y02Var;
        iqb iqbVar;
        float f;
        fqb fqbVar;
        String name;
        int i = this.E;
        eo0 eo0Var = ko0.c;
        fqb fqbVar2 = fqb.E;
        boolean z = this.F;
        lz1 lz1Var = jd4.a;
        int i2 = 16;
        iei ieiVar = iei.a;
        Object obj4 = this.I;
        Object obj5 = this.H;
        Object obj6 = this.G;
        switch (i) {
            case 0:
                zy7 zy7Var = (zy7) obj6;
                mnc mncVar = (mnc) obj5;
                oxf oxfVar = (oxf) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    gvk.a(new q21(a.a(ud0.X, e18Var), d4c.j0(R.string.connectors_label, e18Var), zy7Var, null, null, false, false, this.F, null, 760), mncVar, b.c(fqbVar2, 1.0f), oxfVar, e18Var, 384);
                }
                break;
            case 1:
                xp0 xp0Var = (xp0) obj5;
                zy7 zy7Var2 = (zy7) obj6;
                kg3 kg3Var = (kg3) obj4;
                s64 s64Var = (s64) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                s64Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(s64Var) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    boolean zF = e18Var2.f(xp0Var) | e18Var2.f(zy7Var2);
                    Object objN = e18Var2.N();
                    if (zF || objN == lz1Var) {
                        objN = new k6(xp0Var, 15, zy7Var2);
                        e18Var2.k0(objN);
                    }
                    zy7 zy7Var3 = (zy7) objN;
                    boolean zF2 = e18Var2.f(xp0Var);
                    Object objN2 = e18Var2.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new up0(xp0Var, 8);
                        e18Var2.k0(objN2);
                    }
                    zy7 zy7Var4 = (zy7) objN2;
                    boolean zF3 = e18Var2.f(xp0Var);
                    Object objN3 = e18Var2.N();
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new up0(xp0Var, 9);
                        e18Var2.k0(objN3);
                    }
                    zy7 zy7Var5 = (zy7) objN3;
                    boolean zF4 = e18Var2.f(xp0Var);
                    Object objN4 = e18Var2.N();
                    if (zF4 || objN4 == lz1Var) {
                        objN4 = new up0(xp0Var, 10);
                        e18Var2.k0(objN4);
                    }
                    com.anthropic.claude.artifact.sheet.a.b(s64Var, xp0Var, this.F, zy7Var3, zy7Var4, zy7Var5, (zy7) objN4, kg3Var, e18Var2, (iIntValue2 & 14) | 16777216);
                }
                break;
            case 2:
                nwb nwbVar = (nwb) obj6;
                mnc mncVar2 = (mnc) obj5;
                final oz3 oz3Var = (oz3) obj4;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    final vsf vsfVar = (vsf) nwbVar.getValue();
                    if (vsfVar != null) {
                        e18Var3.a0(-1676655525);
                        BannerContent bannerContent = vsfVar.b;
                        iqb iqbVarI = gb9.I(fqbVar2, mncVar2);
                        boolean zF5 = e18Var3.f(oz3Var) | e18Var3.f(vsfVar);
                        Object objN5 = e18Var3.N();
                        Object obj7 = objN5;
                        if (zF5 || objN5 == lz1Var) {
                            final int i3 = 0;
                            zy7 zy7Var6 = new zy7() { // from class: l04
                                @Override // defpackage.zy7
                                public final Object a() {
                                    int i4 = i3;
                                    iei ieiVar2 = iei.a;
                                    vsf vsfVar2 = vsfVar;
                                    oz3 oz3Var2 = oz3Var;
                                    switch (i4) {
                                        case 0:
                                            String str = vsfVar2.a;
                                            oz3Var2.getClass();
                                            str.getClass();
                                            if (oz3Var2.a.d()) {
                                                oz3Var2.g.setValue(Boolean.TRUE);
                                                if (!oz3Var2.e.getAndSet(true)) {
                                                    gb9.D(oz3Var2.b, null, null, new mz3(oz3Var2, str, null, 1), 3);
                                                }
                                            }
                                            break;
                                        default:
                                            String str2 = vsfVar2.a;
                                            oz3Var2.getClass();
                                            l45 l45Var = oz3Var2.b;
                                            str2.getClass();
                                            if (oz3Var2.a.d()) {
                                                oz3Var2.d.setValue(Boolean.TRUE);
                                                gb9.D(l45Var, null, null, new cj(oz3Var2, null, 14), 3);
                                                gb9.D(l45Var, null, null, new mz3(oz3Var2, str2, null, 0), 3);
                                            }
                                            break;
                                    }
                                    return ieiVar2;
                                }
                            };
                            e18Var3.k0(zy7Var6);
                            obj7 = zy7Var6;
                        }
                        zy7 zy7Var7 = (zy7) obj7;
                        boolean zF6 = e18Var3.f(oz3Var) | e18Var3.f(vsfVar);
                        Object objN6 = e18Var3.N();
                        Object obj8 = objN6;
                        if (zF6 || objN6 == lz1Var) {
                            final int i4 = 1;
                            zy7 zy7Var8 = new zy7() { // from class: l04
                                @Override // defpackage.zy7
                                public final Object a() {
                                    int i42 = i4;
                                    iei ieiVar2 = iei.a;
                                    vsf vsfVar2 = vsfVar;
                                    oz3 oz3Var2 = oz3Var;
                                    switch (i42) {
                                        case 0:
                                            String str = vsfVar2.a;
                                            oz3Var2.getClass();
                                            str.getClass();
                                            if (oz3Var2.a.d()) {
                                                oz3Var2.g.setValue(Boolean.TRUE);
                                                if (!oz3Var2.e.getAndSet(true)) {
                                                    gb9.D(oz3Var2.b, null, null, new mz3(oz3Var2, str, null, 1), 3);
                                                }
                                            }
                                            break;
                                        default:
                                            String str2 = vsfVar2.a;
                                            oz3Var2.getClass();
                                            l45 l45Var = oz3Var2.b;
                                            str2.getClass();
                                            if (oz3Var2.a.d()) {
                                                oz3Var2.d.setValue(Boolean.TRUE);
                                                gb9.D(l45Var, null, null, new cj(oz3Var2, null, 14), 3);
                                                gb9.D(l45Var, null, null, new mz3(oz3Var2, str2, null, 0), 3);
                                            }
                                            break;
                                    }
                                    return ieiVar2;
                                }
                            };
                            e18Var3.k0(zy7Var8);
                            obj8 = zy7Var8;
                        }
                        zy7 zy7Var9 = (zy7) obj8;
                        boolean zF7 = e18Var3.f(oz3Var) | e18Var3.f(vsfVar);
                        Object objN7 = e18Var3.N();
                        Object obj9 = objN7;
                        if (zF7 || objN7 == lz1Var) {
                            kn knVar = new kn(oz3Var, 28, vsfVar);
                            e18Var3.k0(knVar);
                            obj9 = knVar;
                        }
                        vee.b(bannerContent, zy7Var7, zy7Var9, (pz7) obj9, iqbVarI, this.F, e18Var3, 0);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(-1676655526);
                        e18Var3.p(false);
                    }
                }
                break;
            case 3:
                String str = (String) obj5;
                zy7 zy7Var10 = (zy7) obj6;
                zy7 zy7Var11 = (zy7) obj4;
                qw1 qw1Var = (qw1) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                qw1Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(qw1Var) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    e18Var4.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    ho0 ho0Var = new ho0(16.0f, false, new do0(0, wo1Var));
                    vo1 vo1Var = lja.T;
                    iqb iqbVarJ = gb9.J(b.g(mpk.b0(b.c(fqbVar2, 1.0f), mpk.Y(e18Var4), true), qw1Var.b(), MTTypesetterKt.kLineSkipLimitMultiplier, 2), 24.0f);
                    Object objN8 = e18Var4.N();
                    if (objN8 == lz1Var) {
                        objN8 = new qy4(i);
                        e18Var4.k0(objN8);
                    }
                    iqb iqbVarB = tjf.b(iqbVarJ, true, (bz7) objN8);
                    q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var4, 54);
                    int iHashCode = Long.hashCode(e18Var4.T);
                    hyc hycVarL = e18Var4.l();
                    iqb iqbVarE = kxk.E(e18Var4, iqbVarB);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var);
                    } else {
                        e18Var4.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var4, z80Var, q64VarA);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var4, z80Var2, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var4, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var4, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var4, z80Var4, iqbVarE);
                    tjh.b(str, null, gm3.a(e18Var4).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).g, e18Var4, 0, 0, 131066);
                    y02 y02Var2 = y02.a;
                    if (z) {
                        e18Var4.a0(-1456446897);
                        cxe cxeVarA = axe.a(new ho0(8.0f, true, new sz6(1)), wo1Var, e18Var4, 54);
                        int iHashCode2 = Long.hashCode(e18Var4.T);
                        hyc hycVarL2 = e18Var4.l();
                        iqb iqbVarE2 = kxk.E(e18Var4, fqbVar2);
                        e18Var4.e0();
                        if (e18Var4.S) {
                            e18Var4.k(re4Var);
                        } else {
                            e18Var4.n0();
                        }
                        d4c.i0(e18Var4, z80Var, cxeVarA);
                        d4c.i0(e18Var4, z80Var2, hycVarL2);
                        ij0.t(iHashCode2, e18Var4, z80Var3, e18Var4, bxVar);
                        d4c.i0(e18Var4, z80Var4, iqbVarE2);
                        tjd.a(b.o(fqbVar2, 16.0f), gm3.a(e18Var4).c, 2.0f, 0L, 0, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var4, 390, 56);
                        tjh.b(d4c.j0(R.string.conway_status_reconnecting, e18Var4), null, gm3.a(e18Var4).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).i, e18Var4, 0, 0, 131066);
                        e18Var4.p(true);
                        e18Var4.p(false);
                        y02Var = y02Var2;
                    } else {
                        e18Var4.a0(-1455761766);
                        y02Var = y02Var2;
                        dtj.a(d4c.j0(R.string.conway_retry, e18Var4), null, false, null, null, y02Var, 0L, zy7Var10, e18Var4, 196608, 94);
                        e18Var4.p(false);
                    }
                    dtj.a(d4c.j0(R.string.conway_start_fresh, e18Var4), null, false, null, null, y02Var, 0L, zy7Var11, e18Var4, 196608, 94);
                    e18Var4.p(true);
                }
                break;
            case 4:
                HealthConnectQueryV0Input healthConnectQueryV0Input = (HealthConnectQueryV0Input) obj5;
                zy7 zy7Var12 = (zy7) obj6;
                wz5 wz5Var = (wz5) obj4;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((mnc) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e18Var5.T();
                } else {
                    ksk.b(healthConnectQueryV0Input, ((Boolean) wz5Var.getValue()).booleanValue(), this.F, zy7Var12, e18Var5, 0);
                }
                break;
            case 5:
                pz7 pz7Var = (pz7) obj6;
                z02 z02Var = (z02) obj5;
                String str2 = (String) obj4;
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((e18) ld4Var6).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    e18Var6.T();
                } else {
                    boolean z2 = this.F;
                    if (pz7Var != null) {
                        e18Var6.a0(-1400830659);
                        ta4 ta4VarQ0 = fd9.q0(1825849082, new xb2(z2, pz7Var, i), e18Var6);
                        iqbVar = null;
                        zsj.a(z02Var, null, ta4VarQ0, e18Var6, 384);
                        e18Var6.p(false);
                    } else {
                        e18Var6.a0(-1400615705);
                        wd6.K(dxeVar, z2, null, gp6.e(null, 3).a(gp6.a(null, null, 15)), gp6.i(null, null, 15).a(gp6.f(null, 3)), null, fd9.q0(-734511342, new lca(z ? 1 : 0, z02Var), e18Var6), e18Var6, (iIntValue6 & 14) | 1600512, 18);
                        e18Var6.p(false);
                        iqbVar = null;
                    }
                    etj.c(str2, z02Var, iqbVar, e18Var6, 0);
                }
                break;
            case 6:
                List list = (List) obj5;
                bz7 bz7Var = (bz7) obj4;
                zy7 zy7Var13 = (zy7) obj6;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                xo1 xo1Var = lja.K;
                ((mw1) obj).getClass();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    e18Var7.T();
                } else {
                    List list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        e18Var7.a0(-418893144);
                        qbb.b(0, e18Var7, bz7Var, null, list);
                        e18Var7.p(false);
                    } else if (list != null) {
                        e18Var7.a0(-100707981);
                        FillElement fillElement = b.c;
                        o5b o5bVarD = dw1.d(xo1Var, false);
                        int iHashCode3 = Long.hashCode(e18Var7.T);
                        hyc hycVarL3 = e18Var7.l();
                        iqb iqbVarE3 = kxk.E(e18Var7, fillElement);
                        dd4.e.getClass();
                        re4 re4Var2 = cd4.b;
                        e18Var7.e0();
                        if (e18Var7.S) {
                            e18Var7.k(re4Var2);
                        } else {
                            e18Var7.n0();
                        }
                        d4c.i0(e18Var7, cd4.f, o5bVarD);
                        d4c.i0(e18Var7, cd4.e, hycVarL3);
                        d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode3));
                        d4c.h0(e18Var7, cd4.h);
                        d4c.i0(e18Var7, cd4.d, iqbVarE3);
                        pvj.b(a.a(ud0.o0, e18Var7), d4c.j0(R.string.memory_files_empty, e18Var7), null, null, e18Var7, 8, 12);
                        e18Var7.p(true);
                        e18Var7.p(false);
                    } else if (!z) {
                        e18Var7.a0(-99640062);
                        FillElement fillElement2 = b.c;
                        o5b o5bVarD2 = dw1.d(xo1Var, false);
                        int iHashCode4 = Long.hashCode(e18Var7.T);
                        hyc hycVarL4 = e18Var7.l();
                        iqb iqbVarE4 = kxk.E(e18Var7, fillElement2);
                        dd4.e.getClass();
                        re4 re4Var3 = cd4.b;
                        e18Var7.e0();
                        if (e18Var7.S) {
                            e18Var7.k(re4Var3);
                        } else {
                            e18Var7.n0();
                        }
                        d4c.i0(e18Var7, cd4.f, o5bVarD2);
                        d4c.i0(e18Var7, cd4.e, hycVarL4);
                        d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode4));
                        d4c.h0(e18Var7, cd4.h);
                        d4c.i0(e18Var7, cd4.d, iqbVarE4);
                        ez1.a(null, vf2.J, gm3.a(e18Var7).O, e18Var7, 48, 1);
                        e18Var7.p(true);
                        e18Var7.p(false);
                    } else {
                        e18Var7.a0(-100397144);
                        FillElement fillElement3 = b.c;
                        o5b o5bVarD3 = dw1.d(xo1Var, false);
                        int iHashCode5 = Long.hashCode(e18Var7.T);
                        hyc hycVarL5 = e18Var7.l();
                        iqb iqbVarE5 = kxk.E(e18Var7, fillElement3);
                        dd4.e.getClass();
                        re4 re4Var4 = cd4.b;
                        e18Var7.e0();
                        if (e18Var7.S) {
                            e18Var7.k(re4Var4);
                        } else {
                            e18Var7.n0();
                        }
                        d4c.i0(e18Var7, cd4.f, o5bVarD3);
                        d4c.i0(e18Var7, cd4.e, hycVarL5);
                        d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode5));
                        d4c.h0(e18Var7, cd4.h);
                        d4c.i0(e18Var7, cd4.d, iqbVarE5);
                        pvj.c(npk.a, fd9.q0(-1437757472, new sxa(zy7Var13, 6, z ? (byte) 1 : (byte) 0), e18Var7), null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var7, 54, 28);
                        e18Var7.p(true);
                        e18Var7.p(false);
                    }
                }
                break;
            case 7:
                ud0 ud0Var = (ud0) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                dxe dxeVar2 = (dxe) obj;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                dxeVar2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= ((e18) ld4Var8).f(dxeVar2) ? 4 : 2;
                }
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    e18Var8.T();
                } else {
                    ud0 ud0Var2 = ud0.d;
                    cv8.b(a.a(ud0Var, e18Var8), null, b.o(fqbVar2, 24.0f), gm3.a(e18Var8).N, e18Var8, 440, 0);
                    iqb iqbVarA = dxeVar2.a(fqbVar2, 1.0f, true);
                    q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var8, 0);
                    int iHashCode6 = Long.hashCode(e18Var8.T);
                    hyc hycVarL6 = e18Var8.l();
                    iqb iqbVarE6 = kxk.E(e18Var8, iqbVarA);
                    dd4.e.getClass();
                    re4 re4Var5 = cd4.b;
                    e18Var8.e0();
                    if (e18Var8.S) {
                        e18Var8.k(re4Var5);
                    } else {
                        e18Var8.n0();
                    }
                    d4c.i0(e18Var8, cd4.f, q64VarA2);
                    d4c.i0(e18Var8, cd4.e, hycVarL6);
                    d4c.i0(e18Var8, cd4.g, Integer.valueOf(iHashCode6));
                    d4c.h0(e18Var8, cd4.h);
                    d4c.i0(e18Var8, cd4.d, iqbVarE6);
                    tjh.b(str3, null, gm3.a(e18Var8).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var8).e.E).g, e18Var8, 0, 0, 131066);
                    tjh.b(str4, null, gm3.a(e18Var8).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var8).e.E).i, e18Var8, 0, 0, 131066);
                    e18Var8.p(true);
                    if (!z) {
                        e18Var8.a0(-241572909);
                        tjh.b(d4c.j0(R.string.onboarding_v2_permission_enable, e18Var8), null, gm3.a(e18Var8).c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var8).e.E).j, e18Var8, 0, 0, 131066);
                        e18Var8.p(false);
                    } else {
                        e18Var8.a0(-241888303);
                        cv8.b(a.a(ud0.N, e18Var8), d4c.j0(R.string.onboarding_v2_permission_enabled_a11y, e18Var8), b.o(fqbVar2, 20.0f), gm3.a(e18Var8).c, e18Var8, 392, 0);
                        e18Var8.p(false);
                    }
                }
                break;
            case 8:
                fti ftiVar = (fti) obj5;
                bt7 bt7Var = (bt7) obj4;
                zy7 zy7Var14 = (zy7) obj6;
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    e18Var9.T();
                } else {
                    String str5 = (String) ftiVar.k.getValue();
                    boolean zF8 = e18Var9.f(ftiVar);
                    Object objN9 = e18Var9.N();
                    if (zF8 || objN9 == lz1Var) {
                        objN9 = new pac(1, ftiVar, fti.class, "updateCodeInput", "updateCodeInput(Ljava/lang/String;)V", 0, 12);
                        e18Var9.k0(objN9);
                    }
                    zh4.e(str5, (bz7) ((jm9) objN9), d4c.j0(R.string.verification_flow_phone_code_verify_placeholder, e18Var9), iv1.s(gb9.L(b.c(fqbVar2, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), bt7Var), false, null, null, null, new mp9(z ? 1 : 0, 3, z ? 1 : 0, 123), null, 0L, null, 0, e18Var9, 805306368, 15856);
                    csg.j(zy7Var14, gb9.L(b.c(fqbVar2, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), !z, null, null, null, null, urk.b, e18Var9, 805306368, 504);
                }
                break;
            case 9:
                iqb iqbVar2 = (iqb) obj6;
                lod lodVar = (lod) obj5;
                znd zndVar = (znd) obj4;
                mnc mncVar3 = (mnc) obj;
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                mncVar3.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= ((e18) ld4Var10).f(mncVar3) ? 4 : 2;
                }
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    e18Var10.T();
                } else {
                    iqb iqbVarL = gb9.L(gb9.I(iqbVar2, mncVar3).B(b.c), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    q64 q64VarA3 = p64.a(eo0Var, lja.S, e18Var10, 0);
                    int iHashCode7 = Long.hashCode(e18Var10.T);
                    hyc hycVarL7 = e18Var10.l();
                    iqb iqbVarE7 = kxk.E(e18Var10, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var6 = cd4.b;
                    e18Var10.e0();
                    if (e18Var10.S) {
                        e18Var10.k(re4Var6);
                    } else {
                        e18Var10.n0();
                    }
                    d4c.i0(e18Var10, cd4.f, q64VarA3);
                    d4c.i0(e18Var10, cd4.e, hycVarL7);
                    d4c.i0(e18Var10, cd4.g, Integer.valueOf(iHashCode7));
                    d4c.h0(e18Var10, cd4.h);
                    d4c.i0(e18Var10, cd4.d, iqbVarE7);
                    fqb fqbVar3 = fqb.E;
                    boolean z3 = this.F;
                    if (z3) {
                        f = 16.0f;
                        fqbVar = fqbVar3;
                        e18Var10.a0(-966288470);
                        e18Var10.p(false);
                    } else {
                        e18Var10.a0(-966568555);
                        Project project = (Project) lodVar.j.getValue();
                        if (project == null || (name = project.getName()) == null) {
                            name = "";
                        }
                        fqbVar = fqbVar3;
                        f = 16.0f;
                        tjh.b(name, gb9.N(fqbVar3, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 24.0f, 5), gm3.a(e18Var10).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var10).e.E).b, e18Var10, 48, 0, 131064);
                        e18Var10.p(false);
                    }
                    qik.d(lodVar, z3, zndVar, lodVar.O() == tji.E, e18Var10, 512);
                    kxk.g(e18Var10, b.e(fqbVar, f));
                    wp6 wp6VarE = gp6.e(kxk.N(600, 300, null, 4), 2);
                    z8i z8iVarN = kxk.N(600, 300, null, 4);
                    Object objN10 = e18Var10.N();
                    if (objN10 == lz1Var) {
                        objN10 = new f7d(i2);
                        e18Var10.k0(objN10);
                    }
                    wd6.H(s64.a, lodVar.O() == tji.F, null, wp6VarE.a(gp6.m(z8iVarN, (bz7) objN10)), gp6.f(null, 3), null, fd9.q0(484932848, new z85(zndVar, i), e18Var10), e18Var10, 1597446, 18);
                    e18Var10.p(true);
                }
                break;
            default:
                zy7 zy7Var15 = (zy7) obj6;
                zy7 zy7Var16 = (zy7) obj5;
                nwb nwbVar2 = (nwb) obj4;
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    e18Var11.T();
                } else {
                    boolean zF9 = e18Var11.f(zy7Var15);
                    Object objN11 = e18Var11.N();
                    if (zF9 || objN11 == lz1Var) {
                        objN11 = new pn(zy7Var15, nwbVar2, 23);
                        e18Var11.k0(objN11);
                    }
                    t30.b(zsk.a, (zy7) objN11, null, zsk.b, null, false, null, null, e18Var11, 3078, 500);
                    if (!z) {
                        e18Var11.a0(217753950);
                        e18Var11.p(false);
                    } else {
                        e18Var11.a0(217194648);
                        boolean zF10 = e18Var11.f(zy7Var16);
                        Object objN12 = e18Var11.N();
                        if (zF10 || objN12 == lz1Var) {
                            objN12 = new pn(zy7Var16, nwbVar2, 24);
                            e18Var11.k0(objN12);
                        }
                        t30.b(zsk.c, (zy7) objN12, null, zsk.d, null, false, null, null, e18Var11, 3078, 500);
                        e18Var11.p(false);
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qe(nwb nwbVar, mnc mncVar, oz3 oz3Var, boolean z) {
        this.E = 2;
        this.G = nwbVar;
        this.H = mncVar;
        this.I = oz3Var;
        this.F = z;
    }

    public /* synthetic */ qe(Object obj, Object obj2, boolean z, zy7 zy7Var, int i) {
        this.E = i;
        this.H = obj;
        this.I = obj2;
        this.F = z;
        this.G = zy7Var;
    }

    public /* synthetic */ qe(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.E = i;
        this.G = obj;
        this.F = z;
        this.H = obj2;
        this.I = obj3;
    }

    public /* synthetic */ qe(Object obj, boolean z, zy7 zy7Var, Object obj2, int i) {
        this.E = i;
        this.H = obj;
        this.F = z;
        this.G = zy7Var;
        this.I = obj2;
    }
}
