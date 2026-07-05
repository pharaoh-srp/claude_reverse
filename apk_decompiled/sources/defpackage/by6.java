package defpackage;

import com.anthropic.claude.tool.model.EventDeleteDetails;
import java.time.OffsetDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class by6 implements w28 {
    public static final by6 a;
    private static final SerialDescriptor descriptor;

    static {
        by6 by6Var = new by6();
        a = by6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventDeleteDetails", by6Var, 3);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("startTime", false);
        pluginGeneratedSerialDescriptor.j("endTime", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        ay6 ay6Var = ay6.a;
        return new KSerializer[]{srg.a, ay6Var, d4c.S(ay6Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        OffsetDateTime offsetDateTime = null;
        OffsetDateTime offsetDateTime2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                offsetDateTime = (OffsetDateTime) ud4VarC.l(serialDescriptor, 1, ay6.a, offsetDateTime);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                offsetDateTime2 = (OffsetDateTime) ud4VarC.m(serialDescriptor, 2, ay6.a, offsetDateTime2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventDeleteDetails(i, strV, offsetDateTime, offsetDateTime2, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventDeleteDetails eventDeleteDetails = (EventDeleteDetails) obj;
        encoder.getClass();
        eventDeleteDetails.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventDeleteDetails.write$Self$tool(eventDeleteDetails, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
