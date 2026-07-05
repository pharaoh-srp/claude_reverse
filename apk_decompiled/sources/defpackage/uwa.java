package defpackage;

import com.anthropic.claude.mcpapps.b;

/* JADX INFO: loaded from: classes2.dex */
public final class uwa extends xzg implements bz7 {
    public jxb E;
    public b F;
    public String G;
    public int H;
    public final /* synthetic */ fj0 I;
    public final /* synthetic */ String J;
    public final /* synthetic */ b K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwa(fj0 fj0Var, String str, b bVar, tp4 tp4Var) {
        super(1, tp4Var);
        this.I = fj0Var;
        this.J = str;
        this.K = bVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new uwa(this.I, this.J, this.K, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((uwa) create((tp4) obj)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b7, code lost:
    
        if (r14.c(r13) == r5) goto L28;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
