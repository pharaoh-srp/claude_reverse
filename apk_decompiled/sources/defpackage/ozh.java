package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.configs.flags.ToolSearchModeConfig;
import com.anthropic.claude.types.strings.ToolSearchMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ozh implements w28 {
    public static final ozh a;
    private static final SerialDescriptor descriptor;

    static {
        ozh ozhVar = new ozh();
        a = ozhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.configs.flags.ToolSearchModeConfig", ozhVar, 5);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("title_key", true);
        pluginGeneratedSerialDescriptor.j("description_key", true);
        pluginGeneratedSerialDescriptor.j(ExperienceToggle.DEFAULT_PARAM_KEY, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(qzh.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String str = null;
        String str2 = null;
        String strM1156unboximpl = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else if (iX == 3) {
                str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                ToolSearchMode toolSearchMode = (ToolSearchMode) ud4VarC.m(serialDescriptor, 4, qzh.a, strM1156unboximpl != null ? ToolSearchMode.m1150boximpl(strM1156unboximpl) : null);
                strM1156unboximpl = toolSearchMode != null ? toolSearchMode.m1156unboximpl() : null;
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ToolSearchModeConfig(i, strV, strV2, str, str2, strM1156unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ToolSearchModeConfig toolSearchModeConfig = (ToolSearchModeConfig) obj;
        encoder.getClass();
        toolSearchModeConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ToolSearchModeConfig.write$Self$configs(toolSearchModeConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
