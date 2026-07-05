package defpackage;

import com.anthropic.claude.tool.calendar.EventInfo;
import java.time.OffsetDateTime;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lz6 implements w28 {
    public static final lz6 a;
    private static final SerialDescriptor descriptor;

    static {
        lz6 lz6Var = new lz6();
        a = lz6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.calendar.EventInfo", lz6Var, 5);
        pluginGeneratedSerialDescriptor.j("eventId", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("startTime", false);
        pluginGeneratedSerialDescriptor.j("endTime", false);
        pluginGeneratedSerialDescriptor.j("syncId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        ay6 ay6Var = ay6.a;
        return new KSerializer[]{srgVar, srgVar, ay6Var, d4c.S(ay6Var), d4c.S(srgVar)};
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
        OffsetDateTime offsetDateTime = null;
        OffsetDateTime offsetDateTime2 = null;
        String str = null;
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
            } else if (iX == 2) {
                offsetDateTime = (OffsetDateTime) ud4VarC.l(serialDescriptor, 2, ay6.a, offsetDateTime);
                i |= 4;
            } else if (iX == 3) {
                offsetDateTime2 = (OffsetDateTime) ud4VarC.m(serialDescriptor, 3, ay6.a, offsetDateTime2);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventInfo(i, strV, strV2, offsetDateTime, offsetDateTime2, str, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventInfo eventInfo = (EventInfo) obj;
        encoder.getClass();
        eventInfo.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventInfo.write$Self$tool(eventInfo, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
