package defpackage;

import com.anthropic.claude.conway.protocol.CreateForkResponse;
import com.anthropic.claude.types.strings.ForkId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z65 implements w28 {
    public static final z65 a;
    private static final SerialDescriptor descriptor;

    static {
        z65 z65Var = new z65();
        a = z65Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.CreateForkResponse", z65Var, 3);
        pluginGeneratedSerialDescriptor.j("agentId", false);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("createdAt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{aw7.a, d4c.S(srg.a), xka.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String strM1028unboximpl = null;
        String str = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                ForkId forkId = (ForkId) ud4VarC.l(serialDescriptor, 0, aw7.a, strM1028unboximpl != null ? ForkId.m1021boximpl(strM1028unboximpl) : null);
                strM1028unboximpl = forkId != null ? forkId.m1028unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                j = ud4VarC.j(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CreateForkResponse(i, strM1028unboximpl, str, j, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CreateForkResponse createForkResponse = (CreateForkResponse) obj;
        encoder.getClass();
        createForkResponse.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CreateForkResponse.write$Self$conway(createForkResponse, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
