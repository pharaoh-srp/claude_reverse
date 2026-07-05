package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItem;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemError;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t37 implements w28 {
    public static final t37 a;
    private static final SerialDescriptor descriptor;

    static {
        t37 t37Var = new t37();
        a = t37Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItem", t37Var, 4);
        pluginGeneratedSerialDescriptor.j("calendar_id", false);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("event_id", false);
        pluginGeneratedSerialDescriptor.j("updated_event", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(v37.a);
        KSerializer kSerializerS2 = d4c.S(x37.a);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, kSerializerS, srgVar, kSerializerS2};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemError eventUpdateV0OutputEventUpdateResultUpdateResultsItemError = null;
        String strV2 = null;
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                eventUpdateV0OutputEventUpdateResultUpdateResultsItemError = (EventUpdateV0OutputEventUpdateResultUpdateResultsItemError) ud4VarC.m(serialDescriptor, 1, v37.a, eventUpdateV0OutputEventUpdateResultUpdateResultsItemError);
                i |= 2;
            } else if (iX == 2) {
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent = (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent) ud4VarC.m(serialDescriptor, 3, x37.a, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventUpdateV0OutputEventUpdateResultUpdateResultsItem(i, strV, eventUpdateV0OutputEventUpdateResultUpdateResultsItemError, strV2, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateV0OutputEventUpdateResultUpdateResultsItem eventUpdateV0OutputEventUpdateResultUpdateResultsItem = (EventUpdateV0OutputEventUpdateResultUpdateResultsItem) obj;
        encoder.getClass();
        eventUpdateV0OutputEventUpdateResultUpdateResultsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateV0OutputEventUpdateResultUpdateResultsItem.write$Self$Claude_tool_model(eventUpdateV0OutputEventUpdateResultUpdateResultsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
