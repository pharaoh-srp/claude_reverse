package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d4l {
    public static final iqk a;
    public static final iqk b;
    public static final iqk c;
    public static final iqk d;
    public static final iqk e;
    public static final iqk f;
    public static final iqk g;
    public static final iqk h;
    public static final iqk i;
    public static final iqk j;

    static {
        bm7 bm7Var = new bm7(rpk.a("com.google.android.gms.measurement"), "", "", true, true);
        bm7Var.e(0L, "measurement.id.rb.attribution.bundle_on_backgrounded");
        a = bm7Var.g("measurement.rb.attribution.ad_campaign_info", false);
        b = bm7Var.g("measurement.rb.attribution.client.bundle_on_backgrounded", false);
        c = bm7Var.g("measurement.rb.attribution.service.bundle_on_backgrounded", false);
        d = bm7Var.g("measurement.rb.attribution.client2", true);
        bm7Var.g("measurement.rb.attribution.dma_fix", true);
        e = bm7Var.g("measurement.rb.attribution.followup1.service", false);
        bm7Var.g("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f = bm7Var.g("measurement.rb.attribution.retry_disposition", false);
        g = bm7Var.g("measurement.rb.attribution.service", true);
        h = bm7Var.g("measurement.rb.attribution.enable_trigger_redaction", true);
        i = bm7Var.g("measurement.rb.attribution.uuid_generation", true);
        bm7Var.e(0L, "measurement.id.rb.attribution.retry_disposition");
        j = bm7Var.g("measurement.rb.attribution.improved_retry", true);
    }
}
