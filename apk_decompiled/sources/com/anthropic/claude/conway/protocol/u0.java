package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.StreamMessage;
import defpackage.kw9;
import defpackage.s06;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import defpackage.xka;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u0 implements w28 {
    public static final u0 a;
    private static final SerialDescriptor descriptor;

    static {
        u0 u0Var = new u0();
        a = u0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.StreamMessage.ClientsChanged", u0Var, 3);
        pluginGeneratedSerialDescriptor.j("seq", true);
        pluginGeneratedSerialDescriptor.j("ts", true);
        pluginGeneratedSerialDescriptor.j("clients", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = StreamMessage.ClientsChanged.$childSerializers;
        xka xkaVar = xka.a;
        return new KSerializer[]{xkaVar, xkaVar, kw9VarArr[2].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = StreamMessage.ClientsChanged.$childSerializers;
        int i = 0;
        long j = 0;
        long j2 = 0;
        List list = null;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                j = ud4VarC.j(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                j2 = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new StreamMessage.ClientsChanged(i, j, j2, list, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        StreamMessage.ClientsChanged clientsChanged = (StreamMessage.ClientsChanged) obj;
        encoder.getClass();
        clientsChanged.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        StreamMessage.ClientsChanged.write$Self$conway(clientsChanged, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
