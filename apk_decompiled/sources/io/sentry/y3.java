package io.sentry;

import com.anthropic.claude.api.tasks.TaskSessionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y3 implements m2 {
    public final File E;
    public final Callable F;
    public int G;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public boolean N;
    public String O;
    public String Q;
    public String R;
    public String S;
    public final ArrayList T;
    public String U;
    public String V;
    public String W;
    public String X;
    public String Y;
    public String Z;
    public String a0;
    public String b0;
    public String c0;
    public Date d0;
    public final Map e0;
    public ConcurrentHashMap g0;
    public List P = new ArrayList();
    public String f0 = null;
    public String H = Locale.getDefault().toString();

    public y3(File file, Date date, ArrayList arrayList, String str, String str2, String str3, String str4, int i, String str5, Callable callable, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.E = file;
        this.d0 = date;
        this.O = str5;
        this.F = callable;
        this.G = i;
        this.I = str6 == null ? "" : str6;
        this.J = str7 == null ? "" : str7;
        this.M = str8 != null ? str8 : "";
        this.N = bool != null ? bool.booleanValue() : false;
        this.Q = str9 != null ? str9 : TaskSessionEvent.REPLAY_FROM_START;
        this.K = "";
        this.L = "android";
        this.R = "android";
        this.S = str10 != null ? str10 : "";
        this.T = arrayList;
        this.U = str.isEmpty() ? "unknown" : str;
        this.V = str4;
        this.W = "";
        this.X = str11 != null ? str11 : "";
        this.Y = str2;
        this.Z = str3;
        this.a0 = p.i();
        this.b0 = str12 != null ? str12 : "production";
        this.c0 = str13;
        if (!str13.equals("normal") && !this.c0.equals("timeout") && !this.c0.equals("backgrounded")) {
            this.c0 = "normal";
        }
        this.e0 = map;
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        y yVar = (y) q3Var;
        yVar.n();
        yVar.r("android_api_level");
        yVar.x(a1Var, Integer.valueOf(this.G));
        yVar.r("device_locale");
        yVar.x(a1Var, this.H);
        yVar.r("device_manufacturer");
        yVar.A(this.I);
        yVar.r("device_model");
        yVar.A(this.J);
        yVar.r("device_os_build_number");
        yVar.A(this.K);
        yVar.r("device_os_name");
        yVar.A(this.L);
        yVar.r("device_os_version");
        yVar.A(this.M);
        yVar.r("device_is_emulator");
        yVar.B(this.N);
        yVar.r("architecture");
        yVar.x(a1Var, this.O);
        yVar.r("device_cpu_frequencies");
        yVar.x(a1Var, this.P);
        yVar.r("device_physical_memory_bytes");
        yVar.A(this.Q);
        yVar.r("platform");
        yVar.A(this.R);
        yVar.r("build_id");
        yVar.A(this.S);
        yVar.r("transaction_name");
        yVar.A(this.U);
        yVar.r("duration_ns");
        yVar.A(this.V);
        yVar.r("version_name");
        yVar.A(this.X);
        yVar.r("version_code");
        yVar.A(this.W);
        ArrayList arrayList = this.T;
        if (!arrayList.isEmpty()) {
            yVar.r("transactions");
            yVar.x(a1Var, arrayList);
        }
        yVar.r("transaction_id");
        yVar.A(this.Y);
        yVar.r("trace_id");
        yVar.A(this.Z);
        yVar.r("profile_id");
        yVar.A(this.a0);
        yVar.r("environment");
        yVar.A(this.b0);
        yVar.r("truncation_reason");
        yVar.A(this.c0);
        if (this.f0 != null) {
            yVar.r("sampled_profile");
            yVar.A(this.f0);
        }
        String str = ((io.sentry.vendor.gson.stream.c) yVar.F).H;
        yVar.u("");
        yVar.r("measurements");
        yVar.x(a1Var, this.e0);
        yVar.u(str);
        yVar.r("timestamp");
        yVar.x(a1Var, this.d0);
        ConcurrentHashMap concurrentHashMap = this.g0;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                e.b(this.g0, str2, yVar, str2, a1Var);
            }
        }
        yVar.p();
    }
}
