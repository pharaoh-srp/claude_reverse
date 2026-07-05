package defpackage;

import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.api.chat.messages.ToolResultBlock;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.api.mcp.CaiMcpFlag;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.McpToolApprovalOption;
import com.anthropic.claude.types.strings.McpToolApprovalKey;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ToolUseId;
import com.anthropic.claude.ui.components.error.a;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class g53 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ t53 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g53(t53 t53Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = t53Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        t53 t53Var = this.G;
        switch (i) {
            case 0:
                g53 g53Var = new g53(t53Var, tp4Var, 0);
                g53Var.F = obj;
                return g53Var;
            case 1:
                g53 g53Var2 = new g53(t53Var, tp4Var, 1);
                g53Var2.F = obj;
                return g53Var2;
            case 2:
                g53 g53Var3 = new g53(t53Var, tp4Var, 2);
                g53Var3.F = obj;
                return g53Var3;
            case 3:
                g53 g53Var4 = new g53(t53Var, tp4Var, 3);
                g53Var4.F = obj;
                return g53Var4;
            default:
                g53 g53Var5 = new g53(t53Var, tp4Var, 4);
                g53Var5.F = obj;
                return g53Var5;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((g53) create((im2) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((g53) create((im2) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((g53) create((im2) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((g53) create((im2) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                ((g53) create((vt6) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        RateLimit.ApproachingLimit approachingLimit;
        Integer remaining;
        ToolUseBlock toolUseBlock;
        List<McpToolApprovalOption> approval_options;
        McpServer mcpServer;
        Object next;
        int i = this.E;
        t53 t53Var = this.G;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                im2 im2Var = (im2) this.F;
                sf5.h0(obj);
                lsc lscVar = t53Var.v1;
                RateLimit rateLimit = im2Var.d;
                if ((rateLimit instanceof RateLimit.ApproachingLimit) && (remaining = (approachingLimit = (RateLimit.ApproachingLimit) rateLimit).getRemaining()) != null && remaining.intValue() == 0) {
                    lscVar.setValue(u1e.b(approachingLimit));
                    Date resetsAt = approachingLimit.getResetsAt();
                    if (resetsAt != null) {
                        t53Var.z.b(Long.valueOf(resetsAt.getTime()));
                    }
                } else {
                    rateLimit.getClass();
                    lscVar.setValue(rateLimit);
                }
                return ieiVar;
            case 1:
                im2 im2Var2 = (im2) this.F;
                sf5.h0(obj);
                ContentBlock contentBlock = (ContentBlock) w44.V0(im2Var2.a);
                List list = im2Var2.a;
                int iM = !list.isEmpty() ? x44.M(list) : -1;
                if ((contentBlock instanceof ToolUseBlock) && (approval_options = (toolUseBlock = (ToolUseBlock) contentBlock).getApproval_options()) != null && !approval_options.isEmpty() && iM >= 0 && !im2Var2.g.contains(Integer.valueOf(iM))) {
                    String id = toolUseBlock.getId();
                    Object obj2 = null;
                    Object[] objArr = 0;
                    String strM1158constructorimpl = id != null ? ToolUseId.m1158constructorimpl(id) : null;
                    if (strM1158constructorimpl == null) {
                        ebh.A("Can't request approval for tool use block without ID", null, false, 3);
                    } else {
                        t53 t53Var2 = this.G;
                        ToolUseId toolUseId = (ToolUseId) t53Var2.V1.getAndSet(ToolUseId.m1157boximpl(strM1158constructorimpl));
                        String strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
                        if (!(strM1163unboximpl != null ? ToolUseId.m1160equalsimpl0(strM1158constructorimpl, strM1163unboximpl) : false)) {
                            String integration_name = toolUseBlock.getIntegration_name();
                            if (integration_name != null) {
                                ListIterator listIterator = t53Var2.d.q.listIterator();
                                while (true) {
                                    c8a c8aVar = (c8a) listIterator;
                                    if (c8aVar.hasNext()) {
                                        next = c8aVar.next();
                                        if (x44.r(((McpServer) next).getName(), integration_name)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                mcpServer = (McpServer) next;
                            } else {
                                mcpServer = null;
                            }
                            if (mcpServer == null || !mcpServer.getCai_flags().contains(CaiMcpFlag.AUTO_ACCEPT_PERMISSIONS)) {
                                gb9.D(t53Var2.a, null, null, new pb2(toolUseBlock, t53Var2, strM1158constructorimpl, objArr == true ? 1 : 0, 15), 3);
                            } else {
                                String approval_key = toolUseBlock.getApproval_key();
                                String strM1037constructorimpl = approval_key != null ? McpToolApprovalKey.m1037constructorimpl(approval_key) : null;
                                Iterator it = x44.X(McpToolApprovalOption.ALWAYS, McpToolApprovalOption.PER_CHAT, McpToolApprovalOption.ONCE).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next2 = it.next();
                                        McpToolApprovalOption mcpToolApprovalOption = (McpToolApprovalOption) next2;
                                        List<McpToolApprovalOption> approval_options2 = toolUseBlock.getApproval_options();
                                        if (approval_options2 == null) {
                                            approval_options2 = lm6.E;
                                        }
                                        if (approval_options2.contains(mcpToolApprovalOption)) {
                                            obj2 = next2;
                                        }
                                    }
                                }
                                t53.l1(t53Var2, strM1158constructorimpl, true, strM1037constructorimpl, (McpToolApprovalOption) obj2);
                            }
                        }
                    }
                }
                return ieiVar;
            case 2:
                im2 im2Var3 = (im2) this.F;
                sf5.h0(obj);
                iwc iwcVar = im2Var3.j;
                lsc lscVar2 = t53Var.w0;
                lscVar2.setValue(iwcVar);
                if (((iwc) lscVar2.getValue()) == null) {
                    t53Var.u1(false);
                }
                return ieiVar;
            case 3:
                im2 im2Var4 = (im2) this.F;
                sf5.h0(obj);
                LinkedHashSet linkedHashSet = t53Var.W1;
                int i2 = 0;
                for (Object obj3 : im2Var4.a) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        x44.n0();
                        throw null;
                    }
                    ContentBlock contentBlock2 = (ContentBlock) obj3;
                    if ((contentBlock2 instanceof ToolResultBlock) && !im2Var4.g.contains(Integer.valueOf(i2))) {
                        ToolResultBlock toolResultBlock = (ToolResultBlock) contentBlock2;
                        if (bsg.u0(toolResultBlock.getName(), ":", false)) {
                            String str = im2Var4.b;
                            String str2 = (str == null ? "null" : MessageId.m1056toStringimpl(str)) + ":" + i2;
                            if (!linkedHashSet.contains(str2)) {
                                linkedHashSet.add(str2);
                                t53.E1(t53Var, toolResultBlock.is_error() ? "failure" : "success");
                            }
                        }
                    }
                    i2 = i3;
                }
                return ieiVar;
            default:
                vt6 vt6Var = (vt6) this.F;
                sf5.h0(obj);
                a.a(vt6Var, t53Var.j0);
                return ieiVar;
        }
    }
}
