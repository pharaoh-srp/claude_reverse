package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentAdded;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectDocumentSource;
import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gpd implements w28 {
    public static final gpd a;
    private static final SerialDescriptor descriptor;

    static {
        gpd gpdVar = new gpd();
        a = gpdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_project_document_added", gpdVar, 6);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("project_uuid", false);
        pluginGeneratedSerialDescriptor.j("document_uuid", false);
        pluginGeneratedSerialDescriptor.j("document_length", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("upload_source", true);
        pluginGeneratedSerialDescriptor.k(new xmb(6));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ProjectsEvents$ProjectDocumentAdded.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, e79.a, kw9VarArr[4].getValue(), d4c.S((KSerializer) kw9VarArr[5].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ProjectsEvents$ProjectDocumentAdded.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        ProjectsEvents$ProjectDocumentSource projectsEvents$ProjectDocumentSource = null;
        ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource = null;
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
                    iR = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    projectsEvents$ProjectDocumentSource = (ProjectsEvents$ProjectDocumentSource) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), projectsEvents$ProjectDocumentSource);
                    i |= 16;
                    break;
                case 5:
                    projectsEvents$ProjectUploadSource = (ProjectsEvents$ProjectUploadSource) ud4VarC.m(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), projectsEvents$ProjectUploadSource);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectsEvents$ProjectDocumentAdded(i, strV, strV2, strV3, iR, projectsEvents$ProjectDocumentSource, projectsEvents$ProjectUploadSource, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectsEvents$ProjectDocumentAdded projectsEvents$ProjectDocumentAdded = (ProjectsEvents$ProjectDocumentAdded) obj;
        encoder.getClass();
        projectsEvents$ProjectDocumentAdded.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectsEvents$ProjectDocumentAdded.write$Self$analytics(projectsEvents$ProjectDocumentAdded, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
