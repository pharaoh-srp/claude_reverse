package defpackage;

import com.anthropic.claude.api.notice.Cta;
import com.anthropic.claude.api.notice.Notice;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z6c implements w28 {
    public static final z6c a;
    private static final SerialDescriptor descriptor;

    static {
        z6c z6cVar = new z6c();
        a = z6cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.notice.Notice", z6cVar, 3);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("cta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(vc5.a)};
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
        Cta cta = null;
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
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                cta = (Cta) ud4VarC.m(serialDescriptor, 2, vc5.a, cta);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new Notice(i, str, str2, cta, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Notice notice = (Notice) obj;
        encoder.getClass();
        notice.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Notice.write$Self$api(notice, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
