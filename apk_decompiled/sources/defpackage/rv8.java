package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class rv8 extends BroadcastReceiver {
    public static final List b;
    public static final IntentFilter c;
    public final w95 a;

    static {
        List listX = x44.X("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        b = listX;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        c = intentFilter;
    }

    public rv8(w95 w95Var) {
        this.a = w95Var;
    }

    public final void a(Context context) throws FileNotFoundException {
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        PowerManager powerManager = (PowerManager) systemService;
        boolean zIsDeviceIdleMode = powerManager.isDeviceIdleMode();
        if (Build.VERSION.SDK_INT >= 33) {
            zIsDeviceIdleMode = zIsDeviceIdleMode || d6.c(powerManager);
        }
        if (zIsDeviceIdleMode) {
            this.a.a();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws FileNotFoundException {
        if (w44.G0(b, intent.getAction())) {
            a(context);
        }
    }
}
