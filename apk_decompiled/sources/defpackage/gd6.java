package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gd6 extends hqb implements pu9 {
    public q28 S;
    public pz7 T;
    public ukc U;
    public boolean V;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        Object objO0;
        c3d c3dVarU = h5bVar.u(j);
        boolean z = true;
        if (!q5bVar.n0() || !this.V) {
            cpc cpcVar = (cpc) this.T.invoke(new g79((((long) c3dVarU.E) << 32) | (((long) c3dVarU.F) & 4294967295L)), new rl4(j));
            vq5 vq5Var = (vq5) cpcVar.E;
            Object obj = cpcVar.F;
            if (!vq5Var.c(obj) && (objO0 = w44.O0(0, vq5Var.a)) != null) {
                obj = objO0;
            }
            ((ry) this.S.F).h(vq5Var, obj);
            this.V = true;
        }
        if (!q5bVar.n0() && !this.V) {
            z = false;
        }
        this.V = z;
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new ny4(q5bVar, this, c3dVarU, 8));
    }

    @Override // defpackage.hqb
    public final void i1() {
        this.V = false;
    }
}
