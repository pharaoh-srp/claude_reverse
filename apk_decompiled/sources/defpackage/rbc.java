package defpackage;

import com.anthropic.claude.models.organization.configtypes.OctopusConfig;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rbc implements w28 {
    public static final rbc a;
    private static final SerialDescriptor descriptor;

    static {
        rbc rbcVar = new rbc();
        a = rbcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.OctopusConfig", rbcVar, 4);
        pluginGeneratedSerialDescriptor.j("setting_title", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("disclaimer_text", false);
        pluginGeneratedSerialDescriptor.j("empty_state", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = OctopusConfig.$childSerializers;
        return new KSerializer[]{kw9VarArr[0].getValue(), kw9VarArr[1].getValue(), kw9VarArr[2].getValue(), kw9VarArr[3].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = OctopusConfig.$childSerializers;
        boolean z = true;
        int i = 0;
        _ServerLocalizedString _serverlocalizedstring = null;
        _ServerLocalizedString _serverlocalizedstring2 = null;
        _ServerLocalizedString _serverlocalizedstring3 = null;
        _ServerLocalizedString _serverlocalizedstring4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                _serverlocalizedstring = (_ServerLocalizedString) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), _serverlocalizedstring);
                i |= 1;
            } else if (iX == 1) {
                _serverlocalizedstring2 = (_ServerLocalizedString) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), _serverlocalizedstring2);
                i |= 2;
            } else if (iX == 2) {
                _serverlocalizedstring3 = (_ServerLocalizedString) ud4VarC.l(serialDescriptor, 2, (s06) kw9VarArr[2].getValue(), _serverlocalizedstring3);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                _serverlocalizedstring4 = (_ServerLocalizedString) ud4VarC.l(serialDescriptor, 3, (s06) kw9VarArr[3].getValue(), _serverlocalizedstring4);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new OctopusConfig(i, _serverlocalizedstring, _serverlocalizedstring2, _serverlocalizedstring3, _serverlocalizedstring4, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        OctopusConfig octopusConfig = (OctopusConfig) obj;
        encoder.getClass();
        octopusConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        OctopusConfig.write$Self$models(octopusConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
