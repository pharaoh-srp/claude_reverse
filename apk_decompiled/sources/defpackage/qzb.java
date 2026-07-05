package defpackage;

import com.anthropic.claude.api.feature.Feature;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qzb {
    public static final List n = x44.X("cowork", "claude_code_assistant");
    public final rc8 a;
    public final nf7 b;
    public final wlg c;
    public final wlg d;
    public final wlg e;
    public final wlg f;
    public final wlg g;
    public final wlg h;
    public final wlg i;
    public final wlg j;
    public final wlg k;
    public final wlg l;
    public final wlg m;

    public qzb(rc8 rc8Var, nf7 nf7Var) {
        this.a = rc8Var;
        this.b = nf7Var;
        this.c = rc8Var.m("claudeai_dual_pane_medium_width");
        this.d = rc8Var.d();
        this.e = rc8Var.m("mobile_drawer_customization_enabled");
        this.f = rc8Var.m("mobile_android_remote_enabled");
        this.g = rc8Var.m("yukon_silver_dramatic_shrimp");
        this.h = rc8Var.m("mobile_cowork_tab_enabled");
        this.i = rc8Var.m("mobile_cowork_task_cards_enabled");
        this.j = rc8Var.m("mobile_cowork_task_list_enabled");
        this.k = rc8Var.m("yukon_silver_manta_mobile");
        this.l = rc8Var.m("mobile_session_latest_first_pagination");
        this.m = rc8Var.m("mobile_dispatch_event_cache_enabled");
    }

    public final boolean a() {
        return ((Boolean) this.h.getValue()).booleanValue() && ((Boolean) this.b.c(Feature.DITTOS).getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.f.getValue()).booleanValue() && ((Boolean) this.b.c(Feature.CLAUDE_CODE_WEB).getValue()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.g.getValue()).booleanValue() && ((Boolean) this.b.c(Feature.DRAMATIC_SHRIMP).getValue()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }
}
