package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g4l {
    public static final iqk a;

    static {
        bm7 bm7Var = new bm7(rpk.a("com.google.android.gms.measurement"), "", "", true, true);
        bm7Var.g("measurement.collection.enable_session_stitching_token.client.dev", true);
        bm7Var.g("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        a = bm7Var.g("measurement.session_stitching_token_enabled", false);
        bm7Var.g("measurement.link_sst_to_sid", true);
    }
}
