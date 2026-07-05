package io.sentry;

import java.util.concurrent.ConcurrentHashMap;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class p7 implements m2 {
    public final io.sentry.protocol.w E;
    public final String F;
    public final String G;
    public final String H;
    public final String I;
    public final String J;
    public final String K;
    public final String L;
    public final String M;
    public final io.sentry.protocol.w N;
    public ConcurrentHashMap O;

    public p7(io.sentry.protocol.w wVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.w wVar2, String str8) {
        this.E = wVar;
        this.F = str;
        this.G = str2;
        this.H = str3;
        this.I = str4;
        this.J = str5;
        this.K = str6;
        this.M = str7;
        this.N = wVar2;
        this.L = str8;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("trace_id");
        yVar.x(a1Var, this.E);
        yVar.r("public_key");
        yVar.A(this.F);
        String str = this.G;
        if (str != null) {
            yVar.r(BuildConfig.BUILD_TYPE);
            yVar.A(str);
        }
        String str2 = this.H;
        if (str2 != null) {
            yVar.r("environment");
            yVar.A(str2);
        }
        String str3 = this.I;
        if (str3 != null) {
            yVar.r("user_id");
            yVar.A(str3);
        }
        String str4 = this.J;
        if (str4 != null) {
            yVar.r("transaction");
            yVar.A(str4);
        }
        String str5 = this.K;
        if (str5 != null) {
            yVar.r("sample_rate");
            yVar.A(str5);
        }
        String str6 = this.L;
        if (str6 != null) {
            yVar.r("sample_rand");
            yVar.A(str6);
        }
        String str7 = this.M;
        if (str7 != null) {
            yVar.r("sampled");
            yVar.A(str7);
        }
        io.sentry.protocol.w wVar = this.N;
        if (wVar != null) {
            yVar.r("replay_id");
            yVar.x(a1Var, wVar);
        }
        ConcurrentHashMap concurrentHashMap = this.O;
        if (concurrentHashMap != null) {
            for (String str8 : concurrentHashMap.keySet()) {
                e.b(this.O, str8, yVar, str8, a1Var);
            }
        }
        yVar.p();
    }
}
