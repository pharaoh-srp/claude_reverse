package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class qh8 extends vp4 {
    public mr E;
    public List F;
    public Set G;
    public /* synthetic */ Object H;
    public final /* synthetic */ th8 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh8(th8 th8Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = th8Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.b(null, this);
    }
}
