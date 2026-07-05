package com.anthropic.claude.chat;

import com.anthropic.claude.chat.ChatScreenOverlay;
import com.anthropic.claude.types.strings.TaskId;
import defpackage.d4c;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.w28;
import defpackage.z5h;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements w28 {
    public static final g a;
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.chat.ChatScreenOverlay.BrowserTakeover", gVar, 2);
        pluginGeneratedSerialDescriptor.j("takeoverPath", false);
        pluginGeneratedSerialDescriptor.j("taskId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, d4c.S(z5h.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strM1134unboximpl = null;
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
                TaskId taskId = (TaskId) ud4VarC.m(serialDescriptor, 1, z5h.a, strM1134unboximpl != null ? TaskId.m1128boximpl(strM1134unboximpl) : null);
                strM1134unboximpl = taskId != null ? taskId.m1134unboximpl() : null;
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ChatScreenOverlay.BrowserTakeover(i, strV, strM1134unboximpl, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ChatScreenOverlay.BrowserTakeover browserTakeover = (ChatScreenOverlay.BrowserTakeover) obj;
        encoder.getClass();
        browserTakeover.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ChatScreenOverlay.BrowserTakeover.write$Self$chat(browserTakeover, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
