package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import java.util.Locale;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yi7 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;

    public /* synthetic */ yi7(String str, int i) {
        this.E = i;
        this.F = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        eo0 eo0Var = ko0.c;
        fqb fqbVar = fqb.E;
        String str = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else if (str == null) {
                    e18Var.a0(-1868857226);
                    cv8.b(a.a(ud0.l0, e18Var), null, null, gm3.a(e18Var).k, e18Var, 56, 4);
                    e18Var.p(false);
                } else {
                    e18Var.a0(-1868922016);
                    bj7.b(str, e18Var, 0);
                    e18Var.p(false);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                bj7.b(str, (ld4) obj, x44.p0(1));
                break;
            case 2:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    bj7.h(0, 2, e18Var2, null, str);
                }
                break;
            case 3:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    bj7.b(str, e18Var3, 0);
                }
                break;
            case 4:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    boolean zF = e18Var4.f(str);
                    Object objN = e18Var4.N();
                    if (zF || objN == jd4.a) {
                        objN = str.toUpperCase(Locale.ROOT);
                        objN.getClass();
                        e18Var4.k0(objN);
                    }
                    tjh.b((String) objN, gb9.K(fqbVar, 6.0f, 2.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((jm3) gm3.c(e18Var4).e.E).l, e18Var4, 48, 24576, 114684);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                prk.b(str, (ld4) obj, x44.p0(1));
                break;
            case 6:
                ((Integer) obj).intValue();
                n18 n18Var = (n18) obj2;
                n18Var.getClass();
                break;
            case 7:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    pd8.d(str, e18Var5, 0);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                pd8.d(str, (ld4) obj, x44.p0(1));
                break;
            case 9:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (!e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    e18Var6.T();
                } else {
                    iqb iqbVarB0 = mpk.b0(fqbVar, mpk.Y(e18Var6), true);
                    q64 q64VarA = p64.a(eo0Var, lja.S, e18Var6, 0);
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
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var6, 0, 0, 262142);
                    e18Var6.p(true);
                }
                break;
            case 10:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                } else {
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var7, 0, 0, 262142);
                }
                break;
            case 11:
                ((Integer) obj).intValue();
                n36 n36Var = (n36) obj2;
                n36Var.getClass();
                break;
            case 12:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                } else {
                    k4g.a.c(str, null, e18Var8, 384);
                }
                break;
            case 13:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (!e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    e18Var9.T();
                } else {
                    tjh.b(this.F, trk.i(fqbVar, e18Var9, 1), gm3.a(e18Var9).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var9).e.F).i, e18Var9, 0, 0, 131064);
                }
                break;
            case 14:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                } else {
                    tjh.b(d4c.k0(R.string.mcp_prefill_replace_dialog_title, new Object[]{str}, e18Var10), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var10).e.E).g, e18Var10, 0, 0, 131070);
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    e18Var11.T();
                } else {
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var11).e.E).e, e18Var11, 0, 24960, 110590);
                }
                break;
            case 16:
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    e18Var12.T();
                } else {
                    k4g.a.b(str, null, e18Var12, 384);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e18Var13.T();
                } else {
                    tjh.b(d4c.k0(R.string.memory_file_delete_confirm_title, new Object[]{str}, e18Var13), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var13, 0, 0, 262142);
                }
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((Integer) obj2).getClass();
                yeb.e(str, (ld4) obj, x44.p0(1));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ld4 ld4Var14 = (ld4) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                e18 e18Var14 = (e18) ld4Var14;
                if (!e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    e18Var14.T();
                } else {
                    tjh.b(this.F, null, c0l.g(0L, 0L, 0L, 0L, 0L, e18Var14, 63).c, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((jm3) gm3.c(e18Var14).e.E).g, e18Var14, 0, 24960, 110586);
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ld4 ld4Var15 = (ld4) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                e18 e18Var15 = (e18) ld4Var15;
                if (!e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    e18Var15.T();
                } else {
                    tjh.b(this.F, null, c0l.g(0L, 0L, 0L, 0L, 0L, e18Var15, 63).a, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var15).e.E).e, e18Var15, 0, 24960, 110586);
                }
                break;
            case 21:
                ((Integer) obj2).getClass();
                kkc.d(str, (ld4) obj, x44.p0(1));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ld4 ld4Var16 = (ld4) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                e18 e18Var16 = (e18) ld4Var16;
                if (!e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    e18Var16.T();
                } else {
                    k4g.a.b(str, null, e18Var16, 384);
                }
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ld4 ld4Var17 = (ld4) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                e18 e18Var17 = (e18) ld4Var17;
                if (!e18Var17.Q(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    e18Var17.T();
                } else {
                    com.anthropic.claude.project.details.g.c(str, e18Var17, 0);
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                com.anthropic.claude.project.details.g.c(str, (ld4) obj, x44.p0(1));
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((Integer) obj2).getClass();
                cjk.b(str, (ld4) obj, x44.p0(1));
                break;
            case 26:
                ld4 ld4Var18 = (ld4) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                e18 e18Var18 = (e18) ld4Var18;
                if (!e18Var18.Q(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    e18Var18.T();
                } else {
                    iqb iqbVarC = b.c(mpk.b0(fqbVar, mpk.Y(e18Var18), true), 1.0f);
                    q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var18, 0);
                    int iHashCode2 = Long.hashCode(e18Var18.T);
                    hyc hycVarL2 = e18Var18.l();
                    iqb iqbVarE2 = kxk.E(e18Var18, iqbVarC);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var18.e0();
                    if (e18Var18.S) {
                        e18Var18.k(re4Var2);
                    } else {
                        e18Var18.n0();
                    }
                    d4c.i0(e18Var18, cd4.f, q64VarA2);
                    d4c.i0(e18Var18, cd4.e, hycVarL2);
                    d4c.i0(e18Var18, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var18, cd4.h);
                    d4c.i0(e18Var18, cd4.d, iqbVarE2);
                    tjh.b(d4c.k0(R.string.remote_image_dialog_description, new Object[]{str}, e18Var18), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkh.b((tkh) e18Var18.j(tjh.a), 0L, 0L, null, null, null, 0L, null, 0, 0L, null, e5a.d, 14680063), e18Var18, 0, 0, 131070);
                    e18Var18.p(true);
                }
                break;
            case 27:
                ld4 ld4Var19 = (ld4) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                e18 e18Var19 = (e18) ld4Var19;
                if (!e18Var19.Q(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    e18Var19.T();
                } else {
                    iv1.b(ud0.M1, this.F, null, null, 0L, e18Var19, 0, 28);
                }
                break;
            case 28:
                ld4 ld4Var20 = (ld4) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                e18 e18Var20 = (e18) ld4Var20;
                if (!e18Var20.Q(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    e18Var20.T();
                } else {
                    tjh.b(this.F, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var20, 0, 0, 262142);
                }
                break;
            default:
                ld4 ld4Var21 = (ld4) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                e18 e18Var21 = (e18) ld4Var21;
                if (!e18Var21.Q(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    e18Var21.T();
                } else {
                    k4g.a.c(str, null, e18Var21, 384);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ yi7(String str, int i, int i2) {
        this.E = i2;
        this.F = str;
    }
}
