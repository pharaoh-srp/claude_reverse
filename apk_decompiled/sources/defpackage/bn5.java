package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bn5 extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn5(x0a x0aVar, int i, ps7 ps7Var, int i2, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = x0aVar;
        this.H = i;
        this.J = ps7Var;
        this.I = i2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.G;
        switch (i) {
            case 0:
                return new bn5((x0a) obj2, this.H, (ps7) this.J, this.I, tp4Var);
            case 1:
                bn5 bn5Var = new bn5(this.H, this.I, tp4Var, (x0a) obj2);
                bn5Var.J = obj;
                return bn5Var;
            default:
                return new bn5((lf9) obj2, this.H, this.I, (uma) this.J, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((bn5) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((bn5) create((h9f) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((bn5) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Path cross not found for [B:12:0x002d, B:14:0x0036], limit reached: 52 */
    /* JADX WARN: Path cross not found for [B:14:0x0036, B:12:0x002d], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn5(lf9 lf9Var, int i, int i2, uma umaVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = lf9Var;
        this.H = i;
        this.I = i2;
        this.J = umaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn5(int i, int i2, tp4 tp4Var, x0a x0aVar) {
        super(2, tp4Var);
        this.G = x0aVar;
        this.H = i;
        this.I = i2;
    }
}
