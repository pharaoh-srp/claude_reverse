package defpackage;

import com.anthropic.claude.models.organization.configtypes.ChartDisplaySeriesArrayDescription;
import com.anthropic.claude.models.organization.configtypes.ChartDisplaySeriesItemDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sj2 implements w28 {
    public static final sj2 a;
    private static final SerialDescriptor descriptor;

    static {
        sj2 sj2Var = new sj2();
        a = sj2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.ChartDisplaySeriesArrayDescription", sj2Var, 2);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, uj2.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        ChartDisplaySeriesItemDescription chartDisplaySeriesItemDescription = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                chartDisplaySeriesItemDescription = (ChartDisplaySeriesItemDescription) ud4VarC.l(serialDescriptor, 1, uj2.a, chartDisplaySeriesItemDescription);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChartDisplaySeriesArrayDescription(i, strV, chartDisplaySeriesItemDescription, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChartDisplaySeriesArrayDescription chartDisplaySeriesArrayDescription = (ChartDisplaySeriesArrayDescription) obj;
        encoder.getClass();
        chartDisplaySeriesArrayDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChartDisplaySeriesArrayDescription.write$Self$models(chartDisplaySeriesArrayDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
