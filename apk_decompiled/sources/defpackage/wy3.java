package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$CiSheetViewed;
import com.anthropic.claude.analytics.events.CodeEvents$DiffViewOpened;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wy3 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ i F;
    public final /* synthetic */ t4g G;

    public /* synthetic */ wy3(t4g t4gVar, i iVar, int i) {
        this.E = i;
        this.G = t4gVar;
        this.F = iVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        t4g t4gVar = this.G;
        i iVar = this.F;
        switch (i) {
            case 0:
                t4gVar.a();
                iVar.E1.setValue(Boolean.TRUE);
                break;
            case 1:
                qi3 qi3Var = iVar.l;
                String str = iVar.m;
                String strE0 = iVar.E0();
                qi3Var.e(new CodeEvents$CiSheetViewed(str, strE0 != null ? strE0 : null), CodeEvents$CiSheetViewed.Companion.serializer());
                t4gVar.d(CodeRemoteBottomSheetDestination.PRAutofix.a);
                break;
            case 2:
                lsc lscVar = iVar.r1;
                if ((((x36) lscVar.getValue()) instanceof u36) || (((x36) lscVar.getValue()) instanceof t36)) {
                    iVar.h0();
                }
                qi3 qi3Var2 = iVar.l;
                String str2 = iVar.m;
                String strE02 = iVar.E0();
                qi3Var2.e(new CodeEvents$DiffViewOpened(str2, strE02 != null ? strE02 : null), CodeEvents$DiffViewOpened.Companion.serializer());
                t4gVar.d(CodeRemoteBottomSheetDestination.DiffView.a);
                break;
            case 3:
                t4gVar.d(new CodeRemoteBottomSheetDestination.PermissionModeSelection(iVar.x0()));
                break;
            default:
                iVar.v1(null);
                t4gVar.d(CodeRemoteBottomSheetDestination.RepositorySelection.a);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ wy3(i iVar, t4g t4gVar, int i) {
        this.E = i;
        this.F = iVar;
        this.G = t4gVar;
    }
}
