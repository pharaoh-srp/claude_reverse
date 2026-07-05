package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class ln8 extends f {
    private static final ln8 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile vtc PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        ln8 ln8Var = new ln8();
        DEFAULT_INSTANCE = ln8Var;
        f.t(ln8.class, ln8Var);
    }

    public static kn8 B() {
        return (kn8) DEFAULT_INSTANCE.h();
    }

    public static void w(ln8 ln8Var, zf8 zf8Var) {
        ln8Var.getClass();
        ln8Var.hash_ = zf8Var.a();
    }

    public static void x(ln8 ln8Var, int i) {
        ln8Var.tagSize_ = i;
    }

    public static ln8 y() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        return this.tagSize_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f
    public final Object i(int i) {
        vtc m28Var;
        switch (sq6.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new ln8();
            case 4:
                return new kn8(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (ln8.class) {
                    try {
                        m28Var = PARSER;
                        if (m28Var == null) {
                            m28Var = new m28();
                            PARSER = m28Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return m28Var;
            default:
                mr9.x();
                return null;
        }
    }

    public final zf8 z() {
        int i = this.hash_;
        zf8 zf8Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : zf8.SHA224 : zf8.SHA512 : zf8.SHA256 : zf8.SHA384 : zf8.SHA1 : zf8.UNKNOWN_HASH;
        return zf8Var == null ? zf8.UNRECOGNIZED : zf8Var;
    }
}
