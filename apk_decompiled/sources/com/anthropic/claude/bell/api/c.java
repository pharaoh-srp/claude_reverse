package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiClientMessage;
import defpackage.d4c;
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
public final /* synthetic */ class c implements w28 {
    public static final c a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.bell.api.BellApiClientMessage.AttachmentFlowEnd.Data", cVar, 2);
        pluginGeneratedSerialDescriptor.j("files", true);
        pluginGeneratedSerialDescriptor.j("attachments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = BellApiClientMessage.AttachmentFlowEnd.Data.$childSerializers;
        return new KSerializer[]{d4c.S((KSerializer) kw9VarArr[0].getValue()), d4c.S((KSerializer) kw9VarArr[1].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = BellApiClientMessage.AttachmentFlowEnd.Data.$childSerializers;
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
                list = (List) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                list2 = (List) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list2);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new BellApiClientMessage.AttachmentFlowEnd.Data(i, list, list2, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        BellApiClientMessage.AttachmentFlowEnd.Data data = (BellApiClientMessage.AttachmentFlowEnd.Data) obj;
        encoder.getClass();
        data.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        BellApiClientMessage.AttachmentFlowEnd.Data.write$Self$bell(data, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
