package defpackage;

import com.anthropic.claude.project.create.ProjectTemplateId;
import com.anthropic.claude.project.create.UploadMaterialsScreenParams;
import com.anthropic.claude.types.strings.ProjectId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rji implements w28 {
    public static final rji a;
    private static final SerialDescriptor descriptor;

    static {
        rji rjiVar = new rji();
        a = rjiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.project.create.UploadMaterialsScreenParams", rjiVar, 2);
        pluginGeneratedSerialDescriptor.j("projectId", false);
        pluginGeneratedSerialDescriptor.j("templateId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{emd.a, cod.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1085unboximpl = null;
        ProjectTemplateId projectTemplateId = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ProjectId projectId = (ProjectId) ud4VarC.l(serialDescriptor, 0, emd.a, strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null);
                strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                projectTemplateId = (ProjectTemplateId) ud4VarC.l(serialDescriptor, 1, cod.a, projectTemplateId);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UploadMaterialsScreenParams(i, strM1085unboximpl, projectTemplateId, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UploadMaterialsScreenParams uploadMaterialsScreenParams = (UploadMaterialsScreenParams) obj;
        encoder.getClass();
        uploadMaterialsScreenParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UploadMaterialsScreenParams.write$Self$project(uploadMaterialsScreenParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
