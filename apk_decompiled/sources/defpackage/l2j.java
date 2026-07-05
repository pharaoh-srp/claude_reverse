package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.analytics.events.VoiceEvents$SessionEnded;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceEndReason;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l2j implements w28 {
    public static final l2j a;
    private static final SerialDescriptor descriptor;

    static {
        l2j l2jVar = new l2j();
        a = l2jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("voice_session_ended", l2jVar, 20);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("activation_mode", false);
        pluginGeneratedSerialDescriptor.j("end_reason", false);
        pluginGeneratedSerialDescriptor.j("duration_ms", false);
        pluginGeneratedSerialDescriptor.j("num_turns", false);
        pluginGeneratedSerialDescriptor.j("num_speak_interrupts", false);
        pluginGeneratedSerialDescriptor.j("num_mode_switches", false);
        pluginGeneratedSerialDescriptor.j("num_mute_toggles", false);
        pluginGeneratedSerialDescriptor.j("num_reconnects", false);
        pluginGeneratedSerialDescriptor.j("buffer_underrun_count", true);
        pluginGeneratedSerialDescriptor.j("input_type", false);
        pluginGeneratedSerialDescriptor.j("output_type", false);
        pluginGeneratedSerialDescriptor.j("num_focus_losses", true);
        pluginGeneratedSerialDescriptor.j("focus_transient_loss_total_ms", true);
        pluginGeneratedSerialDescriptor.j("num_empty_input_turns", true);
        pluginGeneratedSerialDescriptor.j("sent_mic_audio", true);
        fsh.y(pluginGeneratedSerialDescriptor, "server_acked_input_end", true, "peak_input_rms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceEvents$SessionEnded.$childSerializers;
        srg srgVar = srg.a;
        xka xkaVar = xka.a;
        e79 e79Var = e79.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), kw9VarArr[4].getValue(), xkaVar, xkaVar, xkaVar, xkaVar, xkaVar, xkaVar, d4c.S(e79Var), srgVar, srgVar, d4c.S(xkaVar), d4c.S(xkaVar), d4c.S(e79Var), d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(e79Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        int i;
        String str3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$SessionEnded.$childSerializers;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num = null;
        Long l = null;
        Integer num2 = null;
        Integer num3 = null;
        Long l2 = null;
        int i2 = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = null;
        VoiceEvents$VoiceEndReason voiceEvents$VoiceEndReason = null;
        String strV4 = null;
        String strV5 = null;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    str = strV2;
                    z = false;
                    strV2 = str;
                    break;
                case 0:
                    str = strV2;
                    i2 |= 1;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    strV2 = str;
                    break;
                case 1:
                    str3 = strV;
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i2 |= 2;
                    strV = str3;
                    break;
                case 2:
                    str3 = strV;
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i2 |= 4;
                    strV = str3;
                    break;
                case 3:
                    str2 = strV;
                    str = strV2;
                    voiceEvents$VoiceActivationMode = (VoiceEvents$VoiceActivationMode) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), voiceEvents$VoiceActivationMode);
                    i2 |= 8;
                    strV = str2;
                    strV2 = str;
                    break;
                case 4:
                    str2 = strV;
                    str = strV2;
                    voiceEvents$VoiceEndReason = (VoiceEvents$VoiceEndReason) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), voiceEvents$VoiceEndReason);
                    i2 |= 16;
                    strV = str2;
                    strV2 = str;
                    break;
                case 5:
                    str3 = strV;
                    j = ud4VarC.j(serialDescriptor, 5);
                    i2 |= 32;
                    strV = str3;
                    break;
                case 6:
                    str3 = strV;
                    j2 = ud4VarC.j(serialDescriptor, 6);
                    i2 |= 64;
                    strV = str3;
                    break;
                case 7:
                    str3 = strV;
                    j3 = ud4VarC.j(serialDescriptor, 7);
                    i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    strV = str3;
                    break;
                case 8:
                    str3 = strV;
                    j4 = ud4VarC.j(serialDescriptor, 8);
                    i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    strV = str3;
                    break;
                case 9:
                    str3 = strV;
                    j5 = ud4VarC.j(serialDescriptor, 9);
                    i2 |= 512;
                    strV = str3;
                    break;
                case 10:
                    str3 = strV;
                    j6 = ud4VarC.j(serialDescriptor, 10);
                    i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    strV = str3;
                    break;
                case 11:
                    str2 = strV;
                    str = strV2;
                    num3 = (Integer) ud4VarC.m(serialDescriptor, 11, e79.a, num3);
                    i2 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    strV = str2;
                    strV2 = str;
                    break;
                case 12:
                    str3 = strV;
                    strV4 = ud4VarC.v(serialDescriptor, 12);
                    i2 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    strV = str3;
                    break;
                case 13:
                    str3 = strV;
                    strV5 = ud4VarC.v(serialDescriptor, 13);
                    i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    strV = str3;
                    break;
                case 14:
                    str2 = strV;
                    str = strV2;
                    l2 = (Long) ud4VarC.m(serialDescriptor, 14, xka.a, l2);
                    i2 |= 16384;
                    strV = str2;
                    strV2 = str;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    str2 = strV;
                    str = strV2;
                    l = (Long) ud4VarC.m(serialDescriptor, 15, xka.a, l);
                    i = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    i2 |= i;
                    strV = str2;
                    strV2 = str;
                    break;
                case 16:
                    str2 = strV;
                    str = strV2;
                    num = (Integer) ud4VarC.m(serialDescriptor, 16, e79.a, num);
                    i = 65536;
                    i2 |= i;
                    strV = str2;
                    strV2 = str;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    str2 = strV;
                    str = strV2;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 17, zt1.a, bool2);
                    i = 131072;
                    i2 |= i;
                    strV = str2;
                    strV2 = str;
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    str2 = strV;
                    str = strV2;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 18, zt1.a, bool);
                    i = 262144;
                    i2 |= i;
                    strV = str2;
                    strV2 = str;
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    str2 = strV;
                    str = strV2;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 19, e79.a, num2);
                    i = 524288;
                    i2 |= i;
                    strV = str2;
                    strV2 = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$SessionEnded(i2, strV, strV2, strV3, voiceEvents$VoiceActivationMode, voiceEvents$VoiceEndReason, j, j2, j3, j4, j5, j6, num3, strV4, strV5, l2, l, num, bool2, bool, num2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$SessionEnded voiceEvents$SessionEnded = (VoiceEvents$SessionEnded) obj;
        encoder.getClass();
        voiceEvents$SessionEnded.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$SessionEnded.write$Self$analytics(voiceEvents$SessionEnded, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
