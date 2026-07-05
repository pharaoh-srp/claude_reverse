package defpackage;

import android.net.Uri;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.events.HealthMetricEventConfig;
import com.anthropic.claude.configs.AccountSwitcherConfig;
import com.anthropic.claude.configs.flags.OnboardingConfig;
import com.anthropic.claude.configs.flags.SseKeepaliveConfig;
import com.anthropic.claude.configs.flags.UploadConfig;
import com.anthropic.claude.models.organization.configtypes.CoworkStarterChipsConfig;
import com.anthropic.claude.settings.internal.growthbook.GateKind;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ed8 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ed8(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = 1;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                k18 k18Var = (k18) obj;
                k18Var.getClass();
                k18Var.a(null, new String[]{"claudeai_mcp_apps_visualize_toolbox_server", "mobile_connector_directory_enabled", "mobile_mcp_app_authed_wrapper", "mobile_mcp_apps_enabled", "mobile_mcp_bootstrap_streaming_enabled"});
                return ieiVar;
            case 1:
                k18 k18Var2 = (k18) obj;
                k18Var2.getClass();
                k18Var2.a(null, new String[]{"mobile_conway_suggest_connectors_enabled", "squares_enabled_mobile"});
                return ieiVar;
            case 2:
                l18 l18Var = (l18) obj;
                l18Var.getClass();
                l18Var.a("Account", new ed8(9));
                l18Var.a("Animation", new hz6(25));
                l18Var.a("Artifacts", new hz6(27));
                l18Var.a("Chat", new hz6(28));
                l18Var.a("Code", new hz6(29));
                l18Var.a("Connectors", new ed8(z ? 1 : 0));
                l18Var.a("Conway", new ed8(i2));
                l18Var.a("Cowork", new ed8(3));
                l18Var.a("Feedback", new ed8(4));
                l18Var.a("Infrastructure", new ed8(5));
                l18Var.a("Memory", new ed8(10));
                l18Var.a("Model Selector", new ed8(11));
                l18Var.a("Navigation", new ed8(12));
                l18Var.a("Networking", new ed8(13));
                l18Var.a("Notifications", new ed8(14));
                l18Var.a("Onboarding", new ed8(15));
                l18Var.a("Privacy", new ed8(16));
                l18Var.a("Rate Limits", new hz6(22));
                l18Var.a("Tools", new hz6(23));
                l18Var.a("Voice", new hz6(24));
                l18Var.a("Other", new hz6(26));
                return ieiVar;
            case 3:
                k18 k18Var3 = (k18) obj;
                k18Var3.getClass();
                k18Var3.a(null, new String[]{"claude_ai_tasks_nav", "claudeai_code_remote_connectors", "mobile_cowork_tab_enabled", "mobile_cowork_task_cards_enabled", "mobile_cowork_task_list_enabled", "mobile_dispatch_event_cache_enabled", "yukon_silver_dramatic_shrimp_primer_mobile", "yukon_silver_manta_mobile"});
                k18Var3.a(GateKind.JSON, new String[]{CoworkStarterChipsConfig.CONFIG_NAME});
                return ieiVar;
            case 4:
                k18 k18Var4 = (k18) obj;
                k18Var4.getClass();
                k18Var4.a(null, new String[]{"mobile_allow_segment_beta_app_feedback", "mobile_shake_feedback_enabled"});
                return ieiVar;
            case 5:
                k18 k18Var5 = (k18) obj;
                k18Var5.getClass();
                k18Var5.a(null, new String[]{"mobile_use_experiences_framework"});
                return ieiVar;
            case 6:
                k18 k18Var6 = (k18) obj;
                k18Var6.getClass();
                k18Var6.a(null, new String[]{"claudeai_in_app_browser_enabled"});
                return ieiVar;
            case 7:
                k18 k18Var7 = (k18) obj;
                k18Var7.getClass();
                k18Var7.a(null, new String[]{"mobile_datadog_rum_enabled"});
                k18Var7.a(GateKind.JSON, new String[]{HealthMetricEventConfig.FEATURE_NAME});
                return ieiVar;
            case 8:
                k18 k18Var8 = (k18) obj;
                k18Var8.getClass();
                k18Var8.a(null, new String[]{"claudeai_webview_async_startup", "mobile_font_icons_enabled"});
                return ieiVar;
            case 9:
                k18 k18Var9 = (k18) obj;
                k18Var9.getClass();
                k18Var9.a(GateKind.JSON, new String[]{AccountSwitcherConfig.CONFIG_NAME});
                k18Var9.a(null, new String[]{AccountSwitcherConfig.FLAG_ACCOUNT_SWITCHER, "mobile_subscription_max_plan_enabled"});
                return ieiVar;
            case 10:
                k18 k18Var10 = (k18) obj;
                k18Var10.getClass();
                k18Var10.a(null, new String[]{"claudeai_saffron_enabled", "claudeai_saffron_ghost_enabled", "claudeai_saffron_search_enabled"});
                return ieiVar;
            case 11:
                k18 k18Var11 = (k18) obj;
                k18Var11.getClass();
                k18Var11.a(null, new String[]{"model_selector_enabled", "sticky_model_selector"});
                return ieiVar;
            case 12:
                k18 k18Var12 = (k18) obj;
                k18Var12.getClass();
                k18Var12.a(null, new String[]{"mobile_android_drawer_footer_redesign", "mobile_drawer_customization_enabled"});
                return ieiVar;
            case 13:
                k18 k18Var13 = (k18) obj;
                k18Var13.getClass();
                k18Var13.a(null, new String[]{UploadConfig.DETERMINATE_PROGRESS_GATE, UploadConfig.DIRECT_FILESTORE_GATE});
                k18Var13.a(GateKind.JSON, new String[]{SseKeepaliveConfig.FEATURE_KEY});
                k18Var13.a(null, new String[]{UploadConfig.WORKMANAGER_GATE, "mobile_networking_cronet_holdout", "polling_chat_completion_recovery"});
                return ieiVar;
            case 14:
                k18 k18Var14 = (k18) obj;
                k18Var14.getClass();
                k18Var14.a(null, new String[]{"mobile_chat_completion_notif_enabled", "mobile_code_notifications_enabled", "mobile_is_research_status_notification_enabled"});
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                k18 k18Var15 = (k18) obj;
                k18Var15.getClass();
                k18Var15.a(null, new String[]{"mobile_delay_age_verification"});
                k18Var15.a(GateKind.JSON, new String[]{OnboardingConfig.FEATURE_KEY, "supported_regions"});
                k18Var15.a(null, new String[]{"mobile_show_affirmative_consent", "mobile_show_affirmative_consent_for_privacy_policy", "mobile_use_birthday_for_age_verification"});
                return ieiVar;
            case 16:
                k18 k18Var16 = (k18) obj;
                k18Var16.getClass();
                k18Var16.a(null, new String[]{"claude_grove_enabled", "voice_consent_jit_sheet_enabled", "voice_consent_setting_enabled"});
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                f3a f3aVar = (f3a) obj;
                f3aVar.getClass();
                return new cpc(Double.valueOf(f3aVar.a()), "meters");
            case g.AVG_FIELD_NUMBER /* 18 */:
                t5j t5jVar = (t5j) obj;
                t5jVar.getClass();
                return new cpc(Double.valueOf(t5jVar.a()), "L");
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                qw2 qw2Var = (qw2) obj;
                qw2Var.getClass();
                Uri uri = qw2Var.c;
                return uri == null ? qw2Var.b.getThumbnail_asset() : uri;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((byte[]) obj).getClass();
                throw new IllegalStateException("Android platform doesn't support SVG format.");
            case 21:
                ((ekf) obj).getClass();
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((dfh) obj).e(null);
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ag8 ag8Var = (ag8) obj;
                ag8Var.getClass();
                return Boolean.valueOf(ag8Var.a.a.equals("__Host-ant_trusted_device"));
            case 24:
                ((b3d) obj).getClass();
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 26:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 27:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 28:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            default:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
        }
    }
}
