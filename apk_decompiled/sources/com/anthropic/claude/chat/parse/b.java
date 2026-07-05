package com.anthropic.claude.chat.parse;

import com.anthropic.claude.chat.parse.MelangeMemoryFormat$StructuredContent;
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
public final /* synthetic */ class b implements w28 {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.parse.MelangeMemoryFormat.StructuredContent", bVar, 2);
        pluginGeneratedSerialDescriptor.j("path_segments", true);
        pluginGeneratedSerialDescriptor.j("parsed", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S((KSerializer) MelangeMemoryFormat$StructuredContent.$childSerializers[0].getValue()), d4c.S(c.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MelangeMemoryFormat$StructuredContent.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        MelangeMemoryFormat$StructuredContent.Parsed parsed = null;
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
                parsed = (MelangeMemoryFormat$StructuredContent.Parsed) ud4VarC.m(serialDescriptor, 1, c.a, parsed);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MelangeMemoryFormat$StructuredContent(i, list, parsed, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MelangeMemoryFormat$StructuredContent melangeMemoryFormat$StructuredContent = (MelangeMemoryFormat$StructuredContent) obj;
        encoder.getClass();
        melangeMemoryFormat$StructuredContent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MelangeMemoryFormat$StructuredContent.write$Self$Claude_chat_parse(melangeMemoryFormat$StructuredContent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
