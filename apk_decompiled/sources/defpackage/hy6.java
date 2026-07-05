package defpackage;

import com.anthropic.claude.models.organization.configtypes.EventDeleteRemovedEventsItemDescription;
import com.anthropic.claude.models.organization.configtypes.EventDeleteRemovedEventsItemRecurrenceSpanDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hy6 implements w28 {
    public static final hy6 a;
    private static final SerialDescriptor descriptor;

    static {
        hy6 hy6Var = new hy6();
        a = hy6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.EventDeleteRemovedEventsItemDescription", hy6Var, 4);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("calendar_id", false);
        pluginGeneratedSerialDescriptor.j("event_id", false);
        pluginGeneratedSerialDescriptor.j("recurrence_span", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, jy6.a};
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
        EventDeleteRemovedEventsItemRecurrenceSpanDescription eventDeleteRemovedEventsItemRecurrenceSpanDescription = null;
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
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                eventDeleteRemovedEventsItemRecurrenceSpanDescription = (EventDeleteRemovedEventsItemRecurrenceSpanDescription) ud4VarC.l(serialDescriptor, 3, jy6.a, eventDeleteRemovedEventsItemRecurrenceSpanDescription);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventDeleteRemovedEventsItemDescription(i, strV, strV2, strV3, eventDeleteRemovedEventsItemRecurrenceSpanDescription, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventDeleteRemovedEventsItemDescription eventDeleteRemovedEventsItemDescription = (EventDeleteRemovedEventsItemDescription) obj;
        encoder.getClass();
        eventDeleteRemovedEventsItemDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventDeleteRemovedEventsItemDescription.write$Self$models(eventDeleteRemovedEventsItemDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
