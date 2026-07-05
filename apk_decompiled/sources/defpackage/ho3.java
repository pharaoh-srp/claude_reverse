package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ho3 extends xzg implements rz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho3() {
        super(3, null);
        this.E = 2;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 3;
        switch (i) {
            case 0:
                long j = ((fcc) obj2).a;
                new ho3(i2, (tp4) obj3, 0).invokeSuspend(ieiVar);
                return ieiVar;
            case 1:
                long j2 = ((fcc) obj2).a;
                new ho3(i2, (tp4) obj3, 1).invokeSuspend(ieiVar);
                return ieiVar;
            case 2:
                return new ho3(i2, (tp4) obj3, 2).invokeSuspend(ieiVar);
            case 3:
                return new ho3(i2, (tp4) obj3, i2).invokeSuspend(ieiVar);
            case 4:
                ((Number) obj).intValue();
                new ho3(i2, (tp4) obj3, 4).invokeSuspend(ieiVar);
                return Boolean.FALSE;
            default:
                long j3 = ((fcc) obj2).a;
                new ho3(i2, (tp4) obj3, 5).invokeSuspend(ieiVar);
                return ieiVar;
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                sf5.h0(obj);
                return ieiVar;
            case 1:
                sf5.h0(obj);
                return ieiVar;
            case 2:
                sf5.h0(obj);
                i15 i15Var = i15.d;
                return new i15(null, "calendar not available", 2, false);
            case 3:
                sf5.h0(obj);
                i15 i15Var2 = i15.d;
                return new i15(null, "client backgrounded; tool unavailable", 2, false);
            case 4:
                sf5.h0(obj);
                return Boolean.FALSE;
            default:
                sf5.h0(obj);
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho3(int i, tp4 tp4Var, int i2) {
        super(i, tp4Var);
        this.E = i2;
    }
}
