package defpackage;

import com.anthropic.claude.tool.model.TaskProposeInputStepsItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y6h implements w28 {
    public static final y6h a;
    private static final SerialDescriptor descriptor;

    static {
        y6h y6hVar = new y6h();
        a = y6hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.TaskProposeInputStepsItem", y6hVar, 3);
        pluginGeneratedSerialDescriptor.j("notes", true);
        pluginGeneratedSerialDescriptor.j("sub_items_total", true);
        pluginGeneratedSerialDescriptor.j("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(e79.a), srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new TaskProposeInputStepsItem(i, str, num, strV, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        TaskProposeInputStepsItem taskProposeInputStepsItem = (TaskProposeInputStepsItem) obj;
        encoder.getClass();
        taskProposeInputStepsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        TaskProposeInputStepsItem.write$Self$Claude_tool_model(taskProposeInputStepsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
