package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.am4;
import defpackage.sz6;
import defpackage.x44;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class UnmanagedSessionReceiver extends BroadcastReceiver {
    public static final am4 a = new am4(24);
    public static final LinkedHashMap b = new LinkedHashMap();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !x44.r(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            return;
        }
        if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
            sz6.j("Intent is missing ActionKey extra");
            return;
        }
        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
        if (intExtra == -1) {
            sz6.j("Intent is missing AppWidgetId extra");
        } else {
            am4.v(intExtra);
            Log.e("GlanceAppWidget", "A lambda created by an unmanaged glance session cannot be servicedbecause that session is no longer running.");
        }
    }
}
