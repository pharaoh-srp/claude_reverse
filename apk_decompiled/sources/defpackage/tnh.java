package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;

/* JADX INFO: loaded from: classes3.dex */
public final class tnh extends ts9 implements zy7 {
    public static final tnh G;
    public static final tnh H;
    public static final tnh I;
    public static final tnh J;
    public static final tnh K;
    public static final tnh L;
    public static final tnh M;
    public static final tnh N;
    public static final tnh O;
    public static final tnh P;
    public static final tnh Q;
    public static final tnh R;
    public static final tnh S;
    public static final tnh T;
    public static final tnh U;
    public static final tnh V;
    public static final tnh W;
    public final /* synthetic */ int F;

    static {
        int i = 0;
        G = new tnh(i, 0);
        H = new tnh(i, 1);
        I = new tnh(i, 2);
        J = new tnh(i, 3);
        K = new tnh(i, 4);
        L = new tnh(i, 5);
        M = new tnh(i, 6);
        N = new tnh(i, 7);
        O = new tnh(i, 8);
        P = new tnh(i, 9);
        Q = new tnh(i, 10);
        R = new tnh(i, 11);
        S = new tnh(i, 12);
        T = new tnh(i, 13);
        U = new tnh(i, 14);
        V = new tnh(i, 15);
        W = new tnh(i, 16);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tnh() {
        super(0);
        this.F = 20;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.F) {
            case 0:
                return "Uncaught exception during the task execution";
            case 1:
                return "Thread was unable to set its own interrupted state";
            case 2:
                return "Thread tried to sleep for a negative amount of time";
            case 3:
                return new Timer(jce.a.b(tqh.class).d(), true);
            case 4:
                return "Datadog has not been initialized.";
            case 5:
                return "Trying to send 'view ended' more than once";
            case 6:
                return "Received null KeyEvent";
            case 7:
                return "Error processing MotionEvent";
            case 8:
                return "Received null MotionEvent";
            case 9:
                return "Wrapped Window.Callback failed processing event";
            case 10:
                return "Can't wipe data from a null directory";
            case 11:
                return "Error cancelling the UploadWorker";
            case 12:
                return "UploadWorker was scheduled.";
            case 13:
                return "Error while trying to setup the UploadWorker";
            case 14:
                return "Write operation failed.";
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return "Write operation failed, but no onError callback was provided.";
            case 16:
                return "Write operation ignored, session is expired or RUM feature is disabled.";
            case g.MAX_FIELD_NUMBER /* 17 */:
                return String.format(Locale.US, "Error serializing %s model", Arrays.copyOf(new Object[]{ufg.class.getSimpleName()}, 1));
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ij0.j("You're trying to create an DatadogTracer instance, but provided ", tk5.class.getCanonicalName(), " writer wrapper is not supported.");
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                throw null;
            default:
                return "Problem retrieving system value for screen_brightness";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tnh(int i, int i2) {
        super(i);
        this.F = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tnh(int i, Object obj) {
        super(0);
        this.F = i;
    }
}
