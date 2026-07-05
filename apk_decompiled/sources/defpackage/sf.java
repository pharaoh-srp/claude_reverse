package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class sf extends f {
    private static final sf DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile vtc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private k22 keyValue_ = k22.F;
    private cg params_;
    private int version_;

    static {
        sf sfVar = new sf();
        DEFAULT_INSTANCE = sfVar;
        f.t(sf.class, sfVar);
    }

    public static rf C() {
        return (rf) DEFAULT_INSTANCE.h();
    }

    public static sf D(k22 k22Var, mc7 mc7Var) {
        return (sf) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static void w(sf sfVar) {
        sfVar.version_ = 0;
    }

    public static void x(sf sfVar, g22 g22Var) {
        sfVar.getClass();
        sfVar.keyValue_ = g22Var;
    }

    public static void y(sf sfVar, cg cgVar) {
        sfVar.getClass();
        cgVar.getClass();
        sfVar.params_ = cgVar;
    }

    public final cg A() {
        cg cgVar = this.params_;
        return cgVar == null ? cg.x() : cgVar;
    }

    public final int B() {
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new sf();
            case 4:
                return new rf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (sf.class) {
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

    public final k22 z() {
        return this.keyValue_;
    }
}
