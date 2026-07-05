package defpackage;

import com.anthropic.claude.api.experience.Experience;
import com.anthropic.claude.api.experience.ExperienceContent;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.experience.SpotlightContent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class ha7 extends iwe {
    public final String b;
    public final qi3 c;
    public final x97 d;
    public final AtomicBoolean e;
    public final SpotlightContent f;
    public final lsc g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha7(String str, qi3 qi3Var, x97 x97Var, h86 h86Var) {
        ExperienceToggle experienceToggleF;
        super(h86Var);
        str.getClass();
        this.b = str;
        this.c = qi3Var;
        this.d = x97Var;
        this.e = new AtomicBoolean(false);
        rcg rcgVarZ = fd9.Z();
        bz7 bz7VarE = rcgVarZ != null ? rcgVarZ.e() : null;
        rcg rcgVarK0 = fd9.k0(rcgVarZ);
        try {
            Experience experience = (Experience) x97Var.j.d.getValue();
            ExperienceContent content = experience != null ? experience.getContent() : null;
            SpotlightContent spotlightContent = content instanceof SpotlightContent ? (SpotlightContent) content : null;
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            this.f = spotlightContent;
            this.g = mpk.P(Boolean.valueOf((spotlightContent == null || (experienceToggleF = zjk.f(spotlightContent)) == null) ? true : experienceToggleF.getDefault_on()));
        } catch (Throwable th) {
            fd9.s0(rcgVarZ, rcgVarK0, bz7VarE);
            throw th;
        }
    }
}
