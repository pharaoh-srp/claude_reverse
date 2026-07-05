package defpackage;

import android.content.Context;
import com.anthropic.claude.analytics.health.HealthMetricAction;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cji extends iwe {
    public final koi b;
    public final rvg c;
    public final rc8 d;
    public final qi3 e;
    public final String f;
    public final String g;
    public final String h;
    public final hl8 i;
    public final zy1 j;
    public final lsc k;
    public final lsc l;
    public final lsc m;
    public final lsc n;
    public final lsc o;
    public final lsc p;
    public final wlg q;
    public final lsc r;
    public final wz5 s;
    public final lsc t;
    public final wz5 u;
    public final lsc v;
    public final lsc w;

    public cji(koi koiVar, rvg rvgVar, rc8 rc8Var, qi3 qi3Var, String str, String str2, String str3, hl8 hl8Var, h86 h86Var) {
        super(h86Var);
        this.b = koiVar;
        this.c = rvgVar;
        this.d = rc8Var;
        this.e = qi3Var;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = hl8Var;
        this.j = x44.a();
        this.k = mpk.P(Boolean.TRUE);
        Boolean bool = Boolean.FALSE;
        this.l = mpk.P(bool);
        this.m = mpk.P(bool);
        this.n = mpk.P(null);
        this.o = mpk.P(null);
        this.p = mpk.P(bool);
        this.q = rc8Var.m("mobile_subscription_max_plan_enabled");
        lm6 lm6Var = lm6.E;
        this.r = mpk.P(lm6Var);
        final int i = 0;
        this.s = mpk.w(new zy7(this) { // from class: bji
            public final /* synthetic */ cji F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                lm6 lm6Var2 = lm6.E;
                cji cjiVar = this.F;
                switch (i2) {
                    case 0:
                        int iOrdinal = eve.C(cjiVar.b.e()).ordinal();
                        if (iOrdinal == 0) {
                            return (List) cjiVar.r.getValue();
                        }
                        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                            return lm6Var2;
                        }
                        wg6.i();
                        return null;
                    default:
                        return ((Boolean) cjiVar.q.getValue()).booleanValue() ? (List) cjiVar.t.getValue() : lm6Var2;
                }
            }
        });
        this.t = mpk.P(lm6Var);
        final int i2 = 1;
        this.u = mpk.w(new zy7(this) { // from class: bji
            public final /* synthetic */ cji F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                lm6 lm6Var2 = lm6.E;
                cji cjiVar = this.F;
                switch (i22) {
                    case 0:
                        int iOrdinal = eve.C(cjiVar.b.e()).ordinal();
                        if (iOrdinal == 0) {
                            return (List) cjiVar.r.getValue();
                        }
                        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                            return lm6Var2;
                        }
                        wg6.i();
                        return null;
                    default:
                        return ((Boolean) cjiVar.q.getValue()).booleanValue() ? (List) cjiVar.t.getValue() : lm6Var2;
                }
            }
        });
        this.v = mpk.P(null);
        this.w = mpk.P(null);
    }

    public final List O() {
        return (List) this.s.getValue();
    }

    public final boolean P() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final void Q(Context context, hwg hwgVar, zy7 zy7Var) {
        context.getClass();
        zy7Var.getClass();
        if (P()) {
            return;
        }
        gb9.D(this.a, null, null, new t5h(this, hwgVar, context, hl8.c(this.i, HealthMetricAction.PAID_CONVERSION, this.a, hwgVar.c(), null, 8), zy7Var, (tp4) null), 3);
    }
}
