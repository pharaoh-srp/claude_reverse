package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes.dex */
public final class a0g implements SensorEventListener {
    public final hjb a = new hjb(1);
    public SensorManager b;
    public Sensor c;
    public final n2g d;
    public final y3e e;

    public a0g() {
        n2g n2gVarB = o2g.b(1, 5, null);
        this.d = n2gVarB;
        this.e = new y3e(n2gVarB);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        zzf zzfVar;
        sensorEvent.getClass();
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        boolean z = ((double) ((f3 * f3) + ((f2 * f2) + (f * f)))) > 225.0d;
        long j = sensorEvent.timestamp;
        hjb hjbVar = this.a;
        n78 n78Var = (n78) hjbVar.c;
        long j2 = j - 500000000;
        while (true) {
            i = hjbVar.a;
            if (i < 4 || (zzfVar = (zzf) hjbVar.d) == null || j2 - zzfVar.a <= 0) {
                break;
            }
            if (zzfVar.b) {
                hjbVar.b--;
            }
            hjbVar.a = i - 1;
            zzf zzfVar2 = (zzf) zzfVar.c;
            hjbVar.d = zzfVar2;
            if (zzfVar2 == null) {
                hjbVar.e = null;
            }
            zzfVar.c = (zzf) n78Var.F;
            n78Var.F = zzfVar;
        }
        zzf zzfVar3 = (zzf) n78Var.F;
        if (zzfVar3 == null) {
            zzfVar3 = new zzf();
        } else {
            n78Var.F = (zzf) zzfVar3.c;
        }
        zzfVar3.a = j;
        zzfVar3.b = z;
        zzfVar3.c = null;
        zzf zzfVar4 = (zzf) hjbVar.e;
        if (zzfVar4 != null) {
            zzfVar4.c = zzfVar3;
        }
        hjbVar.e = zzfVar3;
        if (((zzf) hjbVar.d) == null) {
            hjbVar.d = zzfVar3;
        }
        int i2 = i + 1;
        hjbVar.a = i2;
        if (z) {
            hjbVar.b++;
        }
        zzf zzfVar5 = (zzf) hjbVar.d;
        if (zzfVar5 != null && j - zzfVar5.a >= 250000000 && hjbVar.b >= (i2 >> 1) + (i2 >> 2)) {
            while (zzfVar5 != null) {
                zzf zzfVar6 = (zzf) zzfVar5.c;
                n78 n78Var2 = (n78) hjbVar.c;
                zzfVar5.c = (zzf) n78Var2.F;
                n78Var2.F = zzfVar5;
                zzfVar5 = zzfVar6;
            }
            hjbVar.d = null;
            hjbVar.e = null;
            hjbVar.a = 0;
            hjbVar.b = 0;
            this.d.f(iei.a);
        }
    }
}
