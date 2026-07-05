package defpackage;

import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItem;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemAvailability;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemRecurrence;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemStatus;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.OffsetDateTime;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sw6 implements w28 {
    public static final sw6 a;
    private static final SerialDescriptor descriptor;

    static {
        sw6 sw6Var = new sw6();
        a = sw6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItem", sw6Var, 12);
        pluginGeneratedSerialDescriptor.j("all_day", true);
        pluginGeneratedSerialDescriptor.j("attendees", true);
        pluginGeneratedSerialDescriptor.j("availability", true);
        pluginGeneratedSerialDescriptor.j("calendar_id", true);
        pluginGeneratedSerialDescriptor.j("end_time", true);
        pluginGeneratedSerialDescriptor.j("event_description", true);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("nudges", true);
        pluginGeneratedSerialDescriptor.j("recurrence", true);
        pluginGeneratedSerialDescriptor.j("start_time", false);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = EventCreateV1InputNewEventsItem.$childSerializers;
        KSerializer kSerializerS = d4c.S(zt1.a);
        KSerializer kSerializerS2 = d4c.S((KSerializer) kw9VarArr[1].getValue());
        KSerializer kSerializerS3 = d4c.S(vw6.d);
        srg srgVar = srg.a;
        KSerializer kSerializerS4 = d4c.S(srgVar);
        ay6 ay6Var = ay6.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, kSerializerS3, kSerializerS4, d4c.S(ay6Var), d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[7].getValue()), d4c.S(ax6.a), ay6Var, d4c.S(lx6.d), srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        kw9[] kw9VarArr;
        boolean z;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr2 = EventCreateV1InputNewEventsItem.$childSerializers;
        EventCreateV1InputNewEventsItemStatus eventCreateV1InputNewEventsItemStatus = null;
        OffsetDateTime offsetDateTime = null;
        EventCreateV1InputNewEventsItemRecurrence eventCreateV1InputNewEventsItemRecurrence = null;
        boolean z2 = true;
        List list = null;
        int i = 0;
        Boolean bool = null;
        List list2 = null;
        EventCreateV1InputNewEventsItemAvailability eventCreateV1InputNewEventsItemAvailability = null;
        String str = null;
        OffsetDateTime offsetDateTime2 = null;
        String str2 = null;
        String str3 = null;
        int i2 = 1;
        String strV = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z2 = false;
                    i2 = 1;
                    break;
                case 0:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool);
                    i |= 1;
                    kw9VarArr2 = kw9VarArr2;
                    z2 = z2;
                    i2 = 1;
                    break;
                case 1:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    list2 = (List) ud4VarC.m(serialDescriptor, i2, (s06) kw9VarArr[i2].getValue(), list2);
                    i |= 2;
                    kw9VarArr2 = kw9VarArr;
                    z2 = z;
                    break;
                case 2:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    eventCreateV1InputNewEventsItemAvailability = (EventCreateV1InputNewEventsItemAvailability) ud4VarC.m(serialDescriptor, 2, vw6.d, eventCreateV1InputNewEventsItemAvailability);
                    i |= 4;
                    kw9VarArr2 = kw9VarArr;
                    z2 = z;
                    break;
                case 3:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    kw9VarArr2 = kw9VarArr;
                    z2 = z;
                    break;
                case 4:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    offsetDateTime2 = (OffsetDateTime) ud4VarC.m(serialDescriptor, 4, ay6.a, offsetDateTime2);
                    i |= 16;
                    kw9VarArr2 = kw9VarArr;
                    z2 = z;
                    break;
                case 5:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str2);
                    i |= 32;
                    kw9VarArr2 = kw9VarArr;
                    z2 = z;
                    break;
                case 6:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str3);
                    i |= 64;
                    kw9VarArr2 = kw9VarArr;
                    z2 = z;
                    break;
                case 7:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    list = (List) ud4VarC.m(serialDescriptor, 7, (s06) kw9VarArr[7].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    kw9VarArr2 = kw9VarArr;
                    z2 = z;
                    break;
                case 8:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    eventCreateV1InputNewEventsItemRecurrence = (EventCreateV1InputNewEventsItemRecurrence) ud4VarC.m(serialDescriptor, 8, ax6.a, eventCreateV1InputNewEventsItemRecurrence);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    kw9VarArr2 = kw9VarArr;
                    z2 = z;
                    break;
                case 9:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    offsetDateTime = (OffsetDateTime) ud4VarC.l(serialDescriptor, 9, ay6.a, offsetDateTime);
                    i |= 512;
                    kw9VarArr2 = kw9VarArr;
                    z2 = z;
                    break;
                case 10:
                    kw9VarArr = kw9VarArr2;
                    z = z2;
                    eventCreateV1InputNewEventsItemStatus = (EventCreateV1InputNewEventsItemStatus) ud4VarC.m(serialDescriptor, 10, lx6.d, eventCreateV1InputNewEventsItemStatus);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    kw9VarArr2 = kw9VarArr;
                    z2 = z;
                    break;
                case 11:
                    strV = ud4VarC.v(serialDescriptor, 11);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    kw9VarArr2 = kw9VarArr2;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventCreateV1InputNewEventsItem(i, bool, list2, eventCreateV1InputNewEventsItemAvailability, str, offsetDateTime2, str2, str3, list, eventCreateV1InputNewEventsItemRecurrence, offsetDateTime, eventCreateV1InputNewEventsItemStatus, strV, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateV1InputNewEventsItem eventCreateV1InputNewEventsItem = (EventCreateV1InputNewEventsItem) obj;
        encoder.getClass();
        eventCreateV1InputNewEventsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventCreateV1InputNewEventsItem.write$Self$Claude_tool_model(eventCreateV1InputNewEventsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
