package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class ng2 extends f {
    private static final ng2 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile vtc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private k22 keyValue_ = k22.F;
    private int version_;

    static {
        ng2 ng2Var = new ng2();
        DEFAULT_INSTANCE = ng2Var;
        f.t(ng2.class, ng2Var);
    }

    public static mg2 A() {
        return (mg2) DEFAULT_INSTANCE.h();
    }

    public static ng2 B(k22 k22Var, mc7 mc7Var) {
        return (ng2) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static void w(ng2 ng2Var) {
        ng2Var.version_ = 0;
    }

    public static void x(ng2 ng2Var, g22 g22Var) {
        ng2Var.getClass();
        ng2Var.keyValue_ = g22Var;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new ng2();
            case 4:
                return new mg2(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (ng2.class) {
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

    public final k22 y() {
        return this.keyValue_;
    }

    public final int z() {
        return this.version_;
    }
}
