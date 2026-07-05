package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z1l {
    public static final iqk a;
    public static final iqk b;
    public static final iqk c;
    public static final iqk d;

    static {
        bm7 bm7Var = new bm7(rpk.a("com.google.android.gms.measurement"), "", "", true, true);
        a = bm7Var.g("measurement.consent.stop_reset_on_storage_denied.client", true);
        b = bm7Var.g("measurement.consent.stop_reset_on_storage_denied.service", true);
        c = bm7Var.g("measurement.consent.scrub_audience_data_analytics_consent", true);
        d = bm7Var.g("measurement.consent.fix_first_open_count_from_snapshot", true);
    }
}
