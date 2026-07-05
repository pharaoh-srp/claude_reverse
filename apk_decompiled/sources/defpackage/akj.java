package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class akj extends gre implements pz7 {
    public float F;
    public float G;
    public int H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ lpa K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akj(lpa lpaVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.K = lpaVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        akj akjVar = new akj(this.K, tp4Var);
        akjVar.J = obj;
        return akjVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((akj) create((d0h) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r10 == r7) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Path cross not found for [B:22:0x0079, B:21:0x0077], limit reached: 71 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0060 -> B:17:0x0063). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akj.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
