package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class hh5 extends xzg implements bz7 {
    public hxb E;
    public z9e F;
    public dae G;
    public Object H;
    public Object I;
    public Iterator J;
    public int K;
    public int L;
    public final /* synthetic */ bi5 M;
    public final /* synthetic */ eh5 N;
    public final /* synthetic */ el5 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh5(bi5 bi5Var, eh5 eh5Var, el5 el5Var, tp4 tp4Var) {
        super(1, tp4Var);
        this.M = bi5Var;
        this.N = eh5Var;
        this.O = el5Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new hh5(this.M, this.N, this.O, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((hh5) create((tp4) obj)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d1, code lost:
    
        if (r3.invoke(r12, r17) == r10) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d1 -> B:26:0x00d4). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hh5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
