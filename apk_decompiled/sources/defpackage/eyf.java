package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.settings.SettingsAppScreen;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class eyf implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;

    public /* synthetic */ eyf(rwe rweVar, int i) {
        this.E = i;
        this.F = rweVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                rweVar.E.m(new jx2(29, SettingsAppScreen.HealthPermissionScreen.INSTANCE), new nmd(19));
                break;
            case 1:
                rweVar.E.m(gge.K, new nmd(10));
                break;
            case 2:
                rweVar.E.m(gge.Q, new nmd(21));
                break;
            case 3:
                rweVar.E.m(gge.R, new nmd(22));
                break;
            case 4:
                rweVar.E.m(gge.S, new nmd(23));
                break;
            case 5:
                rweVar.E.m(gge.T, new nmd(24));
                break;
            case 6:
                rweVar.E.m(gge.U, new nmd(25));
                break;
            case 7:
                rweVar.E.m(gge.V, new nmd(27));
                break;
            case 8:
                rweVar.E.m(gge.P, new nmd(20));
                break;
            case 9:
                rweVar.E.m(gge.W, new nmd(28));
                break;
            case 10:
                rweVar.E.m(gge.X, new nmd(29));
                break;
            case 11:
                rweVar.E.m(gge.Y, new hyf(0));
                break;
            case 12:
                rweVar.E.m(gge.Z, new hyf(1));
                break;
            case 13:
                rweVar.E.m(new gyf(0, SettingsAppScreen.MemoryFilesScreen.INSTANCE), new nmd(26));
                break;
            case 14:
                rweVar.E.m(gge.a0, new hyf(2));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                rweVar.E.m(gge.b0, new hyf(4));
                break;
            case 16:
                rweVar.E.m(gge.c0, new hyf(5));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                rweVar.E.m(gge.d0, new hyf(6));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                rweVar.E.m(gge.J, new nmd(9));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                rweVar.E.m(new jx2(26, SettingsAppScreen.ConnectorDirectory.INSTANCE), new nmd(11));
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                rweVar.E.m(gge.L, new nmd(13));
                break;
            case 21:
                rweVar.E.m(gge.M, new nmd(14));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                rweVar.E.m(gge.N, new nmd(15));
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                rweVar.E.m(new gyf(1, SettingsAppScreen.LicensesScreen.INSTANCE), new hyf(8));
                break;
            case 24:
                rweVar.E.m(new gyf(4, SettingsAppScreen.CapabilitiesScreen.INSTANCE), new hyf(12));
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                rweVar.E.m(new gyf(5, SettingsAppScreen.ConnectorsScreen.INSTANCE), new hyf(13));
                break;
            case 26:
                rweVar.E.m(new gyf(6, SettingsAppScreen.ConnectedAppsScreen.INSTANCE), new hyf(14));
                break;
            case 27:
                rweVar.E.m(new gyf(7, SettingsAppScreen.PermissionsScreen.INSTANCE), new hyf(15));
                break;
            case 28:
                rweVar.E.m(new gyf(2, SettingsAppScreen.ProfileScreen.INSTANCE), new hyf(9));
                break;
            default:
                rweVar.E.m(new gyf(3, SettingsAppScreen.UsageScreen.INSTANCE), new hyf(11));
                break;
        }
        return ieiVar;
    }
}
