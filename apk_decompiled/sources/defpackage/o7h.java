package defpackage;

import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.api.tasks.TaskStatus;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.TaskId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o7h implements w28 {
    public static final o7h a;
    private static final SerialDescriptor descriptor;

    static {
        o7h o7hVar = new o7h();
        a = o7hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.tasks.TaskResponse", o7hVar, 12);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("status_description", false);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("updated_at", false);
        pluginGeneratedSerialDescriptor.j("last_activity_at", false);
        pluginGeneratedSerialDescriptor.j("context", false);
        pluginGeneratedSerialDescriptor.j("context_attachments", true);
        pluginGeneratedSerialDescriptor.j("steps", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = TaskResponse.$childSerializers;
        srg srgVar = srg.a;
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{z5h.a, vs2.a, srgVar, s8h.d, srgVar, d4c.S(srgVar), bc9Var, bc9Var, bc9Var, srgVar, kw9VarArr[10].getValue(), kw9VarArr[11].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = TaskResponse.$childSerializers;
        List list = null;
        boolean z = true;
        Date date = null;
        int i = 0;
        String strM1134unboximpl = null;
        String strM984unboximpl = null;
        Date date2 = null;
        TaskStatus taskStatus = null;
        List list2 = null;
        String str = null;
        Date date3 = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    TaskId taskId = (TaskId) ud4VarC.l(serialDescriptor, 0, z5h.a, strM1134unboximpl != null ? TaskId.m1128boximpl(strM1134unboximpl) : null);
                    i |= 1;
                    strM1134unboximpl = taskId != null ? taskId.m1134unboximpl() : null;
                    break;
                case 1:
                    ChatId chatId = (ChatId) ud4VarC.l(serialDescriptor, 1, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                    i |= 2;
                    strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                    break;
                case 2:
                    strV = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    taskStatus = (TaskStatus) ud4VarC.l(serialDescriptor, 3, s8h.d, taskStatus);
                    i |= 8;
                    break;
                case 4:
                    strV2 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str);
                    i |= 32;
                    break;
                case 6:
                    date3 = (Date) ud4VarC.l(serialDescriptor, 6, bc9.a, date3);
                    i |= 64;
                    break;
                case 7:
                    date = (Date) ud4VarC.l(serialDescriptor, 7, bc9.a, date);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    date2 = (Date) ud4VarC.l(serialDescriptor, 8, bc9.a, date2);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    strV3 = ud4VarC.v(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    list2 = (List) ud4VarC.l(serialDescriptor, 10, (s06) kw9VarArr[10].getValue(), list2);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                case 11:
                    list = (List) ud4VarC.l(serialDescriptor, 11, (s06) kw9VarArr[11].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new TaskResponse(i, strM1134unboximpl, strM984unboximpl, strV, taskStatus, strV2, str, date3, date, date2, strV3, list2, list, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TaskResponse taskResponse = (TaskResponse) obj;
        encoder.getClass();
        taskResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        TaskResponse.write$Self$api(taskResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
