package defpackage;

import com.anthropic.claude.sessions.types.ClientPresenceInfo;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fp3 implements w28 {
    public static final fp3 a;
    private static final SerialDescriptor descriptor;

    static {
        fp3 fp3Var = new fp3();
        a = fp3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.ClientPresenceInfo", fp3Var, 3);
        pluginGeneratedSerialDescriptor.j("platform", false);
        pluginGeneratedSerialDescriptor.j("client_id", false);
        pluginGeneratedSerialDescriptor.j("last_pulse_at", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, g69.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        c69 c69Var = null;
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
                c69Var = (c69) ud4VarC.l(serialDescriptor, 2, g69.a, c69Var);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClientPresenceInfo(i, strV, strV2, c69Var, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClientPresenceInfo clientPresenceInfo = (ClientPresenceInfo) obj;
        encoder.getClass();
        clientPresenceInfo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ClientPresenceInfo.write$Self$sessions(clientPresenceInfo, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
