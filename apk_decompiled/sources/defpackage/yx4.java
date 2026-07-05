package defpackage;

import com.anthropic.claude.conway.f;

/* JADX INFO: loaded from: classes2.dex */
public final class yx4 extends vp4 {
    public dae E;
    public dae F;
    public /* synthetic */ Object G;
    public final /* synthetic */ f H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx4(f fVar, tp4 tp4Var) {
        super(tp4Var);
        this.H = fVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return f.Z(this.H, this);
    }
}
