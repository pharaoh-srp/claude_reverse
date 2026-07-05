package defpackage;

import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ModelId;

/* JADX INFO: loaded from: classes.dex */
public final class n93 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ r93 F;

    public /* synthetic */ n93(r93 r93Var, int i) {
        this.E = i;
        this.F = r93Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        r93 r93Var = this.F;
        switch (i) {
            case 0:
                whd whdVar = (whd) w44.V0(r93Var.a.X0);
                String strC = whdVar != null ? whdVar.c() : null;
                if (strC != null) {
                    return MessageId.m1051boximpl(strC);
                }
                return null;
            default:
                ihf ihfVarH = r93Var.h();
                String strM364getIdi4oh0I = ihfVarH != null ? ihfVarH.a.m364getIdi4oh0I() : null;
                if (strM364getIdi4oh0I != null) {
                    return ModelId.m1058boximpl(strM364getIdi4oh0I);
                }
                return null;
        }
    }
}
