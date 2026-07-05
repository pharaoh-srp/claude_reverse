package defpackage;

import androidx.work.CoroutineWorker;

/* JADX INFO: loaded from: classes2.dex */
public final class q45 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ CoroutineWorker G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q45(CoroutineWorker coroutineWorker, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = coroutineWorker;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        CoroutineWorker coroutineWorker = this.G;
        switch (i) {
            case 0:
                return new q45(coroutineWorker, tp4Var, 0);
            default:
                return new q45(coroutineWorker, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((q45) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
            default:
                return ((q45) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        switch (this.E) {
            case 0:
                int i = this.F;
                if (i == 0) {
                    sf5.h0(obj);
                    this.F = 1;
                    sz6.j("Not implemented");
                } else {
                    if (i == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                this.F = 1;
                Object objD = this.G.d(this);
                m45 m45Var = m45.E;
                return objD == m45Var ? m45Var : objD;
        }
    }
}
