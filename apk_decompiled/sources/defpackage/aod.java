package defpackage;

import com.anthropic.claude.api.project.ProjectSubtype;
import com.anthropic.claude.api.project.ProjectType;
import com.anthropic.claude.models.organization.configtypes.ProjectTemplateConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aod implements w28 {
    public static final aod a;
    private static final SerialDescriptor descriptor;

    static {
        aod aodVar = new aod();
        a = aodVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.ProjectTemplateConfig", aodVar, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("subtype", false);
        pluginGeneratedSerialDescriptor.j("icon_type", false);
        pluginGeneratedSerialDescriptor.j("custom_instructions", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{xod.d, ynd.d, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        ProjectType projectType = null;
        ProjectSubtype projectSubtype = null;
        String strV = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                projectType = (ProjectType) ud4VarC.l(serialDescriptor, 0, xod.d, projectType);
                i |= 1;
            } else if (iX == 1) {
                projectSubtype = (ProjectSubtype) ud4VarC.l(serialDescriptor, 1, ynd.d, projectSubtype);
                i |= 2;
            } else if (iX == 2) {
                strV = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                strV2 = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectTemplateConfig(i, projectType, projectSubtype, strV, strV2, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectTemplateConfig projectTemplateConfig = (ProjectTemplateConfig) obj;
        encoder.getClass();
        projectTemplateConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectTemplateConfig.write$Self$models(projectTemplateConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
