package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.KnowledgeSource;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hzh implements pz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ hzh(int i) {
        this.E = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                ((Integer) obj).intValue();
                KnowledgeSource knowledgeSource = (KnowledgeSource) obj2;
                knowledgeSource.getClass();
                return knowledgeSource.getKey();
            case 1:
                s2i s2iVar = (s2i) obj2;
                return x44.X(Float.valueOf(s2iVar.a), Float.valueOf(s2iVar.c.h()), Float.valueOf(s2iVar.b.h()));
            case 2:
                a9i a9iVar = (a9i) obj2;
                return x44.X(a9iVar.a, a9iVar.b);
            case 3:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new ded();
            case 4:
                m7f m7fVar = (m7f) obj;
                m7fVar.getClass();
                ((bsc) obj2).getClass();
                return (mn5) m7fVar.a(jce.a.b(ded.class), null, null);
            case 5:
                dui duiVar = (dui) obj2;
                ((y4f) obj).getClass();
                duiVar.getClass();
                return new cpc(Float.valueOf(duiVar.e.h()), Boolean.valueOf(duiVar.g));
            case 6:
                eui euiVar = (eui) obj2;
                ((y4f) obj).getClass();
                euiVar.getClass();
                return new cpc(Float.valueOf(euiVar.e.h()), Boolean.valueOf(euiVar.d));
            case 7:
                ((Integer) obj2).getClass();
                e18 e18Var = (e18) ((ld4) obj);
                return vb7.n(e18Var, -1063815022, R.string.knowledge_sources_sheet_citations, e18Var, false);
            case 8:
                ((Integer) obj2).getClass();
                e18 e18Var2 = (e18) ((ld4) obj);
                return vb7.n(e18Var2, -1487152028, R.string.knowledge_sources_sheet_more, e18Var2, false);
            case 9:
                ((Integer) obj).intValue();
                KnowledgeSource knowledgeSource2 = (KnowledgeSource) obj2;
                knowledgeSource2.getClass();
                return knowledgeSource2.getKey();
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                ((c1j) obj2).getClass();
                return "msg_" + iIntValue;
            default:
                ((m7f) obj).getClass();
                ((bsc) obj2).getClass();
                return new v7j();
        }
    }
}
