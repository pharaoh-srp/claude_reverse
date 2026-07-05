package defpackage;

import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.mcpapps.transport.JsonRpcRequest;
import com.anthropic.claude.types.strings.SessionId;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class gy extends xzg implements rz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public /* synthetic */ Object G;
    public /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(sc6 sc6Var, ky kyVar, tp4 tp4Var) {
        super(3, tp4Var);
        this.H = sc6Var;
        this.I = kyVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj4 = this.I;
        switch (i) {
            case 0:
                gy gyVar = new gy((sc6) this.H, (ky) obj4, (tp4) obj3);
                gyVar.G = (qy) obj;
                return gyVar.invokeSuspend(ieiVar);
            case 1:
                gy gyVar2 = new gy((t53) obj4, (tp4) obj3);
                gyVar2.G = (ctc) obj;
                gyVar2.H = (JsonRpcRequest) obj2;
                return gyVar2.invokeSuspend(ieiVar);
            default:
                gy gyVar3 = new gy((tp4) obj3, (i) obj4);
                gyVar3.G = (lp7) obj;
                gyVar3.H = obj2;
                return gyVar3.invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        kp7 pj4Var;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.I;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 != 0) {
                    if (i2 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                qy qyVar = (qy) this.G;
                sc6 sc6Var = (sc6) this.H;
                l0 l0Var = new l0((ky) obj2, 11, qyVar);
                this.F = 1;
                return sc6Var.invoke(l0Var, this) == m45Var ? m45Var : ieiVar;
            case 1:
                ctc ctcVar = (ctc) this.G;
                JsonRpcRequest jsonRpcRequest = (JsonRpcRequest) this.H;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    t53 t53Var = (t53) obj2;
                    tp4 tp4Var = null;
                    this.G = null;
                    this.H = null;
                    this.F = 1;
                    McpServer mcpServerV0 = t53Var.v0(ctcVar);
                    if (mcpServerV0 != null) {
                        Object objJ = t53Var.X.j(mcpServerV0.m346getUuidowoRr7k(), jsonRpcRequest, new cm(t53Var, ctcVar, jsonRpcRequest, tp4Var, 18), this);
                        return objJ == m45Var ? m45Var : objJ;
                    }
                    sz6.j(ij0.i("MCP server not found for tool: ", ctcVar.b));
                } else {
                    if (i3 == 1) {
                        sf5.h0(obj);
                        return obj;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                lp7 lp7Var = (lp7) this.G;
                Object obj3 = this.H;
                int i4 = this.F;
                if (i4 != 0) {
                    if (i4 == 1) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                SessionId sessionId = (SessionId) obj3;
                String strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
                u36 u36Var = u36.a;
                if (strM1120unboximpl != null) {
                    z36 z36Var = (z36) ((i) obj2).A;
                    z36Var.getClass();
                    LinkedHashMap linkedHashMap = z36Var.c;
                    SessionId sessionIdM1114boximpl = SessionId.m1114boximpl(strM1120unboximpl);
                    Object objA = linkedHashMap.get(sessionIdM1114boximpl);
                    if (objA == null) {
                        objA = bmg.a(u36Var);
                        linkedHashMap.put(sessionIdM1114boximpl, objA);
                    }
                    pj4Var = (amg) objA;
                } else {
                    pj4Var = new pj4(1, u36Var);
                }
                this.G = null;
                this.H = null;
                this.F = 1;
                return j8.D(lp7Var, pj4Var, this) == m45Var ? m45Var : ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(tp4 tp4Var, i iVar) {
        super(3, tp4Var);
        this.I = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(t53 t53Var, tp4 tp4Var) {
        super(3, tp4Var);
        this.I = t53Var;
    }
}
