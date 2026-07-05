package defpackage;

import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.sessions.types.CodeAgent;
import com.anthropic.claude.sessions.types.SelfHostedRunnerPool;
import com.anthropic.claude.types.strings.CodeAgentId;
import com.anthropic.claude.types.strings.ModelId;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class uq implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ String G;
    public final /* synthetic */ bz7 H;

    public /* synthetic */ uq(List list, String str, bz7 bz7Var, int i) {
        this.E = i;
        this.F = list;
        this.G = str;
        this.H = bz7Var;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        String str = this.G;
        List list = this.F;
        bz7 bz7Var = this.H;
        int i2 = 2;
        switch (i) {
            case 0:
                px9 px9Var = (px9) obj;
                int iIntValue = ((Number) obj2).intValue();
                ld4 ld4Var = (ld4) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i3 = (iIntValue2 & 6) == 0 ? iIntValue2 | (((e18) ld4Var).f(px9Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i3 |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
                    e18Var.T();
                } else {
                    CodeAgent codeAgent = (CodeAgent) list.get(iIntValue);
                    e18Var.a0(1915173016);
                    boolean zM995equalsimpl0 = str == null ? false : CodeAgentId.m995equalsimpl0(codeAgent.m833getIdVN9v2L4(), str);
                    boolean zF = e18Var.f(bz7Var) | e18Var.h(codeAgent);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new p4(bz7Var, i2, codeAgent);
                        e18Var.k0(objN);
                    }
                    mok.a(codeAgent, zM995equalsimpl0, (zy7) objN, null, e18Var, 0);
                    e18Var.p(false);
                }
                break;
            case 1:
                px9 px9Var2 = (px9) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                int i4 = (iIntValue4 & 6) == 0 ? iIntValue4 | (((e18) ld4Var2).f(px9Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i4 |= ((e18) ld4Var2).d(iIntValue3) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(i4 & 1, (i4 & 147) != 146)) {
                    e18Var2.T();
                } else {
                    ModelSelectorEntry modelSelectorEntry = (ModelSelectorEntry) list.get(iIntValue3);
                    e18Var2.a0(1209222147);
                    boolean zM1061equalsimpl0 = str == null ? false : ModelId.m1061equalsimpl0(modelSelectorEntry.m364getIdi4oh0I(), str);
                    boolean zF2 = e18Var2.f(bz7Var) | e18Var2.f(modelSelectorEntry);
                    Object objN2 = e18Var2.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new f32(bz7Var, modelSelectorEntry, 0);
                        e18Var2.k0(objN2);
                    }
                    ztj.c(modelSelectorEntry, zM1061equalsimpl0, (zy7) objN2, null, e18Var2, 0);
                    e18Var2.p(false);
                }
                break;
            case 2:
                px9 px9Var3 = (px9) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i5 = (iIntValue6 & 6) == 0 ? iIntValue6 | (((e18) ld4Var3).f(px9Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i5 |= ((e18) ld4Var3).d(iIntValue5) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(i5 & 1, (i5 & 147) != 146)) {
                    e18Var3.T();
                } else {
                    ModelSelectorEntry modelSelectorEntry2 = (ModelSelectorEntry) list.get(iIntValue5);
                    e18Var3.a0(-1464330738);
                    boolean zM1061equalsimpl02 = str == null ? false : ModelId.m1061equalsimpl0(modelSelectorEntry2.m364getIdi4oh0I(), str);
                    boolean zF3 = e18Var3.f(bz7Var) | e18Var3.f(modelSelectorEntry2);
                    Object objN3 = e18Var3.N();
                    if (zF3 || objN3 == lz1Var) {
                        objN3 = new f32(bz7Var, modelSelectorEntry2, 1);
                        e18Var3.k0(objN3);
                    }
                    ztj.c(modelSelectorEntry2, zM1061equalsimpl02, (zy7) objN3, null, e18Var3, 0);
                    e18Var3.p(false);
                }
                break;
            default:
                px9 px9Var4 = (px9) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                ld4 ld4Var4 = (ld4) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i6 = (iIntValue8 & 6) == 0 ? iIntValue8 | (((e18) ld4Var4).f(px9Var4) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i6 |= ((e18) ld4Var4).d(iIntValue7) ? 32 : 16;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(i6 & 1, (i6 & 147) != 146)) {
                    e18Var4.T();
                } else {
                    SelfHostedRunnerPool selfHostedRunnerPool = (SelfHostedRunnerPool) list.get(iIntValue7);
                    e18Var4.a0(723102399);
                    boolean zR = x44.r(str, selfHostedRunnerPool.getPool_id());
                    boolean zF4 = e18Var4.f(bz7Var) | e18Var4.h(selfHostedRunnerPool);
                    Object objN4 = e18Var4.N();
                    if (zF4 || objN4 == lz1Var) {
                        objN4 = new p4(bz7Var, 11, selfHostedRunnerPool);
                        e18Var4.k0(objN4);
                    }
                    a.z(selfHostedRunnerPool, zR, (zy7) objN4, e18Var4, 0);
                    e18Var4.p(false);
                }
                break;
        }
        return ieiVar;
    }
}
