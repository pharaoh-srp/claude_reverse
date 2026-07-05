package defpackage;

import com.anthropic.claude.tool.model.EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanSeries;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sy6 implements w28 {
    public static final sy6 a;
    private static final SerialDescriptor descriptor;

    static {
        sy6 sy6Var = new sy6();
        a = sy6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("series", sy6Var, 1);
        pluginGeneratedSerialDescriptor.j("placeholder", true);
        pluginGeneratedSerialDescriptor.k(new pi(21));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanSeries(i, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanSeries eventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanSeries = (EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanSeries) obj;
        encoder.getClass();
        eventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanSeries.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanSeries.write$Self$Claude_tool_model(eventDeleteV0InputRemovedEventsItemRecurrenceSpanRecurrenceSpanSeries, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
