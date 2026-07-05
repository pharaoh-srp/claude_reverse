package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class lg extends f {
    private static final lg DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile vtc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private k22 keyValue_ = k22.F;
    private pg params_;
    private int version_;

    static {
        lg lgVar = new lg();
        DEFAULT_INSTANCE = lgVar;
        f.t(lg.class, lgVar);
    }

    public static kg D() {
        return (kg) DEFAULT_INSTANCE.h();
    }

    public static void w(lg lgVar) {
        lgVar.version_ = 0;
    }

    public static void x(lg lgVar, pg pgVar) {
        lgVar.getClass();
        pgVar.getClass();
        lgVar.params_ = pgVar;
    }

    public static void y(lg lgVar, g22 g22Var) {
        lgVar.getClass();
        lgVar.keyValue_ = g22Var;
    }

    public static lg z() {
        return DEFAULT_INSTANCE;
    }

    public final k22 A() {
        return this.keyValue_;
    }

    public final pg B() {
        pg pgVar = this.params_;
        return pgVar == null ? pg.x() : pgVar;
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
                return new lg();
            case 4:
                return new kg(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (lg.class) {
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
