package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class l15 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ h6j F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l15(h6j h6jVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = h6jVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        h6j h6jVar = this.F;
        switch (i) {
            case 0:
                return new l15(h6jVar, tp4Var, 0);
            default:
                return new l15(h6jVar, tp4Var, 1);
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
                ((l15) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((l15) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        h6j h6jVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                h6jVar.a();
                break;
            default:
                sf5.h0(obj);
                h6jVar.a();
                break;
        }
        return ieiVar;
    }
}
