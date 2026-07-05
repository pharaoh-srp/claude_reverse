package defpackage;

import com.anthropic.claude.api.notification.ChannelPreference;
import com.anthropic.claude.api.notification.FeaturePreference;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ng7 implements w28 {
    public static final ng7 a;
    private static final SerialDescriptor descriptor;

    static {
        ng7 ng7Var = new ng7();
        a = ng7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.notification.FeaturePreference", ng7Var, 7);
        pluginGeneratedSerialDescriptor.j("compass", true);
        pluginGeneratedSerialDescriptor.j("completion", true);
        pluginGeneratedSerialDescriptor.j("bogosort", true);
        pluginGeneratedSerialDescriptor.j("code_requires_action", true);
        pluginGeneratedSerialDescriptor.j("hearth_session_mentioned", true);
        pluginGeneratedSerialDescriptor.j("dispatch", true);
        pluginGeneratedSerialDescriptor.j("marketing", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        wh2 wh2Var = wh2.a;
        return new KSerializer[]{d4c.S(wh2Var), d4c.S(wh2Var), d4c.S(wh2Var), d4c.S(wh2Var), d4c.S(wh2Var), d4c.S(wh2Var), d4c.S(wh2Var)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        ChannelPreference channelPreference = null;
        ChannelPreference channelPreference2 = null;
        ChannelPreference channelPreference3 = null;
        ChannelPreference channelPreference4 = null;
        ChannelPreference channelPreference5 = null;
        ChannelPreference channelPreference6 = null;
        ChannelPreference channelPreference7 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    channelPreference = (ChannelPreference) ud4VarC.m(serialDescriptor, 0, wh2.a, channelPreference);
                    i |= 1;
                    break;
                case 1:
                    channelPreference2 = (ChannelPreference) ud4VarC.m(serialDescriptor, 1, wh2.a, channelPreference2);
                    i |= 2;
                    break;
                case 2:
                    channelPreference3 = (ChannelPreference) ud4VarC.m(serialDescriptor, 2, wh2.a, channelPreference3);
                    i |= 4;
                    break;
                case 3:
                    channelPreference4 = (ChannelPreference) ud4VarC.m(serialDescriptor, 3, wh2.a, channelPreference4);
                    i |= 8;
                    break;
                case 4:
                    channelPreference5 = (ChannelPreference) ud4VarC.m(serialDescriptor, 4, wh2.a, channelPreference5);
                    i |= 16;
                    break;
                case 5:
                    channelPreference6 = (ChannelPreference) ud4VarC.m(serialDescriptor, 5, wh2.a, channelPreference6);
                    i |= 32;
                    break;
                case 6:
                    channelPreference7 = (ChannelPreference) ud4VarC.m(serialDescriptor, 6, wh2.a, channelPreference7);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new FeaturePreference(i, channelPreference, channelPreference2, channelPreference3, channelPreference4, channelPreference5, channelPreference6, channelPreference7, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        FeaturePreference featurePreference = (FeaturePreference) obj;
        encoder.getClass();
        featurePreference.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        FeaturePreference.write$Self$api(featurePreference, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
