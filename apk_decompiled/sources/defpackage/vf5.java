package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class vf5 extends xzg implements bz7 {
    public int E;

    public vf5() {
        super(1, null);
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new vf5(1, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        vf5 vf5Var = (vf5) create((tp4) obj);
        iei ieiVar = iei.a;
        vf5Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            this.E = 1;
            throw null;
        }
        if (i == 1) {
            sf5.h0(obj);
            return iei.a;
        }
        sz6.j("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
