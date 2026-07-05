package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class hg extends f {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final hg DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile vtc PARSER;
    private ng aesCtrKeyFormat_;
    private in8 hmacKeyFormat_;

    static {
        hg hgVar = new hg();
        DEFAULT_INSTANCE = hgVar;
        f.t(hg.class, hgVar);
    }

    public static gg A() {
        return (gg) DEFAULT_INSTANCE.h();
    }

    public static hg B(k22 k22Var, mc7 mc7Var) {
        return (hg) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static void w(hg hgVar, ng ngVar) {
        hgVar.getClass();
        hgVar.aesCtrKeyFormat_ = ngVar;
    }

    public static void x(hg hgVar, in8 in8Var) {
        hgVar.getClass();
        hgVar.hmacKeyFormat_ = in8Var;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new hg();
            case 4:
                return new gg(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (hg.class) {
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

    public final ng y() {
        ng ngVar = this.aesCtrKeyFormat_;
        return ngVar == null ? ng.y() : ngVar;
    }

    public final in8 z() {
        in8 in8Var = this.hmacKeyFormat_;
        return in8Var == null ? in8.y() : in8Var;
    }
}
