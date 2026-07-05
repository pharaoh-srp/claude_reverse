package defpackage;

import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.anthropic.claude.tool.model.ToolInvocationResult$Report;

/* JADX INFO: loaded from: classes2.dex */
public final class i43 extends xzg implements pz7 {
    public final /* synthetic */ int E = 0;
    public int F;
    public final /* synthetic */ t53 G;
    public final /* synthetic */ ToolUseBlock H;
    public final /* synthetic */ String I;
    public final /* synthetic */ String J;
    public final /* synthetic */ String K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i43(t53 t53Var, ToolUseBlock toolUseBlock, String str, String str2, String str3, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = t53Var;
        this.H = toolUseBlock;
        this.I = str;
        this.J = str2;
        this.K = str3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new i43(this.I, this.G, this.J, this.H, this.K, tp4Var);
            default:
                return new i43(this.G, this.H, this.I, this.J, this.K, tp4Var);
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
        return ((i43) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        Object objG;
        Object objM;
        int i = this.E;
        iei ieiVar = iei.a;
        String str = this.J;
        String str2 = this.I;
        m45 m45Var = m45.E;
        ToolUseBlock toolUseBlock = this.H;
        t53 t53Var = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    if (str2 == null) {
                        str2 = "";
                    }
                    wwh wwhVar = new wwh(str2, t53Var.L0, t53Var.d.e, str);
                    myh myhVar = t53Var.N;
                    String name = toolUseBlock.getName();
                    this.F = 1;
                    objG = myhVar.g(name, this.K, wwhVar, this);
                    if (objG == m45Var) {
                        return m45Var;
                    }
                } else {
                    if (i2 != 1) {
                        sz6.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sf5.h0(obj);
                    objG = obj;
                }
                t53.g0(t53Var, str, (uxh) objG, toolUseBlock.getName());
                return ieiVar;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    myh myhVar2 = t53Var.N;
                    String name2 = toolUseBlock.getName();
                    this.F = 1;
                    dxh dxhVar = (dxh) myhVar2.h().get(name2);
                    objM = dxhVar != null ? dxhVar.m(this, myhVar2.a, str2) : null;
                    if (objM != m45Var) {
                    }
                    return m45Var;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        sf5.h0(obj);
                        return ieiVar;
                    }
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                objM = obj;
                MobileAppToolPreviewInfo mobileAppToolPreviewInfo = (MobileAppToolPreviewInfo) objM;
                if (mobileAppToolPreviewInfo == null) {
                    SilentException.a(new SilentException(ij0.i("Failed to get preview info for tool: ", toolUseBlock.getName())), null, true, 1);
                    t53.g0(t53Var, str, new ToolInvocationResult$Report("An unexpected error occurred.", false), toolUseBlock.getName());
                    return ieiVar;
                }
                zy1 zy1Var = t53Var.i0;
                h63 h63Var = new h63(toolUseBlock.getName(), this.I, mobileAppToolPreviewInfo, this.J, this.K, false);
                this.F = 2;
                if (zy1Var.b(this, h63Var) != m45Var) {
                    return ieiVar;
                }
                return m45Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i43(String str, t53 t53Var, String str2, ToolUseBlock toolUseBlock, String str3, tp4 tp4Var) {
        super(2, tp4Var);
        this.I = str;
        this.G = t53Var;
        this.J = str2;
        this.H = toolUseBlock;
        this.K = str3;
    }
}
