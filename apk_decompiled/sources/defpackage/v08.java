package defpackage;

import com.anthropic.claude.api.sync.GHEConnectionStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v08 implements w28 {
    public static final v08 a;
    private static final SerialDescriptor descriptor;

    static {
        v08 v08Var = new v08();
        a = v08Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.sync.GHEConnectionStatus", v08Var, 4);
        pluginGeneratedSerialDescriptor.j("ghe_config_id", true);
        pluginGeneratedSerialDescriptor.j("hostname", true);
        pluginGeneratedSerialDescriptor.j("port", true);
        pluginGeneratedSerialDescriptor.j("is_connected", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(xka.a), d4c.S(srg.a), d4c.S(e79.a), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zU = false;
        Long l = null;
        String str = null;
        Integer num = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                l = (Long) ud4VarC.m(serialDescriptor, 0, xka.a, l);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else if (iX == 2) {
                num = (Integer) ud4VarC.m(serialDescriptor, 2, e79.a, num);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GHEConnectionStatus(i, l, str, num, zU, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GHEConnectionStatus gHEConnectionStatus = (GHEConnectionStatus) obj;
        encoder.getClass();
        gHEConnectionStatus.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GHEConnectionStatus.write$Self$api(gHEConnectionStatus, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
