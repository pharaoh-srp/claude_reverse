package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public class oe1 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public oe1(qb5 qb5Var) {
        qb5Var.getClass();
        this.b = qb5Var;
    }

    private void b(IBinder iBinder) {
    }

    private void d(Exception exc) {
    }

    private final void e(Exception exc) {
    }

    public void a(IBinder iBinder) {
        st8 st8Var;
        switch (this.a) {
            case 0:
                break;
            default:
                yof yofVar = (yof) this.b;
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
                yofVar.e = poc.b(st8Var).intValue();
                break;
        }
    }

    public void c(Exception exc) {
        int i = this.a;
    }

    public oe1 f(poj pojVar) {
        int i = this.a;
        return this;
    }

    public oe1(yof yofVar, poc pocVar, poc pocVar2) {
        this.b = yofVar;
    }
}
