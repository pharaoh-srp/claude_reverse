package defpackage;

import com.anthropic.claude.tool.model.KnowledgeSource;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jwh implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lwh F;

    public /* synthetic */ jwh(lwh lwhVar, int i) {
        this.E = i;
        this.F = lwhVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        lwh lwhVar = this.F;
        Integer num = (Integer) obj;
        switch (i) {
            case 0:
                num.getClass();
                KnowledgeSource knowledgeSource = (KnowledgeSource) obj2;
                knowledgeSource.getClass();
                return lwhVar + "_" + lwh.K + "_" + knowledgeSource.getKey();
            default:
                int iIntValue = num.intValue();
                List list = (List) obj2;
                list.getClass();
                String str = (String) w44.O0(0, list);
                return lwhVar + "_" + lwh.M + "_" + (str != null ? "key_".concat(str) : grc.p(iIntValue, "index_"));
        }
    }
}
