package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.NetworkingEvents$RequestFailureReason;
import com.anthropic.claude.analytics.events.OfflineEvents$CacheAgeBucket;
import com.anthropic.claude.analytics.events.OfflineEvents$OfflineErrorKind;
import com.anthropic.claude.analytics.events.OfflineEvents$OfflineScreen;
import com.anthropic.claude.analytics.events.OfflineEvents$ScreenResolved;
import com.anthropic.claude.analytics.events.OfflineEvents$ScreenResolvedOutcome;
import com.anthropic.claude.api.notification.NotificationChannelSchema;
import com.anthropic.claude.api.notification.NotificationChannelStatus;
import com.anthropic.claude.api.notification.NotificationChannelType;
import com.anthropic.claude.api.notification.NotificationChannelUpdateParams;
import com.anthropic.claude.app.onboarding.OnboardingPage;
import com.anthropic.claude.configs.flags.OnboardingConfig;
import com.anthropic.claude.models.organization.configtypes.OctopusConfig;
import com.anthropic.claude.sessions.types.Outcome;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e2c implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ e2c(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return NetworkingEvents$RequestFailureReason._init_$_anonymous_();
            case 1:
                return NotificationChannelSchema._childSerializers$_anonymous_();
            case 2:
                return NotificationChannelSchema._childSerializers$_anonymous_$0();
            case 3:
                return NotificationChannelSchema._childSerializers$_anonymous_$1();
            case 4:
                return NotificationChannelStatus._init_$_anonymous_();
            case 5:
                return NotificationChannelType._init_$_anonymous_();
            case 6:
                return NotificationChannelUpdateParams._childSerializers$_anonymous_();
            case 7:
                return NotificationChannelUpdateParams._childSerializers$_anonymous_$0();
            case 8:
                return OctopusConfig._childSerializers$_anonymous_();
            case 9:
                return OctopusConfig._childSerializers$_anonymous_$0();
            case 10:
                return OctopusConfig._childSerializers$_anonymous_$1();
            case 11:
                return OctopusConfig._childSerializers$_anonymous_$2();
            case 12:
                return OfflineEvents$CacheAgeBucket._init_$_anonymous_();
            case 13:
                return OfflineEvents$OfflineErrorKind._init_$_anonymous_();
            case 14:
                return OfflineEvents$OfflineScreen._init_$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return OfflineEvents$ScreenResolved._childSerializers$_anonymous_();
            case 16:
                return OfflineEvents$ScreenResolved._childSerializers$_anonymous_$0();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return OfflineEvents$ScreenResolved._childSerializers$_anonymous_$1();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return OfflineEvents$ScreenResolved._childSerializers$_anonymous_$2();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return OfflineEvents$ScreenResolvedOutcome._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return new z82(new hdc());
            case 21:
                return OnboardingConfig._childSerializers$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return OnboardingPage.Age._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return OnboardingPage.Desktop._init_$_anonymous_();
            case 24:
                return OnboardingPage.Grove._init_$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return OnboardingPage.Intro._init_$_anonymous_();
            case 26:
                return OnboardingPage.Name._init_$_anonymous_();
            case 27:
                return OnboardingPage.Permission._init_$_anonymous_();
            case 28:
                return OnboardingPage.Phone._init_$_anonymous_();
            default:
                return Outcome._init_$_anonymous_();
        }
    }
}
