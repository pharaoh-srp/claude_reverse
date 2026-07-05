package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryStarted;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aq2 implements w28 {
    public static final aq2 a;
    private static final SerialDescriptor descriptor;

    static {
        aq2 aq2Var = new aq2();
        a = aq2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_polling_recovery_started", aq2Var, 10);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("trigger_reason", false);
        pluginGeneratedSerialDescriptor.j("has_partial_content", false);
        pluginGeneratedSerialDescriptor.j("message_age_ms", true);
        pluginGeneratedSerialDescriptor.j("skipped", true);
        pluginGeneratedSerialDescriptor.j("discovered_in_foreground", true);
        pluginGeneratedSerialDescriptor.j("message_uuid", true);
        qy1.u(pluginGeneratedSerialDescriptor, "human_message_uuid", true, "model", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$PollingRecoveryStarted.$childSerializers;
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue(), zt1Var, d4c.S(xka.a), d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr2 = ChatEvents$PollingRecoveryStarted.$childSerializers;
        String str = null;
        String str2 = null;
        boolean z = true;
        String str3 = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason = null;
        boolean zU = false;
        Long l = null;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    kw9VarArr = kw9VarArr2;
                    z = false;
                    break;
                case 0:
                    kw9VarArr = kw9VarArr2;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    kw9VarArr = kw9VarArr2;
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    kw9VarArr = kw9VarArr2;
                    chatEvents$PollingRecoveryTriggerReason = (ChatEvents$PollingRecoveryTriggerReason) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), chatEvents$PollingRecoveryTriggerReason);
                    i |= 4;
                    break;
                case 3:
                    kw9VarArr = kw9VarArr2;
                    zU = ud4VarC.u(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    kw9VarArr = kw9VarArr2;
                    l = (Long) ud4VarC.m(serialDescriptor, 4, xka.a, l);
                    i |= 16;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr2;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 5, zt1.a, bool);
                    i |= 32;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr2;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 6, zt1.a, bool2);
                    i |= 64;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str3);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str2);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr2;
                    str = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
            kw9VarArr2 = kw9VarArr;
        }
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$PollingRecoveryStarted(i, strV, strV2, chatEvents$PollingRecoveryTriggerReason, zU, l, bool, bool2, str3, str2, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$PollingRecoveryStarted chatEvents$PollingRecoveryStarted = (ChatEvents$PollingRecoveryStarted) obj;
        encoder.getClass();
        chatEvents$PollingRecoveryStarted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$PollingRecoveryStarted.write$Self$analytics(chatEvents$PollingRecoveryStarted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
