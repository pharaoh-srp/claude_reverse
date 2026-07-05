package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import coil3.compose.AsyncImagePainter;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.experience.Experience;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.app.onboarding.OnboardingPage;
import com.anthropic.claude.app.onboarding.a;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.mikepenz.aboutlibraries.entity.Library;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mm5 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ mm5(ta4 ta4Var, pz7 pz7Var, ta4 ta4Var2, wl5 wl5Var, tkh tkhVar) {
        this.E = 0;
        this.F = ta4Var;
        this.G = pz7Var;
        this.H = wl5Var;
        this.I = tkhVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        eo0 eo0Var = ko0.c;
        int i2 = 4;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        int i3 = 3;
        iei ieiVar = iei.a;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        Object obj6 = this.F;
        switch (i) {
            case 0:
                ta4 ta4Var = (ta4) obj6;
                pz7 pz7Var = (pz7) obj5;
                wl5 wl5Var = (wl5) obj4;
                tkh tkhVar = (tkh) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    q64 q64VarA = p64.a(eo0Var, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarC);
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
                    go0 go0Var = pz7Var != null ? ko0.g : ko0.a;
                    iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                    cxe cxeVarA = axe.a(go0Var, lja.Q, e18Var, 48);
                    int iHashCode2 = Long.hashCode(e18Var.T);
                    hyc hycVarL2 = e18Var.l();
                    iqb iqbVarE2 = kxk.E(e18Var, iqbVarC2);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, cxeVarA);
                    d4c.i0(e18Var, z80Var2, hycVarL2);
                    ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
                    d4c.i0(e18Var, z80Var4, iqbVarE2);
                    e18Var.a0(-516028300);
                    tjh.a(tkhVar, fd9.q0(-738208900, new rx0(ta4Var, 13), e18Var), e18Var, 48);
                    e18Var.p(false);
                    if (pz7Var == null) {
                        e18Var.a0(-515799087);
                    } else {
                        e18Var.a0(260455984);
                        pz7Var.invoke(e18Var, 0);
                    }
                    e18Var.p(false);
                    e18Var.p(true);
                    e18Var.a0(-250360576);
                    iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, wl5Var.x, e18Var, 0, 3);
                    e18Var.p(false);
                    e18Var.p(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                vwk.a((iy5) obj6, (String) obj5, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                kyk.a((ty5) obj6, (String) obj5, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 3:
                Experience experience = (Experience) obj6;
                zy7 zy7Var = (zy7) obj4;
                zy7 zy7Var2 = (zy7) obj3;
                pz7 pz7Var2 = (pz7) obj5;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    zqd.a(experience, zy7Var, zy7Var2, pz7Var2, null, e18Var2, 0);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                dgj.h((oge) obj6, (String) obj5, (zy7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 5:
                bz7 bz7Var = (bz7) obj6;
                eli eliVar = (eli) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    j8.c(ve4.t.a(new vj6(bz7Var, eliVar)), fd9.q0(-154539447, new ny3(str, str2, i3), e18Var3), e18Var3, 48);
                }
                break;
            case 6:
                zb0 zb0Var = (zb0) obj6;
                zy7 zy7Var3 = (zy7) obj5;
                zt6 zt6Var = (zt6) obj4;
                String str3 = (String) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    vo1 vo1Var = lja.T;
                    iqb iqbVarK = gb9.K(fqbVar, 24.0f, 16.0f);
                    q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var4, 48);
                    int iHashCode3 = Long.hashCode(e18Var4.T);
                    hyc hycVarL3 = e18Var4.l();
                    iqb iqbVarE3 = kxk.E(e18Var4, iqbVarK);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var2);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, q64VarA2);
                    d4c.i0(e18Var4, cd4.e, hycVarL3);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE3);
                    tjh.c(zb0Var, null, 0L, 0L, 0L, new fdh(3), 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var4).e.E).g, e18Var4, 0, 0, 261118);
                    if (zy7Var3 != null) {
                        sq6.A(8.0f, 1820639599, e18Var4, e18Var4, fqbVar);
                        lnk.d(zy7Var3, null, false, null, zt6Var.f, new qnc(16.0f, 8.0f, 16.0f, 8.0f), ((jm3) gm3.c(e18Var4).e.E).h, fd9.q0(-462028088, new pp(str3, 11), e18Var4), e18Var4, 806879232, 174);
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(1821042258);
                        e18Var4.p(false);
                    }
                    e18Var4.p(true);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                bj7.e((MessageAttachment) obj6, (iqb) obj5, (zy7) obj4, (va6) obj3, (ld4) obj, x44.p0(3073));
                break;
            case 8:
                ((Integer) obj2).getClass();
                rqk.c((zy7) obj6, (GroveEvents$GroveLocation) obj5, (iqb) obj4, (ub8) obj3, (ld4) obj, x44.p0(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                prk.e((String) obj6, (zy7) obj5, (iqb) obj4, (qc8) obj3, (ld4) obj, x44.p0(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                fuk.e((ImageGalleryItem) obj6, (String) obj5, (AsyncImagePainter) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 11:
                String str4 = (String) obj6;
                pl3 pl3Var = (pl3) obj5;
                View view = (View) obj4;
                zy7 zy7Var4 = (zy7) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    boolean zH = e18Var5.h(pl3Var) | e18Var5.h(view) | e18Var5.f(zy7Var4);
                    Object objN = e18Var5.N();
                    if (zH || objN == lz1Var) {
                        objN = new uj1(pl3Var, view, zy7Var4, 4);
                        e18Var5.k0(objN);
                    }
                    jwk.k(0, e18Var5, (zy7) objN, null, str4);
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                uvk.a((ftc) obj6, (lvh) obj5, (String) obj4, (iqb) obj3, (ld4) obj, x44.p0(3073));
                break;
            case 13:
                ((z7d) obj).a();
                ((z9e) obj6).E = true;
                gb9.D((l45) obj5, null, null, new t74((a80) obj4, (fcc) obj2, (a80) obj3, null, 28), 3);
                break;
            case 14:
                ((Integer) obj2).getClass();
                xvj.e((zy7) obj6, (iqb) obj5, (t3a) obj4, (qi3) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                xvj.c((Library) obj6, (bz7) obj5, (iqb) obj4, (mnc) obj3, (ld4) obj, x44.p0(385));
                break;
            case 16:
                ((Integer) obj2).getClass();
                xvj.b((String) obj6, (String) obj5, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                fk0 fk0Var = (fk0) obj6;
                Context context = (Context) obj5;
                w7 w7Var = (w7) obj4;
                rwe rweVar = (rwe) obj3;
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    boolean zH2 = e18Var6.h(fk0Var) | e18Var6.h(context) | e18Var6.h(w7Var) | e18Var6.h(rweVar);
                    Object objN2 = e18Var6.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new qpa(fk0Var, context, w7Var, rweVar);
                        e18Var6.k0(objN2);
                    }
                    rz7 rz7Var = (rz7) objN2;
                    boolean zH3 = e18Var6.h(rweVar);
                    Object objN3 = e18Var6.N();
                    if (zH3 || objN3 == lz1Var) {
                        objN3 = new av(rweVar, 21);
                        e18Var6.k0(objN3);
                    }
                    com.anthropic.claude.login.b.a(rz7Var, null, null, null, (zy7) objN3, null, e18Var6, 0, 46);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                ((eua) obj6).a(x44.p0(3457), (ld4) obj, (iqb) obj3, (String) obj5, (String) obj4);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                l45 l45Var = (l45) obj6;
                op3 op3Var = (op3) obj5;
                String str5 = (String) obj4;
                zy7 zy7Var5 = (zy7) obj3;
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    boolean zH4 = e18Var7.h(l45Var) | e18Var7.h(op3Var) | e18Var7.f(str5) | e18Var7.f(zy7Var5);
                    Object objN4 = e18Var7.N();
                    if (zH4 || objN4 == lz1Var) {
                        objN4 = new lo4(l45Var, zy7Var5, op3Var, str5);
                        e18Var7.k0(objN4);
                    }
                    qnc qncVar = q02.a;
                    csg.j((zy7) objN4, null, false, null, q02.d(0L, gm3.a(e18Var7).M, 0L, e18Var7, 13), null, null, vok.b, e18Var7, 805306368, 494);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((Integer) obj2).getClass();
                kpk.e((String) obj6, (String) obj5, (String) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                kpk.c((McpTool) obj6, (z4b) obj5, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                seb sebVar = (seb) obj6;
                lvh lvhVar = (lvh) obj5;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    boolean zH5 = e18Var8.h(sebVar) | e18Var8.h(lvhVar) | e18Var8.f(str6) | e18Var8.f(str7);
                    Object objN5 = e18Var8.N();
                    if (zH5 || objN5 == lz1Var) {
                        he heVar = new he(sebVar, str7, lvhVar, str6, 17);
                        e18Var8.k0(heVar);
                        objN5 = heVar;
                    }
                    ez1.e((zy7) objN5, b.o(fqbVar, 24.0f), false, null, null, opk.a, e18Var8, 1572912, 60);
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                yeb.b((List) obj6, (rd4) obj5, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 24:
                a aVar = (a) obj6;
                iqb iqbVar = (iqb) obj5;
                tec tecVar = (tec) obj4;
                zy7 zy7Var6 = (zy7) obj3;
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    e18Var9.T();
                } else {
                    boolean zH6 = e18Var9.h(aVar);
                    Object objN6 = e18Var9.N();
                    if (zH6 || objN6 == lz1Var) {
                        mx5 mx5Var = new mx5(0, aVar, a.class, "initialStack", "initialStack()Ljava/util/List;", 0, 15);
                        e18Var9.k0(mx5Var);
                        objN6 = mx5Var;
                    }
                    kce kceVar = jce.a;
                    rwe rweVarP = eve.P(kceVar.b(OnboardingPage.class), oq5.B(kceVar.b(OnboardingPage.class)), true, iv1.M(kceVar.b(OnboardingPage.class)), (zy7) ((jm9) objN6), e18Var9);
                    x44.q0(rweVarP, e18Var9);
                    Object objN7 = e18Var9.N();
                    if (objN7 == lz1Var) {
                        objN7 = sq6.p(e18Var9);
                    }
                    ybg ybgVar = (ybg) objN7;
                    v40.b(iqbVar, null, null, null, fd9.q0(1181253123, new rn(ybgVar, 15), e18Var9), null, 0, gm3.a(e18Var9).n, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-443050318, new xe(tecVar, ybgVar, rweVarP, aVar, zy7Var6, 26), e18Var9), e18Var9, 24576, 1902);
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).getClass();
                bwj.b((MessageAttachment) obj6, (cj7) obj5, (zy7) obj4, (e1a) obj3, (ld4) obj, x44.p0(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                me7.c((KnowledgeSource) obj6, (zy7) obj5, (zy7) obj4, (zy7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                dxj.c((List) obj6, (dwg) obj5, (bz7) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                break;
            case 28:
                ((Integer) obj2).getClass();
                kzj.b((zy7) obj6, (iqb) obj5, (qi3) obj4, (vid) obj3, (ld4) obj, x44.p0(1));
                break;
            default:
                ild ildVar = (ild) obj6;
                zy7 zy7Var7 = (zy7) obj5;
                ml3 ml3Var = (ml3) obj4;
                q2i q2iVar = (q2i) obj3;
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                } else {
                    tkd tkdVar = (tkd) ildVar.t.getValue();
                    boolean zH7 = e18Var10.h(ildVar);
                    Object objN8 = e18Var10.N();
                    if (zH7 || objN8 == lz1Var) {
                        objN8 = new ald(ildVar, i2);
                        e18Var10.k0(objN8);
                    }
                    zy7 zy7Var8 = (zy7) objN8;
                    boolean zH8 = e18Var10.h(ildVar);
                    Object objN9 = e18Var10.N();
                    if (zH8 || objN9 == lz1Var) {
                        objN9 = new pac(1, ildVar, ild.class, "setProjectArchived", "setProjectArchived(Z)V", 0, 18);
                        e18Var10.k0(objN9);
                    }
                    int i4 = ml3.f;
                    com.anthropic.claude.project.details.g.d(tkdVar, zy7Var8, (bz7) ((jm9) objN9), zy7Var7, ml3Var, q2iVar, null, e18Var10, 0);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ mm5(Experience experience, zy7 zy7Var, zy7 zy7Var2, pz7 pz7Var) {
        this.E = 3;
        this.F = experience;
        this.H = zy7Var;
        this.I = zy7Var2;
        this.G = pz7Var;
    }

    public /* synthetic */ mm5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    public /* synthetic */ mm5(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }
}
