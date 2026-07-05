package defpackage;

import com.anthropic.claude.models.organization.configtypes.ChartDisplaySeriesItemDescription;
import com.anthropic.claude.models.organization.configtypes.ChartDisplaySeriesItemPointsArrayDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uj2 implements w28 {
    public static final uj2 a;
    private static final SerialDescriptor descriptor;

    static {
        uj2 uj2Var = new uj2();
        a = uj2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.ChartDisplaySeriesItemDescription", uj2Var, 5);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("color", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("points", false);
        pluginGeneratedSerialDescriptor.j("values", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, wj2.a, srgVar};
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
        String strV3 = null;
        ChartDisplaySeriesItemPointsArrayDescription chartDisplaySeriesItemPointsArrayDescription = null;
        String strV4 = null;
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
                strV3 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                chartDisplaySeriesItemPointsArrayDescription = (ChartDisplaySeriesItemPointsArrayDescription) ud4VarC.l(serialDescriptor, 3, wj2.a, chartDisplaySeriesItemPointsArrayDescription);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                strV4 = ud4VarC.v(serialDescriptor, 4);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChartDisplaySeriesItemDescription(i, strV, strV2, strV3, chartDisplaySeriesItemPointsArrayDescription, strV4, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChartDisplaySeriesItemDescription chartDisplaySeriesItemDescription = (ChartDisplaySeriesItemDescription) obj;
        encoder.getClass();
        chartDisplaySeriesItemDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChartDisplaySeriesItemDescription.write$Self$models(chartDisplaySeriesItemDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
