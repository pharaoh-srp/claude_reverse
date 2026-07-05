package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class jne implements ne4, cz5 {
    public hjh A0;
    public long B0;
    public long C0;
    public long D0;
    public int E;
    public float E0;
    public int F;
    public int F0;
    public wub G;
    public int G0;
    public int H;
    public Object H0;
    public Object I0;
    public boolean J;
    public pug K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public jy1 h0;
    public jy1 j0;
    public final long k0;
    public jy1 l0;
    public e0g m0;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public float r0;
    public float s0;
    public float t0;
    public float u0;
    public long v0;
    public float w0;
    public long x0;
    public jy1 y0;
    public xt7 z0;
    public float I = 1.0f;
    public float U = Float.NaN;
    public float V = Float.NaN;
    public float W = Float.NaN;
    public float X = Float.NaN;
    public float Y = Float.NaN;
    public float Z = Float.NaN;
    public float a0 = Float.NaN;
    public float b0 = Float.NaN;
    public float c0 = Float.NaN;
    public float d0 = Float.NaN;
    public float e0 = Float.NaN;
    public float f0 = Float.NaN;
    public long g0 = d54.b;
    public long i0 = d54.g;

    public jne() {
        long j = d54.h;
        this.k0 = j;
        this.m0 = zni.b;
        this.n0 = 1.0f;
        this.o0 = 1.0f;
        this.p0 = 1.0f;
        this.v0 = d5i.b;
        this.x0 = j;
        long j2 = clh.c;
        this.B0 = j2;
        this.C0 = j2;
        this.D0 = j2;
        this.E0 = Float.NaN;
        this.F0 = 0;
    }

    public final void a(yig yigVar, eug eugVar) {
        this.H |= 16;
        int i = this.F;
        int i2 = 1318433304 ^ i;
        int i3 = this.E;
        jne jneVar = kne.a;
        this.E = Integer.rotateLeft(i3, 3) ^ i2;
        wub wubVar = this.G;
        if (wubVar == null) {
            wubVar = new wub();
            this.G = wubVar;
        }
        wubVar.a(i);
        this.F = 0;
        if (this.J) {
            eugVar.a(this);
        } else {
            pug pugVar = this.K;
            pugVar.getClass();
            w1c w1cVar = pugVar.Y;
            if (w1cVar == null) {
                w1cVar = new w1c(pugVar);
                pugVar.Y = w1cVar;
            }
            w1cVar.h(this.E ^ this.F, eugVar, yigVar, yigVar);
        }
        this.F = wubVar.f(wubVar.b - 1) + 1;
        this.E = Integer.rotateRight(this.E ^ i2, 3);
    }

    public final void b(long j) {
        this.H |= 2;
        this.i0 = j;
        this.j0 = null;
    }

    public final void c(float f, long j) {
        this.H |= 3;
        boolean zB = va6.b(f, Float.NaN);
        float fCeil = MTTypesetterKt.kLineSkipLimitMultiplier;
        if (!zB) {
            fCeil = va6.b(f, MTTypesetterKt.kLineSkipLimitMultiplier) ? 1.0f : (float) Math.ceil(f * this.I);
        }
        this.T = fCeil;
        this.H |= 2;
        this.g0 = j;
        this.h0 = null;
    }

    public final void d(jne jneVar) {
        jneVar.x0 = this.x0;
        jneVar.y0 = this.y0;
        jneVar.z0 = this.z0;
        jneVar.A0 = this.A0;
        jneVar.B0 = this.B0;
        jneVar.C0 = this.C0;
        jneVar.D0 = this.D0;
        jneVar.E0 = this.E0;
        jneVar.F0 = this.F0;
        jneVar.G0 = this.G0;
    }

    public final void e(jne jneVar) {
        jneVar.H = this.H;
        jneVar.Y = this.Y;
        jneVar.Z = this.Z;
        jneVar.a0 = this.a0;
        jneVar.b0 = this.b0;
        jneVar.c0 = this.c0;
        jneVar.d0 = this.d0;
        jneVar.e0 = this.e0;
        jneVar.f0 = this.f0;
        jneVar.L = this.L;
        jneVar.M = this.M;
        jneVar.N = this.N;
        jneVar.O = this.O;
        jneVar.P = this.P;
        jneVar.Q = this.Q;
        jneVar.R = this.R;
        jneVar.S = this.S;
        jneVar.T = this.T;
        jneVar.m0 = this.m0;
        jneVar.n0 = this.n0;
        jneVar.o0 = this.o0;
        jneVar.p0 = this.p0;
        jneVar.q0 = this.q0;
        jneVar.r0 = this.r0;
        jneVar.s0 = this.s0;
        jneVar.t0 = this.t0;
        jneVar.u0 = this.u0;
        jneVar.v0 = this.v0;
        jneVar.w0 = this.w0;
        jneVar.g0 = this.g0;
        jneVar.h0 = this.h0;
        jneVar.i0 = this.i0;
        jneVar.j0 = this.j0;
        jneVar.l0 = this.l0;
        jneVar.H0 = this.H0;
        jneVar.I0 = this.I0;
        jneVar.U = this.U;
        jneVar.V = this.V;
        jneVar.W = this.W;
        jneVar.X = this.X;
        d(jneVar);
    }

    public final int f(jne jneVar, int i) {
        int i2 = this.H;
        int i3 = jneVar.H;
        int i4 = i2 ^ i3;
        int i5 = i & i2 & i3;
        if ((i5 & 1) != 0 && (this.L != jneVar.L || this.M != jneVar.M || this.N != jneVar.N || this.O != jneVar.O || this.T != jneVar.T)) {
            i4 |= 1;
        }
        if ((i5 & 8) != 0 && (this.U != jneVar.U || this.V != jneVar.V || this.W != jneVar.W || this.X != jneVar.X || this.P != jneVar.P || this.Q != jneVar.Q || this.R != jneVar.R || this.S != jneVar.S || Float.floatToRawIntBits(this.Y) != Float.floatToRawIntBits(jneVar.Y) || Float.floatToRawIntBits(this.Z) != Float.floatToRawIntBits(jneVar.Z) || Float.floatToRawIntBits(this.a0) != Float.floatToRawIntBits(jneVar.a0) || Float.floatToRawIntBits(this.b0) != Float.floatToRawIntBits(jneVar.b0) || Float.floatToRawIntBits(this.e0) != Float.floatToRawIntBits(jneVar.e0) || Float.floatToRawIntBits(this.f0) != Float.floatToRawIntBits(jneVar.f0) || Float.floatToRawIntBits(this.c0) != Float.floatToRawIntBits(jneVar.c0) || Float.floatToRawIntBits(this.d0) != Float.floatToRawIntBits(jneVar.d0))) {
            i4 |= 8;
        }
        if ((i5 & 2) != 0 && (this.T != jneVar.T || !d54.c(this.g0, jneVar.g0) || !x44.r(this.h0, jneVar.h0) || !d54.c(this.i0, jneVar.i0) || !x44.r(this.j0, jneVar.j0) || !x44.r(this.l0, jneVar.l0) || !x44.r(this.I0, jneVar.I0) || !x44.r(this.H0, jneVar.H0) || !x44.r(this.m0, jneVar.m0))) {
            i4 |= 2;
        }
        if ((i5 & 4) != 0 && (this.n0 != jneVar.n0 || this.o0 != jneVar.o0 || this.p0 != jneVar.p0 || this.q0 != jneVar.q0 || this.r0 != jneVar.r0 || this.s0 != jneVar.s0 || this.t0 != jneVar.t0 || this.u0 != jneVar.u0 || !d5i.a(this.v0, jneVar.v0))) {
            i4 |= 4;
        }
        if (!x44.r(this.m0, jneVar.m0)) {
            i4 |= 6;
        }
        if ((i5 & 64) != 0 && (!d54.c(this.x0, jneVar.x0) || !x44.r(this.y0, jneVar.y0))) {
            i4 |= 64;
        }
        return ((i5 & 32) == 0 || (x44.r(this.z0, jneVar.z0) && x44.r(this.A0, jneVar.A0) && clh.a(this.B0, jneVar.B0) && clh.a(this.C0, jneVar.C0) && clh.a(this.D0, jneVar.D0) && Float.compare(this.E0, jneVar.E0) == 0 && this.F0 == jneVar.F0 && this.G0 == jneVar.G0)) ? i4 : i4 | 96;
    }

    @Override // defpackage.cz5
    public final float getDensity() {
        return this.I;
    }

    public final int h() {
        int i = ((this.G0 & 15360) >> 10) & 7;
        if (i != 0 && i != 1 && i != 2 && i != 65535) {
            c39.a("The given value=" + i + " is not recognized by FontSynthesis.");
        }
        return i;
    }

    public final int j() {
        int i = (this.G0 & 768) >> 8;
        if (i >= 0 && i < 3) {
            return i;
        }
        c39.a("The given value=" + i + " is not recognized by Hyphens.");
        return i;
    }

    public final int k() {
        int i = (this.G0 & 28) >> 2;
        if (i >= 0 && i < 7) {
            return i;
        }
        c39.a("The given value=" + i + " is not recognized by TextAlign.");
        return i;
    }

    @Override // defpackage.cz5
    public final float k0() {
        return 1.0f;
    }

    public final qeh l() {
        int i = ((this.G0 & 114688) >> 14) & 3;
        return i != 0 ? i != 1 ? i != 2 ? new qeh(i) : qeh.d : qeh.c : qeh.b;
    }

    public final int m() {
        int i = (this.G0 & 112) >> 4;
        if (i >= 0 && i < 6) {
            return i;
        }
        c39.a("The given value=" + i + " is not recognized by TextDirection.");
        return i;
    }

    public final void n(eug eugVar, pug pugVar, cz5 cz5Var, boolean z) {
        this.F = 0;
        this.E = 0;
        this.K = pugVar;
        this.I = cz5Var.getDensity();
        this.J = z;
        eugVar.a(this);
        this.K = null;
        this.J = false;
    }

    @Override // defpackage.ne4
    public final Object u0(fvd fvdVar) {
        pug pugVar = this.K;
        pugVar.getClass();
        return yb5.o(pugVar, fvdVar);
    }
}
