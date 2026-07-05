package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$TurnCompleted;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceInputTrigger;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceTurnOutcome;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q3j implements w28 {
    public static final q3j a;
    private static final SerialDescriptor descriptor;

    static {
        q3j q3jVar = new q3j();
        a = q3jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("voice_turn_completed", q3jVar, 15);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("activation_mode", false);
        pluginGeneratedSerialDescriptor.j("turn_index", false);
        pluginGeneratedSerialDescriptor.j("input_trigger", false);
        pluginGeneratedSerialDescriptor.j("input_duration_ms", false);
        pluginGeneratedSerialDescriptor.j("time_to_first_audio_ms", false);
        pluginGeneratedSerialDescriptor.j("playback_duration_ms", false);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        pluginGeneratedSerialDescriptor.j("input_type", false);
        pluginGeneratedSerialDescriptor.j("output_type", false);
        pluginGeneratedSerialDescriptor.j("playback_underrun_count", true);
        fsh.y(pluginGeneratedSerialDescriptor, "route_changed", true, "had_focus_loss", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceEvents$TurnCompleted.$childSerializers;
        srg srgVar = srg.a;
        xka xkaVar = xka.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), xkaVar, kw9VarArr[5].getValue(), xkaVar, xkaVar, xkaVar, kw9VarArr[9].getValue(), srgVar, srgVar, d4c.S(e79.a), d4c.S(zt1Var), d4c.S(zt1Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        boolean z;
        kw9[] kw9VarArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr3 = VoiceEvents$TurnCompleted.$childSerializers;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Integer num = null;
        boolean z2 = true;
        VoiceEvents$VoiceInputTrigger voiceEvents$VoiceInputTrigger = null;
        VoiceEvents$VoiceTurnOutcome voiceEvents$VoiceTurnOutcome = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = null;
        String strV4 = null;
        String strV5 = null;
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
                    kw9VarArr2 = kw9VarArr3;
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 3:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    voiceEvents$VoiceActivationMode = (VoiceEvents$VoiceActivationMode) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), voiceEvents$VoiceActivationMode);
                    i |= 8;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
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
                    voiceEvents$VoiceInputTrigger = (VoiceEvents$VoiceInputTrigger) ud4VarC.l(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), voiceEvents$VoiceInputTrigger);
                    i |= 32;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 6:
                    kw9VarArr2 = kw9VarArr3;
                    j2 = ud4VarC.j(serialDescriptor, 6);
                    i |= 64;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 7:
                    kw9VarArr2 = kw9VarArr3;
                    j3 = ud4VarC.j(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 8:
                    kw9VarArr2 = kw9VarArr3;
                    j4 = ud4VarC.j(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    voiceEvents$VoiceTurnOutcome = (VoiceEvents$VoiceTurnOutcome) ud4VarC.l(serialDescriptor, 9, (s06) kw9VarArr[9].getValue(), voiceEvents$VoiceTurnOutcome);
                    i |= 512;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 10:
                    kw9VarArr2 = kw9VarArr3;
                    strV4 = ud4VarC.v(serialDescriptor, 10);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 11:
                    kw9VarArr2 = kw9VarArr3;
                    strV5 = ud4VarC.v(serialDescriptor, 11);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    kw9VarArr3 = kw9VarArr2;
                    break;
                case 12:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    num = (Integer) ud4VarC.m(serialDescriptor, 12, e79.a, num);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 13:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 13, zt1.a, bool2);
                    i |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                case 14:
                    kw9VarArr = kw9VarArr3;
                    z = z2;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 14, zt1.a, bool);
                    i |= 16384;
                    kw9VarArr3 = kw9VarArr;
                    z2 = z;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$TurnCompleted(i, strV, strV2, strV3, voiceEvents$VoiceActivationMode, j, voiceEvents$VoiceInputTrigger, j2, j3, j4, voiceEvents$VoiceTurnOutcome, strV4, strV5, num, bool2, bool, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$TurnCompleted voiceEvents$TurnCompleted = (VoiceEvents$TurnCompleted) obj;
        encoder.getClass();
        voiceEvents$TurnCompleted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$TurnCompleted.write$Self$analytics(voiceEvents$TurnCompleted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
