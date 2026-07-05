package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class fn8 extends f {
    private static final fn8 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile vtc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private k22 keyValue_ = k22.F;
    private ln8 params_;
    private int version_;

    static {
        fn8 fn8Var = new fn8();
        DEFAULT_INSTANCE = fn8Var;
        f.t(fn8.class, fn8Var);
    }

    public static en8 D() {
        return (en8) DEFAULT_INSTANCE.h();
    }

    public static fn8 E(k22 k22Var, mc7 mc7Var) {
        return (fn8) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static void w(fn8 fn8Var) {
        fn8Var.version_ = 0;
    }

    public static void x(fn8 fn8Var, ln8 ln8Var) {
        fn8Var.getClass();
        ln8Var.getClass();
        fn8Var.params_ = ln8Var;
    }

    public static void y(fn8 fn8Var, g22 g22Var) {
        fn8Var.getClass();
        fn8Var.keyValue_ = g22Var;
    }

    public static fn8 z() {
        return DEFAULT_INSTANCE;
    }

    public final k22 A() {
        return this.keyValue_;
    }

    public final ln8 B() {
        ln8 ln8Var = this.params_;
        return ln8Var == null ? ln8.y() : ln8Var;
    }

    public final int C() {
        return this.version_;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new fn8();
            case 4:
                return new en8(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (fn8.class) {
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
}
