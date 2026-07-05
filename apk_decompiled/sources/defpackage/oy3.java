package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oy3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ CodeRemoteBottomSheetDestination F;

    public /* synthetic */ oy3(CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination, int i) {
        this.E = i;
        this.F = codeRemoteBottomSheetDestination;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.E;
        iei ieiVar = iei.a;
        CodeRemoteBottomSheetDestination codeRemoteBottomSheetDestination = this.F;
        ld4 ld4Var = (ld4) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i3) {
            case 0:
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k4g k4gVar = k4g.a;
                    int iOrdinal = ((CodeRemoteBottomSheetDestination.ToolCallDetail) codeRemoteBottomSheetDestination).a.f.ordinal();
                    if (iOrdinal == 0) {
                        i = 1511222229;
                        i2 = R.string.ccr_tool_status_in_progress;
                    } else if (iOrdinal == 1) {
                        i = 1511225747;
                        i2 = R.string.ccr_tool_status_completed;
                    } else {
                        if (iOrdinal != 2) {
                            throw ebh.u(e18Var, 1511219613, false);
                        }
                        i = 1511229104;
                        i2 = R.string.ccr_tool_status_failed;
                    }
                    k4gVar.b(vb7.n(e18Var, i, i2, e18Var, false), null, e18Var, 384);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                e18 e18Var2 = (e18) ld4Var;
                if (e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uuj.b(((CodeRemoteBottomSheetDestination.ChannelMessage) codeRemoteBottomSheetDestination).b, "plaintext", b.c, new qnc(16.0f, 8.0f, 16.0f, 8.0f), null, e18Var2, 3504);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            default:
                e18 e18Var3 = (e18) ld4Var;
                if (e18Var3.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    CodeRemoteBottomSheetDestination.ViewCode viewCode = (CodeRemoteBottomSheetDestination.ViewCode) codeRemoteBottomSheetDestination;
                    String str = viewCode.a;
                    String str2 = viewCode.b;
                    if (str2 == null) {
                        str2 = "plaintext";
                    }
                    uuj.b(str, str2, b.c, new qnc(16.0f, 8.0f, 16.0f, 8.0f), null, e18Var3, 3456);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
        }
    }
}
