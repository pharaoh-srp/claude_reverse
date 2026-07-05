package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k4l {
    public static final iqk a;
    public static final iqk b;
    public static final iqk c;
    public static final iqk d;

    static {
        bm7 bm7Var = new bm7(rpk.a("com.google.android.gms.measurement"), "", "", true, true);
        a = bm7Var.g("measurement.sgtm.google_signal.enable", false);
        b = bm7Var.g("measurement.sgtm.preview_mode_enabled", true);
        c = bm7Var.g("measurement.sgtm.service", true);
        d = bm7Var.g("measurement.sgtm.upload_queue", false);
        bm7Var.e(0L, "measurement.id.sgtm");
    }
}
