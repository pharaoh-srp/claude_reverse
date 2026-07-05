package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f90 extends ts9 implements bz7 {
    public final /* synthetic */ h90 F;
    public final /* synthetic */ c3d G;
    public final /* synthetic */ long H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f90(h90 h90Var, c3d c3dVar, long j) {
        super(1);
        this.F = h90Var;
        this.G = c3dVar;
        this.H = j;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        tt ttVar = this.F.U.b;
        c3d c3dVar = this.G;
        b3d.j((b3d) obj, c3dVar, ttVar.a((((long) c3dVar.F) & 4294967295L) | (((long) c3dVar.E) << 32), this.H, fu9.E));
        return iei.a;
    }
}
