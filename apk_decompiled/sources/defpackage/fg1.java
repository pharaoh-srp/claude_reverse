package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public /* synthetic */ fg1(int i, nwb nwbVar) {
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
                if (nwbVar != null) {
                    return (List) nwbVar.getValue();
                }
                return null;
            case 1:
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            case 2:
                nwbVar.setValue(null);
                return ieiVar;
            case 3:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 4:
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            case 5:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 6:
                nwbVar.setValue("");
                return ieiVar;
            case 7:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 8:
                Boolean bool = (Boolean) nwbVar.getValue();
                bool.booleanValue();
                return bool;
            case 9:
                ((zy7) nwbVar.getValue()).a();
                return ieiVar;
            case 10:
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            case 11:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 12:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 13:
                return (uf6) nwbVar.getValue();
            case 14:
                return (List) nwbVar.getValue();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case 16:
                nwbVar.setValue(Boolean.TRUE);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return (kz9) ((zy7) nwbVar.getValue()).a();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new j0a((bz7) nwbVar.getValue());
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                nwbVar.setValue(Boolean.FALSE);
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                Boolean bool2 = (Boolean) ((zy7) nwbVar.getValue()).a();
                bool2.getClass();
                return bool2;
            default:
                ((zy7) nwbVar.getValue()).a();
                return ieiVar;
        }
    }
}
