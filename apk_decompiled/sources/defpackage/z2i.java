package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class z2i extends BroadcastReceiver {
    public a3i a;

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        a3i a3iVar = this.a;
        if (a3iVar == null) {
            return;
        }
        if (a3iVar.c()) {
            Log.isLoggable("FirebaseMessaging", 3);
            a3i a3iVar2 = this.a;
            ((y2i) a3iVar2.J).f.schedule(a3iVar2, 0L, TimeUnit.SECONDS);
            context.unregisterReceiver(this);
            this.a = null;
        }
    }
}
