package defpackage;

import com.anthropic.claude.api.experience.ExperienceRateLimit;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ba7 implements w28 {
    public static final ba7 a;
    private static final SerialDescriptor descriptor;

    static {
        ba7 ba7Var = new ba7();
        a = ba7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.experience.ExperienceRateLimit", ba7Var, 2);
        pluginGeneratedSerialDescriptor.j("remaining", false);
        pluginGeneratedSerialDescriptor.j("reset_at", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e79.a, bc9.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        Date date = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                date = (Date) ud4VarC.l(serialDescriptor, 1, bc9.a, date);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ExperienceRateLimit(i, iR, date, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ExperienceRateLimit experienceRateLimit = (ExperienceRateLimit) obj;
        encoder.getClass();
        experienceRateLimit.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ExperienceRateLimit.write$Self$api(experienceRateLimit, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
