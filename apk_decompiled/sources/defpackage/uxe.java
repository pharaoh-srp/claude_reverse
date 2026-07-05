package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class uxe extends ts9 implements zy7 {
    public static final uxe G;
    public static final uxe H;
    public static final uxe I;
    public static final uxe J;
    public static final uxe K;
    public static final uxe L;
    public static final uxe M;
    public static final uxe N;
    public static final uxe O;
    public static final uxe P;
    public static final uxe Q;
    public static final uxe R;
    public static final uxe S;
    public static final uxe T;
    public static final uxe U;
    public static final uxe V;
    public static final uxe W;
    public static final uxe X;
    public static final uxe Y;
    public static final uxe Z;
    public static final uxe a0;
    public static final uxe b0;
    public static final uxe c0;
    public static final uxe d0;
    public static final uxe e0;
    public static final uxe f0;
    public static final uxe g0;
    public static final uxe h0;
    public static final uxe i0;
    public static final uxe j0;
    public final /* synthetic */ int F;

    static {
        int i = 0;
        G = new uxe(i, 0);
        H = new uxe(i, 1);
        I = new uxe(i, 2);
        J = new uxe(i, 3);
        K = new uxe(i, 4);
        L = new uxe(i, 5);
        M = new uxe(i, 6);
        N = new uxe(i, 7);
        O = new uxe(i, 8);
        P = new uxe(i, 9);
        Q = new uxe(i, 10);
        R = new uxe(i, 11);
        S = new uxe(i, 12);
        T = new uxe(i, 13);
        U = new uxe(i, 14);
        V = new uxe(i, 15);
        W = new uxe(i, 16);
        X = new uxe(i, 17);
        Y = new uxe(i, 18);
        Z = new uxe(i, 19);
        a0 = new uxe(i, 20);
        b0 = new uxe(i, 21);
        c0 = new uxe(i, 22);
        d0 = new uxe(i, 23);
        e0 = new uxe(i, 24);
        f0 = new uxe(i, 25);
        g0 = new uxe(i, 26);
        h0 = new uxe(i, 27);
        i0 = new uxe(i, 28);
        j0 = new uxe(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uxe(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.zy7
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.F) {
            case 0:
                return "RumEventMapper: the return from the ErrorEvent mapper was null for a crash. Dropping crashes in from the event mapper is not supported. The original event object will be used instead.";
            case 1:
                return "Failed to deserialize RUM event meta";
            case 2:
                return "RUM feature received a log event where mandatory message field is either missing or has a wrong type.";
            case 3:
                return "RUM feature received a log event with stacktrace where mandatory message field is either missing or has a wrong type.";
            case 4:
                return "No last known RUM view event found, skipping fatal ANR reporting.";
            case 5:
                return "Couldn't get historical exit reasons";
            case 6:
                return "Developer mode enabled, setting RUM sample rate to 100%.";
            case 7:
                return "RumFirstDrawTimeReporterImpl unable to add onDrawListener onto viewTreeObserver";
            case 8:
                return "RumTTIDReporterImpl unable to remove onDrawListener from viewTreeObserver";
            case 9:
            case 10:
                return "Cannot generate SHA-1 hash for rum request idempotency key.";
            case 11:
                return "SHA-1 algorithm could not be found in MessageDigest.";
            case 12:
                return "Cannot generate SHA-1 hash for rum request idempotency key.";
            case 13:
                return "Failed to parse GraphQL errors from attribute";
            case 14:
                return "TTFD value is too large, skipping it";
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return "TTID value is too large, skipping it";
            case 16:
                return "Multiple views are active at the same time, this shouldn't happen.";
            case g.MAX_FIELD_NUMBER /* 17 */:
                return "No active view found to add the loading time.";
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return "A RUM event was detected, but no view is active. To track views automatically, try calling the RumConfiguration.Builder.useViewTrackingStrategy() method.\nYou can also track views manually using the RumMonitor.startView() and RumMonitor.stopView() methods.";
            case 21:
                return "An RUM event was detected, but no view is active, its missed type is unknown";
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return "[Mobile Metric] RUM Session Ended";
            case 24:
                return "Cannot generate SHA-256 hash.";
            case BuildConfig.VERSION_CODE /* 25 */:
                return "Failed to truncate string to UTF-8 byte limit";
            case 26:
                return "Failed to deserialize TLV data length";
            case 27:
                return "Max number of telemetry events per session reached, rejecting.";
            case 28:
                return "GlobalDatadogTracer class exists in the runtime classpath, but there is an error invoking getOrNull method";
            default:
                return "Thread was unable to set its own interrupted state";
        }
    }
}
