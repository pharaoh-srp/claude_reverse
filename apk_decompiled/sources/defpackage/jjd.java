package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class jjd implements qog, vf7 {
    public final k99 E;
    public final ejd F;
    public final ajd G;
    public volatile a2h I;
    public volatile dxc J;
    public ljd H = new bm4();
    public final AtomicBoolean K = new AtomicBoolean(false);
    public final kjd L = new kjd();

    public jjd(k99 k99Var, ejd ejdVar, ajd ajdVar) {
        this.E = k99Var;
        this.F = ejdVar;
        this.G = ajdVar;
    }

    @Override // defpackage.vf7
    public final void a(Object obj) {
        if (!(obj instanceof bjd)) {
            dch.H(this.E.t(), 4, g99.F, new ijd(0, obj), null, false, 56);
        } else if (this.I == null) {
            this.I = ((bjd) obj).a;
            this.G.a(this.E.getName());
            d();
            dch.H(this.E.t(), 3, g99.E, qs7.e0, null, false, 56);
        }
    }

    @Override // defpackage.if7
    public final void b() {
        k99 k99Var = this.E;
        String name = k99Var.getName();
        ajd ajdVar = this.G;
        ajdVar.a(name);
        ajdVar.l(k99Var.getName());
        k99Var.n("profiling");
    }

    @Override // defpackage.qog
    public final ug7 c() {
        return ug7.e;
    }

    public final void d() {
        a2h a2hVar;
        dxc dxcVar = this.J;
        if (dxcVar == null || (a2hVar = this.I) == null || !dxcVar.c.equals("application_launch") || this.K.getAndSet(true)) {
            return;
        }
        this.H.g(dxcVar, a2hVar);
    }

    @Override // defpackage.if7
    public final String getName() {
        return "profiling";
    }

    @Override // defpackage.qog
    public final kje h() {
        return this.L;
    }

    @Override // defpackage.if7
    public final void j(Context context) {
        Set<String> stringSet;
        context.getClass();
        ajd ajdVar = this.G;
        ajdVar.h(this.E.t());
        ajdVar.d(this.E.getName(), new gjd(this));
        float f = this.F.a;
        lz1 lz1Var = lz1.P;
        float fC = lz1Var.C(context);
        if (MTTypesetterKt.kLineSkipLimitMultiplier > fC || fC > f) {
            ((SharedPreferences) lz1Var.D(context).F).edit().putFloat("dd_profiling_sample_rate", this.F.a).apply();
        }
        String name = this.E.getName();
        name.getClass();
        tk5 tk5VarD = lz1Var.D(context);
        synchronized (tk5VarD) {
            Set<String> set = um6.E;
            try {
                stringSet = ((SharedPreferences) tk5VarD.F).getStringSet("dd_profiling_enabled", set);
            } catch (ClassCastException unused) {
                stringSet = null;
            }
            Set<String> set2 = stringSet;
            if (set2 != null) {
                set = set2;
            }
            ((SharedPreferences) tk5VarD.F).edit().putStringSet("dd_profiling_enabled", dxf.q0(set, name)).apply();
        }
        this.E.e("profiling", this);
        this.E.p(new hjd(this, 1), "profiling", true);
        this.H = new ax5(29, this.E);
    }
}
