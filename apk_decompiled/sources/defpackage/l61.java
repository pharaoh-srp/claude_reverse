package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l61 extends xzg implements pz7 {
    public final /* synthetic */ p61 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l61(p61 p61Var, boolean z, boolean z2, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = p61Var;
        this.F = z;
        this.G = z2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new l61(this.E, this.F, this.G, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        l61 l61Var = (l61) create((l45) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        l61Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        this.E.F.a = this.F && !this.G;
        return iei.a;
    }
}
