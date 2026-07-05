package defpackage;

import com.anthropic.claude.api.chat.MessageUnknownFile;
import com.anthropic.claude.types.strings.FileId;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wib implements w28 {
    public static final wib a;
    private static final SerialDescriptor descriptor;

    static {
        wib wibVar = new wib();
        a = wibVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.MessageUnknownFile", wibVar, 2);
        pluginGeneratedSerialDescriptor.j("file_uuid", false);
        pluginGeneratedSerialDescriptor.j("file_name", true);
        pluginGeneratedSerialDescriptor.k(new gl0(8));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{oi7.a, d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1020unboximpl = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                FileId fileId = (FileId) ud4VarC.l(serialDescriptor, 0, oi7.a, strM1020unboximpl != null ? FileId.m1014boximpl(strM1020unboximpl) : null);
                strM1020unboximpl = fileId != null ? fileId.m1020unboximpl() : null;
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageUnknownFile(i, strM1020unboximpl, str, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageUnknownFile messageUnknownFile = (MessageUnknownFile) obj;
        encoder.getClass();
        messageUnknownFile.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageUnknownFile.write$Self$api(messageUnknownFile, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
