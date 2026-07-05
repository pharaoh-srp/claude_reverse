package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ln implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ gh2 F;

    public /* synthetic */ ln(gh2 gh2Var, int i) {
        this.E = i;
        this.F = gh2Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        gh2 gh2Var = this.F;
        switch (i) {
            case 0:
                gh2Var.r(new ot6(R.string.audio_permission_required));
                return ieiVar;
            case 1:
                gh2Var.r(new ot6(R.string.audio_permission_required));
                return ieiVar;
            case 2:
                return (esb) ai2.b(gh2Var.l());
            default:
                return (n4i) ai2.b(gh2Var.l());
        }
    }
}
