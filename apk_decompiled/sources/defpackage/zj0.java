package defpackage;

import android.os.SystemClock;
import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchCompleted;
import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchDestination;
import com.anthropic.claude.analytics.events.AppStartEvents$AppLaunchStartType;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import io.sentry.android.core.performance.g;
import io.sentry.android.core.performance.h;
import io.sentry.android.core.performance.i;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zj0 implements fch {
    public final qi3 a;
    public long b = -1;

    public zj0(qi3 qi3Var) {
        this.a = qi3Var;
    }

    @Override // defpackage.fch
    public final void a() {
        AppStartEvents$AppLaunchStartType appStartEvents$AppLaunchStartType;
        h hVarC = h.c();
        hVarC.getClass();
        i iVar = hVarC.H;
        if (!iVar.b()) {
            iVar = null;
        }
        if (iVar == null) {
            iVar = hVarC.I;
            iVar.getClass();
        }
        long j = iVar.G;
        if (j == 0 || j == this.b) {
            return;
        }
        this.b = j;
        g gVar = hVarC.E;
        gVar.getClass();
        int i = ak0.a[gVar.ordinal()];
        if (i == 1) {
            appStartEvents$AppLaunchStartType = AppStartEvents$AppLaunchStartType.COLD;
        } else if (i == 2) {
            appStartEvents$AppLaunchStartType = AppStartEvents$AppLaunchStartType.WARM;
        } else {
            if (i != 3) {
                mr9.b();
                return;
            }
            appStartEvents$AppLaunchStartType = AppStartEvents$AppLaunchStartType.UNSPECIFIED;
        }
        AppStartEvents$AppLaunchStartType appStartEvents$AppLaunchStartType2 = appStartEvents$AppLaunchStartType;
        long jUptimeMillis = SystemClock.uptimeMillis() - j;
        i iVar2 = hVarC.J;
        if (iVar2.H == 0) {
            iVar2 = null;
        }
        this.a.e(new AppStartEvents$AppLaunchCompleted(appStartEvents$AppLaunchStartType2, jUptimeMillis, iVar2 != null ? Long.valueOf(iVar2.a()) : null, AppStartEvents$AppLaunchDestination.UNSPECIFIED, (DrawerEvents$DrawerItem) null, 16, (mq5) null), AppStartEvents$AppLaunchCompleted.Companion.serializer());
    }

    @Override // defpackage.fch
    public final void e(String str, String str2, Map map) {
        str2.getClass();
        map.getClass();
    }

    @Override // defpackage.fch
    public final void h(Throwable th, Throwable th2, String str, ozf ozfVar, Map map) {
        th.getClass();
    }
}
