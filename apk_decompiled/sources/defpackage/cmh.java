package defpackage;

import com.anthropic.claude.api.model.ThinkingModeOption;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cmh implements w28 {
    public static final cmh a;
    private static final SerialDescriptor descriptor;

    static {
        cmh cmhVar = new cmh();
        a = cmhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.model.ThinkingModeOption", cmhVar, 6);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("selection_title", true);
        pluginGeneratedSerialDescriptor.j("is_default", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = ThinkingModeOption.$childSerializers;
        return new KSerializer[]{srg.a, kw9VarArr[1].getValue(), kw9VarArr[2].getValue(), d4c.S(emh.a), d4c.S((KSerializer) kw9VarArr[4].getValue()), d4c.S(zt1.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ThinkingModeOption.$childSerializers;
        boolean z = true;
        int i = 0;
        String strV = null;
        _ServerLocalizedString _serverlocalizedstring = null;
        _ServerLocalizedString _serverlocalizedstring2 = null;
        String strM1149unboximpl = null;
        _ServerLocalizedString _serverlocalizedstring3 = null;
        Boolean bool = null;
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
                    _serverlocalizedstring = (_ServerLocalizedString) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), _serverlocalizedstring);
                    i |= 2;
                    break;
                case 2:
                    _serverlocalizedstring2 = (_ServerLocalizedString) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), _serverlocalizedstring2);
                    i |= 4;
                    break;
                case 3:
                    ThinkingMode thinkingMode = (ThinkingMode) ud4VarC.m(serialDescriptor, 3, emh.a, strM1149unboximpl != null ? ThinkingMode.m1142boximpl(strM1149unboximpl) : null);
                    strM1149unboximpl = thinkingMode != null ? thinkingMode.m1149unboximpl() : null;
                    i |= 8;
                    break;
                case 4:
                    _serverlocalizedstring3 = (_ServerLocalizedString) ud4VarC.m(serialDescriptor, 4, (s06) kw9VarArr[4].getValue(), _serverlocalizedstring3);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 5, zt1.a, bool);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ThinkingModeOption(i, strV, _serverlocalizedstring, _serverlocalizedstring2, strM1149unboximpl, _serverlocalizedstring3, bool, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ThinkingModeOption thinkingModeOption = (ThinkingModeOption) obj;
        encoder.getClass();
        thinkingModeOption.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ThinkingModeOption.write$Self$api(thinkingModeOption, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
