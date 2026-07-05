package defpackage;

import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInputFieldsItem;
import com.anthropic.claude.tool.ui.chat.f;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v3e implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ v3e(MessageImageAsset messageImageAsset, iqb iqbVar, yw8 yw8Var, String str, int i) {
        this.E = 19;
        this.G = messageImageAsset;
        this.I = iqbVar;
        this.H = yw8Var;
        this.F = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        String str;
        int i = this.E;
        eo0 eo0Var = ko0.c;
        iei ieiVar = iei.a;
        Object obj3 = this.H;
        Object obj4 = this.I;
        Object obj5 = this.F;
        Object obj6 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                yjk.f((String) obj5, (eyh) obj6, (bz7) obj3, (iqb) obj4, (ld4) obj, x44.p0(3073));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ykk.b((String) obj5, (String) obj6, (String) obj3, (String) obj4, (ld4) obj, x44.p0(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((eua) obj6).a(x44.p0(3457), (ld4) obj, (iqb) obj4, (String) obj5, (String) obj3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                f.a((RequestFormInputFromUserInputFieldsItem) obj6, (String) obj5, (String) obj4, (bz7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                xke.c((String) obj5, (yle) obj6, (zy7) obj3, (qi3) obj4, (ld4) obj, x44.p0(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ssj.d((String) obj5, (ml3) obj6, (ta4) obj3, (iqb) obj4, (ld4) obj, x44.p0(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ssj.e((String) obj5, (zy7) obj6, (rz7) obj3, (iqb) obj4, (ld4) obj, x44.p0(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                etj.k((zy7) obj5, (bz7) obj3, (iqb) obj4, (s2g) obj6, (ld4) obj, x44.p0(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((k4g) obj5).a((v4g) obj6, (zy7) obj3, (l45) obj4, (ld4) obj, x44.p0(3073));
                break;
            case 9:
                y4g y4gVar = (y4g) obj5;
                ta4 ta4Var = (ta4) obj6;
                z3g z3gVar = (z3g) obj3;
                pz7 pz7Var = (pz7) obj4;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    FillElement fillElement = b.c;
                    q64 q64VarA = p64.a(eo0Var, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, fillElement);
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
                    vo1 vo1Var = lja.T;
                    iqb iqbVarE2 = fy.e(b.c(fqb.E, 1.0f), y4gVar.a, true, ukc.E, false, null, 120);
                    q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var, 48);
                    int iHashCode2 = Long.hashCode(e18Var.T);
                    hyc hycVarL2 = e18Var.l();
                    iqb iqbVarE3 = kxk.E(e18Var, iqbVarE2);
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, z80Var, q64VarA2);
                    d4c.i0(e18Var, z80Var2, hycVarL2);
                    ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
                    d4c.i0(e18Var, z80Var4, iqbVarE3);
                    ztj.d(null, z3gVar.c, null, e18Var, 0);
                    if (pz7Var == null) {
                        e18Var.a0(1538818236);
                        z = false;
                    } else {
                        z = false;
                        e18Var.a0(-920192027);
                        pz7Var.invoke(e18Var, 0);
                    }
                    e18Var.p(z);
                    e18Var.p(true);
                    ta4Var.invoke(s64.a, e18Var, 6);
                    e18Var.p(true);
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                p5h.i((TaskResponse) obj5, (e8h) obj6, (pz7) obj3, (iqb) obj4, (ld4) obj, x44.p0(1));
                break;
            case 11:
                l45 l45Var = (l45) obj5;
                pz7 pz7Var2 = (pz7) obj6;
                nwb nwbVar = (nwb) obj3;
                nwb nwbVar2 = (nwb) obj4;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else if (!((Boolean) nwbVar2.getValue()).booleanValue()) {
                    e18Var2.a0(339369698);
                    boolean z2 = !bsg.I0((String) nwbVar.getValue());
                    boolean zH = e18Var2.h(l45Var) | e18Var2.h(pz7Var2) | e18Var2.f(nwbVar);
                    Object objN = e18Var2.N();
                    if (zH || objN == jd4.a) {
                        objN = new n5h((Object) l45Var, (Object) nwbVar2, pz7Var2, (Object) nwbVar, 0);
                        e18Var2.k0(objN);
                    }
                    ez1.e((zy7) objN, null, z2, null, null, fd9.q0(1450269643, new jj2(17, nwbVar), e18Var2), e18Var2, 1572864, 58);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(339245543);
                    ez1.a(null, vf2.H, 0L, e18Var2, 48, 5);
                    e18Var2.p(false);
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                v6h.a((String) obj5, (String) obj6, (List) obj4, (bz7) obj3, (ld4) obj, x44.p0(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                t1i.a((iyh) obj5, (zy7) obj6, (mnc) obj3, (iqb) obj4, (ld4) obj, x44.p0(3073));
                break;
            case 14:
                ((Integer) obj2).getClass();
                oe5.e((cji) obj5, (fji) obj6, (iqb) obj4, (pl3) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                pqi.i((zy7) obj5, (iqb) obj4, (zli) obj6, (qi3) obj3, (ld4) obj, x44.p0(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                i4j.a((ud0) obj6, (String) obj5, (zy7) obj3, (iqb) obj4, (ld4) obj, x44.p0(1));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                VoiceSessionSummary voiceSessionSummary = (VoiceSessionSummary) obj5;
                zy7 zy7Var = (zy7) obj6;
                zy7 zy7Var2 = (zy7) obj3;
                zy7 zy7Var3 = (zy7) obj4;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    ho0 ho0Var = new ho0(24.0f, true, new sz6(1));
                    wo1 wo1Var = lja.Q;
                    za9 za9Var = za9.E;
                    fqb fqbVar = fqb.E;
                    iqb iqbVarM = gb9.M(rkj.j(fqbVar, za9Var), 14.0f, 8.0f, 12.0f, 8.0f);
                    cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var3, 54);
                    int iHashCode3 = Long.hashCode(e18Var3.T);
                    hyc hycVarL3 = e18Var3.l();
                    iqb iqbVarE4 = kxk.E(e18Var3, iqbVarM);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    z80 z80Var5 = cd4.f;
                    d4c.i0(e18Var3, z80Var5, cxeVarA);
                    z80 z80Var6 = cd4.e;
                    d4c.i0(e18Var3, z80Var6, hycVarL3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    z80 z80Var7 = cd4.g;
                    d4c.i0(e18Var3, z80Var7, numValueOf2);
                    bx bxVar2 = cd4.h;
                    d4c.h0(e18Var3, bxVar2);
                    z80 z80Var8 = cd4.d;
                    d4c.i0(e18Var3, z80Var8, iqbVarE4);
                    ho0 ho0Var2 = new ho0(10.0f, true, new sz6(1));
                    hw9 hw9Var = new hw9(1.0f, true);
                    cxe cxeVarA2 = axe.a(ho0Var2, wo1Var, e18Var3, 54);
                    int iHashCode4 = Long.hashCode(e18Var3.T);
                    hyc hycVarL4 = e18Var3.l();
                    iqb iqbVarE5 = kxk.E(e18Var3, hw9Var);
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, z80Var5, cxeVarA2);
                    d4c.i0(e18Var3, z80Var6, hycVarL4);
                    ij0.t(iHashCode4, e18Var3, z80Var7, e18Var3, bxVar2);
                    d4c.i0(e18Var3, z80Var8, iqbVarE5);
                    iv1.b(ud0.G1, null, null, null, 0L, e18Var3, 48, 28);
                    q64 q64VarA3 = p64.a(eo0Var, lja.S, e18Var3, 0);
                    int iHashCode5 = Long.hashCode(e18Var3.T);
                    hyc hycVarL5 = e18Var3.l();
                    iqb iqbVarE6 = kxk.E(e18Var3, fqbVar);
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, z80Var5, q64VarA3);
                    d4c.i0(e18Var3, z80Var6, hycVarL5);
                    ij0.t(iHashCode5, e18Var3, z80Var7, e18Var3, bxVar2);
                    d4c.i0(e18Var3, z80Var8, iqbVarE6);
                    tjh.b(d4c.j0(R.string.voice_chat_ended, e18Var3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).j, e18Var3, 0, 0, 131070);
                    long sessionDurationMs = voiceSessionSummary.getSessionDurationMs() / 1000;
                    long j = sessionDurationMs / 60;
                    long j2 = sessionDurationMs % 60;
                    if (j == 0) {
                        str = j2 + "s";
                    } else if (j2 == 0) {
                        str = j + "m";
                    } else {
                        str = j + "m" + j2 + "s";
                    }
                    tjh.b(str, null, gm3.a(e18Var3).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 0, 0, 131066);
                    e18Var3.p(true);
                    e18Var3.p(true);
                    ho0 ho0Var3 = new ho0(12.0f, true, new sz6(1));
                    FillElement fillElement2 = b.b;
                    cxe cxeVarA3 = axe.a(ho0Var3, wo1Var, e18Var3, 54);
                    int iHashCode6 = Long.hashCode(e18Var3.T);
                    hyc hycVarL6 = e18Var3.l();
                    iqb iqbVarE7 = kxk.E(e18Var3, fillElement2);
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, z80Var5, cxeVarA3);
                    d4c.i0(e18Var3, z80Var6, hycVarL6);
                    ij0.t(iHashCode6, e18Var3, z80Var7, e18Var3, bxVar2);
                    d4c.i0(e18Var3, z80Var8, iqbVarE7);
                    iqb iqbVarN = gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 11);
                    cxe cxeVarA4 = axe.a(ko0.a, lja.P, e18Var3, 0);
                    int iHashCode7 = Long.hashCode(e18Var3.T);
                    hyc hycVarL7 = e18Var3.l();
                    iqb iqbVarE8 = kxk.E(e18Var3, iqbVarN);
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, z80Var5, cxeVarA4);
                    d4c.i0(e18Var3, z80Var6, hycVarL7);
                    ij0.t(iHashCode7, e18Var3, z80Var7, e18Var3, bxVar2);
                    d4c.i0(e18Var3, z80Var8, iqbVarE8);
                    i4j.a(ud0.A1, d4c.j0(R.string.voice_feedback_positive_label, e18Var3), zy7Var2, null, e18Var3, 0);
                    i4j.a(ud0.z1, d4c.j0(R.string.voice_feedback_negative_label, e18Var3), zy7Var3, null, e18Var3, 0);
                    e18Var3.p(true);
                    iuj.h(MTTypesetterKt.kLineSkipLimitMultiplier, 6, gm3.a(e18Var3).u, e18Var3, fillElement2);
                    i4j.a(ud0.M1, d4c.j0(R.string.voice_feedback_dismiss_label, e18Var3), zy7Var, null, e18Var3, 0);
                    e18Var3.p(true);
                    e18Var3.p(true);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                hkk.c((zy7) obj5, (iqb) obj4, (l5j) obj6, (pl3) obj3, (ld4) obj, x44.p0(1));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((Integer) obj2).getClass();
                tnk.e((MessageImageAsset) obj6, (iqb) obj4, (yw8) obj3, (String) obj5, (ld4) obj, x44.p0(49));
                break;
            default:
                ((Integer) obj2).getClass();
                tnk.h((Uri) obj6, (String) obj5, (iqb) obj4, (yw8) obj3, (ld4) obj, x44.p0(385));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ v3e(zy7 zy7Var, bz7 bz7Var, iqb iqbVar, s2g s2gVar, int i) {
        this.E = 7;
        this.F = zy7Var;
        this.H = bz7Var;
        this.I = iqbVar;
        this.G = s2gVar;
    }

    public /* synthetic */ v3e(zy7 zy7Var, iqb iqbVar, iwe iweVar, Object obj, int i, int i2) {
        this.E = i2;
        this.F = zy7Var;
        this.I = iqbVar;
        this.G = iweVar;
        this.H = obj;
    }

    public /* synthetic */ v3e(int i, int i2, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
        this.I = obj3;
        this.H = obj4;
    }

    public /* synthetic */ v3e(Object obj, qz7 qz7Var, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = qz7Var;
        this.H = obj2;
        this.I = obj3;
    }

    public /* synthetic */ v3e(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.E = i2;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
    }

    public /* synthetic */ v3e(Object obj, String str, Object obj2, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = str;
        this.H = obj2;
        this.I = iqbVar;
    }

    public /* synthetic */ v3e(Object obj, String str, Object obj2, Object obj3, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = str;
        this.I = obj2;
        this.H = obj3;
    }
}
