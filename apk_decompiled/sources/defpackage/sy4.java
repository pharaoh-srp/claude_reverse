package defpackage;

import androidx.health.platform.client.proto.g;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sy4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public /* synthetic */ sy4(int i, nwb nwbVar) {
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
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 1:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 2:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 3:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 4:
                nwbVar.setValue(null);
                break;
            case 5:
                nwbVar.setValue(null);
                break;
            case 6:
                nwbVar.setValue(null);
                break;
            case 7:
                nwbVar.setValue(null);
                break;
            case 8:
                nwbVar.setValue(null);
                break;
            case 9:
                nwbVar.setValue(Boolean.valueOf(!((Boolean) nwbVar.getValue()).booleanValue()));
                break;
            case 10:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 11:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 12:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 13:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 14:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 16:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                nwbVar.setValue(ieiVar);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 21:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 24:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 26:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 27:
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 28:
                nwbVar.setValue(Boolean.TRUE);
                break;
            default:
                nwbVar.setValue(null);
                break;
        }
        return ieiVar;
    }
}
