package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.CodeEvents$ModelSelectorPersistFailed;
import com.anthropic.claude.analytics.events.CodeEvents$ModelSelectorPersistTrigger;
import com.anthropic.claude.analytics.events.CodeEvents$ModelSelectorSelected;
import com.anthropic.claude.analytics.events.CodeEvents$ModelSelectorViewed;
import com.anthropic.claude.analytics.events.CodeEvents$PullRequestOpenEntryPoint;
import com.anthropic.claude.analytics.events.CodeEvents$PullRequestOpened;
import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptAnswered;
import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptChoice;
import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptResponseFailed;
import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptShown;
import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptTrigger;
import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptWithdrawn;
import com.anthropic.claude.analytics.events.CodeEvents$RefusalFallbackPromptWithdrawnReason;
import com.anthropic.claude.analytics.events.CodeEvents$UserDialogAutoCancelReason;
import com.anthropic.claude.analytics.events.CodeEvents$UserDialogAutoCancelled;
import com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination;
import com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams;
import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.code.remote.e;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wt3 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ wt3(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return CodeEvents$ModelSelectorPersistFailed._childSerializers$_anonymous_$0();
            case 1:
                return CodeEvents$ModelSelectorPersistTrigger._init_$_anonymous_();
            case 2:
                return CodeEvents$ModelSelectorSelected._childSerializers$_anonymous_();
            case 3:
                return CodeEvents$ModelSelectorViewed._childSerializers$_anonymous_();
            case 4:
                return CodeEvents$PullRequestOpenEntryPoint._init_$_anonymous_();
            case 5:
                return CodeEvents$PullRequestOpened._childSerializers$_anonymous_();
            case 6:
                return CodeEvents$RefusalFallbackPromptAnswered._childSerializers$_anonymous_();
            case 7:
                return CodeEvents$RefusalFallbackPromptChoice._init_$_anonymous_();
            case 8:
                return CodeEvents$RefusalFallbackPromptResponseFailed._childSerializers$_anonymous_();
            case 9:
                return CodeEvents$RefusalFallbackPromptShown._childSerializers$_anonymous_();
            case 10:
                return CodeEvents$RefusalFallbackPromptTrigger._init_$_anonymous_();
            case 11:
                return CodeEvents$RefusalFallbackPromptWithdrawn._childSerializers$_anonymous_();
            case 12:
                return CodeEvents$RefusalFallbackPromptWithdrawnReason._init_$_anonymous_();
            case 13:
                return CodeEvents$UserDialogAutoCancelReason._init_$_anonymous_();
            case 14:
                return CodeEvents$UserDialogAutoCancelled._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ad9 ad9Var = e.a;
                return ieiVar;
            case 16:
                return mpk.P(Boolean.FALSE);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return new mdg();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return new kdg();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                yig yigVar = g34.a;
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return CodeRemoteSessionScreenParams._childSerializers$_anonymous_();
            case 21:
                return CodeSessionListScope.Code._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return CodeSessionListScope.DramaticShrimp._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return CodeSessionListScope.Scheduled._init_$_anonymous_();
            case 24:
                return CollapsedToolsSheetDestination.Dismissed._init_$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return CollapsedToolsSheetDestination.Sources._childSerializers$_anonymous_();
            case 26:
                return CollapsedToolsSheetDestination.Summary._init_$_anonymous_();
            case 27:
                return Float.valueOf(0.6f);
            case 28:
                return Float.valueOf(0.9f);
            default:
                return Float.valueOf(0.3f);
        }
    }
}
