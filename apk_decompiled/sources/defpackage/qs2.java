package defpackage;

import com.anthropic.claude.configs.flags.StreamSmoothingConfig;

/* JADX INFO: loaded from: classes.dex */
public final class qs2 {
    public final rc8 a;
    public final wlg b;
    public final wlg c;
    public final wlg d;
    public final wlg e;
    public final wlg f;
    public final wlg g;

    public qs2(rc8 rc8Var) {
        this.a = rc8Var;
        this.b = rc8Var.m("mobile_enable_edit_message");
        this.c = rc8Var.m("mobile_chat_list_item_animation");
        this.d = rc8Var.m("mobile_android_chat_control_haze");
        rc8Var.m("polling_chat_completion_recovery");
        this.e = rc8Var.m("claudeai_add_menu_half_height");
        this.f = rc8Var.m("cai_kiwano");
        this.g = rc8Var.m("mobile_recent_photos_strip");
    }

    public final StreamSmoothingConfig a() {
        return (StreamSmoothingConfig) this.a.i(StreamSmoothingConfig.FEATURE_KEY, StreamSmoothingConfig.Companion.serializer());
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }
}
