package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.eg5;
import defpackage.esa;
import defpackage.l28;
import defpackage.mr9;
import defpackage.ng5;
import defpackage.sq6;
import defpackage.utc;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends n {
    private static final k DEFAULT_INSTANCE;
    public static final int END_TIME_MILLIS_FIELD_NUMBER = 3;
    private static volatile utc PARSER = null;
    public static final int START_TIME_MILLIS_FIELD_NUMBER = 2;
    public static final int VALUES_FIELD_NUMBER = 1;
    private int bitField0_;
    private long endTimeMillis_;
    private long startTimeMillis_;
    private esa values_ = esa.F;

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        n.n(k.class, kVar);
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002ဂ\u0000\u0003ဂ\u0001", new Object[]{"bitField0_", "values_", ng5.a, "startTimeMillis_", "endTimeMillis_"});
            case 3:
                return new k();
            case 4:
                return new eg5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (k.class) {
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
        return this.endTimeMillis_;
    }

    public final long q() {
        return this.startTimeMillis_;
    }

    public final Map r() {
        return Collections.unmodifiableMap(this.values_);
    }
}
