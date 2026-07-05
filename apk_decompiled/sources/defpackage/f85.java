package defpackage;

import com.anthropic.claude.sessions.types.CreateSessionGroupingRequest;
import com.anthropic.claude.sessions.types.SessionGroupingVisibility;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f85 implements w28 {
    public static final f85 a;
    private static final SerialDescriptor descriptor;

    static {
        f85 f85Var = new f85();
        a = f85Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.CreateSessionGroupingRequest", f85Var, 2);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("visibility", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, esf.d};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        SessionGroupingVisibility sessionGroupingVisibility = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                sessionGroupingVisibility = (SessionGroupingVisibility) ud4VarC.l(serialDescriptor, 1, esf.d, sessionGroupingVisibility);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CreateSessionGroupingRequest(i, strV, sessionGroupingVisibility, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CreateSessionGroupingRequest createSessionGroupingRequest = (CreateSessionGroupingRequest) obj;
        encoder.getClass();
        createSessionGroupingRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CreateSessionGroupingRequest.write$Self$sessions(createSessionGroupingRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
