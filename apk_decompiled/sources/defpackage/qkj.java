package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qkj extends qw5 implements d8d, pu9 {
    public gkj U;
    public boolean V;
    public boolean W;
    public d9f X;
    public bz7 Y;
    public pz7 Z;
    public long a0;
    public final e0h b0;
    public Boolean c0;

    public qkj(gkj gkjVar, boolean z, d9f d9fVar, bz7 bz7Var, pz7 pz7Var) {
        gkjVar.getClass();
        this.U = gkjVar;
        this.V = true;
        this.W = z;
        this.X = d9fVar;
        this.Y = bz7Var;
        this.Z = pz7Var;
        this.a0 = 0L;
        k7h k7hVar = new k7h(this, null, 13);
        t7d t7dVar = a0h.a;
        e0h e0hVar = new e0h(null, null, null, jv5.G);
        e0hVar.V = k7hVar;
        p1(e0hVar);
        this.b0 = e0hVar;
    }

    @Override // defpackage.d8d
    public final void C(t7d t7dVar, u7d u7dVar, long j) {
        t7dVar.getClass();
        this.b0.C(t7dVar, u7dVar, j);
    }

    @Override // defpackage.d8d
    public final void R() {
        this.b0.R();
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        h5bVar.getClass();
        c3d c3dVarU = h5bVar.u(j);
        long jT = csg.T(csg.f(c3dVarU.X(), c3dVarU.S()));
        this.a0 = jT;
        this.U.d(jT);
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new g4(c3dVarU, 16, this));
    }
}
