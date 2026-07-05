package defpackage;

import androidx.health.platform.client.proto.g;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ve implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public /* synthetic */ ve(int i, nwb nwbVar) {
        this.E = i;
        this.F = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.F;
        switch (i) {
            case 0:
                nwbVar.setValue(null);
                break;
            case 1:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 2:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 3:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 4:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 5:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 6:
                nwbVar.setValue(Boolean.valueOf(!((Boolean) nwbVar.getValue()).booleanValue()));
                break;
            case 7:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 8:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 9:
                cu9 cu9Var = (cu9) nwbVar.getValue();
                if (cu9Var == null) {
                    e39.d("Required value was null.");
                    sz6.r();
                }
                break;
            case 10:
                nwbVar.setValue(null);
                break;
            case 11:
                nwbVar.setValue(null);
                break;
            case 12:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 13:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 14:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                cu9 cu9Var2 = (cu9) nwbVar.getValue();
                if (cu9Var2 == null) {
                    e39.d("Required value was null.");
                    sz6.r();
                }
                break;
            case 16:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 21:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 24:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 26:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 27:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 28:
                nwbVar.setValue(Boolean.FALSE);
                break;
            default:
                nwbVar.setValue(Boolean.TRUE);
                break;
        }
        return ieiVar;
    }
}
