package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class vgk extends fe1 {
    /* JADX WARN: Illegal instructions before constructor call */
    public vgk(Context context, Looper looper, ce1 ce1Var, de1 de1Var) {
        o2l o2lVarA = o2l.a(context);
        g88 g88Var = g88.b;
        dgj.v(ce1Var);
        dgj.v(de1Var);
        super(context, looper, o2lVarA, g88Var, 93, ce1Var, de1Var, null);
    }

    @Override // defpackage.fe1, defpackage.ge0
    public final int i() {
        return 12451000;
    }

    @Override // defpackage.fe1
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof pfk ? (pfk) iInterfaceQueryLocalInterface : new zfk(iBinder);
    }

    @Override // defpackage.fe1
    public final String u() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.fe1
    public final String v() {
        return "com.google.android.gms.measurement.START";
    }
}
