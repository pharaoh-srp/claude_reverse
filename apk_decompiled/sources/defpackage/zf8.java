package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum zf8 implements k89 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public final int E;

    zf8(int i) {
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
