package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tpc extends xzg implements bz7 {
    public final /* synthetic */ vpc E;
    public final /* synthetic */ wpc F;
    public final /* synthetic */ List G;
    public final /* synthetic */ mpc H;
    public final /* synthetic */ kl7 I;
    public final /* synthetic */ eo7 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpc(vpc vpcVar, wpc wpcVar, List list, mpc mpcVar, kl7 kl7Var, eo7 eo7Var, tp4 tp4Var) {
        super(1, tp4Var);
        this.E = vpcVar;
        this.F = wpcVar;
        this.G = list;
        this.H = mpcVar;
        this.I = kl7Var;
        this.J = eo7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new tpc(this.E, this.F, this.G, this.H, this.I, this.J, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        tpc tpcVar = (tpc) create((tp4) obj);
        iei ieiVar = iei.a;
        tpcVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        wpc wpcVar = this.F;
        vpc vpcVar = this.E;
        vpcVar.b.setValue(wpcVar);
        lsc lscVar = vpcVar.g;
        List list = this.G;
        lscVar.setValue(list);
        cz5 cz5Var = vpcVar.k;
        if (cz5Var != null) {
            vpcVar.h = v40.i(list, vpcVar.e.h(), cz5Var);
        }
        if (!w44.G0(list, vpcVar.f().a())) {
            vpcVar.f().d.setValue(this.H);
        }
        vpcVar.i = this.I;
        vpcVar.j = this.J;
        return iei.a;
    }
}
