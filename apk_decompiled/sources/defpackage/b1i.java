package defpackage;

import com.anthropic.claude.api.feature.Feature;
import com.anthropic.claude.configs.flags.ConditionalMcpDirectoryServersConfig;
import com.anthropic.claude.configs.flags.TaskAgentOverridesDebugConfig;
import com.anthropic.claude.configs.flags.ToolSearchConfig;

/* JADX INFO: loaded from: classes.dex */
public final class b1i {
    public final wlg A;
    public final wlg B;
    public final wlg C;
    public final wlg D;
    public final wlg E;
    public final rc8 a;
    public final nf7 b;
    public final wlg c;
    public final wz5 d;
    public final wlg e;
    public final wlg f;
    public final wlg g;
    public final wlg h;
    public final wlg i;
    public final wlg j;
    public final wlg k;
    public final wlg l;
    public final wlg m;
    public final wlg n;
    public final wlg o;
    public final wz5 p;
    public final wz5 q;
    public final wlg r;
    public final wlg s;
    public final wz5 t;
    public final wz5 u;
    public final wlg v;
    public final wlg w;
    public final wlg x;
    public final wlg y;
    public final wlg z;

    public b1i(rc8 rc8Var, nf7 nf7Var) {
        this.a = rc8Var;
        this.b = nf7Var;
        this.c = rc8Var.m("mobile_turmeric_enabled");
        Feature feature = Feature.WEB_SEARCH;
        a5 a5Var = a5.N;
        int i = 25;
        this.d = mpk.x(new ka1(this, "mobile_is_cheerios_enabled", feature, i), a5Var);
        this.e = rc8Var.m("mobile_is_compass_viewer_enabled");
        this.f = rc8Var.m("mobile_is_compass_enabled");
        this.g = rc8Var.m("mobile_mcp_enabled");
        this.h = rc8Var.m("mobile_mcp_bootstrap_streaming_enabled");
        this.i = rc8Var.m("mobile_mcp_apps_enabled");
        this.j = rc8Var.m("mcp_apps_tool_input_delta");
        this.k = rc8Var.m("mobile_mcp_app_authed_wrapper");
        this.l = rc8Var.m("mobile_connector_directory_enabled");
        this.m = rc8Var.m("claudeai_code_remote_connectors");
        this.n = rc8Var.m("cai_opt_in_connector_suggestions");
        this.o = rc8Var.f("conditional_mcp_directory_servers", ConditionalMcpDirectoryServersConfig.Companion.serializer());
        this.p = mpk.x(new ka1(this, "trials_and_tribulations_of_high_school_football", Feature.WIGGLE, i), a5Var);
        this.q = mpk.x(new ka1(this, "claudeai_saffron_enabled", Feature.SAFFRON, i), a5Var);
        this.r = rc8Var.m("claudeai_memory_files_native_editor");
        this.s = rc8Var.m("claudeai_saffron_ghost_enabled");
        final int i2 = 0;
        this.t = mpk.x(new zy7(this) { // from class: a1i
            public final /* synthetic */ b1i F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i3 = i2;
                b1i b1iVar = this.F;
                switch (i3) {
                    case 0:
                        Boolean bool = (Boolean) b1iVar.b.c(Feature.CONVERSATION_SEARCH).getValue();
                        bool.getClass();
                        return bool;
                    default:
                        return Boolean.valueOf(((Boolean) b1iVar.a.m("claudeai_saffron_search_enabled").getValue()).booleanValue() && ((Boolean) b1iVar.b.a().getValue()).booleanValue() && ((Boolean) b1iVar.t.getValue()).booleanValue());
                }
            }
        }, a5Var);
        final int i3 = 1;
        this.u = mpk.x(new zy7(this) { // from class: a1i
            public final /* synthetic */ b1i F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i32 = i3;
                b1i b1iVar = this.F;
                switch (i32) {
                    case 0:
                        Boolean bool = (Boolean) b1iVar.b.c(Feature.CONVERSATION_SEARCH).getValue();
                        bool.getClass();
                        return bool;
                    default:
                        return Boolean.valueOf(((Boolean) b1iVar.a.m("claudeai_saffron_search_enabled").getValue()).booleanValue() && ((Boolean) b1iVar.b.a().getValue()).booleanValue() && ((Boolean) b1iVar.t.getValue()).booleanValue());
                }
            }
        }, a5Var);
        this.v = rc8Var.m("ccr_plan_mode_enabled");
        this.w = rc8Var.m("ccr_mobile_agent_sessions");
        this.x = rc8Var.m("ccr_mobile_new_session_sheet");
        this.y = rc8Var.m("yukon_silver_dramatic_shrimp_primer_mobile");
        this.z = rc8Var.m("ccr_unread_indicator_main");
        this.A = rc8Var.m("ccr_mobile_sessions_watch_kill_switch");
        rc8Var.m("luggage_chocolate");
        this.B = rc8Var.m("ccr_mobile_slack_deeplink_on_tap");
        rc8Var.m("amber_tributary_osprey");
        this.C = rc8Var.m("mobile_tool_search_enabled");
        this.D = rc8Var.f("claudeai_tool_search_config", ToolSearchConfig.Companion.serializer());
        this.E = rc8Var.f(TaskAgentOverridesDebugConfig.FEATURE_KEY, TaskAgentOverridesDebugConfig.Companion.serializer());
    }

    public final boolean a() {
        return ((Boolean) this.w.getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.q.getValue()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.p.getValue()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }
}
