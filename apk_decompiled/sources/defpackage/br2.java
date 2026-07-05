package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$SendRetryCompleted;
import com.anthropic.claude.analytics.events.ChatEvents$SendRetryOutcome;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class br2 implements w28 {
    public static final br2 a;
    private static final SerialDescriptor descriptor;

    static {
        br2 br2Var = new br2();
        a = br2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_send_retry_completed", br2Var, 10);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        pluginGeneratedSerialDescriptor.j("retry_attempt_count", false);
        pluginGeneratedSerialDescriptor.j("total_duration_ms", false);
        pluginGeneratedSerialDescriptor.j("is_temporary_chat", true);
        pluginGeneratedSerialDescriptor.j("last_error_http_status", true);
        pluginGeneratedSerialDescriptor.j("last_error_type", true);
        qy1.u(pluginGeneratedSerialDescriptor, "human_message_uuid", true, "model", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$SendRetryCompleted.$childSerializers;
        srg srgVar = srg.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue(), e79Var, xka.a, d4c.S(zt1.a), d4c.S(e79Var), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        boolean z;
        kw9[] kw9VarArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr3 = ChatEvents$SendRetryCompleted.$childSerializers;
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z2 = true;
        Boolean bool = null;
        Integer num = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        ChatEvents$SendRetryOutcome chatEvents$SendRetryOutcome = null;
        int iR = 0;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 1:
                    kw9VarArr2 = kw9VarArr3;
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 2:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    chatEvents$SendRetryOutcome = (ChatEvents$SendRetryOutcome) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), chatEvents$SendRetryOutcome);
                    i |= 4;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 3:
                    kw9VarArr2 = kw9VarArr3;
                    iR = ud4VarC.r(serialDescriptor, 3);
                    i |= 8;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 4:
                    kw9VarArr2 = kw9VarArr3;
                    j = ud4VarC.j(serialDescriptor, 4);
                    i |= 16;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 5, zt1.a, bool);
                    i |= 32;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    num = (Integer) ud4VarC.m(serialDescriptor, 6, e79.a, num);
                    i |= 64;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str3);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str2);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    str = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str);
                    i |= 512;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$SendRetryCompleted(i, strV, strV2, chatEvents$SendRetryOutcome, iR, j, bool, num, str3, str2, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$SendRetryCompleted chatEvents$SendRetryCompleted = (ChatEvents$SendRetryCompleted) obj;
        encoder.getClass();
        chatEvents$SendRetryCompleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$SendRetryCompleted.write$Self$analytics(chatEvents$SendRetryCompleted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
