package defpackage;

import com.anthropic.claude.tool.model.ChartDisplayV0InputSeriesItem;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dk2 implements w28 {
    public static final dk2 a;
    private static final SerialDescriptor descriptor;

    static {
        dk2 dk2Var = new dk2();
        a = dk2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.ChartDisplayV0InputSeriesItem", dk2Var, 4);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("points", true);
        pluginGeneratedSerialDescriptor.j("values", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ChartDisplayV0InputSeriesItem.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[2].getValue()), d4c.S((KSerializer) kw9VarArr[3].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ChartDisplayV0InputSeriesItem.$childSerializers;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            } else if (iX == 2) {
                list = (List) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                list2 = (List) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), list2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChartDisplayV0InputSeriesItem(i, str, str2, list, list2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChartDisplayV0InputSeriesItem chartDisplayV0InputSeriesItem = (ChartDisplayV0InputSeriesItem) obj;
        encoder.getClass();
        chartDisplayV0InputSeriesItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChartDisplayV0InputSeriesItem.write$Self$Claude_tool_model(chartDisplayV0InputSeriesItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
