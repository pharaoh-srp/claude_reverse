package androidx.glance.appwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import defpackage.sz6;
import defpackage.t68;
import defpackage.y0c;

/* JADX INFO: loaded from: classes2.dex */
public class GlanceRemoteViewsService extends RemoteViewsService {
    public static final y0c E = new y0c(1);

    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        if (intent == null) {
            sz6.p("Intent is null");
            return null;
        }
        int intExtra = intent.getIntExtra("appWidgetId", -1);
        if (intExtra == -1) {
            sz6.j("No app widget id was present in the intent");
            return null;
        }
        int intExtra2 = intent.getIntExtra("androidx.glance.widget.extra.view_id", -1);
        if (intExtra2 == -1) {
            sz6.j("No view id was present in the intent");
            return null;
        }
        String stringExtra = intent.getStringExtra("androidx.glance.widget.extra.size_info");
        if (stringExtra != null && stringExtra.length() != 0) {
            return new t68(this, intExtra, intExtra2, stringExtra);
        }
        sz6.j("No size info was present in the intent");
        return null;
    }
}
