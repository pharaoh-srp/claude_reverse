package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.RenderingMode;
import com.anthropic.claude.api.chat.tool.ResearchStatus;
import com.anthropic.claude.api.chat.tool.ResearchStatusResponse;
import com.anthropic.claude.api.chat.tool.RichItem;
import com.anthropic.claude.api.consent.RevokeConsentRequest;
import com.anthropic.claude.conway.protocol.RichMessage;
import com.anthropic.claude.mcpapps.transport.ResourceReadResult;
import com.anthropic.claude.sessions.types.RepoListResponse;
import com.anthropic.claude.sessions.types.RequiresActionDetails;
import com.anthropic.claude.sessions.types.ScanSecretsRequest;
import com.anthropic.claude.sessions.types.ScanSecretsResponse;
import com.anthropic.claude.sessions.types.SdkMessageEvent;
import com.anthropic.claude.sessions.types.SdkSystemEvent;
import com.anthropic.claude.sessions.types.SdkToolUseContent;
import com.anthropic.claude.stt.repo.api.STTApiMessage;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInputFieldsItemType;
import com.squareup.wire.ReverseProtoWriter;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class afe implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ afe(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return mpk.P(Boolean.FALSE);
            case 1:
                return RenderingMode._init_$_anonymous_();
            case 2:
                return RepoListResponse._childSerializers$_anonymous_();
            case 3:
                return RequestFormInputFromUserInputFieldsItemType._init_$_anonymous_();
            case 4:
                return RequiresActionDetails._childSerializers$_anonymous_();
            case 5:
                return ResearchStatus._init_$_anonymous_();
            case 6:
                return ResearchStatusResponse._childSerializers$_anonymous_();
            case 7:
                return ResearchStatusResponse._childSerializers$_anonymous_$0();
            case 8:
                return ResearchStatusResponse._childSerializers$_anonymous_$1();
            case 9:
                return ResourceReadResult._childSerializers$_anonymous_();
            case 10:
                return ReverseProtoWriter.forwardBuffer_delegate$lambda$0();
            case 11:
                return RevokeConsentRequest._childSerializers$_anonymous_();
            case 12:
                return RevokeConsentRequest._childSerializers$_anonymous_$0();
            case 13:
                return RichItem._childSerializers$_anonymous_();
            case 14:
                return RichMessage.Assistant._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return RichMessage.Status._childSerializers$_anonymous_();
            case 16:
                return RichMessage.User._childSerializers$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                xe4 xe4Var = zse.a;
                return Boolean.FALSE;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return tkh.d;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return x44.X(dte.d, fte.d, kte.d, hte.d, ite.d, jte.d, ete.d);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ote.i;
            case 21:
                return new rte();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return STTApiMessage.Unknown._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ScanSecretsRequest._childSerializers$_anonymous_();
            case 24:
                return ScanSecretsResponse._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return SdkMessageEvent._childSerializers$_anonymous_();
            case 26:
                return SdkMessageEvent._childSerializers$_anonymous_$0();
            case 27:
                return SdkSystemEvent._childSerializers$_anonymous_();
            case 28:
                return SdkSystemEvent._childSerializers$_anonymous_$0();
            default:
                return SdkToolUseContent._childSerializers$_anonymous_();
        }
    }
}
