package defpackage;

import com.anthropic.claude.models.organization.configtypes.GroveConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class egc {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public egc(okc okcVar, koi koiVar, q2a q2aVar, rc8 rc8Var, jj jjVar) {
        okcVar.getClass();
        jjVar.getClass();
        this.a = ((Boolean) okcVar.s.getValue()).booleanValue();
        boolean z = jjVar == jj.F || jjVar == jj.H;
        this.b = z;
        this.c = z || q2aVar.a.getBoolean("age_assurances_completed", false);
        boolean zBooleanValue = ((Boolean) okcVar.u.getValue()).booleanValue();
        this.d = zBooleanValue;
        this.e = zBooleanValue || z;
        this.f = !koiVar.b.a().is_verified();
        this.g = ((Boolean) rc8Var.m("claude_grove_enabled").getValue()).booleanValue();
        GroveConfig groveConfig = (GroveConfig) rc8Var.g("claude_grove_config", GroveConfig.Companion.serializer()).getValue();
        this.h = groveConfig != null ? x44.r(groveConfig.getDomain_excluded(), Boolean.TRUE) : false;
        this.i = okc.a(koiVar);
        this.j = koiVar.h();
    }
}
