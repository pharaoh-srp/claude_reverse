package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qy4 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ qy4(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = 0;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.p(ekfVar, 0);
                return ieiVar;
            case 1:
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                ckf.p(ekfVar2, 0);
                return ieiVar;
            case 2:
                ekf ekfVar3 = (ekf) obj;
                ekfVar3.getClass();
                ckf.p(ekfVar3, 0);
                return ieiVar;
            case 3:
                char[] cArr = (char[]) obj;
                cArr.getClass();
                return new String(cArr);
            case 4:
                t45 t45Var = (t45) obj;
                t45Var.getClass();
                return t45Var.F + "-" + t45Var.E;
            case 5:
                ((ekf) obj).getClass();
                return ieiVar;
            case 6:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sb.append(value);
                return sb.toString();
            case 7:
                qnc qncVar = rl5.a;
                return ieiVar;
            case 8:
                int i3 = 12;
                v8f v8fVar = new v8f(new h85(i3), new h85(i3), false);
                wn9[] wn9VarArr = ckf.a;
                dkf dkfVar = akf.v;
                wn9 wn9Var = ckf.a[12];
                ((ekf) obj).a(dkfVar, v8fVar);
                return ieiVar;
            case 9:
                qnc qncVar2 = cn5.a;
                return ieiVar;
            case 10:
                wn9[] wn9VarArr2 = ckf.a;
                dkf dkfVar2 = akf.m;
                wn9 wn9Var2 = ckf.a[5];
                ((ekf) obj).a(dkfVar2, Boolean.TRUE);
                return ieiVar;
            case 11:
                wn9[] wn9VarArr3 = ckf.a;
                dkf dkfVar3 = akf.m;
                wn9 wn9Var3 = ckf.a[5];
                ((ekf) obj).a(dkfVar3, Boolean.TRUE);
                return ieiVar;
            case 12:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 13:
                List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new xs5(iIntValue, ((Float) obj3).floatValue(), new ws5(list, i2));
            case 14:
                ((ekf) obj).getClass();
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((ekf) obj).getClass();
                return ieiVar;
            case 16:
                ckf.y((ekf) obj);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ((n36) obj).b;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((b3d) obj).getClass();
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                f3a f3aVar = (f3a) obj;
                f3aVar.getClass();
                return new cpc(Double.valueOf(f3aVar.a()), "meters");
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ekf ekfVar4 = (ekf) obj;
                ekfVar4.getClass();
                ckf.f(ekfVar4);
                return ieiVar;
            case 21:
                pf6 pf6Var = (pf6) obj;
                pf6Var.getClass();
                return pf6Var.E;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ekf ekfVar5 = (ekf) obj;
                ekfVar5.getClass();
                ckf.s(ekfVar5, 6);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((String) obj).getClass();
                return ieiVar;
            case 24:
                f3a f3aVar2 = (f3a) obj;
                f3aVar2.getClass();
                return new cpc(Double.valueOf(f3aVar2.a()), "meters");
            case BuildConfig.VERSION_CODE /* 25 */:
                ((String) obj).getClass();
                return ieiVar;
            case 26:
                return Integer.valueOf(((t45) obj).E);
            case 27:
                return ((t45) obj).F;
            case 28:
                return Integer.valueOf(((t45) obj).E);
            default:
                return ((t45) obj).F;
        }
    }
}
