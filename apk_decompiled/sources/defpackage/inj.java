package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class inj extends omj {
    public final w19 b;
    public final j5h c;
    public final lja d;

    public inj(int i, w19 w19Var, j5h j5hVar, lja ljaVar) {
        super(i);
        this.c = j5hVar;
        this.b = w19Var;
        this.d = ljaVar;
        if (i == 2 && w19Var.a) {
            sz6.p("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.pnj
    public final void a(Status status) {
        this.d.getClass();
        this.c.c(zh4.r(status));
    }

    @Override // defpackage.pnj
    public final void b(Exception exc) {
        this.c.c(exc);
    }

    @Override // defpackage.pnj
    public final void c(kmj kmjVar) throws DeadObjectException {
        j5h j5hVar = this.c;
        try {
            w19 w19Var = this.b;
            ((see) ((w19) w19Var.d).c).accept(kmjVar.j, j5hVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(pnj.e(e2));
        } catch (RuntimeException e3) {
            j5hVar.c(e3);
        }
    }

    @Override // defpackage.pnj
    public final void d(cbf cbfVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) cbfVar.G;
        j5h j5hVar = this.c;
        map.put(j5hVar, boolValueOf);
        j5hVar.a.h(new dke(cbfVar, j5hVar, false));
    }

    @Override // defpackage.omj
    public final boolean f(kmj kmjVar) {
        return this.b.a;
    }

    @Override // defpackage.omj
    public final jf7[] g(kmj kmjVar) {
        return (jf7[]) this.b.c;
    }
}
