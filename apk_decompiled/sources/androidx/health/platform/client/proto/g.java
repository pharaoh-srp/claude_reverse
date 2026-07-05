package androidx.health.platform.client.proto;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.d2e;
import defpackage.eg5;
import defpackage.esa;
import defpackage.jg5;
import defpackage.kg5;
import defpackage.l28;
import defpackage.mr9;
import defpackage.o89;
import defpackage.sq6;
import defpackage.utc;
import defpackage.uud;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends n {
    public static final int AVG_FIELD_NUMBER = 18;
    public static final int CLIENT_ID_FIELD_NUMBER = 11;
    public static final int CLIENT_VERSION_FIELD_NUMBER = 12;
    public static final int DATA_ORIGIN_FIELD_NUMBER = 5;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final g DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 13;
    public static final int END_TIME_MILLIS_FIELD_NUMBER = 10;
    public static final int END_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 20;
    public static final int INSTANT_TIME_MILLIS_FIELD_NUMBER = 8;
    public static final int MAX_FIELD_NUMBER = 17;
    public static final int MIN_FIELD_NUMBER = 16;
    public static final int ORIGIN_SAMPLE_UID_FIELD_NUMBER = 14;
    public static final int ORIGIN_SERIES_UID_FIELD_NUMBER = 4;
    private static volatile utc PARSER = null;
    public static final int RECORDING_METHOD_FIELD_NUMBER = 23;
    public static final int SERIES_VALUES_FIELD_NUMBER = 15;
    public static final int START_TIME_MILLIS_FIELD_NUMBER = 9;
    public static final int START_ZONE_OFFSET_SECONDS_FIELD_NUMBER = 19;
    public static final int SUB_TYPE_DATA_LISTS_FIELD_NUMBER = 22;
    public static final int UID_FIELD_NUMBER = 3;
    public static final int UPDATE_TIME_MILLIS_FIELD_NUMBER = 7;
    public static final int VALUES_FIELD_NUMBER = 2;
    public static final int ZONE_OFFSET_SECONDS_FIELD_NUMBER = 6;
    private d avg_;
    private int bitField0_;
    private String clientId_;
    private long clientVersion_;
    private e dataOrigin_;
    private h dataType_;
    private i device_;
    private long endTimeMillis_;
    private int endZoneOffsetSeconds_;
    private long instantTimeMillis_;
    private d max_;
    private d min_;
    private String originSampleUid_;
    private String originSeriesUid_;
    private int recordingMethod_;
    private o89 seriesValues_;
    private long startTimeMillis_;
    private int startZoneOffsetSeconds_;
    private esa subTypeDataLists_;
    private String uid_;
    private long updateTimeMillis_;
    private esa values_;
    private int zoneOffsetSeconds_;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        n.n(g.class, gVar);
    }

    public g() {
        esa esaVar = esa.F;
        this.values_ = esaVar;
        this.subTypeDataLists_ = esaVar;
        this.uid_ = "";
        this.originSeriesUid_ = "";
        this.clientId_ = "";
        this.originSampleUid_ = "";
        this.seriesValues_ = uud.H;
    }

    public final int A() {
        return this.startZoneOffsetSeconds_;
    }

    public final Map B() {
        return Collections.unmodifiableMap(this.subTypeDataLists_);
    }

    public final String C() {
        return this.uid_;
    }

    public final long D() {
        return this.updateTimeMillis_;
    }

    public final Map E() {
        return Collections.unmodifiableMap(this.values_);
    }

    public final int F() {
        return this.zoneOffsetSeconds_;
    }

    public final boolean G() {
        return (this.bitField0_ & 512) != 0;
    }

    public final boolean H() {
        return (this.bitField0_ & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0;
    }

    public final boolean I() {
        return (this.bitField0_ & 131072) != 0;
    }

    public final boolean J() {
        return (this.bitField0_ & 65536) != 0;
    }

    public final boolean K() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean L() {
        return (this.bitField0_ & 16) != 0;
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0002\u0001\u0000\u0001ဉ\u0000\u00022\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003\u0006င\u0004\u0007ဂ\u0005\bဂ\u0006\tဂ\u0007\nဂ\b\u000bဈ\t\fဂ\n\rဉ\u000b\u000eဈ\f\u000f\u001b\u0010ဉ\r\u0011ဉ\u000e\u0012ဉ\u000f\u0013င\u0010\u0014င\u0011\u00162\u0017င\u0012", new Object[]{"bitField0_", "dataType_", "values_", kg5.a, "uid_", "originSeriesUid_", "dataOrigin_", "zoneOffsetSeconds_", "updateTimeMillis_", "instantTimeMillis_", "startTimeMillis_", "endTimeMillis_", "clientId_", "clientVersion_", "device_", "originSampleUid_", "seriesValues_", j.class, "min_", "max_", "avg_", "startZoneOffsetSeconds_", "endZoneOffsetSeconds_", "subTypeDataLists_", jg5.a, "recordingMethod_"});
            case 3:
                return new g();
            case 4:
                return new eg5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (g.class) {
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

    public final String p() {
        return this.clientId_;
    }

    public final long q() {
        return this.clientVersion_;
    }

    public final e r() {
        e eVar = this.dataOrigin_;
        return eVar == null ? e.r() : eVar;
    }

    public final h s() {
        h hVar = this.dataType_;
        return hVar == null ? h.q() : hVar;
    }

    public final i t() {
        i iVar = this.device_;
        return iVar == null ? i.p() : iVar;
    }

    public final long u() {
        return this.endTimeMillis_;
    }

    public final int v() {
        return this.endZoneOffsetSeconds_;
    }

    public final long w() {
        return this.instantTimeMillis_;
    }

    public final int x() {
        return this.recordingMethod_;
    }

    public final o89 y() {
        return this.seriesValues_;
    }

    public final long z() {
        return this.startTimeMillis_;
    }
}
