package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes.dex */
public final class f88 extends g88 {
    public static final Object c = new Object();
    public static final f88 d = new f88();

    public static AlertDialog f(Activity activity, int i, jnj jnjVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(pmj.c(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strB = pmj.b(activity, i);
        if (strB != null) {
            builder.setPositiveButton(strB, jnjVar);
        }
        String strF = pmj.f(activity, i);
        if (strF != null) {
            builder.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", grc.p(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof fx7) {
                uyg.J(alertDialog, onCancelListener).K(((ex7) ((fx7) activity).Z.F).P, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        cs6.a(alertDialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogF = f(googleApiActivity, i, jnj.b(super.b(i, googleApiActivity, "d"), googleApiActivity), googleApiActivity2);
        if (alertDialogF == null) {
            return;
        }
        g(googleApiActivity, alertDialogF, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void h(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        Log.w("GoogleApiAvailability", grc.u("GMS core API Availability. ConnectionResult=", i, ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new bnj(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = pmj.e(context, i);
        String strD = pmj.d(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        dgj.v(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        o7c o7cVar = new o7c(context);
        o7cVar.l();
        o7cVar.e(true);
        o7cVar.i(strE);
        n7c n7cVar = new n7c(0);
        n7cVar.e(strD);
        o7cVar.o(n7cVar);
        PackageManager packageManager = context.getPackageManager();
        if (nai.z == null) {
            nai.z = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (nai.z.booleanValue()) {
            o7cVar.n(context.getApplicationInfo().icon);
            o7cVar.m(2);
            if (nai.P(context)) {
                o7cVar.a(2131231196, pendingIntent, resources.getString(com.anthropic.claude.R.string.common_open_on_phone));
            } else {
                o7cVar.g(pendingIntent);
            }
        } else {
            o7cVar.n(R.drawable.stat_sys_warning);
            o7cVar.p(resources.getString(com.anthropic.claude.R.string.common_google_play_services_notification_ticker));
            o7cVar.q(System.currentTimeMillis());
            o7cVar.g(pendingIntent);
            o7cVar.h(strD);
        }
        synchronized (c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.anthropic.claude.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        o7cVar.f();
        Notification notificationC = o7cVar.c();
        if (i == 1 || i == 2 || i == 3) {
            z88.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationC);
    }

    public final void i(Activity activity, k4a k4aVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogF = f(activity, i, jnj.c(k4aVar, super.b(i, activity, "d")), onCancelListener);
        if (alertDialogF == null) {
            return;
        }
        g(activity, alertDialogF, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
