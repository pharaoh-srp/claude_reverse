package defpackage;

import com.anthropic.claude.api.conway.WebhookRecord;

/* JADX INFO: loaded from: classes3.dex */
public final class vs4 extends xzg implements rz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public /* synthetic */ Object H;
    public /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs4(f8h f8hVar, String str, tp4 tp4Var) {
        super(3, tp4Var);
        this.E = 3;
        this.J = f8hVar;
        this.G = str;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj4 = this.J;
        switch (i) {
            case 0:
                vs4 vs4Var = new vs4((mc) this.I, (v72) obj4, (tp4) obj3, 0);
                vs4Var.G = (String) obj;
                vs4Var.H = (String) obj2;
                return vs4Var.invokeSuspend(ieiVar);
            case 1:
                vs4 vs4Var2 = new vs4((sz7) this.I, (WebhookRecord) obj4, (tp4) obj3, 1);
                vs4Var2.G = (String) obj;
                vs4Var2.H = (String) obj2;
                return vs4Var2.invokeSuspend(ieiVar);
            case 2:
                vs4 vs4Var3 = new vs4((tp4) obj3, (ey) obj4);
                vs4Var3.H = (lp7) obj;
                vs4Var3.I = (Object[]) obj2;
                return vs4Var3.invokeSuspend(ieiVar);
            default:
                vs4 vs4Var4 = new vs4((f8h) obj4, (String) this.G, (tp4) obj3);
                vs4Var4.H = (lp7) obj;
                vs4Var4.I = (cpc) obj2;
                return vs4Var4.invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs4(tp4 tp4Var, ey eyVar) {
        super(3, tp4Var);
        this.E = 2;
        this.J = eyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vs4(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(3, tp4Var);
        this.E = i;
        this.I = obj;
        this.J = obj2;
    }
}
