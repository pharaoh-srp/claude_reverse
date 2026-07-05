package defpackage;

import com.anthropic.claude.models.organization.configtypes.GroveConfigStrings;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ib8 implements w28 {
    public static final ib8 a;
    private static final SerialDescriptor descriptor;

    static {
        ib8 ib8Var = new ib8();
        a = ib8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.GroveConfigStrings", ib8Var, 15);
        pluginGeneratedSerialDescriptor.j("disabled_toggle", false);
        pluginGeneratedSerialDescriptor.j("onboarding_bullet_title", false);
        pluginGeneratedSerialDescriptor.j("onboarding_bullet_description", false);
        pluginGeneratedSerialDescriptor.j("onboarding_toggle", false);
        pluginGeneratedSerialDescriptor.j("notice_title", false);
        pluginGeneratedSerialDescriptor.j("notice_description", false);
        pluginGeneratedSerialDescriptor.j("notice_toggle_title", false);
        pluginGeneratedSerialDescriptor.j("notice_toggle_description", false);
        pluginGeneratedSerialDescriptor.j("notice_p2_title", false);
        pluginGeneratedSerialDescriptor.j("notice_p2_description", false);
        pluginGeneratedSerialDescriptor.j("notice_learnmore", false);
        pluginGeneratedSerialDescriptor.j("notice_footer", false);
        pluginGeneratedSerialDescriptor.j("settings_toggle_title", false);
        pluginGeneratedSerialDescriptor.j("settings_toggle_description", false);
        pluginGeneratedSerialDescriptor.j("settings_notice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String strV4 = null;
        String strV5 = null;
        String strV6 = null;
        String strV7 = null;
        String strV8 = null;
        String strV9 = null;
        String strV10 = null;
        String strV11 = null;
        String strV12 = null;
        String strV13 = null;
        String strV14 = null;
        String strV15 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV3 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strV4 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV5 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strV6 = ud4VarC.v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strV7 = ud4VarC.v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strV8 = ud4VarC.v(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    break;
                case 8:
                    strV9 = ud4VarC.v(serialDescriptor, 8);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    break;
                case 9:
                    strV10 = ud4VarC.v(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    strV11 = ud4VarC.v(serialDescriptor, 10);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    break;
                case 11:
                    strV12 = ud4VarC.v(serialDescriptor, 11);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    break;
                case 12:
                    strV13 = ud4VarC.v(serialDescriptor, 12);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    break;
                case 13:
                    strV14 = ud4VarC.v(serialDescriptor, 13);
                    i |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    break;
                case 14:
                    strV15 = ud4VarC.v(serialDescriptor, 14);
                    i |= 16384;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GroveConfigStrings(i, strV, strV2, strV3, strV4, strV5, strV6, strV7, strV8, strV9, strV10, strV11, strV12, strV13, strV14, strV15, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GroveConfigStrings groveConfigStrings = (GroveConfigStrings) obj;
        encoder.getClass();
        groveConfigStrings.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GroveConfigStrings.write$Self$models(groveConfigStrings, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
