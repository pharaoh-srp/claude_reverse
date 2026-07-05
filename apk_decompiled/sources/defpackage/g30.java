package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class g30 extends xzg implements bz7 {
    public final /* synthetic */ k30 E;
    public final /* synthetic */ Activity F;
    public final /* synthetic */ Bundle G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g30(k30 k30Var, Activity activity, Bundle bundle, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = k30Var;
        this.F = activity;
        this.G = bundle;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new g30(this.E, this.F, this.G, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        g30 g30Var = (g30) create((tp4) obj);
        iei ieiVar = iei.a;
        g30Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        gx gxVarE = this.E.e();
        gxVarE.b().b(new pgg(1, 17));
        return iei.a;
    }
}
