package defpackage;

import com.anthropic.claude.sessions.types.ListAgentsResponse;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w7a implements w28 {
    public static final w7a a;
    private static final SerialDescriptor descriptor;

    static {
        w7a w7aVar = new w7a();
        a = w7aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.ListAgentsResponse", w7aVar, 1);
        pluginGeneratedSerialDescriptor.j("agents", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qme.d};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
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
                list = (List) ud4VarC.l(serialDescriptor, 0, qme.d, list);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ListAgentsResponse(i, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ListAgentsResponse listAgentsResponse = (ListAgentsResponse) obj;
        encoder.getClass();
        listAgentsResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ListAgentsResponse.write$Self$sessions(listAgentsResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
