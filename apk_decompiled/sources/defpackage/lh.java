package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class lh extends f {
    private static final lh DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile vtc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private k22 keyValue_ = k22.F;
    private int version_;

    static {
        lh lhVar = new lh();
        DEFAULT_INSTANCE = lhVar;
        f.t(lh.class, lhVar);
    }

    public static kh A() {
        return (kh) DEFAULT_INSTANCE.h();
    }

    public static lh B(k22 k22Var, mc7 mc7Var) {
        return (lh) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static void w(lh lhVar) {
        lhVar.version_ = 0;
    }

    public static void x(lh lhVar, g22 g22Var) {
        lhVar.getClass();
        lhVar.keyValue_ = g22Var;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new lh();
            case 4:
                return new kh(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (lh.class) {
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
