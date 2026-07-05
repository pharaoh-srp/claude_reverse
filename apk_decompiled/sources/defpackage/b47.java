package defpackage;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItem;
import com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b47 implements w28 {
    public static final b47 a;
    private static final SerialDescriptor descriptor;

    static {
        b47 b47Var = new b47();
        a = b47Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItem", b47Var, 2);
        pluginGeneratedSerialDescriptor.j(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, true);
        pluginGeneratedSerialDescriptor.j("minutes_before", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(e47.d), e79.a};
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
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod = (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod) ud4VarC.m(serialDescriptor, 0, e47.d, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod);
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
        return new EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItem(i, eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItemMethod, iR, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItem eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItem = (EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItem) obj;
        encoder.getClass();
        eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItem.write$Self$Claude_tool_model(eventUpdateV0OutputEventUpdateResultUpdateResultsItemUpdatedEventNudgesItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
