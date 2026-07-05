package com.anthropic.claude.conway.protocol;

import com.anthropic.claude.conway.protocol.ContentBlock;
import defpackage.eh9;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements w28 {
    public static final g a;
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.conway.protocol.ContentBlock.Image", gVar, 1);
        pluginGeneratedSerialDescriptor.j("source", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{eh9.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        JsonElement jsonElement = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                jsonElement = (JsonElement) ud4VarC.l(serialDescriptor, 0, eh9.a, jsonElement);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ContentBlock.Image(i, jsonElement, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ContentBlock.Image image = (ContentBlock.Image) obj;
        encoder.getClass();
        image.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, eh9.a, image.source);
        vd4VarC.b(serialDescriptor);
    }
}
