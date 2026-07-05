package defpackage;

import com.anthropic.claude.configs.GrowthBookExposureSampleRateConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dg7 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ad8 F;

    public /* synthetic */ dg7(ad8 ad8Var, int i) {
        this.E = i;
        this.F = ad8Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        ad8 ad8Var = this.F;
        switch (i) {
            case 0:
                return (GrowthBookExposureSampleRateConfig) ((wz5) ad8Var.f("growthbook_exposure_sample_rate", GrowthBookExposureSampleRateConfig.Companion.serializer())).getValue();
            default:
                ad8Var.l.getValue();
                return ad8Var.s("claudeai_dual_pane_min_height");
        }
    }
}
