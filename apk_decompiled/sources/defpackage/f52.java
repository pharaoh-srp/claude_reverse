package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public enum f52 {
    ENABLED(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    READ_ONLY(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_ONLY(false, true),
    DISABLED(false, false);

    public final boolean E;
    public final boolean F;

    f52(boolean z, boolean z2) {
        this.E = z;
        this.F = z2;
    }
}
