package defpackage;

import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v24 implements bz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ i F;
    public final /* synthetic */ t4g G;

    public /* synthetic */ v24(t4g t4gVar, i iVar) {
        this.G = t4gVar;
        this.F = iVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        t4g t4gVar = this.G;
        i iVar = this.F;
        switch (i) {
            case 0:
                m29 m29Var = (m29) obj;
                m29Var.getClass();
                t4gVar.d(new CodeRemoteBottomSheetDestination.InitChecklist(m29Var, iVar.M0()));
                break;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                iVar.v1(num);
                t4gVar.d(CodeRemoteBottomSheetDestination.RepositorySelection.a);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ v24(i iVar, t4g t4gVar) {
        this.F = iVar;
        this.G = t4gVar;
    }
}
