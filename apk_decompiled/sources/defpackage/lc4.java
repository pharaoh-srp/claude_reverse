package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.conway.protocol.ConwaySearchHit;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lc4 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ lc4(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        tkh tkhVar;
        tkh tkhVar2;
        int i = this.E;
        fo0 fo0Var = ko0.a;
        int i2 = 4;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    iqb iqbVarL = gb9.L(fqbVar, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    cxe cxeVarA = axe.a(fo0Var, wo1Var, e18Var, 48);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, cxeVarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    tjh.b(d4c.j0(R.string.voice_error_retry, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131066);
                    e18Var.p(true);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    Object objN = e18Var2.N();
                    if (objN == lz1Var) {
                        objN = new oob(19);
                        e18Var2.k0(objN);
                    }
                    zy7 zy7Var = (zy7) objN;
                    Object objN2 = e18Var2.N();
                    if (objN2 == lz1Var) {
                        objN2 = new oob(19);
                        e18Var2.k0(objN2);
                    }
                    yjk.i("Connection error", "Unable to reach Claude", zy7Var, (zy7) objN2, gb9.J(fqbVar, 16.0f), e18Var2, 28086);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    Object objN3 = e18Var3.N();
                    if (objN3 == lz1Var) {
                        objN3 = new oob(19);
                        e18Var3.k0(objN3);
                    }
                    yjk.c("Voice mode unavailable", "Try again later", (zy7) objN3, gb9.J(fqbVar, 16.0f), e18Var3, 3510);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    String strJ0 = d4c.j0(R.string.voice_error_fatal_title, e18Var4);
                    String strJ02 = d4c.j0(R.string.voice_error_audio_output_subtitle, e18Var4);
                    Object objN4 = e18Var4.N();
                    if (objN4 == lz1Var) {
                        objN4 = new oob(19);
                        e18Var4.k0(objN4);
                    }
                    yjk.c(strJ0, strJ02, (zy7) objN4, gb9.J(fqbVar, 16.0f), e18Var4, 3456);
                }
                break;
            case 4:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    Object objN5 = e18Var5.N();
                    if (objN5 == lz1Var) {
                        objN5 = new oob(19);
                        e18Var5.k0(objN5);
                    }
                    yjk.d(438, e18Var5, (zy7) objN5, gb9.J(fqbVar, 16.0f), "Paused while another app is playing audio.");
                }
                break;
            case 5:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    cxe cxeVarA2 = axe.a(fo0Var, lja.Q, e18Var6, 48);
                    int iHashCode2 = Long.hashCode(e18Var6.T);
                    hyc hycVarL2 = e18Var6.l();
                    iqb iqbVarE2 = kxk.E(e18Var6, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var6.e0();
                    if (e18Var6.S) {
                        e18Var6.k(re4Var2);
                    } else {
                        e18Var6.n0();
                    }
                    d4c.i0(e18Var6, cd4.f, cxeVarA2);
                    d4c.i0(e18Var6, cd4.e, hycVarL2);
                    d4c.i0(e18Var6, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var6, cd4.h);
                    d4c.i0(e18Var6, cd4.d, iqbVarE2);
                    k4g.a.c(d4c.j0(R.string.title_feedback, e18Var6), null, e18Var6, 384);
                    iv1.b(ud0.z1, null, gb9.K(fqbVar, 8.0f, 4.0f), ef2.F, 0L, e18Var6, 3504, 16);
                    e18Var6.p(true);
                }
                break;
            case 6:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    Object objN6 = e18Var7.N();
                    if (objN6 == lz1Var) {
                        objN6 = new lc4(8);
                        e18Var7.k0(objN6);
                    }
                    zjk.c(54, 0, e18Var7, (pz7) objN6, gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 1));
                }
                break;
            case 7:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    Object objN7 = e18Var8.N();
                    if (objN7 == lz1Var) {
                        objN7 = new fc4(i2);
                        e18Var8.k0(objN7);
                    }
                    zjk.a(g4j.G, (bz7) objN7, e18Var8, 54);
                }
                break;
            case 8:
                ((g4j) obj).getClass();
                ((String) obj2).getClass();
                break;
            case 9:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    e18Var9.T();
                } else {
                    tjh.b(d4c.j0(R.string.voice_shortcut_dialog_title, e18Var9), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var9, 0, 0, 262142);
                }
                break;
            case 10:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                } else {
                    tjh.b(d4c.j0(R.string.voice_shortcut_dialog_text, e18Var10), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var10, 0, 0, 262142);
                }
                break;
            case 11:
                ((McpServer) obj).getClass();
                ((o3b) obj2).getClass();
                break;
            case 12:
                break;
            case 13:
                int iIntValue11 = ((Integer) obj).intValue();
                ConwaySearchHit conwaySearchHit = (ConwaySearchHit) obj2;
                conwaySearchHit.getClass();
                String agentId = conwaySearchHit.getAgentId();
                Object seq = conwaySearchHit.getSeq();
                if (seq == null) {
                    seq = conwaySearchHit.getTimestamp() + "#" + iIntValue11;
                }
                break;
            case 14:
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                break;
            case 16:
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                break;
            case 21:
                dn5 dn5Var = (dn5) obj2;
                Long lB = dn5Var.b();
                Long lValueOf = Long.valueOf(((u72) dn5Var.e.getValue()).e);
                b79 b79Var = dn5Var.a;
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                xs5 xs5Var = (xs5) obj2;
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                h66.i(x44.p0(1), (ld4) obj);
                break;
            case 24:
                ((Integer) obj2).getClass();
                h66.p(x44.p0(1), (ld4) obj);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                break;
            case 26:
                ((Integer) obj2).getClass();
                pd8.k(x44.p0(1), (ld4) obj);
                break;
            case 27:
                int iIntValue12 = ((Integer) obj).intValue();
                tkh tkhVar3 = (tkh) obj2;
                tkhVar3.getClass();
                if (iIntValue12 != 0) {
                    if (iIntValue12 == 1) {
                        tkhVar = new tkh(0L, eve.B(26), dv7.M, null, null, 0L, 0L, 0, 0, 0L, null, 16777209);
                    } else if (iIntValue12 == 2) {
                        tkhVar2 = new tkh(d54.b(0.7f, tkhVar3.d()), eve.B(22), dv7.M, null, null, 0L, 0L, 0, 0, 0L, null, 16777208);
                    } else if (iIntValue12 == 3) {
                        tkhVar = new tkh(0L, eve.B(20), dv7.M, new wu7(1), null, 0L, 0L, 0, 0, 0L, null, 16777201);
                    } else if (iIntValue12 == 4) {
                        tkhVar2 = new tkh(d54.b(0.7f, tkhVar3.d()), eve.B(18), dv7.M, null, null, 0L, 0L, 0, 0, 0L, null, 16777208);
                    } else if (iIntValue12 == 5) {
                        break;
                    }
                    break;
                }
                break;
            case 28:
                ((Integer) obj2).getClass();
                wtk.b(x44.p0(1), (ld4) obj);
                break;
            default:
                ((uk6) obj).b = (j50) obj2;
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ lc4(int i, int i2) {
        this.E = i2;
    }
}
