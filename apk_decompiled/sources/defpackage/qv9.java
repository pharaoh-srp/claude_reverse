package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum qv9 implements m89 {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);

    public final int E;

    qv9(int i) {
        this.E = i;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.E;
        }
        sz6.p("Can't get the number of an unknown enum value.");
        return 0;
    }
}
