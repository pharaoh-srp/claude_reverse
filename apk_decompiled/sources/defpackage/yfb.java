package defpackage;

import com.anthropic.claude.api.chat.MessageDocumentAsset;
import com.anthropic.claude.api.chat.MessageDocumentFile;
import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.types.strings.FileId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yfb implements w28 {
    public static final yfb a;
    private static final SerialDescriptor descriptor;

    static {
        yfb yfbVar = new yfb();
        a = yfbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("document", yfbVar, 8);
        pluginGeneratedSerialDescriptor.j("file_uuid", false);
        pluginGeneratedSerialDescriptor.j("file_name", false);
        pluginGeneratedSerialDescriptor.j("thumbnail_asset", false);
        pluginGeneratedSerialDescriptor.j("document_asset", false);
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
        return new KSerializer[]{oi7.a, srgVar, ghb.a, wfb.a, d4c.S(bc9.a), d4c.S(srgVar), d4c.S(srgVar), d4c.S(xka.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strM1020unboximpl = null;
        String strV = null;
        MessageImageAsset messageImageAsset = null;
        MessageDocumentAsset messageDocumentAsset = null;
        Date date = null;
        String str = null;
        String str2 = null;
        Long l = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
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
                    messageImageAsset = (MessageImageAsset) ud4VarC.l(serialDescriptor, 2, ghb.a, messageImageAsset);
                    i |= 4;
                    break;
                case 3:
                    messageDocumentAsset = (MessageDocumentAsset) ud4VarC.l(serialDescriptor, 3, wfb.a, messageDocumentAsset);
                    i |= 8;
                    break;
                case 4:
                    date = (Date) ud4VarC.m(serialDescriptor, 4, bc9.a, date);
                    i |= 16;
                    break;
                case 5:
                    str = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str2);
                    i |= 64;
                    break;
                case 7:
                    l = (Long) ud4VarC.m(serialDescriptor, 7, xka.a, l);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new MessageDocumentFile(i, strM1020unboximpl, strV, messageImageAsset, messageDocumentAsset, date, str, str2, l, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageDocumentFile messageDocumentFile = (MessageDocumentFile) obj;
        encoder.getClass();
        messageDocumentFile.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageDocumentFile.write$Self$api(messageDocumentFile, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
