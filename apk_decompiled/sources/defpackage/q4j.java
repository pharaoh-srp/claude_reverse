package defpackage;

import com.anthropic.claude.api.chat.messages.VoiceNoteBlock;
import java.util.Date;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q4j implements w28 {
    public static final q4j a;
    private static final SerialDescriptor descriptor;

    static {
        q4j q4jVar = new q4j();
        a = q4jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("voice_note", q4jVar, 5);
        pluginGeneratedSerialDescriptor.j("start_timestamp", true);
        pluginGeneratedSerialDescriptor.j("stop_timestamp", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("flags", true);
        pluginGeneratedSerialDescriptor.k(new gl0(2));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = VoiceNoteBlock.$childSerializers;
        bc9 bc9Var = bc9.a;
        KSerializer kSerializerS = d4c.S(bc9Var);
        KSerializer kSerializerS2 = d4c.S(bc9Var);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[4].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VoiceNoteBlock.$childSerializers;
        boolean z = true;
        int i = 0;
        Date date = null;
        Date date2 = null;
        String str = null;
        String str2 = null;
        Set set = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                date = (Date) ud4VarC.m(serialDescriptor, 0, bc9.a, date);
                i |= 1;
            } else if (iX == 1) {
                date2 = (Date) ud4VarC.m(serialDescriptor, 1, bc9.a, date2);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else if (iX == 3) {
                str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                set = (Set) ud4VarC.m(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), set);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VoiceNoteBlock(i, date, date2, str, str2, set, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VoiceNoteBlock voiceNoteBlock = (VoiceNoteBlock) obj;
        encoder.getClass();
        voiceNoteBlock.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VoiceNoteBlock.write$Self$api(voiceNoteBlock, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
