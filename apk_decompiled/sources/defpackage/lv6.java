package defpackage;

import com.anthropic.claude.models.organization.configtypes.EventCreateNewEventsItemDescription;
import com.anthropic.claude.models.organization.configtypes.EventCreateNewEventsItemNudgesArrayDescription;
import com.anthropic.claude.models.organization.configtypes.EventCreateNewEventsItemRecurrenceDescription;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lv6 implements w28 {
    public static final lv6 a;
    private static final SerialDescriptor descriptor;

    static {
        lv6 lv6Var = new lv6();
        a = lv6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.EventCreateNewEventsItemDescription", lv6Var, 13);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("all_day", false);
        pluginGeneratedSerialDescriptor.j("attendees", false);
        pluginGeneratedSerialDescriptor.j("availability", false);
        pluginGeneratedSerialDescriptor.j("calendar_id", false);
        pluginGeneratedSerialDescriptor.j("end_time", false);
        pluginGeneratedSerialDescriptor.j("event_description", false);
        pluginGeneratedSerialDescriptor.j("location", false);
        pluginGeneratedSerialDescriptor.j("nudges", false);
        pluginGeneratedSerialDescriptor.j("recurrence", false);
        pluginGeneratedSerialDescriptor.j("start_time", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, nv6.a, rv6.a, srgVar, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        EventCreateNewEventsItemRecurrenceDescription eventCreateNewEventsItemRecurrenceDescription = null;
        boolean z = true;
        EventCreateNewEventsItemNudgesArrayDescription eventCreateNewEventsItemNudgesArrayDescription = null;
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
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strV4 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV5 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strV6 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strV7 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strV8 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    eventCreateNewEventsItemNudgesArrayDescription = (EventCreateNewEventsItemNudgesArrayDescription) ud4VarC.l(serialDescriptor, 8, nv6.a, eventCreateNewEventsItemNudgesArrayDescription);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    eventCreateNewEventsItemRecurrenceDescription = (EventCreateNewEventsItemRecurrenceDescription) ud4VarC.l(serialDescriptor, 9, rv6.a, eventCreateNewEventsItemRecurrenceDescription);
                    i |= 512;
                    break;
                case 10:
                    strV9 = ud4VarC.v(serialDescriptor, 10);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                case 11:
                    strV10 = ud4VarC.v(serialDescriptor, 11);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    break;
                case 12:
                    strV11 = ud4VarC.v(serialDescriptor, 12);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventCreateNewEventsItemDescription(i, strV, strV2, strV3, strV4, strV5, strV6, strV7, strV8, eventCreateNewEventsItemNudgesArrayDescription, eventCreateNewEventsItemRecurrenceDescription, strV9, strV10, strV11, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateNewEventsItemDescription eventCreateNewEventsItemDescription = (EventCreateNewEventsItemDescription) obj;
        encoder.getClass();
        eventCreateNewEventsItemDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventCreateNewEventsItemDescription.write$Self$models(eventCreateNewEventsItemDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
