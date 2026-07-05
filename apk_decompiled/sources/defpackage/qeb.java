package defpackage;

import com.anthropic.claude.api.chat.MessageBlobFile;
import com.anthropic.claude.types.strings.FileId;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qeb implements w28 {
    public static final qeb a;
    private static final SerialDescriptor descriptor;

    static {
        qeb qebVar = new qeb();
        a = qebVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("blob", qebVar, 6);
        pluginGeneratedSerialDescriptor.j("file_uuid", false);
        pluginGeneratedSerialDescriptor.j("file_name", false);
        pluginGeneratedSerialDescriptor.j("created_at", true);
        pluginGeneratedSerialDescriptor.j("path", true);
        pluginGeneratedSerialDescriptor.j("sanitized_name", true);
        pluginGeneratedSerialDescriptor.j("size_bytes", true);
        pluginGeneratedSerialDescriptor.k(new gl0(8));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{oi7.a, srgVar, d4c.S(bc9.a), d4c.S(srgVar), d4c.S(srgVar), d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strM1020unboximpl = null;
        String strV = null;
        Date date = null;
        String str = null;
        String str2 = null;
        Long l = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    FileId fileId = (FileId) ud4VarC.l(serialDescriptor, 0, oi7.a, strM1020unboximpl != null ? FileId.m1014boximpl(strM1020unboximpl) : null);
                    strM1020unboximpl = fileId != null ? fileId.m1020unboximpl() : null;
                    i |= 1;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    date = (Date) ud4VarC.m(serialDescriptor, 2, bc9.a, date);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    l = (Long) ud4VarC.m(serialDescriptor, 5, xka.a, l);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MessageBlobFile(i, strM1020unboximpl, strV, date, str, str2, l, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageBlobFile messageBlobFile = (MessageBlobFile) obj;
        encoder.getClass();
        messageBlobFile.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageBlobFile.write$Self$api(messageBlobFile, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
