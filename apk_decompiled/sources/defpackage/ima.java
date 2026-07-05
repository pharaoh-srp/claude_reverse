package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ima implements cu9 {
    public final hma E;

    public ima(hma hmaVar) {
        this.E = hmaVar;
    }

    @Override // defpackage.cu9
    public final cu9 A() {
        hma hmaVarF1;
        if (!n()) {
            b39.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        m5c m5cVar = ((m5c) this.E.S.S.k0.I).W;
        if (m5cVar == null || (hmaVarF1 = m5cVar.f1()) == null) {
            return null;
        }
        return hmaVarF1.V;
    }

    @Override // defpackage.cu9
    public final long G(cu9 cu9Var, long j) {
        return L(cu9Var, j, true);
    }

    @Override // defpackage.cu9
    public final long H(long j) {
        return fcc.i(this.E.S.H(j), a());
    }

    @Override // defpackage.cu9
    public final l9e J(cu9 cu9Var, boolean z) {
        return this.E.S.J(cu9Var, z);
    }

    @Override // defpackage.cu9
    public final long K(long j) {
        return this.E.S.K(fcc.i(j, a()));
    }

    @Override // defpackage.cu9
    public final long L(cu9 cu9Var, long j, boolean z) {
        boolean z2 = cu9Var instanceof ima;
        hma hmaVar = this.E;
        if (!z2) {
            hma hmaVarG = hkk.g(hmaVar);
            m5c m5cVar = hmaVarG.S;
            long jH = fcc.h(L(hmaVarG.V, j, z), (4294967295L & ((long) Float.floatToRawIntBits((int) (hmaVarG.T & 4294967295L)))) | (Float.floatToRawIntBits((int) (r5 >> 32)) << 32));
            if (!m5cVar.h1().R) {
                b39.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            m5cVar.q1();
            m5c m5cVar2 = m5cVar.W;
            if (m5cVar2 != null) {
                m5cVar = m5cVar2;
            }
            return fcc.i(jH, m5cVar.L(cu9Var, 0L, z));
        }
        hma hmaVar2 = ((ima) cu9Var).E;
        m5c m5cVar3 = hmaVar2.S;
        m5cVar3.q1();
        hma hmaVarF1 = hmaVar.S.d1(m5cVar3).f1();
        if (hmaVarF1 != null) {
            boolean z3 = !z;
            long jC = y69.c(y69.d(hmaVar2.X0(hmaVarF1, z3), yfd.a0(j)), hmaVar.X0(hmaVarF1, z3));
            return (((long) Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        hma hmaVarG2 = hkk.g(hmaVar2);
        boolean z4 = !z;
        long jD = y69.d(y69.d(hmaVar2.X0(hmaVarG2, z4), hmaVarG2.T), yfd.a0(j));
        hma hmaVarG3 = hkk.g(hmaVar);
        long jC2 = y69.c(jD, y69.d(hmaVar.X0(hmaVarG3, z4), hmaVarG3.T));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        m5c m5cVar4 = hmaVarG3.S.W;
        m5cVar4.getClass();
        m5c m5cVar5 = hmaVarG2.S.W;
        m5cVar5.getClass();
        return m5cVar4.L(m5cVar5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), z);
    }

    public final long a() {
        hma hmaVar = this.E;
        hma hmaVarG = hkk.g(hmaVar);
        return fcc.h(L(hmaVarG.V, 0L, true), hmaVar.S.L(hmaVarG.S, 0L, true));
    }

    @Override // defpackage.cu9
    public final long b(long j) {
        return this.E.S.b(fcc.i(j, a()));
    }

    @Override // defpackage.cu9
    public final void h(float[] fArr) {
        this.E.S.h(fArr);
    }

    @Override // defpackage.cu9
    public final void j(cu9 cu9Var, float[] fArr) {
        this.E.S.j(cu9Var, fArr);
    }

    @Override // defpackage.cu9
    public final long k() {
        hma hmaVar = this.E;
        return (((long) hmaVar.E) << 32) | (((long) hmaVar.F) & 4294967295L);
    }

    @Override // defpackage.cu9
    public final boolean n() {
        return this.E.S.h1().R;
    }

    @Override // defpackage.cu9
    public final long q(long j) {
        return this.E.S.q(fcc.i(0L, a()));
    }

    @Override // defpackage.cu9
    public final long w(long j) {
        return fcc.i(this.E.S.w(j), a());
    }
}
