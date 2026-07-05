package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum bmc implements k89 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public final int E;

    bmc(int i) {
        this.E = i;
    }

    public static bmc a(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int b() {
        if (this != UNRECOGNIZED) {
            return this.E;
        }
        sz6.p("Can't get the number of an unknown enum value.");
        return 0;
    }
}
