package defpackage;

import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.networking.cookies.serializer.SerializableCookie;
import com.pvporbit.freetype.FreeTypeConstants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class snf implements w28 {
    public static final snf a;
    private static final SerialDescriptor descriptor;

    static {
        snf snfVar = new snf();
        a = snfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.networking.cookies.serializer.SerializableCookie", snfVar, 8);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j(ExperienceToggle.DEFAULT_PARAM_KEY, false);
        pluginGeneratedSerialDescriptor.j("expiresAt", false);
        pluginGeneratedSerialDescriptor.j("domain", false);
        pluginGeneratedSerialDescriptor.j("path", false);
        pluginGeneratedSerialDescriptor.j("secure", false);
        pluginGeneratedSerialDescriptor.j("httpOnly", false);
        pluginGeneratedSerialDescriptor.j("hostOnly", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(xka.a);
        srg srgVar = srg.a;
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{srgVar, srgVar, kSerializerS, srgVar, srgVar, zt1Var, zt1Var, zt1Var};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        String strV = null;
        String strV2 = null;
        Long l = null;
        String strV3 = null;
        String strV4 = null;
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
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    l = (Long) ud4VarC.m(serialDescriptor, 2, xka.a, l);
                    i |= 4;
                    break;
                case 3:
                    strV3 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    strV4 = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    zU = ud4VarC.u(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    zU2 = ud4VarC.u(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    zU3 = ud4VarC.u(serialDescriptor, 7);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    continue;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new SerializableCookie(i, strV, strV2, l, strV3, strV4, zU, zU2, zU3, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SerializableCookie serializableCookie = (SerializableCookie) obj;
        encoder.getClass();
        serializableCookie.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SerializableCookie.write$Self$networking(serializableCookie, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
