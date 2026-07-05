package defpackage;

import com.anthropic.claude.api.model.Badge;
import com.anthropic.claude.api.model.BadgeVariant;
import com.anthropic.claude.types.strings._ServerLocalizedString;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oc1 implements w28 {
    public static final oc1 a;
    private static final SerialDescriptor descriptor;

    static {
        oc1 oc1Var = new oc1();
        a = oc1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.model.Badge", oc1Var, 2);
        pluginGeneratedSerialDescriptor.j("message", true);
        pluginGeneratedSerialDescriptor.j("variant", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S((KSerializer) Badge.$childSerializers[0].getValue()), tc1.d};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = Badge.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        _ServerLocalizedString _serverlocalizedstring = null;
        BadgeVariant badgeVariant = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                _serverlocalizedstring = (_ServerLocalizedString) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), _serverlocalizedstring);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                badgeVariant = (BadgeVariant) ud4VarC.l(serialDescriptor, 1, tc1.d, badgeVariant);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new Badge(i, _serverlocalizedstring, badgeVariant, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Badge badge = (Badge) obj;
        encoder.getClass();
        badge.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Badge.write$Self$api(badge, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
