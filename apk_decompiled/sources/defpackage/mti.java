package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.VoiceEvents$ConnectionDropped;
import com.anthropic.claude.analytics.events.VoiceEvents$FeedbackPrompted;
import com.anthropic.claude.analytics.events.VoiceEvents$FeedbackSubmitted;
import com.anthropic.claude.analytics.events.VoiceEvents$FocusChanged;
import com.anthropic.claude.analytics.events.VoiceEvents$SessionEnded;
import com.anthropic.claude.analytics.events.VoiceEvents$SessionError;
import com.anthropic.claude.analytics.events.VoiceEvents$SessionStarted;
import com.anthropic.claude.analytics.events.VoiceEvents$SettingsChanged;
import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentOptInPromptDismissed;
import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentOptInPromptSubmitted;
import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentOptInPromptViewed;
import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentSettingsChanged;
import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentSettingsViewed;
import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentSharePreferencePromptDismissed;
import com.anthropic.claude.analytics.events.VoiceEvents$TrainingConsentSharePreferencePromptSubmitted;
import com.anthropic.claude.analytics.events.VoiceEvents$TurnCompleted;
import com.anthropic.claude.api.login.VerifyResponse;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mti implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ mti(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return VerifyResponse._childSerializers$_anonymous_();
            case 1:
                wjk.p("onOpenSystemAppSettings");
                return ieiVar;
            case 2:
                wjk.p("onDismissTool");
                return ieiVar;
            case 3:
                return VoiceEvents$ConnectionDropped._childSerializers$_anonymous_();
            case 4:
                return VoiceEvents$FeedbackPrompted._childSerializers$_anonymous_();
            case 5:
                return VoiceEvents$FeedbackSubmitted._childSerializers$_anonymous_();
            case 6:
                return VoiceEvents$FocusChanged._childSerializers$_anonymous_();
            case 7:
                return VoiceEvents$FocusChanged._childSerializers$_anonymous_$0();
            case 8:
                return VoiceEvents$FocusChanged._childSerializers$_anonymous_$1();
            case 9:
                return VoiceEvents$SessionEnded._childSerializers$_anonymous_();
            case 10:
                return VoiceEvents$SessionEnded._childSerializers$_anonymous_$0();
            case 11:
                return VoiceEvents$SessionError._childSerializers$_anonymous_();
            case 12:
                return VoiceEvents$SessionError._childSerializers$_anonymous_$0();
            case 13:
                return VoiceEvents$SessionStarted._childSerializers$_anonymous_();
            case 14:
                return VoiceEvents$SessionStarted._childSerializers$_anonymous_$0();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return VoiceEvents$SettingsChanged._childSerializers$_anonymous_();
            case 16:
                return VoiceEvents$SettingsChanged._childSerializers$_anonymous_$0();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return VoiceEvents$TrainingConsentOptInPromptDismissed._childSerializers$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return VoiceEvents$TrainingConsentOptInPromptDismissed._childSerializers$_anonymous_$0();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return VoiceEvents$TrainingConsentOptInPromptSubmitted._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return VoiceEvents$TrainingConsentOptInPromptSubmitted._childSerializers$_anonymous_$0();
            case 21:
                return VoiceEvents$TrainingConsentOptInPromptViewed._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return VoiceEvents$TrainingConsentSettingsChanged._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return VoiceEvents$TrainingConsentSettingsChanged._childSerializers$_anonymous_$0();
            case 24:
                return VoiceEvents$TrainingConsentSettingsChanged._childSerializers$_anonymous_$1();
            case BuildConfig.VERSION_CODE /* 25 */:
                return VoiceEvents$TrainingConsentSettingsViewed._childSerializers$_anonymous_();
            case 26:
                return VoiceEvents$TrainingConsentSettingsViewed._childSerializers$_anonymous_$0();
            case 27:
                return VoiceEvents$TrainingConsentSharePreferencePromptDismissed._childSerializers$_anonymous_();
            case 28:
                return VoiceEvents$TrainingConsentSharePreferencePromptSubmitted._childSerializers$_anonymous_();
            default:
                return VoiceEvents$TurnCompleted._childSerializers$_anonymous_();
        }
    }
}
