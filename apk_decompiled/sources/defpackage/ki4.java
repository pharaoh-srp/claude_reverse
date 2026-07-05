package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ki4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ c4a F;
    public final /* synthetic */ ii4 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki4(c4a c4aVar, ii4 ii4Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = c4aVar;
        this.G = ii4Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        ii4 ii4Var = this.G;
        c4a c4aVar = this.F;
        switch (i) {
            case 0:
                return new ki4(c4aVar, ii4Var, tp4Var, 0);
            default:
                return new ki4(c4aVar, ii4Var, tp4Var, 1);
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
                ((ki4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((ki4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        ii4 ii4Var = this.G;
        c4a c4aVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                c4aVar.a(ii4Var);
                break;
            default:
                sf5.h0(obj);
                c4aVar.c(ii4Var);
                break;
        }
        return ieiVar;
    }
}
