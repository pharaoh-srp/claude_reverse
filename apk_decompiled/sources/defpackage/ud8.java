package defpackage;

import com.anthropic.claude.api.account.GrowthBookExperiment;
import com.anthropic.claude.api.account.GrowthBookExperimentResult;
import com.anthropic.claude.api.account.GrowthBookTrack;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ud8 implements w28 {
    public static final ud8 a;
    private static final SerialDescriptor descriptor;

    static {
        ud8 ud8Var = new ud8();
        a = ud8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.account.GrowthBookTrack", ud8Var, 2);
        pluginGeneratedSerialDescriptor.j("experiment", false);
        pluginGeneratedSerialDescriptor.j("result", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{dc8.a, hc8.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        GrowthBookExperiment growthBookExperiment = null;
        GrowthBookExperimentResult growthBookExperimentResult = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                growthBookExperiment = (GrowthBookExperiment) ud4VarC.l(serialDescriptor, 0, dc8.a, growthBookExperiment);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                growthBookExperimentResult = (GrowthBookExperimentResult) ud4VarC.l(serialDescriptor, 1, hc8.a, growthBookExperimentResult);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GrowthBookTrack(i, growthBookExperiment, growthBookExperimentResult, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GrowthBookTrack growthBookTrack = (GrowthBookTrack) obj;
        encoder.getClass();
        growthBookTrack.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GrowthBookTrack.write$Self$api(growthBookTrack, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
