package defpackage;

import com.anthropic.claude.mcpapps.b;
import com.anthropic.claude.mcpapps.transport.JsonRpcRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class dxa extends vp4 {
    public String E;
    public JsonRpcRequest F;
    public /* synthetic */ Object G;
    public final /* synthetic */ b H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.n(null, null, this);
    }
}
