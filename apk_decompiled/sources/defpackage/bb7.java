package defpackage;

import com.anthropic.claude.api.experience.ExperienceTrackActionData;
import com.anthropic.claude.api.experience.ExperienceTrackActionType;
import com.anthropic.claude.api.experience.ExperienceTrackRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bb7 implements w28 {
    public static final bb7 a;
    private static final SerialDescriptor descriptor;

    static {
        bb7 bb7Var = new bb7();
        a = bb7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.experience.ExperienceTrackRequest", bb7Var, 3);
        pluginGeneratedSerialDescriptor.j("experience_id", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, ab7.d, d4c.S((KSerializer) ExperienceTrackRequest.$childSerializers[2].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ExperienceTrackRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        ExperienceTrackActionType experienceTrackActionType = null;
        ExperienceTrackActionData experienceTrackActionData = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                experienceTrackActionType = (ExperienceTrackActionType) ud4VarC.l(serialDescriptor, 1, ab7.d, experienceTrackActionType);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                experienceTrackActionData = (ExperienceTrackActionData) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), experienceTrackActionData);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ExperienceTrackRequest(i, strV, experienceTrackActionType, experienceTrackActionData, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ExperienceTrackRequest experienceTrackRequest = (ExperienceTrackRequest) obj;
        encoder.getClass();
        experienceTrackRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ExperienceTrackRequest.write$Self$api(experienceTrackRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
