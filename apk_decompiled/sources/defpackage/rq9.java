package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class rq9 extends f {
    private static final rq9 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile vtc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private sq9 params_;
    private int version_;

    static {
        rq9 rq9Var = new rq9();
        DEFAULT_INSTANCE = rq9Var;
        f.t(rq9.class, rq9Var);
    }

    public static qq9 A() {
        return (qq9) DEFAULT_INSTANCE.h();
    }

    public static rq9 B(k22 k22Var, mc7 mc7Var) {
        return (rq9) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static void w(rq9 rq9Var) {
        rq9Var.version_ = 0;
    }

    public static void x(rq9 rq9Var, sq9 sq9Var) {
        rq9Var.getClass();
        sq9Var.getClass();
        rq9Var.params_ = sq9Var;
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
                return new rq9();
            case 4:
                return new qq9(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (rq9.class) {
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

    public final sq9 y() {
        sq9 sq9Var = this.params_;
        return sq9Var == null ? sq9.w() : sq9Var;
    }

    public final int z() {
        return this.version_;
    }
}
