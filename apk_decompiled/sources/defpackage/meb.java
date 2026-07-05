package defpackage;

import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.types.strings.FileId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class meb implements w28 {
    public static final meb a;
    private static final SerialDescriptor descriptor;

    static {
        meb mebVar = new meb();
        a = mebVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.MessageAttachment", mebVar, 5);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("file_name", false);
        pluginGeneratedSerialDescriptor.j("file_size", false);
        pluginGeneratedSerialDescriptor.j("file_type", false);
        pluginGeneratedSerialDescriptor.j("extracted_content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(oi7.a), srgVar, e79.a, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iR = 0;
        String strM1020unboximpl = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                FileId fileId = (FileId) ud4VarC.m(serialDescriptor, 0, oi7.a, strM1020unboximpl != null ? FileId.m1014boximpl(strM1020unboximpl) : null);
                strM1020unboximpl = fileId != null ? fileId.m1020unboximpl() : null;
                i |= 1;
            } else if (iX == 1) {
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                iR = ud4VarC.r(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                strV2 = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                strV3 = ud4VarC.v(serialDescriptor, 4);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageAttachment(i, strM1020unboximpl, strV, iR, strV2, strV3, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageAttachment messageAttachment = (MessageAttachment) obj;
        encoder.getClass();
        messageAttachment.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageAttachment.write$Self$api(messageAttachment, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
