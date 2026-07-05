package defpackage;

import com.anthropic.claude.api.chat.messages.ToolUseBlockUpdateDelta;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y0i implements w28 {
    public static final y0i a;
    private static final SerialDescriptor descriptor;

    static {
        y0i y0iVar = new y0i();
        a = y0iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("tool_use_block_update_delta", y0iVar, 7);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.j("display_content", true);
        pluginGeneratedSerialDescriptor.j("integration_name", true);
        pluginGeneratedSerialDescriptor.j("integration_icon_url", true);
        pluginGeneratedSerialDescriptor.j("icon_name", true);
        pluginGeneratedSerialDescriptor.j("approval_key", true);
        pluginGeneratedSerialDescriptor.j("approval_options", true);
        pluginGeneratedSerialDescriptor.k(new gl0(3));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ToolUseBlockUpdateDelta.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[1].getValue()), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[6].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ToolUseBlockUpdateDelta.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        ToolDisplayContent toolDisplayContent = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        List list = null;
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
                    toolDisplayContent = (ToolDisplayContent) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), toolDisplayContent);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) ud4VarC.m(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ToolUseBlockUpdateDelta(i, str, toolDisplayContent, str2, str3, str4, str5, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ToolUseBlockUpdateDelta toolUseBlockUpdateDelta = (ToolUseBlockUpdateDelta) obj;
        encoder.getClass();
        toolUseBlockUpdateDelta.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ToolUseBlockUpdateDelta.write$Self$api(toolUseBlockUpdateDelta, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
