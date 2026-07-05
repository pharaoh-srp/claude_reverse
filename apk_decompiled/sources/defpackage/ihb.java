package defpackage;

import com.anthropic.claude.api.chat.MessageImageAsset;
import com.anthropic.claude.api.chat.MessageImageFile;
import com.anthropic.claude.types.strings.FileId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ihb implements w28 {
    public static final ihb a;
    private static final SerialDescriptor descriptor;

    static {
        ihb ihbVar = new ihb();
        a = ihbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("image", ihbVar, 8);
        pluginGeneratedSerialDescriptor.j("file_uuid", false);
        pluginGeneratedSerialDescriptor.j("file_name", false);
        pluginGeneratedSerialDescriptor.j("thumbnail_asset", false);
        pluginGeneratedSerialDescriptor.j("preview_asset", true);
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
        ghb ghbVar = ghb.a;
        return new KSerializer[]{oi7.a, srgVar, ghbVar, d4c.S(ghbVar), d4c.S(bc9.a), d4c.S(srgVar), d4c.S(srgVar), d4c.S(xka.a)};
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
        MessageImageAsset messageImageAsset2 = null;
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
                    messageImageAsset2 = (MessageImageAsset) ud4VarC.m(serialDescriptor, 3, ghb.a, messageImageAsset2);
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
        return new MessageImageFile(i, strM1020unboximpl, strV, messageImageAsset, messageImageAsset2, date, str, str2, l, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MessageImageFile messageImageFile = (MessageImageFile) obj;
        encoder.getClass();
        messageImageFile.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MessageImageFile.write$Self$api(messageImageFile, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
