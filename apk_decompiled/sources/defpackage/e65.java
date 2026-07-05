package defpackage;

import com.anthropic.claude.sessions.types.CreateCoworkRemoteSessionRequest;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e65 implements w28 {
    public static final e65 a;
    private static final SerialDescriptor descriptor;

    static {
        e65 e65Var = new e65();
        a = e65Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CreateDramaticShrimpSessionRequest", e65Var, 4);
        pluginGeneratedSerialDescriptor.j("message", false);
        pluginGeneratedSerialDescriptor.j("message_uuid", false);
        pluginGeneratedSerialDescriptor.j("model", true);
        pluginGeneratedSerialDescriptor.j("file_attachments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CreateCoworkRemoteSessionRequest.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[3].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CreateCoworkRemoteSessionRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String str = null;
        List list = null;
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
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CreateCoworkRemoteSessionRequest(i, strV, strV2, str, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CreateCoworkRemoteSessionRequest createCoworkRemoteSessionRequest = (CreateCoworkRemoteSessionRequest) obj;
        encoder.getClass();
        createCoworkRemoteSessionRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CreateCoworkRemoteSessionRequest.write$Self$sessions(createCoworkRemoteSessionRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
