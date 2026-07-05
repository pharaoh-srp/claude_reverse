package defpackage;

import com.anthropic.claude.models.organization.configtypes.ProjectTemplateTextConfig;
import com.anthropic.claude.models.organization.configtypes.StudentTemplatesConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bug implements w28 {
    public static final bug a;
    private static final SerialDescriptor descriptor;

    static {
        bug bugVar = new bug();
        a = bugVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.StudentTemplatesConfig", bugVar, 3);
        pluginGeneratedSerialDescriptor.j("study", false);
        pluginGeneratedSerialDescriptor.j("career", false);
        pluginGeneratedSerialDescriptor.j("research", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        god godVar = god.a;
        return new KSerializer[]{d4c.S(godVar), d4c.S(godVar), d4c.S(godVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        ProjectTemplateTextConfig projectTemplateTextConfig = null;
        ProjectTemplateTextConfig projectTemplateTextConfig2 = null;
        ProjectTemplateTextConfig projectTemplateTextConfig3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                projectTemplateTextConfig = (ProjectTemplateTextConfig) ud4VarC.m(serialDescriptor, 0, god.a, projectTemplateTextConfig);
                i |= 1;
            } else if (iX == 1) {
                projectTemplateTextConfig2 = (ProjectTemplateTextConfig) ud4VarC.m(serialDescriptor, 1, god.a, projectTemplateTextConfig2);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                projectTemplateTextConfig3 = (ProjectTemplateTextConfig) ud4VarC.m(serialDescriptor, 2, god.a, projectTemplateTextConfig3);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StudentTemplatesConfig(i, projectTemplateTextConfig, projectTemplateTextConfig2, projectTemplateTextConfig3, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StudentTemplatesConfig studentTemplatesConfig = (StudentTemplatesConfig) obj;
        encoder.getClass();
        studentTemplatesConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StudentTemplatesConfig.write$Self$models(studentTemplatesConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
