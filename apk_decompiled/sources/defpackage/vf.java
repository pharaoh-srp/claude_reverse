package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class vf extends f {
    private static final vf DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile vtc PARSER;
    private int keySize_;
    private cg params_;

    static {
        vf vfVar = new vf();
        DEFAULT_INSTANCE = vfVar;
        f.t(vf.class, vfVar);
    }

    public static uf A() {
        return (uf) DEFAULT_INSTANCE.h();
    }

    public static vf B(k22 k22Var, mc7 mc7Var) {
        return (vf) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static void w(vf vfVar) {
        vfVar.keySize_ = 32;
    }

    public static void x(vf vfVar, cg cgVar) {
        vfVar.getClass();
        vfVar.params_ = cgVar;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new vf();
            case 4:
                return new uf(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (vf.class) {
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

    public final int y() {
        return this.keySize_;
    }

    public final cg z() {
        cg cgVar = this.params_;
        return cgVar == null ? cg.x() : cgVar;
    }
}
