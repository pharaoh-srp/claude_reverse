package com.anthropic.claude.chat.bottomsheet;

import com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination;
import defpackage.kw9;
import defpackage.s06;
import defpackage.srg;
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
public final /* synthetic */ class c1 implements w28 {
    public static final c1 a;
    private static final SerialDescriptor descriptor;

    static {
        c1 c1Var = new c1();
        a = c1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination.Sources", c1Var, 2);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("sources", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, CollapsedToolsSheetDestination.Sources.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CollapsedToolsSheetDestination.Sources.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CollapsedToolsSheetDestination.Sources(i, strV, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CollapsedToolsSheetDestination.Sources sources = (CollapsedToolsSheetDestination.Sources) obj;
        encoder.getClass();
        sources.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CollapsedToolsSheetDestination.Sources.write$Self$chat(sources, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
