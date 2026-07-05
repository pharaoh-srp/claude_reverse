package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$SendMessageFailed;
import com.anthropic.claude.analytics.events.ChatEvents$SendMessageFailureReason;
import com.anthropic.claude.analytics.events.ChatEvents$SendRetryCompleted;
import com.anthropic.claude.analytics.events.ChatEvents$SendRetryOutcome;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingEndpointType;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingErrorSource;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingMessageCompletionStatus;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingMessageJank;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingResponseSuccess;
import com.anthropic.claude.analytics.events.ChatEvents$UploadSource;
import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchEntryPoint;
import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchOutcome;
import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchSessionEnded;
import com.anthropic.claude.analytics.events.ChatListEvents$ConversationSearchVersion;
import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.api.chat.ChatMessage;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xq2 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ xq2(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return ChatEvents$SendMessageFailed._childSerializers$_anonymous_$0();
            case 1:
                return ChatEvents$SendMessageFailed._childSerializers$_anonymous_$1();
            case 2:
                return ChatEvents$SendMessageFailureReason._init_$_anonymous_();
            case 3:
                return ChatEvents$SendRetryCompleted._childSerializers$_anonymous_();
            case 4:
                return ChatEvents$SendRetryOutcome._init_$_anonymous_();
            case 5:
                return ChatEvents$StreamingEndpointType._init_$_anonymous_();
            case 6:
                return ChatEvents$StreamingErrorSource._init_$_anonymous_();
            case 7:
                return ChatEvents$StreamingMessageCompletionStatus._init_$_anonymous_();
            case 8:
                return ChatEvents$StreamingMessageJank._childSerializers$_anonymous_();
            case 9:
                return ChatEvents$StreamingMessageJank._childSerializers$_anonymous_$0();
            case 10:
                return ChatEvents$StreamingMessageJank._childSerializers$_anonymous_$1();
            case 11:
                return ChatEvents$StreamingMessageJank._childSerializers$_anonymous_$2();
            case 12:
                return ChatEvents$StreamingResponseSuccess._childSerializers$_anonymous_();
            case 13:
                return ChatEvents$UploadSource._init_$_anonymous_();
            case 14:
                return ChatFeedbackType._init_$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                xw2 xw2Var = yw2.a;
                return iei.a;
            case 16:
                return ChatListEvents$ConversationSearchEntryPoint._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ChatListEvents$ConversationSearchOutcome._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ChatListEvents$ConversationSearchSessionEnded._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ChatListEvents$ConversationSearchSessionEnded._childSerializers$_anonymous_$0();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ChatListEvents$ConversationSearchSessionEnded._childSerializers$_anonymous_$1();
            case 21:
                return ChatListEvents$ConversationSearchVersion._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return mpk.P(Boolean.FALSE);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return mpk.P(Boolean.FALSE);
            case 24:
                return mpk.P(null);
            case BuildConfig.VERSION_CODE /* 25 */:
                return ChatMessage._childSerializers$_anonymous_();
            case 26:
                return ChatMessage._childSerializers$_anonymous_$0();
            case 27:
                return ChatMessage._childSerializers$_anonymous_$1();
            case 28:
                return ChatMessage._childSerializers$_anonymous_$2();
            default:
                return ChatMessageActionEvents$ActionSource._init_$_anonymous_();
        }
    }
}
