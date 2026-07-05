package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ai7 extends vp4 {
    public si7 E;
    public String F;
    public String G;
    public /* synthetic */ Object H;
    public final /* synthetic */ bi7 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai7(bi7 bi7Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = bi7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.a(null, null, this);
    }
}
