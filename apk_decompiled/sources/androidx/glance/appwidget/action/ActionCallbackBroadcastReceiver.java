package androidx.glance.appwidget.action;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.g86;
import defpackage.m0;
import defpackage.vtk;

/* JADX INFO: loaded from: classes2.dex */
public class ActionCallbackBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        vtk.j(this, g86.a, new m0(context, intent, null, 5));
    }
}
