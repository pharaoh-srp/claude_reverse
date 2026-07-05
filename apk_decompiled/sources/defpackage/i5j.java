package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.VoiceSessionId;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i5j implements w28 {
    public static final i5j a;
    private static final SerialDescriptor descriptor;

    static {
        i5j i5jVar = new i5j();
        a = i5jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.bell.VoiceSessionSummary", i5jVar, 10);
        pluginGeneratedSerialDescriptor.j("organizationId", false);
        pluginGeneratedSerialDescriptor.j("conversationId", false);
        pluginGeneratedSerialDescriptor.j("voiceSessionId", false);
        pluginGeneratedSerialDescriptor.j("sessionDurationMs", false);
        pluginGeneratedSerialDescriptor.j("numTurns", false);
        pluginGeneratedSerialDescriptor.j("inputType", false);
        pluginGeneratedSerialDescriptor.j("outputType", false);
        pluginGeneratedSerialDescriptor.j("activationMode", false);
        pluginGeneratedSerialDescriptor.j("numFocusLosses", true);
        pluginGeneratedSerialDescriptor.j("focusTransientLossTotalMs", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceSessionSummary.$childSerializers;
        xka xkaVar = xka.a;
        srg srgVar = srg.a;
        return new KSerializer[]{fkc.a, vs2.a, c5j.a, xkaVar, xkaVar, srgVar, srgVar, kw9VarArr[7].getValue(), d4c.S(xkaVar), d4c.S(xkaVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceSessionSummary.$childSerializers;
        long j = 0;
        long j2 = 0;
        Long l = null;
        boolean z = true;
        VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationMode = null;
        Long l2 = null;
        int i = 0;
        String strM1071unboximpl = null;
        String strM984unboximpl = null;
        String strM1170unboximpl = null;
        String strV = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    OrganizationId organizationId = (OrganizationId) ud4VarC.l(serialDescriptor, 0, fkc.a, strM1071unboximpl != null ? OrganizationId.m1065boximpl(strM1071unboximpl) : null);
                    i |= 1;
                    strM1071unboximpl = organizationId != null ? organizationId.m1071unboximpl() : null;
                    break;
                case 1:
                    ChatId chatId = (ChatId) ud4VarC.l(serialDescriptor, 1, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                    i |= 2;
                    strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                    break;
                case 2:
                    VoiceSessionId voiceSessionId = (VoiceSessionId) ud4VarC.l(serialDescriptor, 2, c5j.a, strM1170unboximpl != null ? VoiceSessionId.m1164boximpl(strM1170unboximpl) : null);
                    strM1170unboximpl = voiceSessionId != null ? voiceSessionId.m1170unboximpl() : null;
                    i |= 4;
                    break;
                case 3:
                    j = ud4VarC.j(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    j2 = ud4VarC.j(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strV = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strV2 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    voiceEvents$VoiceActivationMode = (VoiceEvents$VoiceActivationMode) ud4VarC.l(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), voiceEvents$VoiceActivationMode);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    l2 = (Long) ud4VarC.m(serialDescriptor, 8, xka.a, l2);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    l = (Long) ud4VarC.m(serialDescriptor, 9, xka.a, l);
                    i |= 512;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceSessionSummary(i, strM1071unboximpl, strM984unboximpl, strM1170unboximpl, j, j2, strV, strV2, voiceEvents$VoiceActivationMode, l2, l, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceSessionSummary voiceSessionSummary = (VoiceSessionSummary) obj;
        encoder.getClass();
        voiceSessionSummary.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceSessionSummary.write$Self$bell(voiceSessionSummary, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
