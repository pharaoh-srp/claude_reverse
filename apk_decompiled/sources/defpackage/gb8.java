package defpackage;

import com.anthropic.claude.models.organization.configtypes.GroveConfig;
import com.anthropic.claude.models.organization.configtypes.GroveConfigStrings;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gb8 implements w28 {
    public static final gb8 a;
    private static final SerialDescriptor descriptor;

    static {
        gb8 gb8Var = new gb8();
        a = gb8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.GroveConfig", gb8Var, 4);
        pluginGeneratedSerialDescriptor.j("notice_is_grace_period", true);
        pluginGeneratedSerialDescriptor.j("notice_reminder_frequency", true);
        pluginGeneratedSerialDescriptor.j("domain_excluded", true);
        pluginGeneratedSerialDescriptor.j("mobile_strings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{d4c.S(zt1Var), d4c.S(e79.a), d4c.S(zt1Var), d4c.S(ib8.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Integer num = null;
        Boolean bool2 = null;
        GroveConfigStrings groveConfigStrings = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                bool = (Boolean) ud4VarC.m(serialDescriptor, 0, zt1.a, bool);
                i |= 1;
            } else if (iX == 1) {
                num = (Integer) ud4VarC.m(serialDescriptor, 1, e79.a, num);
                i |= 2;
            } else if (iX == 2) {
                bool2 = (Boolean) ud4VarC.m(serialDescriptor, 2, zt1.a, bool2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                groveConfigStrings = (GroveConfigStrings) ud4VarC.m(serialDescriptor, 3, ib8.a, groveConfigStrings);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GroveConfig(i, bool, num, bool2, groveConfigStrings, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GroveConfig groveConfig = (GroveConfig) obj;
        encoder.getClass();
        groveConfig.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GroveConfig.write$Self$models(groveConfig, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
