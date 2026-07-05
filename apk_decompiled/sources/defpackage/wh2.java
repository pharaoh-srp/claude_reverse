package defpackage;

import com.anthropic.claude.api.notification.ChannelPreference;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wh2 implements w28 {
    public static final wh2 a;
    private static final SerialDescriptor descriptor;

    static {
        wh2 wh2Var = new wh2();
        a = wh2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.notification.ChannelPreference", wh2Var, 2);
        pluginGeneratedSerialDescriptor.j("enable_email", true);
        pluginGeneratedSerialDescriptor.j("enable_push", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{d4c.S(zt1Var), d4c.S(zt1Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                bool2 = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChannelPreference(i, bool, bool2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChannelPreference channelPreference = (ChannelPreference) obj;
        encoder.getClass();
        channelPreference.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChannelPreference.write$Self$api(channelPreference, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
