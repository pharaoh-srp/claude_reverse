package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.Arrays;
import java.util.Locale;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class rb1 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rb1(String str, int i) {
        super(0);
        this.F = i;
        this.G = str;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        String str = this.G;
        switch (i) {
            case 0:
                return ij0.i("Dropped item in BackPressuredBlockingQueue queue: ", str);
            case 1:
                return ij0.j("Received unknown broadcast intent: [", str, "]");
            case 2:
                return String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{str}, 1));
            case 3:
                return String.format(Locale.US, "Unable to get result of the %s task", Arrays.copyOf(new Object[]{str}, 1));
            case 4:
                return String.format(Locale.US, "Unable to get result of the %s task", Arrays.copyOf(new Object[]{str}, 1));
            case 5:
                return String.format(Locale.US, "Unable to get result of the %s task", Arrays.copyOf(new Object[]{str}, 1));
            case 6:
                return String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{str}, 1));
            case 7:
                return String.format(Locale.US, "Unable to schedule %s task on the executor", Arrays.copyOf(new Object[]{str}, 1));
            case 8:
                return String.format(Locale.US, "Cannot add event receiver for feature \"%s\", it is not registered.", Arrays.copyOf(new Object[]{str}, 1));
            case 9:
                return String.format(Locale.US, "Feature \"%s\" already has event receiver registered, overwriting it.", Arrays.copyOf(new Object[]{str}, 1));
            case 10:
                return str;
            case 11:
                return ij0.i("Error parsing source type from NDK crash event: ", str);
            case 12:
                return ij0.i("No telemetry found for viewId=", str);
            case 13:
                return str;
            case 14:
                return ij0.i("[ViewNetworkSettledMetric] The difference between the last interaction and the current view is negative for viewId:", str);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{str}, 1));
            case 16:
                return String.format(Locale.US, "Error while trying to deserialize the RumEvent: %s", Arrays.copyOf(new Object[]{str}, 1));
            case g.MAX_FIELD_NUMBER /* 17 */:
                return String.format(Locale.US, "Error while trying to deserialize the NDK Crash info: %s", Arrays.copyOf(new Object[]{str}, 1));
            case g.AVG_FIELD_NUMBER /* 18 */:
                return String.format(Locale.US, "Error while trying to deserialize the NDK Crash info: %s", Arrays.copyOf(new Object[]{str}, 1));
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return String.format(Locale.US, "Feature \"%s\" is being retrieved, but no SDK instance is available. Make sure the SDK is properly initialized.", Arrays.copyOf(new Object[]{str}, 1));
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return "Unexpected EOF at the operation=".concat(str);
            case 21:
                return str;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ij0.j("Unable to convert [", str, "] to a valid graphql operation type");
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 24:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case BuildConfig.VERSION_CODE /* 25 */:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 26:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 27:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            case 28:
                return String.format(Locale.US, "You are using an unknown source %s for your events", Arrays.copyOf(new Object[]{str}, 1));
            default:
                return String.format(Locale.US, "Unknown RUM event meta type value [%s]", Arrays.copyOf(new Object[]{str}, 1));
        }
    }
}
