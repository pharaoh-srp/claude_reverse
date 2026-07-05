package defpackage;

import com.anthropic.claude.tool.model.TaskProposeOutputStepsItem;
import com.anthropic.claude.tool.model.TaskProposeOutputStepsItemStatus;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e7h implements w28 {
    public static final e7h a;
    private static final SerialDescriptor descriptor;

    static {
        e7h e7hVar = new e7h();
        a = e7hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.TaskProposeOutputStepsItem", e7hVar, 8);
        pluginGeneratedSerialDescriptor.j("notes", true);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("status_description", true);
        pluginGeneratedSerialDescriptor.j("sub_items_completed", true);
        pluginGeneratedSerialDescriptor.j("sub_items_total", true);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        e79 e79Var = e79.a;
        return new KSerializer[]{kSerializerS, e79Var, h7h.d, d4c.S(srgVar), d4c.S(e79Var), d4c.S(e79Var), srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String str = null;
        TaskProposeOutputStepsItemStatus taskProposeOutputStepsItemStatus = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        String strV = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    iR = ud4VarC.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    taskProposeOutputStepsItemStatus = (TaskProposeOutputStepsItemStatus) ud4VarC.l(serialDescriptor, 2, h7h.d, taskProposeOutputStepsItemStatus);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) ud4VarC.m(serialDescriptor, 4, e79.a, num);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 5, e79.a, num2);
                    i |= 32;
                    break;
                case 6:
                    strV = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    strV2 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new TaskProposeOutputStepsItem(i, str, iR, taskProposeOutputStepsItemStatus, str2, num, num2, strV, strV2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TaskProposeOutputStepsItem taskProposeOutputStepsItem = (TaskProposeOutputStepsItem) obj;
        encoder.getClass();
        taskProposeOutputStepsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        TaskProposeOutputStepsItem.write$Self$Claude_tool_model(taskProposeOutputStepsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
