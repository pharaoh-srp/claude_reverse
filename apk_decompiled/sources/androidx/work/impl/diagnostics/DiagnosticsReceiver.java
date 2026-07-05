package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.bgj;
import defpackage.nga;
import defpackage.s31;

/* JADX INFO: loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = nga.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        nga.c().getClass();
        try {
            context.getClass();
            bgj bgjVarD = bgj.d(context);
            bgjVarD.getClass();
            bgjVarD.b(new s31(DiagnosticsWorker.class).b());
        } catch (IllegalStateException e) {
            nga.c().b(a, "WorkManager is not initialized", e);
        }
    }
}
