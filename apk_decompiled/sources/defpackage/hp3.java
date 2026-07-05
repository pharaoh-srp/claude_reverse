package defpackage;

import com.anthropic.claude.conway.protocol.ClientRegistrationRequest;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hp3 implements w28 {
    public static final hp3 a;
    private static final SerialDescriptor descriptor;

    static {
        hp3 hp3Var = new hp3();
        a = hp3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.ClientRegistrationRequest", hp3Var, 6);
        pluginGeneratedSerialDescriptor.j("client_name", false);
        pluginGeneratedSerialDescriptor.j("client_id", true);
        pluginGeneratedSerialDescriptor.j("host_id", true);
        pluginGeneratedSerialDescriptor.j("client_description", false);
        pluginGeneratedSerialDescriptor.j("tools", true);
        pluginGeneratedSerialDescriptor.j("welcome_message", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ClientRegistrationRequest.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(srgVar), srgVar, kw9VarArr[4].getValue(), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ClientRegistrationRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        String str2 = null;
        String strV2 = null;
        List list = null;
        String str3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                    i |= 4;
                    break;
                case 3:
                    strV2 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str3);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClientRegistrationRequest(i, strV, str, str2, strV2, list, str3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClientRegistrationRequest clientRegistrationRequest = (ClientRegistrationRequest) obj;
        encoder.getClass();
        clientRegistrationRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ClientRegistrationRequest.write$Self$conway(clientRegistrationRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
