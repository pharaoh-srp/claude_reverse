package defpackage;

import com.anthropic.claude.sessions.types.EnvironmentConfiguration;
import com.anthropic.claude.sessions.types.EnvironmentUpdateRequest;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qr6 implements w28 {
    public static final qr6 a;
    private static final SerialDescriptor descriptor;

    static {
        qr6 qr6Var = new qr6();
        a = qr6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.EnvironmentUpdateRequest", qr6Var, 3);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("config", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S((KSerializer) EnvironmentUpdateRequest.$childSerializers[2].getValue());
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = EnvironmentUpdateRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        EnvironmentConfiguration environmentConfiguration = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                environmentConfiguration = (EnvironmentConfiguration) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), environmentConfiguration);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EnvironmentUpdateRequest(i, strV, strV2, environmentConfiguration, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EnvironmentUpdateRequest environmentUpdateRequest = (EnvironmentUpdateRequest) obj;
        encoder.getClass();
        environmentUpdateRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EnvironmentUpdateRequest.write$Self$sessions(environmentUpdateRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
