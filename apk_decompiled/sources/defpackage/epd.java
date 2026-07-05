package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectCreated;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class epd implements w28 {
    public static final epd a;
    private static final SerialDescriptor descriptor;

    static {
        epd epdVar = new epd();
        a = epdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_project_created", epdVar, 6);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("project_uuid", false);
        pluginGeneratedSerialDescriptor.j("project_name_length", false);
        pluginGeneratedSerialDescriptor.j("project_description_length", false);
        pluginGeneratedSerialDescriptor.j("project_type", true);
        pluginGeneratedSerialDescriptor.j("project_subtype", true);
        pluginGeneratedSerialDescriptor.k(new xmb(6));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, srgVar, e79Var, e79Var, kSerializerS, kSerializerS2};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        int iR2 = 0;
        String strV = null;
        String strV2 = null;
        String str = null;
        String str2 = null;
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
                    iR = ud4VarC.r(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iR2 = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str2);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectsEvents$ProjectCreated(i, strV, strV2, iR, iR2, str, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectsEvents$ProjectCreated projectsEvents$ProjectCreated = (ProjectsEvents$ProjectCreated) obj;
        encoder.getClass();
        projectsEvents$ProjectCreated.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectsEvents$ProjectCreated.write$Self$analytics(projectsEvents$ProjectCreated, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
