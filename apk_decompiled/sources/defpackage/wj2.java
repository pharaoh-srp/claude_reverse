package defpackage;

import com.anthropic.claude.models.organization.configtypes.ChartDisplaySeriesItemPointsArrayDescription;
import com.anthropic.claude.models.organization.configtypes.ChartDisplaySeriesItemPointsItemDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wj2 implements w28 {
    public static final wj2 a;
    private static final SerialDescriptor descriptor;

    static {
        wj2 wj2Var = new wj2();
        a = wj2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.ChartDisplaySeriesItemPointsArrayDescription", wj2Var, 2);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, yj2.a};
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
        ChartDisplaySeriesItemPointsItemDescription chartDisplaySeriesItemPointsItemDescription = null;
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
                chartDisplaySeriesItemPointsItemDescription = (ChartDisplaySeriesItemPointsItemDescription) ud4VarC.l(serialDescriptor, 1, yj2.a, chartDisplaySeriesItemPointsItemDescription);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChartDisplaySeriesItemPointsArrayDescription(i, strV, chartDisplaySeriesItemPointsItemDescription, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChartDisplaySeriesItemPointsArrayDescription chartDisplaySeriesItemPointsArrayDescription = (ChartDisplaySeriesItemPointsArrayDescription) obj;
        encoder.getClass();
        chartDisplaySeriesItemPointsArrayDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChartDisplaySeriesItemPointsArrayDescription.write$Self$models(chartDisplaySeriesItemPointsArrayDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
