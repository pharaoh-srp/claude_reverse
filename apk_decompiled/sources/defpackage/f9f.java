package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f9f extends hqb implements pu9, ujf {
    public j9f S;
    public boolean T;

    @Override // defpackage.pu9
    public final int A0(fma fmaVar, h5b h5bVar, int i) {
        if (!this.T) {
            i = Integer.MAX_VALUE;
        }
        return h5bVar.Q(i);
    }

    @Override // defpackage.pu9
    public final int N0(fma fmaVar, h5b h5bVar, int i) {
        if (this.T) {
            i = Integer.MAX_VALUE;
        }
        return h5bVar.l(i);
    }

    @Override // defpackage.ujf
    public final void X0(ekf ekfVar) {
        ckf.y(ekfVar);
        final int i = 0;
        final int i2 = 1;
        v8f v8fVar = new v8f(new zy7(this) { // from class: e9f
            public final /* synthetic */ f9f F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int iH;
                int i3 = i;
                f9f f9fVar = this.F;
                switch (i3) {
                    case 0:
                        iH = f9fVar.S.a.h();
                        break;
                    default:
                        iH = f9fVar.S.e.h();
                        break;
                }
                return Float.valueOf(iH);
            }
        }, new zy7(this) { // from class: e9f
            public final /* synthetic */ f9f F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int iH;
                int i3 = i2;
                f9f f9fVar = this.F;
                switch (i3) {
                    case 0:
                        iH = f9fVar.S.a.h();
                        break;
                    default:
                        iH = f9fVar.S.e.h();
                        break;
                }
                return Float.valueOf(iH);
            }
        }, false);
        if (this.T) {
            dkf dkfVar = akf.w;
            wn9 wn9Var = ckf.a[13];
            ekfVar.a(dkfVar, v8fVar);
        } else {
            dkf dkfVar2 = akf.v;
            wn9 wn9Var2 = ckf.a[12];
            ekfVar.a(dkfVar2, v8fVar);
        }
    }

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        iuj.r(j, this.T ? ukc.E : ukc.F);
        c3d c3dVarU = h5bVar.u(rl4.a(0, this.T ? rl4.h(j) : Integer.MAX_VALUE, 0, this.T ? Integer.MAX_VALUE : rl4.g(j), 5, j));
        int i = c3dVarU.E;
        int iH = rl4.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = c3dVarU.F;
        int iG = rl4.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = c3dVarU.F - i2;
        int i4 = c3dVarU.E - i;
        if (!this.T) {
            i3 = i4;
        }
        this.S.g(i3);
        this.S.b.i(this.T ? i2 : i);
        this.S.c.i(this.T ? c3dVarU.F : c3dVarU.E);
        return q5bVar.U(i, i2, nm6.E, new la0(this, i3, c3dVarU));
    }

    @Override // defpackage.pu9
    public final int h(fma fmaVar, h5b h5bVar, int i) {
        if (this.T) {
            i = Integer.MAX_VALUE;
        }
        return h5bVar.o(i);
    }

    @Override // defpackage.pu9
    public final int l0(fma fmaVar, h5b h5bVar, int i) {
        if (!this.T) {
            i = Integer.MAX_VALUE;
        }
        return h5bVar.a(i);
    }
}
