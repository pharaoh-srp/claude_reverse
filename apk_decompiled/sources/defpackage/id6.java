package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class id6 extends xzg implements rz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id6(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((fcc) obj2).a;
                new id6(i2, (tp4) obj3, 0).invokeSuspend(ieiVar);
                break;
            default:
                ((Number) obj2).floatValue();
                new id6(i2, (tp4) obj3, 1).invokeSuspend(ieiVar);
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
            default:
                sf5.h0(obj);
                break;
        }
        return ieiVar;
    }
}
