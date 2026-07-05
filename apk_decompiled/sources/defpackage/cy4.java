package defpackage;

import com.anthropic.claude.conway.f;

/* JADX INFO: loaded from: classes2.dex */
public final class cy4 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ f F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy4(f fVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = fVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return f.b0(this.F, this);
    }
}
