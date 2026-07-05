package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.eg5;
import defpackage.l28;
import defpackage.mr9;
import defpackage.sq6;
import defpackage.utc;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends n {
    public static final int BOOLEAN_VAL_FIELD_NUMBER = 5;
    private static final l DEFAULT_INSTANCE;
    public static final int DOUBLE_VAL_FIELD_NUMBER = 2;
    public static final int ENUM_VAL_FIELD_NUMBER = 4;
    public static final int LONG_VAL_FIELD_NUMBER = 1;
    private static volatile utc PARSER = null;
    public static final int STRING_VAL_FIELD_NUMBER = 3;
    private int valueCase_ = 0;
    private Object value_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        n.n(l.class, lVar);
    }

    public static l q() {
        return DEFAULT_INSTANCE;
    }

    @Override // androidx.health.platform.client.proto.n
    public final Object e(int i) {
        utc l28Var;
        switch (sq6.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u00015\u0000\u00023\u0000\u0003;\u0000\u0004;\u0000\u0005:\u0000", new Object[]{"value_", "valueCase_"});
            case 3:
                return new l();
            case 4:
                return new eg5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (l.class) {
                    try {
                        l28Var = PARSER;
                        if (l28Var == null) {
                            l28Var = new l28();
                            PARSER = l28Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return l28Var;
            default:
                mr9.x();
                return null;
        }
    }

    public final boolean p() {
        if (this.valueCase_ == 5) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final double r() {
        if (this.valueCase_ == 2) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final String s() {
        return this.valueCase_ == 4 ? (String) this.value_ : "";
    }

    public final long t() {
        if (this.valueCase_ == 1) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String u() {
        return this.valueCase_ == 3 ? (String) this.value_ : "";
    }
}
