package defpackage;

import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.VillageWeaverConsentState;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.types.strings.VoiceSessionId;

/* JADX INFO: loaded from: classes.dex */
public final class tx1 extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx1(f4j f4jVar, j1j j1jVar, t53 t53Var, q7 q7Var, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = f4jVar;
        this.G = j1jVar;
        this.H = t53Var;
        this.I = q7Var;
        this.J = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.J;
        Object obj3 = this.I;
        Object obj4 = this.H;
        Object obj5 = this.G;
        switch (i) {
            case 0:
                tx1 tx1Var = new tx1((ux1) obj5, (m5c) obj4, (mx1) obj3, (ka1) obj2, tp4Var);
                tx1Var.F = obj;
                return tx1Var;
            default:
                return new tx1((f4j) this.F, (j1j) obj5, (t53) obj4, (q7) obj3, (nwb) obj2, tp4Var);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                return ((tx1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            default:
                ((tx1) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        AccountSettings settings;
        int i = this.E;
        Object obj2 = this.H;
        Object obj3 = this.G;
        Object obj4 = this.J;
        Object obj5 = this.I;
        switch (i) {
            case 0:
                sf5.h0(obj);
                l45 l45Var = (l45) this.F;
                ux1 ux1Var = (ux1) obj3;
                gb9.D(l45Var, null, null, new cx(ux1Var, (m5c) obj2, (mx1) obj5, (tp4) null, 2), 3);
                return gb9.D(l45Var, null, null, new dx(ux1Var, (ka1) obj4, (tp4) null, 6), 3);
            default:
                q7 q7Var = (q7) obj5;
                sf5.h0(obj);
                f4j f4jVar = (f4j) this.F;
                lsc lscVar = f4jVar.a;
                lsc lscVar2 = f4jVar.b;
                VoiceSessionSummary voiceSessionSummary = (VoiceSessionSummary) lscVar.getValue();
                if (voiceSessionSummary != null) {
                    String strM564getVoiceSessionId5I1JifQ = voiceSessionSummary.m564getVoiceSessionId5I1JifQ();
                    VoiceSessionId voiceSessionId = (VoiceSessionId) lscVar2.getValue();
                    VillageWeaverConsentState village_weaver_consent_state = null;
                    String strM1170unboximpl = voiceSessionId != null ? voiceSessionId.m1170unboximpl() : null;
                    if (!(strM1170unboximpl == null ? false : VoiceSessionId.m1167equalsimpl0(strM564getVoiceSessionId5I1JifQ, strM1170unboximpl))) {
                        String strM564getVoiceSessionId5I1JifQ2 = voiceSessionSummary.m564getVoiceSessionId5I1JifQ();
                        lscVar2.setValue(strM564getVoiceSessionId5I1JifQ2 != null ? VoiceSessionId.m1164boximpl(strM564getVoiceSessionId5I1JifQ2) : null);
                        nwb nwbVar = (nwb) obj4;
                        boolean zBooleanValue = ((Boolean) ((j1j) obj3).b.getValue()).booleanValue();
                        boolean zA1 = ((t53) obj2).a1();
                        boolean zB = q7Var.b();
                        if (!q7Var.b()) {
                            q7Var = null;
                        }
                        if (q7Var != null && (settings = q7Var.a().getSettings()) != null) {
                            village_weaver_consent_state = settings.getVillage_weaver_consent_state();
                        }
                        nwbVar.setValue(Boolean.valueOf(xjk.k(zBooleanValue, voiceSessionSummary, zA1, zB, village_weaver_consent_state)));
                    }
                }
                return iei.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx1(ux1 ux1Var, m5c m5cVar, mx1 mx1Var, ka1 ka1Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = ux1Var;
        this.H = m5cVar;
        this.I = mx1Var;
        this.J = ka1Var;
    }
}
