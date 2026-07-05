package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z8f extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ aae F;
    public final /* synthetic */ float G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8f(aae aaeVar, float f, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = aaeVar;
        this.G = f;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        z8f z8fVar = new z8f(this.F, this.G, tp4Var);
        z8fVar.E = obj;
        return z8fVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        z8f z8fVar = (z8f) create((h9f) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        z8fVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        sf5.h0(obj);
        this.F.E = ((h9f) this.E).b(this.G);
        return iei.a;
    }
}
