package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class ro9 extends f {
    private static final ro9 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile vtc PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private k22 value_ = k22.F;

    static {
        ro9 ro9Var = new ro9();
        DEFAULT_INSTANCE = ro9Var;
        f.t(ro9.class, ro9Var);
    }

    public static po9 D() {
        return (po9) DEFAULT_INSTANCE.h();
    }

    public static void w(ro9 ro9Var, String str) {
        ro9Var.getClass();
        str.getClass();
        ro9Var.typeUrl_ = str;
    }

    public static void x(ro9 ro9Var, g22 g22Var) {
        ro9Var.getClass();
        ro9Var.value_ = g22Var;
    }

    public static void y(ro9 ro9Var, qo9 qo9Var) {
        ro9Var.getClass();
        if (qo9Var != qo9.UNRECOGNIZED) {
            ro9Var.keyMaterialType_ = qo9Var.E;
        } else {
            qo9Var.getClass();
            sz6.p("Can't get the number of an unknown enum value.");
        }
    }

    public static ro9 z() {
        return DEFAULT_INSTANCE;
    }

    public final qo9 A() {
        int i = this.keyMaterialType_;
        qo9 qo9Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : qo9.REMOTE : qo9.ASYMMETRIC_PUBLIC : qo9.ASYMMETRIC_PRIVATE : qo9.SYMMETRIC : qo9.UNKNOWN_KEYMATERIAL;
        return qo9Var == null ? qo9.UNRECOGNIZED : qo9Var;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new ro9();
            case 4:
                return new po9(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (ro9.class) {
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
