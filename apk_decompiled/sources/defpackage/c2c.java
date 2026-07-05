package defpackage;

import com.anthropic.claude.analytics.events.NetworkingEvents$RequestFailed;
import com.anthropic.claude.analytics.events.NetworkingEvents$RequestFailureReason;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c2c implements w28 {
    public static final c2c a;
    private static final SerialDescriptor descriptor;

    static {
        c2c c2cVar = new c2c();
        a = c2cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.networking.request_failed", c2cVar, 6);
        pluginGeneratedSerialDescriptor.j("endpoint", false);
        pluginGeneratedSerialDescriptor.j("reason", false);
        pluginGeneratedSerialDescriptor.j("error_code", true);
        pluginGeneratedSerialDescriptor.j("error_type", true);
        pluginGeneratedSerialDescriptor.j("error_message", true);
        pluginGeneratedSerialDescriptor.j("duration_ms", true);
        pluginGeneratedSerialDescriptor.k(new xmb(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = NetworkingEvents$RequestFailed.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, kw9VarArr[1].getValue(), d4c.S(e79.a), d4c.S(srgVar), d4c.S(srgVar), d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = NetworkingEvents$RequestFailed.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        NetworkingEvents$RequestFailureReason networkingEvents$RequestFailureReason = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        Long l = null;
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
                    networkingEvents$RequestFailureReason = (NetworkingEvents$RequestFailureReason) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), networkingEvents$RequestFailureReason);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) ud4VarC.m(serialDescriptor, 5, xka.a, l);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new NetworkingEvents$RequestFailed(i, strV, networkingEvents$RequestFailureReason, num, str, str2, l, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        NetworkingEvents$RequestFailed networkingEvents$RequestFailed = (NetworkingEvents$RequestFailed) obj;
        encoder.getClass();
        networkingEvents$RequestFailed.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        NetworkingEvents$RequestFailed.write$Self$analytics(networkingEvents$RequestFailed, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
