package defpackage;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemNudgesItem;
import com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemNudgesItemMethod;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r27 implements w28 {
    public static final r27 a;
    private static final SerialDescriptor descriptor;

    static {
        r27 r27Var = new r27();
        a = r27Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventUpdateV0InputEventUpdatesItemNudgesItem", r27Var, 2);
        pluginGeneratedSerialDescriptor.j(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, true);
        pluginGeneratedSerialDescriptor.j("minutes_before", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(u27.d), e79.a};
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
        EventUpdateV0InputEventUpdatesItemNudgesItemMethod eventUpdateV0InputEventUpdatesItemNudgesItemMethod = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                eventUpdateV0InputEventUpdatesItemNudgesItemMethod = (EventUpdateV0InputEventUpdatesItemNudgesItemMethod) ud4VarC.m(serialDescriptor, 0, u27.d, eventUpdateV0InputEventUpdatesItemNudgesItemMethod);
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
        return new EventUpdateV0InputEventUpdatesItemNudgesItem(i, eventUpdateV0InputEventUpdatesItemNudgesItemMethod, iR, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateV0InputEventUpdatesItemNudgesItem eventUpdateV0InputEventUpdatesItemNudgesItem = (EventUpdateV0InputEventUpdatesItemNudgesItem) obj;
        encoder.getClass();
        eventUpdateV0InputEventUpdatesItemNudgesItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateV0InputEventUpdatesItemNudgesItem.write$Self$Claude_tool_model(eventUpdateV0InputEventUpdatesItemNudgesItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
