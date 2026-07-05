package defpackage;

import com.anthropic.claude.analytics.events.ResearchEvents$ResearchStatusNotificationDismissed;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ele implements w28 {
    public static final ele a;
    private static final SerialDescriptor descriptor;

    static {
        ele eleVar = new ele();
        a = eleVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("research_status_notification_dismissed", eleVar, 2);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", false);
        pluginGeneratedSerialDescriptor.k(new xmb(10));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                strV2 = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ResearchEvents$ResearchStatusNotificationDismissed(i, strV, strV2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ResearchEvents$ResearchStatusNotificationDismissed researchEvents$ResearchStatusNotificationDismissed = (ResearchEvents$ResearchStatusNotificationDismissed) obj;
        encoder.getClass();
        researchEvents$ResearchStatusNotificationDismissed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ResearchEvents$ResearchStatusNotificationDismissed.write$Self$analytics(researchEvents$ResearchStatusNotificationDismissed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
