package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.l28;
import defpackage.mr9;
import defpackage.sq6;
import defpackage.utc;
import defpackage.zph;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends n {
    private static final z DEFAULT_INSTANCE;
    public static final int END_LOCAL_DATE_TIME_FIELD_NUMBER = 4;
    public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
    private static volatile utc PARSER = null;
    public static final int START_LOCAL_DATE_TIME_FIELD_NUMBER = 3;
    public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long endTimeEpochMs_;
    private long startTimeEpochMs_;
    private String startLocalDateTime_ = "";
    private String endLocalDateTime_ = "";

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        n.n(z.class, zVar);
    }

    public static void p(z zVar, long j) {
        zVar.bitField0_ |= 1;
        zVar.startTimeEpochMs_ = j;
    }

    public static void q(z zVar, String str) {
        zVar.getClass();
        str.getClass();
        zVar.bitField0_ |= 4;
        zVar.startLocalDateTime_ = str;
    }

    public static void r(z zVar, String str) {
        zVar.getClass();
        str.getClass();
        zVar.bitField0_ |= 8;
        zVar.endLocalDateTime_ = str;
    }

    public static zph s() {
        return (zph) DEFAULT_INSTANCE.d();
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "startLocalDateTime_", "endLocalDateTime_"});
            case 3:
                return new z();
            case 4:
                return new zph(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (z.class) {
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
