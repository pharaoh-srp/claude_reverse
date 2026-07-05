package io.sentry;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u4 implements m2 {
    public boolean E;
    public Double F;
    public boolean G;
    public Double H;
    public String I;
    public boolean J;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public x3 P;
    public ConcurrentHashMap Q;

    public u4(w6 w6Var, r7 r7Var) {
        this.G = r7Var.a.booleanValue();
        this.H = r7Var.b;
        this.E = r7Var.d.booleanValue();
        this.F = r7Var.e;
        q7 internalTracesSampler = w6Var.getInternalTracesSampler();
        double dC = io.sentry.util.m.a().c();
        Double profileSessionSampleRate = internalTracesSampler.a.getProfileSessionSampleRate();
        this.M = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dC;
        this.I = w6Var.getProfilingTracesDirPath();
        this.J = w6Var.isProfilingEnabled();
        this.K = w6Var.isContinuousProfilingEnabled();
        this.P = w6Var.getProfileLifecycle();
        this.L = w6Var.getProfilingTracesHz();
        this.N = w6Var.isEnableAppStartProfiling();
        this.O = w6Var.isStartProfilerOnAppStart();
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("profile_sampled");
        yVar.x(a1Var, Boolean.valueOf(this.E));
        yVar.r("profile_sample_rate");
        yVar.x(a1Var, this.F);
        yVar.r("continuous_profile_sampled");
        yVar.x(a1Var, Boolean.valueOf(this.M));
        yVar.r("trace_sampled");
        yVar.x(a1Var, Boolean.valueOf(this.G));
        yVar.r("trace_sample_rate");
        yVar.x(a1Var, this.H);
        yVar.r("profiling_traces_dir_path");
        yVar.x(a1Var, this.I);
        yVar.r("is_profiling_enabled");
        yVar.x(a1Var, Boolean.valueOf(this.J));
        yVar.r("is_continuous_profiling_enabled");
        yVar.x(a1Var, Boolean.valueOf(this.K));
        yVar.r("profile_lifecycle");
        yVar.x(a1Var, this.P.name());
        yVar.r("profiling_traces_hz");
        yVar.x(a1Var, Integer.valueOf(this.L));
        yVar.r("is_enable_app_start_profiling");
        yVar.x(a1Var, Boolean.valueOf(this.N));
        yVar.r("is_start_profiler_on_app_start");
        yVar.x(a1Var, Boolean.valueOf(this.O));
        ConcurrentHashMap concurrentHashMap = this.Q;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                e.b(this.Q, str, yVar, str, a1Var);
            }
        }
        yVar.p();
    }
}
