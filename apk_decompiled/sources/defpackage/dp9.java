package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum dp9 implements k89 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public final int E;

    dp9(int i) {
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
