package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class em extends vp4 {
    public List E;
    public /* synthetic */ Object F;
    public final /* synthetic */ vm G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em(vm vmVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = vmVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.h(this);
    }
}
