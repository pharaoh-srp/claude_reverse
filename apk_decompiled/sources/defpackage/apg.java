package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class apg extends vp4 {
    public bpg E;
    public ts9 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ bpg H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apg(bpg bpgVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = bpgVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.h(null, this);
    }
}
