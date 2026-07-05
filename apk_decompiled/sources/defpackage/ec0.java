package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum ec0 {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    ALWAYS_PARENTHESIZED(true, true);

    public final boolean E;
    public final boolean F;

    /* synthetic */ ec0(int i) {
        this((i & 1) == 0, false);
    }

    ec0(boolean z, boolean z2) {
        this.E = z;
        this.F = z2;
    }
}
