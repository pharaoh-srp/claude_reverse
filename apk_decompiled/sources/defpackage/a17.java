package defpackage;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem;
import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a17 implements w28 {
    public static final a17 a;
    private static final SerialDescriptor descriptor;

    static {
        a17 a17Var = new a17();
        a = a17Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem", a17Var, 2);
        pluginGeneratedSerialDescriptor.j(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, true);
        pluginGeneratedSerialDescriptor.j("minutes_before", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(d17.d), e79.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod = (EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod) ud4VarC.m(serialDescriptor, 0, d17.d, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem(i, eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItemMethod, iR, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem = (EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem) obj;
        encoder.getClass();
        eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem.write$Self$Claude_tool_model(eventSearchV0OutputEventSearchResultCalendarEventsItemEventsItemNudgesItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
