package defpackage;

import androidx.health.platform.client.proto.g;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pn implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ pn(zy7 zy7Var, nwb nwbVar, int i) {
        this.E = i;
        this.F = zy7Var;
        this.G = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.G;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                zy7Var.a();
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 1:
                zy7Var.a();
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 2:
                nwbVar.setValue(Boolean.TRUE);
                zy7Var.a();
                break;
            case 3:
                nwbVar.setValue(Boolean.FALSE);
                zy7Var.a();
                break;
            case 4:
                nwbVar.setValue(Boolean.FALSE);
                zy7Var.a();
                break;
            case 5:
                nwbVar.setValue(Boolean.FALSE);
                zy7Var.a();
                break;
            case 6:
                zy7Var.a();
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 7:
                zy7Var.a();
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 8:
                zy7Var.a();
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 9:
                zy7Var.a();
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 10:
                zy7Var.a();
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 11:
                zy7Var.a();
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 12:
                zy7Var.a();
                nwbVar.setValue(Boolean.FALSE);
                break;
            case 13:
                nwbVar.setValue(Boolean.FALSE);
                if (zy7Var != null) {
                    zy7Var.a();
                }
                break;
            case 14:
                nwbVar.setValue(Boolean.FALSE);
                if (zy7Var != null) {
                    zy7Var.a();
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                nwbVar.setValue(Boolean.FALSE);
                zy7Var.a();
                break;
            case 16:
                if (!((Boolean) nwbVar.getValue()).booleanValue()) {
                    zy7Var.a();
                }
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                nwbVar.setValue(Boolean.FALSE);
                zy7Var.a();
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                nwbVar.setValue(Boolean.FALSE);
                zy7Var.a();
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                nwbVar.setValue(Boolean.FALSE);
                zy7Var.a();
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                break;
            case 21:
                if (zy7Var != null) {
                    zy7Var.a();
                }
                nwbVar.setValue(Boolean.FALSE);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                nwbVar.setValue(c1e.a);
                zy7Var.a();
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                nwbVar.setValue(Boolean.FALSE);
                zy7Var.a();
                break;
            case 24:
                nwbVar.setValue(Boolean.FALSE);
                zy7Var.a();
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                nwbVar.setValue(Boolean.FALSE);
                zy7Var.a();
                break;
            case 26:
                nwbVar.setValue(Boolean.FALSE);
                zy7Var.a();
                break;
            default:
                nwbVar.setValue(Boolean.FALSE);
                zy7Var.a();
                break;
        }
        return ieiVar;
    }
}
