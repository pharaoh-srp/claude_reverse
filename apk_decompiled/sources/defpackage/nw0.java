package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nw0 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ boolean F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw0(Object obj, boolean z, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.F = z;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return new nw0(this.F, (bt7) obj2, tp4Var, 0);
            case 1:
                return new nw0(this.F, (p61) obj2, tp4Var, 1);
            case 2:
                nw0 nw0Var = new nw0((l2i) obj2, tp4Var);
                nw0Var.F = ((Boolean) obj).booleanValue();
                return nw0Var;
            case 3:
                return new nw0((mj1) obj2, this.F, tp4Var, 3);
            case 4:
                return new nw0(this.F, (t4g) obj2, tp4Var, 4);
            case 5:
                return new nw0(this.F, (nwb) obj2, tp4Var, 5);
            case 6:
                return new nw0((rs4) obj2, this.F, tp4Var, 6);
            case 7:
                return new nw0((bz7) obj2, this.F, tp4Var, 7);
            case 8:
                return new nw0(this.F, (i2d) obj2, tp4Var, 8);
            case 9:
                return new nw0(this.F, (meg) obj2, tp4Var, 9);
            default:
                return new nw0((j8i) obj2, this.F, tp4Var, 10);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((nw0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 1:
                ((nw0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((nw0) create(bool, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 3:
                ((nw0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 4:
                ((nw0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 5:
                ((nw0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 6:
                return ((nw0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                ((nw0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 8:
                ((nw0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 9:
                ((nw0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            default:
                return ((nw0) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03d3  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw0(l2i l2iVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.G = l2iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw0(boolean z, Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = z;
        this.G = obj;
    }
}
