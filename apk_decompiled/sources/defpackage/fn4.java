package defpackage;

import com.anthropic.claude.api.chat.messages.ContentBlockRetractEvent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fn4 implements w28 {
    public static final fn4 a;
    private static final SerialDescriptor descriptor;

    static {
        fn4 fn4Var = new fn4();
        a = fn4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("content_block_retract", fn4Var, 1);
        pluginGeneratedSerialDescriptor.j("from_index", true);
        pluginGeneratedSerialDescriptor.k(new gl0(11));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(e79.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Integer num = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ContentBlockRetractEvent(i, num, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ContentBlockRetractEvent contentBlockRetractEvent = (ContentBlockRetractEvent) obj;
        encoder.getClass();
        contentBlockRetractEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ContentBlockRetractEvent.write$Self$api(contentBlockRetractEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
