package defpackage;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemNudgesItem;
import com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemNudgesItemMethod;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ww6 implements w28 {
    public static final ww6 a;
    private static final SerialDescriptor descriptor;

    static {
        ww6 ww6Var = new ww6();
        a = ww6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventCreateV1InputNewEventsItemNudgesItem", ww6Var, 2);
        pluginGeneratedSerialDescriptor.j(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, true);
        pluginGeneratedSerialDescriptor.j("minutes_before", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(zw6.d), e79.a};
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
        EventCreateV1InputNewEventsItemNudgesItemMethod eventCreateV1InputNewEventsItemNudgesItemMethod = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                eventCreateV1InputNewEventsItemNudgesItemMethod = (EventCreateV1InputNewEventsItemNudgesItemMethod) ud4VarC.m(serialDescriptor, 0, zw6.d, eventCreateV1InputNewEventsItemNudgesItemMethod);
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
        return new EventCreateV1InputNewEventsItemNudgesItem(i, eventCreateV1InputNewEventsItemNudgesItemMethod, iR, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateV1InputNewEventsItemNudgesItem eventCreateV1InputNewEventsItemNudgesItem = (EventCreateV1InputNewEventsItemNudgesItem) obj;
        encoder.getClass();
        eventCreateV1InputNewEventsItemNudgesItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventCreateV1InputNewEventsItemNudgesItem.write$Self$Claude_tool_model(eventCreateV1InputNewEventsItemNudgesItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
