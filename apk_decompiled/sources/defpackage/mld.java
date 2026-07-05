package defpackage;

import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import com.anthropic.claude.types.strings.ProjectId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mld implements w28 {
    public static final mld a;
    private static final SerialDescriptor descriptor;

    static {
        mld mldVar = new mld();
        a = mldVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.project.details.ProjectDetailsScreenParams", mldVar, 2);
        pluginGeneratedSerialDescriptor.j("projectId", false);
        pluginGeneratedSerialDescriptor.j("isRootScreen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{emd.a, zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strM1085unboximpl = null;
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
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectDetailsScreenParams(i, strM1085unboximpl, zU, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectDetailsScreenParams projectDetailsScreenParams = (ProjectDetailsScreenParams) obj;
        encoder.getClass();
        projectDetailsScreenParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectDetailsScreenParams.write$Self$project(projectDetailsScreenParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
