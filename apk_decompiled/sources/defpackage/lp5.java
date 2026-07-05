package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import io.sentry.w6;

/* JADX INFO: loaded from: classes.dex */
public final class lp5 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Context G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lp5(Context context, int i) {
        super(0);
        this.F = i;
        this.G = context;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        Context context = this.G;
        switch (i) {
            case 0:
                try {
                    return Boolean.valueOf(((ActivityManager) context.getSystemService(ActivityManager.class)).isLowRamDevice());
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                Object systemService = context.getSystemService("display");
                DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
                if (displayManager == null) {
                    return null;
                }
                Display[] displays = displayManager.getDisplays();
                displays.getClass();
                int i2 = 0;
                for (Display display : displays) {
                    if (!mp0.Z0(new Integer[]{1, 0}).contains(Integer.valueOf(display.getState()))) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                try {
                    ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    return Integer.valueOf((int) (memoryInfo.totalMem / w6.MAX_EVENT_SIZE_BYTES));
                } catch (Exception unused2) {
                    return null;
                }
        }
    }
}
