package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ole {
    public final wlg a;
    public final wlg b;

    public ole(rc8 rc8Var) {
        this.a = rc8Var.m("mobile_is_research_status_notification_enabled");
        this.b = rc8Var.m("mobile_compass_notification_upsell_enabled");
    }

    public final boolean a() {
        return ((Boolean) this.a.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue();
    }
}
