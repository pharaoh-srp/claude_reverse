package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.eg5;
import defpackage.esa;
import defpackage.fg5;
import defpackage.gg5;
import defpackage.l28;
import defpackage.mr9;
import defpackage.o89;
import defpackage.sq6;
import defpackage.utc;
import defpackage.uud;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends n {
    public static final int DATA_ORIGINS_FIELD_NUMBER = 8;
    private static final c DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUES_FIELD_NUMBER = 6;
    public static final int END_LOCAL_DATE_TIME_FIELD_NUMBER = 4;
    public static final int END_TIME_EPOCH_MS_FIELD_NUMBER = 2;
    public static final int LONG_VALUES_FIELD_NUMBER = 7;
    private static volatile utc PARSER = null;
    public static final int START_LOCAL_DATE_TIME_FIELD_NUMBER = 3;
    public static final int START_TIME_EPOCH_MS_FIELD_NUMBER = 1;
    public static final int ZONE_OFFSET_SECONDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private o89 dataOrigins_;
    private esa doubleValues_;
    private String endLocalDateTime_;
    private long endTimeEpochMs_;
    private esa longValues_;
    private String startLocalDateTime_;
    private long startTimeEpochMs_;
    private int zoneOffsetSeconds_;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        n.n(c.class, cVar);
    }

    public c() {
        esa esaVar = esa.F;
        this.doubleValues_ = esaVar;
        this.longValues_ = esaVar;
        this.startLocalDateTime_ = "";
        this.endLocalDateTime_ = "";
        this.dataOrigins_ = uud.H;
    }

    public final boolean A() {
        return (this.bitField0_ & 1) != 0;
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0002\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u00062\u00072\b\u001b", new Object[]{"bitField0_", "startTimeEpochMs_", "endTimeEpochMs_", "startLocalDateTime_", "endLocalDateTime_", "zoneOffsetSeconds_", "doubleValues_", fg5.a, "longValues_", gg5.a, "dataOrigins_", e.class});
            case 3:
                return new c();
            case 4:
                return new eg5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (c.class) {
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

    public final o89 p() {
        return this.dataOrigins_;
    }

    public final Map q() {
        return Collections.unmodifiableMap(this.doubleValues_);
    }

    public final String r() {
        return this.endLocalDateTime_;
    }

    public final long s() {
        return this.endTimeEpochMs_;
    }

    public final Map t() {
        return Collections.unmodifiableMap(this.longValues_);
    }

    public final String u() {
        return this.startLocalDateTime_;
    }

    public final long v() {
        return this.startTimeEpochMs_;
    }

    public final int w() {
        return this.zoneOffsetSeconds_;
    }

    public final boolean x() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean y() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean z() {
        return (this.bitField0_ & 4) != 0;
    }
}
