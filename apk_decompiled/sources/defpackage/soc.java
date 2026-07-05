package defpackage;

import com.anthropic.claude.conway.protocol.PaginatedMessages;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class soc implements w28 {
    public static final soc a;
    private static final SerialDescriptor descriptor;

    static {
        soc socVar = new soc();
        a = socVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.PaginatedMessages", socVar, 3);
        pluginGeneratedSerialDescriptor.j("messages", true);
        pluginGeneratedSerialDescriptor.j("hasMore", true);
        pluginGeneratedSerialDescriptor.j("oldestSeq", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{PaginatedMessages.$childSerializers[0].getValue(), zt1.a, d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = PaginatedMessages.$childSerializers;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        List list = null;
        Long l = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else if (iX == 1) {
                zU = ud4VarC.u(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                l = (Long) ud4VarC.m(serialDescriptor, 2, xka.a, l);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PaginatedMessages(i, list, zU, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PaginatedMessages paginatedMessages = (PaginatedMessages) obj;
        encoder.getClass();
        paginatedMessages.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PaginatedMessages.write$Self$conway(paginatedMessages, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
