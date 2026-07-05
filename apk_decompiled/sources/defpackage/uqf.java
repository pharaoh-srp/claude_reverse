package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uqf extends xzg implements pz7 {
    public /* synthetic */ long E;

    public uqf() {
        super(2, null);
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        uqf uqfVar = new uqf(2, tp4Var);
        uqfVar.E = ((Number) obj).longValue();
        return uqfVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((uqf) create(Long.valueOf(((Number) obj).longValue()), (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        long j = this.E;
        sf5.h0(obj);
        return new qqf(j);
    }
}
