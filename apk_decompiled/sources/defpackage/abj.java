package defpackage;

import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.feature.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class abj {
    public final q7 a;
    public final rc8 b;
    public final nf7 c;
    public final koi d;
    public final wz5 e;
    public final wz5 f;
    public final wz5 g;

    public abj(q7 q7Var, rc8 rc8Var, nf7 nf7Var, koi koiVar) {
        this.a = q7Var;
        this.b = rc8Var;
        this.c = nf7Var;
        this.d = koiVar;
        final int i = 0;
        this.e = mpk.w(new zy7(this) { // from class: zaj
            public final /* synthetic */ abj F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                boolean z = false;
                abj abjVar = this.F;
                switch (i2) {
                    case 0:
                        if (((Boolean) abjVar.b.m("trials_and_tribulations_of_high_school_football").getValue()).booleanValue() && ((Boolean) abjVar.c.c(Feature.WIGGLE).getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (((Boolean) abjVar.e.getValue()).booleanValue() && abjVar.d.i()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(abjVar.a(null));
                }
            }
        });
        final int i2 = 1;
        this.f = mpk.w(new zy7(this) { // from class: zaj
            public final /* synthetic */ abj F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                boolean z = false;
                abj abjVar = this.F;
                switch (i22) {
                    case 0:
                        if (((Boolean) abjVar.b.m("trials_and_tribulations_of_high_school_football").getValue()).booleanValue() && ((Boolean) abjVar.c.c(Feature.WIGGLE).getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (((Boolean) abjVar.e.getValue()).booleanValue() && abjVar.d.i()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(abjVar.a(null));
                }
            }
        });
        final int i3 = 2;
        this.g = mpk.w(new zy7(this) { // from class: zaj
            public final /* synthetic */ abj F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i3;
                boolean z = false;
                abj abjVar = this.F;
                switch (i22) {
                    case 0:
                        if (((Boolean) abjVar.b.m("trials_and_tribulations_of_high_school_football").getValue()).booleanValue() && ((Boolean) abjVar.c.c(Feature.WIGGLE).getValue()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (((Boolean) abjVar.e.getValue()).booleanValue() && abjVar.d.i()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        return Boolean.valueOf(abjVar.a(null));
                }
            }
        });
    }

    public final boolean a(Boolean bool) {
        if (!((Boolean) this.e.getValue()).booleanValue()) {
            return false;
        }
        if (this.d.i()) {
            return true;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        AccountSettings settings = this.a.a().getSettings();
        Boolean enabled_monkeys_in_a_barrel = settings != null ? settings.getEnabled_monkeys_in_a_barrel() : null;
        return enabled_monkeys_in_a_barrel != null ? enabled_monkeys_in_a_barrel.booleanValue() : ((Boolean) this.b.m("default_wiggle_on").getValue()).booleanValue();
    }
}
