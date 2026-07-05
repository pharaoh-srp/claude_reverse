package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gsb extends xzg implements pz7 {
    public z9e E;
    public z9e F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ aae J;
    public final /* synthetic */ dae K;
    public final /* synthetic */ dae L;
    public final /* synthetic */ float M;
    public final /* synthetic */ isb N;
    public final /* synthetic */ float O;
    public final /* synthetic */ raf P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsb(aae aaeVar, dae daeVar, dae daeVar2, float f, isb isbVar, float f2, raf rafVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = aaeVar;
        this.K = daeVar;
        this.L = daeVar2;
        this.M = f;
        this.N = isbVar;
        this.O = f2;
        this.P = rafVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        gsb gsbVar = new gsb(this.J, this.K, this.L, this.M, this.N, this.O, this.P, tp4Var);
        gsbVar.I = obj;
        return gsbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((gsb) create((paf) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c4 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x017e -> B:36:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0191 -> B:13:0x0074). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
