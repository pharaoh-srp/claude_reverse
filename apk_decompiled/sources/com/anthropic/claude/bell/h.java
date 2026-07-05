package com.anthropic.claude.bell;

import com.anthropic.claude.bell.BellOverlayDestination;
import defpackage.kw9;
import defpackage.s06;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements w28 {
    public static final h a;
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.bell.BellOverlayDestination.ViewAllSources", hVar, 2);
        pluginGeneratedSerialDescriptor.j("citations", false);
        pluginGeneratedSerialDescriptor.j("otherSources", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = BellOverlayDestination.ViewAllSources.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), kw9VarArr[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = BellOverlayDestination.ViewAllSources.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list2 = (List) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BellOverlayDestination.ViewAllSources(i, list, list2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellOverlayDestination.ViewAllSources viewAllSources = (BellOverlayDestination.ViewAllSources) obj;
        encoder.getClass();
        viewAllSources.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BellOverlayDestination.ViewAllSources.write$Self$bell(viewAllSources, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
