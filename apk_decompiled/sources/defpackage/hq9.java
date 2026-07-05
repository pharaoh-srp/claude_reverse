package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class hq9 extends f {
    private static final hq9 DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile vtc PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        hq9 hq9Var = new hq9();
        DEFAULT_INSTANCE = hq9Var;
        f.t(hq9.class, hq9Var);
    }

    public static gq9 B() {
        return (gq9) DEFAULT_INSTANCE.h();
    }

    public static void w(hq9 hq9Var, String str) {
        hq9Var.getClass();
        str.getClass();
        hq9Var.typeUrl_ = str;
    }

    public static void x(hq9 hq9Var, bmc bmcVar) {
        hq9Var.getClass();
        hq9Var.outputPrefixType_ = bmcVar.b();
    }

    public static void y(hq9 hq9Var, dp9 dp9Var) {
        hq9Var.getClass();
        hq9Var.status_ = dp9Var.a();
    }

    public static void z(hq9 hq9Var, int i) {
        hq9Var.keyId_ = i;
    }

    public final int A() {
        return this.keyId_;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new hq9();
            case 4:
                return new gq9(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (hq9.class) {
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
}
