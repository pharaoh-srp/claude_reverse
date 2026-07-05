package defpackage;

import java.time.LocalDate;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class dn5 {
    public final b79 a;
    public final Locale b;
    public final o72 c;
    public final lsc d;
    public final lsc e;
    public final lsc f;
    public final lsc g;

    public dn5(Long l, Long l2, b79 b79Var, int i, xl5 xl5Var, Locale locale) {
        u72 u72VarC;
        this.a = b79Var;
        this.b = locale;
        o72 o72Var = new o72(locale);
        this.c = o72Var;
        this.d = mpk.P(xl5Var);
        if (l2 != null) {
            u72VarC = o72Var.b(l2.longValue());
            if (!b79Var.h(u72VarC.a)) {
                q62 q62VarD = o72Var.d();
                u72VarC = o72Var.c(LocalDate.of(q62VarD.E, q62VarD.F, 1));
            }
        } else {
            q62 q62VarD2 = o72Var.d();
            u72VarC = o72Var.c(LocalDate.of(q62VarD2.E, q62VarD2.F, 1));
        }
        this.e = mpk.P(u72VarC);
        q62 q62Var = null;
        if (l != null) {
            q62 q62VarA = this.c.a(l.longValue());
            if (b79Var.h(q62VarA.E)) {
                q62Var = q62VarA;
            }
        }
        this.f = mpk.P(q62Var);
        this.g = mpk.P(new o86(i));
    }

    public final int a() {
        return ((o86) this.g.getValue()).a;
    }

    public final Long b() {
        q62 q62Var = (q62) this.f.getValue();
        if (q62Var != null) {
            return Long.valueOf(q62Var.H);
        }
        return null;
    }
}
