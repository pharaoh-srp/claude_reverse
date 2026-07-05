package defpackage;

import com.anthropic.claude.conway.protocol.StreamMessage;
import com.anthropic.claude.conway.protocol.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class p15 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ b0 F;
    public final /* synthetic */ StreamMessage G;
    public final /* synthetic */ i15 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p15(b0 b0Var, StreamMessage streamMessage, i15 i15Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = b0Var;
        this.G = streamMessage;
        this.H = i15Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new p15(this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((p15) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            String requestId = ((StreamMessage.ToolCall) this.G).getRequestId();
            i15 i15Var = this.H;
            boolean z = i15Var.a;
            String str = i15Var.b;
            String str2 = i15Var.c;
            this.E = 1;
            Object objQ = this.F.q(requestId, z, str, str2, this);
            m45 m45Var = m45.E;
            if (objQ == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }
}
