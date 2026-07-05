package defpackage;

import com.anthropic.claude.api.common.ConsistencyLevel;

/* JADX INFO: loaded from: classes.dex */
public final class q60 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public /* synthetic */ Object G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;
    public Object L;
    public Object M;
    public Object N;
    public Object O;
    public final /* synthetic */ Object P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(jwb jwbVar, i5i i5iVar, akh akhVar, eb1 eb1Var, y5d y5dVar, xy8 xy8Var, mi6 mi6Var, bz7 bz7Var, zy7 zy7Var, ovi oviVar, bz7 bz7Var2, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = jwbVar;
        this.I = i5iVar;
        this.J = akhVar;
        this.K = eb1Var;
        this.L = y5dVar;
        this.M = xy8Var;
        this.N = mi6Var;
        this.O = bz7Var;
        this.Q = zy7Var;
        this.R = oviVar;
        this.P = bz7Var2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.R;
        Object obj3 = this.Q;
        Object obj4 = this.P;
        switch (i) {
            case 0:
                q60 q60Var = new q60((jwb) this.H, (i5i) this.I, (akh) this.J, (eb1) this.K, (y5d) this.L, (xy8) this.M, (mi6) this.N, (bz7) this.O, (zy7) obj3, (ovi) obj2, (bz7) obj4, tp4Var);
                q60Var.G = obj;
                return q60Var;
            default:
                q60 q60Var2 = new q60((vd3) obj4, (z9e) obj3, (ConsistencyLevel) obj2, tp4Var);
                q60Var2.G = obj;
                return q60Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((q60) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return m45.E;
            default:
                return ((q60) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01db  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q60.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(vd3 vd3Var, z9e z9eVar, ConsistencyLevel consistencyLevel, tp4 tp4Var) {
        super(2, tp4Var);
        this.P = vd3Var;
        this.Q = z9eVar;
        this.R = consistencyLevel;
    }
}
