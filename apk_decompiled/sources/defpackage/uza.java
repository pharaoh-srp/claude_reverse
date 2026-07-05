package defpackage;

import com.anthropic.claude.mcpapps.transport.JsonRpcRequest;
import com.anthropic.claude.mcpapps.transport.McpErrorContent;
import com.anthropic.claude.mcpapps.transport.McpErrorResult;
import com.anthropic.claude.mcpapps.transport.UpdateModelContextParams;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final class uza extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ m83 H;
    public final /* synthetic */ ctc I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uza(int i, m83 m83Var, tp4 tp4Var, ctc ctcVar) {
        super(2, tp4Var);
        this.E = i;
        this.H = m83Var;
        this.I = ctcVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                uza uzaVar = new uza(0, this.H, tp4Var, this.I);
                uzaVar.G = obj;
                return uzaVar;
            default:
                uza uzaVar2 = new uza(1, this.H, tp4Var, this.I);
                uzaVar2.G = obj;
                return uzaVar2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((uza) create((UpdateModelContextParams) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((uza) create((JsonRpcRequest) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        ctc ctcVar = this.I;
        m83 m83Var = this.H;
        m45 m45Var = m45.E;
        mq5 mq5Var = null;
        switch (i) {
            case 0:
                UpdateModelContextParams updateModelContextParams = (UpdateModelContextParams) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    rz7 rz7Var = m83Var.B;
                    if (rz7Var != null) {
                        this.G = null;
                        this.F = 1;
                        if (rz7Var.invoke(ctcVar, updateModelContextParams, this) == m45Var) {
                            return m45Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                }
                return iei.a;
            default:
                JsonRpcRequest jsonRpcRequest = (JsonRpcRequest) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    rz7 rz7Var2 = m83Var.z;
                    if (rz7Var2 != null) {
                        this.G = null;
                        this.F = 1;
                        obj = rz7Var2.invoke(ctcVar, jsonRpcRequest, this);
                        if (obj == m45Var) {
                            return m45Var;
                        }
                    }
                    return ch9.i(bg9.d.c(new McpErrorResult(x44.W(new McpErrorContent((String) null, "Server request handler not configured", 1, (mq5) null)), false, 2, mq5Var), McpErrorResult.Companion.serializer()));
                }
                if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                JsonElement jsonElement = (JsonElement) obj;
                if (jsonElement != null) {
                    return jsonElement;
                }
                return ch9.i(bg9.d.c(new McpErrorResult(x44.W(new McpErrorContent((String) null, "Server request handler not configured", 1, (mq5) null)), false, 2, mq5Var), McpErrorResult.Companion.serializer()));
        }
    }
}
