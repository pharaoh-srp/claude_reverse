package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hm extends xzg implements bz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ Object G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hm(Object obj, tp4 tp4Var, int i) {
        super(1, tp4Var);
        this.E = i;
        this.G = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 0:
                return new hm((vm) obj, tp4Var, 0);
            case 1:
                return new hm((an) obj, tp4Var, 1);
            case 2:
                return new hm((uv) obj, tp4Var, 2);
            case 3:
                return new hm((uh5) obj, tp4Var, 3);
            case 4:
                return new hm((mif) obj, tp4Var, 4);
            case 5:
                return new hm((izf) obj, tp4Var, 5);
            case 6:
                return new hm((zhh) obj, tp4Var, 6);
            default:
                return new hm((l2i) obj, tp4Var, 7);
        }
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        tp4 tp4Var = (tp4) obj;
        switch (i) {
        }
        return ((hm) create(tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r10 == r5) goto L32;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
