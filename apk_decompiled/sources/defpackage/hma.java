package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class hma extends fma implements h5b {
    public final m5c S;
    public LinkedHashMap U;
    public p5b W;
    public final mvb X;
    public long T = 0;
    public final ima V = new ima(this);

    public hma(m5c m5cVar) {
        this.S = m5cVar;
        mvb mvbVar = vac.a;
        this.X = new mvb();
    }

    public static final void N0(hma hmaVar, p5b p5bVar) {
        LinkedHashMap linkedHashMap;
        if (p5bVar != null) {
            hmaVar.b0((((long) p5bVar.a()) & 4294967295L) | (((long) p5bVar.b()) << 32));
        } else {
            hmaVar.b0(0L);
        }
        if (!x44.r(hmaVar.W, p5bVar) && p5bVar != null && ((((linkedHashMap = hmaVar.U) != null && !linkedHashMap.isEmpty()) || !p5bVar.c().isEmpty()) && !x44.r(p5bVar.c(), hmaVar.U))) {
            lma lmaVar = hmaVar.S.S.t().q;
            lmaVar.getClass();
            lmaVar.W.f();
            LinkedHashMap linkedHashMap2 = hmaVar.U;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                hmaVar.U = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(p5bVar.c());
        }
        hmaVar.W = p5bVar;
    }

    @Override // defpackage.fma
    public final fma A0() {
        m5c m5cVar = this.S.W;
        if (m5cVar != null) {
            return m5cVar.f1();
        }
        return null;
    }

    @Override // defpackage.fma
    public final long D0() {
        return this.T;
    }

    @Override // defpackage.fma
    public final void I0() {
        Z(this.T, MTTypesetterKt.kLineSkipLimitMultiplier, null);
    }

    public final long O0() {
        return (((long) this.E) << 32) | (((long) this.F) & 4294967295L);
    }

    public void R0() {
        x0().d();
    }

    public final void V0(long j) {
        if (!y69.b(this.T, j)) {
            this.T = j;
            m5c m5cVar = this.S;
            lma lmaVar = m5cVar.S.t().q;
            if (lmaVar != null) {
                lmaVar.l0();
            }
            fma.G0(m5cVar);
        }
        if (this.O) {
            return;
        }
        l0(x0());
    }

    public final long X0(hma hmaVar, boolean z) {
        long jD = 0;
        while (!this.equals(hmaVar)) {
            if (!this.M || !z) {
                jD = y69.d(jD, this.T);
            }
            m5c m5cVar = this.S.W;
            m5cVar.getClass();
            this = m5cVar.f1();
            this.getClass();
        }
        return jD;
    }

    @Override // defpackage.c3d
    public final void Z(long j, float f, bz7 bz7Var) {
        V0(j);
        if (this.N) {
            return;
        }
        R0();
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.S.getDensity();
    }

    @Override // defpackage.xa9
    public final fu9 getLayoutDirection() {
        return this.S.S.e0;
    }

    @Override // defpackage.cz5
    public final float k0() {
        return this.S.k0();
    }

    @Override // defpackage.fma, defpackage.xa9
    public final boolean n0() {
        return true;
    }

    @Override // defpackage.fma
    public final fma o0() {
        m5c m5cVar = this.S.V;
        if (m5cVar != null) {
            return m5cVar.f1();
        }
        return null;
    }

    @Override // defpackage.fma
    public final cu9 s0() {
        return this.V;
    }

    @Override // defpackage.fma
    public final boolean u0() {
        return this.W != null;
    }

    @Override // defpackage.fma
    public final av9 v0() {
        return this.S.S;
    }

    @Override // defpackage.fma
    public final p5b x0() {
        p5b p5bVar = this.W;
        if (p5bVar != null) {
            return p5bVar;
        }
        throw sq6.z("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.c3d, defpackage.h5b
    public final Object z() {
        return this.S.z();
    }
}
