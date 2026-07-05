package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.Collections;
import java.util.Map;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class qs7 extends ts9 implements zy7 {
    public static final qs7 G;
    public static final qs7 H;
    public static final qs7 I;
    public static final qs7 J;
    public static final qs7 K;
    public static final qs7 L;
    public static final qs7 M;
    public static final qs7 N;
    public static final qs7 O;
    public static final qs7 P;
    public static final qs7 Q;
    public static final qs7 R;
    public static final qs7 S;
    public static final qs7 T;
    public static final qs7 U;
    public static final qs7 V;
    public static final qs7 W;
    public static final qs7 X;
    public static final qs7 Y;
    public static final qs7 Z;
    public static final qs7 a0;
    public static final qs7 b0;
    public static final qs7 c0;
    public static final qs7 d0;
    public static final qs7 e0;
    public static final qs7 f0;
    public static final qs7 g0;
    public static final qs7 h0;
    public static final qs7 i0;
    public static final qs7 j0;
    public final /* synthetic */ int F;

    static {
        int i = 0;
        G = new qs7(i, 0);
        H = new qs7(i, 1);
        I = new qs7(i, 2);
        J = new qs7(i, 3);
        K = new qs7(i, 4);
        L = new qs7(i, 5);
        M = new qs7(i, 6);
        N = new qs7(i, 7);
        O = new qs7(i, 8);
        P = new qs7(i, 9);
        Q = new qs7(i, 10);
        R = new qs7(i, 11);
        S = new qs7(i, 12);
        T = new qs7(i, 13);
        U = new qs7(i, 14);
        V = new qs7(i, 15);
        W = new qs7(i, 16);
        X = new qs7(i, 17);
        Y = new qs7(i, 18);
        Z = new qs7(i, 19);
        a0 = new qs7(i, 20);
        b0 = new qs7(i, 21);
        c0 = new qs7(i, 22);
        d0 = new qs7(i, 23);
        e0 = new qs7(i, 24);
        f0 = new qs7(i, 25);
        g0 = new qs7(i, 26);
        h0 = new qs7(i, 27);
        i0 = new qs7(i, 28);
        j0 = new qs7(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qs7(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.F) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return "Activity stopped but window was not tracked";
            case 2:
                return "Trying to disable JankStats instance which was already disabled before, this shouldn't happen.";
            case 3:
            case 4:
                return "Failed to disable JankStats tracking";
            case 5:
                return "Unable to attach JankStatsListener to window, decorView is null";
            case 6:
                return "Unable to attach JankStatsListener to window, decorView is not hardware accelerated";
            case 7:
                return "Unable to attach JankStatsListener to window";
            case 8:
                return "Unable to create JankStats";
            case 9:
                return "Unable to detach JankStatsListener to window, most probably because it wasn't attached";
            case 10:
                return "A RumMonitor has already been registered for this SDK instance";
            case 11:
                return "Unable to gzip request body";
            case 12:
                return new hdc();
            case 13:
                return null;
            case 14:
                return "Unable to attach JankStats to the current window";
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                Map mapSingletonMap = Collections.singletonMap(rd9.a, new yrg((Object) "Deprecated in Java"));
                mapSingletonMap.getClass();
                return mapSingletonMap;
            case 16:
                return Object.class;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return "KronosClock.getCurrentTimeMs failed with an exception";
            case g.AVG_FIELD_NUMBER /* 18 */:
                return "[Mobile Metric] Method Called";
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return "Internal I/O operation failed";
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return "Can't move data from a null directory";
            case 21:
                return "Can't move data to a null directory";
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return "[ViewNetworkSettledMetric] There was no view created yet for this resource";
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return "[Mobile Metric] Profiling Session";
            case 24:
                return "Profiling stopped with TTID reason";
            case BuildConfig.VERSION_CODE /* 25 */:
                return "SDK instance provided doesn't implement InternalSdkCore.";
            case 26:
                return "You're trying to create a RumMonitor instance, but the RUM application id was empty. No RUM data will be sent.";
            case 27:
                return "RUM Feature is already enabled in this SDK core, ignoring the call to enable it.";
            case 28:
                return "Application has multiple active sessions, this shouldn't happen.";
            default:
                return "Application has multiple active sessions when starting a new session";
        }
    }
}
