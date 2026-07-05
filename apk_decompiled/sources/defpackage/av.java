package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.app.main.MainAppScreens;
import com.anthropic.claude.bell.BellOverlayDestination;
import com.anthropic.claude.bell.b;
import com.anthropic.claude.chatlist.all.bottomsheet.AllChatsListBottomSheetDestination;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.project.knowledge.ProjectDocMenuDialogDestination;
import com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination;
import com.anthropic.claude.settings.SettingsAppScreen;
import com.anthropic.claude.settings.internal.InternalSettingsAppScreen;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class av implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;

    public /* synthetic */ av(rwe rweVar, int i) {
        this.E = i;
        this.F = rweVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        int i2 = 13;
        int i3 = 12;
        int i4 = 6;
        int i5 = 14;
        int i6 = 25;
        int i7 = 27;
        int i8 = 18;
        int i9 = 28;
        int i10 = 15;
        int i11 = 10;
        int i12 = 7;
        int i13 = 1;
        iei ieiVar = iei.a;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                rweVar.E.m(new fv(2, new AllChatsListBottomSheetDestination[]{AllChatsListBottomSheetDestination.SelectProject.INSTANCE}), new a2g(i11));
                break;
            case 1:
                rweVar.E.m(new fv(1, new AllChatsListBottomSheetDestination[]{AllChatsListBottomSheetDestination.Closed.INSTANCE}), new a2g(9));
                break;
            case 2:
                b.r(rweVar);
                break;
            case 3:
                rweVar.E.m(new fv(7, new BellOverlayDestination[]{BellOverlayDestination.Settings.INSTANCE}), new a2g(i10));
                break;
            case 4:
                rweVar.E.m(hr0.a0, new tj3(16));
                break;
            case 5:
                rweVar.E.m(new jx2(i11, ConwayAppScreen.System.INSTANCE), new tj3(27));
                break;
            case 6:
                rweVar.E.m(hr0.h0, new tj3(28));
                break;
            case 7:
                rweVar.E.m(be5.F, new ae5(i13));
                break;
            case 8:
                rweVar.E.m(be5.G, new ae5(4));
                break;
            case 9:
                rweVar.E.m(be5.H, new ae5(i4));
                break;
            case 10:
                rweVar.E.m(be5.I, new ae5(i12));
                break;
            case 11:
                rweVar.E.m(be5.J, new ae5(8));
                break;
            case 12:
                rweVar.E.m(be5.K, new ae5(9));
                break;
            case 13:
                rweVar.E.m(new jx2(i10, InternalSettingsAppScreen.PushSettingsScreen.INSTANCE), new ae5(i2));
                break;
            case 14:
                rweVar.E.m(new jx2(i5, InternalSettingsAppScreen.GrowthBookOverrideScreen.INSTANCE), new ae5(i3));
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                rweVar.E.m(new jx2(i2, InternalSettingsAppScreen.EndpointSelectionScreen.INSTANCE), new ae5(11));
                break;
            case 16:
                rweVar.E.m(new jx2(i3, InternalSettingsAppScreen.NetworkSimulationScreen.INSTANCE), new ae5(i11));
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                rweVar.E.m(be5.P, new ae5(i6));
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                rweVar.E.m(be5.U, new ppa(6));
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                zsk.g(rweVar, MainAppScreens.InternalSettings.INSTANCE);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                rweVar.E.m(new jx2(i8, MainAppScreens.UiDemoApp.INSTANCE), new ppa(7));
                break;
            case 21:
                rweVar.E.m(be5.V, new ppa(10));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                rweVar.E.m(be5.a0, new ppa(14));
                break;
            case 24:
                rweVar.E.m(new jga(15, new ProjectKnowledgePreviewDestination[]{ProjectKnowledgePreviewDestination.Dismissed.INSTANCE}), new ppa(17));
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                rweVar.E.m(new jx2(22, ProjectDocMenuDialogDestination.Delete.INSTANCE), new ppa(25));
                break;
            case 26:
                gge ggeVar = gge.H;
                nmd nmdVar = new nmd(7);
                rweVar.getClass();
                rweVar.E.m(ggeVar, nmdVar);
                break;
            case 27:
                rweVar.E.m(gge.O, new nmd(16));
                break;
            case 28:
                rweVar.E.m(new jx2(i7, SettingsAppScreen.CalendarPermissionScreen.INSTANCE), new nmd(17));
                break;
            default:
                rweVar.E.m(new jx2(i9, SettingsAppScreen.LocationPermissionScreen.INSTANCE), new nmd(18));
                break;
        }
        return ieiVar;
    }
}
