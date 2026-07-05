package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ol7 extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public ol7(Context context) {
        this.a = context;
    }

    public static void a(Context context) {
        AtomicReference atomicReference = b;
        if (atomicReference.get() == null) {
            ol7 ol7Var = new ol7(context);
            while (!atomicReference.compareAndSet(null, ol7Var)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(ol7Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (pl7.j) {
            try {
                Iterator it = ((zo0) pl7.k.values()).iterator();
                while (it.hasNext()) {
                    ((pl7) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.unregisterReceiver(this);
    }
}
