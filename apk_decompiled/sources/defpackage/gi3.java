package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessageResponseFailed;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessageSent;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessageStreamingAbandoned;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$ResearchMode;
import com.anthropic.claude.analytics.events.CodeBlockEvents$CodeBlockAction;
import com.anthropic.claude.analytics.events.CodeBlockEvents$CodeBlockActionClicked;
import com.anthropic.claude.analytics.events.CodeEvents$AddContextViewed;
import com.anthropic.claude.analytics.events.CodeEvents$AttachmentReorderSurface;
import com.anthropic.claude.analytics.events.CodeEvents$AttachmentReordered;
import com.anthropic.claude.analytics.events.CodeEvents$AttachmentsAdded;
import com.anthropic.claude.analytics.events.CodeEvents$CodeComposerSurface;
import com.anthropic.claude.analytics.events.CodeEvents$CodeMessageAction;
import com.anthropic.claude.analytics.events.CodeEvents$CodeMessageActionClicked;
import com.anthropic.claude.analytics.events.CodeEvents$CodeMessageRole;
import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionOutcome;
import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionOutcomeType;
import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionReceived;
import com.anthropic.claude.analytics.events.CodeEvents$CodePromptSuggestionSuppressReason;
import com.anthropic.claude.analytics.events.CodeEvents$ModelSelectorPersistFailed;
import com.anthropic.claude.api.login.CodeConfiguration;
import com.anthropic.claude.api.notification.ClientPlatform;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.conway.protocol.ClientRegistrationRequest;
import com.anthropic.claude.conway.protocol.ClientRegistrationResponse;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gi3 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ gi3(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return ClaudeAiMessageEvents$MessageResponseFailed._childSerializers$_anonymous_$0();
            case 1:
                return ClaudeAiMessageEvents$MessageResponseFailed._childSerializers$_anonymous_$1();
            case 2:
                return ClaudeAiMessageEvents$MessageSent._childSerializers$_anonymous_();
            case 3:
                return ClaudeAiMessageEvents$MessageStreamingAbandoned._childSerializers$_anonymous_();
            case 4:
                return ClaudeAiMessageEvents$ResearchMode._init_$_anonymous_();
            case 5:
                return ClaudeAppOverlay.ArtifactFullScreen._childSerializers$_anonymous_();
            case 6:
                return ClaudeAppOverlay.GroveNoticeBottomSheet._childSerializers$_anonymous_();
            case 7:
                return ClaudeAppOverlay.UpgradeToProBottomSheet._childSerializers$_anonymous_();
            case 8:
                return ClientPlatform._init_$_anonymous_();
            case 9:
                return ClientRegistrationRequest._childSerializers$_anonymous_();
            case 10:
                return ClientRegistrationResponse._childSerializers$_anonymous_();
            case 11:
                return CodeBlockEvents$CodeBlockAction._init_$_anonymous_();
            case 12:
                return CodeBlockEvents$CodeBlockActionClicked._childSerializers$_anonymous_();
            case 13:
                umg umgVar = yq3.a;
                return null;
            case 14:
                return CodeConfiguration.CharSet._init_$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return CodeEvents$AddContextViewed._childSerializers$_anonymous_();
            case 16:
                return CodeEvents$AttachmentReorderSurface._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return CodeEvents$AttachmentReordered._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return CodeEvents$AttachmentsAdded._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return CodeEvents$AttachmentsAdded._childSerializers$_anonymous_$0();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return CodeEvents$CodeComposerSurface._init_$_anonymous_();
            case 21:
                return CodeEvents$CodeMessageAction._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return CodeEvents$CodeMessageActionClicked._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return CodeEvents$CodeMessageActionClicked._childSerializers$_anonymous_$0();
            case 24:
                return CodeEvents$CodeMessageRole._init_$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return CodeEvents$CodePromptSuggestionOutcome._childSerializers$_anonymous_();
            case 26:
                return CodeEvents$CodePromptSuggestionOutcomeType._init_$_anonymous_();
            case 27:
                return CodeEvents$CodePromptSuggestionReceived._childSerializers$_anonymous_();
            case 28:
                return CodeEvents$CodePromptSuggestionSuppressReason._init_$_anonymous_();
            default:
                return CodeEvents$ModelSelectorPersistFailed._childSerializers$_anonymous_();
        }
    }
}
