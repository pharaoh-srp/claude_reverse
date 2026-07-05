package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanSeries;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i37 implements w28 {
    public static final i37 a;
    private static final SerialDescriptor descriptor;

    static {
        i37 i37Var = new i37();
        a = i37Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("series", i37Var, 1);
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
        return new EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanSeries(i, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanSeries eventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanSeries = (EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanSeries) obj;
        encoder.getClass();
        eventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanSeries.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanSeries.write$Self$Claude_tool_model(eventUpdateV0InputEventUpdatesItemRecurrenceSpanRecurrenceSpanSeries, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
