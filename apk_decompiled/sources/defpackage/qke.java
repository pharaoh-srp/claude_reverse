package defpackage;

import com.anthropic.claude.sessions.types.RequiresActionDetails;
import com.anthropic.claude.types.strings.ToolUseId;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qke implements w28 {
    public static final qke a;
    private static final SerialDescriptor descriptor;

    static {
        qke qkeVar = new qke();
        a = qkeVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.RequiresActionDetails", qkeVar, 6);
        pluginGeneratedSerialDescriptor.j("tool_name", true);
        pluginGeneratedSerialDescriptor.j("display_tool_name", true);
        pluginGeneratedSerialDescriptor.j("action_description", true);
        pluginGeneratedSerialDescriptor.j("request_id", true);
        pluginGeneratedSerialDescriptor.j("tool_use_id", true);
        pluginGeneratedSerialDescriptor.j("input", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = RequiresActionDetails.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), srgVar, srgVar, c1i.a, d4c.S((KSerializer) kw9VarArr[5].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = RequiresActionDetails.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        String strV2 = null;
        String strV3 = null;
        String strM1163unboximpl = null;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strV3 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    ToolUseId toolUseId = (ToolUseId) ud4VarC.l(serialDescriptor, 4, c1i.a, strM1163unboximpl != null ? ToolUseId.m1157boximpl(strM1163unboximpl) : null);
                    strM1163unboximpl = toolUseId != null ? toolUseId.m1163unboximpl() : null;
                    i |= 16;
                    break;
                case 5:
                    map = (Map) ud4VarC.m(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), map);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new RequiresActionDetails(i, strV, str, strV2, strV3, strM1163unboximpl, map, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        RequiresActionDetails requiresActionDetails = (RequiresActionDetails) obj;
        encoder.getClass();
        requiresActionDetails.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        RequiresActionDetails.write$Self$sessions(requiresActionDetails, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
