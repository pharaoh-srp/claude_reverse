package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$SessionStarted;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceEntrySource;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p2j implements w28 {
    public static final p2j a;
    private static final SerialDescriptor descriptor;

    static {
        p2j p2jVar = new p2j();
        a = p2jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("voice_session_started", p2jVar, 12);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("activation_mode", false);
        pluginGeneratedSerialDescriptor.j("entry_source", false);
        pluginGeneratedSerialDescriptor.j("selected_voice", false);
        pluginGeneratedSerialDescriptor.j("playback_speed", false);
        pluginGeneratedSerialDescriptor.j("input_type", false);
        pluginGeneratedSerialDescriptor.j("output_type", false);
        pluginGeneratedSerialDescriptor.j("connect_duration_ms", false);
        fsh.y(pluginGeneratedSerialDescriptor, "had_audio_focus", true, "session_impl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceEvents$SessionStarted.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), kw9VarArr[4].getValue(), srgVar, srgVar, srgVar, srgVar, xka.a, d4c.S(zt1.a), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$SessionStarted.$childSerializers;
        Object obj = null;
        String str = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = null;
        VoiceEvents$VoiceEntrySource voiceEvents$VoiceEntrySource = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        String strV7 = null;
        long j = 0;
        int i = 0;
        boolean z = true;
        Boolean bool = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    voiceEvents$VoiceActivationMode = (VoiceEvents$VoiceActivationMode) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), voiceEvents$VoiceActivationMode);
                    i |= 8;
                    break;
                case 4:
                    voiceEvents$VoiceEntrySource = (VoiceEvents$VoiceEntrySource) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), voiceEvents$VoiceEntrySource);
                    i |= 16;
                    break;
                case 5:
                    strV4 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strV5 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strV6 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    strV7 = ud4VarC.v(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    j = ud4VarC.j(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 10, zt1.a, bool);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                case 11:
                    str = (String) ud4VarC.m(serialDescriptor, 11, srg.a, str);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$SessionStarted(i, strV, strV2, strV3, voiceEvents$VoiceActivationMode, voiceEvents$VoiceEntrySource, strV4, strV5, strV6, strV7, j, bool, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$SessionStarted voiceEvents$SessionStarted = (VoiceEvents$SessionStarted) obj;
        encoder.getClass();
        voiceEvents$SessionStarted.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$SessionStarted.write$Self$analytics(voiceEvents$SessionStarted, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
