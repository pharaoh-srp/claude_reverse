package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o8g extends tu9 {
    public mb0 S;
    public boolean V;
    public long T = -9223372034707292160L;
    public long U = sl4.b(0, 0, 0, 0, 15);
    public final lsc W = mpk.P(null);

    public o8g(mb0 mb0Var) {
        this.S = mb0Var;
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        c3d c3dVarU;
        char c;
        long j2;
        m8g m8gVar;
        long jD;
        m8g m8gVar2;
        if (q5bVar.n0()) {
            this.U = j;
            this.V = true;
            c3dVarU = h5bVar.u(j);
        } else {
            c3dVarU = h5bVar.u(this.V ? this.U : j);
        }
        c3d c3dVar = c3dVarU;
        long j3 = (((long) c3dVar.F) & 4294967295L) | (((long) c3dVar.E) << 32);
        if (q5bVar.n0()) {
            this.T = j3;
            c = ' ';
            jD = j3;
            j2 = jD;
        } else {
            long j4 = !g79.b(this.T, -9223372034707292160L) ? this.T : j3;
            lsc lscVar = this.W;
            m8g m8gVar3 = (m8g) lscVar.getValue();
            if (m8gVar3 != null) {
                a80 a80Var = m8gVar3.a;
                c = ' ';
                j2 = j3;
                boolean z = (g79.b(j4, ((g79) a80Var.e()).a) || a80Var.f()) ? false : true;
                if (!g79.b(j4, ((g79) a80Var.e.getValue()).a) || z) {
                    m8gVar3.b = ((g79) a80Var.e()).a;
                    m8gVar2 = m8gVar3;
                    gb9.D(d1(), null, null, new e9(m8gVar2, j4, this, null, 5), 3);
                } else {
                    m8gVar2 = m8gVar3;
                }
                m8gVar = m8gVar2;
            } else {
                long j5 = j4;
                c = ' ';
                j2 = j3;
                m8gVar = new m8g(new a80(new g79(j5), dgj.m, new g79(4294967297L), 8), j5);
            }
            lscVar.setValue(m8gVar);
            jD = sl4.d(j, ((g79) m8gVar.a.e()).a);
        }
        int i = (int) (jD >> c);
        int i2 = (int) (jD & 4294967295L);
        return q5bVar.U(i, i2, nm6.E, new n8g(this, j2, i, i2, q5bVar, c3dVar));
    }

    @Override // defpackage.hqb
    public final void h1() {
        this.T = -9223372034707292160L;
        this.V = false;
    }

    @Override // defpackage.hqb
    public final void j1() {
        this.W.setValue(null);
    }
}
