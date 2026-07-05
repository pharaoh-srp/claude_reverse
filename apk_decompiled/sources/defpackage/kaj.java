package defpackage;

import com.anthropic.claude.artifact.model.WiggleArtifactIdentifier;
import com.anthropic.claude.types.strings.ChatId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kaj implements w28 {
    public static final kaj a;
    private static final SerialDescriptor descriptor;

    static {
        kaj kajVar = new kaj();
        a = kajVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.artifact.model.WiggleArtifactIdentifier", kajVar, 2);
        pluginGeneratedSerialDescriptor.j("chatId", false);
        pluginGeneratedSerialDescriptor.j("encodedPath", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vs2.a, srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM984unboximpl = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ChatId chatId = (ChatId) ud4VarC.l(serialDescriptor, 0, vs2.a, strM984unboximpl != null ? ChatId.m978boximpl(strM984unboximpl) : null);
                strM984unboximpl = chatId != null ? chatId.m984unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new WiggleArtifactIdentifier(i, strM984unboximpl, strV, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        WiggleArtifactIdentifier wiggleArtifactIdentifier = (WiggleArtifactIdentifier) obj;
        encoder.getClass();
        wiggleArtifactIdentifier.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        WiggleArtifactIdentifier.write$Self$artifact(wiggleArtifactIdentifier, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
