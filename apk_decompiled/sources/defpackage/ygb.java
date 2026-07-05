package defpackage;

import com.anthropic.claude.analytics.events.MessageFileEvents$PdfPreviewRendered;
import com.anthropic.claude.analytics.events.MessageFileEvents$PdfPreviewResult;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ygb implements w28 {
    public static final ygb a;
    private static final SerialDescriptor descriptor;

    static {
        ygb ygbVar = new ygb();
        a = ygbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_pdf_preview_rendered", ygbVar, 4);
        pluginGeneratedSerialDescriptor.j("result", false);
        pluginGeneratedSerialDescriptor.j("duration_ms", false);
        pluginGeneratedSerialDescriptor.j("page_count", true);
        pluginGeneratedSerialDescriptor.j("is_retry", false);
        pluginGeneratedSerialDescriptor.k(new pi(27));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MessageFileEvents$PdfPreviewRendered.$childSerializers[0].getValue(), xka.a, d4c.S(e79.a), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MessageFileEvents$PdfPreviewRendered.$childSerializers;
        int i = 0;
        boolean zU = false;
        MessageFileEvents$PdfPreviewResult messageFileEvents$PdfPreviewResult = null;
        Integer num = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                messageFileEvents$PdfPreviewResult = (MessageFileEvents$PdfPreviewResult) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), messageFileEvents$PdfPreviewResult);
                i |= 1;
            } else if (iX == 1) {
                j = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                num = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageFileEvents$PdfPreviewRendered(i, messageFileEvents$PdfPreviewResult, j, num, zU, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageFileEvents$PdfPreviewRendered messageFileEvents$PdfPreviewRendered = (MessageFileEvents$PdfPreviewRendered) obj;
        encoder.getClass();
        messageFileEvents$PdfPreviewRendered.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageFileEvents$PdfPreviewRendered.write$Self$analytics(messageFileEvents$PdfPreviewRendered, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
