package defpackage;

import com.anthropic.claude.sessions.types.SelfHostedRunnerPool;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mjf implements w28 {
    public static final mjf a;
    private static final SerialDescriptor descriptor;

    static {
        mjf mjfVar = new mjf();
        a = mjfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SelfHostedRunnerPool", mjfVar, 4);
        pluginGeneratedSerialDescriptor.j("pool_id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("alive_runner_count", true);
        pluginGeneratedSerialDescriptor.j("pending_session_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        e79 e79Var = e79.a;
        KSerializer kSerializerS = d4c.S(e79Var);
        KSerializer kSerializerS2 = d4c.S(e79Var);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kSerializerS, kSerializerS2};
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
        Integer num = null;
        Integer num2 = null;
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
                num = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                num2 = (Integer) ud4VarC.m(serialDescriptor, 3, e79.a, num2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SelfHostedRunnerPool(i, strV, strV2, num, num2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SelfHostedRunnerPool selfHostedRunnerPool = (SelfHostedRunnerPool) obj;
        encoder.getClass();
        selfHostedRunnerPool.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SelfHostedRunnerPool.write$Self$sessions(selfHostedRunnerPool, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
