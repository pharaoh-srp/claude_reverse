package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l2l {
    public static final iqk a;
    public static final iqk b;

    static {
        bm7 bm7Var = new bm7(rpk.a("com.google.android.gms.measurement"), "", "", true, true);
        bm7Var.g("measurement.collection.event_safelist", true);
        a = bm7Var.g("measurement.service.store_null_safelist", true);
        b = bm7Var.g("measurement.service.store_safelist", true);
    }
}
