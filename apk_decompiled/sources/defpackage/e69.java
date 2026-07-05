package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.List;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e69 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ e69(int i, p0a p0aVar) {
        this.E = 10;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                char cCharValue = ((Character) obj).charValue();
                break;
            case 1:
                List list = (List) obj;
                list.getClass();
                if (list.size() != 2) {
                }
                break;
            case 2:
                ((i90) obj).getClass();
                break;
            case 3:
                dmg dmgVar = (dmg) obj;
                dmgVar.getClass();
                break;
            case 4:
                br9 br9Var = (br9) obj;
                br9Var.getClass();
                break;
            case 5:
                ova ovaVar = (ova) obj;
                ovaVar.getClass();
                String str = (String) ht9.i.get(((mva) ovaVar.a()).get(1));
                if (str == null) {
                    str = (String) ((mva) ovaVar.a()).get(1);
                }
                break;
            case 6:
                Map map = cw9.a;
                break;
            case 7:
                List list2 = (List) obj;
                break;
            case 8:
                ((Integer) obj).getClass();
                dx9 dx9Var = ox9.a;
                break;
            case 9:
                ((Integer) obj).getClass();
                dx9 dx9Var2 = ox9.a;
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                k7a k7aVar = (k7a) obj;
                k7aVar.getClass();
                j8 j8Var = k7aVar.l;
                if (j8Var instanceof k7a) {
                }
                break;
            case 14:
                k7a k7aVar2 = (k7a) obj;
                k7aVar2.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(k7aVar2.j);
                sb.append('=');
                sb.append(k7aVar2.k);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.s(ekfVar, 0);
                break;
            case 16:
                ((ekf) obj).getClass();
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                ckf.f(ekfVar2);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ekf ekfVar3 = (ekf) obj;
                ekfVar3.getClass();
                ckf.e(ekfVar3);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ida idaVar = (ida) obj;
                idaVar.getClass();
                uvk.e(idaVar, 't');
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ida idaVar2 = (ida) obj;
                idaVar2.getClass();
                uvk.e(idaVar2, 'T');
                break;
            case 21:
                ((fn5) obj).getClass();
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                fn5 fn5Var = (fn5) obj;
                fn5Var.getClass();
                uvk.e(fn5Var, ':');
                ((t4) fn5Var).d(new xe1(new mef(fnc.E)));
                uvk.h(fn5Var, "", new e69(23));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                fn5 fn5Var2 = (fn5) obj;
                fn5Var2.getClass();
                uvk.e(fn5Var2, '.');
                ((t4) fn5Var2).d(new xe1(new zw7()));
                break;
            case 24:
                ((ekf) obj).getClass();
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ekf ekfVar4 = (ekf) obj;
                ekfVar4.getClass();
                ckf.p(ekfVar4, 0);
                break;
            case 26:
                cz5 cz5Var = (cz5) obj;
                cz5Var.getClass();
                break;
            case 27:
                cz5 cz5Var2 = (cz5) obj;
                cz5Var2.getClass();
                break;
            case 28:
                ((fua) obj).getClass();
                break;
            default:
                ((fua) obj).getClass();
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ e69(int i) {
        this.E = i;
    }
}
