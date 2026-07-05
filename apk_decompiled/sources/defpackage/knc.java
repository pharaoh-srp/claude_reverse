package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class knc extends hqb implements pu9 {
    public float S;
    public float T;
    public float U;
    public float V;
    public boolean W;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        int iM0 = q5bVar.M0(this.U) + q5bVar.M0(this.S);
        int iM02 = q5bVar.M0(this.V) + q5bVar.M0(this.T);
        c3d c3dVarU = h5bVar.u(sl4.i(-iM0, -iM02, j));
        return q5bVar.U(sl4.g(c3dVarU.E + iM0, j), sl4.f(c3dVarU.F + iM02, j), nm6.E, new vk3(this, 21, c3dVarU));
    }
}
