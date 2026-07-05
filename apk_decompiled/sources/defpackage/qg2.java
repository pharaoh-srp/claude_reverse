package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class qg2 extends f {
    private static final qg2 DEFAULT_INSTANCE;
    private static volatile vtc PARSER;

    static {
        qg2 qg2Var = new qg2();
        DEFAULT_INSTANCE = qg2Var;
        f.t(qg2.class, qg2Var);
    }

    public static qg2 w() {
        return DEFAULT_INSTANCE;
    }

    public static qg2 x(k22 k22Var, mc7 mc7Var) {
        return (qg2) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new qg2();
            case 4:
                return new pg2(DEFAULT_INSTANCE, 0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (qg2.class) {
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
