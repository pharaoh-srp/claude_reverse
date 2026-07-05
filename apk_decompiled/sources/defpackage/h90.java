package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h90 extends tu9 {
    public q5i S;
    public nwb T;
    public i90 U;
    public long V;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        long j2;
        c3d c3dVarU = h5bVar.u(j);
        if (q5bVar.n0()) {
            j2 = (((long) c3dVarU.E) << 32) | (((long) c3dVarU.F) & 4294967295L);
        } else {
            q5i q5iVar = this.S;
            int i = c3dVarU.E;
            if (q5iVar == null) {
                j2 = (((long) i) << 32) | (((long) c3dVarU.F) & 4294967295L);
                this.V = j2;
            } else {
                long j3 = (((long) c3dVarU.F) & 4294967295L) | (((long) i) << 32);
                p5i p5iVarA = q5iVar.a(new g90(this, j3, 0), new g90(this, j3, 1));
                this.U.getClass();
                j2 = ((g79) p5iVarA.getValue()).a;
                this.V = ((g79) p5iVarA.getValue()).a;
            }
        }
        return q5bVar.U((int) (j2 >> 32), (int) (4294967295L & j2), nm6.E, new f90(this, c3dVarU, j2));
    }

    @Override // defpackage.hqb
    public final void j1() {
        this.V = -9223372034707292160L;
    }
}
