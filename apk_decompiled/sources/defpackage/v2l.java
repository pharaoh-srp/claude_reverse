package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v2l {
    public static final iqk a;
    public static final iqk b;
    public static final iqk c;

    static {
        bm7 bm7Var = new bm7(rpk.a("com.google.android.gms.measurement"), "", "", true, true);
        bm7Var.g("measurement.client.ad_id_consent_fix", true);
        bm7Var.g("measurement.service.consent.aiid_reset_fix", false);
        bm7Var.g("measurement.service.consent.aiid_reset_fix2", true);
        a = bm7Var.g("measurement.service.consent.app_start_fix", true);
        b = bm7Var.g("measurement.service.consent.params_on_fx", true);
        c = bm7Var.g("measurement.service.consent.pfo_on_fx", true);
    }
}
