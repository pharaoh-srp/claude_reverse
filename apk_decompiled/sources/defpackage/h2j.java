package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$FocusChanged;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceFocusResult;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h2j implements w28 {
    public static final h2j a;
    private static final SerialDescriptor descriptor;

    static {
        h2j h2jVar = new h2j();
        a = h2jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("voice_focus_changed", h2jVar, 9);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.j("voice_session_id", false);
        pluginGeneratedSerialDescriptor.j("result", false);
        pluginGeneratedSerialDescriptor.j("duration_since_session_start_ms", false);
        pluginGeneratedSerialDescriptor.j("num_completed_turns", false);
        pluginGeneratedSerialDescriptor.j("had_focus_before", false);
        fsh.y(pluginGeneratedSerialDescriptor, "active_playback_usages", false, "active_recording_sources", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceEvents$FocusChanged.$childSerializers;
        srg srgVar = srg.a;
        xka xkaVar = xka.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, kw9VarArr[3].getValue(), xkaVar, xkaVar, zt1.a, kw9VarArr[7].getValue(), kw9VarArr[8].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceEvents$FocusChanged.$childSerializers;
        Object obj = null;
        List list = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        VoiceEvents$VoiceFocusResult voiceEvents$VoiceFocusResult = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        boolean zU = false;
        boolean z = true;
        List list2 = null;
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
                    voiceEvents$VoiceFocusResult = (VoiceEvents$VoiceFocusResult) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), voiceEvents$VoiceFocusResult);
                    i |= 8;
                    break;
                case 4:
                    j = ud4VarC.j(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    j2 = ud4VarC.j(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    zU = ud4VarC.u(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) ud4VarC.l(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    list2 = (List) ud4VarC.l(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), list2);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceEvents$FocusChanged(i, strV, strV2, strV3, voiceEvents$VoiceFocusResult, j, j2, zU, list, list2, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceEvents$FocusChanged voiceEvents$FocusChanged = (VoiceEvents$FocusChanged) obj;
        encoder.getClass();
        voiceEvents$FocusChanged.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceEvents$FocusChanged.write$Self$analytics(voiceEvents$FocusChanged, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
