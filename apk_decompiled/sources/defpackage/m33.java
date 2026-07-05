package defpackage;

import com.anthropic.claude.types.strings.FileId;

/* JADX INFO: loaded from: classes2.dex */
public final class m33 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ t53 G;
    public /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m33(t53 t53Var, tp4 tp4Var, String str) {
        super(2, tp4Var);
        this.E = 3;
        this.H = str;
        this.G = t53Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        t53 t53Var = this.G;
        switch (i) {
            case 0:
                return new m33(t53Var, this.H, tp4Var, 0);
            case 1:
                return new m33(t53Var, this.H, tp4Var, 1);
            case 2:
                m33 m33Var = new m33(t53Var, tp4Var);
                m33Var.H = ((FileId) obj).m1020unboximpl();
                return m33Var;
            default:
                return new m33(t53Var, tp4Var, this.H);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((m33) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((m33) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((m33) create(FileId.m1014boximpl(((FileId) obj).m1020unboximpl()), (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((m33) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        if (r12 == r3) goto L36;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m33.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m33(t53 t53Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 2;
        this.G = t53Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m33(t53 t53Var, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = t53Var;
        this.H = str;
    }
}
