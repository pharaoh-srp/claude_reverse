package defpackage;

import com.anthropic.claude.api.conway.HeartbeatRecord;
import com.anthropic.claude.api.conway.HeartbeatSpec;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class am8 implements w28 {
    public static final am8 a;
    private static final SerialDescriptor descriptor;

    static {
        am8 am8Var = new am8();
        a = am8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.conway.HeartbeatRecord", am8Var, 5);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("spec", false);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.j("paused", true);
        pluginGeneratedSerialDescriptor.j("next_fire_at", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, cm8.a, d4c.S(srgVar), d4c.S(zt1.a), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        HeartbeatSpec heartbeatSpec = null;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                heartbeatSpec = (HeartbeatSpec) ud4VarC.l(serialDescriptor, 1, cm8.a, heartbeatSpec);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else if (iX == 3) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 3, zt1.a, bool);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HeartbeatRecord(i, strV, heartbeatSpec, str, bool, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HeartbeatRecord heartbeatRecord = (HeartbeatRecord) obj;
        encoder.getClass();
        heartbeatRecord.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HeartbeatRecord.write$Self$api(heartbeatRecord, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
