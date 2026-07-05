package defpackage;

import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.StreamMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class dy4 extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ long G;
    public final /* synthetic */ f H;
    public final /* synthetic */ String I;
    public final /* synthetic */ StreamMessage J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy4(long j, f fVar, String str, StreamMessage streamMessage, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = j;
        this.H = fVar;
        this.I = str;
        this.J = streamMessage;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        dy4 dy4Var = new dy4(this.G, this.H, this.I, this.J, tp4Var);
        dy4Var.F = obj;
        return dy4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((dy4) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r14.p(defpackage.x44.X(new com.anthropic.claude.conway.protocol.ChatPart.Hint("<system>User sent a message from the " + r10 + " client. If you want to respond to them, call standard_user_output with your response. Use plain html by default, and layer in tasteful formatting as necessary to show emphasis, diagrams, etc.</system>"), new com.anthropic.claude.conway.protocol.ChatPart.UserText(r8)), true, r3, r13) != r2) goto L31;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
