package defpackage;

import com.anthropic.claude.models.organization.configtypes.ProjectTemplateTextConfig;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class god implements w28 {
    public static final god a;
    private static final SerialDescriptor descriptor;

    static {
        god godVar = new god();
        a = godVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.ProjectTemplateTextConfig", godVar, 8);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("project_title_input_header", false);
        pluginGeneratedSerialDescriptor.j("project_title_input_hint", false);
        pluginGeneratedSerialDescriptor.j("custom_instruction_reason", false);
        pluginGeneratedSerialDescriptor.j("upload_material_title", false);
        pluginGeneratedSerialDescriptor.j("upload_material_placeholder", false);
        pluginGeneratedSerialDescriptor.j("project_description", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar};
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
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        String strV7 = null;
        String strV8 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strV4 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV5 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strV6 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strV7 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strV8 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectTemplateTextConfig(i, strV, strV2, strV3, strV4, strV5, strV6, strV7, strV8, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectTemplateTextConfig projectTemplateTextConfig = (ProjectTemplateTextConfig) obj;
        encoder.getClass();
        projectTemplateTextConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectTemplateTextConfig.write$Self$models(projectTemplateTextConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
