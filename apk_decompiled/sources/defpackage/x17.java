package defpackage;

import com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemDescription;
import com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemNudgesArrayDescription;
import com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemRecurrenceDescription;
import com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemRecurrenceSpanDescription;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x17 implements w28 {
    public static final x17 a;
    private static final SerialDescriptor descriptor;

    static {
        x17 x17Var = new x17();
        a = x17Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemDescription", x17Var, 15);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("all_day", false);
        pluginGeneratedSerialDescriptor.j("attendees", false);
        pluginGeneratedSerialDescriptor.j("availability", false);
        pluginGeneratedSerialDescriptor.j("calendar_id", false);
        pluginGeneratedSerialDescriptor.j("end_time", false);
        pluginGeneratedSerialDescriptor.j("event_description", false);
        pluginGeneratedSerialDescriptor.j("event_id", false);
        pluginGeneratedSerialDescriptor.j("location", false);
        pluginGeneratedSerialDescriptor.j("nudges", false);
        pluginGeneratedSerialDescriptor.j("recurrence", false);
        pluginGeneratedSerialDescriptor.j("recurrence_span", false);
        pluginGeneratedSerialDescriptor.j("start_time", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, z17.a, d27.a, h27.a, srgVar, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        EventUpdateEventUpdatesItemRecurrenceSpanDescription eventUpdateEventUpdatesItemRecurrenceSpanDescription = null;
        EventUpdateEventUpdatesItemRecurrenceDescription eventUpdateEventUpdatesItemRecurrenceDescription = null;
        boolean z2 = true;
        EventUpdateEventUpdatesItemNudgesArrayDescription eventUpdateEventUpdatesItemNudgesArrayDescription = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        String strV7 = null;
        String strV8 = null;
        String strV9 = null;
        String strV10 = null;
        String strV11 = null;
        String strV12 = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    continue;
                case 2:
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    continue;
                case 3:
                    strV4 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    strV5 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    strV6 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    strV7 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    strV8 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                case 8:
                    strV9 = ud4VarC.v(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    continue;
                case 9:
                    z = z2;
                    eventUpdateEventUpdatesItemNudgesArrayDescription = (EventUpdateEventUpdatesItemNudgesArrayDescription) ud4VarC.l(serialDescriptor, 9, z17.a, eventUpdateEventUpdatesItemNudgesArrayDescription);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    eventUpdateEventUpdatesItemRecurrenceDescription = (EventUpdateEventUpdatesItemRecurrenceDescription) ud4VarC.l(serialDescriptor, 10, d27.a, eventUpdateEventUpdatesItemRecurrenceDescription);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                case 11:
                    z = z2;
                    eventUpdateEventUpdatesItemRecurrenceSpanDescription = (EventUpdateEventUpdatesItemRecurrenceSpanDescription) ud4VarC.l(serialDescriptor, 11, h27.a, eventUpdateEventUpdatesItemRecurrenceSpanDescription);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    break;
                case 12:
                    strV10 = ud4VarC.v(serialDescriptor, 12);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    continue;
                case 13:
                    strV11 = ud4VarC.v(serialDescriptor, 13);
                    i |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    continue;
                case 14:
                    strV12 = ud4VarC.v(serialDescriptor, 14);
                    i |= 16384;
                    continue;
                default:
                    sz6.e(iX);
                    return null;
            }
            z2 = z;
        }
        ud4VarC.b(serialDescriptor);
        return new EventUpdateEventUpdatesItemDescription(i, strV, strV2, strV3, strV4, strV5, strV6, strV7, strV8, strV9, eventUpdateEventUpdatesItemNudgesArrayDescription, eventUpdateEventUpdatesItemRecurrenceDescription, eventUpdateEventUpdatesItemRecurrenceSpanDescription, strV10, strV11, strV12, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateEventUpdatesItemDescription eventUpdateEventUpdatesItemDescription = (EventUpdateEventUpdatesItemDescription) obj;
        encoder.getClass();
        eventUpdateEventUpdatesItemDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateEventUpdatesItemDescription.write$Self$models(eventUpdateEventUpdatesItemDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
