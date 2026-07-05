package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cv2 extends gre implements pz7 {
    public final /* synthetic */ int F;
    public int G;
    public int H;
    public /* synthetic */ Object I;
    public Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv2(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.F = i;
        this.K = obj;
        this.L = obj2;
        this.M = obj3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.F;
        Object obj2 = this.M;
        Object obj3 = this.L;
        Object obj4 = this.K;
        switch (i) {
            case 0:
                cv2 cv2Var = new cv2((on8) obj4, (pn8) obj3, (nwb) obj2, tp4Var, 0);
                cv2Var.I = obj;
                return cv2Var;
            default:
                cv2 cv2Var2 = new cv2((z9e) obj4, (dae) obj3, (dae) obj2, tp4Var, 1);
                cv2Var2.I = obj;
                return cv2Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        iei ieiVar = iei.a;
        d0h d0hVar = (d0h) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((cv2) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x026f, code lost:
    
        if (r3 == r5) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0301, code lost:
    
        if (r4 != r5) goto L148;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x036f A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x0301 -> B:148:0x0306). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e4 -> B:41:0x00e9). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
