package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import com.anthropic.claude.api.account.CurrentUserAccess;
import com.anthropic.claude.api.chat.messages.CompactionStatusEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockDeltaEvent;
import com.anthropic.claude.api.chat.messages.ContentBlockStartEvent;
import com.anthropic.claude.api.common.ConsistencyLevel;
import com.anthropic.claude.api.experience.ExperiencePlacement;
import com.anthropic.claude.api.experience.ExperienceRules;
import com.anthropic.claude.api.experience.ExperiencesResponse;
import com.anthropic.claude.api.model.DisabledReason;
import com.anthropic.claude.app.ClaudeAppOverlay;
import com.anthropic.claude.configs.flags.ConditionalMcpDirectoryServersConfig;
import com.anthropic.claude.tool.model.EventCreateV1Input;
import com.anthropic.claude.tool.model.EventDeleteV0Input;
import com.anthropic.claude.tool.model.EventUpdateV0Input;
import kotlin.KotlinNothingValueException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rk3 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ rk3(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return ClaudeAppOverlay.CreateEnvironment._init_$_anonymous_();
            case 1:
                return ClaudeAppOverlay.CreateProject._init_$_anonymous_();
            case 2:
                return ClaudeAppOverlay.None._init_$_anonymous_();
            case 3:
                return ClaudeAppOverlay.VoiceSettings._init_$_anonymous_();
            case 4:
                xe4 xe4Var = il3.a;
                return af2.a;
            case 5:
                int i = ml3.f;
                return iei.a;
            case 6:
                return new mo3(0);
            case 7:
                umg umgVar = p54.a;
                return Boolean.TRUE;
            case 8:
                return CompactionStatusEvent._childSerializers$_anonymous_();
            case 9:
                pd4.b("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 10:
                return ConditionalMcpDirectoryServersConfig._childSerializers$_anonymous_();
            case 11:
                return ConsistencyLevel._init_$_anonymous_();
            case 12:
                return ContentBlockDeltaEvent._childSerializers$_anonymous_();
            case 13:
                return ContentBlockStartEvent._childSerializers$_anonymous_();
            case 14:
                return CurrentUserAccess._childSerializers$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return CurrentUserAccess._childSerializers$_anonymous_$0();
            case 16:
                return "marker";
            case g.MAX_FIELD_NUMBER /* 17 */:
                return Float.valueOf(1.0f);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return DisabledReason.ModelDisabled._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return DisabledReason.SeatRestricted._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return DisabledReason.Unknown._init_$_anonymous_();
            case 21:
                return new Handler(Looper.getMainLooper());
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return mpk.P(Boolean.FALSE);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return DrawerEvents$DrawerItem._init_$_anonymous_();
            case 24:
                return EventCreateV1Input._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return EventDeleteV0Input._childSerializers$_anonymous_();
            case 26:
                return EventUpdateV0Input._childSerializers$_anonymous_();
            case 27:
                return ExperiencePlacement._init_$_anonymous_();
            case 28:
                return ExperienceRules._childSerializers$_anonymous_();
            default:
                return ExperiencesResponse._childSerializers$_anonymous_();
        }
    }
}
