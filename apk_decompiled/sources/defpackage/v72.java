package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class v72 {
    public final h86 a;
    public final ul0 b;
    public final w72 c;
    public final nyj d;
    public final dpf e;
    public final el5 f;

    public v72(Context context, h86 h86Var, mn5 mn5Var, ul0 ul0Var) {
        this.a = h86Var;
        this.b = ul0Var;
        w72 w72Var = new w72(context);
        this.c = w72Var;
        this.d = new nyj(context, 9, w72Var);
        dpf dpfVar = new dpf(context, mn5Var, w72Var, new vz8(18), 12);
        this.e = dpfVar;
        this.f = new el5(context, mn5Var, w72Var, dpfVar);
    }
}
