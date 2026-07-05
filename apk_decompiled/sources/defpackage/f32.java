package defpackage;

import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.types.strings.ModelId;

/* JADX INFO: loaded from: classes2.dex */
public final class f32 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ ModelSelectorEntry G;

    public /* synthetic */ f32(bz7 bz7Var, ModelSelectorEntry modelSelectorEntry, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = modelSelectorEntry;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        ModelSelectorEntry modelSelectorEntry = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(ModelId.m1058boximpl(modelSelectorEntry.m364getIdi4oh0I()));
                break;
            default:
                bz7Var.invoke(ModelId.m1058boximpl(modelSelectorEntry.m364getIdi4oh0I()));
                break;
        }
        return ieiVar;
    }
}
