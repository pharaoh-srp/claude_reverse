package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.messages.ApiHelpline;
import com.anthropic.claude.chat.share.k;
import java.util.List;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qte implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ qte(int i) {
        this.E = 15;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                e18 e18Var = (e18) ((ld4) obj);
                e18Var.a0(-333154667);
                tkh tkhVar = (tkh) e18Var.j(bte.a);
                e18Var.p(false);
                break;
            case 1:
                ((List) obj).getClass();
                ((List) obj2).getClass();
                break;
            case 2:
                ((vk6) obj).c = (q68) obj2;
                break;
            case 3:
                ((vk6) obj).e = ((rt) obj2).a;
                break;
            case 4:
                ((vk6) obj).d = ((pt) obj2).a;
                break;
            case 5:
                i5d i5dVar = (i5d) obj2;
                Boolean boolValueOf = Boolean.valueOf(i5dVar.a);
                y5f y5fVar = c6f.a;
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                hkh hkhVar = (hkh) obj2;
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                ((btf) obj).getClass();
                cpc[] cpcVarArr = {new cpc("KEY", ((wm0) obj2).a)};
                vf3 vf3Var = new vf3(1);
                cpc cpcVar = cpcVarArr[0];
                vf3Var.d((String) cpcVar.E, cpcVar.F);
                break;
            case 12:
                ((String) obj).getClass();
                ((ApiHelpline) obj2).getClass();
                k.c("onShowHelplines");
                break;
            case 13:
                ((String) obj).getClass();
                k.c("onExpandCodeBlock");
                break;
            case 14:
                ((String) obj).getClass();
                ((List) obj2).getClass();
                k.c("onViewSearchSources");
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Integer) obj2).getClass();
                etj.h(x44.p0(1), (ld4) obj);
                break;
            case 16:
                ((Integer) obj2).getClass();
                e18 e18Var2 = (e18) ((ld4) obj);
                e18Var2.a0(-1793801499);
                om7 om7Var = new om7();
                e18Var2.p(false);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((wk6) obj).c = ((za6) obj2).a;
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((wk6) obj).d = (v8g) obj2;
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((xk6) obj).a = (q68) obj2;
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                break;
            case 21:
                ((Integer) obj).getClass();
                b9h b9hVar = (b9h) obj2;
                b9hVar.getClass();
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                break;
            case 24:
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                break;
            case 26:
                ((yk6) obj).a = (String) obj2;
                break;
            case 27:
                ((yk6) obj).d = (q68) obj2;
                break;
            case 28:
                ((yk6) obj).b = (skh) obj2;
                break;
            default:
                ((yk6) obj).c = ((Integer) obj2).intValue();
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qte(byte b, int i) {
        this.E = i;
    }
}
