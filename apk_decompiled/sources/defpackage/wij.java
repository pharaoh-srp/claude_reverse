package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class wij extends f {
    private static final wij DEFAULT_INSTANCE;
    private static volatile vtc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        wij wijVar = new wij();
        DEFAULT_INSTANCE = wijVar;
        f.t(wij.class, wijVar);
    }

    public static wij w() {
        return DEFAULT_INSTANCE;
    }

    public static wij x(k22 k22Var, mc7 mc7Var) {
        return (wij) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 3:
                return new wij();
            case 4:
                return new pg2(DEFAULT_INSTANCE, 5);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (wij.class) {
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
