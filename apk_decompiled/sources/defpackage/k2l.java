package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k2l {
    public static final iqk a;
    public static final iqk b;

    static {
        bm7 bm7Var = new bm7(rpk.a("com.google.android.gms.measurement"), "", "", true, true);
        bm7Var.g("measurement.dma_consent.client", true);
        bm7Var.g("measurement.dma_consent.client_bow_check2", true);
        bm7Var.g("measurement.dma_consent.separate_service_calls_fix", true);
        bm7Var.g("measurement.dma_consent.service", true);
        a = bm7Var.g("measurement.dma_consent.service_database_update_fix", true);
        bm7Var.g("measurement.dma_consent.service_dcu_event", true);
        b = bm7Var.g("measurement.dma_consent.service_dcu_event2", true);
        bm7Var.g("measurement.dma_consent.service_npa_remote_default", true);
        bm7Var.g("measurement.dma_consent.service_split_batch_on_consent", true);
        bm7Var.g("measurement.dma_consent.set_consent_inline_on_worker", true);
    }
}
