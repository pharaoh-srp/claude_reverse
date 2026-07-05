package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryCancellationCause;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryCompleted;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryOutcome;
import com.anthropic.claude.analytics.events.ChatEvents$PollingRecoveryTriggerReason;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xp2 implements w28 {
    public static final xp2 a;
    private static final SerialDescriptor descriptor;

    static {
        xp2 xp2Var = new xp2();
        a = xp2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_polling_recovery_completed", xp2Var, 17);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        pluginGeneratedSerialDescriptor.j("trigger_reason", false);
        pluginGeneratedSerialDescriptor.j("poll_attempt_count", false);
        pluginGeneratedSerialDescriptor.j("total_duration_ms", false);
        pluginGeneratedSerialDescriptor.j("message_age_ms", true);
        pluginGeneratedSerialDescriptor.j("discovered_in_foreground", true);
        pluginGeneratedSerialDescriptor.j("resolved_in_foreground", true);
        pluginGeneratedSerialDescriptor.j("message_uuid", true);
        pluginGeneratedSerialDescriptor.j("cancellation_cause", true);
        pluginGeneratedSerialDescriptor.j("had_pending_tool_approval", true);
        pluginGeneratedSerialDescriptor.j("last_content_block_type", true);
        pluginGeneratedSerialDescriptor.j("recovered_stop_reason", true);
        pluginGeneratedSerialDescriptor.j("human_message_uuid", true);
        qy1.u(pluginGeneratedSerialDescriptor, "time_in_foreground_ms", true, "model", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChatEvents$PollingRecoveryCompleted.$childSerializers;
        srg srgVar = srg.a;
        xka xkaVar = xka.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{srgVar, srgVar, kw9VarArr[2].getValue(), kw9VarArr[3].getValue(), e79.a, xkaVar, d4c.S(xkaVar), d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[10].getValue()), d4c.S(zt1Var), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(xkaVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        ChatEvents$PollingRecoveryOutcome chatEvents$PollingRecoveryOutcome;
        ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason;
        int i;
        Boolean bool;
        ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason2;
        ChatEvents$PollingRecoveryOutcome chatEvents$PollingRecoveryOutcome2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChatEvents$PollingRecoveryCompleted.$childSerializers;
        long j = 0;
        Boolean bool2 = null;
        ChatEvents$PollingRecoveryCancellationCause chatEvents$PollingRecoveryCancellationCause = null;
        String str = null;
        Boolean bool3 = null;
        String str2 = null;
        Long l = null;
        Boolean bool4 = null;
        int i2 = 0;
        String str3 = null;
        String str4 = null;
        ChatEvents$PollingRecoveryOutcome chatEvents$PollingRecoveryOutcome3 = null;
        ChatEvents$PollingRecoveryTriggerReason chatEvents$PollingRecoveryTriggerReason3 = null;
        Long l2 = null;
        String str5 = null;
        boolean z = true;
        String strV = null;
        String strV2 = null;
        int iR = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    bool = bool2;
                    chatEvents$PollingRecoveryTriggerReason2 = chatEvents$PollingRecoveryTriggerReason3;
                    z = false;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason2;
                    bool2 = bool;
                    break;
                case 0:
                    bool = bool2;
                    chatEvents$PollingRecoveryTriggerReason2 = chatEvents$PollingRecoveryTriggerReason3;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i2 |= 1;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome3;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason2;
                    bool2 = bool;
                    break;
                case 1:
                    bool = bool2;
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i2 |= 2;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome3;
                    bool2 = bool;
                    break;
                case 2:
                    bool = bool2;
                    chatEvents$PollingRecoveryTriggerReason2 = chatEvents$PollingRecoveryTriggerReason3;
                    chatEvents$PollingRecoveryOutcome3 = (ChatEvents$PollingRecoveryOutcome) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), chatEvents$PollingRecoveryOutcome3);
                    i2 |= 4;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason2;
                    bool2 = bool;
                    break;
                case 3:
                    bool = bool2;
                    chatEvents$PollingRecoveryTriggerReason3 = (ChatEvents$PollingRecoveryTriggerReason) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), chatEvents$PollingRecoveryTriggerReason3);
                    i2 |= 8;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome3;
                    bool2 = bool;
                    break;
                case 4:
                    chatEvents$PollingRecoveryOutcome2 = chatEvents$PollingRecoveryOutcome3;
                    iR = ud4VarC.r(serialDescriptor, 4);
                    i2 |= 16;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome2;
                    break;
                case 5:
                    chatEvents$PollingRecoveryOutcome2 = chatEvents$PollingRecoveryOutcome3;
                    j = ud4VarC.j(serialDescriptor, 5);
                    i2 |= 32;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome2;
                    break;
                case 6:
                    chatEvents$PollingRecoveryOutcome = chatEvents$PollingRecoveryOutcome3;
                    chatEvents$PollingRecoveryTriggerReason = chatEvents$PollingRecoveryTriggerReason3;
                    l = (Long) ud4VarC.m(serialDescriptor, 6, xka.a, l);
                    i2 |= 64;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason;
                    break;
                case 7:
                    chatEvents$PollingRecoveryOutcome = chatEvents$PollingRecoveryOutcome3;
                    chatEvents$PollingRecoveryTriggerReason = chatEvents$PollingRecoveryTriggerReason3;
                    bool4 = (Boolean) ud4VarC.m(serialDescriptor, 7, zt1.a, bool4);
                    i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason;
                    break;
                case 8:
                    chatEvents$PollingRecoveryOutcome = chatEvents$PollingRecoveryOutcome3;
                    chatEvents$PollingRecoveryTriggerReason = chatEvents$PollingRecoveryTriggerReason3;
                    bool3 = (Boolean) ud4VarC.m(serialDescriptor, 8, zt1.a, bool3);
                    i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason;
                    break;
                case 9:
                    chatEvents$PollingRecoveryOutcome = chatEvents$PollingRecoveryOutcome3;
                    chatEvents$PollingRecoveryTriggerReason = chatEvents$PollingRecoveryTriggerReason3;
                    str = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str);
                    i2 |= 512;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason;
                    break;
                case 10:
                    chatEvents$PollingRecoveryOutcome = chatEvents$PollingRecoveryOutcome3;
                    chatEvents$PollingRecoveryTriggerReason = chatEvents$PollingRecoveryTriggerReason3;
                    chatEvents$PollingRecoveryCancellationCause = (ChatEvents$PollingRecoveryCancellationCause) ud4VarC.m(serialDescriptor, 10, (s06) kw9VarArr[10].getValue(), chatEvents$PollingRecoveryCancellationCause);
                    i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason;
                    break;
                case 11:
                    chatEvents$PollingRecoveryOutcome = chatEvents$PollingRecoveryOutcome3;
                    chatEvents$PollingRecoveryTriggerReason = chatEvents$PollingRecoveryTriggerReason3;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 11, zt1.a, bool2);
                    i2 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason;
                    break;
                case 12:
                    chatEvents$PollingRecoveryOutcome = chatEvents$PollingRecoveryOutcome3;
                    chatEvents$PollingRecoveryTriggerReason = chatEvents$PollingRecoveryTriggerReason3;
                    str2 = (String) ud4VarC.m(serialDescriptor, 12, srg.a, str2);
                    i2 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason;
                    break;
                case 13:
                    chatEvents$PollingRecoveryOutcome = chatEvents$PollingRecoveryOutcome3;
                    chatEvents$PollingRecoveryTriggerReason = chatEvents$PollingRecoveryTriggerReason3;
                    str3 = (String) ud4VarC.m(serialDescriptor, 13, srg.a, str3);
                    i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason;
                    break;
                case 14:
                    chatEvents$PollingRecoveryOutcome = chatEvents$PollingRecoveryOutcome3;
                    chatEvents$PollingRecoveryTriggerReason = chatEvents$PollingRecoveryTriggerReason3;
                    str4 = (String) ud4VarC.m(serialDescriptor, 14, srg.a, str4);
                    i2 |= 16384;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    chatEvents$PollingRecoveryOutcome = chatEvents$PollingRecoveryOutcome3;
                    chatEvents$PollingRecoveryTriggerReason = chatEvents$PollingRecoveryTriggerReason3;
                    l2 = (Long) ud4VarC.m(serialDescriptor, 15, xka.a, l2);
                    i = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    i2 |= i;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason;
                    break;
                case 16:
                    chatEvents$PollingRecoveryOutcome = chatEvents$PollingRecoveryOutcome3;
                    chatEvents$PollingRecoveryTriggerReason = chatEvents$PollingRecoveryTriggerReason3;
                    str5 = (String) ud4VarC.m(serialDescriptor, 16, srg.a, str5);
                    i = 65536;
                    i2 |= i;
                    chatEvents$PollingRecoveryOutcome3 = chatEvents$PollingRecoveryOutcome;
                    chatEvents$PollingRecoveryTriggerReason3 = chatEvents$PollingRecoveryTriggerReason;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        Boolean bool5 = bool2;
        ud4VarC.b(serialDescriptor);
        return new ChatEvents$PollingRecoveryCompleted(i2, strV, strV2, chatEvents$PollingRecoveryOutcome3, chatEvents$PollingRecoveryTriggerReason3, iR, j, l, bool4, bool3, str, chatEvents$PollingRecoveryCancellationCause, bool5, str2, str3, str4, l2, str5, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatEvents$PollingRecoveryCompleted chatEvents$PollingRecoveryCompleted = (ChatEvents$PollingRecoveryCompleted) obj;
        encoder.getClass();
        chatEvents$PollingRecoveryCompleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatEvents$PollingRecoveryCompleted.write$Self$analytics(chatEvents$PollingRecoveryCompleted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
