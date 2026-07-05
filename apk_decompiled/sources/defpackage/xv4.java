package defpackage;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.conway.protocol.ConwayForkMeta;
import com.anthropic.claude.types.strings.ForkId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xv4 implements w28 {
    public static final xv4 a;
    private static final SerialDescriptor descriptor;

    static {
        xv4 xv4Var = new xv4();
        a = xv4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.ConwayForkMeta", xv4Var, 6);
        pluginGeneratedSerialDescriptor.j("agentId", false);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("createdAt", true);
        pluginGeneratedSerialDescriptor.j("lastActivityAt", true);
        pluginGeneratedSerialDescriptor.j("lastAssistantText", true);
        pluginGeneratedSerialDescriptor.j(VerifyResponse.AuthenticationState.DISCRIMINATOR, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        xka xkaVar = xka.a;
        return new KSerializer[]{aw7.a, kSerializerS, xkaVar, d4c.S(xkaVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String strM1028unboximpl = null;
        String str = null;
        Long l = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    ForkId forkId = (ForkId) ud4VarC.l(serialDescriptor, 0, aw7.a, strM1028unboximpl != null ? ForkId.m1021boximpl(strM1028unboximpl) : null);
                    strM1028unboximpl = forkId != null ? forkId.m1028unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    j = ud4VarC.j(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    l = (Long) ud4VarC.m(serialDescriptor, 3, xka.a, l);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
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
        return new ConwayForkMeta(i, strM1028unboximpl, str, j, l, str2, str3, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConwayForkMeta conwayForkMeta = (ConwayForkMeta) obj;
        encoder.getClass();
        conwayForkMeta.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConwayForkMeta.write$Self$conway(conwayForkMeta, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
