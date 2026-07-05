package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qi1 implements w28 {
    public static final qi1 a;
    private static final SerialDescriptor descriptor;

    static {
        qi1 qi1Var = new qi1();
        a = qi1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("BellConfig", qi1Var, 6);
        pluginGeneratedSerialDescriptor.j("enabled", true);
        pluginGeneratedSerialDescriptor.j("show_tooltip", true);
        pluginGeneratedSerialDescriptor.j("server_interrupt_enabled", true);
        pluginGeneratedSerialDescriptor.j("auto_send_enabled", true);
        pluginGeneratedSerialDescriptor.j("ptt_background_stop_delay_ms", true);
        pluginGeneratedSerialDescriptor.j("hold_park_grace_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        KSerializer kSerializerS = d4c.S(zt1Var);
        KSerializer kSerializerS2 = d4c.S(zt1Var);
        KSerializer kSerializerS3 = d4c.S(zt1Var);
        xka xkaVar = xka.a;
        return new KSerializer[]{zt1Var, kSerializerS, kSerializerS2, kSerializerS3, d4c.S(xkaVar), d4c.S(xkaVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Long l = null;
        Long l2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zU = ud4VarC.u(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 1, zt1.a, bool);
                    i |= 2;
                    break;
                case 2:
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool2);
                    i |= 4;
                    break;
                case 3:
                    bool3 = (Boolean) ud4VarC.m(serialDescriptor, 3, zt1.a, bool3);
                    i |= 8;
                    break;
                case 4:
                    l = (Long) ud4VarC.m(serialDescriptor, 4, xka.a, l);
                    i |= 16;
                    break;
                case 5:
                    l2 = (Long) ud4VarC.m(serialDescriptor, 5, xka.a, l2);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BellConfig(i, zU, bool, bool2, bool3, l, l2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellConfig bellConfig = (BellConfig) obj;
        encoder.getClass();
        bellConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BellConfig.write$Self$models(bellConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
