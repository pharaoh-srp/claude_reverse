package defpackage;

import com.anthropic.claude.tool.model.EventDeleteV0InputRemovedEventsItem;
import com.anthropic.claude.tool.model.EventDeleteV0InputRemovedEventsItemRecurrenceSpan;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ny6 implements w28 {
    public static final ny6 a;
    private static final SerialDescriptor descriptor;

    static {
        ny6 ny6Var = new ny6();
        a = ny6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventDeleteV0InputRemovedEventsItem", ny6Var, 3);
        pluginGeneratedSerialDescriptor.j("calendar_id", false);
        pluginGeneratedSerialDescriptor.j("event_id", false);
        pluginGeneratedSerialDescriptor.j("recurrence_span", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S((KSerializer) EventDeleteV0InputRemovedEventsItem.$childSerializers[2].getValue());
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, kSerializerS};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = EventDeleteV0InputRemovedEventsItem.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        EventDeleteV0InputRemovedEventsItemRecurrenceSpan eventDeleteV0InputRemovedEventsItemRecurrenceSpan = null;
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
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                eventDeleteV0InputRemovedEventsItemRecurrenceSpan = (EventDeleteV0InputRemovedEventsItemRecurrenceSpan) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), eventDeleteV0InputRemovedEventsItemRecurrenceSpan);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventDeleteV0InputRemovedEventsItem(i, strV, strV2, eventDeleteV0InputRemovedEventsItemRecurrenceSpan, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventDeleteV0InputRemovedEventsItem eventDeleteV0InputRemovedEventsItem = (EventDeleteV0InputRemovedEventsItem) obj;
        encoder.getClass();
        eventDeleteV0InputRemovedEventsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventDeleteV0InputRemovedEventsItem.write$Self$Claude_tool_model(eventDeleteV0InputRemovedEventsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
