package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.List;
import kotlinx.serialization.json.JsonObject;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r2i implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ r2i(yai yaiVar) {
        this.E = 5;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                List list = (List) obj;
                break;
            case 1:
                yn6 yn6Var = (yn6) obj;
                yn6Var.getClass();
                break;
            case 2:
                jz0 jz0Var = (jz0) obj;
                jz0Var.getClass();
                break;
            case 3:
                jz0 jz0Var2 = (jz0) obj;
                jz0Var2.getClass();
                break;
            case 4:
                List list2 = (List) obj;
                break;
            case 5:
                jo9 jo9Var = (jo9) obj;
                jo9Var.getClass();
                lo9 lo9Var = jo9Var.a;
                if (lo9Var != null) {
                    eo9 eo9Var = jo9Var.b;
                    yai yaiVar = eo9Var instanceof yai ? (yai) eo9Var : null;
                    String strA = yaiVar != null ? yaiVar.a(true) : String.valueOf(eo9Var);
                    int iOrdinal = lo9Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                wg6.i();
                            }
                        }
                    }
                    break;
                }
                break;
            case 6:
                oh3 oh3Var = (oh3) obj;
                oh3Var.getClass();
                srg srgVar = srg.a;
                oh3Var.a("type", srg.b);
                oh3Var.a("body", JsonObject.INSTANCE.serializer().getDescriptor());
                break;
            case 7:
                ((ekf) obj).getClass();
                break;
            case 10:
                break;
            case 11:
                api apiVar = (api) obj;
                apiVar.getClass();
                uvk.e(apiVar, ':');
                api.k(apiVar);
                break;
            case 12:
                api apiVar2 = (api) obj;
                apiVar2.getClass();
                api.k(apiVar2);
                break;
            case 13:
                api apiVar3 = (api) obj;
                apiVar3.getClass();
                apiVar3.b().g(new gl4("z"));
                break;
            case 14:
                api apiVar4 = (api) obj;
                apiVar4.getClass();
                uvk.h(apiVar4, "Z", new r2i(17));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                api apiVar5 = (api) obj;
                apiVar5.getClass();
                apiVar5.b().g(new gl4("z"));
                break;
            case 16:
                api apiVar6 = (api) obj;
                apiVar6.getClass();
                uvk.h(apiVar6, "Z", new r2i(18));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                api apiVar7 = (api) obj;
                apiVar7.getClass();
                api.i(apiVar7);
                uvk.e(apiVar7, ':');
                api.j(apiVar7);
                uvk.h(apiVar7, "", new r2i(11));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                api apiVar8 = (api) obj;
                apiVar8.getClass();
                api.i(apiVar8);
                uvk.h(apiVar8, "", new r2i(19));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                api apiVar9 = (api) obj;
                apiVar9.getClass();
                api.j(apiVar9);
                uvk.h(apiVar9, "", new r2i(12));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                og9 og9Var = (og9) obj;
                og9Var.getClass();
                og9Var.j = true;
                break;
            case 21:
                ((String) obj).getClass();
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((vsa) obj).getClass();
                wjk.p("onOpenLocation");
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((List) obj).getClass();
                wjk.p("onOpenRoute");
                break;
            case 24:
                ((String) obj).getClass();
                wjk.p("onSendMessage");
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((String) obj).getClass();
                wjk.p("onBrowserTakeOver");
                break;
            case 26:
                ((String) obj).getClass();
                wjk.p("onOpenFile");
                break;
            case 27:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.e(ekfVar);
                break;
        }
        return Integer.valueOf(-((Integer) obj).intValue());
    }

    public /* synthetic */ r2i(int i) {
        this.E = i;
    }
}
