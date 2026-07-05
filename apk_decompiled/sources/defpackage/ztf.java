package defpackage;

import androidx.glance.session.SessionWorker;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.app.SettingsScreenParams;
import com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination;
import com.anthropic.claude.sessions.types.SessionStatus;
import com.anthropic.claude.sessions.types.SessionV2;
import com.anthropic.claude.sessions.types.SetSessionMcpServersRequest;
import com.anthropic.claude.sessions.types.ShareRecord;
import com.anthropic.claude.sessions.types.ShareStatus;
import com.anthropic.claude.sessions.types.ShareVisibilityType;
import com.anthropic.claude.settings.SettingsAppScreen;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ztf implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ztf(SessionWorker sessionWorker) {
        this.E = 3;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                return SessionStatus._init_$_anonymous_();
            case 1:
                return SessionV2._childSerializers$_anonymous_();
            case 2:
                return SessionV2._childSerializers$_anonymous_$0();
            case 3:
                return knk.g();
            case 4:
                return SetSessionMcpServersRequest._childSerializers$_anonymous_();
            case 5:
                return mpk.P(Boolean.FALSE);
            case 6:
                return SettingsAppScreen.BillingScreen._childSerializers$_anonymous_();
            case 7:
                return SettingsAppScreen.CalendarPermissionScreen._init_$_anonymous_();
            case 8:
                return SettingsAppScreen.CapabilitiesScreen._init_$_anonymous_();
            case 9:
                return SettingsAppScreen.ConnectedAppsScreen._init_$_anonymous_();
            case 10:
                return SettingsAppScreen.ConnectorDirectory._init_$_anonymous_();
            case 11:
                return SettingsAppScreen.ConnectorsScreen._init_$_anonymous_();
            case 12:
                return SettingsAppScreen.HealthPermissionScreen._init_$_anonymous_();
            case 13:
                return SettingsAppScreen.LicensesScreen._init_$_anonymous_();
            case 14:
                return SettingsAppScreen.LocationPermissionScreen._init_$_anonymous_();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return SettingsAppScreen.MemoryFilesScreen._init_$_anonymous_();
            case 16:
                return SettingsAppScreen.MobileAppFeedbackScreen._init_$_anonymous_();
            case g.MAX_FIELD_NUMBER /* 17 */:
                return SettingsAppScreen.NotificationSettingsScreen._init_$_anonymous_();
            case g.AVG_FIELD_NUMBER /* 18 */:
                return SettingsAppScreen.PermissionsScreen._init_$_anonymous_();
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return SettingsAppScreen.PrivacyScreen._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return SettingsAppScreen.ProfileScreen._init_$_anonymous_();
            case 21:
                return SettingsAppScreen.SharedLinksScreen._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return SettingsAppScreen.UsageScreen._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return mpk.P(Boolean.FALSE);
            case 24:
                return SettingsScreenParams._childSerializers$_anonymous_();
            case BuildConfig.VERSION_CODE /* 25 */:
                return ShareRecord._childSerializers$_anonymous_();
            case 26:
                return ShareRecord._childSerializers$_anonymous_$0();
            case 27:
                return ShareStatus._init_$_anonymous_();
            case 28:
                return ShareVisibilityType._init_$_anonymous_();
            default:
                return SharedChatModalBottomSheetDestination.Closed._init_$_anonymous_();
        }
    }

    public /* synthetic */ ztf(int i) {
        this.E = i;
    }
}
