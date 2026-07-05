package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.experience.ExperienceClientAction;
import com.anthropic.claude.api.experience.NewChatAction;
import com.anthropic.claude.api.experience.OpenLinkAction;
import com.anthropic.claude.api.experience.RefreshCacheAction;
import com.anthropic.claude.api.experience.RemoteAction;
import com.anthropic.claude.configs.flags.StreamSmoothingConfig;
import com.anthropic.claude.configs.flags.VoiceAdaptiveGainConfig;
import com.anthropic.claude.settings.internal.growthbook.GateKind;
import java.time.Duration;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hz6 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ hz6(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = 15;
        int i3 = 0;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((String) obj).getClass();
                break;
            case 1:
                ((String) obj).getClass();
                break;
            case 2:
                ((String) obj).getClass();
                break;
            case 3:
                ((Duration) obj).getClass();
                break;
            case 4:
                ExperienceClientAction experienceClientAction = (ExperienceClientAction) obj;
                experienceClientAction.getClass();
                boolean z = experienceClientAction instanceof RemoteAction;
                if (z) {
                    String id = ((RemoteAction) experienceClientAction).getId();
                    if (id == null) {
                        id = "";
                    }
                    break;
                } else if (!(experienceClientAction instanceof NewChatAction)) {
                    if (!(experienceClientAction instanceof OpenLinkAction)) {
                        if (!(experienceClientAction instanceof RefreshCacheAction)) {
                            if (z) {
                            }
                        }
                    }
                }
                break;
            case 5:
                ekf ekfVar = (ekf) obj;
                ekfVar.getClass();
                ckf.e(ekfVar);
                break;
            case 6:
                ((ekf) obj).getClass();
                break;
            case 7:
                zc5 zc5Var = (zc5) obj;
                zc5Var.getClass();
                break;
            case 8:
                ckf.s((ekf) obj, 0);
                break;
            case 9:
                Double d = (Double) obj;
                d.doubleValue();
                break;
            case 10:
                cte cteVar = (cte) obj;
                cteVar.getClass();
                break;
            case 11:
                cte cteVar2 = (cte) obj;
                cteVar2.getClass();
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                break;
            case 16:
                h5b h5bVar = (h5b) obj;
                h5bVar.getClass();
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((kta) obj).getClass();
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                kta ktaVar = (kta) obj;
                ktaVar.getClass();
                Object tag = ktaVar.getTag();
                tag.getClass();
                dta dtaVar = (dta) tag;
                p88 p88Var = dtaVar.a;
                k2a k2aVar = dtaVar.b;
                ktaVar.getContext().unregisterComponentCallbacks(p88Var);
                if (((a4a) k2aVar.G).compareTo(a4a.F) > 0) {
                    k2aVar.b(a4a.E);
                }
                ktaVar.setTag(null);
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ekf ekfVar2 = (ekf) obj;
                ekfVar2.getClass();
                ckf.f(ekfVar2);
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                og9 og9Var = (og9) obj;
                og9Var.getClass();
                og9Var.d = true;
                og9Var.e = true;
                og9Var.c = true;
                break;
            case 21:
                l18 l18Var = (l18) obj;
                l18Var.getClass();
                l18Var.a("Foundation", new ed8(6));
                l18Var.a("Observability", new ed8(7));
                l18Var.a("Performance", new ed8(8));
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                k18 k18Var = (k18) obj;
                k18Var.getClass();
                k18Var.a(null, new String[]{"mobile_android_rate_limit_banner_v2", "mobile_rate_limit_paid_tier_upsell_v1"});
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                k18 k18Var2 = (k18) obj;
                k18Var2.getClass();
                k18Var2.a(null, new String[]{"mobile_alarm_creator_tool_enabled", "mobile_event_creator_tool_enabled", "mobile_is_compass_enabled", "mobile_text_message_creator_tool_enabled", "mobile_timer_creator_tool_enabled", "mobile_tool_search_enabled"});
                break;
            case 24:
                k18 k18Var3 = (k18) obj;
                k18Var3.getClass();
                k18Var3.a(null, new String[]{"mobile_claude_speaks"});
                k18Var3.a(GateKind.JSON, new String[]{VoiceAdaptiveGainConfig.FEATURE_KEY});
                k18Var3.a(null, new String[]{"mobile_hold_to_dictate_enabled", "project_bell_android_ptt_enabled", "project_bell_assistant_audio_enabled", "project_bell_async_teardown_enabled", "project_bell_hold_websocket_park_enabled", "project_bell_opus_output_enabled", "project_bell_sound_pool_enabled", "project_bell_tts_track_recreate_on_dead_object", "voice_mode_request_focus"});
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                k18 k18Var4 = (k18) obj;
                k18Var4.getClass();
                k18Var4.a(null, new String[]{"mobile_chat_list_item_animation"});
                break;
            case 26:
                k18 k18Var5 = (k18) obj;
                k18Var5.getClass();
                k18Var5.a(null, new String[]{"mobile_use_localization_service", "project_janus"});
                break;
            case 27:
                k18 k18Var6 = (k18) obj;
                k18Var6.getClass();
                k18Var6.a(null, new String[]{"mobile_artifact_deep_link_kill_switch", "mobile_artifacts_gallery", "mobile_turmeric_enabled"});
                break;
            case 28:
                k18 k18Var7 = (k18) obj;
                k18Var7.getClass();
                k18Var7.a(GateKind.JSON, new String[]{StreamSmoothingConfig.FEATURE_KEY});
                k18Var7.a(null, new String[]{"android_docx_preview_enabled", "android_xlsx_preview_enabled", "mobile_chat_change_project_enabled", "mobile_enable_edit_message", "mobile_project_knowledge_preview", "mobile_recent_photos_strip"});
                break;
            default:
                k18 k18Var8 = (k18) obj;
                k18Var8.getClass();
                k18Var8.a(null, new String[]{"ccr_client_presence_enabled", "ccr_code_requires_action_category_enabled", "ccr_live_streaming", "ccr_mobile_agent_sessions", "ccr_mobile_eager_session_wake", "ccr_mobile_sessions_watch_kill_switch", "ccr_plan_mode_enabled", "ccr_rate_limit_alert_band_v1", "ccr_step_up_reauth", "ccr_unread_indicator_main", "ccr_v2_session_api", "ccr_v2_session_stream", "mobile_android_remote_enabled", "mobile_ccr_per_message_attestation", "mobile_ccr_v2_session_events", "mobile_session_latest_first_pagination", "mobile_use_ucr_for_wiggle", "trials_and_tribulations_of_high_school_football"});
                break;
        }
        return ieiVar;
    }
}
