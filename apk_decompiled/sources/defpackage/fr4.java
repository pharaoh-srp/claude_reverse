package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.mcp.CreateMcpRemoteServerRequest;
import com.anthropic.claude.api.wiggle.CreateFileParams;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.conway.protocol.ConwayClientInfo;
import com.anthropic.claude.conway.protocol.ConwayExtensionMeta;
import com.anthropic.claude.conway.protocol.ConwaySearchResponse;
import com.anthropic.claude.models.organization.configtypes.CoworkStarterChipsConfig;
import com.anthropic.claude.sessions.types.CreateCoworkRemoteSessionRequest;
import com.anthropic.claude.tool.model.ConwaySuggestConnectorsOutput;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fr4 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ fr4(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return x44.W(ConwayAppScreen.Chat.INSTANCE);
            case 1:
                return mpk.P(ir4.F);
            case 2:
                return ConwayAppScreen.Chat._init_$_anonymous_();
            case 3:
                return ConwayAppScreen.System._init_$_anonymous_();
            case 4:
                return mpk.P(Boolean.FALSE);
            case 5:
                return ConwayClientInfo._childSerializers$_anonymous_();
            case 6:
                return ConwayExtensionMeta._childSerializers$_anonymous_();
            case 7:
                return ConwayExtensionMeta._childSerializers$_anonymous_$0();
            case 8:
                return new isc(0);
            case 9:
                return mpk.P(null);
            case 10:
                return mpk.P(Boolean.FALSE);
            case 11:
                return mpk.P(null);
            case 12:
                return mpk.P(Boolean.FALSE);
            case 13:
                return mpk.P(Boolean.FALSE);
            case 14:
                return mpk.P(Boolean.FALSE);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return mpk.P(Boolean.FALSE);
            case 16:
                return ConwaySearchResponse._childSerializers$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return Long.valueOf(h1e.F.k(0L, 250L));
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ConwaySuggestConnectorsOutput._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return mpk.P(Boolean.FALSE);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ide ideVar = d25.a;
                return iei.a;
            case 21:
                return mpk.P(null);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return mpk.P("");
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return mpk.P(Boolean.FALSE);
            case 24:
                return mpk.P("");
            case BuildConfig.VERSION_CODE /* 25 */:
                return mpk.P(null);
            case 26:
                return CoworkStarterChipsConfig._childSerializers$_anonymous_();
            case 27:
                return CreateCoworkRemoteSessionRequest._childSerializers$_anonymous_();
            case 28:
                return CreateFileParams._childSerializers$_anonymous_();
            default:
                return CreateMcpRemoteServerRequest._childSerializers$_anonymous_();
        }
    }
}
