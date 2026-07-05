package defpackage;

import com.anthropic.claude.configs.GrowthBookExposureSampleRateConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eg7 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rc8 F;

    public /* synthetic */ eg7(rc8 rc8Var, int i) {
        this.E = i;
        this.F = rc8Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        rc8 rc8Var = this.F;
        switch (i) {
            case 0:
                return (GrowthBookExposureSampleRateConfig) rc8Var.f("growthbook_exposure_sample_rate", GrowthBookExposureSampleRateConfig.Companion.serializer()).getValue();
            default:
                return Boolean.valueOf(rc8Var.o("claudeai_in_app_browser_enabled"));
        }
    }
}
