package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ymd implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ wmd F;

    public /* synthetic */ ymd(wmd wmdVar, int i) {
        this.E = i;
        this.F = wmdVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        wmd wmdVar = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    bik.b((String) wmdVar.o.getValue(), null, e18Var, 0);
                }
                break;
            case 1:
                List list = (List) obj;
                list.getClass();
                ((go4) obj2).getClass();
                wmdVar.O(list, ProjectsEvents$ProjectFileSource.PROJECT_FILE_FILE_PICKER);
                break;
            default:
                List list2 = (List) obj;
                list2.getClass();
                ((go4) obj2).getClass();
                wmdVar.O(list2, ProjectsEvents$ProjectFileSource.PROJECT_FILE_FILE_PICKER);
                break;
        }
        return ieiVar;
    }
}
