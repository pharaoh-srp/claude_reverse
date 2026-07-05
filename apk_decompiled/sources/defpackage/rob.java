package defpackage;

import com.anthropic.claude.api.model.Badge;
import com.anthropic.claude.api.model.DisabledReason;
import com.anthropic.claude.api.model.ModelSection;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.api.model.ModelTooltip;
import com.anthropic.claude.api.model.ThinkingOptions;
import com.anthropic.claude.api.notice.CtaIntent;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rob implements w28 {
    public static final rob a;
    private static final SerialDescriptor descriptor;

    static {
        rob robVar = new rob();
        a = robVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.model.ModelSelectorEntry", robVar, 13);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("notice_title", true);
        pluginGeneratedSerialDescriptor.j("notice_text", true);
        pluginGeneratedSerialDescriptor.j("cta_copy", true);
        pluginGeneratedSerialDescriptor.j("cta_intent", true);
        pluginGeneratedSerialDescriptor.j("section", true);
        pluginGeneratedSerialDescriptor.j("disabled_reason", true);
        pluginGeneratedSerialDescriptor.j("capabilities", true);
        pluginGeneratedSerialDescriptor.j("thinking", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("tooltip", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ModelSelectorEntry.$childSerializers;
        return new KSerializer[]{vnb.a, srg.a, d4c.S((KSerializer) kw9VarArr[2].getValue()), d4c.S((KSerializer) kw9VarArr[3].getValue()), d4c.S((KSerializer) kw9VarArr[4].getValue()), d4c.S((KSerializer) kw9VarArr[5].getValue()), d4c.S(yc5.d), kob.d, d4c.S((KSerializer) kw9VarArr[8].getValue()), kw9VarArr[9].getValue(), d4c.S(hmh.a), d4c.S(oc1.a), d4c.S(xpb.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        ModelTooltip modelTooltip;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ModelSelectorEntry.$childSerializers;
        ModelTooltip modelTooltip2 = null;
        Badge badge = null;
        ThinkingOptions thinkingOptions = null;
        Map map = null;
        boolean z2 = true;
        ModelSection modelSection = null;
        int i = 0;
        String strM1064unboximpl = null;
        DisabledReason disabledReason = null;
        _ServerLocalizedString _serverlocalizedstring = null;
        _ServerLocalizedString _serverlocalizedstring2 = null;
        _ServerLocalizedString _serverlocalizedstring3 = null;
        _ServerLocalizedString _serverlocalizedstring4 = null;
        CtaIntent ctaIntent = null;
        String strV = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    modelTooltip = modelTooltip2;
                    z2 = false;
                    modelTooltip2 = modelTooltip;
                    break;
                case 0:
                    boolean z3 = z2;
                    String str2 = strM1064unboximpl;
                    modelTooltip = modelTooltip2;
                    ModelId modelId = (ModelId) ud4VarC.l(serialDescriptor, 0, vnb.a, str2 != null ? ModelId.m1058boximpl(str2) : null);
                    strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                    i |= 1;
                    z2 = z3;
                    modelTooltip2 = modelTooltip;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    z2 = z2;
                    break;
                case 2:
                    z = z2;
                    str = strM1064unboximpl;
                    _serverlocalizedstring = (_ServerLocalizedString) ud4VarC.m(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), _serverlocalizedstring);
                    i |= 4;
                    z2 = z;
                    strM1064unboximpl = str;
                    break;
                case 3:
                    z = z2;
                    str = strM1064unboximpl;
                    _serverlocalizedstring2 = (_ServerLocalizedString) ud4VarC.m(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), _serverlocalizedstring2);
                    i |= 8;
                    z2 = z;
                    strM1064unboximpl = str;
                    break;
                case 4:
                    z = z2;
                    str = strM1064unboximpl;
                    _serverlocalizedstring3 = (_ServerLocalizedString) ud4VarC.m(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), _serverlocalizedstring3);
                    i |= 16;
                    z2 = z;
                    strM1064unboximpl = str;
                    break;
                case 5:
                    z = z2;
                    str = strM1064unboximpl;
                    _serverlocalizedstring4 = (_ServerLocalizedString) ud4VarC.m(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), _serverlocalizedstring4);
                    i |= 32;
                    z2 = z;
                    strM1064unboximpl = str;
                    break;
                case 6:
                    z = z2;
                    str = strM1064unboximpl;
                    ctaIntent = (CtaIntent) ud4VarC.m(serialDescriptor, 6, yc5.d, ctaIntent);
                    i |= 64;
                    z2 = z;
                    strM1064unboximpl = str;
                    break;
                case 7:
                    z = z2;
                    str = strM1064unboximpl;
                    modelSection = (ModelSection) ud4VarC.l(serialDescriptor, 7, kob.d, modelSection);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    z2 = z;
                    strM1064unboximpl = str;
                    break;
                case 8:
                    z = z2;
                    str = strM1064unboximpl;
                    disabledReason = (DisabledReason) ud4VarC.m(serialDescriptor, 8, (s06) kw9VarArr[8].getValue(), disabledReason);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    z2 = z;
                    strM1064unboximpl = str;
                    break;
                case 9:
                    z = z2;
                    str = strM1064unboximpl;
                    map = (Map) ud4VarC.l(serialDescriptor, 9, (s06) kw9VarArr[9].getValue(), map);
                    i |= 512;
                    z2 = z;
                    strM1064unboximpl = str;
                    break;
                case 10:
                    z = z2;
                    str = strM1064unboximpl;
                    thinkingOptions = (ThinkingOptions) ud4VarC.m(serialDescriptor, 10, hmh.a, thinkingOptions);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    z2 = z;
                    strM1064unboximpl = str;
                    break;
                case 11:
                    z = z2;
                    str = strM1064unboximpl;
                    badge = (Badge) ud4VarC.m(serialDescriptor, 11, oc1.a, badge);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    z2 = z;
                    strM1064unboximpl = str;
                    break;
                case 12:
                    z = z2;
                    str = strM1064unboximpl;
                    modelTooltip2 = (ModelTooltip) ud4VarC.m(serialDescriptor, 12, xpb.a, modelTooltip2);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    z2 = z;
                    strM1064unboximpl = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ModelSelectorEntry(i, strM1064unboximpl, strV, _serverlocalizedstring, _serverlocalizedstring2, _serverlocalizedstring3, _serverlocalizedstring4, ctaIntent, modelSection, disabledReason, map, thinkingOptions, badge, modelTooltip2, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ModelSelectorEntry modelSelectorEntry = (ModelSelectorEntry) obj;
        encoder.getClass();
        modelSelectorEntry.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ModelSelectorEntry.write$Self$api(modelSelectorEntry, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
