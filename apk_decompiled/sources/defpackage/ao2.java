package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$BusyContainerSendRetryOutcome;
import com.anthropic.claude.analytics.events.ChatEvents$ChooseStyleSheetSeen;
import com.anthropic.claude.analytics.events.ChatEvents$ChooseStyleSheetSource;
import com.anthropic.claude.analytics.events.ChatEvents$CompactionCompleted;
import com.anthropic.claude.analytics.events.ChatEvents$CompactionOutcome;
import com.anthropic.claude.analytics.events.ChatEvents$ContinueChatButtonPressed;
import com.anthropic.claude.analytics.events.ChatEvents$ContinueChatButtonPressedSource;
import com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadJank;
import com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource;
import com.anthropic.claude.analytics.events.ChatEvents$DraftRestored;
import com.anthropic.claude.analytics.events.ChatEvents$MarkdownNodeKind;
import com.anthropic.claude.analytics.events.ChatEvents$ModelSelectorSheetSeen;
import com.anthropic.claude.analytics.events.ChatEvents$ModelSelectorSheetSource;
import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressed;
import com.anthropic.claude.analytics.events.ChatEvents$NewChatButtonPressedSource;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryCancellationCause;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryCompleted;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryOutcome;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryStarted;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason;
import com.anthropic.claude.analytics.events.ChatEvents$RecentPhotosStripAttached;
import com.anthropic.claude.analytics.events.ChatEvents$RetryCompletion;
import com.anthropic.claude.analytics.events.ChatEvents$RetryCompletionReason;
import com.anthropic.claude.analytics.events.ChatEvents$SafeguardsLearnMoreSurface;
import com.anthropic.claude.analytics.events.ChatEvents$SafeguardsLearnMoreTapped;
import com.anthropic.claude.analytics.events.ChatEvents$SendMessageFailed;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ao2 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ao2(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return ChatEvents$BusyContainerSendRetryOutcome._init_$_anonymous_();
            case 1:
                return ChatEvents$ChooseStyleSheetSeen._childSerializers$_anonymous_();
            case 2:
                return ChatEvents$ChooseStyleSheetSource._init_$_anonymous_();
            case 3:
                return ChatEvents$CompactionCompleted._childSerializers$_anonymous_();
            case 4:
                return ChatEvents$CompactionOutcome._init_$_anonymous_();
            case 5:
                return ChatEvents$ContinueChatButtonPressed._childSerializers$_anonymous_();
            case 6:
                return ChatEvents$ContinueChatButtonPressedSource._init_$_anonymous_();
            case 7:
                return ChatEvents$ConversationLoadJank._childSerializers$_anonymous_();
            case 8:
                return ChatEvents$ConversationLoadJank._childSerializers$_anonymous_$0();
            case 9:
                return ChatEvents$ConversationLoadJank._childSerializers$_anonymous_$1();
            case 10:
                return ChatEvents$ConversationLoadSource._init_$_anonymous_();
            case 11:
                return ChatEvents$DraftRestored._childSerializers$_anonymous_();
            case 12:
                return ChatEvents$MarkdownNodeKind._init_$_anonymous_();
            case 13:
                return ChatEvents$ModelSelectorSheetSeen._childSerializers$_anonymous_();
            case 14:
                return ChatEvents$ModelSelectorSheetSource._init_$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ChatEvents$NewChatButtonPressed._childSerializers$_anonymous_();
            case 16:
                return ChatEvents$NewChatButtonPressedSource._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ChatEvents$PollingRecoveryCancellationCause._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ChatEvents$PollingRecoveryCompleted._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ChatEvents$PollingRecoveryCompleted._childSerializers$_anonymous_$0();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ChatEvents$PollingRecoveryCompleted._childSerializers$_anonymous_$1();
            case 21:
                return ChatEvents$PollingRecoveryOutcome._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ChatEvents$PollingRecoveryStarted._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ChatEvents$PollingRecoveryTriggerReason._init_$_anonymous_();
            case 24:
                return ChatEvents$RecentPhotosStripAttached._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ChatEvents$RetryCompletion._childSerializers$_anonymous_();
            case 26:
                return ChatEvents$RetryCompletionReason._init_$_anonymous_();
            case 27:
                return ChatEvents$SafeguardsLearnMoreSurface._init_$_anonymous_();
            case 28:
                return ChatEvents$SafeguardsLearnMoreTapped._childSerializers$_anonymous_();
            default:
                return ChatEvents$SendMessageFailed._childSerializers$_anonymous_();
        }
    }
}
