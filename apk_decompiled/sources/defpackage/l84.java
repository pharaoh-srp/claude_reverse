package defpackage;

import android.os.Bundle;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.ConversationSearchHit;
import com.anthropic.claude.api.chat.ConversationSearchResponse;
import com.anthropic.claude.api.chat.messages.CompactionStatus;
import com.anthropic.claude.api.consent.ConsentType;
import com.anthropic.claude.api.wiggle.ConvertWiggleToArtifactRequest;
import com.anthropic.claude.conway.protocol.ContainerHealthResponse;
import com.anthropic.claude.conway.protocol.ContentBlock;
import com.anthropic.claude.models.organization.configtypes.ConsentConfigAndroid;
import com.anthropic.claude.sessions.api.ControlRequestContent;
import com.anthropic.claude.sessions.types.ConnectionStatus;
import com.anthropic.claude.sessions.types.ControlResponsePayload;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l84 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ l84(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return CompactionStatus._childSerializers$_anonymous_();
            case 1:
                return CompactionStatus.Status._init_$_anonymous_();
            case 2:
                umg umgVar = ke4.a;
                return null;
            case 3:
                return new Bundle();
            case 4:
                throw new IllegalStateException("No default size");
            case 5:
                throw new IllegalStateException("No default context");
            case 6:
                umg umgVar2 = te4.a;
                return null;
            case 7:
                throw new IllegalStateException("No default glance id");
            case 8:
                umg umgVar3 = te4.a;
                return ni6.B;
            case 9:
                return mpk.P(Boolean.FALSE);
            case 10:
                return mpk.P(null);
            case 11:
                return ConnectionStatus._init_$_anonymous_();
            case 12:
                return mpk.P(Boolean.FALSE);
            case 13:
                return mpk.P(Boolean.FALSE);
            case 14:
                return mpk.P(Boolean.FALSE);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return mpk.P(null);
            case 16:
                return mpk.P(null);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ConsentConfigAndroid._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ConsentType._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ContainerHealthResponse._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ContentBlock.Unknown._init_$_anonymous_();
            case 21:
                return ControlRequestContent._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ControlRequestContent._childSerializers$_anonymous_$0();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ControlResponsePayload._childSerializers$_anonymous_();
            case 24:
                return ControlResponsePayload._childSerializers$_anonymous_$0();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ControlResponsePayload._childSerializers$_anonymous_$1();
            case 26:
                return ConversationSearchHit._childSerializers$_anonymous_();
            case 27:
                return ConversationSearchResponse._childSerializers$_anonymous_();
            case 28:
                return ConvertWiggleToArtifactRequest._childSerializers$_anonymous_();
            default:
                return mpk.P(lm6.E);
        }
    }
}
