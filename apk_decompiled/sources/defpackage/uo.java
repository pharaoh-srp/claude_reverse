package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.artifact.details.ArtifactFullScreenParams;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.project.details.custominstructions.d;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uo implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ uo(a80 a80Var, a80 a80Var2, zy7 zy7Var, nwb nwbVar, nwb nwbVar2) {
        this.E = 26;
        this.H = zy7Var;
        this.F = a80Var;
        this.G = a80Var2;
        this.I = nwbVar;
        this.J = nwbVar2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj3 = this.J;
        Object obj4 = this.I;
        Object obj5 = this.H;
        Object obj6 = this.G;
        Object obj7 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fok.a((to) obj7, (SessionResource) obj6, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 1:
                ml3 ml3Var = (ml3) obj7;
                q2i q2iVar = (q2i) obj6;
                lu luVar = (lu) obj5;
                rwe rweVar = (rwe) obj4;
                nwb nwbVar = (nwb) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    boolean zBooleanValue = ((Boolean) luVar.o.getValue()).booleanValue();
                    int size = luVar.Q().size();
                    boolean z = !((List) luVar.A.getValue()).isEmpty() || luVar.w.d().G.length() > 0;
                    by2 by2Var = (by2) luVar.n.getValue();
                    boolean zF = e18Var.f(luVar);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new zu(luVar, z ? 1 : 0);
                        e18Var.k0(objN);
                    }
                    bz7 bz7Var = (bz7) objN;
                    boolean zF2 = e18Var.f(luVar);
                    Object objN2 = e18Var.N();
                    int i2 = 8;
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new gu(luVar, i2);
                        e18Var.k0(objN2);
                    }
                    zy7 zy7Var = (zy7) objN2;
                    boolean zF3 = e18Var.f(luVar);
                    Object objN3 = e18Var.N();
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new gu(luVar, 9);
                        e18Var.k0(objN3);
                    }
                    zy7 zy7Var2 = (zy7) objN3;
                    boolean zH = e18Var.h(rweVar);
                    Object objN4 = e18Var.N();
                    if (zH || objN4 == lz1Var) {
                        objN4 = new av(rweVar, z ? 1 : 0);
                        e18Var.k0(objN4);
                    }
                    zy7 zy7Var3 = (zy7) objN4;
                    Object objN5 = e18Var.N();
                    if (objN5 == lz1Var) {
                        objN5 = new ve(8, nwbVar);
                        e18Var.k0(objN5);
                    }
                    zy7 zy7Var4 = (zy7) objN5;
                    boolean z2 = !luVar.Q().isEmpty();
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    int i3 = ml3.f;
                    dpk.a(ml3Var, q2iVar, zBooleanValue, size, z, by2Var, bz7Var, zy7Var, zy7Var2, zy7Var3, zy7Var4, z2, iqbVarC, null, e18Var, 0);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                gpk.b((gnd) obj7, (List) obj6, (bz7) obj5, (q2i) obj4, (ml3) obj3, (ld4) obj, x44.p0(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ar0.b((ArtifactFullScreenParams) obj7, (t4f) obj6, (xq0) obj4, (zy7) obj5, (iqb) obj3, (ld4) obj, x44.p0(65));
                break;
            case 4:
                isc iscVar = (isc) obj7;
                e8d e8dVar = (e8d) obj6;
                kdg kdgVar = (kdg) obj5;
                hsc hscVar = (hsc) obj4;
                nwb nwbVar2 = (nwb) obj3;
                z7d z7dVar = (z7d) obj;
                z7dVar.getClass();
                z7dVar.a();
                hscVar.i(Float.intBitsToFloat((int) (((fcc) obj2).a & 4294967295L)) + hscVar.h());
                Integer num = (Integer) nwbVar2.getValue();
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    iscVar.getClass();
                    int iE0 = wd6.e0(mwa.L(hscVar.h() / ((((e0h) e8dVar).getDensity() * 8.0f) + iscVar.h())) + iIntValue2, 0, x44.M(kdgVar));
                    if (iE0 != iIntValue2) {
                        kdgVar.add(iE0, kdgVar.remove(iIntValue2));
                        nwbVar2.setValue(Integer.valueOf(iE0));
                        hscVar.i(MTTypesetterKt.kLineSkipLimitMultiplier);
                    }
                }
                break;
            case 5:
                y49 y49Var = (y49) obj7;
                pl3 pl3Var = (pl3) obj6;
                zy7 zy7Var5 = (zy7) obj5;
                zy7 zy7Var6 = (zy7) obj4;
                nwb nwbVar3 = (nwb) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    boolean zBooleanValue2 = ((Boolean) nwbVar3.getValue()).booleanValue();
                    boolean zF4 = e18Var2.f(zy7Var5);
                    Object objN6 = e18Var2.N();
                    if (zF4 || objN6 == lz1Var) {
                        objN6 = new pn(zy7Var5, nwbVar3, 2);
                        e18Var2.k0(objN6);
                    }
                    zy7 zy7Var7 = (zy7) objN6;
                    boolean zF5 = e18Var2.f(zy7Var6);
                    Object objN7 = e18Var2.N();
                    if (zF5 || objN7 == lz1Var) {
                        objN7 = new pn(zy7Var6, nwbVar3, 3);
                        e18Var2.k0(objN7);
                    }
                    jwk.p(zBooleanValue2, y49Var, pl3Var, zy7Var7, (zy7) objN7, null, e18Var2, 64);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                com.anthropic.claude.bell.b.p((MobileAppToolPreviewInfo) obj7, (zy7) obj5, (zy7) obj4, (zy7) obj6, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                idi.b((String) obj7, (zy7) obj5, (iqb) obj3, (ze0) obj6, (qi3) obj4, (ld4) obj, x44.p0(1));
                break;
            case 8:
                hw2 hw2Var = (hw2) obj7;
                wxc wxcVar = (wxc) obj6;
                pl3 pl3Var2 = (pl3) obj5;
                gf8 gf8Var = (gf8) obj4;
                fu9 fu9Var = (fu9) obj3;
                fcc fccVar = (fcc) obj;
                l9e l9eVar = (l9e) obj2;
                l9eVar.getClass();
                if (hw2Var.Z() == null && !hw2Var.f0()) {
                    if (!oq5.I(wxcVar.e())) {
                        wxcVar.f();
                    } else {
                        pl3Var2.d(gf8Var);
                        hw2Var.J = new rv2(hw2Var.D.d().G.toString(), ((List) hw2Var.P.getValue()).size(), (String) hw2Var.F.getValue());
                        hw2Var.M.setValue(new sn8(l9eVar, fccVar.a, fu9Var));
                    }
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                mok.c((ek0) obj7, (bz7) obj6, (iqb) obj3, (oxf) obj5, (mnc) obj4, (ld4) obj, x44.p0(385));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ug4.d((vg4) obj7, (eyh) obj6, (bz7) obj4, (zy7) obj5, (iqb) obj3, (ld4) obj, x44.p0(24577));
                break;
            case 11:
                ((Integer) obj2).getClass();
                hsk.b((List) obj7, (bz7) obj6, (bz7) obj4, (zy7) obj5, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ksk.a((npg) obj7, (hi6) obj6, (String) obj5, (rz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(73));
                break;
            case 13:
                ((Integer) obj2).getClass();
                vsk.b((bz4) obj7, (bz7) obj6, (bz7) obj4, (zy7) obj5, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                ysk.b((f) obj7, (zy7) obj5, (zy7) obj4, (zy7) obj6, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                ctk.a((String) obj7, (String) obj6, (or4) obj5, (w05) obj4, (iqb) obj3, (ld4) obj, x44.p0(4097));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ce5.a((String) obj7, (String) obj6, (String) obj5, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                e0g e0gVar = (e0g) obj7;
                wl5 wl5Var = (wl5) obj6;
                ta4 ta4Var = (ta4) obj5;
                ta4 ta4Var2 = (ta4) obj4;
                pz7 pz7Var = (pz7) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    pzg.a(b.g(b.m(fqbVar, gwk.d), MTTypesetterKt.kLineSkipLimitMultiplier, gwk.b, 1), e0gVar, wl5Var.a, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, null, fd9.q0(1782015378, new f44(ta4Var, ta4Var2, pz7Var, 24), e18Var3), e18Var3, 12582918, 104);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                dn5 dn5Var = (dn5) obj7;
                o72 o72Var = (o72) obj6;
                am5 am5Var = (am5) obj5;
                wl5 wl5Var2 = (wl5) obj4;
                bt7 bt7Var = (bt7) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    Long lB = dn5Var.b();
                    long j = ((u72) dn5Var.e.getValue()).e;
                    int iA = dn5Var.a();
                    boolean zF6 = e18Var4.f(dn5Var);
                    Object objN8 = e18Var4.N();
                    if (zF6 || objN8 == lz1Var) {
                        objN8 = new om5(dn5Var, 1);
                        e18Var4.k0(objN8);
                    }
                    bz7 bz7Var2 = (bz7) objN8;
                    boolean zF7 = e18Var4.f(dn5Var);
                    Object objN9 = e18Var4.N();
                    if (zF7 || objN9 == lz1Var) {
                        objN9 = new om5(dn5Var, 2);
                        e18Var4.k0(objN9);
                    }
                    cn5.k(lB, j, iA, bz7Var2, (bz7) objN9, o72Var, dn5Var.a, am5Var, (xl5) dn5Var.d.getValue(), wl5Var2, bt7Var, e18Var4, 0);
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                RateLimit rateLimit = (RateLimit) obj7;
                r1e r1eVar = (r1e) obj6;
                iwg iwgVar = (iwg) obj4;
                qi3 qi3Var = (qi3) obj3;
                zy7 zy7Var8 = (zy7) obj5;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    h66.t((RateLimit.ExceedsLimit) rateLimit, r1eVar, iwgVar, qi3Var, zy7Var8, 0L, e18Var5, 0);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                jgb jgbVar = (jgb) obj7;
                zy7 zy7Var9 = (zy7) obj5;
                bz7 bz7Var3 = (bz7) obj6;
                zy7 zy7Var10 = (zy7) obj4;
                zy7 zy7Var11 = (zy7) obj3;
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    dgb dgbVar = (dgb) jgbVar;
                    String str = dgbVar.c;
                    String str2 = dgbVar.d;
                    String str3 = dgbVar.e;
                    boolean zF8 = e18Var6.f(bz7Var3) | e18Var6.h(jgbVar);
                    Object objN10 = e18Var6.N();
                    if (zF8 || objN10 == lz1Var) {
                        objN10 = new w95(bz7Var3, 13, jgbVar);
                        e18Var6.k0(objN10);
                    }
                    h66.o(str, str2, zy7Var9, (zy7) objN10, zy7Var10, zy7Var11, str3, false, null, e18Var6, 0, 384);
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                dvj.a((String) obj7, (zy7) obj5, (bz7) obj6, (d) obj4, (qi3) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                lok.a((dk0) obj7, (bz7) obj6, (iqb) obj3, (oxf) obj5, (mnc) obj4, (ld4) obj, x44.p0(385));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                pd8.e((zy7) obj5, (bz7) obj7, (iqb) obj3, (qi3) obj6, (id8) obj4, (ld4) obj, x44.p0(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                tw8.c((ImageGalleryItem) obj7, (String) obj6, (gkj) obj5, (yw8) obj4, (iqb) obj3, (ld4) obj, x44.p0(49));
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).getClass();
                tw8.e((String) obj7, (zy7) obj5, (iqb) obj3, (gw8) obj6, (yw8) obj4, (ld4) obj, x44.p0(385));
                break;
            case 26:
                zy7 zy7Var12 = (zy7) obj5;
                a80 a80Var = (a80) obj7;
                a80 a80Var2 = (a80) obj6;
                nwb nwbVar4 = (nwb) obj4;
                nwb nwbVar5 = (nwb) obj3;
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    xo1 xo1Var = lja.K;
                    boolean zH2 = e18Var7.h(a80Var) | e18Var7.h(a80Var2) | e18Var7.f(zy7Var12) | e18Var7.f(nwbVar4);
                    Object objN11 = e18Var7.N();
                    if (zH2 || objN11 == lz1Var) {
                        objN11 = new p99(a80Var, a80Var2, zy7Var12, nwbVar5, nwbVar4);
                        e18Var7.k0(objN11);
                    }
                    iqb iqbVarJ = gb9.J(a0h.a(fqbVar, zy7Var12, (PointerInputEventHandler) objN11), 16.0f);
                    vve vveVar = xve.a;
                    iqb iqbVarO = b.o(ez1.t(yfd.p(xn5.V(xn5.t0(iqbVarJ, 4.0f, vveVar, 0L, 0L, 28), vveVar), gm3.a(e18Var7).o, zni.b), 1.0f, gm3.a(e18Var7).v, vveVar), 56.0f);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode = Long.hashCode(e18Var7.T);
                    hyc hycVarL = e18Var7.l();
                    iqb iqbVarE = kxk.E(e18Var7, iqbVarO);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var7.e0();
                    if (e18Var7.S) {
                        e18Var7.k(re4Var);
                    } else {
                        e18Var7.n0();
                    }
                    d4c.i0(e18Var7, cd4.f, o5bVarD);
                    d4c.i0(e18Var7, cd4.e, hycVarL);
                    d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var7, cd4.h);
                    d4c.i0(e18Var7, cd4.d, iqbVarE);
                    cv8.b(a.a(ud0.g, e18Var7), null, b.o(fqbVar, 28.0f), gm3.a(e18Var7).M, e18Var7, 440, 0);
                    e18Var7.p(true);
                }
                break;
            case 27:
                ((Integer) obj2).getClass();
                qbb.c((zy7) obj5, (bz7) obj7, (iqb) obj3, (pbb) obj6, (qi3) obj4, (ld4) obj, x44.p0(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                vuk.c((zy7) obj5, (c9c) obj7, (b1i) obj6, (ole) obj4, (i8c) obj3, (ld4) obj, x44.p0(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ntj.a((bpc) obj7, (vxc) obj6, (zy7) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(24585));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ uo(zy7 zy7Var, bz7 bz7Var, iqb iqbVar, Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.H = zy7Var;
        this.F = bz7Var;
        this.J = iqbVar;
        this.G = obj;
        this.I = obj2;
    }

    public /* synthetic */ uo(zy7 zy7Var, c9c c9cVar, b1i b1iVar, ole oleVar, i8c i8cVar, int i) {
        this.E = 28;
        this.H = zy7Var;
        this.F = c9cVar;
        this.G = b1iVar;
        this.I = oleVar;
        this.J = i8cVar;
    }

    public /* synthetic */ uo(jgb jgbVar, zy7 zy7Var, bz7 bz7Var, zy7 zy7Var2, zy7 zy7Var3) {
        this.E = 20;
        this.F = jgbVar;
        this.H = zy7Var;
        this.G = bz7Var;
        this.I = zy7Var2;
        this.J = zy7Var3;
    }

    public /* synthetic */ uo(RateLimit rateLimit, r1e r1eVar, iwg iwgVar, qi3 qi3Var, zy7 zy7Var) {
        this.E = 19;
        this.F = rateLimit;
        this.G = r1eVar;
        this.I = iwgVar;
        this.J = qi3Var;
        this.H = zy7Var;
    }

    public /* synthetic */ uo(Enum r1, bz7 bz7Var, iqb iqbVar, oxf oxfVar, mnc mncVar, int i, int i2) {
        this.E = i2;
        this.F = r1;
        this.G = bz7Var;
        this.J = iqbVar;
        this.H = oxfVar;
        this.I = mncVar;
    }

    public /* synthetic */ uo(Object obj, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, Object obj2, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.H = zy7Var;
        this.I = zy7Var2;
        this.G = zy7Var3;
        this.J = obj2;
    }

    public /* synthetic */ uo(Object obj, Object obj2, Object obj3, zy7 zy7Var, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
        this.I = obj3;
        this.H = zy7Var;
        this.J = iqbVar;
    }

    public /* synthetic */ uo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
    }

    public /* synthetic */ uo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
    }

    public /* synthetic */ uo(String str, zy7 zy7Var, bz7 bz7Var, d dVar, qi3 qi3Var, int i) {
        this.E = 21;
        this.F = str;
        this.H = zy7Var;
        this.G = bz7Var;
        this.I = dVar;
        this.J = qi3Var;
    }

    public /* synthetic */ uo(String str, zy7 zy7Var, iqb iqbVar, Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.H = zy7Var;
        this.J = iqbVar;
        this.G = obj;
        this.I = obj2;
    }
}
