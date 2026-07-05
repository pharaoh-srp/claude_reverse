package defpackage;

import com.anthropic.claude.models.organization.configtypes.ChartDisplayInputDescriptions;
import com.anthropic.claude.models.organization.configtypes.ChartDisplaySeriesArrayDescription;
import com.anthropic.claude.models.organization.configtypes.ChartDisplayXAxisDescription;
import com.anthropic.claude.models.organization.configtypes.ChartDisplayYAxisDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qj2 implements w28 {
    public static final qj2 a;
    private static final SerialDescriptor descriptor;

    static {
        qj2 qj2Var = new qj2();
        a = qj2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.ChartDisplayInputDescriptions", qj2Var, 6);
        pluginGeneratedSerialDescriptor.j("tool_description", false);
        pluginGeneratedSerialDescriptor.j("series", false);
        pluginGeneratedSerialDescriptor.j("style", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("x_axis", false);
        pluginGeneratedSerialDescriptor.j("y_axis", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, sj2.a, srgVar, srgVar, wk2.a, yk2.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        ChartDisplaySeriesArrayDescription chartDisplaySeriesArrayDescription = null;
        String strV2 = null;
        String strV3 = null;
        ChartDisplayXAxisDescription chartDisplayXAxisDescription = null;
        ChartDisplayYAxisDescription chartDisplayYAxisDescription = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    chartDisplaySeriesArrayDescription = (ChartDisplaySeriesArrayDescription) ud4VarC.l(serialDescriptor, 1, sj2.a, chartDisplaySeriesArrayDescription);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strV3 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    chartDisplayXAxisDescription = (ChartDisplayXAxisDescription) ud4VarC.l(serialDescriptor, 4, wk2.a, chartDisplayXAxisDescription);
                    i |= 16;
                    break;
                case 5:
                    chartDisplayYAxisDescription = (ChartDisplayYAxisDescription) ud4VarC.l(serialDescriptor, 5, yk2.a, chartDisplayYAxisDescription);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChartDisplayInputDescriptions(i, strV, chartDisplaySeriesArrayDescription, strV2, strV3, chartDisplayXAxisDescription, chartDisplayYAxisDescription, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChartDisplayInputDescriptions chartDisplayInputDescriptions = (ChartDisplayInputDescriptions) obj;
        encoder.getClass();
        chartDisplayInputDescriptions.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChartDisplayInputDescriptions.write$Self$models(chartDisplayInputDescriptions, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
