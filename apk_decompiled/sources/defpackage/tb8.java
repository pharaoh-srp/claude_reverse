package defpackage;

import com.anthropic.claude.analytics.events.GroveEvents$GrovePolicySubmitted;
import com.anthropic.claude.models.organization.configtypes.GroveConfig;
import com.anthropic.claude.models.organization.configtypes.GroveConfigStrings;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tb8 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ub8 F;

    public /* synthetic */ tb8(ub8 ub8Var, int i) {
        this.E = i;
        this.F = ub8Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        ub8 ub8Var = this.F;
        switch (i) {
            case 0:
                GroveConfig groveConfig = (GroveConfig) ub8Var.e.g("claude_grove_config", GroveConfig.Companion.serializer()).getValue();
                GroveConfigStrings mobile_strings = groveConfig != null ? groveConfig.getMobile_strings() : null;
                if (mobile_strings != null) {
                    return mobile_strings;
                }
                sz6.p("Required value was null.");
                return null;
            case 1:
                GroveConfig groveConfig2 = (GroveConfig) ub8Var.e.g("claude_grove_config", GroveConfig.Companion.serializer()).getValue();
                return Boolean.valueOf(groveConfig2 != null && x44.r(groveConfig2.getNotice_is_grace_period(), Boolean.TRUE));
            case 2:
                return Boolean.valueOf(!(((GroveConfig) ub8Var.e.g("claude_grove_config", GroveConfig.Companion.serializer()).getValue()) != null ? x44.r(r5.getDomain_excluded(), Boolean.TRUE) : false));
            default:
                ub8Var.m.setValue(Boolean.TRUE);
                ub8Var.f.e(new GroveEvents$GrovePolicySubmitted(ub8Var.Q(), ub8Var.P()), GroveEvents$GrovePolicySubmitted.Companion.serializer());
                gb9.D(ub8Var.a, null, null, new e41(ub8Var, null, 2), 3);
                return iei.a;
        }
    }
}
