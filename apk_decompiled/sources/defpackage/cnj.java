package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class cnj extends pnj {
    public final noj b;

    public cnj(noj nojVar) {
        super(1);
        this.b = nojVar;
    }

    @Override // defpackage.pnj
    public final void a(Status status) {
        try {
            this.b.i(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.pnj
    public final void b(Exception exc) {
        try {
            this.b.i(new Status(10, ij0.C(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.pnj
    public final void c(kmj kmjVar) throws DeadObjectException {
        try {
            noj nojVar = this.b;
            ge0 ge0Var = kmjVar.j;
            nojVar.getClass();
            try {
                nojVar.h(ge0Var);
            } catch (DeadObjectException e) {
                nojVar.i(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                nojVar.i(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }

    @Override // defpackage.pnj
    public final void d(cbf cbfVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) cbfVar.F;
        noj nojVar = this.b;
        map.put(nojVar, boolValueOf);
        nojVar.a(new fmj(cbfVar, nojVar));
    }
}
