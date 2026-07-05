package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q9d extends ts9 implements zy7 {
    public final /* synthetic */ cae F;
    public final /* synthetic */ r9d G;
    public final /* synthetic */ c79 H;
    public final /* synthetic */ long I;
    public final /* synthetic */ long J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9d(cae caeVar, r9d r9dVar, c79 c79Var, long j, long j2) {
        super(0);
        this.F = caeVar;
        this.G = r9dVar;
        this.H = c79Var;
        this.I = j;
        this.J = j2;
    }

    @Override // defpackage.zy7
    public final Object a() {
        r9d r9dVar = this.G;
        this.F.E = r9dVar.getPositionProvider().a(this.H, this.I, r9dVar.getParentLayoutDirection(), this.J);
        return iei.a;
    }
}
