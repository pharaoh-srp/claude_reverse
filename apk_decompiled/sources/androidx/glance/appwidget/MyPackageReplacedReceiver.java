package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.al8;
import defpackage.g86;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.vtk;

/* JADX INFO: loaded from: classes2.dex */
public class MyPackageReplacedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            sz6.j("onReceive context is null");
        } else if (intent == null) {
            sz6.j("onReceive intent is null");
        } else {
            vtk.j(this, g86.a, new al8(context, (tp4) null, 17));
        }
    }
}
