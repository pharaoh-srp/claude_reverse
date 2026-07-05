package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageAction;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ChatMessageActionClicked;
import com.anthropic.claude.analytics.events.ChatSharingEvents$ChatShareSuccess;
import com.anthropic.claude.analytics.events.ChatSharingEvents$ChatShareVisibility;
import com.anthropic.claude.analytics.events.ChatSharingEvents$ChatVisibilityChanged;
import com.anthropic.claude.analytics.events.ChatSharingEvents$SharedChatInteractionType;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$FailureStage;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$FailureType;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessagePerceivedTTFT;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessageResponseComplete;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessageResponseFailed;
import com.anthropic.claude.api.chat.citation.Citation;
import com.anthropic.claude.api.chat.citation.CitationSource;
import com.anthropic.claude.api.consent.CheckConsentRequest;
import com.anthropic.claude.api.share.ChatSnapshot;
import com.anthropic.claude.api.share.ChatSnapshotReportCategory;
import com.anthropic.claude.chat.bottomsheet.ChatScreenArtifactSheetDestination;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.conway.protocol.ChatPart;
import com.anthropic.claude.conway.protocol.ChatSendRequest;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wy2 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ wy2(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return ChatMessageActionEvents$ChatMessageAction._init_$_anonymous_();
            case 1:
                return ChatMessageActionEvents$ChatMessageActionClicked._childSerializers$_anonymous_();
            case 2:
                return ChatMessageActionEvents$ChatMessageActionClicked._childSerializers$_anonymous_$0();
            case 3:
                return ChatPart._init_$_anonymous_();
            case 4:
                return ChatScreenArtifactSheetDestination.ViewArtifact._childSerializers$_anonymous_();
            case 5:
                return mpk.P("");
            case 6:
                return ChatScreenModalBottomSheetDestination.ToolApproval._childSerializers$_anonymous_();
            case 7:
                return ChatScreenModalBottomSheetDestination.ViewCollapsedTools._childSerializers$_anonymous_();
            case 8:
                return ChatScreenModalBottomSheetDestination.ViewCombinedSources._childSerializers$_anonymous_();
            case 9:
                return ChatScreenModalBottomSheetDestination.ViewCombinedSources._childSerializers$_anonymous_$0();
            case 10:
                return ChatScreenModalBottomSheetDestination.ViewSources._childSerializers$_anonymous_();
            case 11:
                return ChatSendRequest._childSerializers$_anonymous_();
            case 12:
                return ChatSharingEvents$ChatShareSuccess._childSerializers$_anonymous_();
            case 13:
                return ChatSharingEvents$ChatShareVisibility._init_$_anonymous_();
            case 14:
                return ChatSharingEvents$ChatVisibilityChanged._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ChatSharingEvents$ChatVisibilityChanged._childSerializers$_anonymous_$0();
            case 16:
                return ChatSharingEvents$SharedChatInteractionType._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ChatSnapshot._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ChatSnapshotReportCategory._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return CheckConsentRequest._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return CheckConsentRequest._childSerializers$_anonymous_$0();
            case 21:
                return Citation._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Citation._childSerializers$_anonymous_$0();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Citation._childSerializers$_anonymous_$1();
            case 24:
                return CitationSource._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ClaudeAiMessageEvents$FailureStage._init_$_anonymous_();
            case 26:
                return ClaudeAiMessageEvents$FailureType._init_$_anonymous_();
            case 27:
                return ClaudeAiMessageEvents$MessagePerceivedTTFT._childSerializers$_anonymous_();
            case 28:
                return ClaudeAiMessageEvents$MessageResponseComplete._childSerializers$_anonymous_();
            default:
                return ClaudeAiMessageEvents$MessageResponseFailed._childSerializers$_anonymous_();
        }
    }
}
