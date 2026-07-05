package defpackage;

import com.anthropic.claude.project.knowledge.DeleteProjectDocAlertDialogParams;
import com.anthropic.claude.types.strings.ProjectDocId;
import com.anthropic.claude.types.strings.ProjectId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ly5 implements w28 {
    public static final ly5 a;
    private static final SerialDescriptor descriptor;

    static {
        ly5 ly5Var = new ly5();
        a = ly5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.project.knowledge.DeleteProjectDocAlertDialogParams", ly5Var, 2);
        pluginGeneratedSerialDescriptor.j("projectId", false);
        pluginGeneratedSerialDescriptor.j("docId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{emd.a, qld.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1085unboximpl = null;
        String strM1078unboximpl = null;
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
                ProjectDocId projectDocId = (ProjectDocId) ud4VarC.l(serialDescriptor, 1, qld.a, strM1078unboximpl != null ? ProjectDocId.m1072boximpl(strM1078unboximpl) : null);
                strM1078unboximpl = projectDocId != null ? projectDocId.m1078unboximpl() : null;
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new DeleteProjectDocAlertDialogParams(i, strM1085unboximpl, strM1078unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        DeleteProjectDocAlertDialogParams deleteProjectDocAlertDialogParams = (DeleteProjectDocAlertDialogParams) obj;
        encoder.getClass();
        deleteProjectDocAlertDialogParams.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        DeleteProjectDocAlertDialogParams.write$Self$project(deleteProjectDocAlertDialogParams, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
