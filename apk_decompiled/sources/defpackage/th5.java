package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class th5 extends xzg implements pz7 {
    public Object E;
    public int F;
    public int G;
    public /* synthetic */ boolean H;
    public final /* synthetic */ bi5 I;
    public final /* synthetic */ pz7 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th5(bi5 bi5Var, pz7 pz7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = bi5Var;
        this.J = pz7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        th5 th5Var = new th5(this.I, this.J, tp4Var);
        th5Var.H = ((Boolean) obj).booleanValue();
        return th5Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((th5) create(bool, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i;
        boolean z = this.H;
        int i2 = this.G;
        m45 m45Var = m45.E;
        if (i2 == 0) {
            sf5.h0(obj);
            this.H = z;
            this.G = 1;
            obj = zh4.y(this, new nh5(1, null, this.I));
            if (obj != m45Var) {
            }
            return m45Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.F;
            obj2 = this.E;
            sf5.h0(obj);
            return new qf5(obj2, i, ((Number) obj).intValue());
        }
        sf5.h0(obj);
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Boolean boolValueOf = Boolean.valueOf(z);
        this.E = obj;
        this.H = z;
        this.F = iHashCode;
        this.G = 2;
        Object objInvoke = this.J.invoke(boolValueOf, this);
        if (objInvoke != m45Var) {
            Object obj3 = obj;
            obj = objInvoke;
            obj2 = obj3;
            i = iHashCode;
            return new qf5(obj2, i, ((Number) obj).intValue());
        }
        return m45Var;
    }
}
