package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.w6;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lab implements zy7 {
    public final /* synthetic */ double E;
    public final /* synthetic */ Context F;

    public /* synthetic */ lab(double d, Context context) {
        this.E = d;
        this.F = context;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int largeMemoryClass;
        Context context = this.F;
        try {
            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
            systemService.getClass();
            ActivityManager activityManager = (ActivityManager) systemService;
            largeMemoryClass = (context.getApplicationInfo().flags & FreeTypeConstants.FT_LOAD_COLOR) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
        }
        return Long.valueOf((long) (this.E * ((long) largeMemoryClass) * w6.MAX_EVENT_SIZE_BYTES));
    }
}
