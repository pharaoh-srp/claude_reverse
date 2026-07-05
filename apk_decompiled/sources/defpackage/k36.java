package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k36 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public nwb F;
    public int G;
    public final /* synthetic */ xm8 H;
    public final /* synthetic */ List I;
    public final /* synthetic */ String J;
    public final /* synthetic */ om8 K;
    public final /* synthetic */ nwb L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k36(xm8 xm8Var, List list, String str, om8 om8Var, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.H = xm8Var;
        this.I = list;
        this.J = str;
        this.K = om8Var;
        this.L = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new k36(this.I, this.H, this.J, this.K, this.L, tp4Var);
            default:
                return new k36(this.H, this.I, this.J, this.K, this.L, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((k36) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r0 == r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        if (r0 == r6) goto L39;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k36.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k36(List list, xm8 xm8Var, String str, om8 om8Var, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = list;
        this.H = xm8Var;
        this.J = str;
        this.K = om8Var;
        this.L = nwbVar;
    }
}
