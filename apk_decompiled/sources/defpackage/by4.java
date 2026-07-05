package defpackage;

import com.anthropic.claude.conway.protocol.StreamMessage;
import com.anthropic.claude.conway.protocol.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class by4 extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ b0 G;
    public final /* synthetic */ StreamMessage.ToolCall H;
    public final /* synthetic */ a15 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by4(b0 b0Var, StreamMessage.ToolCall toolCall, a15 a15Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = b0Var;
        this.H = toolCall;
        this.I = a15Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        by4 by4Var = new by4(this.G, this.H, this.I, tp4Var);
        by4Var.F = obj;
        return by4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((by4) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        if (r11.G.q(r2, r2, r3, r0, r11) == r6) goto L45;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
