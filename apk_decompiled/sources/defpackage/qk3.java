package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes.dex */
public final class qk3 implements n4a {
    public final /* synthetic */ b0g a;

    public qk3(r4a r4aVar, b0g b0gVar) {
        this.a = b0gVar;
    }

    @Override // defpackage.n4a
    public final void a() {
        a0g a0gVar = this.a.e;
        Sensor sensor = a0gVar.c;
        if (sensor == null) {
            return;
        }
        hjb hjbVar = a0gVar.a;
        zzf zzfVar = (zzf) hjbVar.d;
        while (zzfVar != null) {
            zzf zzfVar2 = (zzf) zzfVar.c;
            n78 n78Var = (n78) hjbVar.c;
            zzfVar.c = (zzf) n78Var.F;
            n78Var.F = zzfVar;
            zzfVar = zzfVar2;
        }
        hjbVar.d = null;
        hjbVar.e = null;
        hjbVar.a = 0;
        hjbVar.b = 0;
        SensorManager sensorManager = a0gVar.b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(a0gVar, sensor);
        }
        a0gVar.b = null;
        a0gVar.c = null;
    }
}
