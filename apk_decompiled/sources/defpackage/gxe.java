package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class gxe {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final w6g a = new w6g(0);
    public final Context b;
    public final gp1 c;
    public final ScheduledThreadPoolExecutor d;
    public final Messenger e;
    public Messenger f;
    public p3k g;

    public gxe(Context context) {
        this.b = context;
        gp1 gp1Var = new gp1();
        gp1Var.F = 0;
        gp1Var.G = context;
        this.c = gp1Var;
        this.e = new Messenger(new hqj(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.r5l a(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gxe.a(android.os.Bundle):r5l");
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                j5h j5hVar = (j5h) this.a.remove(str);
                if (j5hVar != null) {
                    j5hVar.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
