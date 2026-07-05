package defpackage;

import com.anthropic.claude.analytics.events.ResearchEvents$ResearchStatusPollingFinished;
import com.anthropic.claude.api.chat.tool.ResearchStatus;
import com.anthropic.claude.types.strings.ResearchTaskId;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class xle extends xzg implements pz7 {
    public /* synthetic */ Object E;
    public final /* synthetic */ yle F;
    public final /* synthetic */ String G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ String I;
    public final /* synthetic */ String J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xle(yle yleVar, String str, boolean z, String str2, String str3, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = yleVar;
        this.G = str;
        this.H = z;
        this.I = str2;
        this.J = str3;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        xle xleVar = new xle(this.F, this.G, this.H, this.I, this.J, tp4Var);
        xleVar.E = obj;
        return xleVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        xle xleVar = (xle) create((jme) obj, (tp4) obj2);
        iei ieiVar = iei.a;
        xleVar.invokeSuspend(ieiVar);
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        String strName;
        jme jmeVar = (jme) this.E;
        sf5.h0(obj);
        yle yleVar = this.F;
        LinkedHashMap linkedHashMap = yleVar.d;
        String str = this.G;
        ResearchTaskId researchTaskIdM1100boximpl = ResearchTaskId.m1100boximpl(str);
        Object objA = linkedHashMap.get(researchTaskIdM1100boximpl);
        if (objA == null) {
            objA = bmg.a(null);
            linkedHashMap.put(researchTaskIdM1100boximpl, objA);
        }
        ((amg) objA).m(jmeVar);
        if (this.H && jmeVar.b) {
            qi3 qi3Var = yleVar.c;
            ResearchStatus researchStatus = jmeVar.f;
            if (researchStatus == null || (strName = researchStatus.name()) == null) {
                lowerCase = "";
            } else {
                lowerCase = strName.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            qi3Var.e(new ResearchEvents$ResearchStatusPollingFinished(this.I, this.J, str, lowerCase), ResearchEvents$ResearchStatusPollingFinished.Companion.serializer());
        }
        return iei.a;
    }
}
