package defpackage;

import com.anthropic.claude.conway.f;

/* JADX INFO: loaded from: classes2.dex */
public final class vx4 extends vp4 {
    public f E;
    public /* synthetic */ Object F;
    public final /* synthetic */ f G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx4(f fVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = fVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return f.P(this.G, null, this);
    }
}
