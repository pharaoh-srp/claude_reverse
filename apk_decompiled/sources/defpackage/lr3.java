package defpackage;

import com.anthropic.claude.analytics.events.CodeEvents$AttachmentReorderSurface;
import com.anthropic.claude.analytics.events.CodeEvents$AttachmentReordered;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lr3 implements w28 {
    public static final lr3 a;
    private static final SerialDescriptor descriptor;

    static {
        lr3 lr3Var = new lr3();
        a = lr3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("claudeai.code.attachment.reordered", lr3Var, 3);
        pluginGeneratedSerialDescriptor.j("organization_uuid", false);
        qy1.z(pluginGeneratedSerialDescriptor, "surface", false, "attachment_count", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, CodeEvents$AttachmentReordered.$childSerializers[1].getValue(), e79.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = CodeEvents$AttachmentReordered.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strV = null;
        CodeEvents$AttachmentReorderSurface codeEvents$AttachmentReorderSurface = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                codeEvents$AttachmentReorderSurface = (CodeEvents$AttachmentReorderSurface) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), codeEvents$AttachmentReorderSurface);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                iR = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CodeEvents$AttachmentReordered(i, strV, codeEvents$AttachmentReorderSurface, iR, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CodeEvents$AttachmentReordered codeEvents$AttachmentReordered = (CodeEvents$AttachmentReordered) obj;
        encoder.getClass();
        codeEvents$AttachmentReordered.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        CodeEvents$AttachmentReordered.write$Self$analytics(codeEvents$AttachmentReordered, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
