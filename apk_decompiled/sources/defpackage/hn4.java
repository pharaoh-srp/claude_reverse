package defpackage;

import com.anthropic.claude.api.chat.messages.ContentBlock;
import com.anthropic.claude.api.chat.messages.ContentBlockStartEvent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hn4 implements w28 {
    public static final hn4 a;
    private static final SerialDescriptor descriptor;

    static {
        hn4 hn4Var = new hn4();
        a = hn4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("content_block_start", hn4Var, 2);
        pluginGeneratedSerialDescriptor.j("index", false);
        pluginGeneratedSerialDescriptor.j("content_block", false);
        pluginGeneratedSerialDescriptor.k(new gl0(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e79.a, ContentBlockStartEvent.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ContentBlockStartEvent.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        ContentBlock contentBlock = null;
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
                contentBlock = (ContentBlock) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), contentBlock);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ContentBlockStartEvent(i, iR, contentBlock, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ContentBlockStartEvent contentBlockStartEvent = (ContentBlockStartEvent) obj;
        encoder.getClass();
        contentBlockStartEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ContentBlockStartEvent.write$Self$api(contentBlockStartEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
