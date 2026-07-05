package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class fp9 extends f {
    private static final fp9 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile vtc PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private k22 value_ = k22.F;

    static {
        fp9 fp9Var = new fp9();
        DEFAULT_INSTANCE = fp9Var;
        f.t(fp9.class, fp9Var);
    }

    public static ep9 D() {
        return (ep9) DEFAULT_INSTANCE.h();
    }

    public static void w(fp9 fp9Var, String str) {
        fp9Var.getClass();
        str.getClass();
        fp9Var.typeUrl_ = str;
    }

    public static void x(fp9 fp9Var, g22 g22Var) {
        fp9Var.getClass();
        fp9Var.value_ = g22Var;
    }

    public static void y(fp9 fp9Var, bmc bmcVar) {
        fp9Var.getClass();
        fp9Var.outputPrefixType_ = bmcVar.b();
    }

    public static fp9 z() {
        return DEFAULT_INSTANCE;
    }

    public final bmc A() {
        bmc bmcVarA = bmc.a(this.outputPrefixType_);
        return bmcVarA == null ? bmc.UNRECOGNIZED : bmcVarA;
    }

    public final String B() {
        return this.typeUrl_;
    }

    public final k22 C() {
        return this.value_;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new fp9();
            case 4:
                return new ep9(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (fp9.class) {
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
