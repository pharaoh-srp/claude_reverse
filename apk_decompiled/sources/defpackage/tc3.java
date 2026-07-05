package defpackage;

import com.anthropic.claude.api.experience.ChatTooltipContent;
import com.anthropic.claude.api.experience.ExperienceTooltipActionType;
import com.anthropic.claude.api.experience.ExperienceTooltipLocation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tc3 implements w28 {
    public static final tc3 a;
    private static final SerialDescriptor descriptor;

    static {
        tc3 tc3Var = new tc3();
        a = tc3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("android-chat-tooltip", tc3Var, 3);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("location_id", false);
        pluginGeneratedSerialDescriptor.j("action_type", true);
        pluginGeneratedSerialDescriptor.k(new gl0(6));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, xa7.d, d4c.S(va7.d)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        ExperienceTooltipLocation experienceTooltipLocation = null;
        ExperienceTooltipActionType experienceTooltipActionType = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                experienceTooltipLocation = (ExperienceTooltipLocation) ud4VarC.l(serialDescriptor, 1, xa7.d, experienceTooltipLocation);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                experienceTooltipActionType = (ExperienceTooltipActionType) ud4VarC.m(serialDescriptor, 2, va7.d, experienceTooltipActionType);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatTooltipContent(i, strV, experienceTooltipLocation, experienceTooltipActionType, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatTooltipContent chatTooltipContent = (ChatTooltipContent) obj;
        encoder.getClass();
        chatTooltipContent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatTooltipContent.write$Self$api(chatTooltipContent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
