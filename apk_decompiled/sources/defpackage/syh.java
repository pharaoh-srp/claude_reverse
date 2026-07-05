package defpackage;

import com.anthropic.claude.api.chat.tool.ToolResultImage;
import com.anthropic.claude.types.strings.FileId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class syh implements w28 {
    public static final syh a;
    private static final SerialDescriptor descriptor;

    static {
        syh syhVar = new syh();
        a = syhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("image", syhVar, 1);
        pluginGeneratedSerialDescriptor.j("file_uuid", true);
        pluginGeneratedSerialDescriptor.k(new gl0(14));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(oi7.a)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = true;
        int i = 0;
        String strM1020unboximpl = null;
        while (objArr2 != false) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                objArr2 = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                FileId fileId = (FileId) ud4VarC.m(serialDescriptor, 0, oi7.a, strM1020unboximpl != null ? FileId.m1014boximpl(strM1020unboximpl) : null);
                strM1020unboximpl = fileId != null ? fileId.m1020unboximpl() : null;
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ToolResultImage(i, strM1020unboximpl, vnfVar, objArr == true ? 1 : 0);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ToolResultImage toolResultImage = (ToolResultImage) obj;
        encoder.getClass();
        toolResultImage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ToolResultImage.write$Self$api(toolResultImage, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
