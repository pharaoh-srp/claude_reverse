package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileAdded;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileSource;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lpd implements w28 {
    public static final lpd a;
    private static final SerialDescriptor descriptor;

    static {
        lpd lpdVar = new lpd();
        a = lpdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_project_file_added", lpdVar, 6);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("project_uuid", false);
        pluginGeneratedSerialDescriptor.j("file_uuid", false);
        pluginGeneratedSerialDescriptor.j("file_length", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("upload_source", true);
        pluginGeneratedSerialDescriptor.k(new xmb(6));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ProjectsEvents$ProjectFileAdded.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, xka.a, kw9VarArr[4].getValue(), d4c.S((KSerializer) kw9VarArr[5].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ProjectsEvents$ProjectFileAdded.$childSerializers;
        Object obj = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        ProjectsEvents$ProjectFileSource projectsEvents$ProjectFileSource = null;
        long j = 0;
        boolean z = true;
        ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
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
                    j = ud4VarC.j(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    projectsEvents$ProjectFileSource = (ProjectsEvents$ProjectFileSource) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), projectsEvents$ProjectFileSource);
                    i |= 16;
                    break;
                case 5:
                    projectsEvents$ProjectUploadSource = (ProjectsEvents$ProjectUploadSource) ud4VarC.m(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), projectsEvents$ProjectUploadSource);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectsEvents$ProjectFileAdded(i, strV, strV2, strV3, j, projectsEvents$ProjectFileSource, projectsEvents$ProjectUploadSource, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectsEvents$ProjectFileAdded projectsEvents$ProjectFileAdded = (ProjectsEvents$ProjectFileAdded) obj;
        encoder.getClass();
        projectsEvents$ProjectFileAdded.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectsEvents$ProjectFileAdded.write$Self$analytics(projectsEvents$ProjectFileAdded, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
