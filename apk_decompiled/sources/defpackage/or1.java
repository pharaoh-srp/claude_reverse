package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class or1 extends hqb implements pu9, ujf {
    public bz7 S;

    public or1(bz7 bz7Var) {
        this.S = bz7Var;
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        e0g e0gVar;
        boolean z;
        m5c m5cVarU = yfd.U(this, 2);
        if (m5cVarU.l0) {
            e0gVar = m5cVarU.j0;
            z = m5cVarU.k0;
        } else {
            xre xreVar = xn5.b;
            if (xreVar == null) {
                xn5.b = new xre();
            } else {
                xreVar.a();
            }
            xre xreVar2 = xn5.b;
            xreVar2.getClass();
            xreVar2.W = m5cVarU.S.d0;
            xreVar2.V = csg.T(m5cVarU.G);
            rcg rcgVarZ = fd9.Z();
            bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
            rcg rcgVarK0 = fd9.k0(rcgVarZ);
            try {
                this.S.invoke(xreVar2);
                fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                e0gVar = xreVar2.S;
                z = xreVar2.T;
            } catch (Throwable th) {
                fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
                throw th;
            }
        }
        if (z) {
            ckf.u(ekfVar, e0gVar);
        }
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        c3d c3dVarU = h5bVar.u(j);
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new j40(c3dVarU, 4, this));
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.ujf
    public final boolean k() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.S + ')';
    }
}
