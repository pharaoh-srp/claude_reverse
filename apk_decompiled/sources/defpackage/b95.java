package defpackage;

import com.anthropic.claude.api.project.ProjectType;
import com.anthropic.claude.project.create.CreateTemplateProjectScreenParams;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b95 implements w28 {
    public static final b95 a;
    private static final SerialDescriptor descriptor;

    static {
        b95 b95Var = new b95();
        a = b95Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.project.create.CreateTemplateProjectScreenParams", b95Var, 1);
        pluginGeneratedSerialDescriptor.j("projectType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(xod.d)};
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
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                projectType = (ProjectType) ud4VarC.m(serialDescriptor, 0, xod.d, projectType);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CreateTemplateProjectScreenParams(i, projectType, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CreateTemplateProjectScreenParams createTemplateProjectScreenParams = (CreateTemplateProjectScreenParams) obj;
        encoder.getClass();
        createTemplateProjectScreenParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CreateTemplateProjectScreenParams.write$Self$project(createTemplateProjectScreenParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
