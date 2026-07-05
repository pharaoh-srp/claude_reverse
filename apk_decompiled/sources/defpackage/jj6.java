package defpackage;

import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.project.details.custominstructions.d;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jj6 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ d F;

    public /* synthetic */ jj6(d dVar, int i) {
        this.E = i;
        this.F = dVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        d dVar = this.F;
        switch (i) {
            case 0:
                return Project.m401copyqeyL9fA$default((Project) obj, null, null, null, false, null, null, null, null, null, false, false, null, null, ((cjh) dVar.h.getValue()).a.F, null, null, null, 122879, null);
            default:
                cjh cjhVar = (cjh) obj;
                cjhVar.getClass();
                dVar.getClass();
                dVar.h.setValue(cjhVar);
                return iei.a;
        }
    }
}
