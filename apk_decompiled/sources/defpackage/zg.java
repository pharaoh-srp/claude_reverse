package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class zg extends f {
    private static final zg DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile vtc PARSER;
    private int ivSize_;

    static {
        zg zgVar = new zg();
        DEFAULT_INSTANCE = zgVar;
        f.t(zg.class, zgVar);
    }

    public static void w(zg zgVar) {
        zgVar.ivSize_ = 16;
    }

    public static zg x() {
        return DEFAULT_INSTANCE;
    }

    public static yg z() {
        return (yg) DEFAULT_INSTANCE.h();
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new zg();
            case 4:
                return new yg(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (zg.class) {
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
        return this.ivSize_;
    }
}
