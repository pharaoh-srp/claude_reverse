package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$DownloadSource;
import com.anthropic.claude.analytics.events.MessageFileEvents$FileDownloadRequested;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ogb implements w28 {
    public static final ogb a;
    private static final SerialDescriptor descriptor;

    static {
        ogb ogbVar = new ogb();
        a = ogbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("message_file.download.requested", ogbVar, 2);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("file_extension", false);
        pluginGeneratedSerialDescriptor.k(new pi(27));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MessageFileEvents$FileDownloadRequested.$childSerializers[0].getValue(), srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MessageFileEvents$FileDownloadRequested.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        MessageFileEvents$DownloadSource messageFileEvents$DownloadSource = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                messageFileEvents$DownloadSource = (MessageFileEvents$DownloadSource) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), messageFileEvents$DownloadSource);
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
        return new MessageFileEvents$FileDownloadRequested(i, messageFileEvents$DownloadSource, strV, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageFileEvents$FileDownloadRequested messageFileEvents$FileDownloadRequested = (MessageFileEvents$FileDownloadRequested) obj;
        encoder.getClass();
        messageFileEvents$FileDownloadRequested.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageFileEvents$FileDownloadRequested.write$Self$analytics(messageFileEvents$FileDownloadRequested, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
