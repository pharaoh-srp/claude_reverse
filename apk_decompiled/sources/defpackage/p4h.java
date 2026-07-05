package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p4h extends gre implements pz7 {
    public final /* synthetic */ int F;
    public long G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4h(long j, cae caeVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = 2;
        this.G = j;
        this.J = caeVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.F;
        Object obj2 = this.J;
        switch (i) {
            case 0:
                p4h p4hVar = new p4h((z7d) obj2, tp4Var, 0);
                p4hVar.I = obj;
                return p4hVar;
            case 1:
                p4h p4hVar2 = new p4h((z7d) obj2, tp4Var, 1);
                p4hVar2.I = obj;
                return p4hVar2;
            default:
                p4h p4hVar3 = new p4h(this.G, (cae) obj2, tp4Var);
                p4hVar3.I = obj;
                return p4hVar3;
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
        return ((p4h) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a8 -> B:32:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e8 -> B:44:0x00ec). Please report as a decompilation issue!!! */
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
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p4h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4h(z7d z7dVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.F = i;
        this.J = z7dVar;
    }
}
