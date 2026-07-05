package defpackage;

import com.anthropic.claude.mcpapps.b;
import com.anthropic.claude.mcpapps.transport.JsonRpcRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class axa extends vp4 {
    public String E;
    public JsonRpcRequest F;
    public pz7 G;
    public Exception H;
    public Exception I;
    public /* synthetic */ Object J;
    public final /* synthetic */ b K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axa(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.j(null, null, null, this);
    }
}
