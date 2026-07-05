package defpackage;

import com.anthropic.claude.api.experience.BulletsStyle;
import com.anthropic.claude.api.experience.ExperienceAsset;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.experience.SpotlightContent;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tig implements w28 {
    public static final tig a;
    private static final SerialDescriptor descriptor;

    static {
        tig tigVar = new tig();
        a = tigVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("android-spotlight", tigVar, 9);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("asset", true);
        pluginGeneratedSerialDescriptor.j("badge_title", true);
        pluginGeneratedSerialDescriptor.j("bullets", true);
        pluginGeneratedSerialDescriptor.j("bullets_style", true);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        pluginGeneratedSerialDescriptor.j("dismissible", true);
        pluginGeneratedSerialDescriptor.j("toggle", true);
        pluginGeneratedSerialDescriptor.k(new gl0(6));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = SpotlightContent.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(q87.a), d4c.S(srgVar), kw9VarArr[4].getValue(), g02.d, kw9VarArr[6].getValue(), zt1.a, d4c.S(sa7.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SpotlightContent.$childSerializers;
        Object obj = null;
        boolean z = true;
        ExperienceToggle experienceToggle = null;
        String strV = null;
        String str = null;
        ExperienceAsset experienceAsset = null;
        String str2 = null;
        List list = null;
        BulletsStyle bulletsStyle = null;
        List list2 = null;
        int i = 0;
        boolean zU = false;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                    i |= 2;
                    break;
                case 2:
                    experienceAsset = (ExperienceAsset) ud4VarC.m(serialDescriptor, 2, q87.a, experienceAsset);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                    i |= 8;
                    break;
                case 4:
                    list = (List) ud4VarC.l(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    bulletsStyle = (BulletsStyle) ud4VarC.l(serialDescriptor, 5, g02.d, bulletsStyle);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) ud4VarC.l(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    zU = ud4VarC.u(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    experienceToggle = (ExperienceToggle) ud4VarC.m(serialDescriptor, 8, sa7.a, experienceToggle);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new SpotlightContent(i, strV, str, experienceAsset, str2, list, bulletsStyle, list2, zU, experienceToggle, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SpotlightContent spotlightContent = (SpotlightContent) obj;
        encoder.getClass();
        spotlightContent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SpotlightContent.write$Self$api(spotlightContent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
