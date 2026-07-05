package defpackage;

import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class ohj extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ qhj G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ohj(qhj qhjVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = qhjVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        qhj qhjVar = this.G;
        switch (i) {
            case 0:
                return new ohj(qhjVar, tp4Var, 0);
            default:
                return new ohj(qhjVar, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((ohj) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object khjVar;
        int i = this.E;
        m45 m45Var = m45.E;
        qhj qhjVar = this.G;
        tp4 tp4Var = null;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    Object objA = qhj.a(qhjVar, this);
                    return objA == m45Var ? m45Var : objA;
                }
                if (i2 == 1) {
                    sf5.h0(obj);
                    return obj;
                }
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.F;
                try {
                    if (i3 == 0) {
                        sf5.h0(obj);
                        mf9 mf9Var = qhjVar.m;
                        ohj ohjVar = new ohj(qhjVar, tp4Var, 0);
                        this.F = 1;
                        obj = gb9.c0(mf9Var, ohjVar, this);
                        if (obj == m45Var) {
                            return m45Var;
                        }
                    } else {
                        if (i3 != 1) {
                            sz6.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        sf5.h0(obj);
                    }
                    khjVar = (nhj) obj;
                    break;
                } catch (WorkerStoppedException e) {
                    khjVar = new mhj(e.E);
                } catch (CancellationException unused) {
                    khjVar = new khj();
                } catch (Throwable th) {
                    nga.c().b(rhj.a, "Unexpected error in WorkerWrapper", th);
                    khjVar = new khj();
                }
                Object objO = qhjVar.h.o(new pza(21, new mj5(khjVar, 3, qhjVar)));
                objO.getClass();
                return objO;
        }
    }
}
