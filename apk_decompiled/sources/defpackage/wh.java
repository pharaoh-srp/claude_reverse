package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wh implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;

    public /* synthetic */ wh(int i, int i2, zy7 zy7Var) {
        this.E = i2;
        this.F = zy7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        zy7 zy7Var = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    dtj.a(d4c.j0(R.string.generic_button_done, e18Var), b.c(fqb.E, 1.0f), false, null, null, null, 0L, this.F, e18Var, 48, 124);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    tjh.b(d4c.j0(R.string.code_agent_picker_load_failed, e18Var2), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131066);
                    lnk.d(this.F, null, false, null, null, null, null, ttj.b, e18Var2, 805306368, 510);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    csg.j(this.F, null, false, null, null, null, null, yuj.a, e18Var3, 805306368, 510);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    csg.j(this.F, null, false, null, null, null, null, yuj.b, e18Var4, 805306368, 510);
                }
                break;
            case 4:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    dgj.a(6, e18Var5, zy7Var, null, true);
                }
                break;
            case 5:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    csg.j(this.F, null, false, null, null, null, null, qvj.f, e18Var6, 805306368, 510);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                com.anthropic.claude.bell.b.h(zy7Var, (ld4) obj, x44.p0(1));
                break;
            case 7:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    x2k.d(d4c.j0(R.string.ccr_attachment_load_failed, e18Var7), d4c.j0(R.string.ccr_attachment_retry, e18Var7), zy7Var, e18Var7, 0);
                }
                break;
            case 8:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    x2k.d(d4c.j0(R.string.ccr_attachment_too_large, e18Var8), d4c.j0(R.string.ccr_attachment_download_instead, e18Var8), zy7Var, e18Var8, 0);
                }
                break;
            case 9:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    e18Var9.T();
                } else {
                    dgj.b(this.F, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var9, 0, 14);
                }
                break;
            case 10:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                } else {
                    dgj.b(this.F, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var10, 0, 14);
                }
                break;
            case 11:
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    e18Var11.T();
                } else {
                    dtj.a(d4c.j0(R.string.generic_disconnect, e18Var11), null, false, null, f12.a, y02.a, 0L, this.F, e18Var11, 221184, 78);
                }
                break;
            case 12:
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    e18Var12.T();
                } else {
                    dgj.b(this.F, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var12, 0, 14);
                }
                break;
            case 13:
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e18Var13.T();
                } else {
                    tqh.T.w(null, null, this.F, e18Var13, 3072, 3);
                }
                break;
            case 14:
                ld4 ld4Var14 = (ld4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e18Var14.T();
                } else {
                    zy7 zy7Var2 = this.F;
                    if (zy7Var2 == null) {
                        e18Var14.a0(2068886365);
                        e18Var14.p(false);
                    } else {
                        e18Var14.a0(2068499082);
                        ez1.e(zy7Var2, null, false, null, null, ljk.a, e18Var14, 1572864, 62);
                        e18Var14.p(false);
                    }
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var15 = (ld4) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                e18 e18Var15 = (e18) ld4Var15;
                if (!e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    e18Var15.T();
                } else {
                    ta4 ta4VarQ0 = fd9.q0(-1788376197, new wh(16, zy7Var), e18Var15);
                    qnc qncVar = n2i.a;
                    long j = gm3.a(e18Var15).o;
                    long j2 = d54.h;
                    m2i m2iVarB = n2i.b(((gwa) e18Var15.j(jwa.a)).a);
                    eg0.a(wjk.a, null, ta4VarQ0, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, m2iVarB.a(j, (60 & 2) != 0 ? m2iVarB.b : j2, (60 & 4) != 0 ? m2iVarB.c : j2, (60 & 8) != 0 ? m2iVarB.d : j2, (60 & 16) != 0 ? m2iVarB.e : j2, m2iVarB.f), null, e18Var15, 390, 442);
                }
                break;
            case 16:
                ld4 ld4Var16 = (ld4) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                e18 e18Var16 = (e18) ld4Var16;
                if (!e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    e18Var16.T();
                } else {
                    dgj.b(this.F, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var16, 0, 14);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var17 = (ld4) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                e18 e18Var17 = (e18) ld4Var17;
                if (!e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    e18Var17.T();
                } else {
                    trk.a(0, 6, e18Var17, this.F, null, false);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ld4 ld4Var18 = (ld4) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                e18 e18Var18 = (e18) ld4Var18;
                if (!e18Var18.Q(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    e18Var18.T();
                } else {
                    h66.m(zy7Var, e18Var18, 0);
                }
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ld4 ld4Var19 = (ld4) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                e18 e18Var19 = (e18) ld4Var19;
                if (!e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    e18Var19.T();
                } else {
                    h66.v(zy7Var, e18Var19, 0);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var20 = (ld4) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                e18 e18Var20 = (e18) ld4Var20;
                if (!e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    e18Var20.T();
                } else {
                    h66.g(zy7Var, e18Var20, 0);
                }
                break;
            case 21:
                ld4 ld4Var21 = (ld4) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                e18 e18Var21 = (e18) ld4Var21;
                if (!e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    e18Var21.T();
                } else {
                    lnk.d(this.F, null, false, null, null, null, null, skk.h, e18Var21, 805306368, 510);
                }
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                h66.f(zy7Var, (ld4) obj, x44.p0(1));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ld4 ld4Var22 = (ld4) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                e18 e18Var22 = (e18) ld4Var22;
                if (!e18Var22.Q(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    e18Var22.T();
                } else {
                    h66.c(zy7Var, e18Var22, 0);
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                rkj.b(zy7Var, (ld4) obj, x44.p0(1));
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ld4 ld4Var23 = (ld4) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                e18 e18Var23 = (e18) ld4Var23;
                if (!e18Var23.Q(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    e18Var23.T();
                } else {
                    trk.a(0, 6, e18Var23, this.F, null, false);
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                pd8.i(zy7Var, (ld4) obj, x44.p0(7));
                break;
            case 27:
                ld4 ld4Var24 = (ld4) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                e18 e18Var24 = (e18) ld4Var24;
                if (!e18Var24.Q(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    e18Var24.T();
                } else {
                    lnk.d(this.F, null, false, null, null, null, null, dmk.d, e18Var24, 805306368, 510);
                }
                break;
            case 28:
                ld4 ld4Var25 = (ld4) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                e18 e18Var25 = (e18) ld4Var25;
                if (!e18Var25.Q(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    e18Var25.T();
                } else {
                    trk.a(0, 6, e18Var25, this.F, null, false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                hvk.a(zy7Var, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ wh(int i, zy7 zy7Var) {
        this.E = i;
        this.F = zy7Var;
    }
}
