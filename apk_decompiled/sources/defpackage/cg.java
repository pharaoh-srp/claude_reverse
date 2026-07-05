package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class cg extends f {
    private static final cg DEFAULT_INSTANCE;
    private static volatile vtc PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        cg cgVar = new cg();
        DEFAULT_INSTANCE = cgVar;
        f.t(cg.class, cgVar);
    }

    public static void w(cg cgVar) {
        cgVar.tagSize_ = 16;
    }

    public static cg x() {
        return DEFAULT_INSTANCE;
    }

    public static bg z() {
        return (bg) DEFAULT_INSTANCE.h();
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new cg();
            case 4:
                return new bg(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (cg.class) {
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
        return this.tagSize_;
    }
}
