package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.agentchat.AgentChatDestination;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsBlockingPoint;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsUserBlocked;
import com.anthropic.claude.analytics.events.AnonymousEvents$AccountCreationErrorSource;
import com.anthropic.claude.analytics.events.AnonymousEvents$AccountCreationFailed;
import com.anthropic.claude.analytics.events.AppIntentEvents$AppIntentStart;
import com.anthropic.claude.analytics.events.AppIntentEvents$AppIntentType;
import com.anthropic.claude.analytics.events.AppIntentEvents$AppOpenedWithIntent;
import com.anthropic.claude.analytics.events.ArtifactSharingEvents$ArtifactShareFailed;
import com.anthropic.claude.api.account.AcceptLegalDocsRequest;
import com.anthropic.claude.api.account.AccountDeletableResponse;
import com.anthropic.claude.api.chat.tool.AgentSummary;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.artifact.sheet.ArtifactBottomSheetParams;
import com.anthropic.claude.chatlist.all.bottomsheet.AllChatsListBottomSheetDestination;
import com.anthropic.claude.configs.flags.AgentChatWorkerTypesConfig;
import com.anthropic.claude.conway.protocol.AgentState;
import com.anthropic.claude.sessions.types.AgentOwnedSessionSummary;
import com.anthropic.claude.sessions.types.ApiUserMessageContent;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b5 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ b5(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return AcceptLegalDocsRequest._childSerializers$_anonymous_();
            case 1:
                return AccountDeletableResponse._childSerializers$_anonymous_();
            case 2:
                return AgeSignalsEvents$AgeSignalsBlockingPoint._init_$_anonymous_();
            case 3:
                return AgeSignalsEvents$AgeSignalsUserBlocked._childSerializers$_anonymous_();
            case 4:
                return x44.W(AgentChatDestination.Home.INSTANCE);
            case 5:
                return mpk.P(null);
            case 6:
                return AgentChatDestination.Home._init_$_anonymous_();
            case 7:
                return mpk.P(pgc.E);
            case 8:
                return mpk.P(Boolean.FALSE);
            case 9:
                z74 z74Var = wp.a;
                return iei.a;
            case 10:
                return AgentChatWorkerTypesConfig._childSerializers$_anonymous_();
            case 11:
                return AgentOwnedSessionSummary._childSerializers$_anonymous_();
            case 12:
                return AgentState._childSerializers$_anonymous_();
            case 13:
                return AgentSummary._childSerializers$_anonymous_();
            case 14:
                qnc qncVar = nt.a;
                return zp5.a;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return AllChatsListBottomSheetDestination.Closed._init_$_anonymous_();
            case 16:
                return AllChatsListBottomSheetDestination.SelectProject._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return x44.W(AllChatsListBottomSheetDestination.Closed.INSTANCE);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return mpk.P(Boolean.FALSE);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AnonymousEvents$AccountCreationErrorSource._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return AnonymousEvents$AccountCreationFailed._childSerializers$_anonymous_();
            case 21:
                return ApiUserMessageContent.Blocks._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new s2i(-3.4028235E38f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AppIntentEvents$AppIntentStart._childSerializers$_anonymous_();
            case 24:
                return AppIntentEvents$AppIntentType._init_$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return AppIntentEvents$AppOpenedWithIntent._childSerializers$_anonymous_();
            case 26:
                return ArtifactBottomSheetParams._init_$_anonymous_();
            case 27:
                return ArtifactMetadata._childSerializers$_anonymous_();
            case 28:
                return mpk.P(Boolean.FALSE);
            default:
                return ArtifactSharingEvents$ArtifactShareFailed._childSerializers$_anonymous_();
        }
    }
}
