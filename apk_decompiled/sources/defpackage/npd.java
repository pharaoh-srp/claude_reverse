package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectFileDeleted;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class npd implements w28 {
    public static final npd a;
    private static final SerialDescriptor descriptor;

    static {
        npd npdVar = new npd();
        a = npdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_project_file_deleted", npdVar, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("project_uuid", false);
        pluginGeneratedSerialDescriptor.j("file_uuid", false);
        pluginGeneratedSerialDescriptor.j("upload_source", true);
        pluginGeneratedSerialDescriptor.k(new xmb(6));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S((KSerializer) ProjectsEvents$ProjectFileDeleted.$childSerializers[3].getValue());
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ProjectsEvents$ProjectFileDeleted.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource = null;
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
                strV3 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                projectsEvents$ProjectUploadSource = (ProjectsEvents$ProjectUploadSource) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), projectsEvents$ProjectUploadSource);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectsEvents$ProjectFileDeleted(i, strV, strV2, strV3, projectsEvents$ProjectUploadSource, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectsEvents$ProjectFileDeleted projectsEvents$ProjectFileDeleted = (ProjectsEvents$ProjectFileDeleted) obj;
        encoder.getClass();
        projectsEvents$ProjectFileDeleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectsEvents$ProjectFileDeleted.write$Self$analytics(projectsEvents$ProjectFileDeleted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
