package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum nfa implements gud {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);

    public final int E;

    nfa(int i) {
        this.E = i;
    }

    @Override // defpackage.gud
    public final int a() {
        return this.E;
    }
}
