package defpackage;

import com.anthropic.claude.conway.protocol.PongMessage;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z8d implements w28 {
    public static final z8d a;
    private static final SerialDescriptor descriptor;

    static {
        z8d z8dVar = new z8d();
        a = z8dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.PongMessage", z8dVar, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("seq", false);
        pluginGeneratedSerialDescriptor.j("ts", false);
        pluginGeneratedSerialDescriptor.j("ping_seq", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        xka xkaVar = xka.a;
        return new KSerializer[]{srg.a, xkaVar, xkaVar, xkaVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String strV = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                j = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                j2 = ud4VarC.j(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                j3 = ud4VarC.j(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PongMessage(i, strV, j, j2, j3, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PongMessage pongMessage = (PongMessage) obj;
        encoder.getClass();
        pongMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PongMessage.write$Self$conway(pongMessage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
