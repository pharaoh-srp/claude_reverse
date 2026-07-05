package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.ReadAloudEvents$MobileReadAloudTrackRecovered;
import com.anthropic.claude.api.chat.tool.ResearchStatus;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.api.tasks.TaskStepResponse;
import com.anthropic.claude.chat.parse.MemoryToolSummary;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.tasks.ui.y;
import com.anthropic.claude.tool.model.TimerCreateV0Input;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResult;
import com.anthropic.claude.tool.ui.chat.f;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u3e implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ u3e(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        String str = (String) this.F;
        UserLocationV0OutputUserLocationResult userLocationV0OutputUserLocationResult = (UserLocationV0OutputUserLocationResult) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((s64) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            wo1 wo1Var = lja.P;
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(b.c(fqbVar, 1.0f), 16.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            e18Var.a0(80088377);
            cv8.b(a.a(ud0.G0, e18Var), null, b.o(fqbVar, 20.0f), gm3.a(e18Var).j, e18Var, 440, 0);
            kxk.g(e18Var, b.t(fqbVar, 4.0f));
            hw9 hw9Var = new hw9(1.0f, true);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(d4c.j0(R.string.user_locate_tool_status_check_success, e18Var), null, 0L, eve.B(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 24576, 0, 131054);
            kxk.g(e18Var, b.e(fqbVar, 16.0f));
            tjh.b(d4c.k0(R.string.user_locate_tool_location_text, new Object[]{str}, e18Var), null, 0L, eve.B(21), null, dv7.O, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 1597440, 0, 130990);
            e18 e18Var2 = e18Var;
            e18Var2.p(true);
            kxk.g(e18Var2, b.t(fqbVar, 16.0f));
            if (((Boolean) e18Var2.j(p59.a)).booleanValue()) {
                e18Var2.a0(80979595);
                ykk.e(ez1.t(xn5.V(b.o(fqbVar, 100.0f), gm3.b(e18Var2).e), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).u, gm3.b(e18Var2).e), e18Var2, 0);
                e18Var2.p(false);
            } else {
                e18Var2.a0(81315945);
                e18Var2.p(false);
                ymi ymiVar = new ymi(2, userLocationV0OutputUserLocationResult);
                e18Var2.a0(-1911106014);
                ka2 ka2Var = (ka2) iuj.J(new Object[0], ka2.h, new o4(8, ymiVar), e18Var2, 0);
                e18Var2.p(false);
                gta gtaVar = new gta(false, false, 2);
                iqb iqbVarT = ez1.t(xn5.V(b.o(fqbVar, 100.0f), gm3.b(e18Var2).e), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).u, gm3.b(e18Var2).e);
                Object objN = e18Var2.N();
                if (objN == jd4.a) {
                    objN = new kdi(16);
                    e18Var2.k0(objN);
                }
                dqk.b(iqbVarT, ka2Var, (zy7) objN, null, gtaVar, null, null, null, fd9.q0(-241600609, new jsg(9, userLocationV0OutputUserLocationResult), e18Var2), e18Var2, 24576, 12582912, 130922);
                e18Var2 = e18Var2;
            }
            e18Var2.p(false);
            e18Var2.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        pz7 pz7Var = (pz7) this.F;
        mnc mncVar = (mnc) this.G;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((px9) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            owj.b((String) pz7Var.invoke(e18Var, 0), b.c(fqb.E, 1.0f), 0L, null, mncVar, e18Var, 48, 12);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z8i z8iVar;
        int i;
        long j;
        boolean z;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = this.E;
        eo0 eo0Var = ko0.c;
        fqb fqbVar = fqb.E;
        int i3 = 18;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj4 = this.G;
        Object obj5 = this.F;
        switch (i2) {
            case 0:
                vxc vxcVar = (vxc) obj5;
                bz7 bz7Var = (bz7) obj4;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    yjk.f(d4c.j0(R.string.permission_dialog_allow_read_access, e18Var), vxcVar.d, bz7Var, b.c(fqbVar, 1.0f), e18Var, 3072);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                boolean z5 = false;
                List list = (List) obj5;
                uje ujeVar = (uje) obj4;
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(i4gVar) ? 4 : 2;
                }
                if ((iIntValue2 & 19) != 18) {
                    z5 = true;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, z5)) {
                    int i4 = iIntValue2;
                    mdg mdgVar = ujeVar.h;
                    boolean zF = e18Var2.f(ujeVar);
                    Object objN = e18Var2.N();
                    if (zF || objN == lz1Var) {
                        objN = new ska(i3, ujeVar);
                        e18Var2.k0(objN);
                    }
                    f.b(list, mdgVar, (pz7) objN, i4gVar, e18Var2, (i4 << 9) & 7168);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                nwb nwbVar = (nwb) obj5;
                j9f j9fVar = (j9f) obj4;
                i4g i4gVar2 = (i4g) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                i4gVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(i4gVar2) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    jme jmeVar = (jme) nwbVar.getValue();
                    if (jmeVar == null) {
                        e18Var3.a0(216308866);
                        e18Var3.p(false);
                    } else {
                        ResearchStatus researchStatus = jmeVar.f;
                        e18Var3.a0(216308867);
                        boolean z6 = researchStatus == ResearchStatus.SEARCHING || jmeVar.c > 0;
                        boolean z7 = researchStatus == ResearchStatus.COMPLETED || researchStatus == ResearchStatus.CREATING_ARTIFACT;
                        if (z7) {
                            e18Var3.a0(-71733954);
                            boolean zF2 = e18Var3.f(j9fVar);
                            Object objN2 = e18Var3.N();
                            if (zF2 || objN2 == lz1Var) {
                                z8iVar = null;
                                objN2 = new ac8(j9fVar, false ? 1 : 0, 1);
                                e18Var3.k0(objN2);
                            } else {
                                z8iVar = null;
                            }
                            fd9.i(e18Var3, (pz7) objN2, z8iVar);
                            i = 0;
                            e18Var3.p(false);
                        } else {
                            z8iVar = null;
                            i = 0;
                            e18Var3.a0(-71597492);
                            e18Var3.p(false);
                        }
                        iqb iqbVarI = gb9.i(ttj.m(mpk.b0(b.c, j9fVar, true), i4gVar2), z8iVar, 3);
                        q64 q64VarA = p64.a(eo0Var, lja.S, e18Var3, i);
                        int iHashCode = Long.hashCode(e18Var3.T);
                        hyc hycVarL = e18Var3.l();
                        iqb iqbVarE = kxk.E(e18Var3, iqbVarI);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var3.e0();
                        if (e18Var3.S) {
                            e18Var3.k(re4Var);
                        } else {
                            e18Var3.n0();
                        }
                        d4c.i0(e18Var3, cd4.f, q64VarA);
                        d4c.i0(e18Var3, cd4.e, hycVarL);
                        d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                        d4c.h0(e18Var3, cd4.h);
                        d4c.i0(e18Var3, cd4.d, iqbVarE);
                        boolean z8 = !z6;
                        if (z6) {
                            e18Var3.a0(1251722414);
                            j = gm3.a(e18Var3).v;
                            e18Var3.p(false);
                        } else {
                            e18Var3.a0(1251629290);
                            j = gm3.a(e18Var3).c;
                            e18Var3.p(false);
                        }
                        rqh rqhVar = rqh.E;
                        rqh rqhVar2 = rqh.F;
                        rsk.d(fd9.q0(-744669224, new tp(z6, 10), e18Var3), false, z8, null, null, new pqh(j, !z6 ? rqhVar2 : rqhVar, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var3, 54, 984);
                        if (z6) {
                            e18Var3.a0(1252860641);
                            boolean z9 = !z7;
                            if (z7) {
                                e18Var3.a0(1253124358);
                                j3 = gm3.a(e18Var3).v;
                                e18Var3.p(false);
                            } else {
                                e18Var3.a0(1253023298);
                                j3 = gm3.a(e18Var3).c;
                                e18Var3.p(false);
                            }
                            rsk.d(fd9.q0(1212371997, new vke(z7, jmeVar), e18Var3), true, z9, null, null, new pqh(j3, !z7 ? rqhVar2 : rqhVar, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(-326308634, new tke(jmeVar, 1), e18Var3), e18Var3, 805306422, 472);
                            e18Var3.p(false);
                        } else {
                            e18Var3.a0(1255124354);
                            e18Var3.p(false);
                        }
                        if (z7) {
                            e18Var3.a0(1255204644);
                            boolean z10 = researchStatus == ResearchStatus.CREATING_ARTIFACT;
                            if (z10) {
                                e18Var3.a0(1255521154);
                                j2 = gm3.a(e18Var3).c;
                                e18Var3.p(false);
                            } else {
                                e18Var3.a0(1255622214);
                                j2 = gm3.a(e18Var3).v;
                                e18Var3.p(false);
                            }
                            if (z10) {
                                rqhVar = rqhVar2;
                            }
                            rsk.d(fd9.q0(63444934, new tke(jmeVar, 2), e18Var3), false, true, null, null, new pqh(j2, rqhVar, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var3, 438, 984);
                            z = false;
                            e18Var3.p(false);
                        } else {
                            z = false;
                            e18Var3.a0(1256801826);
                            e18Var3.p(false);
                        }
                        e18Var3.p(true);
                        e18Var3.p(z);
                    }
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 3:
                Context context = (Context) obj5;
                wxc wxcVar = (wxc) obj4;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var4, 0);
                    int iHashCode2 = Long.hashCode(e18Var4.T);
                    hyc hycVarL2 = e18Var4.l();
                    iqb iqbVarE2 = kxk.E(e18Var4, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var2);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, q64VarA2);
                    d4c.i0(e18Var4, cd4.e, hycVarL2);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE2);
                    kxk.g(e18Var4, b.e(fqbVar, 8.0f));
                    boolean zH = e18Var4.h(context) | e18Var4.f(wxcVar);
                    Object objN3 = e18Var4.N();
                    if (zH || objN3 == lz1Var) {
                        objN3 = new pxc(context, wxcVar, 3);
                        e18Var4.k0(objN3);
                    }
                    aok.a(0, e18Var4, (zy7) objN3, null, null);
                    e18Var4.p(true);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 4:
                int[] iArr = (int[]) obj5;
                boolean[] zArr = (boolean[]) obj4;
                q5b q5bVar = (q5b) obj;
                h5b h5bVar = (h5b) obj2;
                q5bVar.getClass();
                h5bVar.getClass();
                long j4 = ((rl4) obj3).a;
                iArr[0] = rl4.d(j4) ? rl4.h(j4) : Integer.MAX_VALUE;
                c3d c3dVarU = h5bVar.u(j4);
                return q5bVar.U(c3dVarU.E, c3dVarU.F + (zArr[0] ? q5bVar.M0(8.0f) : 0), nm6.E, new b1(c3dVarU, 19));
            case 5:
                i4g i4gVar3 = (i4g) obj5;
                pz7 pz7Var = (pz7) obj4;
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarN = gb9.N(gb9.I(b.c(fqbVar, 1.0f), i4gVar3.a), MTTypesetterKt.kLineSkipLimitMultiplier, 48.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode3 = Long.hashCode(e18Var5.T);
                    hyc hycVarL3 = e18Var5.l();
                    iqb iqbVarE3 = kxk.E(e18Var5, iqbVarN);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var3);
                    } else {
                        e18Var5.n0();
                    }
                    d4c.i0(e18Var5, cd4.f, o5bVarD);
                    d4c.i0(e18Var5, cd4.e, hycVarL3);
                    d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var5, cd4.h);
                    d4c.i0(e18Var5, cd4.d, iqbVarE3);
                    sq6.B(0, pz7Var, e18Var5, true);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 6:
                sz7 sz7Var = (sz7) obj5;
                nwb nwbVar2 = (nwb) obj4;
                s64 s64Var = (s64) obj;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                s64Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= ((e18) ld4Var6).f(s64Var) ? 4 : 2;
                }
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    boolean zF3 = e18Var6.f(nwbVar2);
                    Object objN4 = e18Var6.N();
                    if (zF3 || objN4 == lz1Var) {
                        objN4 = new k3c(28, nwbVar2);
                        e18Var6.k0(objN4);
                    }
                    sz7Var.i(s64Var, (zy7) objN4, e18Var6, Integer.valueOf(iIntValue6 & 14));
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 7:
                zy7 zy7Var = (zy7) obj5;
                bz7 bz7Var2 = (bz7) obj4;
                ((Integer) obj3).getClass();
                e18 e18Var7 = (e18) ((ld4) obj2);
                e18Var7.a0(759876635);
                Object objN5 = e18Var7.N();
                Object obj6 = objN5;
                if (objN5 == lz1Var) {
                    wz5 wz5VarW = mpk.w(zy7Var);
                    e18Var7.k0(wz5VarW);
                    obj6 = wz5VarW;
                }
                wlg wlgVar = (wlg) obj6;
                Object objN6 = e18Var7.N();
                Object obj7 = objN6;
                if (objN6 == lz1Var) {
                    a80 a80Var = new a80(new fcc(((fcc) wlgVar.getValue()).a), kif.b, new fcc(kif.c), 8);
                    e18Var7.k0(a80Var);
                    obj7 = a80Var;
                }
                a80 a80Var2 = (a80) obj7;
                boolean zH2 = e18Var7.h(a80Var2);
                Object objN7 = e18Var7.N();
                Object obj8 = objN7;
                if (zH2 || objN7 == lz1Var) {
                    ba9 ba9Var = new ba9(wlgVar, a80Var2, null, 20);
                    e18Var7.k0(ba9Var);
                    obj8 = ba9Var;
                }
                fd9.i(e18Var7, (pz7) obj8, ieiVar);
                nb0 nb0Var = a80Var2.c;
                boolean zF4 = e18Var7.f(nb0Var);
                Object objN8 = e18Var7.N();
                if (zF4 || objN8 == lz1Var) {
                    objN8 = new cnb(nb0Var, 3);
                    e18Var7.k0(objN8);
                }
                iqb iqbVar = (iqb) bz7Var2.invoke((zy7) objN8);
                e18Var7.p(false);
                return iqbVar;
            case 8:
                s2g s2gVar = (s2g) obj5;
                bz7 bz7Var3 = (bz7) obj4;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= ((e18) ld4Var7).f(mncVar) ? 4 : 2;
                }
                e18 e18Var8 = (e18) ld4Var7;
                if (e18Var8.Q(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    vt6 vt6Var = (vt6) s2gVar.j.getValue();
                    xo1 xo1Var2 = lja.K;
                    iqb iqbVarI2 = gb9.I(b.c, mncVar);
                    o5b o5bVarD2 = dw1.d(xo1Var2, false);
                    int iHashCode4 = Long.hashCode(e18Var8.T);
                    hyc hycVarL4 = e18Var8.l();
                    iqb iqbVarE4 = kxk.E(e18Var8, iqbVarI2);
                    dd4.e.getClass();
                    re4 re4Var4 = cd4.b;
                    e18Var8.e0();
                    if (e18Var8.S) {
                        e18Var8.k(re4Var4);
                    } else {
                        e18Var8.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var8, z80Var, o5bVarD2);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var8, z80Var2, hycVarL4);
                    Integer numValueOf = Integer.valueOf(iHashCode4);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var8, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var8, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var8, z80Var4, iqbVarE4);
                    if (((Boolean) s2gVar.i.getValue()).booleanValue()) {
                        e18Var8.a0(-1602098123);
                        ez1.a(null, vf2.J, 0L, e18Var8, 48, 5);
                        e18Var8.p(false);
                    } else if (vt6Var != null) {
                        e18Var8.a0(-1601951338);
                        qnc qncVar = j9a.a;
                        iqb iqbVarL = gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                        boolean zF5 = e18Var8.f(s2gVar);
                        Object objN9 = e18Var8.N();
                        if (zF5 || objN9 == lz1Var) {
                            objN9 = new q2g(s2gVar, 1);
                            e18Var8.k0(objN9);
                        }
                        uik.c(vt6Var, iqbVarL, null, null, (zy7) objN9, e18Var8, 0, 12);
                        e18Var8.p(false);
                    } else {
                        e18Var8.a0(-1601621467);
                        if (((List) s2gVar.k.getValue()).isEmpty()) {
                            e18Var8.a0(-1601543905);
                            vo1 vo1Var = lja.T;
                            iqb iqbVarL2 = gb9.L(fqbVar, 32.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                            q64 q64VarA3 = p64.a(eo0Var, vo1Var, e18Var8, 48);
                            int iHashCode5 = Long.hashCode(e18Var8.T);
                            hyc hycVarL5 = e18Var8.l();
                            iqb iqbVarE5 = kxk.E(e18Var8, iqbVarL2);
                            e18Var8.e0();
                            if (e18Var8.S) {
                                e18Var8.k(re4Var4);
                            } else {
                                e18Var8.n0();
                            }
                            d4c.i0(e18Var8, z80Var, q64VarA3);
                            d4c.i0(e18Var8, z80Var2, hycVarL5);
                            ij0.t(iHashCode5, e18Var8, z80Var3, e18Var8, bxVar);
                            d4c.i0(e18Var8, z80Var4, iqbVarE5);
                            iqb iqbVarP = yfd.p(xn5.V(b.o(fqbVar, 48.0f), xve.b(24.0f)), gm3.a(e18Var8).q, zni.b);
                            o5b o5bVarD3 = dw1.d(xo1Var2, false);
                            int iHashCode6 = Long.hashCode(e18Var8.T);
                            hyc hycVarL6 = e18Var8.l();
                            iqb iqbVarE6 = kxk.E(e18Var8, iqbVarP);
                            e18Var8.e0();
                            if (e18Var8.S) {
                                e18Var8.k(re4Var4);
                            } else {
                                e18Var8.n0();
                            }
                            d4c.i0(e18Var8, z80Var, o5bVarD3);
                            d4c.i0(e18Var8, z80Var2, hycVarL6);
                            ij0.t(iHashCode6, e18Var8, z80Var3, e18Var8, bxVar);
                            d4c.i0(e18Var8, z80Var4, iqbVarE6);
                            cv8.b(a.a(ud0.F0, e18Var8), null, b.o(fqbVar, 20.0f), gm3.a(e18Var8).O, e18Var8, 440, 0);
                            e18Var8.p(true);
                            kxk.g(e18Var8, b.e(fqbVar, 16.0f));
                            tjh.b(d4c.j0(R.string.shared_links_null_state_description, e18Var8), null, gm3.a(e18Var8).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var8).e.E).e, e18Var8, 0, 0, 130042);
                            z2 = true;
                            e18Var8.p(true);
                            z3 = false;
                            e18Var8.p(false);
                        } else {
                            z2 = true;
                            z3 = false;
                            e18Var8.a0(-1600148812);
                            etj.j(s2gVar, bz7Var3, e18Var8, 0);
                            e18Var8.p(false);
                        }
                        e18Var8.p(z3);
                        e18Var8.p(z2);
                    }
                    z2 = true;
                    e18Var8.p(z2);
                } else {
                    e18Var8.T();
                }
                return ieiVar;
            case 9:
                pz7 pz7Var2 = (pz7) obj5;
                ta4 ta4Var = (ta4) obj4;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var9 = (e18) ld4Var8;
                if (e18Var9.Q(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    if (pz7Var2 == null) {
                        e18Var9.a0(-1356347136);
                        z4 = false;
                    } else {
                        z4 = false;
                        e18Var9.a0(-1706321119);
                        pz7Var2.invoke(e18Var9, 0);
                    }
                    e18Var9.p(z4);
                    ta4Var.invoke(e18Var9, 0);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            case 10:
                ((com.anthropic.claude.bell.tts.f) obj5).d.e(new ReadAloudEvents$MobileReadAloudTrackRecovered((String) obj4, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue()), ReadAloudEvents$MobileReadAloudTrackRecovered.Companion.serializer());
                return ieiVar;
            case 11:
                TaskResponse taskResponse = (TaskResponse) obj5;
                e8h e8hVar = (e8h) obj4;
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var10 = (e18) ld4Var9;
                if (e18Var10.Q(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    p5h.e(taskResponse, (z7h) e8hVar.d.getValue(), e18Var10, 0);
                    kxk.g(e18Var10, b.e(fqbVar, 16.0f));
                } else {
                    e18Var10.T();
                }
                return ieiVar;
            case 12:
                nwb nwbVar3 = (nwb) obj5;
                wlg wlgVar2 = (wlg) obj4;
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var11 = (e18) ld4Var10;
                if (e18Var11.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    List list2 = (List) wlgVar2.getValue();
                    boolean zBooleanValue = ((Boolean) nwbVar3.getValue()).booleanValue();
                    boolean zF6 = e18Var11.f(nwbVar3);
                    Object objN10 = e18Var11.N();
                    if (zF6 || objN10 == lz1Var) {
                        objN10 = new lxf(11, nwbVar3);
                        e18Var11.k0(objN10);
                    }
                    p5h.c(list2, zBooleanValue, (zy7) objN10, e18Var11, 0);
                } else {
                    e18Var11.T();
                }
                return ieiVar;
            case 13:
                TaskResponse taskResponse2 = (TaskResponse) obj5;
                TaskStepResponse taskStepResponse = (TaskStepResponse) obj4;
                i4g i4gVar4 = (i4g) obj;
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                i4gVar4.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= ((e18) ld4Var11).f(i4gVar4) ? 4 : 2;
                }
                e18 e18Var12 = (e18) ld4Var11;
                if (e18Var12.Q(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    w8h.c(taskResponse2.m450getUuidFxcw9s(), taskStepResponse, null, i4gVar4.b(), null, e18Var12, 0);
                } else {
                    e18Var12.T();
                }
                return ieiVar;
            case 14:
                aah aahVar = (aah) obj5;
                t4g t4gVar = (t4g) obj4;
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var13 = (e18) ld4Var12;
                if (e18Var13.Q(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    wz5 wz5Var = aahVar.e;
                    lsc lscVar = aahVar.g;
                    kah kahVar = aahVar.b;
                    Map map = (Map) wz5Var.getValue();
                    boolean z11 = ((Boolean) aahVar.f.getValue()).booleanValue() && ((uah) kahVar).h().isEmpty();
                    boolean z12 = ((uah) kahVar).h().isEmpty() && !((Boolean) lscVar.getValue()).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) lscVar.getValue()).booleanValue();
                    int iH = aahVar.j.h();
                    boolean zH3 = e18Var13.h(aahVar);
                    Object objN11 = e18Var13.N();
                    if (zH3 || objN11 == lz1Var) {
                        ogf ogfVar = new ogf(0, aahVar, aah.class, "loadMore", "loadMore()V", 0, 8);
                        e18Var13.k0(ogfVar);
                        objN11 = ogfVar;
                    }
                    zy7 zy7Var2 = (zy7) ((jm9) objN11);
                    boolean zH4 = e18Var13.h(t4gVar);
                    Object objN12 = e18Var13.N();
                    if (zH4 || objN12 == lz1Var) {
                        objN12 = new k03(t4gVar, 11);
                        e18Var13.k0(objN12);
                    }
                    y.a(map, z11, z12, zBooleanValue2, iH, zy7Var2, (bz7) objN12, null, e18Var13, 0);
                } else {
                    e18Var13.T();
                }
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                crh crhVar = (crh) obj5;
                TimerCreateV0Input timerCreateV0Input = (TimerCreateV0Input) obj4;
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((mnc) obj).getClass();
                e18 e18Var14 = (e18) ld4Var13;
                if (e18Var14.Q(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    puk.c(crhVar.g, timerCreateV0Input, null, e18Var14, 0);
                } else {
                    e18Var14.T();
                }
                return ieiVar;
            case 16:
                MemoryToolSummary memoryToolSummary = (MemoryToolSummary) obj5;
                mnc mncVar2 = (mnc) obj4;
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var15 = (e18) ld4Var14;
                if (e18Var15.Q(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    stk.b(memoryToolSummary, mncVar2, null, e18Var15, 0);
                } else {
                    e18Var15.T();
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                mnc mncVar3 = (mnc) obj5;
                zli zliVar = (zli) obj4;
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((mw1) obj).getClass();
                e18 e18Var16 = (e18) ld4Var15;
                if (e18Var16.Q(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    iqb iqbVarI3 = gb9.I(mpk.b0(b.c, mpk.Y(e18Var16), true), mncVar3);
                    q64 q64VarA4 = p64.a(eo0Var, lja.S, e18Var16, 0);
                    int iHashCode7 = Long.hashCode(e18Var16.T);
                    hyc hycVarL7 = e18Var16.l();
                    iqb iqbVarE7 = kxk.E(e18Var16, iqbVarI3);
                    dd4.e.getClass();
                    re4 re4Var5 = cd4.b;
                    e18Var16.e0();
                    if (e18Var16.S) {
                        e18Var16.k(re4Var5);
                    } else {
                        e18Var16.n0();
                    }
                    z80 z80Var5 = cd4.f;
                    d4c.i0(e18Var16, z80Var5, q64VarA4);
                    z80 z80Var6 = cd4.e;
                    d4c.i0(e18Var16, z80Var6, hycVarL7);
                    Integer numValueOf2 = Integer.valueOf(iHashCode7);
                    z80 z80Var7 = cd4.g;
                    d4c.i0(e18Var16, z80Var7, numValueOf2);
                    bx bxVar2 = cd4.h;
                    d4c.h0(e18Var16, bxVar2);
                    z80 z80Var8 = cd4.d;
                    d4c.i0(e18Var16, z80Var8, iqbVarE7);
                    lsc lscVar2 = zliVar.f;
                    lsc lscVar3 = zliVar.k;
                    lsc lscVar4 = zliVar.j;
                    lsc lscVar5 = zliVar.i;
                    if (((Boolean) lscVar2.getValue()).booleanValue()) {
                        e18Var16.a0(-1465819416);
                        xo1 xo1Var3 = lja.K;
                        iqb iqbVarL3 = gb9.L(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 48.0f, 1);
                        o5b o5bVarD4 = dw1.d(xo1Var3, false);
                        int iHashCode8 = Long.hashCode(e18Var16.T);
                        hyc hycVarL8 = e18Var16.l();
                        iqb iqbVarE8 = kxk.E(e18Var16, iqbVarL3);
                        e18Var16.e0();
                        if (e18Var16.S) {
                            e18Var16.k(re4Var5);
                        } else {
                            e18Var16.n0();
                        }
                        d4c.i0(e18Var16, z80Var5, o5bVarD4);
                        d4c.i0(e18Var16, z80Var6, hycVarL8);
                        ij0.t(iHashCode8, e18Var16, z80Var7, e18Var16, bxVar2);
                        d4c.i0(e18Var16, z80Var8, iqbVarE8);
                        ez1.a(null, vf2.H, 0L, e18Var16, 48, 5);
                        e18Var16.p(true);
                        e18Var16.p(false);
                    } else if (((Boolean) zliVar.h.getValue()).booleanValue() && ((uli) lscVar5.getValue()) == null && ((List) lscVar4.getValue()).isEmpty() && ((ud7) lscVar3.getValue()) == null) {
                        e18Var16.a0(-1465367436);
                        tjh.b(d4c.j0(R.string.usage_load_error, e18Var16), gb9.K(fqbVar, 24.0f, 48.0f), gm3.a(e18Var16).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var16).e.E).i, e18Var16, 48, 0, 131064);
                        e18Var16.p(false);
                    } else if (((uli) lscVar5.getValue()) == null && ((List) lscVar4.getValue()).isEmpty() && ((ud7) lscVar3.getValue()) == null) {
                        e18Var16.a0(-1464943635);
                        tjh.b(d4c.j0(R.string.usage_no_data_available, e18Var16), gb9.K(fqbVar, 24.0f, 48.0f), gm3.a(e18Var16).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var16).e.E).i, e18Var16, 48, 0, 131064);
                        e18Var16.p(false);
                    } else {
                        e18Var16.a0(-1464549284);
                        pqi.e((uli) lscVar5.getValue(), (List) lscVar4.getValue(), (ud7) lscVar3.getValue(), e18Var16, 0);
                        e18Var16.p(false);
                    }
                    e18Var16.p(true);
                } else {
                    e18Var16.T();
                }
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return d(obj, obj2, obj3);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return e(obj, obj2, obj3);
            default:
                l5j l5jVar = (l5j) obj5;
                pl3 pl3Var = (pl3) obj4;
                mnc mncVar4 = (mnc) obj;
                ld4 ld4Var16 = (ld4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                mncVar4.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= ((e18) ld4Var16).f(mncVar4) ? 4 : 2;
                }
                e18 e18Var17 = (e18) ld4Var16;
                if (e18Var17.Q(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    com.anthropic.claude.bell.b.l(l5jVar, pl3Var, gb9.L(gb9.I(mpk.b0(b.c, mpk.Y(e18Var17), true), mncVar4), MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1), null, null, null, e18Var17, 0, 56);
                } else {
                    e18Var17.T();
                }
                return ieiVar;
        }
    }
}
