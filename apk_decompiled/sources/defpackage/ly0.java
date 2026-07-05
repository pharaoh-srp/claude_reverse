package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ly0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ jy0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly0(jy0 jy0Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = jy0Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new ly0(this.F, tp4Var, 0);
            default:
                return new ly0(this.F, tp4Var, 1);
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
                ((ly0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((ly0) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        a4a a4aVar = a4a.H;
        a4a a4aVar2 = a4a.G;
        jy0 jy0Var = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                p4a p4aVar = jy0Var.E;
                p4aVar.h(a4aVar2);
                p4aVar.h(a4aVar);
                break;
            default:
                sf5.h0(obj);
                p4a p4aVar2 = jy0Var.E;
                p4aVar2.h(a4aVar2);
                p4aVar2.h(a4aVar);
                break;
        }
        return ieiVar;
    }
}
