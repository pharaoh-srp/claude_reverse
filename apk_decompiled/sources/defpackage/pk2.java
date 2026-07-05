package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$AddAttachment;
import com.anthropic.claude.analytics.events.ChatEvents$AddFileFailed;
import com.anthropic.claude.analytics.events.ChatEvents$AddFileFailureReason;
import com.anthropic.claude.analytics.events.ChatEvents$AddFileSuccess;
import com.anthropic.claude.analytics.events.ChatEvents$AddImageFailed;
import com.anthropic.claude.analytics.events.ChatEvents$AddImageFailureReason;
import com.anthropic.claude.analytics.events.ChatEvents$AddImageSuccess;
import com.anthropic.claude.analytics.events.ChatEvents$AddPrepopulatedText;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.analytics.events.ChatEvents$BlockKind;
import com.anthropic.claude.analytics.events.ChatEvents$BusyContainerSendRetryCompleted;
import com.anthropic.claude.api.chat.ChatCompletionRequest;
import com.anthropic.claude.api.chat.ChatConversationWithNestedMessage;
import com.anthropic.claude.tool.model.ChartDisplayV0InputYAxisScale;
import com.anthropic.claude.tool.model.ChartDisplayV0OutputStatus;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pk2 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ pk2(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return ChartDisplayV0InputYAxisScale._init_$_anonymous_();
            case 1:
                return ChartDisplayV0OutputStatus._init_$_anonymous_();
            case 2:
                return ChatCompletionRequest._childSerializers$_anonymous_();
            case 3:
                return ChatCompletionRequest._childSerializers$_anonymous_$0();
            case 4:
                return ChatCompletionRequest._childSerializers$_anonymous_$1();
            case 5:
                return ChatCompletionRequest._childSerializers$_anonymous_$2();
            case 6:
                return ChatConversationWithNestedMessage._childSerializers$_anonymous_();
            case 7:
                return ChatEvents$AddAttachment._childSerializers$_anonymous_();
            case 8:
                return ChatEvents$AddAttachment._childSerializers$_anonymous_$0();
            case 9:
                return ChatEvents$AddFileFailed._childSerializers$_anonymous_();
            case 10:
                return ChatEvents$AddFileFailed._childSerializers$_anonymous_$0();
            case 11:
                return ChatEvents$AddFileFailed._childSerializers$_anonymous_$1();
            case 12:
                return ChatEvents$AddFileFailed._childSerializers$_anonymous_$2();
            case 13:
                return ChatEvents$AddFileFailureReason._init_$_anonymous_();
            case 14:
                return ChatEvents$AddFileSuccess._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ChatEvents$AddFileSuccess._childSerializers$_anonymous_$0();
            case 16:
                return ChatEvents$AddFileSuccess._childSerializers$_anonymous_$1();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ChatEvents$AddImageFailed._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ChatEvents$AddImageFailed._childSerializers$_anonymous_$0();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ChatEvents$AddImageFailed._childSerializers$_anonymous_$1();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ChatEvents$AddImageFailed._childSerializers$_anonymous_$2();
            case 21:
                return ChatEvents$AddImageFailureReason._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ChatEvents$AddImageSuccess._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ChatEvents$AddImageSuccess._childSerializers$_anonymous_$0();
            case 24:
                return ChatEvents$AddImageSuccess._childSerializers$_anonymous_$1();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ChatEvents$AddPrepopulatedText._childSerializers$_anonymous_();
            case 26:
                return ChatEvents$AddPrepopulatedText._childSerializers$_anonymous_$0();
            case 27:
                return ChatEvents$AttachmentSource._init_$_anonymous_();
            case 28:
                return ChatEvents$BlockKind._init_$_anonymous_();
            default:
                return ChatEvents$BusyContainerSendRetryCompleted._childSerializers$_anonymous_();
        }
    }
}
