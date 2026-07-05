package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class znh extends BroadcastReceiver {
    public final jz1 E;
    public final AtomicBoolean F;

    public znh() {
        jz1.a.getClass();
        this.E = iz1.b;
        this.F = new AtomicBoolean(false);
    }

    public final Intent b(Context context, IntentFilter intentFilter) {
        context.getClass();
        hz1 hz1Var = (hz1) this.E;
        Intent intentRegisterReceiver = (hz1Var.i || hz1Var.d) ? context.registerReceiver(this, intentFilter, 4) : context.registerReceiver(this, intentFilter);
        this.F.set(true);
        return intentRegisterReceiver;
    }
}
