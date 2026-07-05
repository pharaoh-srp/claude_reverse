package defpackage;

import com.anthropic.claude.sessions.types.GetOrCreateDispatchSessionRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a48 implements w28 {
    public static final a48 a;
    private static final SerialDescriptor descriptor;

    static {
        a48 a48Var = new a48();
        a = a48Var;
        descriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.GetOrCreateDispatchSessionRequest", a48Var, 0);
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int iX = ud4VarC.x(serialDescriptor);
        vnf vnfVar = null;
        if (iX == -1) {
            ud4VarC.b(serialDescriptor);
            return new GetOrCreateDispatchSessionRequest(0, vnfVar);
        }
        sz6.e(iX);
        return null;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GetOrCreateDispatchSessionRequest getOrCreateDispatchSessionRequest = (GetOrCreateDispatchSessionRequest) obj;
        encoder.getClass();
        getOrCreateDispatchSessionRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GetOrCreateDispatchSessionRequest.write$Self$sessions(getOrCreateDispatchSessionRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
