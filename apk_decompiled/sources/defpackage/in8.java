package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class in8 extends f {
    private static final in8 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile vtc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private ln8 params_;
    private int version_;

    static {
        in8 in8Var = new in8();
        DEFAULT_INSTANCE = in8Var;
        f.t(in8.class, in8Var);
    }

    public static hn8 B() {
        return (hn8) DEFAULT_INSTANCE.h();
    }

    public static in8 C(k22 k22Var, mc7 mc7Var) {
        return (in8) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static void w(in8 in8Var, ln8 ln8Var) {
        in8Var.getClass();
        in8Var.params_ = ln8Var;
    }

    public static void x(in8 in8Var, int i) {
        in8Var.keySize_ = i;
    }

    public static in8 y() {
        return DEFAULT_INSTANCE;
    }

    public final ln8 A() {
        ln8 ln8Var = this.params_;
        return ln8Var == null ? ln8.y() : ln8Var;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new in8();
            case 4:
                return new hn8(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (in8.class) {
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

    public final int z() {
        return this.keySize_;
    }
}
