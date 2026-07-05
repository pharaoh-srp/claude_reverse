package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum sfa {
    VERBOSE(2),
    DEBUG(3),
    INFO(4),
    WARN(5),
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ASSERT(7);

    public final int E;

    sfa(int i) {
        this.E = i;
    }
}
