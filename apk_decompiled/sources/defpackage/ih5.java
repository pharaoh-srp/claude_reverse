package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ih5 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ih5(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                ih5 ih5Var = new ih5(2, tp4Var, 0);
                ih5Var.F = obj;
                return ih5Var;
            case 1:
                ih5 ih5Var2 = new ih5(2, tp4Var, 1);
                ih5Var2.F = obj;
                return ih5Var2;
            case 2:
                ih5 ih5Var3 = new ih5(2, tp4Var, 2);
                ih5Var3.F = obj;
                return ih5Var3;
            default:
                ih5 ih5Var4 = new ih5(2, tp4Var, 3);
                ih5Var4.F = obj;
                return ih5Var4;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((ih5) create((ulg) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((ih5) create((l78) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((ih5) create((u7e) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((ih5) create((t3g) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        switch (this.E) {
            case 0:
                ulg ulgVar = (ulg) this.F;
                sf5.h0(obj);
                return Boolean.valueOf(!(ulgVar instanceof cl7));
            case 1:
                l78 l78Var = (l78) this.F;
                sf5.h0(obj);
                return Boolean.valueOf((l78Var instanceof k78) || (l78Var instanceof h78));
            case 2:
                sf5.h0(obj);
                return Boolean.valueOf(((u7e) this.F) == u7e.E);
            default:
                t3g t3gVar = (t3g) this.F;
                sf5.h0(obj);
                return Boolean.valueOf(t3gVar != t3g.E);
        }
    }
}
