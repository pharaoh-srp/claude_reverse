package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.experience.ExperienceBullet;
import com.anthropic.claude.project.details.custominstructions.d;
import com.anthropic.claude.settings.internal.e;
import com.anthropic.claude.settings.internal.growthbook.GateKind;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class um5 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ um5(int i, int i2, Object obj, String str) {
        this.E = i2;
        this.G = obj;
        this.F = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String strF;
        int i = this.E;
        tp4 tp4Var = null;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        int i2 = 3;
        iei ieiVar = iei.a;
        Object obj3 = this.G;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                String str = (String) obj4;
                wl5 wl5Var = (wl5) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zF = e18Var.f(str);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new cm5(str, 1);
                        e18Var.k0(objN);
                    }
                    tjh.b(str, tjf.b(fqbVar, false, (bz7) objN), wl5Var.f, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262136);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                ((Integer) obj2).getClass();
                ((pp5) obj4).a((el5) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 2:
                el5 el5Var = (el5) obj4;
                ia0 ia0Var = (ia0) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((ta4) el5Var.I).invoke(new q90(ia0Var), e18Var2, 0);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 3:
                ((Integer) obj2).getClass();
                ((zp5) obj4).a((c61) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 4:
                ((Integer) obj2).getClass();
                ((ss5) obj4).a((hw1) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 5:
                beh behVar = (beh) obj4;
                meh mehVar = (meh) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zF2 = e18Var3.f(behVar);
                    Object objN2 = e18Var3.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = mpk.w(new y14(0, behVar, beh.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 28));
                        e18Var3.k0(objN2);
                    }
                    ou5.a(mehVar, (aeh) ((wlg) objN2).getValue(), e18Var3, 0);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 6:
                ((Integer) obj2).getClass();
                ou5.a((meh) obj4, (aeh) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 7:
                ((Integer) obj2).getClass();
                ((lv5) obj4).a((b9i) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 8:
                jx5 jx5Var = (jx5) obj4;
                zy7 zy7Var = (zy7) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean z = !((Boolean) jx5Var.e.getValue()).booleanValue();
                    boolean zF3 = e18Var4.f(jx5Var) | e18Var4.f(zy7Var);
                    Object objN3 = e18Var4.N();
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new kx5(jx5Var, zy7Var, 1);
                        e18Var4.k0(objN3);
                    }
                    trk.a(0, 4, e18Var4, (zy7) objN3, null, z);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 9:
                ((Integer) obj2).getClass();
                w76.c((eng) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 10:
                d dVar = (d) obj4;
                zy7 zy7Var2 = (zy7) obj3;
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean z2 = !((Boolean) dVar.g.getValue()).booleanValue();
                    qnc qncVar = q02.a;
                    lnk.d(zy7Var2, null, z2, null, q02.d(0L, gm3.a(e18Var5).O, 0L, e18Var5, 13), null, null, dlk.b, e18Var5, 805306368, 490);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 11:
                String str2 = (String) obj4;
                d dVar2 = (d) obj3;
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Object objN4 = e18Var6.N();
                    if (objN4 == lz1Var) {
                        objN4 = ij0.d(e18Var6);
                    }
                    bt7 bt7Var = (bt7) objN4;
                    iqb iqbVarB0 = mpk.b0(fqbVar, mpk.Y(e18Var6), true);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var6, 0);
                    int iHashCode = Long.hashCode(e18Var6.T);
                    hyc hycVarL = e18Var6.l();
                    iqb iqbVarE = kxk.E(e18Var6, iqbVarB0);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var6.e0();
                    if (e18Var6.S) {
                        e18Var6.k(re4Var);
                    } else {
                        e18Var6.n0();
                    }
                    d4c.i0(e18Var6, cd4.f, q64VarA);
                    d4c.i0(e18Var6, cd4.e, hycVarL);
                    d4c.i0(e18Var6, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var6, cd4.h);
                    d4c.i0(e18Var6, cd4.d, iqbVarE);
                    tjh.b(d4c.k0(R.string.project_details_custom_instructions_dialog_description, new Object[]{str2}, e18Var6), null, gm3.a(e18Var6).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var6).e.E).i, e18Var6, 0, 0, 131066);
                    kxk.g(e18Var6, b.e(fqbVar, 16.0f));
                    cjh cjhVar = (cjh) dVar2.h.getValue();
                    String strJ0 = d4c.j0(R.string.project_details_custom_instructions_dialog_placeholder, e18Var6);
                    tkh tkhVarB = tkh.b(((jm3) gm3.c(e18Var6).e.E).g, gm3.a(e18Var6).N, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214);
                    int i3 = 0;
                    mp9 mp9Var = new mp9(i2, i3, i3, 126);
                    iqb iqbVarC = b.c(iv1.s(fqbVar, bt7Var), 1.0f);
                    boolean zF4 = e18Var6.f(dVar2);
                    Object objN5 = e18Var6.N();
                    if (zF4 || objN5 == lz1Var) {
                        objN5 = new jj6(dVar2, 1);
                        e18Var6.k0(objN5);
                    }
                    mok.f(cjhVar, (bz7) objN5, iqbVarC, strJ0, tkhVarB, 0L, 0L, 0L, null, null, mp9Var, null, 5, 0, null, e18Var6, 0, 3078, 56288);
                    e18Var6.p(true);
                    Object objN6 = e18Var6.N();
                    if (objN6 == lz1Var) {
                        objN6 = new fz3(bt7Var, tp4Var, 6);
                        e18Var6.k0(objN6);
                    }
                    fd9.i(e18Var6, (pz7) objN6, ieiVar);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 12:
                ((Integer) obj2).getClass();
                xjk.e((ExperienceBullet) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 13:
                List list = (List) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                list.getClass();
                gb9.D((l45) obj4, null, null, new ku((ha7) obj3, list, zBooleanValue, (tp4) null, 13), 3);
                return ieiVar;
            case 14:
                ((Integer) obj2).getClass();
                dlk.f((MobileAppFeedbackEvents$FeedbackType) obj4, (bz7) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                zy7 zy7Var3 = (zy7) obj3;
                int iIntValue7 = ((Integer) obj).intValue();
                nf0 nf0Var = (nf0) obj2;
                nf0Var.getClass();
                ((bae) obj4).E = iIntValue7;
                if (zy7Var3 != null) {
                    zy7Var3.a();
                }
                List list2 = xah.a;
                if (nf0Var instanceof lf0) {
                    strF = grc.p(((lf0) nf0Var).a, "http_");
                } else {
                    if (!(nf0Var instanceof mf0)) {
                        wg6.i();
                        return null;
                    }
                    strF = jce.a.b(((mf0) nf0Var).a.getClass()).f();
                    if (strF == null) {
                        strF = "exception";
                    }
                }
                xah.e(6, vb7.k(iIntValue7, "FileUploadHandler: retrying upload, retry=", " after=", strF), null, null);
                return ieiVar;
            case 16:
                p60 p60Var = (p60) obj4;
                vag vagVar = (vag) obj3;
                int iIntValue8 = ((Integer) obj).intValue();
                if (obj2 instanceof tc4) {
                    ((wwb) p60Var.J).b((tc4) obj2);
                } else if (!(obj2 instanceof wre)) {
                    if (obj2 instanceof i18) {
                        sf5.e0(vagVar, iIntValue8, obj2);
                        p60Var.n((i18) obj2);
                    } else if (obj2 instanceof r7e) {
                        sf5.e0(vagVar, iIntValue8, obj2);
                        ((r7e) obj2).c();
                    }
                }
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((Integer) obj2).getClass();
                ypk.k((ni6) obj4, (ta4) obj3, (ld4) obj, x44.p0(49));
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                prk.g((qc8) obj3, (String) obj4, (ld4) obj, x44.p0(1));
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                yih yihVar = (yih) obj4;
                nwb nwbVar = (nwb) obj3;
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    q64 q64VarA2 = p64.a(new ho0(12.0f, true, new sz6(1)), lja.S, e18Var7, 6);
                    int iHashCode2 = Long.hashCode(e18Var7.T);
                    hyc hycVarL2 = e18Var7.l();
                    iqb iqbVarE2 = kxk.E(e18Var7, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var7.e0();
                    if (e18Var7.S) {
                        e18Var7.k(re4Var2);
                    } else {
                        e18Var7.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var7, z80Var, q64VarA2);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var7, z80Var2, hycVarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var7, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var7, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var7, z80Var4, iqbVarE2);
                    iqb iqbVarJ = gb9.J(yfd.p(b.c(fqbVar, 1.0f), gm3.a(e18Var7).o, xve.b(8.0f)), 12.0f);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode3 = Long.hashCode(e18Var7.T);
                    hyc hycVarL3 = e18Var7.l();
                    iqb iqbVarE3 = kxk.E(e18Var7, iqbVarJ);
                    e18Var7.e0();
                    if (e18Var7.S) {
                        e18Var7.k(re4Var2);
                    } else {
                        e18Var7.n0();
                    }
                    d4c.i0(e18Var7, z80Var, o5bVarD);
                    d4c.i0(e18Var7, z80Var2, hycVarL3);
                    ij0.t(iHashCode3, e18Var7, z80Var3, e18Var7, bxVar);
                    d4c.i0(e18Var7, z80Var4, iqbVarE3);
                    bg1.a(yihVar, b.c(fqbVar, 1.0f), false, null, tkh.b(((jm3) gm3.c(e18Var7).e.E).g, gm3.a(e18Var7).M, 0L, null, null, xt7.H, 0L, null, 0, 0L, null, 0, 16777182), null, null, null, null, new ax5(9, yihVar), null, e18Var7, 54, 24540);
                    e18Var7.p(true);
                    tjh.b(d4c.j0(R.string.internal_setting_growthbook_override_add_custom_feature_type_label, e18Var7), null, gm3.a(e18Var7).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var7).e.E).j, e18Var7, 0, 0, 131066);
                    cxe cxeVarA = axe.a(new ho0(6.0f, true, new sz6(1)), lja.P, e18Var7, 6);
                    int iHashCode4 = Long.hashCode(e18Var7.T);
                    hyc hycVarL4 = e18Var7.l();
                    iqb iqbVarE4 = kxk.E(e18Var7, fqbVar);
                    e18Var7.e0();
                    if (e18Var7.S) {
                        e18Var7.k(re4Var2);
                    } else {
                        e18Var7.n0();
                    }
                    d4c.i0(e18Var7, z80Var, cxeVarA);
                    d4c.i0(e18Var7, z80Var2, hycVarL4);
                    ij0.t(iHashCode4, e18Var7, z80Var3, e18Var7, bxVar);
                    d4c.i0(e18Var7, z80Var4, iqbVarE4);
                    e18Var7.a0(1038904102);
                    for (GateKind gateKind : pd8.b) {
                        boolean z3 = gateKind == ((GateKind) nwbVar.getValue());
                        boolean zD = e18Var7.d(gateKind.ordinal());
                        Object objN7 = e18Var7.N();
                        if (zD || objN7 == lz1Var) {
                            objN7 = new w95(gateKind, 21, nwbVar);
                            e18Var7.k0(objN7);
                        }
                        pd8.f(gateKind, z3, (zy7) objN7, e18Var7, 0);
                    }
                    ij0.w(e18Var7, false, true, true);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((Integer) obj2).getClass();
                pd8.a((zy7) obj4, (pz7) obj3, (ld4) obj, x44.p0(7));
                return ieiVar;
            case 21:
                ((Integer) obj2).getClass();
                ((ax5) obj4).k((ta4) obj3, (ld4) obj, x44.p0(7));
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                ssk.c((iqb) obj4, (rwe) obj3, (ld4) obj, x44.p0(65));
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                ysk.c((cte) obj3, (String) obj4, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 24:
                ((Integer) obj2).getClass();
                tw8.b((ImageGalleryItem) obj4, (iqb) obj3, (ld4) obj, x44.p0(1));
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).getClass();
                e.a((koi) obj4, (ybg) obj3, (ld4) obj, x44.p0(49));
                return ieiVar;
            case 26:
                ((Integer) obj2).getClass();
                e.b((fk0) obj4, (iqb) obj3, (ld4) obj, x44.p0(9));
                return ieiVar;
            case 27:
                ((Integer) obj2).getClass();
                ((lt9) obj3).a((String) obj4, (ld4) obj, x44.p0(1));
                return ieiVar;
            case 28:
                ya8 ya8Var = (ya8) obj4;
                go0 go0Var = (go0) obj3;
                cz5 cz5Var = (cz5) obj;
                rl4 rl4Var = (rl4) obj2;
                if (rl4.h(rl4Var.a) == Integer.MAX_VALUE) {
                    e39.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = rl4.h(rl4Var.a);
                int[] iArrO1 = w44.o1(ya8Var.a(cz5Var, iH, cz5Var.M0(go0Var.d())));
                int[] iArr = new int[iArrO1.length];
                go0Var.j(cz5Var, iH, iArrO1, fu9.E, iArr);
                return new epk(iArrO1, iArr);
            default:
                rja rjaVar = (rja) obj4;
                zy7 zy7Var4 = (zy7) obj3;
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    trk.a(0, 4, e18Var8, zy7Var4, null, !((Boolean) rjaVar.d.getValue()).booleanValue());
                } else {
                    e18Var8.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ um5(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public /* synthetic */ um5(Object obj, Object obj2, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
    }
}
