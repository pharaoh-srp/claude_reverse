package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class wmf extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmf(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                wmf wmfVar = new wmf((eca) obj2, tp4Var, 0);
                wmfVar.H = obj;
                return wmfVar;
            case 1:
                return new wmf((gx) this.G, (String) this.H, (String) obj2, tp4Var, 1);
            case 2:
                wmf wmfVar2 = new wmf((c45) this.G, (kp7) obj2, tp4Var, 2);
                wmfVar2.H = obj;
                return wmfVar2;
            case 3:
                wmf wmfVar3 = new wmf((vfh) this.G, (mi6) obj2, tp4Var, 3);
                wmfVar3.H = obj;
                return wmfVar3;
            case 4:
                return new wmf((rok) obj2, tp4Var, 4);
            case 5:
                wmf wmfVar4 = new wmf((o7i) obj2, tp4Var, 5);
                wmfVar4.H = obj;
                return wmfVar4;
            case 6:
                return new wmf((bj0) this.G, (bzd) this.H, (q0i) obj2, tp4Var, 6);
            default:
                wmf wmfVar5 = new wmf((bnh) this.G, (Context) obj2, tp4Var, 7);
                wmfVar5.H = obj;
                return wmfVar5;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Exception {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((wmf) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((wmf) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((wmf) create((zhd) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                ((wmf) create((y5d) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45.E;
            case 4:
                return ((wmf) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 5:
                return ((wmf) create((y4i) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 6:
                return ((wmf) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((wmf) create((aid) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x027c, code lost:
    
        if (r0.a(r2, r24) == r4) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x028c, code lost:
    
        if (defpackage.gb9.c0(r2, r1, r24) == r4) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmf(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.I = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmf(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
    }
}
