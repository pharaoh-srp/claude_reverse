package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$FilePreviewRendered;
import com.anthropic.claude.analytics.events.MessageFileEvents$FilePreviewResult;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sgb implements w28 {
    public static final sgb a;
    private static final SerialDescriptor descriptor;

    static {
        sgb sgbVar = new sgb();
        a = sgbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("message_file.preview.rendered", sgbVar, 3);
        pluginGeneratedSerialDescriptor.j("result", false);
        pluginGeneratedSerialDescriptor.j("file_extension", false);
        pluginGeneratedSerialDescriptor.j("error_reason", true);
        pluginGeneratedSerialDescriptor.k(new pi(27));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{MessageFileEvents$FilePreviewRendered.$childSerializers[0].getValue(), srgVar, d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MessageFileEvents$FilePreviewRendered.$childSerializers;
        boolean z = true;
        int i = 0;
        MessageFileEvents$FilePreviewResult messageFileEvents$FilePreviewResult = null;
        String strV = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                messageFileEvents$FilePreviewResult = (MessageFileEvents$FilePreviewResult) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), messageFileEvents$FilePreviewResult);
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageFileEvents$FilePreviewRendered(i, messageFileEvents$FilePreviewResult, strV, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageFileEvents$FilePreviewRendered messageFileEvents$FilePreviewRendered = (MessageFileEvents$FilePreviewRendered) obj;
        encoder.getClass();
        messageFileEvents$FilePreviewRendered.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageFileEvents$FilePreviewRendered.write$Self$analytics(messageFileEvents$FilePreviewRendered, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
