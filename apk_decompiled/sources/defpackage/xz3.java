package defpackage;

import com.anthropic.claude.code.remote.c;

/* JADX INFO: loaded from: classes2.dex */
public final class xz3 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ c G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xz3(c cVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = cVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        c cVar = this.G;
        switch (i) {
            case 0:
                return new xz3(cVar, tp4Var, 0);
            case 1:
                return new xz3(cVar, tp4Var, 1);
            case 2:
                return new xz3(cVar, tp4Var, 2);
            case 3:
                return new xz3(cVar, tp4Var, 3);
            case 4:
                return new xz3(cVar, tp4Var, 4);
            case 5:
                return new xz3(cVar, tp4Var, 5);
            case 6:
                return new xz3(cVar, tp4Var, 6);
            case 7:
                return new xz3(cVar, tp4Var, 7);
            case 8:
                return new xz3(cVar, tp4Var, 8);
            default:
                return new xz3(cVar, tp4Var, 9);
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
        return ((xz3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        if (r0.j(r12) == r7) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
