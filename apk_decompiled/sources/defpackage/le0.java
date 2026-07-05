package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Paint;
import android.os.Trace;
import android.util.Log;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.health.platform.client.proto.g;
import androidx.work.impl.foreground.SystemForegroundService;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class le0 {
    public static void a() {
        Trace.beginAsyncSection("GlanceAppWidget::update", 0);
    }

    public static void b() {
        Trace.endAsyncSection("GlanceAppWidget::update", 0);
    }

    public static int c(RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static String d(Context context) {
        return context.getOpPackageName();
    }

    public static int e(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static boolean f(Notification.Action action) {
        return action.isContextual();
    }

    public static AutofillId g(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static ViewStructure h(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static void i(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void j(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void k(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void l(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static Object m(int i) {
        switch (sq6.F(i)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            case g.MAX_FIELD_NUMBER /* 17 */:
                return BlendMode.LIGHTEN;
            case g.AVG_FIELD_NUMBER /* 18 */:
                return BlendMode.COLOR_DODGE;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return BlendMode.COLOR_BURN;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return BlendMode.DIFFERENCE;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case BuildConfig.VERSION_CODE /* 25 */:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case 27:
                return BlendMode.COLOR;
            case 28:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static void n(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void o(Paint paint, Object obj) {
        paint.setBlendMode((BlendMode) obj);
    }

    public static void p(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void q(Notification.Action.Builder builder, boolean z) {
        builder.setContextual(z);
    }

    public static void r(RemoteInput.Builder builder, int i) {
        builder.setEditChoicesBeforeSending(i);
    }

    public static void s(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void t(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException e) {
            nga ngaVarC = nga.c();
            String str = SystemForegroundService.I;
            if (ngaVarC.a <= 5) {
                Log.w(str, "Unable to start foreground service", e);
            }
        } catch (SecurityException e2) {
            nga ngaVarC2 = nga.c();
            String str2 = SystemForegroundService.I;
            if (ngaVarC2.a <= 5) {
                Log.w(str2, "Unable to start foreground service", e2);
            }
        }
    }
}
