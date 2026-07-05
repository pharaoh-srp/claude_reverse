package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pod implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lod F;

    public /* synthetic */ pod(lod lodVar, int i) {
        this.E = 2;
        this.F = lodVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        lod lodVar = this.F;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                ((go4) obj2).getClass();
                lodVar.P(list, ProjectsEvents$ProjectFileSource.PROJECT_FILE_FILE_PICKER);
                break;
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                ((go4) obj2).getClass();
                lodVar.P(list2, ProjectsEvents$ProjectFileSource.PROJECT_FILE_FILE_PICKER);
                break;
            default:
                ((Integer) obj2).getClass();
                qik.a(lodVar, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ pod(lod lodVar, int i, byte b) {
        this.E = i;
        this.F = lodVar;
    }
}
