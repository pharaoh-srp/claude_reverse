package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.UUID;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends ts9 implements zy7 {
    public static final n G;
    public static final n H;
    public static final n I;
    public static final n J;
    public static final n K;
    public static final n L;
    public static final n M;
    public static final n N;
    public static final n O;
    public static final n P;
    public static final n Q;
    public static final n R;
    public static final n S;
    public static final n T;
    public static final n U;
    public static final n V;
    public static final n W;
    public static final n X;
    public static final n Y;
    public static final n Z;
    public static final n a0;
    public static final n b0;
    public static final n c0;
    public static final n d0;
    public static final n e0;
    public static final n f0;
    public static final n g0;
    public static final n h0;
    public static final n i0;
    public static final n j0;
    public final /* synthetic */ int F;

    static {
        int i = 0;
        G = new n(i, 0);
        H = new n(i, 1);
        I = new n(i, 2);
        J = new n(i, 3);
        K = new n(i, 4);
        L = new n(i, 5);
        M = new n(i, 6);
        N = new n(i, 7);
        O = new n(i, 8);
        P = new n(i, 9);
        Q = new n(i, 10);
        R = new n(i, 11);
        S = new n(i, 12);
        T = new n(i, 13);
        U = new n(i, 14);
        V = new n(i, 15);
        W = new n(i, 16);
        X = new n(i, 17);
        Y = new n(i, 18);
        Z = new n(i, 19);
        a0 = new n(i, 20);
        b0 = new n(i, 21);
        c0 = new n(i, 22);
        d0 = new n(i, 23);
        e0 = new n(i, 24);
        f0 = new n(i, 25);
        g0 = new n(i, 26);
        h0 = new n(i, 27);
        i0 = new n(i, 28);
        j0 = new n(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return "Failed to get all stack traces.";
            case 1:
                return "Interrupted while waiting for ANR resolution.";
            case 2:
                return "Failed to restore interrupted state during ANR resolution.";
            case 3:
                return "In order to use the RUM automatic tracking feature you will have to use the Application context when initializing the SDK";
            case 4:
                return "RUM feature is not initialized yet, you need to register it with a SDK instance by calling SdkCore#registerFeature method. Cannot provide SDK instance for view tracking.";
            case 5:
                return UUID.randomUUID();
            case 6:
                return UUID.randomUUID();
            case 7:
                return "Parsing tracing information for the exit reason wasn't successful, no thread dumps were parsed.";
            case 8:
                return "Failed to read crash trace stream.";
            case 9:
            case 10:
            case 11:
                return ieiVar;
            case 12:
                return "[Mobile Metric] Batch Closed";
            case 13:
                return null;
            case 14:
                return "Error handling system info broadcast intent.";
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return "Cannot copy ByteArray, dest doesn't have enough space";
            case 16:
                return "Cannot copy ByteArray, src doesn't have enough data";
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return "We couldn't register a Network Callback, the network information reported will be less accurate.";
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return "We couldn't unregister the Network Callback";
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return "Internal operation failed on ComponentPredicate";
            case 24:
                return "Unable to read your application's version name";
            case BuildConfig.VERSION_CODE /* 25 */:
                return "Unable to launch a synchronize local time with an NTP server.";
            case 26:
                return "Failed to read Build ID information, de-obfuscation may not work properly.";
            case 27:
                return "Datadog SDK was initialized in a secondary process: although data will still be captured, nothing will be uploaded from this process. Make sure to also initialize the SDK from the main process of your application.";
            case 28:
                return "Thread was unable to set its own interrupted state";
            default:
                return "Trying to shut down Kronos when it is already not running";
        }
    }
}
