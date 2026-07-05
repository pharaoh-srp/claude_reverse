package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadJank;
import com.anthropic.claude.analytics.events.ChatEvents$ConversationLoadSource;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ro2 implements w28 {
    public static final ro2 a;
    private static final SerialDescriptor descriptor;

    static {
        ro2 ro2Var = new ro2();
        a = ro2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_conversation_load_jank", ro2Var, 13);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("message_count", false);
        pluginGeneratedSerialDescriptor.j("total_time_ms", false);
        pluginGeneratedSerialDescriptor.j("block_count_by_kind", false);
        pluginGeneratedSerialDescriptor.j("markdown_node_count_by_kind", false);
        pluginGeneratedSerialDescriptor.j("total_frames", true);
        pluginGeneratedSerialDescriptor.j("total_ui_ms", true);
        pluginGeneratedSerialDescriptor.j("max_ui_ms", true);
        pluginGeneratedSerialDescriptor.j("over_16ms", true);
        pluginGeneratedSerialDescriptor.j("over_25ms", true);
        qy1.u(pluginGeneratedSerialDescriptor, "over_700ms", true, "overrun_frames", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$ConversationLoadJank.$childSerializers;
        e79 e79Var = e79.a;
        return new KSerializer[]{srg.a, kw9VarArr[1].getValue(), e79Var, e79Var, kw9VarArr[4].getValue(), kw9VarArr[5].getValue(), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$ConversationLoadJank.$childSerializers;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        int i2 = 0;
        String strV = null;
        ChatEvents$ConversationLoadSource chatEvents$ConversationLoadSource = null;
        int iR = 0;
        int iR2 = 0;
        Map map = null;
        Map map2 = null;
        Integer num7 = null;
        int i3 = 1;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    str2 = strV;
                    z = false;
                    strV = str2;
                    break;
                case 0:
                    i = iR;
                    i2 |= 1;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i3 = i3;
                    iR = i;
                    break;
                case 1:
                    str = strV;
                    i = iR;
                    chatEvents$ConversationLoadSource = (ChatEvents$ConversationLoadSource) ud4VarC.l(serialDescriptor, i3, (s06) kw9VarArr[i3].getValue(), chatEvents$ConversationLoadSource);
                    i2 |= 2;
                    strV = str;
                    iR = i;
                    break;
                case 2:
                    str2 = strV;
                    iR = ud4VarC.r(serialDescriptor, 2);
                    i2 |= 4;
                    strV = str2;
                    break;
                case 3:
                    str2 = strV;
                    iR2 = ud4VarC.r(serialDescriptor, 3);
                    i2 |= 8;
                    strV = str2;
                    break;
                case 4:
                    str = strV;
                    i = iR;
                    map = (Map) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), map);
                    i2 |= 16;
                    strV = str;
                    iR = i;
                    break;
                case 5:
                    str = strV;
                    i = iR;
                    map2 = (Map) ud4VarC.l(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), map2);
                    i2 |= 32;
                    strV = str;
                    iR = i;
                    break;
                case 6:
                    str = strV;
                    i = iR;
                    num7 = (Integer) ud4VarC.m(serialDescriptor, 6, e79.a, num7);
                    i2 |= 64;
                    strV = str;
                    iR = i;
                    break;
                case 7:
                    str = strV;
                    i = iR;
                    num6 = (Integer) ud4VarC.m(serialDescriptor, 7, e79.a, num6);
                    i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    strV = str;
                    iR = i;
                    break;
                case 8:
                    str = strV;
                    i = iR;
                    num4 = (Integer) ud4VarC.m(serialDescriptor, 8, e79.a, num4);
                    i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    strV = str;
                    iR = i;
                    break;
                case 9:
                    str = strV;
                    i = iR;
                    num3 = (Integer) ud4VarC.m(serialDescriptor, 9, e79.a, num3);
                    i2 |= 512;
                    strV = str;
                    iR = i;
                    break;
                case 10:
                    str = strV;
                    i = iR;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 10, e79.a, num2);
                    i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    strV = str;
                    iR = i;
                    break;
                case 11:
                    str = strV;
                    i = iR;
                    num = (Integer) ud4VarC.m(serialDescriptor, 11, e79.a, num);
                    i2 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    strV = str;
                    iR = i;
                    break;
                case 12:
                    str = strV;
                    i = iR;
                    num5 = (Integer) ud4VarC.m(serialDescriptor, 12, e79.a, num5);
                    i2 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    strV = str;
                    iR = i;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$ConversationLoadJank(i2, strV, chatEvents$ConversationLoadSource, iR, iR2, map, map2, num7, num6, num4, num3, num2, num, num5, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$ConversationLoadJank chatEvents$ConversationLoadJank = (ChatEvents$ConversationLoadJank) obj;
        encoder.getClass();
        chatEvents$ConversationLoadJank.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$ConversationLoadJank.write$Self$analytics(chatEvents$ConversationLoadJank, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
