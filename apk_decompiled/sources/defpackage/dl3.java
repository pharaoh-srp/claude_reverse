package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.anthropic.claude.analytics.events.AppStartEvents$BaselineProfileStatus;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class dl3 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ el3 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dl3(el3 el3Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = el3Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        el3 el3Var = this.F;
        switch (i) {
            case 0:
                return new dl3(el3Var, tp4Var, 0);
            case 1:
                return new dl3(el3Var, tp4Var, 1);
            default:
                return new dl3(el3Var, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((dl3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((dl3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((dl3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        el3 el3Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                yid yidVar = (yid) zid.a.get();
                el3Var.h.e(new AppStartEvents$BaselineProfileStatus(yidVar.a, yidVar.b, yidVar.c), AppStartEvents$BaselineProfileStatus.Companion.serializer());
                break;
            case 1:
                sf5.h0(obj);
                el3Var.d.a.getValue();
                break;
            default:
                sf5.h0(obj);
                Context context = el3Var.a;
                bgj bgjVarD = bgj.d(context);
                bgjVarD.getClass();
                bgjVarD.a("orbit_widget_refresh_periodic");
                bgj bgjVarD2 = bgj.d(context);
                bgjVarD2.getClass();
                bgjVarD2.a("orbit_widget_refresh_once");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 2839, new Intent("com.anthropic.claude.widget.orbit.ACTION_ROTATE").setComponent(new ComponentName(context.getPackageName(), "com.anthropic.claude.widget.orbit.OrbitWidgetRotationReceiver")), 603979776);
                if (broadcast != null) {
                    AlarmManager alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
                    if (alarmManager != null) {
                        alarmManager.cancel(broadcast);
                    }
                    broadcast.cancel();
                }
                File filesDir = context.getFilesDir();
                filesDir.getClass();
                nk7.q0(filesDir, "datastores/orbit_widget_state.json").delete();
                break;
        }
        return ieiVar;
    }
}
