package defpackage;

import com.anthropic.claude.api.model.ModelSelectorState;

/* JADX INFO: loaded from: classes2.dex */
public final class rpb extends vp4 {
    public String E;
    public String F;
    public ModelSelectorState G;
    public /* synthetic */ Object H;
    public final /* synthetic */ spb I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpb(spb spbVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = spbVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.d(null, null, this);
    }
}
