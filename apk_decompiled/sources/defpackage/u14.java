package defpackage;

import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final class u14 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ i F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ NewCodeSessionPrefill H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u14(i iVar, boolean z, NewCodeSessionPrefill newCodeSessionPrefill, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = iVar;
        this.G = z;
        this.H = newCodeSessionPrefill;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new u14(this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((u14) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007f, code lost:
    
        if (r11 != r9) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u14.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
