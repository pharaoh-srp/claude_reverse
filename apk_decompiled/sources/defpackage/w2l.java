package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w2l {
    public static final iqk a;
    public static final iqk b;
    public static final iqk c;

    static {
        bm7 bm7Var = new bm7(rpk.a("com.google.android.gms.measurement"), "", "", true, true);
        bm7Var.g("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        a = bm7Var.g("measurement.audience.refresh_event_count_filters_timestamp", false);
        b = bm7Var.g("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = bm7Var.g("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
