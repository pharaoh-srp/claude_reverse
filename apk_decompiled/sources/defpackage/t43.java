package defpackage;

import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes.dex */
public final class t43 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t53 F;

    public /* synthetic */ t43(t53 t53Var, int i) {
        this.E = i;
        this.F = t53Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                String strC = t53Var.r.c();
                String strM1052constructorimpl = strC != null ? MessageId.m1052constructorimpl(strC) : null;
                if (strM1052constructorimpl != null) {
                    return MessageId.m1051boximpl(strM1052constructorimpl);
                }
                return null;
            case 1:
                String strE = t53Var.g0.e();
                if (strE != null) {
                    return ModelId.m1058boximpl(strE);
                }
                return null;
            case 2:
                uhd uhdVarM0 = t53Var.M0();
                String strC2 = uhdVarM0 != null ? uhdVarM0.c() : null;
                if (strC2 != null) {
                    return MessageId.m1051boximpl(strC2);
                }
                return null;
            default:
                skd skdVarQ0 = t53Var.Q0();
                String str = skdVarQ0 != null ? skdVarQ0.a : null;
                if (str != null) {
                    return ProjectId.m1079boximpl(str);
                }
                return null;
        }
    }
}
