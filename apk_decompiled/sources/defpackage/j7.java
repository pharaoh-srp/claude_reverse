package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsApiError;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsCheckCompleted;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsErrorType;
import com.anthropic.claude.analytics.events.AgeSignalsEvents$AgeSignalsResult;
import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchCompleted;
import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchDestination;
import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchStartType;
import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.AppStartResponse;
import com.anthropic.claude.api.chat.tool.ArrayProperty;
import com.anthropic.claude.api.model.Badge;
import com.anthropic.claude.api.tasks.AssistantTextEvent;
import com.anthropic.claude.tool.model.AlarmCreateV0Input;
import com.anthropic.claude.tool.model.AskUserInputV0Input;
import com.anthropic.claude.types.environment.AppEnvironment;
import java.util.UUID;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j7 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ j7(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return Account._childSerializers$_anonymous_();
            case 1:
                return AccountSettings._childSerializers$_anonymous_();
            case 2:
                return AccountSettings._childSerializers$_anonymous_$0();
            case 3:
                blk.d();
                return iei.a;
            case 4:
                return Integer.valueOf(h1e.F.g(2147418112) + 65536);
            case 5:
                return UUID.randomUUID().toString();
            case 6:
                return AgeSignalsEvents$AgeSignalsApiError._childSerializers$_anonymous_();
            case 7:
                return AgeSignalsEvents$AgeSignalsCheckCompleted._childSerializers$_anonymous_();
            case 8:
                return AgeSignalsEvents$AgeSignalsErrorType._init_$_anonymous_();
            case 9:
                return AgeSignalsEvents$AgeSignalsResult._init_$_anonymous_();
            case 10:
                return AlarmCreateV0Input._childSerializers$_anonymous_();
            case 11:
                return new isc(0);
            case 12:
                umg umgVar = yd0.a;
                return null;
            case 13:
                return sta.h0(new cpc("https://api.claude.ai", xe0.g.a), new cpc("https://api.claude-ai.staging.ant.dev", ye0.g.a));
            case 14:
                xe4 xe4Var = eg0.a;
                return lt5.a;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                xe4 xe4Var2 = eg0.a;
                return lv5.a;
            case 16:
                return AppEnvironment._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return AppStartEvents$AppLaunchCompleted._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return AppStartEvents$AppLaunchCompleted._childSerializers$_anonymous_$0();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AppStartEvents$AppLaunchCompleted._childSerializers$_anonymous_$1();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return AppStartEvents$AppLaunchDestination._init_$_anonymous_();
            case 21:
                return AppStartEvents$AppLaunchStartType._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AppStartResponse._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AppStartResponse._childSerializers$_anonymous_$0();
            case 24:
                return AppStartResponse._childSerializers$_anonymous_$1();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ArrayProperty._childSerializers$_anonymous_();
            case 26:
                return AskUserInputV0Input._childSerializers$_anonymous_();
            case 27:
                return AssistantTextEvent._childSerializers$_anonymous_();
            case 28:
                return new eeg(d4c.m(1308617531));
            default:
                return Badge._childSerializers$_anonymous_();
        }
    }
}
