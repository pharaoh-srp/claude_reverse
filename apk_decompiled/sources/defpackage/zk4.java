package defpackage;

import com.anthropic.claude.models.organization.configtypes.ConsentConfigAndroid;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zk4 implements w28 {
    public static final zk4 a;
    private static final SerialDescriptor descriptor;

    static {
        zk4 zk4Var = new zk4();
        a = zk4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.ConsentConfigAndroid", zk4Var, 2);
        pluginGeneratedSerialDescriptor.j("version", false);
        pluginGeneratedSerialDescriptor.j("text", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e79.a, ConsentConfigAndroid.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ConsentConfigAndroid.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        int iR = 0;
        _ServerLocalizedString _serverlocalizedstring = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                _serverlocalizedstring = (_ServerLocalizedString) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), _serverlocalizedstring);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ConsentConfigAndroid(i, iR, _serverlocalizedstring, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ConsentConfigAndroid consentConfigAndroid = (ConsentConfigAndroid) obj;
        encoder.getClass();
        consentConfigAndroid.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ConsentConfigAndroid.write$Self$models(consentConfigAndroid, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
