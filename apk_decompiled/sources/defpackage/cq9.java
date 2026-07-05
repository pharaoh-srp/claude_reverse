package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class cq9 extends f {
    private static final cq9 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile vtc PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private ro9 keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        cq9 cq9Var = new cq9();
        DEFAULT_INSTANCE = cq9Var;
        f.t(cq9.class, cq9Var);
    }

    public static bq9 F() {
        return (bq9) DEFAULT_INSTANCE.h();
    }

    public static void w(cq9 cq9Var, ro9 ro9Var) {
        cq9Var.getClass();
        cq9Var.keyData_ = ro9Var;
    }

    public static void x(cq9 cq9Var, bmc bmcVar) {
        cq9Var.getClass();
        cq9Var.outputPrefixType_ = bmcVar.b();
    }

    public static void y(cq9 cq9Var) {
        cq9Var.getClass();
        cq9Var.status_ = dp9.ENABLED.a();
    }

    public static void z(cq9 cq9Var, int i) {
        cq9Var.keyId_ = i;
    }

    public final ro9 A() {
        ro9 ro9Var = this.keyData_;
        return ro9Var == null ? ro9.z() : ro9Var;
    }

    public final int B() {
        return this.keyId_;
    }

    public final bmc C() {
        bmc bmcVarA = bmc.a(this.outputPrefixType_);
        return bmcVarA == null ? bmc.UNRECOGNIZED : bmcVarA;
    }

    public final dp9 D() {
        int i = this.status_;
        dp9 dp9Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : dp9.DESTROYED : dp9.DISABLED : dp9.ENABLED : dp9.UNKNOWN_STATUS;
        return dp9Var == null ? dp9.UNRECOGNIZED : dp9Var;
    }

    public final boolean E() {
        return this.keyData_ != null;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new cq9();
            case 4:
                return new bq9(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (cq9.class) {
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
