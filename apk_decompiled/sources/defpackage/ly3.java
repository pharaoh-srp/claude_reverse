package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.code.remote.i;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ly3 implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ i F;
    public final /* synthetic */ CodeRemoteBottomSheetDestination G;

    public /* synthetic */ ly3(i iVar, CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination) {
        this.F = iVar;
        this.G = codeRemoteBottomSheetDestination;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination = this.G;
        i iVar = this.F;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                i4gVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    String str = ((CodeRemoteBottomSheetDestination.AttachmentVideo) codeRemoteBottomSheetDestination).a.e;
                    fhk.a(str != null ? iVar.Y(str) : null, gb9.N(b.c, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7), e18Var, 0);
                }
                break;
            default:
                i4gVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var2.T();
                } else {
                    dmk.b((dc1) ((Map) iVar.D0.getValue()).get(((CodeRemoteBottomSheetDestination.WorkflowDetail) codeRemoteBottomSheetDestination).a), i4gVar, null, e18Var2, (iIntValue << 3) & 112);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ly3(CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination, i iVar) {
        this.G = codeRemoteBottomSheetDestination;
        this.F = iVar;
    }
}
