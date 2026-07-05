package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gph extends hqb implements pu9 {
    public w79 S;
    public boolean T;
    public yig U;
    public boolean V;
    public a80 W;
    public a80 X;
    public float Y;
    public float Z;

    @Override // defpackage.pu9
    public final p5b b(q5b q5bVar, h5b h5bVar, long j) {
        float f = me7.z;
        int i = 0;
        int i2 = 1;
        float fQ0 = q5bVar.q0(this.V ? me7.s : ((h5bVar.a(rl4.h(j)) != 0 && h5bVar.o(rl4.g(j)) != 0) || this.T) ? q0h.a : q0h.b);
        a80 a80Var = this.X;
        int iFloatValue = (int) (a80Var != null ? ((Number) a80Var.e()).floatValue() : fQ0);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            d39.a("width and height must be >= 0");
        }
        c3d c3dVarU = h5bVar.u(sl4.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fQ02 = q5bVar.q0((q0h.d - q5bVar.g0(fQ0)) / 2.0f);
        float fQ03 = q5bVar.q0((q0h.c - q0h.a) - q0h.e);
        boolean z = this.V;
        if (z && this.T) {
            fQ02 = fQ03 - q5bVar.q0(f);
        } else if (z && !this.T) {
            fQ02 = q5bVar.q0(f);
        } else if (this.T) {
            fQ02 = fQ03;
        }
        a80 a80Var2 = this.X;
        tp4 tp4Var = null;
        if (!x44.p(a80Var2 != null ? (Float) a80Var2.e.getValue() : null, fQ0)) {
            gb9.D(d1(), null, null, new fph(this, fQ0, tp4Var, i), 3);
        }
        a80 a80Var3 = this.W;
        if (!x44.p(a80Var3 != null ? (Float) a80Var3.e.getValue() : null, fQ02)) {
            gb9.D(d1(), null, null, new fph(this, fQ02, tp4Var, i2), 3);
        }
        if (Float.isNaN(this.Z) && Float.isNaN(this.Y)) {
            this.Z = fQ0;
            this.Y = fQ02;
        }
        return q5bVar.U(iFloatValue, iFloatValue, nm6.E, new k10(c3dVarU, this, fQ02));
    }

    @Override // defpackage.hqb
    public final boolean e1() {
        return false;
    }

    @Override // defpackage.hqb
    public final void h1() {
        gb9.D(d1(), null, null, new bff(this, null, 10), 3);
    }

    @Override // defpackage.hqb
    public final void j1() {
        this.W = null;
        this.X = null;
        this.Z = Float.NaN;
        this.Y = Float.NaN;
    }
}
