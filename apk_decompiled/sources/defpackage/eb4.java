package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.bell.tts.f;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.types.strings.AccountId;
import java.util.Map;
import org.koin.android.error.MissingAndroidContextException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eb4 implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ eb4(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws MissingAndroidContextException {
        int i = this.E;
        zh6 zh6Var = zh6.SECONDS;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                }
                return ieiVar;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                }
                return ieiVar;
            case 4:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    iv1.b(ud0.s0, d4c.j0(R.string.guest_pass_title, e18Var5), null, null, gm3.a(e18Var5).M, e18Var5, 0, 12);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 5:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    iv1.b(ud0.I, null, null, null, 0L, e18Var6, 48, 28);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            case 6:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (!e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    e18Var7.T();
                }
                return ieiVar;
            case 7:
                ld4 ld4Var8 = (ld4) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                e18 e18Var8 = (e18) ld4Var8;
                if (!e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e18Var8.T();
                }
                return ieiVar;
            case 8:
                ld4 ld4Var9 = (ld4) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                e18 e18Var9 = (e18) ld4Var9;
                if (e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    cv8.b(a.a(ud0.g, e18Var9), "Internal Settings", null, 0L, e18Var9, 56, 12);
                } else {
                    e18Var9.T();
                }
                return ieiVar;
            case 9:
                ld4 ld4Var10 = (ld4) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                e18 e18Var10 = (e18) ld4Var10;
                if (!e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    e18Var10.T();
                }
                return ieiVar;
            case 10:
                ld4 ld4Var11 = (ld4) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                e18 e18Var11 = (e18) ld4Var11;
                if (!e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    e18Var11.T();
                }
                return ieiVar;
            case 11:
                ld4 ld4Var12 = (ld4) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                e18 e18Var12 = (e18) ld4Var12;
                if (!e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    e18Var12.T();
                }
                return ieiVar;
            case 12:
                ld4 ld4Var13 = (ld4) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                e18 e18Var13 = (e18) ld4Var13;
                if (!e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    e18Var13.T();
                }
                return ieiVar;
            case 13:
                m7f m7fVar = (m7f) obj;
                m7fVar.getClass();
                ((bsc) obj2).getClass();
                kce kceVar = jce.a;
                return new ij4(new xi4(z ? 1 : 0, (b1i) m7fVar.a(kceVar.b(b1i.class), null, null)), new yi4((swa) m7fVar.a(kceVar.b(swa.class), null, null), null), (h86) m7fVar.a(kceVar.b(h86.class), null, null));
            case 14:
                m7f m7fVar2 = (m7f) obj;
                m7fVar2.getClass();
                ((bsc) obj2).getClass();
                Context contextG = yb5.g(m7fVar2);
                kce kceVar2 = jce.a;
                return esk.f(contextG, (mc) m7fVar2.a(kceVar2.b(mc.class), null, null), (v72) m7fVar2.a(kceVar2.b(v72.class), null, null), ((rc8) m7fVar2.a(kceVar2.b(rc8.class), null, null)).o("mobile_claude_speaks") ? new c61((f) m7fVar2.a(kceVar2.b(f.class), null, null), (l45) m7fVar2.a(kceVar2.b(loi.class), null, null), yb5.g(m7fVar2)) : null);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                m7f m7fVar3 = (m7f) obj;
                m7fVar3.getClass();
                ((bsc) obj2).getClass();
                return new rt4((us4) m7fVar3.a(jce.a.b(us4.class), null, null));
            case 16:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                gdc gdcVar = new gdc();
                gdcVar.k = i25.a;
                lz1 lz1Var = uh6.F;
                gdcVar.x = blj.c(v40.Q(10, zh6Var));
                gdcVar.c(0L);
                gdcVar.z = blj.c(v40.Q(30, zh6Var));
                return new hdc(gdcVar);
            case g.MAX_FIELD_NUMBER /* 17 */:
                m7f m7fVar4 = (m7f) obj;
                m7fVar4.getClass();
                ((bsc) obj2).getClass();
                mrg mrgVar = wd6.a;
                kce kceVar3 = jce.a;
                return new tw4((h86) m7fVar4.a(kceVar3.b(h86.class), null, null), (hdc) m7fVar4.a(kceVar3.b(hdc.class), mrgVar, null));
            case g.AVG_FIELD_NUMBER /* 18 */:
                m7f m7fVar5 = (m7f) obj;
                m7fVar5.getClass();
                ((bsc) obj2).getClass();
                mrg mrgVar2 = wd6.a;
                kce kceVar4 = jce.a;
                gdc gdcVarB = ((hdc) m7fVar5.a(kceVar4.b(hdc.class), mrgVar2, null)).b();
                lz1 lz1Var2 = uh6.F;
                gdcVarB.c(v40.Q(30, zh6Var));
                return new uw4((h86) m7fVar5.a(kceVar4.b(h86.class), null, null), new hdc(gdcVarB));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                m7f m7fVar6 = (m7f) obj;
                m7fVar6.getClass();
                ((bsc) obj2).getClass();
                mrg mrgVar3 = wd6.a;
                kce kceVar5 = jce.a;
                return new vw4((hdc) m7fVar6.a(kceVar5.b(hdc.class), mrgVar3, null), (h86) m7fVar6.a(kceVar5.b(h86.class), null, null), ((m26) m7fVar6.a(kceVar5.b(m26.class), null, null)).a());
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                m7f m7fVar7 = (m7f) obj;
                m7fVar7.getClass();
                ((bsc) obj2).getClass();
                kce kceVar6 = jce.a;
                String strM949unboximpl = ((AccountId) m7fVar7.a(kceVar6.b(AccountId.class), null, null)).m949unboximpl();
                oqb oqbVar = k25.a;
                return k25.d(yb5.g(m7fVar7), strM949unboximpl, (tg9) m7fVar7.a(kceVar6.b(tg9.class), null, null), (ze0) m7fVar7.a(kceVar6.b(ze0.class), null, null), (yz8) m7fVar7.a(kceVar6.b(yz8.class), null, null));
            case 21:
                m7f m7fVar8 = (m7f) obj;
                m7fVar8.getClass();
                ((bsc) obj2).getClass();
                return (i25) m7fVar8.a(jce.a.b(x4f.class), null, null);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                m7f m7fVar9 = (m7f) obj;
                m7fVar9.getClass();
                ((bsc) obj2).getClass();
                return (eo3) m7fVar9.a(jce.a.b(x4f.class), null, null);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                m7f m7fVar10 = (m7f) obj;
                m7fVar10.getClass();
                ((bsc) obj2).getClass();
                return new tg9((bg9) m7fVar10.a(jce.a.b(bg9.class), null, null));
            case 24:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new yz8();
            case BuildConfig.VERSION_CODE /* 25 */:
                m7f m7fVar11 = (m7f) obj;
                m7fVar11.getClass();
                ((bsc) obj2).getClass();
                oqb oqbVar2 = k25.a;
                Context contextG2 = yb5.g(m7fVar11);
                kce kceVar7 = jce.a;
                tg9 tg9Var = (tg9) m7fVar11.a(kceVar7.b(tg9.class), null, null);
                ze0 ze0Var = (ze0) m7fVar11.a(kceVar7.b(ze0.class), null, null);
                yz8 yz8Var = (yz8) m7fVar11.a(kceVar7.b(yz8.class), null, null);
                for (Map.Entry entry : ((Map) ze0.f.getValue()).entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    kw9 kw9Var = ze0.f;
                    String strB = k25.b(ez1.G(str), null);
                    String strB2 = k25.b(ez1.G(str2), null);
                    if (!strB.equals(strB2)) {
                        Context context = x44.d;
                        if (context == null) {
                            sz6.j("Context not initialized");
                            return null;
                        }
                        SharedPreferences sharedPreferences = context.getSharedPreferences(strB, 0);
                        sharedPreferences.getClass();
                        Context context2 = x44.d;
                        if (context2 == null) {
                            sz6.j("Context not initialized");
                            return null;
                        }
                        SharedPreferences sharedPreferences2 = context2.getSharedPreferences(strB2, 0);
                        sharedPreferences2.getClass();
                        csg.k(sharedPreferences, sharedPreferences2);
                    }
                    Context context3 = x44.d;
                    if (context3 == null) {
                        sz6.j("Context not initialized");
                        return null;
                    }
                    context3.deleteSharedPreferences(strB);
                }
                SharedPreferences sharedPreferences3 = contextG2.getSharedPreferences(k25.b(ze0Var, null), 0);
                sharedPreferences3.getClass();
                return new x4f(new cbf(sharedPreferences3, 4, tg9Var), yz8Var);
            case 26:
                m7f m7fVar12 = (m7f) obj;
                m7fVar12.getClass();
                ((bsc) obj2).getClass();
                return (i25) m7fVar12.a(jce.a.b(x4f.class), null, null);
            case 27:
                m7f m7fVar13 = (m7f) obj;
                m7fVar13.getClass();
                ((bsc) obj2).getClass();
                return (eo3) m7fVar13.a(jce.a.b(x4f.class), null, null);
            case 28:
                m7f m7fVar14 = (m7f) obj;
                m7fVar14.getClass();
                ((bsc) obj2).getClass();
                Context contextG3 = yb5.g(m7fVar14);
                kce kceVar8 = jce.a;
                return new j25(contextG3, (tg9) m7fVar14.a(kceVar8.b(tg9.class), null, null), (yz8) m7fVar14.a(kceVar8.b(yz8.class), null, null), (ze0) m7fVar14.a(kceVar8.b(ze0.class), null, null));
            default:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new yz8();
        }
    }
}
