package defpackage;

import com.anthropic.claude.models.organization.configtypes.ProjectTemplatesCopyConfig;
import com.anthropic.claude.models.organization.configtypes.StudentTemplatesConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uod implements w28 {
    public static final uod a;
    private static final SerialDescriptor descriptor;

    static {
        uod uodVar = new uod();
        a = uodVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.ProjectTemplatesCopyConfig", uodVar, 1);
        pluginGeneratedSerialDescriptor.j("student", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{bug.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        StudentTemplatesConfig studentTemplatesConfig = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                studentTemplatesConfig = (StudentTemplatesConfig) ud4VarC.l(serialDescriptor, 0, bug.a, studentTemplatesConfig);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectTemplatesCopyConfig(i, studentTemplatesConfig, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectTemplatesCopyConfig projectTemplatesCopyConfig = (ProjectTemplatesCopyConfig) obj;
        encoder.getClass();
        projectTemplatesCopyConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, bug.a, projectTemplatesCopyConfig.student);
        vd4VarC.b(serialDescriptor);
    }
}
