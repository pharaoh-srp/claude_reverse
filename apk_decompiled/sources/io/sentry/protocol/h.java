package io.sentry.protocol;

import io.sentry.a1;
import io.sentry.m2;
import io.sentry.q3;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h implements m2 {
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public String[] K;
    public Float L;
    public Boolean M;
    public Boolean N;
    public g O;
    public Boolean P;
    public Long Q;
    public Long R;
    public Long S;
    public Boolean T;
    public Long U;
    public Long V;
    public Long W;
    public Long X;
    public Integer Y;
    public Integer Z;
    public Float a0;
    public Integer b0;
    public Date c0;
    public TimeZone d0;
    public String e0;
    public String f0;
    public String g0;
    public Float h0;
    public Integer i0;
    public Double j0;
    public String k0;
    public String l0;
    public ConcurrentHashMap m0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (io.sentry.p.h(this.E, hVar.E) && io.sentry.p.h(this.F, hVar.F) && io.sentry.p.h(this.G, hVar.G) && io.sentry.p.h(this.H, hVar.H) && io.sentry.p.h(this.I, hVar.I) && io.sentry.p.h(this.J, hVar.J) && Arrays.equals(this.K, hVar.K) && io.sentry.p.h(this.L, hVar.L) && io.sentry.p.h(this.M, hVar.M) && io.sentry.p.h(this.N, hVar.N) && this.O == hVar.O && io.sentry.p.h(this.P, hVar.P) && io.sentry.p.h(this.Q, hVar.Q) && io.sentry.p.h(this.R, hVar.R) && io.sentry.p.h(this.S, hVar.S) && io.sentry.p.h(this.T, hVar.T) && io.sentry.p.h(this.U, hVar.U) && io.sentry.p.h(this.V, hVar.V) && io.sentry.p.h(this.W, hVar.W) && io.sentry.p.h(this.X, hVar.X) && io.sentry.p.h(this.Y, hVar.Y) && io.sentry.p.h(this.Z, hVar.Z) && io.sentry.p.h(this.a0, hVar.a0) && io.sentry.p.h(this.b0, hVar.b0) && io.sentry.p.h(this.c0, hVar.c0) && io.sentry.p.h(this.e0, hVar.e0) && io.sentry.p.h(this.f0, hVar.f0) && io.sentry.p.h(this.g0, hVar.g0) && io.sentry.p.h(this.h0, hVar.h0) && io.sentry.p.h(this.i0, hVar.i0) && io.sentry.p.h(this.j0, hVar.j0) && io.sentry.p.h(this.k0, hVar.k0) && io.sentry.p.h(this.l0, hVar.l0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{this.E, this.F, this.G, this.H, this.I, this.J, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.a0, this.b0, this.c0, this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0}) * 31) + Arrays.hashCode(this.K);
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        io.sentry.y yVar = (io.sentry.y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("name");
            yVar.A(this.E);
        }
        if (this.F != null) {
            yVar.r("manufacturer");
            yVar.A(this.F);
        }
        if (this.G != null) {
            yVar.r("brand");
            yVar.A(this.G);
        }
        if (this.H != null) {
            yVar.r("family");
            yVar.A(this.H);
        }
        if (this.I != null) {
            yVar.r("model");
            yVar.A(this.I);
        }
        if (this.J != null) {
            yVar.r("model_id");
            yVar.A(this.J);
        }
        if (this.K != null) {
            yVar.r("archs");
            yVar.x(a1Var, this.K);
        }
        if (this.L != null) {
            yVar.r("battery_level");
            yVar.z(this.L);
        }
        if (this.M != null) {
            yVar.r("charging");
            yVar.y(this.M);
        }
        if (this.N != null) {
            yVar.r("online");
            yVar.y(this.N);
        }
        if (this.O != null) {
            yVar.r("orientation");
            yVar.x(a1Var, this.O);
        }
        if (this.P != null) {
            yVar.r("simulator");
            yVar.y(this.P);
        }
        if (this.Q != null) {
            yVar.r("memory_size");
            yVar.z(this.Q);
        }
        if (this.R != null) {
            yVar.r("free_memory");
            yVar.z(this.R);
        }
        if (this.S != null) {
            yVar.r("usable_memory");
            yVar.z(this.S);
        }
        if (this.T != null) {
            yVar.r("low_memory");
            yVar.y(this.T);
        }
        if (this.U != null) {
            yVar.r("storage_size");
            yVar.z(this.U);
        }
        if (this.V != null) {
            yVar.r("free_storage");
            yVar.z(this.V);
        }
        if (this.W != null) {
            yVar.r("external_storage_size");
            yVar.z(this.W);
        }
        if (this.X != null) {
            yVar.r("external_free_storage");
            yVar.z(this.X);
        }
        if (this.Y != null) {
            yVar.r("screen_width_pixels");
            yVar.z(this.Y);
        }
        if (this.Z != null) {
            yVar.r("screen_height_pixels");
            yVar.z(this.Z);
        }
        if (this.a0 != null) {
            yVar.r("screen_density");
            yVar.z(this.a0);
        }
        if (this.b0 != null) {
            yVar.r("screen_dpi");
            yVar.z(this.b0);
        }
        if (this.c0 != null) {
            yVar.r("boot_time");
            yVar.x(a1Var, this.c0);
        }
        if (this.d0 != null) {
            yVar.r("timezone");
            yVar.x(a1Var, this.d0);
        }
        if (this.e0 != null) {
            yVar.r("id");
            yVar.A(this.e0);
        }
        if (this.g0 != null) {
            yVar.r("connection_type");
            yVar.A(this.g0);
        }
        if (this.h0 != null) {
            yVar.r("battery_temperature");
            yVar.z(this.h0);
        }
        if (this.f0 != null) {
            yVar.r("locale");
            yVar.A(this.f0);
        }
        if (this.i0 != null) {
            yVar.r("processor_count");
            yVar.z(this.i0);
        }
        if (this.j0 != null) {
            yVar.r("processor_frequency");
            yVar.z(this.j0);
        }
        if (this.k0 != null) {
            yVar.r("cpu_description");
            yVar.A(this.k0);
        }
        if (this.l0 != null) {
            yVar.r("chipset");
            yVar.A(this.l0);
        }
        ConcurrentHashMap concurrentHashMap = this.m0;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                io.sentry.e.b(this.m0, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
