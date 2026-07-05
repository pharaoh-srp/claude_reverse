package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nd2 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public int G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;
    public /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd2(xm8 xm8Var, String str, om8 om8Var, String str2, int i, nwb nwbVar, nwb nwbVar2, tp4 tp4Var) {
        super(2, tp4Var);
        this.J = xm8Var;
        this.K = str;
        this.L = om8Var;
        this.M = str2;
        this.G = i;
        this.N = nwbVar;
        this.O = nwbVar2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                nd2 nd2Var = new nd2((od2) this.M, (List) this.N, (uub) this.O, tp4Var);
                nd2Var.L = obj;
                return nd2Var;
            default:
                return new nd2((xm8) this.J, (String) this.K, (om8) this.L, (String) this.M, this.G, (nwb) this.N, (nwb) this.O, tp4Var);
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
        return ((nd2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ac, code lost:
    
        if (r0 == r7) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10, types: [c45, o45] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r17v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r5v14, types: [hxb] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [hxb] */
    /* JADX WARN: Type inference failed for: r5v9, types: [hxb] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd2(od2 od2Var, List list, uub uubVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.M = od2Var;
        this.N = list;
        this.O = uubVar;
    }
}
