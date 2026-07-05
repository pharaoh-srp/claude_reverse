package defpackage;

import com.anthropic.claude.analytics.events.GroveEvents$GroveLocation;
import com.anthropic.claude.analytics.events.GroveEvents$GrovePolicyToggled;
import com.anthropic.claude.models.organization.configtypes.GroveConfigStrings;

/* JADX INFO: loaded from: classes2.dex */
public final class ub8 extends iwe {
    public final GroveEvents$GroveLocation b;
    public final q7 c;
    public final o7 d;
    public final rc8 e;
    public final qi3 f;
    public final zy1 g;
    public final zy1 h;
    public final wz5 i;
    public final wz5 j;
    public final lsc k;
    public final wz5 l;
    public final lsc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub8(GroveEvents$GroveLocation groveEvents$GroveLocation, q7 q7Var, o7 o7Var, rc8 rc8Var, qi3 qi3Var, h86 h86Var) {
        super(h86Var);
        groveEvents$GroveLocation.getClass();
        this.b = groveEvents$GroveLocation;
        this.c = q7Var;
        this.d = o7Var;
        this.e = rc8Var;
        this.f = qi3Var;
        this.g = x44.a();
        this.h = x44.a();
        this.i = mpk.w(new tb8(this, 0));
        this.j = mpk.w(new tb8(this, 1));
        this.k = mpk.P(Boolean.TRUE);
        this.l = mpk.w(new tb8(this, 2));
        this.m = mpk.P(Boolean.FALSE);
    }

    public final GroveConfigStrings O() {
        return (GroveConfigStrings) this.i.getValue();
    }

    public final boolean P() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final boolean Q() {
        return ((Boolean) this.k.getValue()).booleanValue() && R();
    }

    public final boolean R() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final void S(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
        this.f.e(new GroveEvents$GrovePolicyToggled(z, this.b), GroveEvents$GrovePolicyToggled.Companion.serializer());
    }
}
