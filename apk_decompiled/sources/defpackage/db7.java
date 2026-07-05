package defpackage;

import com.anthropic.claude.api.experience.ExperienceRules;
import com.anthropic.claude.api.experience.ExperiencesResponse;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class db7 implements w28 {
    public static final db7 a;
    private static final SerialDescriptor descriptor;

    static {
        db7 db7Var = new db7();
        a = db7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.experience.ExperiencesResponse", db7Var, 2);
        pluginGeneratedSerialDescriptor.j("experiences", false);
        pluginGeneratedSerialDescriptor.j("rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ExperiencesResponse.$childSerializers[0].getValue(), d4c.S(fa7.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ExperiencesResponse.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        ExperienceRules experienceRules = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                experienceRules = (ExperienceRules) ud4VarC.m(serialDescriptor, 1, fa7.a, experienceRules);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ExperiencesResponse(i, list, experienceRules, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ExperiencesResponse experiencesResponse = (ExperiencesResponse) obj;
        encoder.getClass();
        experiencesResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ExperiencesResponse.write$Self$api(experiencesResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
