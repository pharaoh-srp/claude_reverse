package defpackage;

import com.anthropic.claude.models.organization.configtypes.GroveConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fgd implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rc8 F;

    public /* synthetic */ fgd(rc8 rc8Var, int i) {
        this.E = i;
        this.F = rc8Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        rc8 rc8Var = this.F;
        switch (i) {
            case 0:
                GroveConfig groveConfig = (GroveConfig) rc8Var.g("claude_grove_config", GroveConfig.Companion.serializer()).getValue();
                if (groveConfig != null) {
                    return groveConfig.getMobile_strings();
                }
                return null;
            case 1:
                return Boolean.valueOf(!(((GroveConfig) rc8Var.g("claude_grove_config", GroveConfig.Companion.serializer()).getValue()) != null ? x44.r(r2.getDomain_excluded(), Boolean.TRUE) : false));
            default:
                Boolean bool = (Boolean) rc8Var.m("claude_grove_enabled").getValue();
                bool.getClass();
                return bool;
        }
    }
}
