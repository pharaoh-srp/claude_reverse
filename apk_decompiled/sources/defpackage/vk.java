package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vk extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ wk F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(wk wkVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = wkVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.h(this);
    }
}
