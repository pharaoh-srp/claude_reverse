package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kl1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;

    public /* synthetic */ kl1(int i, zy7 zy7Var) {
        this.E = i;
        this.F = zy7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                zy7Var.a();
                break;
            case 1:
                zy7Var.a();
                break;
            case 2:
                zy7Var.a();
                break;
            case 3:
                zy7Var.a();
                break;
            case 4:
                zy7Var.a();
                break;
            case 5:
                zy7Var.a();
                break;
            case 6:
                zy7Var.a();
                break;
            case 7:
                zy7Var.a();
                break;
            case 8:
                zy7Var.a();
                break;
            case 9:
                zy7Var.a();
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                zy7Var.a();
                break;
            case 14:
                zy7Var.a();
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                zy7Var.a();
                break;
            case 16:
                zy7Var.a();
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                zy7Var.a();
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                zy7Var.a();
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                float fFloatValue = ((Number) zy7Var.a()).floatValue();
                if (fFloatValue < MTTypesetterKt.kLineSkipLimitMultiplier) {
                    fFloatValue = 0.0f;
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                zy7Var.a();
                break;
            case 21:
                zy7Var.a();
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                zy7Var.a();
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                zy7Var.a();
                break;
            case 24:
                zy7Var.a();
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                zy7Var.a();
                break;
            case 26:
                zy7Var.a();
                break;
            case 27:
                zy7Var.a();
                break;
            case 28:
                zy7Var.a();
                break;
            default:
                zy7Var.a();
                break;
        }
        return Boolean.TRUE;
    }
}
