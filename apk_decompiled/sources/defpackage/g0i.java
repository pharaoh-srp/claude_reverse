package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class g0i extends xzg implements rz7 {
    public /* synthetic */ Throwable E;
    public final /* synthetic */ q0i F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0i(q0i q0iVar, tp4 tp4Var) {
        super(3, tp4Var);
        this.F = q0iVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        g0i g0iVar = new g0i(this.F, (tp4) obj3);
        g0iVar.E = (Throwable) obj2;
        iei ieiVar = iei.a;
        g0iVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.E;
        sf5.h0(obj);
        if (!(th instanceof CancellationException)) {
            this.F.p.n(false);
        }
        return iei.a;
    }
}
