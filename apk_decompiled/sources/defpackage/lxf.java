package defpackage;

import androidx.health.platform.client.proto.g;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lxf implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public /* synthetic */ lxf(int i, nwb nwbVar) {
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
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 1:
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            case 2:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 3:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 4:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 5:
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            case 6:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 7:
                nwbVar.setValue(null);
                return ieiVar;
            case 8:
                nwbVar.setValue("custom");
                return ieiVar;
            case 9:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 10:
                nwbVar.setValue(Boolean.valueOf(!((Boolean) nwbVar.getValue()).booleanValue()));
                return ieiVar;
            case 11:
                nwbVar.setValue(Boolean.valueOf(!((Boolean) nwbVar.getValue()).booleanValue()));
                return ieiVar;
            case 12:
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            case 13:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 14:
                nwbVar.setValue(Boolean.valueOf(!((Boolean) nwbVar.getValue()).booleanValue()));
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                nwbVar.setValue(Boolean.FALSE);
                return Boolean.TRUE;
            case 16:
                Boolean bool = Boolean.TRUE;
                nwbVar.setValue(bool);
                return bool;
            case g.MAX_FIELD_NUMBER /* 17 */:
                nwbVar.setValue(Boolean.valueOf(!((Boolean) nwbVar.getValue()).booleanValue()));
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            case 21:
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 24:
                nwbVar.setValue(Boolean.valueOf(!((Boolean) nwbVar.getValue()).booleanValue()));
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                nwbVar.setValue(Boolean.valueOf(!((Boolean) nwbVar.getValue()).booleanValue()));
                return ieiVar;
            case 26:
                nwbVar.setValue(Boolean.valueOf(!((Boolean) nwbVar.getValue()).booleanValue()));
                return ieiVar;
            case 27:
                nwbVar.setValue(null);
                return ieiVar;
            case 28:
                return (cu9) nwbVar.getValue();
            default:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
        }
    }
}
