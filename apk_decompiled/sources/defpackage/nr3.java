package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.analytics.events.CodeEvents$AttachmentsAdded;
import com.anthropic.claude.analytics.events.CodeEvents$CodeComposerSurface;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nr3 implements w28 {
    public static final nr3 a;
    private static final SerialDescriptor descriptor;

    static {
        nr3 nr3Var = new nr3();
        a = nr3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.attachments.added", nr3Var, 4);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("count", false);
        qy1.z(pluginGeneratedSerialDescriptor, "surface", false, "has_session", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = CodeEvents$AttachmentsAdded.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), e79.a, kw9VarArr[2].getValue(), zt1.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeEvents$AttachmentsAdded.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        boolean zU = false;
        ChatEvents$AttachmentSource chatEvents$AttachmentSource = null;
        CodeEvents$CodeComposerSurface codeEvents$CodeComposerSurface = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                chatEvents$AttachmentSource = (ChatEvents$AttachmentSource) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), chatEvents$AttachmentSource);
                i |= 1;
            } else if (iX == 1) {
                iR = ud4VarC.r(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                codeEvents$CodeComposerSurface = (CodeEvents$CodeComposerSurface) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), codeEvents$CodeComposerSurface);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                zU = ud4VarC.u(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$AttachmentsAdded(i, chatEvents$AttachmentSource, iR, codeEvents$CodeComposerSurface, zU, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$AttachmentsAdded codeEvents$AttachmentsAdded = (CodeEvents$AttachmentsAdded) obj;
        encoder.getClass();
        codeEvents$AttachmentsAdded.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$AttachmentsAdded.write$Self$analytics(codeEvents$AttachmentsAdded, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
