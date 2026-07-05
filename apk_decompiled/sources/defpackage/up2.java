package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$PartialResponseErrorRetry;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class up2 implements w28 {
    public static final up2 a;
    private static final SerialDescriptor descriptor;

    static {
        up2 up2Var = new up2();
        a = up2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_conversation_partial_response_error_retry", up2Var, 4);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        qy1.u(pluginGeneratedSerialDescriptor, "chat_refresh_successful", false, "is_temporary_chat", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        KSerializer kSerializerS = d4c.S(zt1Var);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, zt1Var, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        String strV = null;
        String strV2 = null;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                zU = ud4VarC.u(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                bool = (Boolean) ud4VarC.m(serialDescriptor, 3, zt1.a, bool);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$PartialResponseErrorRetry(i, strV, strV2, zU, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$PartialResponseErrorRetry chatEvents$PartialResponseErrorRetry = (ChatEvents$PartialResponseErrorRetry) obj;
        encoder.getClass();
        chatEvents$PartialResponseErrorRetry.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$PartialResponseErrorRetry.write$Self$analytics(chatEvents$PartialResponseErrorRetry, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
