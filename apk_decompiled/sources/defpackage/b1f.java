package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b1f implements Cloneable {
    public long E = 0;
    public k1f F;
    public Float G;
    public k1f H;
    public Float I;
    public n0f J;
    public Float K;
    public n0f[] L;
    public n0f M;
    public Float N;
    public e0f O;
    public ArrayList P;
    public n0f Q;
    public Integer R;
    public Boolean S;
    public c61 T;
    public String U;
    public String V;
    public String W;
    public Boolean X;
    public Boolean Y;
    public k1f Z;
    public Float a0;
    public String b0;
    public String c0;
    public k1f d0;
    public Float e0;
    public k1f f0;
    public Float g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;

    public static b1f a() {
        b1f b1fVar = new b1f();
        b1fVar.E = -1L;
        e0f e0fVar = e0f.F;
        b1fVar.F = e0fVar;
        b1fVar.h0 = 1;
        Float fValueOf = Float.valueOf(1.0f);
        b1fVar.G = fValueOf;
        b1fVar.H = null;
        b1fVar.I = fValueOf;
        b1fVar.J = new n0f(1.0f);
        b1fVar.i0 = 1;
        b1fVar.j0 = 1;
        b1fVar.K = Float.valueOf(4.0f);
        b1fVar.L = null;
        b1fVar.M = new n0f(MTTypesetterKt.kLineSkipLimitMultiplier);
        b1fVar.N = fValueOf;
        b1fVar.O = e0fVar;
        b1fVar.P = null;
        b1fVar.Q = new n0f(7, 12.0f);
        b1fVar.R = 400;
        b1fVar.k0 = 1;
        b1fVar.l0 = 1;
        b1fVar.m0 = 1;
        b1fVar.n0 = 1;
        Boolean bool = Boolean.TRUE;
        b1fVar.S = bool;
        b1fVar.T = null;
        b1fVar.U = null;
        b1fVar.V = null;
        b1fVar.W = null;
        b1fVar.X = bool;
        b1fVar.Y = bool;
        b1fVar.Z = e0fVar;
        b1fVar.a0 = fValueOf;
        b1fVar.b0 = null;
        b1fVar.o0 = 1;
        b1fVar.c0 = null;
        b1fVar.d0 = null;
        b1fVar.e0 = fValueOf;
        b1fVar.f0 = null;
        b1fVar.g0 = fValueOf;
        b1fVar.p0 = 1;
        b1fVar.q0 = 1;
        return b1fVar;
    }

    public final Object clone() {
        b1f b1fVar = (b1f) super.clone();
        n0f[] n0fVarArr = this.L;
        if (n0fVarArr != null) {
            b1fVar.L = (n0f[]) n0fVarArr.clone();
        }
        return b1fVar;
    }
}
