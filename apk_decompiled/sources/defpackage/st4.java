package defpackage;

import com.anthropic.claude.conway.protocol.ConwayErrorPayload;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class st4 implements w28 {
    public static final st4 a;
    private static final SerialDescriptor descriptor;

    static {
        st4 st4Var = new st4();
        a = st4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.ConwayErrorPayload", st4Var, 4);
        pluginGeneratedSerialDescriptor.j("layer", true);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j("message", false);
        pluginGeneratedSerialDescriptor.j("data", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), srgVar, srgVar, d4c.S(eh9.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String strV = null;
        String strV2 = null;
        JsonElement jsonElement = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                jsonElement = (JsonElement) ud4VarC.m(serialDescriptor, 3, eh9.a, jsonElement);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ConwayErrorPayload(i, str, strV, strV2, jsonElement, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConwayErrorPayload conwayErrorPayload = (ConwayErrorPayload) obj;
        encoder.getClass();
        conwayErrorPayload.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConwayErrorPayload.write$Self$conway(conwayErrorPayload, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
