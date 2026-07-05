package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class em1 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ tn1 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em1(tn1 tn1Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = tn1Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        tn1 tn1Var = this.G;
        switch (i) {
            case 0:
                return new em1(tn1Var, tp4Var, 0);
            case 1:
                return new em1(tn1Var, tp4Var, 1);
            case 2:
                return new em1(tn1Var, tp4Var, 2);
            case 3:
                return new em1(tn1Var, tp4Var, 3);
            case 4:
                return new em1(tn1Var, tp4Var, 4);
            case 5:
                return new em1(tn1Var, tp4Var, 5);
            case 6:
                return new em1(tn1Var, tp4Var, 6);
            case 7:
                return new em1(tn1Var, tp4Var, 7);
            case 8:
                return new em1(tn1Var, tp4Var, 8);
            case 9:
                return new em1(tn1Var, tp4Var, 9);
            case 10:
                return new em1(tn1Var, tp4Var, 10);
            case 11:
                return new em1(tn1Var, tp4Var, 11);
            case 12:
                return new em1(tn1Var, tp4Var, 12);
            case 13:
                return new em1(tn1Var, tp4Var, 13);
            case 14:
                return new em1(tn1Var, tp4Var, 14);
            default:
                return new em1(tn1Var, tp4Var, 15);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 1:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 2:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 3:
                ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return m45Var;
            case 4:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 5:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 6:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 7:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 8:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 9:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 10:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 11:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 12:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 13:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            case 14:
                ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return m45Var;
            default:
                return ((em1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x034c, code lost:
    
        if (r0.F(r11) == r3) goto L190;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.em1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
