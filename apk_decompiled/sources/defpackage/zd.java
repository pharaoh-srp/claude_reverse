package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zd extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t4g F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd(t4g t4gVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = t4gVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        t4g t4gVar = this.F;
        switch (i) {
            case 0:
                return new zd(t4gVar, tp4Var, 0);
            case 1:
                return new zd(t4gVar, tp4Var, 1);
            case 2:
                return new zd(t4gVar, tp4Var, 2);
            case 3:
                return new zd(t4gVar, tp4Var, 3);
            case 4:
                return new zd(t4gVar, tp4Var, 4);
            case 5:
                return new zd(t4gVar, tp4Var, 5);
            case 6:
                return new zd(t4gVar, tp4Var, 6);
            case 7:
                return new zd(t4gVar, tp4Var, 7);
            case 8:
                return new zd(t4gVar, tp4Var, 8);
            default:
                return new zd(t4gVar, tp4Var, 9);
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
                ((zd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((zd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((zd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((zd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 4:
                ((zd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 5:
                ((zd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 6:
                ((zd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 7:
                ((zd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 8:
                ((zd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((zd) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        t4g t4gVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                t4gVar.c();
                break;
            case 1:
                sf5.h0(obj);
                t4gVar.c();
                break;
            case 2:
                sf5.h0(obj);
                t4gVar.c();
                break;
            case 3:
                sf5.h0(obj);
                t4gVar.c();
                break;
            case 4:
                sf5.h0(obj);
                t4gVar.c();
                break;
            case 5:
                sf5.h0(obj);
                t4gVar.c();
                break;
            case 6:
                sf5.h0(obj);
                t4gVar.a();
                break;
            case 7:
                sf5.h0(obj);
                t4gVar.a();
                break;
            case 8:
                sf5.h0(obj);
                t4gVar.a();
                break;
            default:
                sf5.h0(obj);
                t4gVar.a();
                break;
        }
        return ieiVar;
    }
}
