package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadOutcome;
import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadResult;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qgb implements w28 {
    public static final qgb a;
    private static final SerialDescriptor descriptor;

    static {
        qgb qgbVar = new qgb();
        a = qgbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("message_file.download.result", qgbVar, 4);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("file_extension", false);
        pluginGeneratedSerialDescriptor.j("outcome", false);
        pluginGeneratedSerialDescriptor.j("reason", true);
        pluginGeneratedSerialDescriptor.k(new pi(27));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = MessageFileEvents$FileDownloadResult.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{kw9VarArr[0].getValue(), srgVar, kw9VarArr[2].getValue(), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MessageFileEvents$FileDownloadResult.$childSerializers;
        boolean z = true;
        int i = 0;
        MessageFileEvents$DownloadSource messageFileEvents$DownloadSource = null;
        String strV = null;
        MessageFileEvents$DownloadOutcome messageFileEvents$DownloadOutcome = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                messageFileEvents$DownloadSource = (MessageFileEvents$DownloadSource) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), messageFileEvents$DownloadSource);
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                messageFileEvents$DownloadOutcome = (MessageFileEvents$DownloadOutcome) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), messageFileEvents$DownloadOutcome);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageFileEvents$FileDownloadResult(i, messageFileEvents$DownloadSource, strV, messageFileEvents$DownloadOutcome, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageFileEvents$FileDownloadResult messageFileEvents$FileDownloadResult = (MessageFileEvents$FileDownloadResult) obj;
        encoder.getClass();
        messageFileEvents$FileDownloadResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageFileEvents$FileDownloadResult.write$Self$analytics(messageFileEvents$FileDownloadResult, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
