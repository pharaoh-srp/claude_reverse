package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$FilePreviewSeen;
import com.anthropic.claude.analytics.events.MessageFileEvents$FilePreviewSurface;
import com.anthropic.claude.api.chat.MessageFile;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vgb implements w28 {
    public static final vgb a;
    private static final SerialDescriptor descriptor;

    static {
        vgb vgbVar = new vgb();
        a = vgbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("message_file.preview.seen", vgbVar, 3);
        pluginGeneratedSerialDescriptor.j("file_uuid", false);
        pluginGeneratedSerialDescriptor.j(MessageFile.DISCRIMINATOR, false);
        pluginGeneratedSerialDescriptor.j("surface", true);
        pluginGeneratedSerialDescriptor.k(new pi(27));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S((KSerializer) MessageFileEvents$FilePreviewSeen.$childSerializers[2].getValue());
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MessageFileEvents$FilePreviewSeen.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        MessageFileEvents$FilePreviewSurface messageFileEvents$FilePreviewSurface = null;
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
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                messageFileEvents$FilePreviewSurface = (MessageFileEvents$FilePreviewSurface) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), messageFileEvents$FilePreviewSurface);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageFileEvents$FilePreviewSeen(i, strV, strV2, messageFileEvents$FilePreviewSurface, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageFileEvents$FilePreviewSeen messageFileEvents$FilePreviewSeen = (MessageFileEvents$FilePreviewSeen) obj;
        encoder.getClass();
        messageFileEvents$FilePreviewSeen.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageFileEvents$FilePreviewSeen.write$Self$analytics(messageFileEvents$FilePreviewSeen, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
