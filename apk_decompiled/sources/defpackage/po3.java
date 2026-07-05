package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class po3 extends oe1 {
    public final /* synthetic */ wee c;
    public final /* synthetic */ exf d;
    public final /* synthetic */ yof e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po3(yof yofVar, qb5 qb5Var, wee weeVar, exf exfVar) {
        super(qb5Var);
        this.e = yofVar;
        this.c = weeVar;
        this.d = exfVar;
    }

    @Override // defpackage.oe1
    public final void a(IBinder iBinder) {
        st8 st8Var;
        this.e.c.getClass();
        int i = rt8.i;
        if (iBinder == null) {
            st8Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.health.platform.client.service.IHealthDataService");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof st8)) {
                qt8 qt8Var = new qt8();
                qt8Var.i = iBinder;
                st8Var = qt8Var;
            } else {
                st8Var = (st8) iInterfaceQueryLocalInterface;
            }
        }
        this.c.h(st8Var, this.d);
    }

    @Override // defpackage.oe1
    public final void c(Exception exc) {
        this.d.m(exc);
    }

    @Override // defpackage.oe1
    public final oe1 f(poj pojVar) {
        exf exfVar = this.d;
        synchronized (((HashSet) pojVar.E)) {
            ((HashSet) pojVar.E).add(exfVar);
            exfVar.a(new fd(pojVar, 27, exfVar), y46.E);
        }
        return this;
    }
}
