package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mq4 extends vp4 {
    public List E;
    public List F;
    public long G;
    public /* synthetic */ Object H;
    public final /* synthetic */ oq4 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq4(oq4 oq4Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = oq4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return oq4.a(this.I, this);
    }
}
