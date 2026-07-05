package defpackage;

import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class rx4 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ b0 H;
    public final /* synthetic */ String I;
    public final /* synthetic */ f J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx4(f fVar, b0 b0Var, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.E = 3;
        this.J = fVar;
        this.H = b0Var;
        this.I = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                rx4 rx4Var = new rx4(this.H, this.I, this.J, tp4Var, 0);
                rx4Var.G = obj;
                return rx4Var;
            case 1:
                rx4 rx4Var2 = new rx4(this.H, this.I, this.J, tp4Var, 1);
                rx4Var2.G = obj;
                return rx4Var2;
            case 2:
                rx4 rx4Var3 = new rx4(this.H, this.I, this.J, tp4Var, 2);
                rx4Var3.G = obj;
                return rx4Var3;
            default:
                rx4 rx4Var4 = new rx4(this.J, this.H, this.I, tp4Var);
                rx4Var4.G = obj;
                return rx4Var4;
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
        return ((rx4) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x02a0 A[Catch: all -> 0x01e8, Exception -> 0x01eb, CancellationException -> 0x01ee, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x01ee, Exception -> 0x01eb, blocks: (B:100:0x01e2, B:113:0x0206, B:115:0x0219, B:124:0x023e, B:130:0x0254, B:132:0x0280, B:134:0x02a0, B:127:0x0244, B:118:0x0223, B:119:0x0227, B:121:0x022d, B:110:0x01fa), top: B:212:0x01de, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ba A[PHI: r3
      0x01ba: PHI (r3v13 java.lang.String) = (r3v12 java.lang.String), (r3v17 java.lang.String) binds: [B:86:0x01a6, B:88:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx4(b0 b0Var, String str, f fVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = b0Var;
        this.I = str;
        this.J = fVar;
    }
}
