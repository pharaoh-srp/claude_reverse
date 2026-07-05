package defpackage;

import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hw8 implements w28 {
    public static final hw8 a;
    private static final SerialDescriptor descriptor;

    static {
        hw8 hw8Var = new hw8();
        a = hw8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.chat.tool.ImageGalleryItem", hw8Var, 11);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("page_url", true);
        pluginGeneratedSerialDescriptor.j("width", true);
        pluginGeneratedSerialDescriptor.j("height", true);
        pluginGeneratedSerialDescriptor.j("thumbnail_url", true);
        pluginGeneratedSerialDescriptor.j("thumbnail_width", true);
        pluginGeneratedSerialDescriptor.j("thumbnail_height", true);
        pluginGeneratedSerialDescriptor.j("telemetry", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        e79 e79Var = e79.a;
        return new KSerializer[]{jw8.a, srgVar, srgVar, srgVar, kSerializerS, d4c.S(e79Var), d4c.S(e79Var), d4c.S(srgVar), d4c.S(e79Var), d4c.S(e79Var), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        Integer num = null;
        String strM310unboximpl = null;
        Integer num2 = null;
        String str = null;
        String strV = null;
        String str2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str3 = null;
        String strV2 = null;
        String strV3 = null;
        int i = 0;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    ImageGalleryItemId imageGalleryItemId = (ImageGalleryItemId) ud4VarC.l(serialDescriptor, 0, jw8.a, strM310unboximpl != null ? ImageGalleryItemId.m304boximpl(strM310unboximpl) : null);
                    i |= 1;
                    strM310unboximpl = imageGalleryItemId != null ? imageGalleryItemId.m310unboximpl() : null;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strV3 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str2);
                    i |= 16;
                    break;
                case 5:
                    num3 = (Integer) ud4VarC.m(serialDescriptor, 5, e79.a, num3);
                    i |= 32;
                    break;
                case 6:
                    num4 = (Integer) ud4VarC.m(serialDescriptor, 6, e79.a, num4);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) ud4VarC.m(serialDescriptor, 7, srg.a, str3);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    num = (Integer) ud4VarC.m(serialDescriptor, 8, e79.a, num);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 9, e79.a, num2);
                    i |= 512;
                    break;
                case 10:
                    str = (String) ud4VarC.m(serialDescriptor, 10, srg.a, str);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new ImageGalleryItem(i, strM310unboximpl, strV, strV2, strV3, str2, num3, num4, str3, num, num2, str, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ImageGalleryItem imageGalleryItem = (ImageGalleryItem) obj;
        encoder.getClass();
        imageGalleryItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ImageGalleryItem.write$Self$api(imageGalleryItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
