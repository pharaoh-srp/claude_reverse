package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.eg5;
import defpackage.esa;
import defpackage.l28;
import defpackage.mg5;
import defpackage.mr9;
import defpackage.sq6;
import defpackage.utc;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends n {
    private static final j DEFAULT_INSTANCE;
    public static final int INSTANT_TIME_MILLIS_FIELD_NUMBER = 2;
    private static volatile utc PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private int bitField0_;
    private long instantTimeMillis_;
    private esa values_ = esa.F;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        n.n(j.class, jVar);
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဂ\u0000", new Object[]{"bitField0_", "values_", mg5.a, "instantTimeMillis_"});
            case 3:
                return new j();
            case 4:
                return new eg5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (j.class) {
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

    public final long p() {
        return this.instantTimeMillis_;
    }

    public final Map q() {
        return Collections.unmodifiableMap(this.values_);
    }
}
