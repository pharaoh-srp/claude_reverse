package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum isk {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);

    public final int E;

    isk(int i) {
        this.E = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.E);
    }
}
