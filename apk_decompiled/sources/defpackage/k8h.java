package defpackage;

import com.anthropic.claude.tool.model.TaskStatusOutput;
import com.anthropic.claude.tool.model.TaskStatusOutputStatus;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.OffsetDateTime;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k8h implements w28 {
    public static final k8h a;
    private static final SerialDescriptor descriptor;

    static {
        k8h k8hVar = new k8h();
        a = k8hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.TaskStatusOutput", k8hVar, 10);
        pluginGeneratedSerialDescriptor.j("context", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("last_activity_at", false);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("status_description", true);
        pluginGeneratedSerialDescriptor.j("steps", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("updated_at", false);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = TaskStatusOutput.$childSerializers;
        srg srgVar = srg.a;
        ay6 ay6Var = ay6.a;
        return new KSerializer[]{srgVar, ay6Var, ay6Var, d4c.S(srgVar), n8h.d, d4c.S(srgVar), kw9VarArr[6].getValue(), srgVar, ay6Var, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = TaskStatusOutput.$childSerializers;
        Object obj = null;
        boolean z = true;
        OffsetDateTime offsetDateTime = null;
        String strV = null;
        OffsetDateTime offsetDateTime2 = null;
        OffsetDateTime offsetDateTime3 = null;
        String str = null;
        TaskStatusOutputStatus taskStatusOutputStatus = null;
        String str2 = null;
        List list = null;
        String strV2 = null;
        String strV3 = null;
        int i = 0;
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
                    offsetDateTime2 = (OffsetDateTime) ud4VarC.l(serialDescriptor, 1, ay6.a, offsetDateTime2);
                    i |= 2;
                    break;
                case 2:
                    offsetDateTime3 = (OffsetDateTime) ud4VarC.l(serialDescriptor, 2, ay6.a, offsetDateTime3);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    taskStatusOutputStatus = (TaskStatusOutputStatus) ud4VarC.l(serialDescriptor, 4, n8h.d, taskStatusOutputStatus);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str2);
                    i |= 32;
                    break;
                case 6:
                    list = (List) ud4VarC.l(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), list);
                    i |= 64;
                    break;
                case 7:
                    strV2 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    offsetDateTime = (OffsetDateTime) ud4VarC.l(serialDescriptor, 8, ay6.a, offsetDateTime);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    strV3 = ud4VarC.v(serialDescriptor, 9);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new TaskStatusOutput(i, strV, offsetDateTime2, offsetDateTime3, str, taskStatusOutputStatus, str2, list, strV2, offsetDateTime, strV3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TaskStatusOutput taskStatusOutput = (TaskStatusOutput) obj;
        encoder.getClass();
        taskStatusOutput.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        TaskStatusOutput.write$Self$Claude_tool_model(taskStatusOutput, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
