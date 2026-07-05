package defpackage;

import com.anthropic.claude.api.project.ProjectDoc;
import com.anthropic.claude.types.strings.ProjectDocId;
import com.anthropic.claude.types.strings.ProjectId;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class old implements w28 {
    public static final old a;
    private static final SerialDescriptor descriptor;

    static {
        old oldVar = new old();
        a = oldVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.project.ProjectDoc", oldVar, 5);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("file_name", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("project_uuid", false);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{qld.a, srgVar, bc9.a, emd.a, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1078unboximpl = null;
        String strV = null;
        Date date = null;
        String strM1085unboximpl = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ProjectDocId projectDocId = (ProjectDocId) ud4VarC.l(serialDescriptor, 0, qld.a, strM1078unboximpl != null ? ProjectDocId.m1072boximpl(strM1078unboximpl) : null);
                strM1078unboximpl = projectDocId != null ? projectDocId.m1078unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                date = (Date) ud4VarC.l(serialDescriptor, 2, bc9.a, date);
                i |= 4;
            } else if (iX == 3) {
                ProjectId projectId = (ProjectId) ud4VarC.l(serialDescriptor, 3, emd.a, strM1085unboximpl != null ? ProjectId.m1079boximpl(strM1085unboximpl) : null);
                strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectDoc(i, strM1078unboximpl, strV, date, strM1085unboximpl, str, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectDoc projectDoc = (ProjectDoc) obj;
        encoder.getClass();
        projectDoc.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectDoc.write$Self$api(projectDoc, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
