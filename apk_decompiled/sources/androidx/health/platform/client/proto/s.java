package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.l28;
import defpackage.mr9;
import defpackage.o89;
import defpackage.p3;
import defpackage.sq6;
import defpackage.utc;
import defpackage.uud;
import defpackage.yje;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends n {
    public static final int DATA_ORIGIN_FIELD_NUMBER = 3;
    private static final s DEFAULT_INSTANCE;
    public static final int METRIC_SPEC_FIELD_NUMBER = 2;
    private static volatile utc PARSER = null;
    public static final int SLICE_DURATION_MILLIS_FIELD_NUMBER = 4;
    public static final int SLICE_PERIOD_FIELD_NUMBER = 5;
    public static final int TIME_SPEC_FIELD_NUMBER = 1;
    private int bitField0_;
    private o89 dataOrigin_;
    private o89 metricSpec_;
    private long sliceDurationMillis_;
    private String slicePeriod_;
    private z timeSpec_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        n.n(s.class, sVar);
    }

    public s() {
        uud uudVar = uud.H;
        this.metricSpec_ = uudVar;
        this.dataOrigin_ = uudVar;
        this.slicePeriod_ = "";
    }

    public static void p(s sVar, z zVar) {
        sVar.getClass();
        sVar.timeSpec_ = zVar;
        sVar.bitField0_ |= 1;
    }

    public static void q(s sVar, ArrayList arrayList) {
        o89 o89Var = sVar.metricSpec_;
        if (!((p3) o89Var).E) {
            int size = o89Var.size();
            sVar.metricSpec_ = o89Var.j(size == 0 ? 10 : size * 2);
        }
        a.a(arrayList, sVar.metricSpec_);
    }

    public static void r(s sVar, ArrayList arrayList) {
        o89 o89Var = sVar.dataOrigin_;
        if (!((p3) o89Var).E) {
            int size = o89Var.size();
            sVar.dataOrigin_ = o89Var.j(size == 0 ? 10 : size * 2);
        }
        a.a(arrayList, sVar.dataOrigin_);
    }

    public static void s(s sVar, long j) {
        sVar.bitField0_ |= 2;
        sVar.sliceDurationMillis_ = j;
    }

    public static void t(s sVar, String str) {
        sVar.getClass();
        str.getClass();
        sVar.bitField0_ |= 4;
        sVar.slicePeriod_ = str;
    }

    public static yje u() {
        return (yje) DEFAULT_INSTANCE.d();
    }

    public static s v(byte[] bArr) {
        return (s) n.m(DEFAULT_INSTANCE, bArr);
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဈ\u0002", new Object[]{"bitField0_", "timeSpec_", "metricSpec_", t.class, "dataOrigin_", e.class, "sliceDurationMillis_", "slicePeriod_"});
            case 3:
                return new s();
            case 4:
                return new yje(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (s.class) {
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
