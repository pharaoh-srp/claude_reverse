package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jlg extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ um F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlg(um umVar, tp4 tp4Var) {
        super(tp4Var);
        this.F = umVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.a(0, this);
    }
}
