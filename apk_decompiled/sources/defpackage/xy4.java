package defpackage;

import com.anthropic.claude.conway.protocol.ConwaySearchHit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xy4 implements w28 {
    public static final xy4 a;
    private static final SerialDescriptor descriptor;

    static {
        xy4 xy4Var = new xy4();
        a = xy4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.ConwaySearchHit", xy4Var, 5);
        pluginGeneratedSerialDescriptor.j("agent_id", true);
        pluginGeneratedSerialDescriptor.j("seq", true);
        pluginGeneratedSerialDescriptor.j("timestamp", false);
        pluginGeneratedSerialDescriptor.j("role", false);
        pluginGeneratedSerialDescriptor.j("snippet", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        xka xkaVar = xka.a;
        KSerializer kSerializerS = d4c.S(xkaVar);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, kSerializerS, xkaVar, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String strV = null;
        Long l = null;
        String strV2 = null;
        String strV3 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                l = (Long) ud4VarC.m(serialDescriptor, 1, xka.a, l);
                i |= 2;
            } else if (iX == 2) {
                j = ud4VarC.j(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                strV2 = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                strV3 = ud4VarC.v(serialDescriptor, 4);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ConwaySearchHit(i, strV, l, j, strV2, strV3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConwaySearchHit conwaySearchHit = (ConwaySearchHit) obj;
        encoder.getClass();
        conwaySearchHit.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConwaySearchHit.write$Self$conway(conwaySearchHit, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
