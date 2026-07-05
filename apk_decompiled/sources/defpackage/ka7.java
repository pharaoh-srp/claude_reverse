package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.experience.SpotlightContent;
import com.anthropic.claude.core.telemetry.SilentException;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ka7 extends xzg implements sz7 {
    public int E;
    public /* synthetic */ String F;
    public /* synthetic */ JsonObject G;
    public /* synthetic */ Boolean H;
    public final /* synthetic */ SpotlightContent I;
    public final /* synthetic */ ha7 J;
    public final /* synthetic */ dae K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka7(SpotlightContent spotlightContent, ha7 ha7Var, dae daeVar, tp4 tp4Var) {
        super(4, tp4Var);
        this.I = spotlightContent;
        this.J = ha7Var;
        this.K = daeVar;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        ha7 ha7Var = this.J;
        dae daeVar = this.K;
        ka7 ka7Var = new ka7(this.I, ha7Var, daeVar, (tp4) obj4);
        ka7Var.F = (String) obj;
        ka7Var.G = (JsonObject) obj2;
        ka7Var.H = (Boolean) obj3;
        return ka7Var.invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        JsonObject jsonObject;
        String paramKey;
        String str = this.F;
        JsonObject jsonObject2 = this.G;
        Boolean bool = this.H;
        int i = this.E;
        if (i != 0) {
            if (i == 1) {
                sf5.h0(obj);
                return obj;
            }
            sz6.j("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sf5.h0(obj);
        if (bool != null) {
            ExperienceToggle experienceToggleF = zjk.f(this.I);
            if (experienceToggleF == null || (paramKey = experienceToggleF.getParamKey()) == null) {
                paramKey = ExperienceToggle.DEFAULT_PARAM_KEY;
            }
            if (jsonObject2 != null && jsonObject2.containsKey((Object) paramKey)) {
                SilentException.a(new SilentException(ij0.j("Experience: remote action params[", paramKey, "] collides with toggle key; toggle value wins")), null, false, 3);
            }
            if (jsonObject2 == null) {
                jsonObject2 = new JsonObject(nm6.E);
            }
            jsonObject = new JsonObject(sta.m0(jsonObject2, new cpc(paramKey, ch9.a(bool))));
        } else {
            jsonObject = jsonObject2;
        }
        Object obj2 = this.K.E;
        if (obj2 == null) {
            x44.o0("callbacks");
            throw null;
        }
        this.F = null;
        this.G = null;
        this.H = null;
        this.E = 1;
        ha7 ha7Var = this.J;
        Object objK = ha7Var.d.k(ha7Var.b, str, jsonObject, (k87) obj2, this);
        m45 m45Var = m45.E;
        return objK == m45Var ? m45Var : objK;
    }
}
