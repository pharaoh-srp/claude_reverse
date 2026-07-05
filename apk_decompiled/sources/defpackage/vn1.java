package defpackage;

import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class vn1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ dae F;

    public /* synthetic */ vn1(int i, dae daeVar) {
        this.E = i;
        this.F = daeVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        dae daeVar = this.F;
        switch (i) {
            case 0:
                ModelId modelId = (ModelId) obj;
                daeVar.E = modelId != null ? modelId.m1064unboximpl() : null;
                return ieiVar;
            case 1:
                ThinkingEffort thinkingEffort = (ThinkingEffort) obj;
                daeVar.E = thinkingEffort != null ? thinkingEffort.m1141unboximpl() : null;
                return ieiVar;
            case 2:
                ThinkingMode thinkingMode = (ThinkingMode) obj;
                daeVar.E = thinkingMode != null ? thinkingMode.m1149unboximpl() : null;
                return ieiVar;
            default:
                Object obj2 = daeVar.E;
                if (obj2 != null) {
                    ((a7d) obj2).d.set(true);
                    return ieiVar;
                }
                x44.o0("listener");
                throw null;
        }
    }
}
