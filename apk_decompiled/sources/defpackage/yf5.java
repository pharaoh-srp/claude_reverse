package defpackage;

import androidx.health.platform.client.proto.g;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class yf5 extends ts9 implements zy7 {
    public static final yf5 G;
    public static final yf5 H;
    public static final yf5 I;
    public static final yf5 J;
    public static final yf5 K;
    public static final yf5 L;
    public static final yf5 M;
    public static final yf5 N;
    public static final yf5 O;
    public static final yf5 P;
    public static final yf5 Q;
    public static final yf5 R;
    public static final yf5 S;
    public static final yf5 T;
    public static final yf5 U;
    public static final yf5 V;
    public static final yf5 W;
    public static final yf5 X;
    public static final yf5 Y;
    public static final yf5 Z;
    public static final yf5 a0;
    public static final yf5 b0;
    public static final yf5 c0;
    public static final yf5 d0;
    public static final yf5 e0;
    public static final yf5 f0;
    public static final yf5 g0;
    public static final yf5 h0;
    public static final yf5 i0;
    public static final yf5 j0;
    public final /* synthetic */ int F;

    static {
        int i = 0;
        G = new yf5(i, 0);
        H = new yf5(i, 1);
        I = new yf5(i, 2);
        J = new yf5(i, 3);
        K = new yf5(i, 4);
        L = new yf5(i, 5);
        M = new yf5(i, 6);
        N = new yf5(i, 7);
        O = new yf5(i, 8);
        P = new yf5(i, 9);
        Q = new yf5(i, 10);
        R = new yf5(i, 11);
        S = new yf5(i, 12);
        T = new yf5(i, 13);
        U = new yf5(i, 14);
        V = new yf5(i, 15);
        W = new yf5(i, 16);
        X = new yf5(i, 17);
        Y = new yf5(i, 18);
        Z = new yf5(i, 19);
        a0 = new yf5(i, 20);
        b0 = new yf5(i, 21);
        c0 = new yf5(i, 22);
        d0 = new yf5(i, 23);
        e0 = new yf5(i, 24);
        f0 = new yf5(i, 25);
        g0 = new yf5(i, 26);
        h0 = new yf5(i, 27);
        i0 = new yf5(i, 28);
        j0 = new yf5(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf5(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.zy7
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.F) {
            case 0:
                return "Ignoring provided User-Agent header, because it is reserved.";
            case 1:
                return "Unable to create the request, probably due to bad data format. The batch will be dropped.";
            case 2:
            case 3:
                return "Unable to execute the request; we will retry later.";
            case 4:
                return "The Datadog library has already been initialized.";
            case 5:
                return "Cannot create SDK instance ID, stopping SDK initialization.";
            case 6:
                return "Unable to remove shutdown hook, Runtime is already shutting down";
            case 7:
                return "Security Manager denied removing shutdown hook ";
            case 8:
                return "Unable to add shutdown hook, Runtime is already shutting down";
            case 9:
                return "Shutdown hook was rejected";
            case 10:
                return "Security Manager denied adding shutdown hook ";
            case 11:
                return "No need to write last RUM view event: NDK crash reports feature is not enabled and API is below 30.";
            case 12:
                return "Failed to get all threads dump";
            case 13:
                return "RUM feature is not registered, won't report crash as RUM event.";
            case 14:
                return "Datadog SDK is in an unexpected state due to an ongoing crash. Some events could be lost.";
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
                return "RUM feature is not registered, won't report NDK crash info as RUM error.";
            case g.MAX_FIELD_NUMBER /* 17 */:
                return "RUM feature received a NDK crash event where one or more mandatory (timestamp, signalName, stacktrace, message, lastViewEvent) fields are either missing or have wrong type.";
            case g.AVG_FIELD_NUMBER /* 18 */:
                return "Last known exit reason has no trace information attached, cannot report fatal ANR.";
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return "Cannot open trace for the last known exit reason.";
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return "Error while trying to read the NDK crash directory";
            case 21:
                return "RUM feature is not registered, won't report NDK crash info as RUM error.";
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return "Cannot write JVM crash, because write context is not available.";
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return "You're trying to create an DatadogTracer instance, but either the SDK was not initialized or the Tracing feature was not registered. No tracing data will be sent.";
            case 24:
                return "The Tracing feature is not implementing the InternalCoreWriterProvider interface. No tracing data will be sent.";
            case BuildConfig.VERSION_CODE /* 25 */:
                return "Default service name is missing during DatadogTracerBuilder creation, did you initialize SDK?";
            case 26:
                return "Read error - blocks are in an unexpected order";
            case 27:
                return "[Mobile Metric] RUM UI Slowness";
            case 28:
                return lm6.E;
            default:
                return "No batch file available";
        }
    }
}
