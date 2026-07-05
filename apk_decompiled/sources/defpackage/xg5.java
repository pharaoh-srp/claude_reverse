package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.types.strings.AppSessionId;
import java.util.LinkedHashMap;
import java.util.Locale;
import okio.FileSystem;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg5 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ xg5(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String value;
        String value2;
        int i = this.E;
        int i2 = 8;
        int i3 = 1;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                oqb oqbVar = (oqb) obj;
                oqbVar.getClass();
                xg5 xg5Var = new xg5(3);
                oqb oqbVar2 = new oqb();
                xg5Var.invoke(oqbVar2);
                b54.u0(oqbVar.e, new oqb[]{oqbVar2});
                z35 z35Var = new z35(i2);
                kce kceVar = jce.a;
                pl9 pl9VarB = kceVar.b(FileSystem.class);
                mrg mrgVar = dpf.K;
                kq9 kq9Var = kq9.E;
                oqbVar.a(new t7g(new qh1(mrgVar, pl9VarB, null, z35Var, kq9Var)));
                sq6.C(new qh1(mrgVar, kceVar.b(v4d.class), null, new z35(9), kq9Var), oqbVar);
                break;
            case 1:
                oqb oqbVar3 = (oqb) obj;
                oqbVar3.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(coi.class), null, new z35(11), kq9.E), oqbVar3);
                break;
            case 2:
                oqb oqbVar4 = (oqb) obj;
                oqbVar4.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(tf5.class), null, new z35(10), kq9.E), oqbVar4);
                break;
            case 3:
                oqb oqbVar5 = (oqb) obj;
                oqbVar5.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(tf5.class), null, new z35(12), kq9.E), oqbVar5);
                break;
            case 4:
                oqb oqbVar6 = (oqb) obj;
                oqbVar6.getClass();
                LinkedHashMap linkedHashMap = oqbVar6.c;
                zb5 zb5Var = new zb5(4);
                kce kceVar2 = jce.a;
                pl9 pl9VarB2 = kceVar2.b(qk5.class);
                mrg mrgVar2 = dpf.K;
                kq9 kq9Var2 = kq9.E;
                oqbVar6.a(new t7g(new qh1(mrgVar2, pl9VarB2, null, zb5Var, kq9Var2)));
                t7g t7gVarO = sq6.o(new qh1(mrgVar2, kceVar2.b(wj5.class), null, new zb5(5), kq9Var2), oqbVar6);
                pl9 pl9VarB3 = kceVar2.b(k4i.class);
                qh1 qh1Var = t7gVarO.a;
                qh1Var.f = w44.b1(qh1Var.f, pl9VarB3);
                rzd rzdVar = qh1Var.c;
                rzd rzdVar2 = qh1Var.a;
                StringBuilder sb = new StringBuilder();
                sq6.D(pl9VarB3, sb, ':');
                String str = "";
                if (rzdVar == null || (value = rzdVar.getValue()) == null) {
                    value = "";
                }
                linkedHashMap.put(sq6.w(sb, value, ':', rzdVar2), t7gVarO);
                oqbVar6.a(new t7g(new qh1(mrgVar2, kceVar2.b(ck5.class), null, new zb5(6), kq9Var2)));
                oqbVar6.a(new t7g(new qh1(mrgVar2, kceVar2.b(pk5.class), null, new zb5(7), kq9Var2)));
                t7g t7gVarO2 = sq6.o(new qh1(mrgVar2, kceVar2.b(uk5.class), null, new zb5(i2), kq9Var2), oqbVar6);
                pl9 pl9VarB4 = kceVar2.b(fch.class);
                qh1 qh1Var2 = t7gVarO2.a;
                qh1Var2.f = w44.b1(qh1Var2.f, pl9VarB4);
                rzd rzdVar3 = qh1Var2.c;
                rzd rzdVar4 = qh1Var2.a;
                StringBuilder sb2 = new StringBuilder();
                sq6.D(pl9VarB4, sb2, ':');
                if (rzdVar3 != null && (value2 = rzdVar3.getValue()) != null) {
                    str = value2;
                }
                linkedHashMap.put(sq6.w(sb2, str, ':', rzdVar4), t7gVarO2);
                sq6.C(new qh1(mrgVar2, kceVar2.b(bl5.class), null, new z35(14), kq9Var2), oqbVar6);
                break;
            case 5:
                ckf.y((ekf) obj);
                break;
            case 6:
                oqb oqbVar7 = (oqb) obj;
                oqbVar7.getClass();
                ij0.v(new qh1(dpf.K, jce.a.b(m26.class), null, new z35(15), kq9.F), oqbVar7);
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                float fFloatValue = ((Float) obj).floatValue();
                int i4 = gzb.a;
                break;
            case 10:
                break;
            case 11:
                og9 og9Var = (og9) obj;
                og9Var.getClass();
                og9Var.c = true;
                break;
            case 12:
                oqb oqbVar8 = (oqb) obj;
                oqbVar8.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(zf6.class), null, new z35(17), kq9.E), oqbVar8);
                break;
            case 13:
                rf6 rf6Var = (rf6) obj;
                rf6Var.getClass();
                break;
            case 14:
                rf6 rf6Var2 = (rf6) obj;
                rf6Var2.getClass();
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
                oqb oqbVar9 = (oqb) obj;
                oqbVar9.getClass();
                kce kceVar3 = jce.a;
                xai xaiVar = new xai(kceVar3.b(zni.class));
                sq6.E(new qh1(xaiVar, kceVar3.b(x97.class), null, new z35(19), kq9.G), oqbVar9);
                oqbVar9.d.add(xaiVar);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((Boolean) obj).getClass();
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                break;
            case 24:
                String str2 = (String) obj;
                str2.getClass();
                String strValueOf = String.valueOf(bsg.B0(str2));
                strValueOf.getClass();
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                oqb oqbVar10 = (oqb) obj;
                oqbVar10.getClass();
                mrg mrgVar3 = mg7.a;
                gg7 gg7Var = new gg7(0);
                kce kceVar4 = jce.a;
                pl9 pl9VarB5 = kceVar4.b(vg5.class);
                mrg mrgVar4 = dpf.K;
                kq9 kq9Var3 = kq9.E;
                sq6.C(new qh1(mrgVar4, pl9VarB5, mrgVar3, gg7Var, kq9Var3), oqbVar10);
                oqbVar10.a(new t7g(new qh1(mrgVar4, kceVar4.b(AppSessionId.class), null, d8.G, kq9Var3)));
                sq6.C(new qh1(mrgVar4, kceVar4.b(m78.class), null, new gg7(i3), kq9Var3), oqbVar10);
                break;
            case 26:
                bg7 bg7Var = (bg7) obj;
                if (bg7Var != null) {
                    bg7Var.close();
                }
                break;
            case 27:
                rc8 rc8Var = (rc8) obj;
                if (rc8Var != null) {
                    rc8Var.p();
                }
                break;
            case 28:
                oqb oqbVar11 = (oqb) obj;
                oqbVar11.getClass();
                kce kceVar5 = jce.a;
                xai xaiVar2 = new xai(kceVar5.b(j8.class));
                z35 z35Var2 = new z35(28);
                pl9 pl9VarB6 = kceVar5.b(sc8.class);
                kq9 kq9Var4 = kq9.G;
                oqbVar11.a(new w7f(new qh1(xaiVar2, pl9VarB6, null, z35Var2, kq9Var4)));
                sq6.E(new qh1(xaiVar2, kceVar5.b(of7.class), null, new z35(29), kq9Var4), oqbVar11);
                oqbVar11.d.add(xaiVar2);
                break;
            default:
                oqb oqbVar12 = (oqb) obj;
                oqbVar12.getClass();
                kce kceVar6 = jce.a;
                xai xaiVar3 = new xai(kceVar6.b(zni.class));
                z35 z35Var3 = new z35(25);
                pl9 pl9VarB7 = kceVar6.b(bg7.class);
                kq9 kq9Var5 = kq9.G;
                qh1 qh1Var3 = new qh1(xaiVar3, pl9VarB7, null, z35Var3, kq9Var5);
                oqbVar12.a(new w7f(qh1Var3));
                int i5 = 26;
                qh1Var3.g = new p92(new xg5(i5));
                qh1 qh1Var4 = new qh1(xaiVar3, kceVar6.b(rc8.class), null, new z35(i5), kq9Var5);
                oqbVar12.a(new w7f(qh1Var4));
                int i6 = 27;
                qh1Var4.g = new p92(new xg5(i6));
                sq6.E(new qh1(xaiVar3, kceVar6.b(nf7.class), null, new z35(i6), kq9Var5), oqbVar12);
                oqbVar12.d.add(xaiVar3);
                break;
        }
        return ieiVar;
    }
}
