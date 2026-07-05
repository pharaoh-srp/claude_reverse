package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceEnd;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceEndType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z27 implements w28 {
    public static final z27 a;
    private static final SerialDescriptor descriptor;

    static {
        z27 z27Var = new z27();
        a = z27Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceEnd", z27Var, 3);
        pluginGeneratedSerialDescriptor.j("count", true);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("until", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(e79.a), c37.d, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        EventUpdateV0InputEventUpdatesItemRecurrenceEndType eventUpdateV0InputEventUpdatesItemRecurrenceEndType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                num = (Integer) ud4VarC.m(serialDescriptor, 0, e79.a, num);
                i |= 1;
            } else if (iX == 1) {
                eventUpdateV0InputEventUpdatesItemRecurrenceEndType = (EventUpdateV0InputEventUpdatesItemRecurrenceEndType) ud4VarC.l(serialDescriptor, 1, c37.d, eventUpdateV0InputEventUpdatesItemRecurrenceEndType);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventUpdateV0InputEventUpdatesItemRecurrenceEnd(i, num, eventUpdateV0InputEventUpdatesItemRecurrenceEndType, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateV0InputEventUpdatesItemRecurrenceEnd eventUpdateV0InputEventUpdatesItemRecurrenceEnd = (EventUpdateV0InputEventUpdatesItemRecurrenceEnd) obj;
        encoder.getClass();
        eventUpdateV0InputEventUpdatesItemRecurrenceEnd.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateV0InputEventUpdatesItemRecurrenceEnd.write$Self$Claude_tool_model(eventUpdateV0InputEventUpdatesItemRecurrenceEnd, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
