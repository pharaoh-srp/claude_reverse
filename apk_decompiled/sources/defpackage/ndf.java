package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ndf implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ odf F;

    public /* synthetic */ ndf(odf odfVar, int i) {
        this.E = i;
        this.F = odfVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        odf odfVar = this.F;
        oh3 oh3Var = (oh3) obj;
        switch (i) {
            case 0:
                oh3Var.getClass();
                oh3Var.a("type", srg.b);
                oh3Var.a(ExperienceToggle.DEFAULT_PARAM_KEY, j8.n("kotlinx.serialization.Sealed<" + odfVar.a.f() + '>', lnf.l, new SerialDescriptor[0], new ndf(odfVar, 1)));
                List list = odfVar.b;
                list.getClass();
                oh3Var.b = list;
                break;
            default:
                oh3Var.getClass();
                for (Map.Entry entry : odfVar.e.entrySet()) {
                    oh3Var.a((String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor());
                }
                break;
        }
        return ieiVar;
    }
}
