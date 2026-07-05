package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.MemoryEvents$MemoryStyleSelected;
import com.anthropic.claude.analytics.events.MemoryEvents$MemoryStyleSelectedStyle;
import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadOutcome;
import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadRequested;
import com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadResult;
import com.anthropic.claude.analytics.events.MessageFileEvents$FilePreviewRendered;
import com.anthropic.claude.analytics.events.MessageFileEvents$FilePreviewResult;
import com.anthropic.claude.analytics.events.MessageFileEvents$FilePreviewSeen;
import com.anthropic.claude.analytics.events.MessageFileEvents$FilePreviewSurface;
import com.anthropic.claude.analytics.events.MessageFileEvents$PdfPreviewRendered;
import com.anthropic.claude.analytics.events.MessageFileEvents$PdfPreviewResult;
import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$CreateFeedback;
import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseCalendarFilterChanged;
import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUsePartiallyCompleted;
import com.anthropic.claude.api.chat.MessageSender;
import com.anthropic.claude.api.memory.MelangeImportSaffronResponse;
import com.anthropic.claude.api.memory.MelangeListResponse;
import com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.MobileAppUseDestination;
import com.anthropic.claude.mcpapps.transport.MessageParams;
import com.anthropic.claude.tool.model.MessageComposeV0InputKind;
import com.anthropic.claude.tool.model.MessageComposeV1InputKind;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g9b implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ g9b(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return MelangeImportSaffronResponse._childSerializers$_anonymous_();
            case 1:
                return MelangeImportSaffronResponse._childSerializers$_anonymous_$0();
            case 2:
                return MelangeListResponse._childSerializers$_anonymous_();
            case 3:
                return MelangeListResponse._childSerializers$_anonymous_$0();
            case 4:
                return MemoryEvents$MemoryStyleSelected._childSerializers$_anonymous_();
            case 5:
                return MemoryEvents$MemoryStyleSelectedStyle._init_$_anonymous_();
            case 6:
                int i = yeb.g;
                return iei.a;
            case 7:
                return MessageComposeV0InputKind._init_$_anonymous_();
            case 8:
                return MessageComposeV1InputKind._init_$_anonymous_();
            case 9:
                return MessageFileEvents$DownloadOutcome._init_$_anonymous_();
            case 10:
                return MessageFileEvents$DownloadSource._init_$_anonymous_();
            case 11:
                return MessageFileEvents$FileDownloadRequested._childSerializers$_anonymous_();
            case 12:
                return MessageFileEvents$FileDownloadResult._childSerializers$_anonymous_();
            case 13:
                return MessageFileEvents$FileDownloadResult._childSerializers$_anonymous_$0();
            case 14:
                return MessageFileEvents$FilePreviewRendered._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return MessageFileEvents$FilePreviewResult._init_$_anonymous_();
            case 16:
                return MessageFileEvents$FilePreviewSeen._childSerializers$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return MessageFileEvents$FilePreviewSurface._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return MessageFileEvents$PdfPreviewRendered._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return MessageFileEvents$PdfPreviewResult._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return MessageParams._childSerializers$_anonymous_();
            case 21:
                return MessageSender._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return MobileAppFeedbackEvents$CreateFeedback._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return MobileAppFeedbackEvents$FeedbackType._init_$_anonymous_();
            case 24:
                return MobileAppToolPreviewInfo._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return MobileAppUseDestination.Approval._init_$_anonymous_();
            case 26:
                return MobileAppUseDestination.CalendarSelection._init_$_anonymous_();
            case 27:
                return MobileAppUseDestination.Dismissed._init_$_anonymous_();
            case 28:
                return MobileAppUseEvents$MobileAppUseCalendarFilterChanged._childSerializers$_anonymous_();
            default:
                return MobileAppUseEvents$MobileAppUsePartiallyCompleted._childSerializers$_anonymous_();
        }
    }
}
