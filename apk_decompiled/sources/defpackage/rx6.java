package defpackage;

import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1Result;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rx6 implements w28 {
    public static final rx6 a;
    private static final SerialDescriptor descriptor;

    static {
        rx6 rx6Var = new rx6();
        a = rx6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("success", rx6Var, 1);
        pluginGeneratedSerialDescriptor.j("create_results", false);
        pluginGeneratedSerialDescriptor.k(new gl0(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{EventCreateV1OutputEventCreateV1Result.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = EventCreateV1OutputEventCreateV1Result.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventCreateV1OutputEventCreateV1Result(i, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateV1OutputEventCreateV1Result eventCreateV1OutputEventCreateV1Result = (EventCreateV1OutputEventCreateV1Result) obj;
        encoder.getClass();
        eventCreateV1OutputEventCreateV1Result.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) EventCreateV1OutputEventCreateV1Result.$childSerializers[0].getValue(), eventCreateV1OutputEventCreateV1Result.create_results);
        vd4VarC.b(serialDescriptor);
    }
}
