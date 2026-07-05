package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.bgj;
import defpackage.nga;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = nga.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        nga ngaVarC = nga.c();
        Objects.toString(intent);
        ngaVarC.getClass();
        try {
            bgj bgjVarD = bgj.d(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            bgjVarD.getClass();
            synchronized (bgj.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = bgjVarD.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    bgjVarD.i = pendingResultGoAsync;
                    if (bgjVarD.h) {
                        pendingResultGoAsync.finish();
                        bgjVarD.i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e) {
            nga.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
