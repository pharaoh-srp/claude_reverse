package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.VoiceEvents$TurnCompleted;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceEndReason;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceEntrySource;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceErrorKind;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceFocusResult;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceInputTrigger;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceSettingKind;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTrainingConsentDismissTrigger;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTrainingConsentState;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTrainingConsentSurface;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTurnOutcome;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewErrorStateShown;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewRenderProcessGone;
import com.anthropic.claude.analytics.events.WidgetEvents$OpenAppURLActionType;
import com.anthropic.claude.analytics.events.WidgetEvents$OpenAppViaShortcut;
import com.anthropic.claude.analytics.events.WidgetEvents$OpenAppViaURL;
import com.anthropic.claude.analytics.events.WidgetEvents$ShortcutType;
import com.anthropic.claude.api.common.WindowLimitStatus;
import com.anthropic.claude.api.wiggle.WiggleDeleteFileResult;
import com.anthropic.claude.api.wiggle.WiggleFileListResponse;
import com.anthropic.claude.login.WelcomeNotice;
import com.anthropic.claude.sessions.types.WorkerStatus;
import com.anthropic.claude.sessions.types.WorkerStatusV2;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.SignStyle;
import java.time.temporal.ChronoField;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p3j implements zy7 {
    public final /* synthetic */ int E;

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return VoiceEvents$TurnCompleted._childSerializers$_anonymous_$0();
            case 1:
                return VoiceEvents$TurnCompleted._childSerializers$_anonymous_$1();
            case 2:
                return VoiceEvents$VoiceActivationMode._init_$_anonymous_();
            case 3:
                return VoiceEvents$VoiceEndReason._init_$_anonymous_();
            case 4:
                return VoiceEvents$VoiceEntrySource._init_$_anonymous_();
            case 5:
                return VoiceEvents$VoiceErrorKind._init_$_anonymous_();
            case 6:
                return VoiceEvents$VoiceFocusResult._init_$_anonymous_();
            case 7:
                return VoiceEvents$VoiceInputTrigger._init_$_anonymous_();
            case 8:
                return VoiceEvents$VoiceSettingKind._init_$_anonymous_();
            case 9:
                return VoiceEvents$VoiceTrainingConsentDismissTrigger._init_$_anonymous_();
            case 10:
                return VoiceEvents$VoiceTrainingConsentState._init_$_anonymous_();
            case 11:
                return VoiceEvents$VoiceTrainingConsentSurface._init_$_anonymous_();
            case 12:
                return VoiceEvents$VoiceTurnOutcome._init_$_anonymous_();
            case 13:
                return WebViewEvents$WebViewErrorStateShown._childSerializers$_anonymous_();
            case 14:
                return WebViewEvents$WebViewKind._init_$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return WebViewEvents$WebViewRenderProcessGone._childSerializers$_anonymous_();
            case 16:
                return WelcomeNotice._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return WidgetEvents$OpenAppURLActionType._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return WidgetEvents$OpenAppViaShortcut._childSerializers$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return WidgetEvents$OpenAppViaURL._childSerializers$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return WidgetEvents$ShortcutType._init_$_anonymous_();
            case 21:
                return WiggleDeleteFileResult._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return WiggleFileListResponse._childSerializers$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return WindowLimitStatus._init_$_anonymous_();
            case 24:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case BuildConfig.VERSION_CODE /* 25 */:
                return WorkerStatus._init_$_anonymous_();
            case 26:
                return WorkerStatusV2._init_$_anonymous_();
            case 27:
                ijj ijjVar = new ijj(new dn0(0));
                gn5.c(ijjVar);
                uvk.e(ijjVar, '-');
                gn5.f(ijjVar);
                return new jjj(ijjVar.build());
            default:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
        }
    }

    public /* synthetic */ p3j(int i) {
        this.E = i;
    }
}
