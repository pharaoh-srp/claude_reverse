package defpackage;

import com.anthropic.claude.sessions.types.ClientEventEnvelope;
import com.anthropic.claude.sessions.types.DeviceAttestation;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class to3 implements w28 {
    public static final to3 a;
    private static final SerialDescriptor descriptor;

    static {
        to3 to3Var = new to3();
        a = to3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.ClientEventEnvelope", to3Var, 2);
        pluginGeneratedSerialDescriptor.j("payload", false);
        pluginGeneratedSerialDescriptor.j("device_attestation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uh9.a, d4c.S(i26.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        JsonObject jsonObject = null;
        DeviceAttestation deviceAttestation = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                jsonObject = (JsonObject) ud4VarC.l(serialDescriptor, 0, uh9.a, jsonObject);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                deviceAttestation = (DeviceAttestation) ud4VarC.m(serialDescriptor, 1, i26.a, deviceAttestation);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClientEventEnvelope(i, jsonObject, deviceAttestation, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClientEventEnvelope clientEventEnvelope = (ClientEventEnvelope) obj;
        encoder.getClass();
        clientEventEnvelope.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ClientEventEnvelope.write$Self$sessions(clientEventEnvelope, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
