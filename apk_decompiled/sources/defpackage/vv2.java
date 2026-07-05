package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vv2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ hw2 F;

    public /* synthetic */ vv2(hw2 hw2Var, int i) {
        this.E = i;
        this.F = hw2Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        hw2 hw2Var = this.F;
        switch (i) {
            case 0:
                cpk.u(hw2Var.D, (String) obj);
                return ieiVar;
            case 1:
                File file = (File) obj;
                if (file != null) {
                    hw2Var.O(file, ChatEvents$AttachmentSource.CAMERA);
                }
                return ieiVar;
            case 2:
                String str = (String) obj;
                str.getClass();
                if (hw2Var.Q(str)) {
                    str = "";
                }
                yih yihVar = hw2Var.D;
                dfh dfhVarG = yihVar.g();
                try {
                    dfhVarG.c(kkh.g(dfhVarG.H), kkh.f(dfhVarG.H), str);
                    yihVar.b(dfhVarG);
                    return ieiVar;
                } finally {
                    yihVar.c();
                }
            default:
                ((r4a) obj).getClass();
                gb9.D(hw2Var.a, null, null, new fj(hw2Var, null, 1), 3);
                return new h83(3);
        }
    }
}
