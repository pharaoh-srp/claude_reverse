package defpackage;

import com.anthropic.claude.api.experience.ExperienceBullet;
import com.anthropic.claude.api.experience.ExperienceToggle;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a97 implements w28 {
    public static final a97 a;
    private static final SerialDescriptor descriptor;

    static {
        a97 a97Var = new a97();
        a = a97Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.experience.ExperienceBullet", a97Var, 4);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("toggle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), srgVar, d4c.S(sa7.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String strV = null;
        ExperienceToggle experienceToggle = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                i |= 2;
            } else if (iX == 2) {
                strV = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                experienceToggle = (ExperienceToggle) ud4VarC.m(serialDescriptor, 3, sa7.a, experienceToggle);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ExperienceBullet(i, str, str2, strV, experienceToggle, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ExperienceBullet experienceBullet = (ExperienceBullet) obj;
        encoder.getClass();
        experienceBullet.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ExperienceBullet.write$Self$api(experienceBullet, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
