package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class nq9 extends f {
    private static final nq9 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile vtc PARSER;
    private String keyUri_ = "";

    static {
        nq9 nq9Var = new nq9();
        DEFAULT_INSTANCE = nq9Var;
        f.t(nq9.class, nq9Var);
    }

    public static nq9 w() {
        return DEFAULT_INSTANCE;
    }

    public static nq9 y(k22 k22Var, mc7 mc7Var) {
        return (nq9) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new nq9();
            case 4:
                return new pg2(DEFAULT_INSTANCE, 2);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (nq9.class) {
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

    public final String x() {
        return this.keyUri_;
    }
}
