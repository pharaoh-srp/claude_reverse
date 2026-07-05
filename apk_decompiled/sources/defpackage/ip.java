package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ip implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ iqb G;

    public /* synthetic */ ip(iqb iqbVar, String str) {
        this.E = 16;
        this.F = str;
        this.G = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iqb iqbVar = this.G;
        iei ieiVar = iei.a;
        String str = this.F;
        ld4 ld4Var = (ld4) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                gok.b(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 1:
                num.getClass();
                yuk.a(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 2:
                num.getClass();
                xzk.b(str, iqbVar, ld4Var, x44.p0(49));
                break;
            case 3:
                num.getClass();
                q22.c(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 4:
                num.getClass();
                nuj.i(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 5:
                num.getClass();
                fhk.a(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 6:
                num.getClass();
                fhk.a(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 7:
                num.getClass();
                gmk.b(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 8:
                num.getClass();
                g34.f(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 9:
                num.getClass();
                wi4.d(str, iqbVar, ld4Var, x44.p0(49));
                break;
            case 10:
                num.getClass();
                osk.f(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 11:
                num.getClass();
                zsk.b(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 12:
                num.getClass();
                fuk.f(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 13:
                num.getClass();
                zoa.b(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 14:
                num.getClass();
                twj.d(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                num.getClass();
                x2k.f(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case 16:
                int iIntValue = num.intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    pvj.b(a.a(ud0.l1, e18Var), d4c.k0(R.string.empty_state_search_title, new Object[]{str}, e18Var), this.G, null, e18Var, 8, 8);
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                num.getClass();
                npf.d(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                num.getClass();
                v40.g(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                num.getClass();
                vtk.e(str, iqbVar, ld4Var, x44.p0(1));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                num.getClass();
                ytk.e(str, iqbVar, ld4Var, x44.p0(49));
                break;
            case 21:
                num.getClass();
                puk.d(str, iqbVar, ld4Var, x44.p0(49));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                num.getClass();
                wb5.b(str, iqbVar, ld4Var, x44.p0(1));
                break;
            default:
                num.getClass();
                wjk.d(str, iqbVar, ld4Var, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ip(String str, iqb iqbVar, int i, int i2) {
        this.E = i2;
        this.F = str;
        this.G = iqbVar;
    }
}
