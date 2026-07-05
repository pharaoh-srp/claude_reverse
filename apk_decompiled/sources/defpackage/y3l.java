package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y3l {
    public static final iqk a;

    static {
        bm7 bm7Var = new bm7(rpk.a("com.google.android.gms.measurement"), "", "", true, true);
        bm7Var.g("measurement.sdk.collection.enable_extend_user_property_size", true);
        bm7Var.g("measurement.sdk.collection.last_deep_link_referrer2", true);
        a = bm7Var.g("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        bm7Var.e(0L, "measurement.id.sdk.collection.last_deep_link_referrer2");
    }
}
