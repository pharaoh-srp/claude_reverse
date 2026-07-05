package io.sentry;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class v3 implements m2 {
    public io.sentry.protocol.w F;
    public io.sentry.protocol.w G;
    public io.sentry.protocol.u H;
    public final Map I;
    public String J;
    public String K;
    public String L;
    public String M;
    public double N;
    public final File O;
    public io.sentry.protocol.profiling.a Q;
    public ConcurrentHashMap R;
    public String P = null;
    public io.sentry.protocol.f E = null;

    public v3(io.sentry.protocol.w wVar, io.sentry.protocol.w wVar2, File file, AbstractMap abstractMap, Double d, String str, w6 w6Var) {
        this.F = wVar;
        this.G = wVar2;
        this.O = file;
        this.I = abstractMap;
        this.H = w6Var.getSdkVersion();
        this.K = w6Var.getRelease() != null ? w6Var.getRelease() : "";
        this.L = w6Var.getEnvironment();
        this.J = str;
        this.M = "2";
        this.N = d.doubleValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj;
        return this.E == v3Var.E && Objects.equals(this.F, v3Var.F) && Objects.equals(this.G, v3Var.G) && Objects.equals(this.H, v3Var.H) && Objects.equals(this.I, v3Var.I) && Objects.equals(this.J, v3Var.J) && Objects.equals(this.K, v3Var.K) && Objects.equals(this.L, v3Var.L) && Objects.equals(this.M, v3Var.M) && Objects.equals(this.P, v3Var.P) && Objects.equals(this.R, v3Var.R) && this.Q == v3Var.Q;
    }

    public final int hashCode() {
        return Objects.hash(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.P, this.Q, this.R);
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        if (this.E != null) {
            yVar.r("debug_meta");
            yVar.x(a1Var, this.E);
        }
        yVar.r("profiler_id");
        yVar.x(a1Var, this.F);
        yVar.r("chunk_id");
        yVar.x(a1Var, this.G);
        if (this.H != null) {
            yVar.r("client_sdk");
            yVar.x(a1Var, this.H);
        }
        Map map = this.I;
        if (!map.isEmpty()) {
            String str = ((io.sentry.vendor.gson.stream.c) yVar.F).H;
            yVar.u("");
            yVar.r("measurements");
            yVar.x(a1Var, map);
            yVar.u(str);
        }
        yVar.r("platform");
        yVar.x(a1Var, this.J);
        yVar.r(BuildConfig.BUILD_TYPE);
        yVar.x(a1Var, this.K);
        if (this.L != null) {
            yVar.r("environment");
            yVar.x(a1Var, this.L);
        }
        yVar.r("version");
        yVar.x(a1Var, this.M);
        if (this.P != null) {
            yVar.r("sampled_profile");
            yVar.x(a1Var, this.P);
        }
        yVar.r("timestamp");
        yVar.x(a1Var, BigDecimal.valueOf(this.N).setScale(6, RoundingMode.DOWN));
        if (this.Q != null) {
            yVar.r("profile");
            yVar.x(a1Var, this.Q);
        }
        ConcurrentHashMap concurrentHashMap = this.R;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                e.b(this.R, str2, yVar, str2, a1Var);
            }
        }
        yVar.p();
    }
}
