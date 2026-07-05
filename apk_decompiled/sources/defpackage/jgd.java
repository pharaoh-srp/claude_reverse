package defpackage;

import com.anthropic.claude.api.account.AccountSettings;

/* JADX INFO: loaded from: classes3.dex */
public final class jgd extends iwe {
    public final q7 b;
    public final f9 c;
    public final qi3 d;
    public final zy1 e;
    public final wz5 f;
    public final wz5 g;
    public final wz5 h;
    public final wz5 i;
    public final wz5 j;
    public final cbf k;

    public jgd(q7 q7Var, f9 f9Var, final rc8 rc8Var, qi3 qi3Var, h86 h86Var) {
        super(h86Var);
        this.b = q7Var;
        this.c = f9Var;
        this.d = qi3Var;
        this.e = x44.a();
        final int i = 0;
        this.f = mpk.w(new fgd(rc8Var, 0));
        this.g = mpk.w(new zy7() { // from class: ggd
            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                boolean z = false;
                jgd jgdVar = this;
                rc8 rc8Var2 = rc8Var;
                switch (i2) {
                    case 0:
                        if (((Boolean) rc8Var2.m("claude_grove_enabled").getValue()).booleanValue()) {
                            AccountSettings settings = jgdVar.b.a().getSettings();
                            if ((settings != null ? settings.getGrove_enabled() : null) == null) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (((Boolean) rc8Var2.m("claude_grove_enabled").getValue()).booleanValue()) {
                            AccountSettings settings2 = jgdVar.b.a().getSettings();
                            if ((settings2 != null ? settings2.getGrove_enabled() : null) != null) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i2 = 1;
        this.h = mpk.w(new fgd(rc8Var, 1));
        this.i = mpk.w(new zy7() { // from class: ggd
            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                boolean z = false;
                jgd jgdVar = this;
                rc8 rc8Var2 = rc8Var;
                switch (i22) {
                    case 0:
                        if (((Boolean) rc8Var2.m("claude_grove_enabled").getValue()).booleanValue()) {
                            AccountSettings settings = jgdVar.b.a().getSettings();
                            if ((settings != null ? settings.getGrove_enabled() : null) == null) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (((Boolean) rc8Var2.m("claude_grove_enabled").getValue()).booleanValue()) {
                            AccountSettings settings2 = jgdVar.b.a().getSettings();
                            if ((settings2 != null ? settings2.getGrove_enabled() : null) != null) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        this.j = mpk.w(new pza(13, this));
        this.k = new cbf(new hgd(this, i), new igd(this, null));
    }
}
