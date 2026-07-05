package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.messages.BellNoteBlock;
import com.anthropic.claude.api.experience.BulletsStyle;
import com.anthropic.claude.api.experience.CacheType;
import com.anthropic.claude.bell.BellModelSheetDestination;
import com.anthropic.claude.bell.BellOverlayDestination;
import com.anthropic.claude.models.organization.configtypes.CCRStarterTaskConfig;
import com.anthropic.claude.sessions.types.BridgeSpawnMode;
import com.anthropic.claude.sessions.types.CCRNetworkConfig;
import com.anthropic.claude.tool.model.CalendarDeletePreviewData;
import com.anthropic.claude.tool.model.CalendarSearchPreviewData;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchErrorErrorType;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResult;
import com.anthropic.claude.tool.model.CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel;
import com.anthropic.claude.tool.model.CalendarUpdatePreviewData;
import com.anthropic.claude.tool.model.ChartDisplayV0InputSeriesItem;
import com.anthropic.claude.tool.model.ChartDisplayV0InputStyle;
import com.anthropic.claude.tool.model.ChartDisplayV0InputXAxis;
import com.anthropic.claude.tool.model.ChartDisplayV0InputXAxisScale;
import com.anthropic.claude.tool.model.ChartDisplayV0InputYAxis;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ll1 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ll1(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return x44.W(BellOverlayDestination.Closed.INSTANCE);
            case 1:
                return BellModelSheetDestination.Closed._init_$_anonymous_();
            case 2:
                return BellModelSheetDestination.MoreModels._init_$_anonymous_();
            case 3:
                return BellModelSheetDestination.SelectEffort._init_$_anonymous_();
            case 4:
                return BellModelSheetDestination.SelectModel._init_$_anonymous_();
            case 5:
                return BellNoteBlock._childSerializers$_anonymous_();
            case 6:
                return BellOverlayDestination.Closed._init_$_anonymous_();
            case 7:
                return BellOverlayDestination.Settings._init_$_anonymous_();
            case 8:
                return BellOverlayDestination.ViewAllSources._childSerializers$_anonymous_();
            case 9:
                return BellOverlayDestination.ViewAllSources._childSerializers$_anonymous_$0();
            case 10:
                return ieiVar;
            case 11:
                return BridgeSpawnMode._init_$_anonymous_();
            case 12:
                return BulletsStyle._init_$_anonymous_();
            case 13:
                return CCRNetworkConfig._childSerializers$_anonymous_();
            case 14:
                return CCRStarterTaskConfig._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return CacheType._init_$_anonymous_();
            case 16:
                return CalendarDeletePreviewData._childSerializers$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return CalendarSearchPreviewData._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return CalendarSearchV0OutputCalendarSearchErrorErrorType._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return CalendarSearchV0OutputCalendarSearchResult._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return CalendarSearchV0OutputCalendarSearchResultCalendarsItemAccessLevel._init_$_anonymous_();
            case 21:
                return CalendarUpdatePreviewData._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new ka2(new CameraPosition(new LatLng(0.0d, 0.0d), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier));
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                we2 we2Var = we2.a;
                return ieiVar;
            case 24:
                return ChartDisplayV0InputSeriesItem._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ChartDisplayV0InputSeriesItem._childSerializers$_anonymous_$0();
            case 26:
                return ChartDisplayV0InputStyle._init_$_anonymous_();
            case 27:
                return ChartDisplayV0InputXAxis._childSerializers$_anonymous_();
            case 28:
                return ChartDisplayV0InputXAxisScale._init_$_anonymous_();
            default:
                return ChartDisplayV0InputYAxis._childSerializers$_anonymous_();
        }
    }
}
