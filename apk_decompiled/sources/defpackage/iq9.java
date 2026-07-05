package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class iq9 extends f {
    private static final iq9 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile vtc PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private p89 keyInfo_ = vud.H;
    private int primaryKeyId_;

    static {
        iq9 iq9Var = new iq9();
        DEFAULT_INSTANCE = iq9Var;
        f.t(iq9.class, iq9Var);
    }

    public static void w(iq9 iq9Var, int i) {
        iq9Var.primaryKeyId_ = i;
    }

    public static void x(iq9 iq9Var, hq9 hq9Var) {
        iq9Var.getClass();
        p89 p89Var = iq9Var.keyInfo_;
        if (!((q3) p89Var).E) {
            int size = p89Var.size();
            iq9Var.keyInfo_ = p89Var.j(size == 0 ? 10 : size * 2);
        }
        iq9Var.keyInfo_.add(hq9Var);
    }

    public static fq9 z() {
        return (fq9) DEFAULT_INSTANCE.h();
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", hq9.class});
            case 3:
                return new iq9();
            case 4:
                return new fq9(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (iq9.class) {
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

    public final hq9 y() {
        return (hq9) this.keyInfo_.get(0);
    }
}
