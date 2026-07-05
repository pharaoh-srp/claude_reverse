package defpackage;

import com.anthropic.claude.chat.share.SharedChatModalBottomSheetDestination;
import com.anthropic.claude.settings.internal.a;
import com.anthropic.claude.tool.model.KnowledgeSource;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class io8 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;

    public /* synthetic */ io8(rwe rweVar) {
        this.E = 0;
        this.F = rweVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        int i2 = 20;
        int i3 = 18;
        Object[] objArr = 0;
        iei ieiVar = iei.a;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    oq5.i(fqb.E, pmk.b, null, null, null, 0, 0L, 0L, null, fd9.q0(1236762909, new jo8(rweVar), e18Var), e18Var, 805306416, 508);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    boolean zH = e18Var2.h(rweVar);
                    Object objN = e18Var2.N();
                    lz1 lz1Var = jd4.a;
                    if (zH || objN == lz1Var) {
                        objN = new av(rweVar, i3);
                        e18Var2.k0(objN);
                    }
                    zy7 zy7Var = (zy7) objN;
                    boolean zH2 = e18Var2.h(rweVar);
                    Object objN2 = e18Var2.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new av(rweVar, i2);
                        e18Var2.k0(objN2);
                    }
                    a.a(zy7Var, (zy7) objN2, e18Var2, 0);
                }
                break;
            case 2:
                List list = (List) obj;
                List list2 = (List) obj2;
                list.getClass();
                list2.getClass();
                rweVar.E.m(new u3a(i2, new SharedChatModalBottomSheetDestination.ViewCombinedSources(list, list2)), new hyf(25));
                break;
            case 3:
                String str = (String) obj;
                List list3 = (List) obj2;
                str.getClass();
                list3.getClass();
                rweVar.E.m(new u3a(i3, new SharedChatModalBottomSheetDestination.ViewSources(str, list3)), new hyf(21));
                break;
            default:
                KnowledgeSource knowledgeSource = (KnowledgeSource) obj;
                knowledgeSource.getClass();
                rweVar.E.m(new c2g(new SharedChatModalBottomSheetDestination.PreviewLink(knowledgeSource, (String) obj2), objArr == true ? 1 : 0), new hyf(22));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ io8(rwe rweVar, int i) {
        this.E = i;
        this.F = rweVar;
    }
}
