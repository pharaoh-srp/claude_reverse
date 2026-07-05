package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n5h implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ n5h(Object obj, Object obj2, pz7 pz7Var, Object obj3, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.F = pz7Var;
        this.I = obj3;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.E) {
            case 0:
                l45 l45Var = (l45) this.G;
                nwb nwbVar = (nwb) this.H;
                pz7 pz7Var = (pz7) this.F;
                nwb nwbVar2 = (nwb) this.I;
                iei ieiVar = iei.a;
                if (!((Boolean) nwbVar.getValue()).booleanValue()) {
                    nwbVar.setValue(Boolean.TRUE);
                    gb9.D(l45Var, null, null, new v2h(pz7Var, nwbVar2, nwbVar, null, 2), 3);
                }
                return ieiVar;
            case 1:
                zy7 zy7Var = (zy7) this.G;
                w7 w7Var = (w7) this.H;
                pz7 pz7Var2 = (pz7) this.F;
                zy7 zy7Var2 = (zy7) this.I;
                zy7Var.a();
                nif nifVar = new nif(pz7Var2, 16, zy7Var2);
                w7Var.getClass();
                List list = xah.a;
                xah.e(6, "Requesting step-up reauth overlay", null, null);
                w7Var.b = nifVar;
                w7Var.a.r(s7.a);
                return iei.a;
            case 2:
                zy7 zy7Var3 = (zy7) this.G;
                Object obj = this.H;
                Object obj2 = this.I;
                bz7 bz7Var = (bz7) this.F;
                zy7Var3.a();
                if (!x44.r(obj, obj2)) {
                    bz7Var.invoke(obj);
                }
                return iei.a;
            default:
                wfj wfjVar = (wfj) this.G;
                UUID uuid = (UUID) this.H;
                yv7 yv7Var = (yv7) this.I;
                Context context = (Context) this.F;
                String string = uuid.toString();
                tgj tgjVarD = wfjVar.c.d(string);
                if (tgjVarD == null || tgjVarD.b.a()) {
                    sz6.j("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    xhd xhdVar = wfjVar.b;
                    synchronized (xhdVar.k) {
                        try {
                            nga.c().d(xhd.l, "Moving WorkSpec (" + string + ") to the foreground");
                            qhj qhjVar = (qhj) xhdVar.g.remove(string);
                            if (qhjVar != null) {
                                if (xhdVar.a == null) {
                                    PowerManager.WakeLock wakeLockA = c6j.a(xhdVar.b);
                                    xhdVar.a = wakeLockA;
                                    wakeLockA.acquire();
                                }
                                xhdVar.f.put(string, qhjVar);
                                xhdVar.b.startForegroundService(i1h.c(xhdVar.b, amk.d(qhjVar.a), yv7Var));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    xfj xfjVarD = amk.d(tgjVarD);
                    String str = i1h.N;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", yv7Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", yv7Var.b);
                    intent.putExtra("KEY_NOTIFICATION", yv7Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", xfjVarD.a);
                    intent.putExtra("KEY_GENERATION", xfjVarD.b);
                    context.startService(intent);
                }
                return null;
        }
    }

    public /* synthetic */ n5h(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.F = obj4;
    }
}
