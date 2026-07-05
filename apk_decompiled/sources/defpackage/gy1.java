package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class gy1 extends znh implements p1h {
    public static final Set J = mp0.Z0(new n1h[]{n1h.F, n1h.I});
    public static final Set K = mp0.Z0(new Integer[]{1, 4, 2});
    public final h99 G;
    public final ThreadPoolExecutor H;
    public volatile o1h I;

    public gy1(h99 h99Var, ThreadPoolExecutor threadPoolExecutor) {
        h99Var.getClass();
        this.G = h99Var;
        this.H = threadPoolExecutor;
        this.I = new o1h();
    }

    @Override // defpackage.p1h
    public final void a(Context context) {
        if (this.F.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }

    public final void c(Intent intent) {
        boolean z = true;
        int intExtra = intent.getIntExtra("status", 1);
        int intExtra2 = intent.getIntExtra("level", -1);
        int intExtra3 = intent.getIntExtra("scale", 100);
        int intExtra4 = intent.getIntExtra("plugged", -1);
        n1h n1hVar = intExtra != 2 ? intExtra != 3 ? intExtra != 4 ? intExtra != 5 ? n1h.E : n1h.I : n1h.H : n1h.G : n1h.F;
        boolean booleanExtra = intent.getBooleanExtra("present", true);
        int iL = mwa.L((intExtra2 * 100.0f) / intExtra3);
        if (!K.contains(Integer.valueOf(intExtra4)) && booleanExtra) {
            z = false;
        }
        this.I = o1h.a(this.I, J.contains(n1hVar), iL, false, z, 4);
    }

    public final void d(Context context, Intent intent) {
        String action;
        g99 g99Var = g99.G;
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (RuntimeException e) {
                dch.I(this.G, 5, x44.X(g99.E, g99Var), n.U, e, 48);
                return;
            }
        } else {
            action = null;
        }
        if (x44.r(action, "android.intent.action.BATTERY_CHANGED")) {
            c(intent);
        } else {
            if (!x44.r(action, "android.os.action.POWER_SAVE_MODE_CHANGED")) {
                dch.I(this.G, 2, x44.X(g99.F, g99Var), new rb1(action, 1), null, 56);
                return;
            }
            Object systemService = context.getSystemService("power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            this.I = o1h.a(this.I, false, 0, powerManager != null ? powerManager.isPowerSaveMode() : false, false, 11);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        v40.p(this.H, "BroadcastReceiverSystemInfoProvider.handleIntent", this.G, new fy1(this, context, intent, 0));
    }

    @Override // defpackage.p1h
    public final o1h v() {
        return this.I;
    }
}
