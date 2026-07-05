package defpackage;

import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes3.dex */
public final class ql extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public int F;
    public final /* synthetic */ rl G;
    public /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(rl rlVar, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = rlVar;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        rl rlVar = this.G;
        switch (i) {
            case 0:
                ql qlVar = new ql(rlVar, tp4Var);
                SessionId sessionId = (SessionId) obj;
                qlVar.H = sessionId != null ? sessionId.m1120unboximpl() : null;
                return qlVar;
            default:
                return new ql(rlVar, this.H, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                SessionId sessionId = (SessionId) obj;
                String strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
                return ((ql) create(strM1120unboximpl != null ? SessionId.m1114boximpl(strM1120unboximpl) : null, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((ql) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013d A[PHI: r15
      0x013d: PHI (r15v1 java.lang.Object) = (r15v16 java.lang.Object), (r15v0 java.lang.Object) binds: [B:56:0x0139, B:38:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01cf -> B:42:0x00cc). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ql.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(rl rlVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = rlVar;
    }
}
