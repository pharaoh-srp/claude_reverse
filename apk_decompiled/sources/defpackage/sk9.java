package defpackage;

import androidx.health.platform.client.proto.g;

/* JADX INFO: loaded from: classes.dex */
public final class sk9 extends i3 {
    public final /* synthetic */ int a;

    public /* synthetic */ sk9(int i) {
        this.a = i;
    }

    @Override // defpackage.i3
    public final Object b(t34 t34Var, oc7 oc7Var) {
        switch (this.a) {
            case 0:
                return new uk9(t34Var);
            case 1:
                return new wk9(t34Var);
            case 2:
                return new yk9(t34Var, oc7Var);
            case 3:
                return new dl9(t34Var, oc7Var);
            case 4:
                return new cl9(t34Var);
            case 5:
                return new bsd(t34Var, oc7Var);
            case 6:
                return new zrd(t34Var, oc7Var);
            case 7:
                return new yrd(t34Var, oc7Var);
            case 8:
                return new esd(t34Var, oc7Var);
            case 9:
                return new gsd(t34Var, oc7Var);
            case 10:
                return new isd(t34Var, oc7Var);
            case 11:
                return new psd(t34Var, oc7Var);
            case 12:
                return new usd(t34Var, oc7Var);
            case 13:
                return new ysd(t34Var, oc7Var);
            case 14:
                return new atd(t34Var, oc7Var);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new ctd(t34Var, oc7Var);
            case 16:
                return new htd(t34Var, oc7Var);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new gtd(t34Var);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new itd(t34Var);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new ntd(t34Var, oc7Var);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new ltd(t34Var, oc7Var);
            case 21:
                return new std(t34Var, oc7Var);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new ttd(t34Var, oc7Var);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new vtd(t34Var, oc7Var);
            default:
                return new aud(t34Var, oc7Var);
        }
    }
}
