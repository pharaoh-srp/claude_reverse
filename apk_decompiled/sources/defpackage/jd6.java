package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jd6 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ad6 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd6(ad6 ad6Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = ad6Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        ad6 ad6Var = this.F;
        switch (i) {
            case 0:
                return new jd6(ad6Var, tp4Var, 0);
            case 1:
                return new jd6(ad6Var, tp4Var, 1);
            case 2:
                return new jd6(ad6Var, tp4Var, 2);
            default:
                return new jd6(ad6Var, tp4Var, 3);
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
                ((jd6) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((jd6) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((jd6) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((jd6) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                sf5.h0(obj);
                break;
            case 1:
                sf5.h0(obj);
                break;
            case 2:
                sf5.h0(obj);
                break;
            default:
                sf5.h0(obj);
                break;
        }
        return ieiVar;
    }
}
