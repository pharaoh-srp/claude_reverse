package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.events.BatchEventLoggingRequest;
import com.anthropic.claude.api.mcp.AttachMcpPromptRequest;
import com.anthropic.claude.api.mcp.AttachMcpPromptResourceResponse;
import com.anthropic.claude.api.sync.AuthStatus;
import com.anthropic.claude.bell.api.BellApiClientMessage;
import com.anthropic.claude.bell.api.BellApiData;
import com.anthropic.claude.bell.api.BellApiServerMessage;
import com.anthropic.claude.bell.b;
import com.anthropic.claude.models.organization.configtypes.AvailableModelsConfig;
import com.anthropic.claude.sessions.types.AskUserQuestionInput;
import com.anthropic.claude.sessions.types.AskUserQuestionQuestion;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ew0 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ew0(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return AskUserQuestionInput._childSerializers$_anonymous_$0();
            case 1:
                return AskUserQuestionQuestion._childSerializers$_anonymous_();
            case 2:
                return AttachMcpPromptRequest._childSerializers$_anonymous_();
            case 3:
                return AttachMcpPromptResourceResponse._childSerializers$_anonymous_();
            case 4:
                return AttachMcpPromptResourceResponse._childSerializers$_anonymous_$0();
            case 5:
                return AuthStatus._childSerializers$_anonymous_();
            case 6:
                return AvailableModelsConfig._childSerializers$_anonymous_();
            case 7:
                return AvailableModelsConfig.AvailableModel._childSerializers$_anonymous_();
            case 8:
                return mpk.P(true);
            case 9:
                return BatchEventLoggingRequest._childSerializers$_anonymous_();
            case 10:
                return BellApiClientMessage.AttachmentFlowEnd.Data._childSerializers$_anonymous_();
            case 11:
                return BellApiClientMessage.AttachmentFlowEnd.Data._childSerializers$_anonymous_$0();
            case 12:
                return BellApiClientMessage.AttachmentFlowStart._init_$_anonymous_();
            case 13:
                return BellApiClientMessage.Interrupt._init_$_anonymous_();
            case 14:
                return BellApiClientMessage.ManualInputEnd._init_$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return BellApiClientMessage.PlaybackComplete._init_$_anonymous_();
            case 16:
                return BellApiClientMessage.ToolsRegister.Data._childSerializers$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return BellApiClientMessage.UnpauseEndpointing._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return BellApiData.MessageData._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return BellApiServerMessage.Error._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return BellApiServerMessage.MessageCompleteData._childSerializers$_anonymous_();
            case 21:
                return BellApiServerMessage.PlaybackEnd._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return BellApiServerMessage.ServerInterrupt._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return BellApiServerMessage.SessionServerConfig._childSerializers$_anonymous_();
            case 24:
                return BellApiServerMessage.SessionServerInitialized._init_$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return BellApiServerMessage.TranscriptEmpty._init_$_anonymous_();
            case 26:
                return BellApiServerMessage.TranscriptionStart._init_$_anonymous_();
            case 27:
                return BellApiServerMessage.Unknown._init_$_anonymous_();
            case 28:
                return BellApiServerMessage.UserInputEnd._init_$_anonymous_();
            default:
                Set set = b.a;
                return iei.a;
        }
    }
}
