package defpackage;

import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItem;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemAvailability;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrence;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemRecurrenceSpan;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemStatus;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.OffsetDateTime;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n27 implements w28 {
    public static final n27 a;
    private static final SerialDescriptor descriptor;

    static {
        n27 n27Var = new n27();
        a = n27Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItem", n27Var, 14);
        pluginGeneratedSerialDescriptor.j("all_day", true);
        pluginGeneratedSerialDescriptor.j("attendees", true);
        pluginGeneratedSerialDescriptor.j("availability", true);
        pluginGeneratedSerialDescriptor.j("calendar_id", false);
        pluginGeneratedSerialDescriptor.j("end_time", true);
        pluginGeneratedSerialDescriptor.j("event_description", true);
        pluginGeneratedSerialDescriptor.j("event_id", false);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("nudges", true);
        pluginGeneratedSerialDescriptor.j("recurrence", true);
        pluginGeneratedSerialDescriptor.j("recurrence_span", true);
        pluginGeneratedSerialDescriptor.j("start_time", true);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = EventUpdateV0InputEventUpdatesItem.$childSerializers;
        KSerializer kSerializerS = d4c.S(zt1.a);
        KSerializer kSerializerS2 = d4c.S((KSerializer) kw9VarArr[1].getValue());
        KSerializer kSerializerS3 = d4c.S(q27.d);
        srg srgVar = srg.a;
        ay6 ay6Var = ay6.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, kSerializerS3, srgVar, d4c.S(ay6Var), d4c.S(srgVar), srgVar, d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[8].getValue()), d4c.S(v27.a), d4c.S((KSerializer) kw9VarArr[10].getValue()), d4c.S(ay6Var), d4c.S(l37.d), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        Boolean bool;
        String str;
        OffsetDateTime offsetDateTime;
        String str2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = EventUpdateV0InputEventUpdatesItem.$childSerializers;
        OffsetDateTime offsetDateTime2 = null;
        EventUpdateV0InputEventUpdatesItemRecurrenceSpan eventUpdateV0InputEventUpdatesItemRecurrenceSpan = null;
        EventUpdateV0InputEventUpdatesItemRecurrence eventUpdateV0InputEventUpdatesItemRecurrence = null;
        List list = null;
        EventUpdateV0InputEventUpdatesItemStatus eventUpdateV0InputEventUpdatesItemStatus = null;
        String str3 = null;
        int i = 0;
        Boolean bool2 = null;
        List list2 = null;
        EventUpdateV0InputEventUpdatesItemAvailability eventUpdateV0InputEventUpdatesItemAvailability = null;
        String str4 = null;
        OffsetDateTime offsetDateTime3 = null;
        String str5 = null;
        String strV = null;
        int i2 = 1;
        boolean z = true;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    offsetDateTime = offsetDateTime2;
                    str2 = strV;
                    z = false;
                    strV = str2;
                    offsetDateTime2 = offsetDateTime;
                    i2 = 1;
                    break;
                case 0:
                    str2 = strV;
                    offsetDateTime = offsetDateTime2;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool2);
                    i |= 1;
                    strV = str2;
                    offsetDateTime2 = offsetDateTime;
                    i2 = 1;
                    break;
                case 1:
                    bool = bool2;
                    str = strV;
                    list2 = (List) ud4VarC.m(serialDescriptor, i2, (s06) kw9VarArr[i2].getValue(), list2);
                    i |= 2;
                    strV = str;
                    bool2 = bool;
                    break;
                case 2:
                    bool = bool2;
                    str = strV;
                    eventUpdateV0InputEventUpdatesItemAvailability = (EventUpdateV0InputEventUpdatesItemAvailability) ud4VarC.m(serialDescriptor, 2, q27.d, eventUpdateV0InputEventUpdatesItemAvailability);
                    i |= 4;
                    strV = str;
                    bool2 = bool;
                    break;
                case 3:
                    bool = bool2;
                    strV2 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    bool2 = bool;
                    break;
                case 4:
                    bool = bool2;
                    str = strV;
                    offsetDateTime3 = (OffsetDateTime) ud4VarC.m(serialDescriptor, 4, ay6.a, offsetDateTime3);
                    i |= 16;
                    strV = str;
                    bool2 = bool;
                    break;
                case 5:
                    bool = bool2;
                    str = strV;
                    str5 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str5);
                    i |= 32;
                    strV = str;
                    bool2 = bool;
                    break;
                case 6:
                    bool = bool2;
                    strV = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    bool2 = bool;
                    break;
                case 7:
                    bool = bool2;
                    str = strV;
                    str3 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str3);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    strV = str;
                    bool2 = bool;
                    break;
                case 8:
                    bool = bool2;
                    str = strV;
                    list = (List) ud4VarC.m(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), list);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    strV = str;
                    bool2 = bool;
                    break;
                case 9:
                    bool = bool2;
                    str = strV;
                    eventUpdateV0InputEventUpdatesItemRecurrence = (EventUpdateV0InputEventUpdatesItemRecurrence) ud4VarC.m(serialDescriptor, 9, v27.a, eventUpdateV0InputEventUpdatesItemRecurrence);
                    i |= 512;
                    strV = str;
                    bool2 = bool;
                    break;
                case 10:
                    bool = bool2;
                    str = strV;
                    eventUpdateV0InputEventUpdatesItemRecurrenceSpan = (EventUpdateV0InputEventUpdatesItemRecurrenceSpan) ud4VarC.m(serialDescriptor, 10, (s06) kw9VarArr[10].getValue(), eventUpdateV0InputEventUpdatesItemRecurrenceSpan);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    strV = str;
                    bool2 = bool;
                    break;
                case 11:
                    bool = bool2;
                    str = strV;
                    offsetDateTime2 = (OffsetDateTime) ud4VarC.m(serialDescriptor, 11, ay6.a, offsetDateTime2);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    strV = str;
                    bool2 = bool;
                    break;
                case 12:
                    bool = bool2;
                    str = strV;
                    eventUpdateV0InputEventUpdatesItemStatus = (EventUpdateV0InputEventUpdatesItemStatus) ud4VarC.m(serialDescriptor, 12, l37.d, eventUpdateV0InputEventUpdatesItemStatus);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    strV = str;
                    bool2 = bool;
                    break;
                case 13:
                    str = strV;
                    bool = bool2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 13, srg.a, str4);
                    i |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    strV = str;
                    bool2 = bool;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        String str6 = strV;
        ud4VarC.b(serialDescriptor);
        return new EventUpdateV0InputEventUpdatesItem(i, bool2, list2, eventUpdateV0InputEventUpdatesItemAvailability, strV2, offsetDateTime3, str5, str6, str3, list, eventUpdateV0InputEventUpdatesItemRecurrence, eventUpdateV0InputEventUpdatesItemRecurrenceSpan, offsetDateTime2, eventUpdateV0InputEventUpdatesItemStatus, str4, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateV0InputEventUpdatesItem eventUpdateV0InputEventUpdatesItem = (EventUpdateV0InputEventUpdatesItem) obj;
        encoder.getClass();
        eventUpdateV0InputEventUpdatesItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateV0InputEventUpdatesItem.write$Self$Claude_tool_model(eventUpdateV0InputEventUpdatesItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
