package defpackage;

import com.anthropic.claude.api.project.ProjectCreateParams;
import com.anthropic.claude.api.project.ProjectSubtype;
import com.anthropic.claude.api.project.ProjectType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class okd implements w28 {
    public static final okd a;
    private static final SerialDescriptor descriptor;

    static {
        okd okdVar = new okd();
        a = okdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.project.ProjectCreateParams", okdVar, 6);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("is_private", false);
        pluginGeneratedSerialDescriptor.j("prompt_template", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("subtype", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), zt1.a, d4c.S(srgVar), d4c.S(xod.d), d4c.S(ynd.d)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String str = null;
        String str2 = null;
        ProjectType projectType = null;
        ProjectSubtype projectSubtype = null;
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
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    zU = ud4VarC.u(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    projectType = (ProjectType) ud4VarC.m(serialDescriptor, 4, xod.d, projectType);
                    i |= 16;
                    break;
                case 5:
                    projectSubtype = (ProjectSubtype) ud4VarC.m(serialDescriptor, 5, ynd.d, projectSubtype);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectCreateParams(i, strV, str, zU, str2, projectType, projectSubtype, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectCreateParams projectCreateParams = (ProjectCreateParams) obj;
        encoder.getClass();
        projectCreateParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectCreateParams.write$Self$api(projectCreateParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
