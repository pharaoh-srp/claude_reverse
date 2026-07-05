package defpackage;

import com.anthropic.claude.analytics.events.UpdateEvents$RequiredUpdateShown;

/* JADX INFO: loaded from: classes3.dex */
public final class pke extends xzg implements bz7 {
    public final /* synthetic */ qi3 E;
    public final /* synthetic */ boolean F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pke(qi3 qi3Var, boolean z, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = qi3Var;
        this.F = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new pke(this.E, this.F, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        pke pkeVar = (pke) create((tp4) obj);
        iei ieiVar = iei.a;
        pkeVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        this.E.e(new UpdateEvents$RequiredUpdateShown(!this.F), iv1.J(jce.b(UpdateEvents$RequiredUpdateShown.class)));
        return iei.a;
    }
}
