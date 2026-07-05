package defpackage;

import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.send.OutboxItem;

/* JADX INFO: loaded from: classes2.dex */
public final class gy4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ f H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gy4(f fVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = fVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        f fVar = this.H;
        switch (i) {
            case 0:
                gy4 gy4Var = new gy4(fVar, tp4Var, 0);
                gy4Var.G = obj;
                return gy4Var;
            default:
                gy4 gy4Var2 = new gy4(fVar, tp4Var, 1);
                gy4Var2.G = obj;
                return gy4Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((gy4) create((OutboxItem) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((gy4) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r11 != null) goto L37;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
