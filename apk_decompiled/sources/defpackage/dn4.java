package defpackage;

import com.anthropic.claude.api.chat.messages.ContentBlockDelta;
import com.anthropic.claude.api.chat.messages.ContentBlockDeltaEvent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dn4 implements w28 {
    public static final dn4 a;
    private static final SerialDescriptor descriptor;

    static {
        dn4 dn4Var = new dn4();
        a = dn4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("content_block_delta", dn4Var, 2);
        pluginGeneratedSerialDescriptor.j("index", false);
        pluginGeneratedSerialDescriptor.j("delta", false);
        pluginGeneratedSerialDescriptor.k(new gl0(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e79.a, ContentBlockDeltaEvent.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ContentBlockDeltaEvent.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        ContentBlockDelta contentBlockDelta = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                contentBlockDelta = (ContentBlockDelta) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), contentBlockDelta);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ContentBlockDeltaEvent(i, iR, contentBlockDelta, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ContentBlockDeltaEvent contentBlockDeltaEvent = (ContentBlockDeltaEvent) obj;
        encoder.getClass();
        contentBlockDeltaEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ContentBlockDeltaEvent.write$Self$api(contentBlockDeltaEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
