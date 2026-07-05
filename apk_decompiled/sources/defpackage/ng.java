package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;

/* JADX INFO: loaded from: classes3.dex */
public final class ng extends f {
    private static final ng DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile vtc PARSER;
    private int keySize_;
    private pg params_;

    static {
        ng ngVar = new ng();
        DEFAULT_INSTANCE = ngVar;
        f.t(ng.class, ngVar);
    }

    public static mg B() {
        return (mg) DEFAULT_INSTANCE.h();
    }

    public static void w(ng ngVar, pg pgVar) {
        ngVar.getClass();
        ngVar.params_ = pgVar;
    }

    public static void x(ng ngVar, int i) {
        ngVar.keySize_ = i;
    }

    public static ng y() {
        return DEFAULT_INSTANCE;
    }

    public final pg A() {
        pg pgVar = this.params_;
        return pgVar == null ? pg.x() : pgVar;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new ng();
            case 4:
                return new mg(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (ng.class) {
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

    public final int z() {
        return this.keySize_;
    }
}
