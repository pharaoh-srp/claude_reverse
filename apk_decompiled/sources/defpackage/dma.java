package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dma extends ts9 implements zy7 {
    public final /* synthetic */ fma F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ e3d I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dma(fma fmaVar, long j, long j2, e3d e3dVar) {
        super(0);
        this.F = fmaVar;
        this.G = j;
        this.H = j2;
        this.I = e3dVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        fma fmaVar = this.F;
        fmaVar.F0().E = false;
        fmaVar.F0().F = this.G;
        fmaVar.F0().G = this.H;
        bz7 bz7VarE = this.I.E.e();
        if (bz7VarE != null) {
            bz7VarE.invoke(fmaVar.F0());
        }
        return iei.a;
    }
}
