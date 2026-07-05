package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventAvailability;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventStatus;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.OffsetDateTime;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x37 implements w28 {
    public static final x37 a;
    private static final SerialDescriptor descriptor;

    static {
        x37 x37Var = new x37();
        a = x37Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent", x37Var, 13);
        pluginGeneratedSerialDescriptor.j("all_day", true);
        pluginGeneratedSerialDescriptor.j("attendees", true);
        pluginGeneratedSerialDescriptor.j("availability", true);
        pluginGeneratedSerialDescriptor.j("end_time", true);
        pluginGeneratedSerialDescriptor.j("event_description", true);
        pluginGeneratedSerialDescriptor.j("event_id", false);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("nudges", true);
        pluginGeneratedSerialDescriptor.j("organizer", true);
        pluginGeneratedSerialDescriptor.j("recurrence", true);
        pluginGeneratedSerialDescriptor.j("start_time", false);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent.$childSerializers;
        KSerializer kSerializerS = d4c.S(zt1.a);
        KSerializer kSerializerS2 = d4c.S((KSerializer) kw9VarArr[1].getValue());
        KSerializer kSerializerS3 = d4c.S(a47.d);
        ay6 ay6Var = ay6.a;
        KSerializer kSerializerS4 = d4c.S(ay6Var);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4, d4c.S(srgVar), srgVar, d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[7].getValue()), d4c.S(srgVar), d4c.S(f47.a), ay6Var, d4c.S(q47.d), srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent.$childSerializers;
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventStatus eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventStatus = null;
        OffsetDateTime offsetDateTime = null;
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence = null;
        String str3 = null;
        boolean z3 = true;
        List list = null;
        int i = 0;
        Boolean bool = null;
        List list2 = null;
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventAvailability eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventAvailability = null;
        OffsetDateTime offsetDateTime2 = null;
        String str4 = null;
        String strV = null;
        String str5 = null;
        int i2 = 1;
        String strV2 = null;
        while (z3) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    str = strV;
                    z3 = false;
                    strV = str;
                    i2 = 1;
                    break;
                case 0:
                    str = strV;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool);
                    i |= 1;
                    z3 = z3;
                    strV = str;
                    i2 = 1;
                    break;
                case 1:
                    z2 = z3;
                    str2 = strV;
                    list2 = (List) ud4VarC.m(serialDescriptor, i2, (s06) kw9VarArr[i2].getValue(), list2);
                    i |= 2;
                    z3 = z2;
                    strV = str2;
                    break;
                case 2:
                    z2 = z3;
                    str2 = strV;
                    eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventAvailability = (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventAvailability) ud4VarC.m(serialDescriptor, 2, a47.d, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventAvailability);
                    i |= 4;
                    z3 = z2;
                    strV = str2;
                    break;
                case 3:
                    z2 = z3;
                    str2 = strV;
                    offsetDateTime2 = (OffsetDateTime) ud4VarC.m(serialDescriptor, 3, ay6.a, offsetDateTime2);
                    i |= 8;
                    z3 = z2;
                    strV = str2;
                    break;
                case 4:
                    z2 = z3;
                    str2 = strV;
                    str4 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str4);
                    i |= 16;
                    z3 = z2;
                    strV = str2;
                    break;
                case 5:
                    z = z3;
                    strV = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    z3 = z;
                    break;
                case 6:
                    z2 = z3;
                    str2 = strV;
                    str5 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str5);
                    i |= 64;
                    z3 = z2;
                    strV = str2;
                    break;
                case 7:
                    z2 = z3;
                    str2 = strV;
                    list = (List) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    z3 = z2;
                    strV = str2;
                    break;
                case 8:
                    z2 = z3;
                    str2 = strV;
                    str3 = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str3);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    z3 = z2;
                    strV = str2;
                    break;
                case 9:
                    z2 = z3;
                    str2 = strV;
                    eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence = (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence) ud4VarC.m(serialDescriptor, 9, f47.a, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence);
                    i |= 512;
                    z3 = z2;
                    strV = str2;
                    break;
                case 10:
                    z2 = z3;
                    str2 = strV;
                    offsetDateTime = (OffsetDateTime) ud4VarC.l(serialDescriptor, 10, ay6.a, offsetDateTime);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    z3 = z2;
                    strV = str2;
                    break;
                case 11:
                    z2 = z3;
                    str2 = strV;
                    eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventStatus = (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventStatus) ud4VarC.m(serialDescriptor, 11, q47.d, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventStatus);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    z3 = z2;
                    strV = str2;
                    break;
                case 12:
                    z = z3;
                    strV2 = ud4VarC.v(serialDescriptor, 12);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    z3 = z;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent(i, bool, list2, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventAvailability, offsetDateTime2, str4, strV, str5, list, str3, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventRecurrence, offsetDateTime, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventStatus, strV2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent = (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent) obj;
        encoder.getClass();
        eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent.write$Self$Claude_tool_model(eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
