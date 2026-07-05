package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class sq9 extends f {
    private static final sq9 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile vtc PARSER;
    private fp9 dekTemplate_;
    private String kekUri_ = "";

    static {
        sq9 sq9Var = new sq9();
        DEFAULT_INSTANCE = sq9Var;
        f.t(sq9.class, sq9Var);
    }

    public static sq9 A(k22 k22Var, mc7 mc7Var) {
        return (sq9) f.r(DEFAULT_INSTANCE, k22Var, mc7Var);
    }

    public static sq9 w() {
        return DEFAULT_INSTANCE;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new sq9();
            case 4:
                return new pg2(DEFAULT_INSTANCE, 3);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (sq9.class) {
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

    public final fp9 x() {
        fp9 fp9Var = this.dekTemplate_;
        return fp9Var == null ? fp9.z() : fp9Var;
    }

    public final String y() {
        return this.kekUri_;
    }

    public final boolean z() {
        return this.dekTemplate_ != null;
    }
}
