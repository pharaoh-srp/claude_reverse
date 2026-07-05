package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class d30 extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d30(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.H;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                return new d30((k30) obj3, (Activity) obj2, (Bundle) obj, tp4Var, 0);
            default:
                return new d30((juc) obj3, (String) obj2, (bz7) obj, tp4Var, 1);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws Exception {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
            case 0:
                ((d30) create(tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
            default:
                return ((d30) create(tp4Var)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Exception {
        int i = this.E;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                gx gxVarE = ((k30) obj2).e();
                gxVarE.b().b(new lxe(1, 9));
                return iei.a;
            default:
                sf5.h0(obj);
                tze tzeVarL0 = ((juc) obj2).b.L0((String) this.G);
                try {
                    Object objInvoke = ((bz7) this.H).invoke(tzeVarL0);
                    csg.o(tzeVarL0, null);
                    return objInvoke;
                } finally {
                }
        }
    }
}
