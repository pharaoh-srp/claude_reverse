package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ug1 extends gre implements pz7 {
    public final /* synthetic */ int F;
    public int G;
    public /* synthetic */ Object H;
    public Object I;
    public Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug1(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.F = i;
        this.I = obj;
        this.J = obj2;
        this.K = obj3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.F;
        Object obj2 = this.K;
        switch (i) {
            case 0:
                ug1 ug1Var = new ug1((l45) this.J, (l2i) obj2, tp4Var, 0);
                ug1Var.H = obj;
                return ug1Var;
            case 1:
                ug1 ug1Var2 = new ug1((ldd) this.I, (wvc) this.J, (dae) obj2, tp4Var, 1);
                ug1Var2.H = obj;
                return ug1Var2;
            case 2:
                ug1 ug1Var3 = new ug1((koc) obj2, tp4Var, 2);
                ug1Var3.H = obj;
                return ug1Var3;
            case 3:
                ug1 ug1Var4 = new ug1((dui) this.I, (pz7) this.J, (bz7) obj2, tp4Var, 3);
                ug1Var4.H = obj;
                return ug1Var4;
            case 4:
                ug1 ug1Var5 = new ug1((z5l) this.J, (oih) obj2, tp4Var, 4);
                ug1Var5.H = obj;
                return ug1Var5;
            case 5:
                ug1 ug1Var6 = new ug1((s20) this.I, (dsb) this.J, (zeh) obj2, tp4Var, 5);
                ug1Var6.H = obj;
                return ug1Var6;
            default:
                ug1 ug1Var7 = new ug1((sug) obj2, tp4Var, 6);
                ug1Var7.H = obj;
                return ug1Var7;
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
                ((ug1) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((ug1) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ((ug1) create(d0hVar, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:320:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:396:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0246 -> B:138:0x024a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:224:0x03ec -> B:226:0x03f0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:243:0x0443 -> B:245:0x0446). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:280:0x0554 -> B:282:0x0558). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:316:0x063a -> B:318:0x063d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d3 -> B:38:0x00d7). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug1(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.F = i;
        this.J = obj;
        this.K = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug1(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.F = i;
        this.K = obj;
    }
}
