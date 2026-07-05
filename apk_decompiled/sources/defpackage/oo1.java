package defpackage;

import com.anthropic.claude.models.organization.configtypes.BetaToolsConfig;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo1 implements w28 {
    public static final oo1 a;
    private static final SerialDescriptor descriptor;

    static {
        oo1 oo1Var = new oo1();
        a = oo1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.BetaToolsConfig", oo1Var, 2);
        pluginGeneratedSerialDescriptor.j("beta_tools", true);
        pluginGeneratedSerialDescriptor.j("betaToolSettings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = BetaToolsConfig.$childSerializers;
        return new KSerializer[]{d4c.S((KSerializer) kw9VarArr[0].getValue()), kw9VarArr[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = BetaToolsConfig.$childSerializers;
        boolean z = true;
        int i = 0;
        List list = null;
        Set set = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                set = (Set) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), set);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BetaToolsConfig(i, list, set, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BetaToolsConfig betaToolsConfig = (BetaToolsConfig) obj;
        encoder.getClass();
        betaToolsConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BetaToolsConfig.write$Self$models(betaToolsConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
