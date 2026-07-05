package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingMessageCompletionStatus;
import com.anthropic.claude.analytics.events.ChatEvents$StreamingMessageJank;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lr2 implements w28 {
    public static final lr2 a;
    private static final SerialDescriptor descriptor;

    static {
        lr2 lr2Var = new lr2();
        a = lr2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_streaming_message_jank", lr2Var, 23);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("message_uuid", false);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("completion_status", false);
        pluginGeneratedSerialDescriptor.j("total_time_ms", false);
        pluginGeneratedSerialDescriptor.j("was_in_background", false);
        pluginGeneratedSerialDescriptor.j("time_in_background_ms", false);
        pluginGeneratedSerialDescriptor.j("conversation_message_count", true);
        pluginGeneratedSerialDescriptor.j("total_frames", false);
        pluginGeneratedSerialDescriptor.j("total_ui_ms", false);
        pluginGeneratedSerialDescriptor.j("max_ui_ms", false);
        pluginGeneratedSerialDescriptor.j("over_16ms", false);
        pluginGeneratedSerialDescriptor.j("over_25ms", false);
        pluginGeneratedSerialDescriptor.j("over_700ms", false);
        pluginGeneratedSerialDescriptor.j("overrun_frames", false);
        pluginGeneratedSerialDescriptor.j("display_refresh_hz", true);
        pluginGeneratedSerialDescriptor.j("total_hitch_time_ms", true);
        pluginGeneratedSerialDescriptor.j("hitch_minor", true);
        pluginGeneratedSerialDescriptor.j("hitch_major", true);
        pluginGeneratedSerialDescriptor.j("hitch_severe", true);
        pluginGeneratedSerialDescriptor.j("block_count_by_kind", false);
        qy1.u(pluginGeneratedSerialDescriptor, "block_char_length_by_kind", false, "markdown_node_count_by_kind", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$StreamingMessageJank.$childSerializers;
        srg srgVar = srg.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(srgVar), kw9VarArr[3].getValue(), e79Var, zt1.a, e79Var, d4c.S(e79Var), e79Var, e79Var, e79Var, e79Var, e79Var, e79Var, e79Var, d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), d4c.S(e79Var), kw9VarArr[20].getValue(), kw9VarArr[21].getValue(), kw9VarArr[22].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$StreamingMessageJank.$childSerializers;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        int i3 = 0;
        Map map = null;
        Map map2 = null;
        String str = null;
        ChatEvents$StreamingMessageCompletionStatus chatEvents$StreamingMessageCompletionStatus = null;
        Map map3 = null;
        boolean zU = false;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        int iR6 = 0;
        int iR7 = 0;
        int iR8 = 0;
        boolean z3 = true;
        String strV = null;
        String strV2 = null;
        int iR9 = 0;
        while (z3) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    i = iR;
                    z3 = false;
                    iR = i;
                    break;
                case 0:
                    z = zU;
                    i = iR;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i3 |= 1;
                    zU = z;
                    iR = i;
                    break;
                case 1:
                    z2 = zU;
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i3 |= 2;
                    zU = z2;
                    break;
                case 2:
                    z = zU;
                    i = iR;
                    str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                    i3 |= 4;
                    zU = z;
                    iR = i;
                    break;
                case 3:
                    z = zU;
                    i = iR;
                    chatEvents$StreamingMessageCompletionStatus = (ChatEvents$StreamingMessageCompletionStatus) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), chatEvents$StreamingMessageCompletionStatus);
                    i3 |= 8;
                    zU = z;
                    iR = i;
                    break;
                case 4:
                    z2 = zU;
                    iR9 = ud4VarC.r(serialDescriptor, 4);
                    i3 |= 16;
                    zU = z2;
                    break;
                case 5:
                    zU = ud4VarC.u(serialDescriptor, 5);
                    i3 |= 32;
                    break;
                case 6:
                    z2 = zU;
                    iR = ud4VarC.r(serialDescriptor, 6);
                    i3 |= 64;
                    zU = z2;
                    break;
                case 7:
                    z = zU;
                    i = iR;
                    num6 = (Integer) ud4VarC.m(serialDescriptor, 7, e79.a, num6);
                    i3 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    zU = z;
                    iR = i;
                    break;
                case 8:
                    z2 = zU;
                    iR2 = ud4VarC.r(serialDescriptor, 8);
                    i3 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    zU = z2;
                    break;
                case 9:
                    z2 = zU;
                    iR3 = ud4VarC.r(serialDescriptor, 9);
                    i3 |= 512;
                    zU = z2;
                    break;
                case 10:
                    z2 = zU;
                    iR4 = ud4VarC.r(serialDescriptor, 10);
                    i3 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    zU = z2;
                    break;
                case 11:
                    z2 = zU;
                    iR5 = ud4VarC.r(serialDescriptor, 11);
                    i3 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    zU = z2;
                    break;
                case 12:
                    z2 = zU;
                    iR6 = ud4VarC.r(serialDescriptor, 12);
                    i3 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    zU = z2;
                    break;
                case 13:
                    z2 = zU;
                    iR7 = ud4VarC.r(serialDescriptor, 13);
                    i3 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    zU = z2;
                    break;
                case 14:
                    z2 = zU;
                    iR8 = ud4VarC.r(serialDescriptor, 14);
                    i3 |= 16384;
                    zU = z2;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    z = zU;
                    i = iR;
                    num4 = (Integer) ud4VarC.m(serialDescriptor, 15, e79.a, num4);
                    i2 = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    i3 |= i2;
                    zU = z;
                    iR = i;
                    break;
                case 16:
                    z = zU;
                    i = iR;
                    num3 = (Integer) ud4VarC.m(serialDescriptor, 16, e79.a, num3);
                    i2 = 65536;
                    i3 |= i2;
                    zU = z;
                    iR = i;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    z = zU;
                    i = iR;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 17, e79.a, num2);
                    i2 = 131072;
                    i3 |= i2;
                    zU = z;
                    iR = i;
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    z = zU;
                    i = iR;
                    num = (Integer) ud4VarC.m(serialDescriptor, 18, e79.a, num);
                    i2 = 262144;
                    i3 |= i2;
                    zU = z;
                    iR = i;
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    z = zU;
                    i = iR;
                    num5 = (Integer) ud4VarC.m(serialDescriptor, 19, e79.a, num5);
                    i2 = 524288;
                    i3 |= i2;
                    zU = z;
                    iR = i;
                    break;
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    z = zU;
                    i = iR;
                    map = (Map) ud4VarC.l(serialDescriptor, 20, (s06) kw9VarArr[20].getValue(), map);
                    i2 = FreeTypeConstants.FT_LOAD_COLOR;
                    i3 |= i2;
                    zU = z;
                    iR = i;
                    break;
                case 21:
                    z = zU;
                    i = iR;
                    map2 = (Map) ud4VarC.l(serialDescriptor, 21, (s06) kw9VarArr[21].getValue(), map2);
                    i2 = FreeTypeConstants.FT_LOAD_COMPUTE_METRICS;
                    i3 |= i2;
                    zU = z;
                    iR = i;
                    break;
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    z = zU;
                    i = iR;
                    map3 = (Map) ud4VarC.l(serialDescriptor, 22, (s06) kw9VarArr[22].getValue(), map3);
                    i2 = 4194304;
                    i3 |= i2;
                    zU = z;
                    iR = i;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$StreamingMessageJank(i3, strV, strV2, str, chatEvents$StreamingMessageCompletionStatus, iR9, zU, iR, num6, iR2, iR3, iR4, iR5, iR6, iR7, iR8, num4, num3, num2, num, num5, map, map2, map3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$StreamingMessageJank chatEvents$StreamingMessageJank = (ChatEvents$StreamingMessageJank) obj;
        encoder.getClass();
        chatEvents$StreamingMessageJank.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$StreamingMessageJank.write$Self$analytics(chatEvents$StreamingMessageJank, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
