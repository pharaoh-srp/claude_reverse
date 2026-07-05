package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pge extends xzg implements pz7 {
    public final /* synthetic */ boolean E;
    public final /* synthetic */ che F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pge(boolean z, che cheVar, Object obj, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = z;
        this.F = cheVar;
        this.G = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new pge(this.E, this.F, this.G, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        pge pgeVar = (pge) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        pgeVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        Object obj2 = this.G;
        boolean z = this.E;
        che cheVar = this.F;
        if (z) {
            cheVar.q.add(obj2);
        } else {
            cheVar.q.remove(obj2);
        }
        return iei.a;
    }
}
