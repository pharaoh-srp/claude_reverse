package defpackage;

import android.content.Context;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes.dex */
public final class b0g {
    public final rc8 a;
    public final pkc b;
    public final x89 c;
    public final SensorManager d;
    public final a0g e = new a0g();

    public b0g(Context context, rc8 rc8Var, pkc pkcVar, x89 x89Var) {
        this.a = rc8Var;
        this.b = pkcVar;
        this.c = x89Var;
        this.d = (SensorManager) context.getSystemService(SensorManager.class);
    }
}
