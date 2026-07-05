package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class fg extends f {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final fg DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile vtc PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private lg aesCtrKey_;
    private fn8 hmacKey_;
    private int version_;

    static {
        fg fgVar = new fg();
        DEFAULT_INSTANCE = fgVar;
        f.t(fg.class, fgVar);
    }

    public static eg C() {
        return (eg) DEFAULT_INSTANCE.h();
    }

    public static fg D(k22 k22Var, mc7 mc7Var) {
        return (fg) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static void w(fg fgVar) {
        fgVar.version_ = 0;
    }

    public static void x(fg fgVar, lg lgVar) {
        fgVar.getClass();
        lgVar.getClass();
        fgVar.aesCtrKey_ = lgVar;
    }

    public static void y(fg fgVar, fn8 fn8Var) {
        fgVar.getClass();
        fn8Var.getClass();
        fgVar.hmacKey_ = fn8Var;
    }

    public final fn8 A() {
        fn8 fn8Var = this.hmacKey_;
        return fn8Var == null ? fn8.z() : fn8Var;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new fg();
            case 4:
                return new eg(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (fg.class) {
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

    public final lg z() {
        lg lgVar = this.aesCtrKey_;
        return lgVar == null ? lg.z() : lgVar;
    }
}
