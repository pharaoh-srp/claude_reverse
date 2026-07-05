package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jf0 implements owf {
    public final /* synthetic */ rc8 a;

    public jf0(rc8 rc8Var) {
        this.a = rc8Var;
    }

    public final boolean a() {
        return ((Boolean) this.a.m("ccr_attestation_self_heal").getValue()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) this.a.m("ccr_step_up_reauth").getValue()).booleanValue();
    }

    public final int c() {
        Integer num = (Integer) this.a.f("ccr_initial_events_limit", e79.a).getValue();
        if (num == null) {
            return 200;
        }
        if (num.intValue() <= 0) {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 200;
    }

    public final boolean d() {
        return ((Boolean) this.a.m("ccr_live_streaming").getValue()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.a.m("mobile_ccr_per_message_attestation").getValue()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) this.a.m("ccr_v2_session_api").getValue()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) this.a.m("mobile_ccr_v2_session_events").getValue()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) this.a.m("ccr_v2_session_stream").getValue()).booleanValue();
    }
}
