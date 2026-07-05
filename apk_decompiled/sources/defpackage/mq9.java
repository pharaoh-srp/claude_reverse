package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class mq9 extends f {
    private static final mq9 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile vtc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private nq9 params_;
    private int version_;

    static {
        mq9 mq9Var = new mq9();
        DEFAULT_INSTANCE = mq9Var;
        f.t(mq9.class, mq9Var);
    }

    public static lq9 A() {
        return (lq9) DEFAULT_INSTANCE.h();
    }

    public static mq9 B(k22 k22Var, mc7 mc7Var) {
        return (mq9) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static void w(mq9 mq9Var) {
        mq9Var.version_ = 0;
    }

    public static void x(mq9 mq9Var, nq9 nq9Var) {
        mq9Var.getClass();
        nq9Var.getClass();
        mq9Var.params_ = nq9Var;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new mq9();
            case 4:
                return new lq9(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (mq9.class) {
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

    public final nq9 y() {
        nq9 nq9Var = this.params_;
        return nq9Var == null ? nq9.w() : nq9Var;
    }

    public final int z() {
        return this.version_;
    }
}
