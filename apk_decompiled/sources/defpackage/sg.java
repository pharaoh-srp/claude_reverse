package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class sg extends f {
    private static final sg DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile vtc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private k22 keyValue_ = k22.F;
    private zg params_;
    private int version_;

    static {
        sg sgVar = new sg();
        DEFAULT_INSTANCE = sgVar;
        f.t(sg.class, sgVar);
    }

    public static rg C() {
        return (rg) DEFAULT_INSTANCE.h();
    }

    public static sg D(k22 k22Var, mc7 mc7Var) {
        return (sg) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static void w(sg sgVar) {
        sgVar.version_ = 0;
    }

    public static void x(sg sgVar, zg zgVar) {
        sgVar.getClass();
        zgVar.getClass();
        sgVar.params_ = zgVar;
    }

    public static void y(sg sgVar, g22 g22Var) {
        sgVar.getClass();
        sgVar.keyValue_ = g22Var;
    }

    public final zg A() {
        zg zgVar = this.params_;
        return zgVar == null ? zg.x() : zgVar;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new sg();
            case 4:
                return new rg(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (sg.class) {
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
