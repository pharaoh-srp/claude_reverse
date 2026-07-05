package defpackage;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemNudgesItemDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b27 implements w28 {
    public static final b27 a;
    private static final SerialDescriptor descriptor;

    static {
        b27 b27Var = new b27();
        a = b27Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.EventUpdateEventUpdatesItemNudgesItemDescription", b27Var, 3);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, false);
        pluginGeneratedSerialDescriptor.j("minutes_before", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar};
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
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                strV3 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventUpdateEventUpdatesItemNudgesItemDescription(i, strV, strV2, strV3, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventUpdateEventUpdatesItemNudgesItemDescription eventUpdateEventUpdatesItemNudgesItemDescription = (EventUpdateEventUpdatesItemNudgesItemDescription) obj;
        encoder.getClass();
        eventUpdateEventUpdatesItemNudgesItemDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventUpdateEventUpdatesItemNudgesItemDescription.write$Self$models(eventUpdateEventUpdatesItemNudgesItemDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
