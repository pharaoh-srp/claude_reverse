package defpackage;

import android.content.Context;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingEndpointType;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingMessageCompletionStatus;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingResponseSuccess;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$MessageResponseComplete;
import com.anthropic.claude.analytics.events.ClaudeAiMessageEvents$ResearchMode;
import com.anthropic.claude.chat.MessageSseService;
import com.anthropic.claude.types.strings.ThinkingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class j53 extends xzg implements rz7 {
    public /* synthetic */ Throwable E;
    public final /* synthetic */ z9e F;
    public final /* synthetic */ t53 G;
    public final /* synthetic */ dae H;
    public final /* synthetic */ fkg I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j53(z9e z9eVar, t53 t53Var, dae daeVar, fkg fkgVar, tp4 tp4Var) {
        super(3, tp4Var);
        this.F = z9eVar;
        this.G = t53Var;
        this.H = daeVar;
        this.I = fkgVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dae daeVar = this.H;
        fkg fkgVar = this.I;
        j53 j53Var = new j53(this.F, this.G, daeVar, fkgVar, (tp4) obj3);
        j53Var.E = (Throwable) obj2;
        iei ieiVar = iei.a;
        j53Var.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        b19 b19VarW0;
        uhd uhdVar;
        Throwable th = this.E;
        sf5.h0(obj);
        t53 t53Var = this.G;
        if (th == null && !this.F.E && (b19VarW0 = t53Var.w0((String) this.H.E)) != null && (uhdVar = (uhd) b19VarW0.b) != null) {
            em2 em2Var = t53Var.h0;
            qi3 qi3Var = em2Var.a;
            bj0 bj0Var = em2Var.c;
            ol2 ol2VarI = em2Var.i();
            if (ol2VarI != null) {
                vl2 vl2Var = ol2VarI.a;
                long jA = em2Var.d.a() - vl2Var.a;
                Long l = ol2VarI.d;
                Long lValueOf = l != null ? Long.valueOf(l.longValue() - vl2Var.a) : null;
                nl2 nl2Var = ol2VarI.c;
                String str = uhdVar.i;
                int size = uhdVar.e.size();
                int iF = uhdVar.f();
                xi0 xi0VarA = bj0Var.a();
                long jB = vl2Var.b(bj0Var);
                String str2 = nl2Var.a;
                String str3 = nl2Var.e;
                String str4 = nl2Var.d;
                qi3Var.e(new ChatEvents$StreamingResponseSuccess(str2, nl2Var.b, uhdVar.a, nl2Var.k ? ChatEvents$StreamingEndpointType.RETRY : ChatEvents$StreamingEndpointType.COMPLETION, !xi0VarA.a, size, iF, str, Integer.valueOf(nl2Var.o), Integer.valueOf(nl2Var.p), Integer.valueOf(nl2Var.q), str4 == null ? null : str4, lValueOf, Long.valueOf(jA), (Boolean) em2Var.i.a(), Long.valueOf(jB), Boolean.valueOf(nl2Var.l), str3 == null ? null : str3), ChatEvents$StreamingResponseSuccess.Companion.serializer());
                long jLongValue = lValueOf != null ? lValueOf.longValue() : jA;
                String str5 = nl2Var.b;
                String str6 = nl2Var.c;
                String str7 = ol2VarI.e;
                if (str7 == null) {
                    str7 = uhdVar.a;
                }
                String str8 = str7;
                String str9 = str4 == null ? null : str4;
                int i = nl2Var.f;
                int i2 = nl2Var.g;
                boolean z = nl2Var.j;
                boolean z2 = nl2Var.k;
                boolean z3 = nl2Var.l;
                ide ideVar = em2.D;
                String str10 = nl2Var.m;
                qi3Var.e(new ClaudeAiMessageEvents$MessageResponseComplete(jLongValue, jA, str5, str6, str8, str9, i, i2, z, z2, z3, false, (str10 == null || ThinkingMode.m1147isNonThinkingModeimpl(str10)) ? null : str10, nl2Var.n ? ClaudeAiMessageEvents$ResearchMode.ADVANCED : ClaudeAiMessageEvents$ResearchMode.DISABLED, nl2Var.o, nl2Var.p, nl2Var.r, str == null ? "end_turn" : str, iF, size, jB, true, str3 == null ? null : str3), ClaudeAiMessageEvents$MessageResponseComplete.Companion.serializer());
                em2Var.h(ChatEvents$StreamingMessageCompletionStatus.SUCCESS, nl2Var, uhdVar.a, ol2VarI.b, !xi0VarA.a, uhdVar.e);
                hi6 hi6Var = em2Var.p;
                if (hi6Var != null) {
                    hi6Var.F(ane.a);
                }
            }
        }
        t53Var.w0.setValue(null);
        t53Var.u1(false);
        Context context = t53Var.c;
        int i3 = MessageSseService.E;
        context.stopService(xrk.d(context));
        this.I.d(null);
        return iei.a;
    }
}
