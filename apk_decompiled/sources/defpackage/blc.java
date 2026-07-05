package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.tasks.PaginatedTasksResponse;
import com.anthropic.claude.api.wiggle.PrepareUploadRequest;
import com.anthropic.claude.api.wiggle.PrepareUploadResponse;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.code.ui.PendingAskUserQuestionSelections;
import com.anthropic.claude.conway.protocol.PaginatedMessages;
import com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination;
import com.anthropic.claude.sessions.types.OutcomeGitInfo;
import com.anthropic.claude.sessions.types.PermissionMode;
import com.anthropic.claude.sessions.types.PostTurnSummary;
import com.anthropic.claude.tool.custom.PhoneCallMonitorEvent;
import com.anthropic.claude.tool.model.PhoneCallCompletedOutputTranscriptItemSpeaker;
import com.anthropic.claude.tool.model.PlacesMapDisplayV0InputDaysItem;
import com.anthropic.claude.tool.model.PlacesMapDisplayV0InputMode;
import com.anthropic.claude.tool.model.PlacesMapDisplayV0InputTravelMode;
import com.anthropic.claude.tool.model.PlacesMapDisplayV0OutputEnrichedPlacesValue;
import com.anthropic.claude.tool.model.PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem;
import com.anthropic.claude.tool.ui.chat.PhoneCallSheetDestination;
import com.squareup.wire.internal.PlatformKt;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class blc implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ blc(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return OutcomeGitInfo._childSerializers$_anonymous_();
            case 1:
                return OutcomeGitInfo._childSerializers$_anonymous_$0();
            case 2:
                return PaginatedMessages._childSerializers$_anonymous_();
            case 3:
                return PaginatedTasksResponse._childSerializers$_anonymous_();
            case 4:
                return ParsedContentBlock$McpToolInvocation._childSerializers$_anonymous_();
            case 5:
                return ParsedContentBlock$McpToolInvocation._childSerializers$_anonymous_$0();
            case 6:
                return ParsedContentBlock$McpToolInvocation._childSerializers$_anonymous_$1();
            case 7:
                return ParsedContentBlock$Thinking._childSerializers$_anonymous_();
            case 8:
                return PendingAskUserQuestionSelections._childSerializers$_anonymous_();
            case 9:
                return PendingAskUserQuestionSelections._childSerializers$_anonymous_$0();
            case 10:
                return PermissionMode._init_$_anonymous_();
            case 11:
                return PhoneCallCompletedOutputTranscriptItemSpeaker._init_$_anonymous_();
            case 12:
                return PhoneCallMonitorEvent.CallEndedProcessing._init_$_anonymous_();
            case 13:
                return PhoneCallMonitorEvent.Meta._init_$_anonymous_();
            case 14:
                return PhoneCallMonitorEvent.Unknown._init_$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return PhoneCallSheetDestination.Closed._init_$_anonymous_();
            case 16:
                return PhoneCallSheetDestination.Transcript._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return PlacesMapDisplayV0InputDaysItem._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return PlacesMapDisplayV0InputMode._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return PlacesMapDisplayV0InputTravelMode._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return PlacesMapDisplayV0OutputEnrichedPlacesValue._childSerializers$_anonymous_();
            case 21:
                return PlacesMapDisplayV0OutputEnrichedPlacesValue._childSerializers$_anonymous_$0();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return PlacesMapDisplayV0OutputEnrichedPlacesValue._childSerializers$_anonymous_$1();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem._childSerializers$_anonymous_();
            case 24:
                return PlatformKt.AddSuppressedMethod_delegate$lambda$0();
            case BuildConfig.VERSION_CODE /* 25 */:
                return PlaybackPace._init_$_anonymous_();
            case 26:
                return PostTurnSummary._childSerializers$_anonymous_();
            case 27:
                return PrepareUploadRequest._childSerializers$_anonymous_();
            case 28:
                return PrepareUploadResponse._childSerializers$_anonymous_();
            default:
                return x44.W(ProjectKnowledgePreviewDestination.Dismissed.INSTANCE);
        }
    }
}
