package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class in1 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ tn1 F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in1(tn1 tn1Var, tp4 tp4Var) {
        super(tp4Var);
        this.F = tn1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.h(this);
    }
}
