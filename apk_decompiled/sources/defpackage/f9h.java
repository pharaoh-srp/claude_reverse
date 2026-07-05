package defpackage;

import com.anthropic.claude.api.tasks.BlockingToolDetail;
import com.anthropic.claude.api.tasks.TaskStepResponse;
import com.anthropic.claude.api.tasks.TaskStepStatus;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f9h implements w28 {
    public static final f9h a;
    private static final SerialDescriptor descriptor;

    static {
        f9h f9hVar = new f9h();
        a = f9hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.tasks.TaskStepResponse", f9hVar, 11);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("notes", true);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("status_description", true);
        pluginGeneratedSerialDescriptor.j("blocking_tool", true);
        pluginGeneratedSerialDescriptor.j("sub_items_completed", true);
        pluginGeneratedSerialDescriptor.j("sub_items_total", true);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("updated_at", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        e79 e79Var = e79.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(ks1.a);
        KSerializer kSerializerS4 = d4c.S(e79Var);
        KSerializer kSerializerS5 = d4c.S(e79Var);
        bc9 bc9Var = bc9.a;
        return new KSerializer[]{srgVar, e79Var, srgVar, kSerializerS, j9h.d, kSerializerS2, kSerializerS3, kSerializerS4, kSerializerS5, bc9Var, bc9Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Date date = null;
        Date date2 = null;
        boolean z2 = true;
        Integer num = null;
        int i = 0;
        String strV = null;
        int iR = 0;
        String strV2 = null;
        String str = null;
        TaskStepStatus taskStepStatus = null;
        String str2 = null;
        BlockingToolDetail blockingToolDetail = null;
        Integer num2 = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iR = ud4VarC.r(serialDescriptor, 1);
                    i |= 2;
                    continue;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    continue;
                case 3:
                    z = z2;
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    taskStepStatus = (TaskStepStatus) ud4VarC.l(serialDescriptor, 4, j9h.d, taskStepStatus);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str2);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    blockingToolDetail = (BlockingToolDetail) ud4VarC.m(serialDescriptor, 6, ks1.a, blockingToolDetail);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 7, e79.a, num2);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    z = z2;
                    num = (Integer) ud4VarC.m(serialDescriptor, 8, e79.a, num);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    z = z2;
                    date2 = (Date) ud4VarC.l(serialDescriptor, 9, bc9.a, date2);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    date = (Date) ud4VarC.l(serialDescriptor, 10, bc9.a, date);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            z2 = z;
        }
        ud4VarC.b(serialDescriptor);
        return new TaskStepResponse(i, strV, iR, strV2, str, taskStepStatus, str2, blockingToolDetail, num2, num, date2, date, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TaskStepResponse taskStepResponse = (TaskStepResponse) obj;
        encoder.getClass();
        taskStepResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        TaskStepResponse.write$Self$api(taskStepResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
