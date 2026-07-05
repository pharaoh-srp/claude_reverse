package defpackage;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.location.Location;
import android.os.StrictMode;
import android.util.SizeF;
import android.widget.EdgeEffect;
import android.widget.RemoteViews;
import androidx.health.platform.client.proto.g;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oe0 {
    public static void a(RemoteViews remoteViews, int i, RemoteViews remoteViews2, int i2) {
        remoteViews.addStableView(i, remoteViews2, i2);
    }

    public static EdgeEffect b(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static RemoteViews c(Map map) {
        return new RemoteViews((Map<SizeF, RemoteViews>) map);
    }

    public static float d(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
    }

    public static int e(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.I;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return stopReason;
            default:
                return -512;
        }
    }

    public static boolean f(Notification.Action action) {
        return action.isAuthenticationRequired();
    }

    public static boolean g(Location location) {
        return location.isMock();
    }

    public static float h(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return MTTypesetterKt.kLineSkipLimitMultiplier;
        }
    }

    public static StrictMode.VmPolicy.Builder i(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    public static RemoteViews j(int i, int i2, String str) {
        return new RemoteViews(str, i, i2);
    }

    public static void k(Notification.Action.Builder builder, boolean z) {
        builder.setAuthenticationRequired(z);
    }

    public static void l(Notification.Builder builder, int i) {
        builder.setForegroundServiceBehavior(i);
    }
}
