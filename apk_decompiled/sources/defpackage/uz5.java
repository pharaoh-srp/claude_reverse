package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uz5 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ uz5(kfh kfhVar, int i, c3d c3dVar, q5b q5bVar) {
        this.E = 2;
        this.G = kfhVar;
        this.F = i;
        this.H = c3dVar;
        this.I = q5bVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = this.F;
        iei ieiVar = iei.a;
        Object obj2 = this.I;
        Object obj3 = this.H;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                d79 d79Var = (d79) obj3;
                mvb mvbVar = (mvb) obj2;
                if (obj == ((wz5) obj4)) {
                    sz6.j("A derived state calculation cannot read itself");
                } else if (obj instanceof img) {
                    int i3 = d79Var.a - i2;
                    int iD = mvbVar.d(obj);
                    mvbVar.h(Math.min(i3, iD >= 0 ? mvbVar.c[iD] : Integer.MAX_VALUE), obj);
                }
                break;
            case 1:
                vo8 vo8Var = (vo8) obj4;
                q5b q5bVar = (q5b) obj3;
                c3d c3dVar = (c3d) obj2;
                b3d b3dVar = (b3d) obj;
                int i4 = vo8Var.F;
                rhh rhhVar = vo8Var.E;
                f5i f5iVar = vo8Var.G;
                zjh zjhVar = (zjh) vo8Var.H.a();
                rhhVar.a(ukc.F, oq5.l(b3dVar, i4, f5iVar, zjhVar != null ? zjhVar.a : null, q5bVar.getLayoutDirection() == fu9.F, c3dVar.E), i2, c3dVar.E);
                b3d.k(b3dVar, c3dVar, Math.round(-rhhVar.a.h()), 0);
                break;
            default:
                kfh kfhVar = (kfh) obj4;
                c3d c3dVar2 = (c3d) obj3;
                b3d b3dVar2 = (b3d) obj;
                kfhVar.u1(b3dVar2, this.F, c3dVar2.F, kfhVar.X.d().H, ((q5b) obj2).getLayoutDirection());
                b3d.k(b3dVar2, c3dVar2, 0, -kfhVar.b0.a.h());
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ uz5(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.E = i2;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.F = i;
    }
}
