package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.eg5;
import defpackage.esa;
import defpackage.hg5;
import defpackage.l28;
import defpackage.mr9;
import defpackage.sq6;
import defpackage.utc;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends n {
    private static final d DEFAULT_INSTANCE;
    private static volatile utc PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private esa values_ = esa.F;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        n.n(d.class, dVar);
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"values_", hg5.a});
            case 3:
                return new d();
            case 4:
                return new eg5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (d.class) {
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
}
