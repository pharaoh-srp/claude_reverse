package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class vg extends f {
    private static final vg DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile vtc PARSER;
    private int keySize_;
    private zg params_;

    static {
        vg vgVar = new vg();
        DEFAULT_INSTANCE = vgVar;
        f.t(vg.class, vgVar);
    }

    public static ug A() {
        return (ug) DEFAULT_INSTANCE.h();
    }

    public static vg B(k22 k22Var, mc7 mc7Var) {
        return (vg) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static void w(vg vgVar, zg zgVar) {
        vgVar.getClass();
        vgVar.params_ = zgVar;
    }

    public static void x(vg vgVar, int i) {
        vgVar.keySize_ = i;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new vg();
            case 4:
                return new ug(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (vg.class) {
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

    public final zg z() {
        zg zgVar = this.params_;
        return zgVar == null ? zg.x() : zgVar;
    }
}
