package defpackage;

import com.anthropic.claude.analytics.health.HealthMetricAction;

/* JADX INFO: loaded from: classes.dex */
public final class phg extends iwe {
    public final wsg b;
    public final shg c;
    public final ysg d;
    public final hl8 e;
    public final lsc f;
    public final zy1 g;
    public final lsc h;
    public final lsc i;
    public final nyj j;
    public final lsc k;
    public final lsc l;
    public fkg m;
    public fkg n;
    public Object o;
    public String p;
    public dqh q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phg(wsg wsgVar, shg shgVar, ysg ysgVar, hl8 hl8Var, h86 h86Var) {
        super(h86Var);
        wsgVar.getClass();
        this.b = wsgVar;
        this.c = shgVar;
        this.d = ysgVar;
        this.e = hl8Var;
        Boolean bool = Boolean.FALSE;
        this.f = mpk.P(bool);
        this.g = x44.a();
        this.h = mpk.P(bool);
        this.i = mpk.P(0L);
        whg whgVar = (whg) shgVar;
        this.j = whgVar.i;
        this.k = whgVar.k;
        this.l = mpk.P(bool);
    }

    public final void O() {
        fkg fkgVar = this.m;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.m = null;
        fkg fkgVar2 = this.n;
        if (fkgVar2 != null) {
            fkgVar2.d(null);
        }
        this.n = null;
    }

    public final long P() {
        return ((Number) this.i.getValue()).longValue();
    }

    public final boolean Q() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final void R(bne bneVar) {
        HealthMetricAction healthMetricAction = HealthMetricAction.VOICE_DICTATION;
        String surface = this.b.getSurface();
        dqh dqhVar = this.q;
        hl8.b(this.e, healthMetricAction, bneVar, surface, dqhVar != null ? Long.valueOf(uh6.f(dqh.a(dqhVar.E))) : null, 8);
    }

    public final fkg S(zy7 zy7Var, boolean z) {
        return gb9.D(this.a, null, null, new ku(this, z, zy7Var, (tp4) null, 19), 3);
    }
}
