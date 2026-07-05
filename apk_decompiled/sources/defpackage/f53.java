package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$BusyContainerSendRetryOutcome;
import com.anthropic.claude.analytics.events.ChatEvents$CompactionOutcome;
import com.anthropic.claude.analytics.events.ChatEvents$CompactionStarted;
import com.anthropic.claude.analytics.events.ChatEvents$SendRetryOutcome;
import com.anthropic.claude.api.chat.messages.CompactionStatus;
import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.api.chat.messages.ToolResultBlock;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f53 extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ t53 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f53(t53 t53Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = t53Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        f53 f53Var = new f53(this.F, tp4Var);
        f53Var.E = obj;
        return f53Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        f53 f53Var = (f53) create((im2) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        f53Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String str;
        im2 im2Var = (im2) this.E;
        sf5.h0(obj);
        t53 t53Var = this.F;
        em2 em2Var = t53Var.h0;
        if (t53Var.U0() instanceof y03) {
            t53Var.A1(a13.a);
        }
        if (x44.r(t53Var.z1, a43.a)) {
            t53Var.z1 = z33.a;
        }
        ChatEvents$SendRetryOutcome chatEvents$SendRetryOutcome = ChatEvents$SendRetryOutcome.SUCCESS;
        ide ideVar = em2.D;
        List list = null;
        em2Var.f(chatEvents$SendRetryOutcome, null);
        em2Var.e(ChatEvents$BusyContainerSendRetryOutcome.RECOVERED);
        CompactionStatus compactionStatus = im2Var.h;
        k84 k84VarE0 = t53Var.E0();
        if ((k84VarE0 != null ? k84VarE0.a : null) != (compactionStatus != null ? compactionStatus.getStatus() : null)) {
            CompactionStatus.Status status = compactionStatus != null ? compactionStatus.getStatus() : null;
            int i = status == null ? -1 : e43.c[status.ordinal()];
            if (i == -1) {
                t53Var.t1(null);
            } else if (i == 1) {
                t53Var.t1(new k84(compactionStatus.getStatus(), t53Var.g.a()));
                t53Var.w.e(new ChatEvents$CompactionStarted(t53Var.d.e, t53Var.L0), ChatEvents$CompactionStarted.Companion.serializer());
            } else if (i == 2) {
                k84 k84VarE02 = t53Var.E0();
                t53Var.t1(k84VarE02 != null ? k84.a(k84VarE02, compactionStatus.getStatus()) : null);
                t53Var.C1(ChatEvents$CompactionOutcome.SUCCESS, null);
            } else {
                if (i != 3) {
                    wg6.i();
                    return null;
                }
                k84 k84VarE03 = t53Var.E0();
                t53Var.t1(k84VarE03 != null ? k84.a(k84VarE03, compactionStatus.getStatus()) : null);
                t53Var.C1(ChatEvents$CompactionOutcome.FAILED, compactionStatus.getMessage());
            }
        }
        ContentBlock contentBlock = (ContentBlock) w44.V0(im2Var.a);
        em2Var.o = contentBlock;
        CompactionStatus compactionStatus2 = im2Var.h;
        CompactionStatus.Status status2 = compactionStatus2 != null ? compactionStatus2.getStatus() : null;
        CompactionStatus.Status status3 = CompactionStatus.Status.COMPACTING;
        fm3 fm3Var = fm3.H;
        if (status2 != status3 && !(contentBlock instanceof ToolUseBlock) && !(contentBlock instanceof ToolResultBlock)) {
            fm3Var = fm3.G;
        }
        t53Var.A0.setValue(fm3Var);
        ToolUseBlock toolUseBlock = contentBlock instanceof ToolUseBlock ? (ToolUseBlock) contentBlock : null;
        if (toolUseBlock != null) {
            String partial_json = toolUseBlock.getInput().getPartial_json();
            List list2 = u53.a;
            partial_json.getClass();
            try {
                ova ovaVarB = u53.b.b(partial_json);
                if (ovaVarB != null && (str = (String) ((mva) ovaVarB.a()).get(1)) != null) {
                    ag9 ag9Var = bg9.d;
                    ag9Var.getClass();
                    List list3 = (List) ag9Var.b(str, new uo0(srg.a, 0));
                    if (list3 != null) {
                        if (!list3.isEmpty()) {
                            list = list3;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        t53Var.D0.setValue(list);
        return iei.a;
    }
}
