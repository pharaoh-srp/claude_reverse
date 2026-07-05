package defpackage;

import com.anthropic.claude.api.project.ProjectSubtype;
import com.anthropic.claude.api.project.ProjectType;
import com.anthropic.claude.project.create.ProjectTemplateId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cod implements w28 {
    public static final cod a;
    private static final SerialDescriptor descriptor;

    static {
        cod codVar = new cod();
        a = codVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.project.create.ProjectTemplateId", codVar, 2);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("subtype", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xod.d, ynd.d};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ProjectType projectType = null;
        ProjectSubtype projectSubtype = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                projectType = (ProjectType) ud4VarC.l(serialDescriptor, 0, xod.d, projectType);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                projectSubtype = (ProjectSubtype) ud4VarC.l(serialDescriptor, 1, ynd.d, projectSubtype);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectTemplateId(i, projectType, projectSubtype, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectTemplateId projectTemplateId = (ProjectTemplateId) obj;
        encoder.getClass();
        projectTemplateId.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectTemplateId.write$Self$project(projectTemplateId, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
