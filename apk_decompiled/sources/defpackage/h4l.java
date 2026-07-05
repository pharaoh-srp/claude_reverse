package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h4l {
    public static final iqk a;
    public static final iqk b;

    static {
        bm7 bm7Var = new bm7(rpk.a("com.google.android.gms.measurement"), "", "", true, true);
        bm7Var.g("measurement.client.sessions.background_sessions_enabled", true);
        a = bm7Var.g("measurement.client.sessions.enable_fix_background_engagement", false);
        bm7Var.g("measurement.client.sessions.immediate_start_enabled_foreground", true);
        b = bm7Var.g("measurement.client.sessions.enable_pause_engagement_in_background", true);
        bm7Var.g("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        bm7Var.g("measurement.client.sessions.session_id_enabled", true);
        bm7Var.e(0L, "measurement.id.client.sessions.enable_fix_background_engagement");
    }
}
