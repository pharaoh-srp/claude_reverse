package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class z10 extends gre implements pz7 {
    public final /* synthetic */ int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z10(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.F = i;
        this.I = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.F;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                z10 z10Var = new z10((b20) obj2, tp4Var, 0);
                z10Var.H = obj;
                return z10Var;
            case 1:
                z10 z10Var2 = new z10((u7d) obj2, tp4Var, 1);
                z10Var2.H = obj;
                return z10Var2;
            case 2:
                z10 z10Var3 = new z10((zy7) obj2, tp4Var, 2);
                z10Var3.H = obj;
                return z10Var3;
            default:
                z10 z10Var4 = new z10((sih) obj2, tp4Var, 3);
                z10Var4.H = obj;
                return z10Var4;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.F;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        d0h d0hVar = (d0h) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ((z10) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
                break;
            default:
                ((z10) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return m45Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0034 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0063 -> B:23:0x0066). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00fe -> B:57:0x0101). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
