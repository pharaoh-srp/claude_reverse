package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i1h implements bec, h57 {
    public static final String N = nga.e("SystemFgDispatcher");
    public final bgj E;
    public final ggj F;
    public final Object G = new Object();
    public xfj H;
    public final LinkedHashMap I;
    public final HashMap J;
    public final HashMap K;
    public final wig L;
    public SystemForegroundService M;

    public i1h(Context context) {
        bgj bgjVarD = bgj.d(context);
        this.E = bgjVarD;
        this.F = bgjVarD.d;
        this.H = null;
        this.I = new LinkedHashMap();
        this.K = new HashMap();
        this.J = new HashMap();
        this.L = new wig(bgjVarD.j);
        bgjVarD.f.a(this);
    }

    public static Intent c(Context context, xfj xfjVar, yv7 yv7Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", xfjVar.a);
        intent.putExtra("KEY_GENERATION", xfjVar.b);
        intent.putExtra("KEY_NOTIFICATION_ID", yv7Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", yv7Var.b);
        intent.putExtra("KEY_NOTIFICATION", yv7Var.c);
        return intent;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // defpackage.bec
    public final void a(tgj tgjVar, xl4 xl4Var) {
        if (xl4Var instanceof wl4) {
            nga.c().getClass();
            xfj xfjVarD = amk.d(tgjVar);
            int i = ((wl4) xl4Var).a;
            bgj bgjVar = this.E;
            ggj ggjVar = bgjVar.d;
            ggjVar.a.execute(new log(bgjVar.f, new hlg(xfjVarD), true, i));
        }
    }

    @Override // defpackage.h57
    public final void b(xfj xfjVar, boolean z) {
        Map.Entry entry;
        synchronized (this.G) {
            try {
                lf9 lf9Var = ((tgj) this.J.remove(xfjVar)) != null ? (lf9) this.K.remove(xfjVar) : null;
                if (lf9Var != null) {
                    lf9Var.d(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yv7 yv7Var = (yv7) this.I.remove(xfjVar);
        if (xfjVar.equals(this.H)) {
            if (this.I.size() > 0) {
                Iterator it = this.I.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.H = (xfj) entry.getKey();
                if (this.M != null) {
                    yv7 yv7Var2 = (yv7) entry.getValue();
                    SystemForegroundService systemForegroundService = this.M;
                    int i = yv7Var2.a;
                    int i2 = yv7Var2.b;
                    Notification notification = yv7Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        le0.t(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        le0.s(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.M.H.cancel(yv7Var2.a);
                }
            } else {
                this.H = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.M;
        if (yv7Var == null || systemForegroundService2 == null) {
            return;
        }
        nga ngaVarC = nga.c();
        xfjVar.toString();
        ngaVarC.getClass();
        systemForegroundService2.H.cancel(yv7Var.a);
    }

    public final void e(Intent intent) {
        if (this.M == null) {
            sz6.j("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        xfj xfjVar = new xfj(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        nga.c().getClass();
        if (notification == null) {
            sz6.p("Notification passed in the intent was null.");
            return;
        }
        yv7 yv7Var = new yv7(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.I;
        linkedHashMap.put(xfjVar, yv7Var);
        yv7 yv7Var2 = (yv7) linkedHashMap.get(this.H);
        if (yv7Var2 == null) {
            this.H = xfjVar;
        } else {
            this.M.H.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((yv7) ((Map.Entry) it.next()).getValue()).b;
                }
                yv7Var = new yv7(yv7Var2.a, yv7Var2.c, i);
            } else {
                yv7Var = yv7Var2;
            }
        }
        SystemForegroundService systemForegroundService = this.M;
        int i2 = yv7Var.a;
        int i3 = yv7Var.b;
        Notification notification2 = yv7Var.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            le0.t(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            le0.s(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    public final void f() {
        this.M = null;
        synchronized (this.G) {
            try {
                Iterator it = this.K.values().iterator();
                while (it.hasNext()) {
                    ((lf9) it.next()).d(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xhd xhdVar = this.E.f;
        synchronized (xhdVar.k) {
            xhdVar.j.remove(this);
        }
    }

    public final void g(int i, int i2) {
        nga.c().d(N, "Foreground service timed out, FGS type: " + i2);
        for (Map.Entry entry : this.I.entrySet()) {
            if (((yv7) entry.getValue()).b == i2) {
                xfj xfjVar = (xfj) entry.getKey();
                bgj bgjVar = this.E;
                bgjVar.d.a.execute(new log(bgjVar.f, new hlg(xfjVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.M;
        if (systemForegroundService != null) {
            systemForegroundService.F = true;
            nga.c().getClass();
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i);
        }
    }
}
