package defpackage;

import com.anthropic.claude.api.experience.ExperienceButton;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xqd implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ExperienceButton F;
    public final /* synthetic */ l45 G;
    public final /* synthetic */ k87 H;
    public final /* synthetic */ pz7 I;

    public /* synthetic */ xqd(ExperienceButton experienceButton, l45 l45Var, k87 k87Var, pz7 pz7Var, int i) {
        this.E = i;
        this.F = experienceButton;
        this.G = l45Var;
        this.H = k87Var;
        this.I = pz7Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = this.G;
        switch (i) {
            case 0:
                ExperienceButton experienceButton = this.F;
                if (experienceButton != null) {
                    gb9.D(l45Var, null, null, new yqd(experienceButton, this.H, this.I, null, 0), 3);
                }
                break;
            default:
                gb9.D(l45Var, null, null, new yqd(this.F, this.H, this.I, null, 1), 3);
                break;
        }
        return ieiVar;
    }
}
